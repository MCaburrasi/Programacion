from math import sqrt
from math import pi
from math import pow
#Te da mas funciones matematicas. Ej,
sqrt(12) // pi // pow(2,3)

from random import randint
from random import sample
from random import choice

#Te da funciones de numeros aleatorios. Ej,
for _ in range(5):
    aleatorio = randint(1,10)
    print(aleatorio)

lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(sample(lista, 3))

li_lista = ["apple", "banana", "cherry"]
print(choice(li_lista))