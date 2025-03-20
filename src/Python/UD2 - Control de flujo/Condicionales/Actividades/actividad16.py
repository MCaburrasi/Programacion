alumnos = int(input("Numero de alumnos: "))

if alumnos > 100:
    costo = 65
elif alumnos > 50:
    costo = 70
elif alumnos > 30:
    costo = 95
else:
    costo = 4000/alumnos

print(f"El costo por alumnos es de {costo:.2f}€")
print(f"El precio total es {costo*alumnos:.2f}€")