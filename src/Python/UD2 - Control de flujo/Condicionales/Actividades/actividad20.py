mes = int(input("Dime un numero entre 1 y 12: "))

match mes:
    case 1|3|5|7|8|10|12:
        dia = 31
    case 4|6|9|11:
        dia = 30
    case 2:
        año = int(input("Escribe un año: "))
        if (año % 4 and año % 100 != 0) or año % 400 == 0:
            dia = 28
        else:
            dia = 29

print(f"Su mes tiene {dia} días")

"""if mes == 1 or mes == 3 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12:
    print("Su mes tiene 31 días")
elif (mes != 1 or mes != 3 or mes != 5 or mes != 7 or mes != 8 or mes != 10 or mes != 12) and mes != 2:
    print("Se mes tiene 30 días")
else:
    if año % 4 == 0:
        if año % 100 == 0:
            if año % 400 == 0:
                print("Su mes tiene 29 días")
            else: 
                print("Su mes tiene 28 días")
        else:
            print("Su mes tiene 29 días")
    else:
        print("Su mes tiene 28 días")"""
   
#usar variable, no print, usa solo un print al final
#mejor: match