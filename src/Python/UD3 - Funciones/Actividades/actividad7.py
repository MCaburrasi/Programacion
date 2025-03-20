def dibujar_rectangulo(anchura, altura, caracter):
    for _ in range(altura):
        print((caracter + " ") * anchura)

if __name__ == "__main__":

    anchura = int(input("Anchura del rectangulo: "))
    altura = int(input("Altura del rectangulo: "))
    caracter = input("Carácter a utilizar: ")

    dibujar_rectangulo(anchura, altura, caracter)