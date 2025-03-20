'''from math import pow
cantidad = int(input())

for triangulo in range(cantidad):
    catetos = list(map(int, input().split(" ")))
    maximo = max(catetos)
    catetos.remove(maximo)
    
    if maximo < catetos[0] + catetos[1]:
        if pow(maximo, 2) > pow(catetos[0], 2) + pow(catetos[1], 2):
            print("Obtusángulo")

        elif pow(maximo, 2) < pow(catetos[0], 2) + pow(catetos[1], 2):
            print("Acutángulo")

        else:
            print("Rectángulo")
    else:
        print("Imposible")'''

from math import pow
cantidad = int(input())

for triangulo in range(cantidad):
    a, b, c = map(int, input().split(" "))

    if a > b and a > c:
        hipotenusa = a
        cateto1 = b
        cateto2 = c
    
    elif b > a and b > c:
        hipotenusa = b
        cateto1 = a
        cateto2 = c

    else:
        hipotenusa = c
        cateto1 = a
        cateto2 = b

    if hipotenusa < cateto1 + cateto2:
        if pow(hipotenusa, 2) > pow(cateto1, 2) + pow(cateto2, 2):
            print("Obtusángulo")

        elif pow(hipotenusa, 2) < pow(cateto1, 2) + pow(cateto2, 2):
            print("Acutángulo")

        else:
            print("Rectángulo")
    else:
        print("Imposible")