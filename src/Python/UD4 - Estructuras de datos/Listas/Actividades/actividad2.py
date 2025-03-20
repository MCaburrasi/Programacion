def invierte(lista):
    return lista[::-1]

if __name__ == "__main__":
    longitud_lista = int(input("Longitud lista: "))
    lista = [input("") for _ in range(longitud_lista)]
    print(invierte(lista[:]))