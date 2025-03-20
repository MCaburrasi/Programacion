dia = int(input("Dia de la semana (1-7): "))

match dia:
    case 1:
        print(f"El dia de la semana es Lunes.")
    case 2:
        print(f"El dia de la semana es Martes.")
    case 3:
        print(f"El dia de la semana es Miercoles.")
    case 4:
        print(f"El dia de la semana es Jueves.")
    case 5:
        print(f"El dia de la semana es Viernes.")
    case 6:
        print(f"El dia de la semana es Sabado.")
    case 7:
        print(f"El dia de la semana es Domingo.")
    case _:
        print("Error")
