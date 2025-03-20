def email(cadena):
    cadena = cadena.split("@")
    for i in cadena:
        resultado = i + "@fernandoaguilar.es"
        return resultado
    
if __name__ == "__main__":
    correo = input("Correo: ")
    print(f"Correo clase: {email(correo)}")