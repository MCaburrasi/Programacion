from time import sleep
from os import system
from random import randint
SURVIVAL_RULE = [2,3]
ALIVE_SYMBOL = '■'
DEAD_SYMBOL = '-'
SLEEP_TIME = 0.001
ALIVE_PERCENTAGE = 65

def print_board(board):
    for i in board:
        for j in i:
            print(f"{j} ", end='')
        print('')

def random_placer(board):
    coord_list = []
    for i in range(len(board)):
        for j in range(len(board)):
            random_num = randint(0,100)
            if random_num <= ALIVE_PERCENTAGE:
                board[i][j] = ALIVE_SYMBOL
                coord_list.append((i,j))
    return coord_list

def make_board(side, symbol):
    board = [[symbol for _ in range(side)]  for _ in range(side)]
    return board

def coord_tuple_maker(dots):
    index = 0
    for coord in dots:  
        coords = coord.split(',')
        coords[0] = int(coords[0])
        coords[1] = int(coords[1])
        coords = tuple(coords)
        dots[index] = coords
        index += 1

def dot_placer(board, dots, symbol):
    for coords in dots:
        board[coords[0]][coords[1]] = symbol

def evaluate_cell(board, row, column):
    neighbours = []
    posible_row_positions = [row - 1, row, row + 1]
    posible_column_positions = [column - 1, column, column + 1]
    if row == 0:
        posible_row_positions.remove(row - 1)
    elif row == len(board) - 1:
        posible_row_positions.remove(row + 1)

    if column == 0:
        posible_column_positions.remove(column - 1)
    elif column == len(board) - 1:
        posible_column_positions.remove(column + 1)
    
    for posible_row in posible_row_positions:
        for posible_column in posible_column_positions:
            if posible_row != row or posible_column != column:
                neighbours.append(board[posible_row][posible_column])  
    return neighbours
            
def update_board(state_board, board):
    for row in range(len(state_board)):
        for column in range(len(state_board)):
            if state_board[row][column] == 'D':
                board[row][column] = DEAD_SYMBOL
            else:
                board[row][column] = ALIVE_SYMBOL

def play():
    side = 50
    board = make_board(side, DEAD_SYMBOL)
    state_board = make_board(side, 'D')
    print_board(board)
    mode = input('(R)andom o (N)o random: ').lower()
    if mode == 'r':
        coord_list = random_placer(board)
        dot_placer(state_board, coord_list, 'A')
    else:
        dots = [num for num in input('Coordenadas: ').split(' ')]
        coord_tuple_maker(dots)
        dot_placer(board, dots, ALIVE_SYMBOL)
        dot_placer(state_board, dots, 'A')
    while True:
        system('clear')
        update_board(state_board, board)
        print_board(board)
        for row in range(len(board)):
            for column in range(len(board)):
                neighbour = evaluate_cell(board, row, column)
                nei_count = neighbour.count(ALIVE_SYMBOL)
                if nei_count == 3 and state_board[row][column] == 'D':
                    state_board[row][column] = 'A'
                elif nei_count not in SURVIVAL_RULE and state_board[row][column] == 'A':
                    state_board[row][column] = 'D'
                elif nei_count == 3 and state_board[row][column] == 'A':
                    state_board[row][column] = 'A'
        sleep(SLEEP_TIME)

if __name__ == '__main__':
    play()
