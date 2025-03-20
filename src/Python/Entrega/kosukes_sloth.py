iterations = int(input())
for _ in range(iterations):
    n, k = map(int, input().split(" "))
    f_0 = 0
    f_1 = 1
    position = 0
    while n > 0:
        if f_1 % k == 0:
            n -= 1
        f = f_0 + f_1
        f_0 = f_1
        f_1 = f
        position += 1

    print(position%10**9+7)
