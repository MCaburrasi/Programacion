def contador_mayusculas_minusculas(cadena):
    lower = 0
    upper = 0
    for letra in cadena:
        if letra.islower():
            lower += 1
        elif letra.isupper():
            upper += 1
    return lower, upper

if __name__ == "__main__":
    cadena = input("Cadena: ")
    lower, upper = contador_mayusculas_minusculas(cadena)
    print(f"Minúsculas: {lower}")
    print(f"Mayusculas: {upper}")