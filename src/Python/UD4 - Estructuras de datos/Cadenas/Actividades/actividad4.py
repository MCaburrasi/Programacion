def buscador(cadena, caracter):
    resultado = cadena.count(caracter)
    return resultado

if __name__ == "__main__":
    cadena = input("Cadena: ")
    caracter = input("Caracter: ")
    print(buscador(cadena, caracter))