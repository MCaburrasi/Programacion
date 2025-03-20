n = int(input(''))
m = int(input(''))
test_cases = int(input())
user_inputs = [input() for _ in range(test_cases)]
rows = [0 for _ in range(n)]
columns = [0 for _ in range(m)]

for action in user_inputs:
    if action.startswith('R') and int(action[-1]) <= len(rows) :
        if rows[int(action[-1]) - 1] == 0: rows[int(action[-1]) - 1] = 1
        else: rows[int(action[-1]) - 1] = 0 
    elif action.startswith('C') and int(action[-1]) <= len(columns):
        if columns[int(action[-1]) - 1] == 0: columns[int(action[-1]) - 1] = 1
        else: columns[int(action[-1]) - 1] = 0 
    user_inputs.remove(action)

golden_squares = (sum(rows) * m) + (sum(columns) * n) - 2 * sum(rows) * sum(columns)
print(golden_squares)
