def palabras_frase(cadena):
    contador = len(cadena.split(" "))
    return contador

if __name__ == "__main__":
    cadena = input("Cadena: ")
    print(f"Palabras: {palabras_frase(cadena)}")