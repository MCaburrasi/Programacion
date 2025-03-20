base = float(input("Di la base de la potencia: "))
exponente = int(input("Di el exponente de la potencia: "))
potencia = base

while exponente < 0:
    exponente = int(input("Di el exponente de la potencia: "))

for i in range(1, exponente):
    potencia = potencia * potencia

print(f"{base} elevado a {exponente} es igual a {potencia}")