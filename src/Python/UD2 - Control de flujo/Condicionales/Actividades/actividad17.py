minutos = int(input("Cantidad de minutos: "))
dia = input("Escribe un dia (L, M, X, J, V, S, D): ")
precio = 1
if dia != "D":
    momento = input("¿Mañana o tarde? (M, T): ")


if minutos <= 5:
    precio = precio
elif minutos <= 8:
    precio = precio + 0.80
elif minutos <= 10:
    precio = precio + 0.80 + 0.70
else:
    precio = precio + 0.80 + 0.70 + 0.50

if dia == "D":
    descuento = 0.03
elif dia != "D" and momento == "M":
    descuento = 0.15
else:
    descuento = 0.10

print(f"El precio de su llamada ha sido {precio + (precio * descuento)}€")