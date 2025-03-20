def suma(lista1, lista2):
    suma = [num1 + num2 for num1, num2 in zip(lista1, lista2)]
    return suma

if __name__ == "__main__":
    lista1 = [1, 3, 5, 7, 9, 11]
    lista2 = [2, 4, 6, 8, 10, 12]
    print(suma(lista1[:], lista2[:]))