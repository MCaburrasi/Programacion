n, m, x, y, z = input("Escriba 5 numeros separados por espacio: ").split()
n = float(n)
m = float(m)
x = float(x)
y = float(y)
z = float(z)

media = (n+m+x+y+z)/5
print(f"La media es {media}")

if n > media:
    print(f"{n} es mayor que la media")
if m > media:
    print(f"{m} es mayor que la media")
if x > media:
    print(f"{x} es mayor que la media")
if y > media:
    print(f"{y} es mayor que la media")
if z > media:
    print(f"{z} es mayor que la media")

# En vez de print: mayor = mayor + n ...
# Al final: print(f"Mumeros mayores a la media son {mayor}")