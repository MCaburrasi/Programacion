n = int(input("Introduzca el numero de pisos: "))

for i in range(n):
    piso = int(((i + 1) * 2) - 1)
    vacio = int((((n * 2) - 1) - piso /2) - (n - 1))
    print(f"{vacio * ' '}{piso * '*'}{vacio * ' '}")

#Mejor con f-string

'''dibujo = "*"
for i in range(n):
    print(f"{dibujo:^{pisos*2-1}})
    dibujo = dibujo + "*" * 2'''