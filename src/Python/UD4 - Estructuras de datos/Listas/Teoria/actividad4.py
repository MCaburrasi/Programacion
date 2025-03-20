longitud_lista = 5
lista = []
for _ in range(longitud_lista):
    nombre = input("Nombre: ")
    lista.append(nombre)
busqueda1, busqueda2 = input("¿Que nombres quieres cambiar?: ").split(" ")
lista[lista.index(busqueda1)] = busqueda2
print(lista)
