cadena_final = "perro"
pm = len(cadena_final) * "_"
terminado = False
tries = 7
print(f"Tienes {tries} intentos")

while not terminado:
    if tries == 0:
        break
    index = -1
    intento = ""
    letra = input("Letra: ")
    if cadena_final.find(letra) == -1:
        tries -= 1
        print(f"Quedan {tries} intentos")
        continue

    for i in cadena_final:
        index += 1
        if letra == i:
            intento += cadena_final[index]
        else:
            intento += pm[index]

    pm = intento
    if cadena_final == intento: terminado = True
    print(intento)