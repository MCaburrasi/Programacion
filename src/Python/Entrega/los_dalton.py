cantidad = 1

while cantidad != 0:
    anterior = 0
    dalton = True
    cantidad = int(input(""))
    
    if cantidad != 0:
        alturas = list(map(int, input("").split(" ")))

        for a in alturas:
            if a > anterior:
                anterior = a
            else: 
                dalton = False
                break

        print(f"{'DALTON' if dalton else 'DESCONOCIDOS'}")

print("Fin")