def dia_mes_año(cadena):
    dia, mes, año = cadena.split("/")
    if len(dia) < 2:
        dia = '0' + dia
    if len(mes) < 2:
        mes = '0' + mes
    return dia, mes, año

if __name__ == "__main__":
    fecha = input("Fecha (dd/mm/aaaa): ")
    dia, mes, año = dia_mes_año(fecha)
    print(dia, mes, año)