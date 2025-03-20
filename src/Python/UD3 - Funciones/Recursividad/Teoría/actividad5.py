def contar(num):
    if num == 0:
        return 0
    return 1 + contar(num//10)

if __name__ == '__main__':
    num = int(input('Numero: '))
    print(contar(num))