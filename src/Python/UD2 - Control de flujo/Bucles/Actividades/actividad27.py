n = int(input("Introduzca cantidad a devolver: "))
billetes_20 = 0
billetes_10 = 0
billetes_5 = 0
monedas_2 = 0
monedas_1 = 0

while n > 0:
    if n - 20 >= 0:
        n -= 20
        billetes_20 += 1

    elif n - 10 >= 0:
        n -= 10
        billetes_10 += 1

    elif n - 5 >= 0:
        n -= 5
        billetes_5 += 1

    elif n - 2 >= 0:
        n -= 2
        monedas_2 += 1

    else:
        n -= 1
        monedas_1 += 1

print(f"Billetes de 20: {billetes_20}")
print(f"Billetes de 10: {billetes_10}")
print(f"Billetes de 5: {billetes_5}")
print(f"Monedas de 2: {monedas_2}")
print(f"Monedas de 1: {monedas_1}")