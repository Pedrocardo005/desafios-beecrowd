operacao = input()

lista = [None] * 12

resultado = 0

for x in range(0, 12):
    lista[x] = [None] * 12

for linha in range(0, 12):
    for coluna in range(0, 12):
        lista[linha][coluna] = float(input())

begin = 0
end = 0
somatorio = 1
for linha in range(0,12):

    if linha == 5 or linha == 6:
        somatorio = 0
    elif linha == 6:
        somatorio = -1
    for coluna in range(begin, end):
        resultado += lista[linha][coluna]

    end += somatorio

if operacao == 'S':
    pass

elif operacao == 'M':
    resultado /= 30

print('{:.1f}'.format(resultado))