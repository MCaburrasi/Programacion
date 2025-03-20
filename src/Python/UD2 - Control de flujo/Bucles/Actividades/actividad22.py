n = int(input("Introduzca el numero de pisos: "))

for i in range(n):
    piso = int(((i + 1) * 2) - 1)
    vacio = int(((n * 2) - 1) - piso /2)
    print(f"{vacio * ' '}{piso * '*'}{vacio * ' '}")

print(f"{(int((piso - 1)/2) + vacio) * ' '}{1 * '|'}{int(((piso - 1)/2) + vacio) * ' '}")
print(f"{(int((piso - 1)/2) + vacio) * ' '}{1 * '|'}{int(((piso - 1)/2) + vacio) * ' '}")