inferior = 1
superior = 0
suma = 0
fuera = 0
intervalo = 0

while inferior > superior:
    inferior, superior = map(int, input("Di un intervalo de dos numeros: ").split())

n = int(input("Di un numero: "))
while n != 0:
    if inferior < n < superior:
        suma = suma + n
    elif inferior > n or superior < n:
        fuera = fuera + 1
    else:
        intervalo = True
    n = int(input("Di un numero: ")) #No repitas input, usa un imput y break al principio

print(f"Suma de los numeros dentro del intervalo es {suma}") 
print(f"Hay {fuera} numeros fuera del intervalo")

if intervalo:
    intervalo = "Hay"
else:
    intervalo = "No hay"
    
print(f"{intervalo} numeros iguales a alguno de los dos bordes del intervalo")