def mayusculas(cadena):
    return cadena.upper()

def minusculas(cadena):
    return cadena.lower()

if __name__ == "__main__":
    cadena = input("Cadena: ")
    print(f"Minusculas: {minusculas(cadena)}")
    print(f"Mayusculas: {mayusculas(cadena)}")