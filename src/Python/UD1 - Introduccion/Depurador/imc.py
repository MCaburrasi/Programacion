'''
Estás ayudando a un investigador con código Python que calcula el Índice de Masa Corporal (IMC) de los pacientes.
El investigador está preocupado porque todos los pacientes parecen tener IMC inusuales e idénticos, a pesar de tener
físicos diferentes. El IMC se calcula como el peso en kilogramos dividido por el cuadrado de la altura en metros.
'''
def calcula_imc(peso, altura):
    imc = peso / (altura ** 2)
    return imc

if __name__ == "__main__":
    pacientes = [[70, 1.8], [80, 1.9], [150, 1.7]]
    for paciente in pacientes:
        peso, altura = pacientes[0]
        imc = calcula_imc(peso,altura)
        print(f"El IMC del paciente es: {imc:.2f}")