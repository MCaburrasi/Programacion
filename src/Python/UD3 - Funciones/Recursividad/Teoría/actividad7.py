def es_palindromo(cadena):
    if cadena == '':
        return True
    if cadena[0] != cadena[-1]:
        return False
    return es_palindromo(cadena[1:-1])

if __name__ == '__main__':
    palabra = input('Palabra: ')
    print(es_palindromo(palabra))