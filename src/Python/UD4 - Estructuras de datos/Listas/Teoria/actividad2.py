longitud_lista = int(input("¿Cuantos nombres?: "))
lista = []
for _ in range(longitud_lista):
    nombre = input("Nombre: ")
    lista.append(nombre)
print(lista)