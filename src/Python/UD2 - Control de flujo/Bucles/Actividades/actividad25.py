n = int(input("Cuantos terminos quieres generar: "))
b = 0
f = 1
print("0")
print("1")

for _ in range(n-2):
    a = b
    b = f
    f = a + b
    print(f)