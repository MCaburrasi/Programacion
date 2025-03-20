longitud_lista = 5
lista = []
for _ in range(longitud_lista):
    nombre = input("Nombre: ")
    lista.append(nombre)
lista.sort(reverse = True)
print(lista)