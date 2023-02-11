from CalcModel import CalcModel


# Класс вычитания

class SubModel(CalcModel):
    @classmethod
    def result(self):  # Переопределяю метод результа
        return self.x - self.y

    # методы установки чисел
    @classmethod
    def set_x(self, x):
        self.x = x

    @classmethod
    def set_y(self, y):
        self.y = y