def inv(cadena):
    if cadena == '':
        return ''
    return cadena[-1] + inv(cadena[:-1])

if __name__ == '__main__':
    cadena = input('Cadena: ')
    print(inv(cadena))