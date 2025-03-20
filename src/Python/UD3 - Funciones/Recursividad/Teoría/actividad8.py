def euclides(a,b):
    if b == 0:
        return a
    return euclides(b, a%b)

if __name__ == '__main__':
    a, b = [int(num) for num in input().split(' ')]
    print(euclides(a, b))
