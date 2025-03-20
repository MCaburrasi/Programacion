n = int(input("Di un numero entero: "))
factorial = 1

while n > 0:
	factorial *= n 
	n -= 1
	
print(f"El resultado del factorial es {factorial}")