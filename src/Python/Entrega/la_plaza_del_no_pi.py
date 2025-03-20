def print_board(board):
    for i in board:
        for j in i:
            print(f"{j} ", end='')
        print('')

def pine_placer(park, pine_coords):
    for pine in pine_coords:
        park[pine[0] - 1][pine[1] - 1] = False
    return park

def column(park, index):
    return [park[i][index] for i in range(len(park))]

def list_maker(park):
    list1 = []
    for row in park:
        for column in row:
            list1.append(column)
    return list1
    
def park_resizer(park):
    rows = []
    for row in park:
        rows.append(all(row))
    index = rows.index(False)
    inv_row = rows[::-1]
    print_board(park)
    if rows.count(False) > 1:
        last_index = inv_row.index(False)
        park = park[index + 1 : last_index + 1]
    else:
        park = park[index + 1:]
    print_board(park)
    return park


if __name__ == "__main__":
    pine_coords = []
    park_size = int(input())
    park = [[True for _ in range(park_size)] for _ in range(park_size)]
    pine_number = int(input())
    for pine in range(pine_number):
        pines = tuple(int(coord) for coord in input().split(' '))
        pine_coords.append(pines)
    park = pine_placer(park[:], pine_coords)
    print(pine_coords)
    print(len(park_resizer(park)))