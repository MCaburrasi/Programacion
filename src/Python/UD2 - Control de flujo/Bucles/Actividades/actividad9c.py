from math import isqrt
n = int(input("Di un numero: "))
primo = True

if n%2 == 0 and n != 2 or n == 1:
    primo = False
else:
    for i in range(3,isqrt(n)+1,2):
        comprovacion = n%i
        if comprovacion == 0:
            primo = False
            break

print(f"{n} {'es' if primo else 'no es'} un numero primo")