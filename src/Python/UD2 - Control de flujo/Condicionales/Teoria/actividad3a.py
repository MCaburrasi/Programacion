n = float(input("Escriba el primer numero: "))
operacion = input("Introduzca el simbolo de la operación (+ - * /): ")
m = float(input("Escriba el segundo numero: "))

if operacion == "+":
    print(f"El resultado de la suma {n} mas {m} es {n+m}")
elif operacion == "-":
    print(f"El resultado de la resta de {n} menos {m} es {n-m}")
elif operacion == "*":
    print(f"El resultado de la multiplicación {n} por {m} es {n*m}")
elif operacion == "/" and m == 0:
    print(f"No puede hacer una división con denominador 0")
elif operacion == "/" and m != 0:
    print(f"El resultado de la división {n} entre {m} es {n/m}")
else:
    print("El simbolo de operación que ha introducido no es válido")

print("Fin")