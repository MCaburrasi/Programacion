def es_palindromo(cadena):
    palindromo = False
    cadena = cadena.split(" ")
    cadena = " ".join(cadena)
    if cadena == cadena[::-1]:
        palindromo = True
    return palindromo

if __name__ == "__main__":
    cadena = input("Cadena: ")
    print(es_palindromo(cadena))