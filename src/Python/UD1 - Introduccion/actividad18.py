numero = int(input("Introduce un numero de 2 cifras: "))
decenas = int(numero/10)
unidades = int(numero - decenas * 10)
decenas,unidades = unidades,decenas
print(decenas * 10 + unidades)