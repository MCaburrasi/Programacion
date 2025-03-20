"""
This program reverses a string
"""
def invierte_cadena(cadena):
    cadena_original = cadena
    cadena_nueva = ""
    for c in cadena_original:
        cadena_nueva = c + cadena_nueva
    return cadena_nueva

if __name__ == "__main__":
    cadena = "Duke"
    print(invierte_cadena(cadena))