games = int(input())
rounds = 1
player = "SAKURAKO"
for _ in range(games):
    n = int(input())
    x = 0
    while abs(x) < n:       #"SAKURAKO" means Sakurako is playing, "sakurako" means Kosuke is playing
        if player == "SAKURAKO":
            x = x - (2 * rounds - 1)
        elif player == "sakurako":
            x = x + (2 * rounds - 1)

        player = player.swapcase()
        rounds += 1

    if player == "SAKURAKO":
        print("Sakurako")
    else:
        print("Kosuke")