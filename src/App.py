def fibonacci(n):
    if n <= 0:
        return 0
    if n == 1:
        return 1
    if n == 2:
        return 1
    resposta = fibonacci(n - 1) + fibonacci(n - 2)
    return resposta

valor = int(input())

for x in range(0, valor):
    _valor = int(input())
    r = fibonacci(_valor)
    print('Fib({}) = {}'.format(_valor, r))
