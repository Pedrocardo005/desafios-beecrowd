numeros = int(input())

for number in range(0, numeros):
    n = int(input())
    divisores = 0
    for x in range(1, n + 1):
        if n % x == 0:
            divisores += 1

    if divisores == 2:
        print(n,'eh primo')
    else:
        print(n,'nao eh primo')