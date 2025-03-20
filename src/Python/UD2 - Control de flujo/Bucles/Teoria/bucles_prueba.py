#tipo while
n = 5
while n > 0:
    print(n)
    n = n-1

print("Despegue!")

#tipo for
for letra in "Python":
    print(letra)

#toma cada caracter en "Python" y los asigna a la variable letra

#función range
range(5) #Devuelve 0, 1, 2, 3, 4
range(5,10) #Devuelve 5, 6, 7, 8, 9
range(0,10,2) #Devuelve 0, 2, 4, 6, 8
range(-10,-100,-30) #Devuelve -10, -40, -70

#se puede combinar for y range
for x in range(5):
    print(x)

