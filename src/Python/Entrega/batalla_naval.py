from random import randint
MIN_SIZE = 5
MAX_SIZE = 10
WATER = '~'
BOAT = 'B'
SUNK_BOAT = 'X'
ATTACKED_POSITION = 'O'

def change_turn(turn):
    '''Cambia el turno al otro jugador'''
    if turn == 1: turn = 2
    else: turn = 1
    return turn

def print_board(board, hide_boats):
    '''Imprime el tablero en formato más visible'''
    for i in board:
        for j in i:
            if hide_boats and j == BOAT:
                print(f'{WATER} ',end='')
            else:
                print(f'{j} ', end='')
        print('')

def generate_board(board_size):
    '''Genera una matriz de aguas('~')'''
    board = [[WATER for _ in range(board_size)] for _ in range(board_size)]
    return board

def place_boats(board, boat_number):
    '''Coloca los barcos de manera aleatoria sin solaparse'''
    coord_list = []
    placed_boats = 0
    while placed_boats < boat_number:
        coordinates = (randint(0,4), randint(0,4))
        if coordinates not in coord_list:
            coord_list.append(coordinates)
            placed_boats += 1
            board[coordinates[0]][coordinates[1]] = BOAT
    return coord_list
       
def attack(enemy_board, attack_coords, enemy_ship_positions):
    '''Cambia el valor del tablero enemigo según el resultado, y devuelve el tablero y si ha hundido un barco o no'''
    if attack_coords in enemy_ship_positions:
        sink = True
        enemy_board[attack_coords[0]][attack_coords[1]] = SUNK_BOAT
        enemy_ship_positions.remove(attack_coords)
    else:
        sink = False
        enemy_board[attack_coords[0]][attack_coords[1]] = ATTACKED_POSITION
    return sink

def play(board_size, boat_number):
    '''Programa principal'''

    '''Establecer variables iniciales'''
    finished = False
    turn = 1
    turn_amount = 0
    game_turn = 0
    
    '''Generar los tableros de cada jugador y coloca los barcos'''
    board1 = generate_board(board_size)
    board2 = generate_board(board_size)
    coord_list1 = place_boats(board1, boat_number)
    print('Colocando barcos para el jugador 1...')
    coord_list2 = place_boats(board2, boat_number)
    print('Colocando barcos para el jugador 2...')
    print('')
    print('¡Comienza la batalla naval!')
    print('')
    while not finished:
        '''Bucle principal'''
        print(f'Turno de Jugador {turn}')
        print('Tu tablero actual: ')

        '''Establece cual es el tablero enemigo y el tuyo'''
        if turn == 1:
            attacker_board = board1
            enemy_board = board2
            ships_to_attack = coord_list2
        else:
            attacker_board = board2
            enemy_board = board1
            ships_to_attack = coord_list1
        print_board(attacker_board, False)
        print('')
        print('Tablero enemigo: ')
        print_board(enemy_board, True)
        print('')

        '''Ataque'''
        while True:
            '''Comprueba que las coordenadas estén dentro de rango (primer condicional) y si ya han sido atacadas(segundo condicional)
            depende de que condición se incumpla saldrá un mensaje distinto'''
            alredy_hit = False
            attack_coords = tuple(int(num) for num in input(f'Jugador {turn}, ingresa fila y columna separadas por un espacio (0-{board_size - 1}): ').split(' '))
            if attack_coords[0] in range(board_size) and attack_coords[1] in range(board_size):
                if enemy_board[attack_coords[0]][attack_coords[1]] not in [SUNK_BOAT, ATTACKED_POSITION]: break
                print('Esa posición ya fué atacada. Elige otra')
                alredy_hit = True
            if not alredy_hit: #Se usa este condicional para que no ponga los dos mensajes de error si se incumple el segundo condicional
                print('Coordenadas fuera de rango. Elige otra')    
        sink = attack(enemy_board, attack_coords, ships_to_attack)
        if sink: print('¡Impacto! Hundiste un barco enemigo.')
        else: print('¡Fallaste! Agua.')

        turn = change_turn(turn)

        '''Comprueba que haya terminado la partida'''
        if ships_to_attack == []:
            finished = True
            
        '''Cuenta dos turnos distintos, uno que aumenta cada cambio de jugador(turn_amount)
        y uno que aumenta cuando el turno se devuelve al primer jugador(game_turn)'''
        turn_amount += 1
        if turn_amount % 2:
            game_turn += 1

    '''Mensaje final'''
    turn = change_turn(turn)
    print('')
    print(f'¡Jugador {turn} gana en {game_turn} turnos! Todos los barcos enemigos han sido hundidos.')
    print(f'Gracias por jugar. ¡Hasta la próxima!')

if __name__ == '__main__':
    '''Comprueba que el tamaño del tablero esté dentro de los limites'''
    while True:
        board_size = int(input(f'Introduce el tamaño del tablero (Entre {MIN_SIZE} y {MAX_SIZE}): '))
        if board_size >= MIN_SIZE and board_size <= MAX_SIZE: break
        print('Tamaño no disponible, intenta de nuevo')

    '''Comprueba que la cantidad de barcos esté dentro de los limites'''
    while True:        
        boat_number = int(input(f"Introduce el numero de barcos por jugador (máximo {board_size**2 // 3}): "))
        if boat_number > 0 and boat_number <= board_size**2//3: break
        print('Cantidad no dispoible, intenta de nuevo')

    play(board_size, boat_number)