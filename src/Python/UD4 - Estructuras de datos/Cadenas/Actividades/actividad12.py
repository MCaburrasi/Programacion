def oculta_cadena(cadena, caracter):
    oculto = len(cadena)
    oculto = caracter*oculto
    return oculto

if __name__ == "__main__":
    cadena, caracter = input("Cadena, Caracter: ").split(" ")
    print(oculta_cadena(cadena, caracter))