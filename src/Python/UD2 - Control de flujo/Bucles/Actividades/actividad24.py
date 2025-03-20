from math import gcd
a, b = map(int, input("Escribe dos numeros: ").split())

print(a * (b/gcd(a, b)))