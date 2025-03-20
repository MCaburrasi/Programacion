letra = input("Escribe una letra: ")

if letra == "L" or letra == "M" or letra == "X" or letra == "J" or letra == "V":
    print("El día elegido es entre semana")
elif letra == "S" or letra == "D":
    print("El día elegido es fin de semana")
else:
    print("Este no es un dia de la semana")

#Mejor opción: Match