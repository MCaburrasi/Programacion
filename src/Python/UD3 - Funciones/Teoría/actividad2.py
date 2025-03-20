def valor_absoluto(numero):
    resultado = numero
    if numero < 0:
        resultado = numero * -1
        
    return resultado


n = int(input("Ingresa un numero: "))
print(f"El valor absoluto es {valor_absoluto(n)}")