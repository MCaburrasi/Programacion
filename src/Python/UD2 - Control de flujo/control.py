from random import randint, randrange
PERSONAJE_ORDENADOR = "Draco Malfoy"
PERSONAJE_JUGADOR = "Hermione Granger"
PODER = 20
DAÑO_LUNAR = 3

#Mensaje Bienvenida
print("Bienvenido a la Competencia de Cartas Mágicas.")
print(f"Tu eres la alumna/o {PERSONAJE_JUGADOR} y te enfrentarás al alumno/a {PERSONAJE_ORDENADOR}.")
print("Existen 3 cartas: carta de dragón, carta de unicornio y carta de fénix.")
print("El dragon es más fuerte que el unicornio, el unicornio es más fuerte que el fénix, el fénix es más fuerte que el dragón.")
print(f"Cada jugador comienza con {PODER} puntos de poder. Elige sabiamente y derrota a {PERSONAJE_ORDENADOR}.")

ronda = 1
poder_ordenador = PODER
poder_jugador = PODER
empatadas = 0
ganadas = 0

while poder_ordenador > 0 and poder_jugador > 0:
    print(f"\nRonda {ronda}: ")
    print(f"Tu poder: {poder_jugador} | Poder de {PERSONAJE_ORDENADOR}: {poder_ordenador}")
    
    # Los jugadores juegan sus cartas
    while True:
        carta_jugador = input("Elije tu carta: (d)ragón, (u)nicornio, (f)énix: ")
        if carta_jugador == 'd' or carta_jugador == 'u' or carta_jugador == 'f':
            break
        print("Opción no valida. Elige de nuevo.")

    match carta_jugador:
        case "d":
            carta_jugador = "dragón"
        case "u":
            carta_jugador = "unicornio"
        case "f":
            carta_jugador = "fénix"
    
    carta_ordenador = randint(1,3)
    match carta_ordenador:
        case 1:
            carta_ordenador = "dragón"
        case 2:
            carta_ordenador = "unicornio"
        case 3:
            carta_ordenador = "fénix"
    


    print(f"{PERSONAJE_ORDENADOR} elige: {carta_ordenador}")
    print(f"Tu carta: {carta_jugador} | Carta {PERSONAJE_ORDENADOR}: {carta_ordenador}")
    
    #Determina ganador
    ganador = ""
    if carta_jugador == carta_ordenador:
        ganador = "empate"
    elif carta_jugador == "dragón" and carta_ordenador == "unicornio" or \
         carta_jugador == "unicornio" and carta_ordenador == "fénix" or \
         carta_jugador == "fénix" and carta_ordenador == "dragón":
        ganador = PERSONAJE_JUGADOR
    else:
        ganador = PERSONAJE_ORDENADOR
        
    # Actualización de poder
    porcentaje_daño = randrange(10,31,10)/100
    if ganador != "empate" and ronda%5==0: #Ronda de la luna
        porcentaje_daño *= DAÑO_LUNAR
        print(f"Hay luna llena, durante esta ronda todo daño que se haga se triplicará. Perdida de poder del {porcentaje_daño:.0%}")
        

    if ganador == PERSONAJE_JUGADOR:
        poder_ordenador = int(poder_ordenador - poder_ordenador * porcentaje_daño)
        print(f"¡Tu carta fue más fuerte! {PERSONAJE_ORDENADOR} ha perdido poder en un {porcentaje_daño:.0%}")
        ganadas += 1
    elif ganador == PERSONAJE_ORDENADOR:
        poder_jugador = int(poder_jugador - poder_jugador * porcentaje_daño)
        print(f"¡La carta de {PERSONAJE_JUGADOR} fue más fuerte! Has perdido poder en un {porcentaje_daño:.0%}")
    else:
        print("Ambos jugadores eligieron la misma carta. No hay perdida de puntos en esta ronda")
        empatadas += 1
    ronda += 1

# Mensaje Ganador
if poder_jugador == 0:
    print(f"{PERSONAJE_ORDENADOR} ha ganado el duelo ¡Sigue practicando!")
else:
    print(f"¡Felicidades, has derrotado a {PERSONAJE_ORDENADOR}!")
# Estadísticas
ronda -= 1
print("Estadisticas del juego: ")
print(f"Rondas jugadas: {ronda}")
print(f"Rondas ganadas por ti: el {ganadas*100 / ronda:.2f}% de las {ronda} rondas")
print(f"Rondas empatadas por ti: el {empatadas*100 / ronda:.2f}% de las {ronda} rondas")