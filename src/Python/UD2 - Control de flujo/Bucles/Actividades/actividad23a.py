a, b = map(int, input("Escribe dos numeros: ").split())

while b > 0:
    a, b = b, a%b
    
print(f"MCD: {a}")