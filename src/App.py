t = int(input())
lista = []
contagem = 0

for x in range(0, 1000):
    if contagem >= t:
        contagem = 0
    lista.append(contagem)
    contagem += 1

for y in range(0, 1000):
    print('N[{}] = {}'.format(y, lista[y]))
