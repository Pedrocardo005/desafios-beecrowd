operacao = input()

lista = [None] * 12

resultado = 0

for x in range(0, 12):
    lista[x] = [None] * 12

for linha in range(0, 12):
    for coluna in range(0, 12):
        lista[linha][coluna] = float(input())

begin = 12
end = 0
for linha in range(0,12):

    if end - begin < 2:
        break
    for coluna in range(begin, end):
        resultado += lista[linha][coluna]

    begin -= 1
    end += 1

if operacao == 'S':
    pass

elif operacao == 'M':
    resultado /= 30

print('{:.1f}'.format(resultado))