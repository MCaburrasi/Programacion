PESO_PAYASOS = 112
PESO_MUÑECAS = 75
cantidad_payasos = int(input("Cuantos payasos hay en el paquete?: "))
cantidad_muñecas = int(input("Cuantas muñecas hay en el paquete?: "))
peso_paquete= cantidad_payasos*PESO_PAYASOS + cantidad_muñecas*PESO_MUÑECAS
print("El peso de este paquete es",peso_paquete,"g")