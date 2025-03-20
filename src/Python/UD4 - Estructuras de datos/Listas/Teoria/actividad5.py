longitud_lista = 5
lista = []
for _ in range(longitud_lista):
    nombre = input("Nombre: ")
    lista.append(nombre)
busqueda1 = input("¿Que nombres quieres quitar?: ")
lista.remove(busqueda1)
print(lista)