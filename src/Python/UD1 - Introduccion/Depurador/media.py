'''
Estás desarrollando un programa para calcular el promedio ponderado de tres exámenes 
de un estudiante. Los pesos de los exámenes son 20%, 30% y 50%, respectivamente. 
El estudiante reportó que el resultado final no coincide con el promedio esperado. 
Revisa el código para encontrar el problema.
'''

def calcula_promedio_ponderado(nota1, nota2, nota3):
    promedio = (nota1 * 0.2 + nota2 * 0.3 + nota3 * 0.5)
    return promedio

if __name__ == "__main__":
    examen1 = 7
    examen2 = 8
    examen3 = 9

    promedio_final = calcula_promedio_ponderado(examen1, examen2, examen3)
    print(f"El promedio ponderado del estudiante es: {promedio_final:.2f}")