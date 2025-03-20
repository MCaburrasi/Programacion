from math import isqrt
def suma_cifras(n):
    suma = 0
    while n > 0:
       suma += n % 10
       n //= 10
    return suma

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


if __name__ == "__main__":

    numero = 1
    while numero != 0:
        numero = int(input())
        primo_perfecto = True
        contador = 0

        if numero == 0: #Sale inmediatamente al haber un cero, para que el 0 no te de un output
            break

        while primo_perfecto and contador != 1: 
            primo = es_primo(numero)

            if numero / 10 < 1:      #Si recibe un numero de una cifra, lo procesará una vez, y la proxima lo saca del bucle
                contador += 1

            if primo:
                numero = suma_cifras(numero)
            else:
                primo_perfecto = False
    
        print(f"{'yes' if primo_perfecto else 'no'}")
