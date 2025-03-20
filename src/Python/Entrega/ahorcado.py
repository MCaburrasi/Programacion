from random import choice

palabras_secretas = [
    "pizza", "hamburguesa", "espaguetis", "sushi", "taco",
    "burrito", "ensalada", "sopa", "lasagna", "empanada",
    "croqueta", "arroz", "paella", "tortilla", "ceviche",
    "falafel", "hummus", "quesadilla", "tarta", "pastel",
    "chocolate", "fresa", "manzana", "banano", "sandía",
    "mango", "naranja", "papaya", "limon",
    "melocoton", "aguacate", "berenjena", "calabacin", "zanahoria",
    "brocoli", "pepino", "pimiento", "ajo",
    "tomate", "cebolla", "patata", "pollo", "cerdo",
    "ternera", "salchicha", "chorizo", "jamon", "queso",
    "yogur", "helado", "bizcocho", "galleta", "caramelo",
    "macarrones", "ravioli", "lasaña", "sandwich", "panqueque"
]
TOTAL_TRIES = 6

print("¡Bienvenido al juego del ahorcado!")
print("Tu objetivo es adivinar la palabra secreta, ya sea letra por letra o en su totalidad")
print("Cada vez que aciertes, la letra o la palabra completa se revelarán")
print(f"Pero ten cuidado: si te equivocas, perderás una oportunidad. Tienes un maximo de {TOTAL_TRIES} intentos")
print("¡Mucha suerte, y que comience el desafío!")

'''Variables'''
game_round = 1
election = ""
wins = 0

while election == "s":
    '''Variables que se reestablecen cada ronda'''
    secret_word = choice(palabras_secretas)
    progress = len(secret_word) * "_"
    tries = TOTAL_TRIES - (TOTAL_TRIES - 1)

    print("------------------------------------------")
    print(f"Ronda {game_round}")
    print("----------")
    game_round += 1

    while progress != secret_word and tries <= 6:

        '''Variables que se reestablecen cada Intento'''
        guess = ''
        index = -1
        player_input = input("Ingresa una letra o palabra a adivinar: ")

        '''Comprovador de acierto'''
        if len(player_input) == len(secret_word):       #Si la longitud de tu input es igual a la longitud de la secreta, comprueba si son la misma palabra
            if player_input == secret_word:
                progress = player_input
            else:
                print(f"No es la palabra secreta. Llevas {tries} intentos: {progress} ")

        elif len(player_input) != len(secret_word):
            print(f"Palabra de longitud incorrecta. Llevas {tries} intentos: {progress}")

        else:
            for leter in secret_word:                   #Comprueba letra por letra, si encuengtra una letra igual a tu input, la concatena
                index += 1
                if leter == player_input:
                    guess += leter
                else:
                    guess += progress[index]            #Si no es igual a la letra correspondiente añade la información del progreso en en la posición indicada por el indice
            progress = guess                            #Actualiza progreso
            print(f"Intento {tries}: {progress}")   
        print("")
        tries += 1

    '''Enseña mensaje de victoria o derrota'''
    if progress != secret_word:
        print(f"Se han agotado los intentos. La palabra secreta era: {secret_word}")
    else:
        print(f"Enhorabuena!! Adivinaste en {tries - 1} intentos")
        wins += 1

    '''Comprovación de continuación del juego'''
    while True:          #Comprueba que se haya escrito bien S o N
        election = input("¿Quieres volver a jugar (s/n)? ")
        if election in ['N', 'n', 'S', 's']: break
        else: print(f"{election} not an option, try again")

'''Estadísticas'''
game_round -= 1
print("-------------------------")
print("Estadísticas del juego")
print(f"Rondas jugadas: {game_round}")
print(f"Has acertado el {wins/game_round:.2%} de {game_round} rondas")