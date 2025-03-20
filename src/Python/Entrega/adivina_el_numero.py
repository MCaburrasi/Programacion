from random import randint
n = randint(1,20)

print("Bienvenido a 'Adivina el numero'")
print("Estoy pensando en un numero entre 1 y 20")
print("Trata de adivinarlo en no más de 6 intentos")

for i in range (6):
    guess = int(input("Adivina\n"))
    if guess < n:
        print("Es muy bajo")
    elif guess > n:
        print("Es muy alto")
    else:
        break

if guess != n:
    print("Game over, no has podido adivinar el numero en 6 intentos")
    print(f"El numero era {n}")
else:
    print(f"Buen trabajo, has adivinado el numero en {i+1} intentos!")