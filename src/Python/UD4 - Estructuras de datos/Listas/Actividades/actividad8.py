nombre_individual = 'hello world'
nombre = []
edad = []
while nombre_individual != '*':
    nombre_individual, edad_individual = input('Nombre y edad: ').split(' ')
    edad = int(edad)
    nombre.append(nombre_individual)
    edad.append(edad_individual)

mayores_edad = [nombre_individual for nombre_individual, edad_individual in zip(edad, nombre) if edad_individual >= 18]
print(f"Mayores de edad: {mayores_edad}, Mayor: {max(zip)}")