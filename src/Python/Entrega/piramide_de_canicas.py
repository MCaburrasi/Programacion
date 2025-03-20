def contador_de_canicas(numero):
    piso_anterior = 0
    canicas = 0
    for i in range(numero):
        canicas_piso = piso_anterior + (i+1)
        canicas += canicas_piso
        piso_anterior = canicas_piso

    return canicas

if __name__ == "__main__":

    iteraciones = int(input())

    for _ in range(iteraciones):
        numero_pisos = int(input())
        print(contador_de_canicas(numero_pisos))