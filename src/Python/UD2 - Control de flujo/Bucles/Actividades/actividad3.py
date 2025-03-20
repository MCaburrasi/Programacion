cantidad = int(input("Escriba la cantidad de numeros que va a escribir: "))
positivo = 0
negativo = 0
ceros = 0

for i in range(cantidad):
    n = int(input("Dime un numero: "))
    if n > 0:
        positivo += 1
    elif n < 0:
        negativo += 1
    else:
        ceros += 1

print(f"Hay {positivo} numeros positivos, {negativo} numeros negativos y {ceros} ceros")