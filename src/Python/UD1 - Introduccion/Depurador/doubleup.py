def doble (palabra,letra):
    respuesta = ""
    for c in palabra:
        if c == letra:
            respuesta = c + c
        else:
            respuesta = respuesta + c
    return respuesta

if __name__ == "__main__":
    palabra = "casa"
    letra = "a"
    print(doble(palabra,letra))
