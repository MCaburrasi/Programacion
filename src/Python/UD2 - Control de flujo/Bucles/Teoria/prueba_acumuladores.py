suma = 0

for _ in range (1,6):
    num = int(input("Dime un numero: "))
    if num % 2 == 0:
        suma = suma + num
print(f"La suma de los numeros pares es {suma}")