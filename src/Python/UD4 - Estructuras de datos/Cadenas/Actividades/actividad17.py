def conversor(cadena):
    cadena = cadena.split(".")
    contador = 0
    for i in cadena:
        if contador == 0:
            centimos = i
            contador += 1
        else:
            euros = i
    return centimos, euros

if __name__ == "__main__":
    dinero = input("Dinero: ")
    euros, centimos = conversor(dinero)
    print(f"{euros} euros y {centimos} centimos")