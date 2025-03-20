iterations = int(input(''))
for iteration in range(iterations):
    people = int(input(''))
    seats = [int(num) for num in input('').split(' ')]
    count = 0
    backdoor = True
    odd_was_last = False
    for seat in seats:
        if seat % 2 != 0:
            odd_was_last = True
            count += 1
        elif seat % 2 == 0 and odd_was_last:
            backdoor = False
    if backdoor:
        print(f'Si {count}')
    else:
        print('NO')