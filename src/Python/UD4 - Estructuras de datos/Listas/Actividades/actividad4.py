unidad_lista = 0
lista = []
while unidad_lista >= 0:
    unidad_lista = int(input("Unidad lista: "))
    if unidad_lista <= 0:
        break
    lista.append(unidad_lista)
print(lista)