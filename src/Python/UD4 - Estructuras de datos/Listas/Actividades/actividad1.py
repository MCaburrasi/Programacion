from random import randint
def genera_lista_aleatorios(n, inf, sup):
    lista = [randint(inf, sup) for _ in range(n)]
    return lista

if __name__ == "__main__":
    n = 10
    inf = 0
    sup = 10
    numeros = genera_lista_aleatorios(n, inf, sup)
    print(numeros)
    print([num**2 for num in numeros])
    print([num**3 for num in numeros])