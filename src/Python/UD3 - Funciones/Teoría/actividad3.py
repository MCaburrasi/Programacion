def es_multiplo(x, y):
    resultado = x % y == 0
    return resultado


a = 5
b = 4
print(f"{a} es multiplo {b}: {es_multiplo(a,b)}")

m = 14
n = 2
print(f"{m} es multiplo {n}: {es_multiplo(m,n)}")