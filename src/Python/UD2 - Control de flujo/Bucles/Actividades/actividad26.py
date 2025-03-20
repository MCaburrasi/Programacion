from sys import maxsize
decision = "s"
menor = maxsize

while decision == "s":
    numero = int(input("introduzca un numero: "))

    if numero < menor:
        menor = numero
    
    decision = input("¿Desea introducir más numeros (s/n)?: ")

print(f"El menor numero de los introducidos es {menor}")