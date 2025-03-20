longitud_lista = int(input("¿Cuantos nombres?: "))
lista = []
for _ in range(longitud_lista):
    nombre = input("Nombre: ")
    lista.append(nombre)
busqueda = input("¿Que nombre quieres buscar?: ")
print(f"{busqueda} sale {lista.count(busqueda)} veces")