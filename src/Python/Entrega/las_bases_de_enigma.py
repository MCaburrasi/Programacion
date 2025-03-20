from string import ascii_uppercase
from string import ascii_lowercase
from string import ascii_letters
from random import randint
ALFABETO = ascii_uppercase

print('Cifrado César con clave de letra')
print('----------------------------------')
print('')

#Se asegura que la elección sea válida
eleccion = 'i'
primero = True
while eleccion not in 'Ss':
    if not primero:
        #Se asegura que pongas una clase válida
        print('Especifica la letra clave o -1 para generarla aleatoriamente')
        while True:
            clave = input('> ').upper()
            if clave in ascii_letters or clave == '-1': break
            print('Clave no válida, intenta de nuevo.')
                
        #Randomiza una letra si la clave es -1
        if clave == '-1':
            clave = ALFABETO[randint(0,25)]
        print(f'Clave utilizada: {clave}')
        palabra = input('Ingrese el mensaje a cifrar\n> ')
        clave_numerica = ALFABETO.find(clave)


        palabra_cifrada = ''
        for letra in palabra:
            indice_inicial = ALFABETO.find(letra.upper())

                #Cifrar
            if eleccion in 'Cc':
                if indice_inicial + clave_numerica > 25:
                    indice = (indice_inicial + clave_numerica) - 26
                else:
                    indice = indice_inicial + clave_numerica
                letra_a_añadir = ALFABETO[indice]

                #Descifrar
            elif eleccion in 'Dd':
                if indice_inicial - clave_numerica < 0:
                    indice = (indice_inicial - clave_numerica) + 26
                else:
                    indice = indice_inicial - clave_numerica
                letra_a_añadir = ALFABETO[indice]
                
            #Comprueba que la letra que va a sustituir se mantenga de forma adecuada
            #(que no cambie letras minusculas a mayusculas o se coma simbolos como espacios y comas)
            if letra in ascii_lowercase:
                letra_a_añadir = letra_a_añadir.lower()
            elif letra not in ascii_letters:
                letra_a_añadir = letra
            palabra_cifrada = palabra_cifrada + letra_a_añadir

        print(f"Mensaje {'cifrado' if eleccion in 'Cc' else 'descifrado'}: ")
        print(f'{palabra_cifrada}')
        print('')    
    while True:
        eleccion = input('¿Quieres (c)ifrar, (d)escifrar o (s)alir?\n> ')
        if eleccion in 'SsCcDd': break
        print('Opción no válida, intenta de nuevo.')
        print('')
    primero = False
print('¡Hasta luego!')