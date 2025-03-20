'''
Eres responsable de calcular el promedio de edad de los empleados en una empresa.
Sin embargo, el gerente reportó que el promedio siempre parece demasiado alto.
Revisa el código e identifica el problema.
'''

def calcula_promedio(edad_total, numero_empleados):
    promedio = edad_total / numero_empleados
    return promedio

if __name__ == "__main__":
    edades = [25, 32, 40, 29, 37]
    total = 0
    
    # Calcula la suma total de las edades
    for edad in edades:
        total += edad
    
    numero_empleados = len(edades) - 1  
    
    promedio = calcula_promedio(total, numero_empleados)
    print(f"La edad promedio de los empleados es: {promedio:.2f}")
    

