n = int(input())

linha = input()

numeros = linha.split(' ')

menor_valor = 9999999
posicao_menor = 0

for x in range(0, len(numeros)):
    numero = int(numeros[x])
    if numero < menor_valor:
        menor_valor = numero
        posicao_menor = x

print('Menor valor: {}'.format(menor_valor))
print('Posicao: {}'.format(posicao_menor))
