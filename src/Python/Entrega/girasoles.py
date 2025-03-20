def print_matrix(sunflowers):
    for row in sunflowers:
        for column in row:
            print(f'{column}',end=' ')
        print('')

def rotate90 (sunflowers):
    rotated_matrix = [[sunflowers[j][i] for j in range(len(sunflowers))] for i in range(len(sunflowers[0]))]
    rotated_matrix = rotated_matrix[::-1]

def column (sunflowers):
    matrix_column = [[sunflowers[j][i] for j in range(len(sunflowers))] for i in range(len(sunflowers[0]))]
    return matrix_column

if __name__ == '__main__':
    n = int(input(''))
    sunflowers = []
    for _ in range(n):
        sunflower = [int(num) for num in input('').split(' ')]
        sunflowers.append(sunflower)

    for _ in range(len(sunflowers)):
        valid = True
        for matrix_column in column(sunflowers):
            if matrix_column != sorted(matrix_column): valid = False
        if not valid: sunflowers = rotate90(sunflowers)
        else: break
    
    print_matrix(sunflowers)
