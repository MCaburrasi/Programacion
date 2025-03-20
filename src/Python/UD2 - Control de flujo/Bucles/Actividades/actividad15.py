from time import sleep
from os import system

SEGUNDOS_EN_UN_DIA = 60 * 60 * 24
minutos = 0
segundos = 0
horas = 0

for _ in range(SEGUNDOS_EN_UN_DIA):
    segundos += 1
    print(f"{horas}:{minutos}:{segundos}")
    sleep(1)

    if segundos == 60:
        segundos = 0
        minutos += 1

    if minutos == 60:
        minutos == 0
        horas += 1

    if horas == 24:
        horas = 0

    system("clear")

