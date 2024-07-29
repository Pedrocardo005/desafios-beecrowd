t = float(input())
lista = [t]

print('N[0] = {:.4f}'.format(lista[0]))

for x in range(1, 100):
    half = lista[x - 1] / 2
    print('N[{}] = {:.4f}'.format(x, half))
    lista.append(half)
