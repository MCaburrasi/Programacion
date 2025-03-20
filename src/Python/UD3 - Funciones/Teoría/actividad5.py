def tarjeta_oculta(numero, asteriscos=12):
    oculto = asteriscos * '*'
    censura = asteriscos

    for i in numero:
        if censura <= 0:
            oculto += i
        censura -= 1

    return oculto


tarjeta = input("Numero de 16 dijitos: ")
print(tarjeta_oculta(tarjeta, 4))

tarjeta = input("Numero de 16 dijitos: ")
print(tarjeta_oculta(tarjeta))

tarjeta = input("Numero de 16 dijitos: ")
print(tarjeta_oculta(tarjeta, 0))