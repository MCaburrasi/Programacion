n, m = map(int, input("Introduzca dos numeros: ").split())

if n > m:
    n,m = m,n

for i in range(n,m+1):
    if i % 2 == 0:
        print(i)

"""if n < m:
    if n % 2 == 0:
        for i in range(n, m - 1,2):
            print(f"{i}" ,end=",")
    else:
        for i in range(n + 1, m - 1, 2):
            print(f"{i}" ,end=",")
    if m % 2 == 0:
        print(m)
    else:
        print(m - 1)
else:
    if m % 2 == 0:
        for i in range(m, n - 1,2):
            print(f"{i}" ,end=",")
    else:
        for i in range(m + 1, n - 1, 2):
            print(f"{i}" ,end=",")
    if n % 2 == 0:
        print(n)
    else:
        print(n - 1)"""
#MAL!