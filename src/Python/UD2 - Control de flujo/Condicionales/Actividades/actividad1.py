n, m = input("Dime dos numeros: ").split()
n = float(n)
m = float(m)

if n > m:
    print(f"{n} es mayor que {m}")
elif n < m:
    print(f"{n} es menor que {m}")
else:
    print("Ambos numeros son iguales")