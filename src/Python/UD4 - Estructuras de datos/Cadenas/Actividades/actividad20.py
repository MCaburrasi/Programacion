from string import ascii_lowercase
def es_pangrama(cadena):
    resultado = True
    cadena = cadena.lower().split(" ")
    cadena = ''.join(cadena)    
    for char in ascii_lowercase:
        if char not in cadena:
            resultado = False
            break        
    return resultado

if __name__ == "__main__":
    pangrama = input("Cadena: ")
    print(es_pangrama(pangrama))