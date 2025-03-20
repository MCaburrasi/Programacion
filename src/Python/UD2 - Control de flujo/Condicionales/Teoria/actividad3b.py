
n = float(input("Escriba el primer numero: "))
operacion = input("Introduzca el simbolo de la operación (+ - * /): ")
m = float(input("Escriba el segundo numero: "))

match operacion:
    case "+":
        print(f"El resultado de la suma {n} mas {m} es {n+m}")
    case "-":
        print(f"El resultado de la resta de {n} menos {m} es {n-m}")
    case "*":
        print(f"El resultado de la multiplicación {n} por {m} es {n*m}")
    case "/":
        if m == 0:
            print(f"No puede hacer una división con denominador 0")
        else:
            print(f"El resultado de la división {n} entre {m} es {n/m}")
    case _:
        print("No se ha podido realizar la operación")

print("Fin")