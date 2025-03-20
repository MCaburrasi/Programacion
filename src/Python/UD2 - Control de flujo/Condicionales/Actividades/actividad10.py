nota = float(input("Nota: "))
edad = int(input("Edad: "))
sexo = input("Sexo: ")

if nota >= 5 and edad >= 18 and sexo == "F":
    print("Aceptada")
elif nota >= 5 and edad >= 18 and sexo == "M":
    print("Posible")
else:
    print("No aceptada")

#Otra opción
#estado == "No aceptada"
#if nota >= 5 and edad >= 18
    #if sexo == F
        #estado = "Aceptada"
    #if sexo == M
        #estado = "Posible"
#print(f"Su estado es {estado}")