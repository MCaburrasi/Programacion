dia, mes, año = input("Escriba una fecha").split("-")
dia = int(dia)
mes = int(mes)
año = int(año)
#dia, mes, año = map(int, input("Escriba una fecha"))

match mes:
    case 1|3|5|7|8|10|12:
        max_dia = 31
    case 4|6|9|11:
        max_dia = 30
    case 2:
        año = int(input("Escribe un año: "))
        if (año % 4 and año % 100 != 0) or año % 400 == 0:
            max_dia = 28
        else:
            max_dia= 29

if 1 <= dia <= max_dia and 1 <= mes <= 12 and len(año) == 4:
    print(f"Su fecha {dia}-{mes}-{año} es correcta")
else:
    print("Su fecha no es correcta")