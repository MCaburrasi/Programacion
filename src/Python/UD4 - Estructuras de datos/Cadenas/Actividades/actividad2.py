def contiene_subcadena(cadena, subcadena):
    resultado = subcadena in cadena
    return resultado

if __name__ == "__main__":
    cadena = input("Cadena: ")
    subcadena = input("Subcadena: ")
    print(contiene_subcadena(cadena, subcadena))