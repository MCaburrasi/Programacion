from random import randint
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

def suffled_square(n):
    return [[randint(1,n*2) for _ in range(n)] for __ in range(n)]

def is_magic_square(matriz):
    magico = True
    valor = sum(matriz[0])
    for i in matriz:
        if sum(i) != valor:
            magico = False

    matriz_traspuesta = traspone(matriz[:])
    for i in matriz_traspuesta:
        if sum(i) != valor:
            magico = False
    
    diagonal1 = [matriz[i][i] for i in range(len(matriz))]
    diagonal2 = [matriz[i][len(matriz) - 1 - i] for i in range(len(matriz))]
    if sum(diagonal1) != valor: magico = False
    if sum(diagonal2) != valor: magico = False
    return magico
    

if __name__ == '__main__':
    matriz = [[2,6,6],
              [9,4,1],
              [4,2,8]]

    print(is_magic_square(matriz))