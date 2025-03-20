animales = ['gato', 'perro', 'conejo', 'elefante']
for indice, animal in enumerate(animales):
    print(f"{indice} - {animal}")

print("-----------------------------------")

for animal in animales:
    print(animal)

print("-----------------------------------")

indice = 0
for indice in range(len(animales)):
    print(animales[indice])

print("-----------------------------------")

indice = 0
while indice < len(animales):
    animal = animales[indice]
    print(animal)
    indice += 1

print("-----------------------------------")

nombres = ['Garfield', 'Pluto', 'Rabbit', 'Dumbo']
for animal, nombre in zip(animales, nombres):
    print(f"{nombre} es un {animal}")