from random import randint
nombres = ['pepe', 'juan', 'josefa', 'manolo', 'pepa']
kms = [[randint(1,100) for _ in range(7)] for __ in nombres]
lista = []
for nombre, kmsd in zip(nombres,kms):
    lista.append(nombre)
    lista.append(sum(kmsd))

print(lista)