base = float(input("Escribe la base: "))
exponente = int(input("Escribe el exponente"))

if exponente > 0:
    print(f"El resultado es {base**exponente}")
if exponente < 0:
    print(1/(base**exponente*-1)) #abs(exponente): Valor absoluto
else:
    print("El resultado es 1")

#No repetir codigo! : if exponente ...: Then resultado = x
#Al final: print("El resultado es {resultado}")