class View:
    # работа с вводом-выводом
    def get_value(self, n) -> int:
        return int(input(n))

    def menu_calc(self):
        return int(input("MENU\n----------------\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n"
                         "----------------\n0.Exit\n"))

    def printres(self, data, title):
        print(title, " ", data)
