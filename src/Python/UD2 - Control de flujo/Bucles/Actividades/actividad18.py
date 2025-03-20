from math import isqrt
n = int(input("Escribe el limite superior: "))
contador = 0
numero = 2

while contador < n:
    primo = True
    
    for i in range(2,isqrt(numero)+1):
        if numero % i == 0:
            primo = False
            break
    
    if primo:
        print(numero, end=' ')
        contador += 1
    
    numero += 1