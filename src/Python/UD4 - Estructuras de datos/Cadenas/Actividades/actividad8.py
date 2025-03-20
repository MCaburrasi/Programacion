def iniciales_mayuscula(cadena):
    iniciales = ""
    inicial = True
    for letra in cadena:
        if inicial:
            iniciales += letra
            inicial = False
        if letra == " ":
            inicial = True

    return iniciales

if __name__ == "__main__":
    nombre = input("Nombre: ")
    print(f"Iniciales: {iniciales_mayuscula(nombre)}")
