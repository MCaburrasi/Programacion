num = int(input("Escribe un numero positivo: "))
for x in range(1,num - 1,2):
    print(f"{x}" ,end=",")

if num % 2 == 1:
    print(num)
else:
    print(num - 1)

#print(f"{[x for x in range(1,num,2)]}"): hace una lista gracias a []?