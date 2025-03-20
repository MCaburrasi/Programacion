def reverse_maker(numero):
    resultado = 0
    digitos = len(str(numero)) - 1
    while numero != 0:
        resultado += (numero % 10) * 10 ** digitos
        numero = numero // 10
        digitos -= 1
    return resultado

def es_reversible(anverso):
    reversible = True
    reverso = reverse_maker(anverso)
    for _ in (str(anverso)):

        digito_anverso = anverso % 10
        digito_reverso = reverso % 10

        anv_par = digito_anverso % 2 == 0
        rev_par = digito_reverso % 2 == 0


        if rev_par == anv_par or len(str(reverso)) != len(str(anverso)):
            reversible = False
            break
    return reversible
    
def contador_digitos(digitos):
    cantidad_reversibles = 0
    for numero in range(10 ** (digitos-1), (10 ** digitos)):
        reversible = es_reversible(numero)
        if reversible:
            cantidad_reversibles += 1
    return cantidad_reversibles

if __name__ == "__main__":
    print(contador_digitos(2))