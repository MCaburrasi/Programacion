def dibuja_hexagono(numero, caracter):
    piso = numero + numero
    dibujo = numero * caracter
    contador = numero

    for linea in range(numero + (numero - 1)):
        print(f"{dibujo: ^{piso*2-1}}")
        
        if linea + 1 < numero:
            dibujo += caracter * 2
            contador += 2
        else:
            contador = (contador - 2)
            dibujo = contador * caracter

        
if __name__ == "__main__":

    lado = int(input("Lado: "))
    caracter = input("Caracter: ")

    dibuja_hexagono(lado, caracter)