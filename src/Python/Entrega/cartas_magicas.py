from random import randint
from random import randrange
'''Establece las constantes'''
PERSONAJE_JUGADOR = "Hermione Granger"
NPC = "Draco Malfoy"
PODER_INICIAL = 20

print("Bienvenido a la Competencia de Cartas Mágicas.")
print(f"Tu eres la alumna {PERSONAJE_JUGADOR} y te enfrentarás al alumno {NPC}.")
print("Existen 3 cartas: carta de dragón, carta de unicornio y carta de fénix.")
print("El dragon es más fuerte que el unicornio, el unicornio es más fuerte que el fénix, el fénix es más fuerte que el dragón.")
print(f"Cada jugador comienza con 20 puntos de poder. Elige sabiamente y derrota a {NPC}.")

'''Establece las varibales inciales'''
poder_jugador = PODER_INICIAL
poder_npc = PODER_INICIAL
ronda = 0
rondas_ganadas = 0
rondas_empatadas = 0

while poder_jugador > 0 and poder_npc > 0:
    '''Establece variables al inicio de cada ronda o segun el valor de la ronda'''
    poder_jugador = int(poder_jugador)
    poder_npc = int(poder_npc)

    if poder_jugador == 0 or poder_npc == 0:
        break

    ronda += 1
    jugada = " "
    luna_llena = ronda % 5 == 0
    
    print("\n")
    print(f"Ronda {ronda}:")
    print(f"Tu poder: {poder_jugador} | Poder de {NPC}: {poder_npc}")
    if luna_llena:
        print("Hay luna llena, durante esta ronda todo daño que se haga se triplicará") 
    
    '''Valores aleatorios'''
    valor_carta_npc = randint(1,3)
    poder_a_perder = randrange(10,30,10)
    if luna_llena:
        poder_a_perder *= 3

    '''Bucle de comprovación de resultado'''
    while jugada != 'd' or jugada != 'u' or jugada != 'f':
        jugada = input("Elije tu carta: (d)ragón, (u)nicornio, (f)énix: ")
        
        if jugada == 'd' or jugada == 'u' or jugada == 'f':
            break
        print("Opción no valida. Elige de nuevo.")

    '''Traductor jugada npc'''
    match valor_carta_npc:
        case 1:
            carta_npc = "dragón"
        case 2:
            carta_npc = "unicornio"
        case 3:
            carta_npc = "fénix"

    '''Traductor jugada jugador'''
    match jugada:
        case "d":
            carta = "dragón"
            valor_carta = 1
        case "u":
            carta = "unicornio"
            valor_carta = 2
        case "f":
            carta = "fénix"
            valor_carta = 3


    print(f"{NPC} elige: {carta_npc}")
    print("\n")
    print(f"Tu carta: {carta} | Carta {NPC}: {carta_npc}")

    '''Lista de victorias
    se resta para comprovar si gana o pierde (si el valor de la carta es menor que la del oponente ganas)
    cuando es 0 se establece en 3 para hacer que sea ciclico "1 > 3" o "Dragon > Fénix" fenix es menor asi que pierde'''

    valor_carta_resta = valor_carta - 1
    if valor_carta_resta == 0:
        valor_carta_resta = 3

    if carta == carta_npc:
        resultado = "empate"
    elif valor_carta_resta == valor_carta_npc:
        resultado = "derrota"
    else:
        resultado = "victoria"

    match resultado:
        case "empate":
            print("Ambos jugadores eligieron la misma carta. No hay perdida de puntos en esta ronda")
            rondas_empatadas += 1
        case "victoria":
            print(f"¡Tu carta fue más fuerte! {NPC} ha perdido poder en un {poder_a_perder}%")
            poder_npc -= poder_npc * (poder_a_perder/100)
            rondas_ganadas += 1
        case "derrota":
            print(f"¡La carta de {NPC} fue más fuerte! Has perdido poder en un {poder_a_perder}%")
            poder_jugador -= poder_jugador * (poder_a_perder/100)
            
    
if poder_jugador == 0:
    print(f"{NPC} ha ganado el duelo ¡Sigue practicando!")
else:
    print(f"¡Felicidades, has derrotado a {NPC}!")

print("\n")
print("Estadisticas del juego: ")
print(f"Rondas jugadas: {ronda}")
print(f"Rondas ganadas por ti: el {(rondas_ganadas / ronda) * 100:.2f}% de las {ronda} rondas")
print(f"Rondas empatadas por ti: el {(rondas_empatadas / ronda) * 100:.2f}% de las {ronda} rondas")
