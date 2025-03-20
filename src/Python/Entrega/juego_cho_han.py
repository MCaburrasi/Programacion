from random import randint

def traduccion(dado):
    match dado:                #Traduce el valor del dado 1 a japones
        case 1:
            japones = "ICHI"
        case 2:
            japones = "NI"
        case 3:
            japones = "SAN"
        case 4:
            japones = "SHI"
        case 5:
            japones = "GO"
        case 6:
            japones = "ROKU"

    return japones

if __name__ == "__main__":

    print("En este juego de dados tradicional japonés, el croupier, sentado en el suelo,")
    print("lanza dos dados en un cubilete de bambú. El jugador debe adivinar si los")
    print("dados suman un número par (cho) o impar (han).")

    dinero = 5000
    TASA = 10

    while dinero > 0:
        print(f"Tienes {dinero} euros. ¿Cuanto apuestas? (o 'SALIR')")
        apuesta = input("> ")
        
        if apuesta == "SALIR":
            break
        
        
        apuesta = int(apuesta)


        print("El crupier hace girar el cubilete y se oye el traqueteo de los dados.")
        print("El crupier golpea el cubilete contra el suelo, todavia cubriendo los") 
        print("dados y pide tu apuesta")
        print("\tCHO (par) or HAN (impar)?")
    
        
        eleccion_par = False        #Resetea el flag antes de comparar otra vez 

        dado1 = randint(1, 6) 
        dado2 = randint(1, 6)
        suma = dado1 + dado2        #Suma 2 numeros aleatorios
        random_par = suma % 2 == 0  #Calculo par / impar


        opcion = input("> ")        #Asigna valor True o False si es Par o Impar para compararlo con random_par
        if opcion == "CHO":
            eleccion_par = True

        j_dado1 = traduccion(dado1)
        j_dado2 = traduccion(dado2)


        print("El crupier levanta el cubilete para revelar")
        print(f"\t{dado1} - {dado2}")
        print(f"\t{j_dado1} - {j_dado2}")

        if random_par == eleccion_par:
            dinero += apuesta - int(apuesta * 0.1) 
            print(f"¡Has ganado! Ganas {apuesta} euros")
            print(f"La casa se lleva {int(apuesta * TASA/100)} euros en tasas")

        else:
            print("¡Has perdido!")
            dinero -= apuesta


    if dinero <= 0:
        print("Te quedaste sin dinero, no puede seguir jugando")
    else:
        print("¡Vuelve a jugar cuando quieras!")