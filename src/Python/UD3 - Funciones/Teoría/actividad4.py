from math import isqrt
def es_primo(n):
    primo = True

    if n%2 == 0 and n != 2 or n == 1:
        primo = False
    else:
        for i in range(3,isqrt(n)+1,2):
            comprovacion = n%i
            if comprovacion == 0:
                primo = False
                break

    return primo


a = int(input("Di un numero: "))
print(es_primo(a))