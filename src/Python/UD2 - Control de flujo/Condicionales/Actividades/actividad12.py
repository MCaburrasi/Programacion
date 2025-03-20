n, m, x = input("Escriba 3 numeros: ").split()
n = float(n)
m = float(m)
x = float(x)

if  n**2 == m**2 + x**2 or m**2 == n**2 + x**2 or x**2 == n**2 + m**2: # aqui poner n != m != x (mas fácil)
    print(f"El triangulo con distancia de lados {n} {m} {x} es rectangulo")
elif n == m or m == x or x == n:
    print(f"El triangulo con distancia de lados {n} {m} {x} es isosceles")
elif n == m == x:
    print(f"El triangulo con distancia de lados {n} {m} {x} es equilátero")
else:
    print(f"El triangulo con distancia de lados {n} {m} {x} es escaleno") # aqui estaría rectangulo

#Despues de condición: triangulo = rectangulo, isosceles...
#print(f"El triangulo con distancia de lados {n} {m} y {x} es {triangulo}")