n, m, x = input("Escriba 3 numeros: ").split()
n = float(n)
m = float(m)
x = float(x)

if n > m and n > x:
    if m > x:
        print(n,m,x)
    else:
        print(n,x,m)
elif m > n and m > x:
    if n > x:
        print(m,n,x)
    else:
        print(m,x,n)
else:
    if n > m:
        print(x,n,m)
    else:
        print(x,m,n)
