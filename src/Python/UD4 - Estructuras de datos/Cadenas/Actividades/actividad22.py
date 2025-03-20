def calcular_letra(dni):
    letras = "TRWAGMYFPDXBNJZSQVHLCKE"
    dni = int(dni[:8])
    resto_dni = dni % 23
    letra = letras[resto_dni]
    return letra

def es_dni_valido(dni):
    valido = False
    if dni[-1] == calcular_letra(dni):
        valido = True
    return valido

if __name__ == "__main__":
    
    dni = input("DNI: ")
    print(es_dni_valido(dni))