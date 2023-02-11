from Model import SumModel
from Model import SubModel
from Model import MultModel
from Model import DivModel
from View import View


# Класс собирает все модули
class Conroller:
    view = View()
    sum_model = SumModel()
    sub_model = SubModel()
    div_model = DivModel()
    mult_model = MultModel()

    def __init__(self, v):
        self.view = v

    def start(self):
        num = self.view.menuCalc()
        self.sum_model = SumModel()
        self.sub_model = SubModel()
        self.div_model = DivModel()
        self.mult_model = MultModel()
        self.button_click(num)

    def button_click(self, num):

        if num == 1:
            a = self.view.getValue("Enter first number: ")
            b = self.view.getValue("Enter second number: ")
            self.sum_model.setX(a)
            self.sum_model.setY(b)
            result = self.sum_model.result()
            self.view.printres(result, f"{a} + {b} =")
        elif num == 2:
            a = self.view.getValue("Enter first number: ")
            b = self.view.getValue("Enter second number: ")
            self.sub_model.setX(a)
            self.sub_model.setY(b)
            result = self.sum_model.result()
            self.view.printres(result, f"{a} - {b} =")
        elif num == 3:
            a = self.view.getValue("Enter first number: ")
            b = self.view.getValue("Enter second number: ")
            self.mult_model.setX(a)
            self.mult_model.setY(b)
            result = self.mult_model.result()
            self.view.printres(result, f"{a} * {b} =")
        elif num == 4:
            a = self.view.getValue("Enter first number: ")
            b = self.view.getValue("Enter second number: ")
            self.div_model.setX(a)
            self.div_model.setY(b)
            result = self.div_model.result()
            self.view.printres(result, f"{a} / {b} =")
