x = int(input())
vetor = [0, 0,0,0,0,0,0,0,0,0]

vetor[0] = x

for n in range(1, 10):
    vetor[n] = vetor[n - 1] * 2

for n in range(0, 10):
    print('N[{}] = {}'.format(n, vetor[n]))
