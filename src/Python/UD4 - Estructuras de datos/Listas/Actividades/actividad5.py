from random import randint
def genera_lista_ordenada(n, inf, sup):
    lista = [randint(inf, sup) for _ in range(n)]
    return sorted(lista)

if __name__ == "__main__":
    n = 10
    inf = 0
    sup = 100
    print(genera_lista_ordenada(n, inf, sup))