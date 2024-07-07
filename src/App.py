x = [None] * 10

for number in range(0, 10):
    valor = int(input())

    if valor < 1:
        valor = 1
    x[number] = valor
    print(f'X[{number}] = {x[number]}')
