def pares(lista):
    return [num for num in lista if num % 2 == 0]

if __name__ == "__main__":
    lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    print(pares(lista[:]))