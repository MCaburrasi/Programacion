def cantidad_mayusculas_minusculas(cadena):
    alphacontador = 0
    digitcontador = 0
    for i in cadena:
        digitflag = i.isdigit()
        alphaflag = i.isalpha()
        if alphaflag:
            alphacontador += 1
        elif digitflag:
            digitcontador += 1
    return alphacontador, digitcontador

if __name__ == "__main__":
    cadena = input("Cadena: ")
    alpha, digit = cantidad_mayusculas_minusculas(cadena)
    print(f"Letras {alpha}, Digitos: {digit}")
