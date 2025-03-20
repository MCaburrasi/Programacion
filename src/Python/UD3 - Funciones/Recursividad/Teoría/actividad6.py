def sumar(num):
    if num == 0:
        return 0
    return (num%10) + sumar(num//10)

if __name__ == '__main__':
    num = int(input('Numero: '))
    print(sumar(num))