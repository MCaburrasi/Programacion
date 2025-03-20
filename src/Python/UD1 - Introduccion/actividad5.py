peso = float(input("Cuantos kilos pesas?: "))
altura = float(input("Y cuantos metros mides?: "))
imc = round(peso/altura**2,2)
print("Tu indice de masa corporal es",imc)