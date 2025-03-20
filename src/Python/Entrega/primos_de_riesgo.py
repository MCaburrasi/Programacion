from math import isqrt
def calc_ord(caracter):
    resultado = 0
    for unidad in caracter:
        resultado += ord(unidad)
    return resultado


def es_primo(n):
    primo = True

    if n%2 == 0 and n != 2 or n == 1:
        primo = False
    else:
        for i in range(3,isqrt(n)+1,2):
            comprovacion = n%i
            if comprovacion == 0:
                primo = False
                break
    return primo


def primo_menor(n):
    comprobacion = False
    while not comprobacion:
        n -= 1
        comprobacion = es_primo(n)
    return n


if __name__ == "__main__":

    iteraciones = int(input())
    for _ in range(iteraciones):
        caracter = input()
        print(primo_menor(calc_ord(caracter)))
    