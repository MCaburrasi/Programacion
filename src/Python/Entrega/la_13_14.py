cantidad = int(input())
for llave in range(cantidad):
    calibre1, calibre2 = map(int, input().split("-"))

    menor = calibre1 if calibre1 < calibre2 else calibre2

    if menor % 2 == 0:
        print("SI")

    else:
        print("NO")
