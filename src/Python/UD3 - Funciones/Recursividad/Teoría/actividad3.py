def potencia(b,e):
    if e == 0:
        return 1     
    return b * potencia(b,e - 1)

if __name__ == '__main__':
    b, e = map(int, input('Base, exponente: ').split(' '))
    print(potencia(b,e))