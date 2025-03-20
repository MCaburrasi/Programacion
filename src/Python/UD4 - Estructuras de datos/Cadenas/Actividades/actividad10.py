def sustituye(cadena, caracter1, caracter2):
    return cadena.replace(caracter1,caracter2)

if __name__ == "__main__":
    cadena = input("Cadena: ")
    caracter1, caracter2 = input("Caracter reemplazado, Caracter a reemplazar: ").split(" ")
    
    print(sustituye(cadena, caracter1, caracter2))