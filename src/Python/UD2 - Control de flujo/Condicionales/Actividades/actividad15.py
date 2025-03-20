PRECIO_UVA = 1.20
tipo = input("¿De que tipo es la uva?: ")
tamaño = int(input("Tamaño de la uva: "))
cantidad = int(input("Cantidad de uvas?: "))

if tipo == "A":
    if tamaño == 1:
        print(f"Su ganancia es de{(PRECIO_UVA + 0.20) * cantidad}€")
    elif tamaño == 2:
        print(f"Su ganancia es de{(PRECIO_UVA + 0.10) * cantidad}€")
    else:
        print("Introduzca tipo o tamaño valido")
elif tipo == "B":
    if tamaño == 1:
        print(f"Su ganancia es de{(PRECIO_UVA - 0.30) * cantidad}€")
    elif tamaño == 2:
        print(f"Su ganancia es de{(PRECIO_UVA - 0.50) * cantidad}€")
    else:
        print("Introduzca tipo o tamaño valido")
else:
    print("Introduzca tipo o tamaño valido")