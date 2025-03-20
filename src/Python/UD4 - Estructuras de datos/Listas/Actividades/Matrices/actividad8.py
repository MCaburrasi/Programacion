eleccion = int(input('Que desea hacer? (1-9): '))
lista = []
match eleccion:
    case 1:
        numero = int(input("Numero: "))
        lista.append(numero)
    case 2:
        numero = int(input("Numero: "))
        posicion = int(input("Posicion: "))
        lista.insert(posicion, numero)
    case 3:
        print(len(lista))
    case 4:
        print(lista[-1])
        lista.pop()
    case 5:
        posicion = int(input("Posición: "))
        lista.pop(posicion)
    case 6:
        numero = int(input('Numero: '))
        print(lista.count(numero))
    case 7:
        pass