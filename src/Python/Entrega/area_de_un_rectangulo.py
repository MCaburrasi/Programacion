ax, ay, bx, by = map(int,input().split(" "))
base = 0
altura = 0
posible = True

if ax < bx:
    base = bx - ax
else:
    posible = False

if ay < by:
    altura = by - ay
else: 
    posible = False

if posible:
    print(f"{base * altura}")


