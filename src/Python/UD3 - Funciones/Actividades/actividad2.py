def bisiesto(año):

    return (año % 4 == 0 and año % 100 != 0) or año % 400 == 0


if __name__ == "__main__":

    año = int(input("Escriba un año: "))
    print(f"El año introducido {'es' if bisiesto(año) else 'no es'} bisiesto")