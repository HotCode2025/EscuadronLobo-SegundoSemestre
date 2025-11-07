class operacion:
    def __init__(self, num1, bun2):
        self.num1 = num1
        self.num2 = bun2

    def resta(self):
        return  self.num1 - self.num2

    def divi(self):
        return  self.num1 / self.num2

    def multi(self):
        return  self.num1 * self.num2

operar = operacion(16, 8)
print(operar.resta())
print(operar.divi())
print(operar.multi())