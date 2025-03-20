from math import isqrt
def erasthonenes_cribe(num):
    prime_num = [num for num in range(num)]
    prime_num.remove(0)
    prime_num.remove(1)
    for i in range(2, isqrt(num) - 1):
        for j in prime_num:
            if i != j and j%i == 0:
                prime_num.remove(j)
    return prime_num

if __name__ == '__main__':
    num = int(input(''))
    prime_nums = erasthonenes_cribe(num + 1)
    for prime in prime_nums:
        first_num = num - prime
        if first_num in prime_nums:
            break
    if first_num not in prime_nums:
        print('NO')
    else:
        print(prime, first_num)