def traspone(matriz):
    matriz_t = []
    y = 0
    for y in range(len(matriz[0])):
        columna = []
        for x in range(len(matriz)):
            columna.append(matriz[x][y])
        matriz_t.append(columna)
        y += 1        
    return matriz_t

def formato_matriz(matriz):
    for i in matriz:
        for j in i:
            print(f'{j}', end=" ")
        print('')
    
if __name__ == '__main__':
    matriz = [[1,2,3],
              [4,5,6],
              [7,8,9]]
    formato_matriz(matriz)
    print('')
    formato_matriz(traspone(matriz))