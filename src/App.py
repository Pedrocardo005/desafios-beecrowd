operacao = input()

lista = [None] * 12

resultado = 0

for x in range(0, 12):
    lista[x] = [None] * 12

for linha in range(0, 12):
    for coluna in range(0, 12):
        lista[linha][coluna] = float(input())
distancia = 0
for linha in range(0,12):
    for coluna in range(0, distancia):
        resultado += lista[linha][coluna]

    distancia += 1

if operacao == 'S':
    pass

elif operacao == 'M':
    resultado /= 66

print('{:.1f}'.format(resultado))