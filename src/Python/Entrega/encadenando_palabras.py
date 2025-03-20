cadena = "Hello"
while cadena != "salir":
    cadena = input().split(" ")
    encadenado = True
    palabra_anterior = ""
    primera_palabra = True

    for palabra in cadena:

        if primera_palabra:
            primera_palabra = False
        elif palabra_anterior[-2:] != palabra[:2]:
            encadenado = False
        palabra_anterior = palabra
        
    print(f"{'SI' if encadenado else 'NO'}")
