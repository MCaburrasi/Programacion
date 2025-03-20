def matriz_diagonal(n):
    matriz = [[i for i in range(n)] for j in range(n)]
    for i in range(n):
        for j in range(n):
            if i == j:
                matriz[i][j] = 1
            else:
                matriz [i][j] = 0
    return matriz

def formato_matriz(matriz):
    for i in matriz:
        for j in i:
            print(f'{j}', end=" ")
        print('')


if __name__ == '__main__':
    n = 4
    formato_matriz(matriz_diagonal(n))