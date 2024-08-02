linha_operacao = int(input())
operacao = input()

lista = [None] * 12

resultado = 0

for x in range(0, 12):
    lista[x] = [None] * 12

for linha in range(0, 12):
    for coluna in range(0, 12):
        lista[linha][coluna] = float(input())

if operacao == 'S':
    for coluna in range(0,12):
        resultado += lista[linha_operacao][coluna]

else:
    for coluna in range(0,12):
        resultado *= lista[linha_operacao][coluna]

print('{:.1f}'.format(resultado))