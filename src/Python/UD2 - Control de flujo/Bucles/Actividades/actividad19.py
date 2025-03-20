n =  int(input("Di un numero: "))
cifras = 0

if n < 0:
    print("Aviso: Es mejor que el numero sea positivo")
    n *= -1

while n > 1:
    n /= 10
    cifras += 1

print(f"El numero de cifras de su numero es {cifras}")