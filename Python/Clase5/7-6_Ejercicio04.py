#Ejericico04: Calculadora de Impuestos
#Crear una funcion para calcular el total de un pago incluyendo
#un impuesto aplicado. (IVA)
#Formula: pagototal = pago_sin_impuesto + pago_sin:impuesto * (impuesto/100)
#Proporcione el pago sin impuesto: 1000
#proporcione el monto del impuestro: 21%
#pago con impuesto: xxxxxx

def calcular_total(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
    return pago_total

pago_sin_impuesto = float(input("Proporcione el pago sin impuesto: "))
impuesto = float(input("Proporcione el monto del impuestro (%): "))
pago_final = calcular_total(pago_sin_impuesto, impuesto)

print(f"Pago con impuesto: {pago_final}")
