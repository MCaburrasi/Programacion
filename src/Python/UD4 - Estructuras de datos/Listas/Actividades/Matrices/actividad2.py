def matriz_marco(n,m):
    matriz = [[i for i in range(n)] for j in range(m)]
    matriz[0] = [1 for _ in range(n)]
    matriz[-1] = [1 for _ in range(n)]
    for i in range(1,m-1):
        matriz[i][0] = 1
        matriz[i][-1] = 1
        for j in range(1,n-1):
            matriz[i][j] = 0
    return matriz

def formato_matriz(matriz):
    for i in matriz:
        for j in i:
            print(f'{j}', end=" ")
        print('')

if __name__ == '__main__':
    n = 3
    m = 4
    formato_matriz(matriz_marco(n,m))