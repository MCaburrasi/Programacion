año = int(input("Escribe un año: "))

if año % 4 == 0:
    if año % 100 == 0:
        if año % 400 == 0:
            print(f"{año} es bisiesto")
        else: 
            print(f"{año} no es bisiesto")
    else:
        print(f"{año} es bisiesto")
else:
    print(f"{año} no es bisiesto")

#Mejor : if (año % 4 and año % 100 != 0) or año % 400 == 0