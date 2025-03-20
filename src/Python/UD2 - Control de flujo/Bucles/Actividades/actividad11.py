sueldo_hora = float(input("¿Cuanto gana el empleado por hora?: "))
tiempo = 0

for i in range(6):
    print(f"dia {i + 1}")
    horas = int(input("¿Cuantas hora ha trabajado hoy?: "))
    tiempo += horas

print(f"El empleado ha trabajado {tiempo} horas y ha ganado {sueldo_hora * tiempo}€")