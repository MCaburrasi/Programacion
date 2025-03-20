def acronimo(cadena):
    resultado = ""
    nombre = cadena.split(" ")
    for i in nombre:
        palabra = i.capitalize()
        resultado += palabra + " "
    return resultado


if __name__ == "__main__":
    nombre = input("Cadena: ")
    print(f"Iniciales: {acronimo(nombre)}")
