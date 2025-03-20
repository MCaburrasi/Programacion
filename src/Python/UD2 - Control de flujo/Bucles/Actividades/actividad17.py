from os import system

system("clear")
eleccion = ""

while eleccion != "salir":
    atras = ""
    system("clear")
    print("MEDIATECA CABURRASI")
    print("¿Que desea hacer?:")
    print("1.Consultar peliculas")
    print("2.Consultar libros")
    print("3.Consultar música")
    print("Si desea salir del programa, debe primero volver a este menu escribiendo back en cualquier sección, y despues escriba 'salir' ")
    eleccion = (input("(1, 2, 3): "))

    match eleccion: 
        case "1":
            system("clear")
            print("¿Que pelicula desea consultar?")
            print("1.Everything Everywhere All At Once")
            print("2.Fantastic Mr. Fox")
            print("3.Midsommar")
            pelicula = (input("(1, 2, 3 o 'back'): "))
            if atras == "back":
                continue
            
                
            match pelicula:
                case "1":
                    system("clear")
                    print("EVERYTHING EVERYWHERE ALL AT ONCE: ")
                    print("Dirección: Daniel Kwan y Daniel Scheinert")
                    print("País: Estados unidos")
                    print("Año: 2022")
                    print("Genero: Comedia dramatica absurda")
                    atras = input("'back' para volver a atrás: ")
                    if atras == "back":
                        continue
                
                
                case "2":
                    system("clear")
                    print("FANTASTIC MR.FOX: ")
                    print("Dirección: Wes Anderson")
                    print("País: Estados unidos")
                    print("Año: 2009")
                    print("Genero: Animación comedia")
                    atras = input("'back' para volver a atrás: ")
                    if atras == "back":
                        continue
                
                case "3":
                    system("clear")
                    print("MIDSOMMAR: ")
                    print("Dirección: Ari Aster")
                    print("País: Estados unidos")
                    print("Año: 2019")
                    print("Genero: Terror, Intriga, Drama")
                    atras = input("'back' para volver a atrás: ")
                    if atras == "back":
                        continue
                
                case "Back":
                    continue

                case _:
                    print("Pelicula no encontrada")


        case "2":
                system("clear")
                print("¿Que libro desea consultar?")
                print("1.Así habló zaratustra")
                print("2.El seño de los anillos")
                print("3.Una serie de catastróficas desdichas")
                libro = (input("(1, 2, 3 o 'back'): "))
                if atras == "back":
                    continue
                
                    
                match libro:
                    case "1":
                        system("clear")
                        print("ASÍ HABLÓ ZARATUSTRA: ")
                        print("Autor: Friedrich Nietzsche")
                        print("País: Alemania")
                        print("Año: 1883")
                        print("Genero: Novela filosófica")
                        atras = input("'back' para volver a atrás: ")
                        if atras == "back":
                            continue
                    
                    
                    case "2":
                        system("clear")
                        print("EL SEÑOR DE LOS ANILLOS: ")
                        print("Autor: J.R.R Tolkien")
                        print("País: Reino Unido")
                        print("Año: 1954")
                        print("Genero: Literatura fantástica")
                        atras = input("'back' para volver a atrás: ")
                        if atras == "back":
                            continue
                    
                    case "3":
                        system("clear")
                        print("UNA SERIE DE CATASTROFICAS DESDICHAS: ")
                        print("Autor: Lemony Snicket")
                        print("País: Estados unidos")
                        print("Año: 1998")
                        print("Genero: Ficción para jovenes, misterio")
                        atras = input("'back' para volver a atrás: ")
                        if atras == "back":
                            continue
                    
                    case "Back":
                        continue

                    case _:
                        print("Libro no encontrado")

                    
        case "3":
                system("clear")
                print("¿Que album desea consultar?")
                print("1.The normal album")
                print("2.Bewitched")
                print("3.Lemon Boy")
                album = (input("(1, 2, 3 o 'back'): "))
                if atras == "back":
                    continue
                
                    
                match album:
                    case "1":
                        system("clear")
                        print("THE NORMAL ALBUM: ")
                        print("Autor: Will Wood")
                        print("País: Estados unidos")
                        print("Año: 2020")
                        print("Tracklist:")
                        print("\tSuburbia Overture / Greetings from marybell township / Vampire Culture / Love me, normally")
                        print("\t2econd 2ight 2eer (that was fun, goodbye)")
                        print("\tLaplace's Angel (Hurt People? Hurt People!)")
                        print("\tI/Me/Myself")
                        print("\t...well, better than the alternative")
                        print("\tOutliars and Hyppocrates: a fun fact about apples")
                        print("\tBlackBoxWarrior - OKULTRA")
                        print("\tMarsha, Thankk you for the dialectics, but i need you to leave")
                        print("\tLove, me normally")
                        print("\tMemento mori: The most important thing in the world")
                        atras = input("'back' para volver a atrás: ")
                        if atras == "back":
                            continue
                    
                    
                    case "2":
                        system("clear")
                        print("BEWITCHED: ")
                        print("Autor: Laufey")
                        print("País: Islandia")
                        print("Año: 2023")
                        print("Tracklist:")
                        print("\tDreamer")
                        print("\tSecond Best")
                        print("\tHaunted")
                        print("\tMust be love")
                        print("\tWhile you where sleeping")
                        print("\tLovesick")
                        print("\tCalifornia and me")
                        print("\tNocturne (Interlude)")
                        print("\tPromise")
                        print("\tFrom the start")
                        print("\tMisty")
                        print("\tSerendipity")
                        print("\tLetter to my 13 year old self")
                        print("\tBewitched")
                        atras = input("'back' para volver a atrás: ")
                        if atras == "back":
                            continue
                    
                    case "3":
                        system("clear")
                        print("LEMON BOY: ")
                        print("Autor: Cavetown")
                        print("País: Australia")
                        print("Año: 2018")
                        print("Tracklist:")
                        print("\tLemon Boy")
                        print("\tGreen")
                        print("\tIt's U")
                        print("\tFool")
                        print("\tAnother one of those days")
                        print("\tTaking care of things")
                        print("\tBig bowl in the sky")
                        print("\t888")
                        print("\tPoison")
                        print("\t10 feet tall")
                        print("\tI'll make cereal")
                        print("\tPigeon")
                        print("\tLemon Boy - Acappella version")
                        atras = input("'back' para volver a atrás: ")
                        if atras == "back":
                            continue
                    
                    case "Back":
                        continue

                    case _:
                        print("Album no encontrado")

        case "salir":
            system("clear")
            print("Gracias por visitar Mediatecas Caburrasi")