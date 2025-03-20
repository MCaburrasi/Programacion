palabras = ['hola', 'sol', 'america', 'comprender', 'siete', 'si', 'a', 'aorta']
vocales = ['a', 'e', 'i', 'o', 'u']
empieza_vocal = [palabra for palabra in palabras if palabra[0] in vocales]
print(empieza_vocal)