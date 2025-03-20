def pin_counter(row_num):
    if row_num == 1:
        return 1
    return row_num + pin_counter(row_num - 1)

if __name__ == '__main__':
    iterations = int(input(''))
    for iteration in range(iterations):
        row_num = int(input(''))
        print(pin_counter(row_num))
        