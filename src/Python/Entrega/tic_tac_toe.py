from os import system
def matrix_divider(matrix):
    rows = [[matrix[i][j] for j in range(len(matrix))] for i in range(len(matrix))]
    columns = [[matrix[j][i] for j in range(len(matrix))] for i in range(len(matrix))]
    diagonal = [matrix[i][i] for i in range(len(matrix))]
    inverted_diagonal = [matrix[i][(len(matrix) - 1) - i] for i in range(len(matrix))]
    return rows, columns, [diagonal], [inverted_diagonal]
    
def points(matrix):
    point_matrix = matrix_divider(matrix)
    points = []
    for j in point_matrix:
        points.append([sum(i) for i in j])
    return points

def print_board(matrix):
    for row in range(len(matrix)):
        for column in range(len(matrix)):
            if matrix[row][column] == 1:
                print(f" {'X'} {'|' if column in range(len(matrix[0:-1])) else ''}", end="")
            elif matrix[row][column] == -1:
                print(f" {'0'} {'|' if column in range(len(matrix[0:-1])) else ''}", end="")
            else:
                print(f" {' '} {'|' if column in range(len(matrix[0:-1])) else ''}", end="")
        print("")
        for column in range(len(matrix[0:-1])):
            print(f"{'---+' if row in range(len(matrix[0:-1])) else ''}",end='')
        print(f"{'---' if row in range(len(matrix[0:-1])) else ''}")

def gen_initial_board():
    board = [[0 for _ in range(7)] for _ in range(7)]
    return board

def theres_winner(board):
    finished = False
    game_points = points(board)
    for point_list in game_points:
        if not finished:
            if 3 in point_list:
                finished = True
                winner = 'Jugador 1 Gana'
            elif -3 in point_list:
                finished = True
                winner = 'Jugador 2 Gana'
            else:
                winner = ' '      
    return finished, winner

def play():
    system('clear')
    finished = False
    board = gen_initial_board()
    turn = 'TURNO'
    while not finished:
        print(f"{'Jugador 1' if turn.isupper() else 'Jugador 2'}:")
        while True:
            column, row = map(int, input("Columns - Rows (1, 2 or 3): ").split(" "))
            if board[row - 1][column - 1] not in [1,-1]: break
            print('Celda ya ha sido jugada, elije otra posición')
             
        system('clear')
        if turn.isupper(): figure = 1
        else: figure = -1
        board[row - 1][column - 1] = figure
        turn = turn.swapcase()
        print_board(board[:])
        finished, winner = theres_winner(board[:])
    print(f'{winner}')

if __name__ == '__main__':
    play()