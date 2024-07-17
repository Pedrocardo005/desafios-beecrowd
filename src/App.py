def adicao(n1:int, d1:int, n2:int, d2:int):
    numerador = (n1 * d2 + n2 * d1)
    denominador = d1 * d2
    return '{}/{}'.format(numerador, denominador)

def subtracao(n1:int, d1:int, n2:int, d2:int):
    ...

def multiplicacao(n1:int, d1:int, n2:int, d2:int):
    ...

def divisao(n1:int, d1:int, n2:int, d2:int):
    ...

def transform(elementos: list):
    n1 = int(elementos[0])
    d1 = int(elementos[2])
    n2 = int(elementos[4])
    d2 = int(elementos[6])

    return [n1, d1, n2, d2]

def simplificar(resultado: str):
    ...

x = int(input())

lista = []

for n in range(0, x):
    leitura = input()
    """
    elementos[0] numerador
    elementos[1] barra
    elementos[2] denominador
    elementos[3] operação
    elementos[4] numerador 2
    elementos[5] barra
    elementos[6] denominador 2
    """
    elementos = leitura.split(' ')
    n1, d1, n2, d2 = transform(elementos)

    if elementos[3] == '+':
        resultado = adicao(n1, d1, n2, d2)
    
    elif elementos[3] == '-':
        resultado = subtracao(n1, d1, n2, d2)

    elif elementos[3] == '*':
        resultado = multiplicacao(n1, d1, n2, d2)

    elif elementos[3] == '/':
        resultado = divisao(n1, d1, n2, d2)
