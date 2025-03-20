def mayusculas(cadena):
    cadena = cadena.lower()
    cadena = cadena.swapcase()
    return cadena

def mayuscula_ascii(cadena):
    resultado = ''
    for char in cadena:
        if 65 <= ord(char) <= 90:
            resultado += char
        elif ord(char) == 32:
            resultado += char
        else:
            char_ascii = ord(char) - 32
            resultado += chr(char_ascii)
    return resultado

if __name__ == "__main__":
    cadena = input(f"Cadena: ")
    print(mayusculas(cadena))
    print(mayuscula_ascii(cadena))