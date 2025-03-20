from math import isqrt
n = int(input("Di un numero: "))
primo = True

if n == 1:
    primo = False
else:    
    for i in range(2,n):
        comprovacion = n%i
        if comprovacion == 0:
            primo = False
            break

print(f"{n} {'es' if primo else 'no es'} un numero primo")