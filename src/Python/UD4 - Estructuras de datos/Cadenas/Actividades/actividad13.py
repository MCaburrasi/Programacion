def reemplazar_caracter_cadena(caracter, cadena):
    resultado = ""
    for letra in cadena:
        if letra == " ":
            letra = caracter
        resultado += letra
    return resultado

if __name__ == "__main__":
    cadena = input("Cadena: ")
    caracter = input("Caracter: ")
    print(reemplazar_caracter_cadena(caracter, cadena))