def to_bin(decimal):
    binario = f"{decimal:b}"
    return binario

def to_dec(binario):
    binario = str(binario)
    decimal = int(binario, 2)
    return decimal

if __name__ == "__main__":

    numero_decimal = 5
    numero_binario = 101

    print(f"{numero_decimal} en binario es {to_bin(numero_decimal)}")
    print(f"{numero_binario} en decimal es {to_dec(numero_binario)}")