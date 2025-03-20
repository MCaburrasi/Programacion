n = int(input("Introduzca numeros hasta que introduzca un 0: ")) #Asignar n a un valor cualquiera != 0
suma = 0
cantidad = 0

while n != 0:
    suma += n
    cantidad += 1
    n = int(input("Introduzca numeros hasta que introduzca un 0: ")) #Pedir n al principio del bucle seguido de if n == 0: break
    #No repetir Introduce numero!!!

print(f"La suma de todos tus numeros es {suma} y la media es {suma / cantidad}") 