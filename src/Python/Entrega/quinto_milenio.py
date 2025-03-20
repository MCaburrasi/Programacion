iteraciones = int(input(""))
for i in range(iteraciones):
    titular = input("").lower()
    mensaje = input("").lower().split(" ")
    mensaje = ''.join(mensaje)
    resultado = "SI"
    pos = 0
    for letra in mensaje:
        indice = titular.find(letra,pos)
        if indice == -1:
            resultado = "NO"
            break
        pos = indice
        
    print(resultado)
        