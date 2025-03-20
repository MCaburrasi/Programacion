'''
Estás creando un programa para encontrar el número más grande en una lista de números enteros.
Sin embargo, el resultado final parece incorrecto. Revisa el código para identificar el problema.
'''

def encuentra_maximo(numeros):
    maximo = numeros[0]
    for i in range(1, len(numeros)):
        if numeros[i] > maximo:  
            maximo = numeros[i]
    return maximo

if __name__ == "__main__":
    lista_numeros = [3, 8, 2, 10, 5]
    maximo = encuentra_maximo(lista_numeros)
    print(f"El número más grande en la lista es: {maximo}")