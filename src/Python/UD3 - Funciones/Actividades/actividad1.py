def factorial(n):
    fact = 1
    for i in range(n):
        fact *= (i + 1)
    return fact

if __name__ == "__main__":

    numero = int(input("Numero a calcular: "))
    print(f"El factorial de {numero} es {factorial(numero)}")