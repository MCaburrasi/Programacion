n = int(input("Dime un numero: "))

if n % 2 == 0 and n % 5 == 0:
    print("Tu numero es divisible entre 2 y 5")
elif n % 2 == 0 and n % 5 != 0:
    print("Tu numero es divisible entre 2")
elif n % 2 != 0 and n % 5 == 0:
    print("Tu numero es divisible entre 5")
else:
    print("Tu numero no es divisible entre 2 ni 5")