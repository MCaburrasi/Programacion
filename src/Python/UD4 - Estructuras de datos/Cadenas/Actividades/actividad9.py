def invertir(cadena):
    invertida = cadena[::-1]
    return invertida

if __name__ == "__main__":
    cadena = input("Cadena: ")
    print(f"Invertida: {invertir(cadena)}")