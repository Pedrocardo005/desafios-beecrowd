listagem = []
negativos_ou_zero = []

for x in range(0, 100):
    numero = float(input())
    listagem.append(numero)

    if numero <= 10:
        negativos_ou_zero.append(x)

for n in negativos_ou_zero:
    print('A[{}] = {}'.format(n, listagem[n]))
    