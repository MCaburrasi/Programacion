def diagonales_cero(matriz):
    for i in range(len(matriz)):
        for j in range(len(matriz[0])):
            if i == j or i - (len(matriz)-1) == j or j - (len(matriz[0])-1) == i:
                matriz[i][j] = 0
    return matriz

def formato_matriz(matriz):
    for i in matriz:
        for j in i:
            print(f'{j}', end=" ")
        print('')

if __name__ == '__main__':
    matriz = [[1,2,3],
              [4,5,6],
              [7,8,9]]
    formato_matriz(diagonales_cero(matriz))