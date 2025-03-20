toros = list(map(int,input().split(" ")))
cant = toros[0]
vel_maxima = -1

for velocidad in toros[1:]:
    if vel_maxima < velocidad:
        vel_maxima = velocidad

print(vel_maxima)