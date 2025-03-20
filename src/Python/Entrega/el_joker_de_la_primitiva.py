def string_sorter(numero, ganador): 
    numero = sorted(numero)
    ganador = sorted(ganador)
    return numero, ganador


if __name__ == "__main__":

    repeticiones = int(input(''))
    for i in range(repeticiones):
        numero, ganador = input().split(" ")
        numero, ganador = string_sorter(numero, ganador)

        if numero == ganador:
            print("GANA")
        else:
            print("PIERDE")