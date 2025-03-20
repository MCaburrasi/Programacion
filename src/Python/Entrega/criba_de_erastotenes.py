from math import isqrt
if __name__ == '__main__':
    n = 100
    numeros = [i for i in range(n)]
    numeros_copia = numeros[:]
    numeros.remove(1)
    numeros.remove(0)
    index = numeros.index(isqrt(n))
    for numero in numeros[:index + 1]:
        for j in numeros:
            if j == numero:
                pass
            elif j % numero == 0:
                numeros.remove(j)
    print(numeros)  