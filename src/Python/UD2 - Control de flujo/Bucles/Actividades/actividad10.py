ahorro = 0

for i in range(12):
    print(f"Mes {i+1}")
    n = float(input("¿Cuanto dinero depositas?: "))
    ahorro += n
    if i < 11:
        print(f"Llevas ahorrado {ahorro}€")

print(f"Este año has ahorrado {ahorro}€")