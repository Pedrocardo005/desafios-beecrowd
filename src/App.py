numeros = int(input())

for number in range(0, numeros):
    n = int(input())
    soma = 0
    for x in range(1, n):
        if n % x == 0:
            soma += x

    if soma == n:
        print(n,'eh perfeito')
    else:
        print(n,'nao eh perfeito')numeros = int(input())

for number in range(0, numeros):
    n = int(input())
    soma = 0
    for x in range(1, n):
        if n % x == 0:
            soma += x

    if soma == n:
        print(n,'eh perfeito')
    else:
        print(n,'nao eh perfeito')