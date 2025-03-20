vocales = ['a', 'e', 'i', 'o', 'u']
frase = "Hola mundo desde python"
vocales = [letra for letra in frase if letra in vocales]
print(vocales)