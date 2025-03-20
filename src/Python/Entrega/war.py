from random import shuffle
CARD_VALUES = (2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
CARD_FLUSHES = ('♠', '♥', '♦', '♣')
DISCARD_DRAW = 3
MAX_ROUNDS = 200 #-1 para desactivar maximo de rondas
RED = '\033[31m'
BLACK = '\033[0m'

def create_and_shuffle():
    '''Crea y baraja el mazo'''
    deck = [(value, flush) for flush in CARD_FLUSHES for value in CARD_VALUES]
    shuffle(deck)
    return deck

def deal_cards():
    '''Rompe el mazo barajado por la mitad
    ¡¡¡Principio de resposabilidad unica!!!'''
    deck = create_and_shuffle()
    player1deck = deck[:int(len(deck)/2)]
    player2deck = deck[int(len(deck)/2):]
    return player1deck, player2deck

def translate_card(card):
    '''Cambia el valor de las figuras a la letra'''
    match card:
        case 1|2|3|4|5|6|7|8|9: card = f' {card}'
        case 11: card = ' J'
        case 12: card = ' Q'
        case 13: card = ' K'
        case 14: card = ' A'
    return card

def card_color(card):
    '''Mira de que color tiene que ser cada figura'''
    if card[1] in ['♠','♣']: color = BLACK
    else: color = RED
    return color

def print_cards(card1, card2):
    '''Dibuja las cartas'''
    color1 = card_color(card1)
    color2 = card_color(card2)
    t_value1 = translate_card(card1[0])
    t_value2 = translate_card(card2[0])
    print(' ____    ____')
    print(f'|{t_value1}  |  |{t_value2}  |')
    print(f'|  {color1}{card1[1]}{BLACK} |  |  {color2}{card2[1]}{BLACK} |')
    print(f'|__{t_value1}|  |__{t_value2}|')

def print_hidden_decks(deck, player):
    '''Imprime el mazo de cada jugador'''
    translated_deck = []
    for card in deck:
        translated_card = translate_card(card[0])
        if card[0] == 10: translated_card = ' 10'
        card = (translated_card, card[1])
        translated_deck.append(card)

    print(f'Mazo del jugador {player} oculto ({len(deck)}): ', end='')
    for card in translated_deck:
        for info in card:
            print(f'{info}', end='')
        print(f'',end='')
    print('')

def round_winner(played_cards1, played_cards2, deck1, deck2):
    '''Determina el ganador de cada ronda'''
    if played_cards1[0][0] > played_cards2[0][0]: state = 'p1'
    elif played_cards1[0][0] < played_cards2[0][0]: state = 'p2'
    else: state = 'd'
    
    if state == 'p1':
        return_cards(played_cards1, played_cards2, deck1)
    elif state == 'p2':
        return_cards(played_cards1, played_cards2, deck2)
    return state

def return_cards(card1, card2, winner_deck):
    '''Devuelve las cartas jugadas al ganador'''
    for index in range(len(card1)):
        winner_deck.append(card1[index])
    for index in range(len(card2)):
        winner_deck.append(card2[index])
    return winner_deck

def draw(played_cards_1, played_cards_2, deck1, deck2):
    '''Saca 3 cartas de cada jugador cuando hay empate'''
    if len(deck1) == 0 or len(deck2) == 0:
        return False, True
    for _ in range(DISCARD_DRAW):
        if len(deck1) > 1:
            played_cards_1.insert(0, deck1.pop(0))
        if len(deck2) > 1:
            played_cards_2.insert(0, deck2.pop(0))
    return True, False
    
def play():
    '''Variables iniciales'''
    p1_victory = 0
    p2_victory = 0
    wars = 0
    guerra = True
    lost_on_draw = False
    round = 1
    player1deck, player2deck = deal_cards()
    deck_length = len(player1deck) + len(player2deck)

    '''Juego principal'''
    while len(player1deck) != 0 and len(player2deck) != 0 and round != MAX_ROUNDS + 1:
        '''Variables que necesitan reset despues de cada ronda'''
        played_cards_1 = []
        played_cards_2 = []
        guerra = True

        print(f'--- Ronda {round} ---')
        print_hidden_decks(player1deck, 1)
        print_hidden_decks(player2deck, 2)
        print('')

        '''Siempre se hace una vez, pero si hay guerra se repite hasta que deje de haber guerra (Que alguien la gane)'''
        while guerra:
            played_cards_1.insert(0, player1deck.pop(0))
            played_cards_2.insert(0, player2deck.pop(0))

            print(f'- J1 -  - J2 -')
            print_cards(played_cards_1[0], played_cards_2[0])

            win = round_winner(played_cards_1, played_cards_2, player1deck, player2deck)
            print('')

            '''Comprueba quien gana, o si hay guerra'''
            if win in ['p1', 'p2']:
                if win == 'p1':
                    p1_victory += 1
                else:
                    p2_victory += 1
                print(f'¡Jugador {"1" if win == "p1" else "2"} gana la ronda!')
                guerra = False
            else:
                wars += 1
                print('Empate, entrando en guerra...')
                guerra, lost_on_draw = draw(played_cards_1, played_cards_2, player1deck, player2deck)
            round += 1
    print('')

    '''Comprueba ganador de la partida'''
    game_draw = False
    if len(player2deck) == len(player1deck):
        loser = '1 y 2'
        game_draw = True
    elif len(player1deck) == 0: 
        winner = 2
        loser = 1
    elif len(player2deck) == 0: 
        winner = 1
        loser = 2
    else:
        game_draw = True
    
    if lost_on_draw:
        print(f'El jugador {loser} se quedó sin cartas al inicializar una guerra')
        print('')

    if not game_draw:
        print(f'El jugador {winner} ha ganado el juego')
    else:
        print('¡El juego ha acabado en empate!')

    '''Estadisticas'''
    print('')
    print('Estadísticas')
    print('------------')
    print(f'Jugador 1: {p1_victory} victorias')
    print(f'Jugador 2: {p2_victory} victorias')
    print(f'Guerras: {wars}')
    print(f'Numero de rondas jugadas: {round - 1}')
    print(f'Porcentaje de cartas en el mazo del jugador 1: {len(player1deck)/deck_length:.2%}')
    print(f'Porcentaje de cartas en el mazo del jugador 2: {len(player2deck)/deck_length:.2%}')
    
if __name__ == '__main__':
    play()
