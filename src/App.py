par = []
impar = []

for x in range(0, 15):
    n = int(input())

    if n % 2 == 0:
        par.append(n)
    else:
        impar.append(n)

    if len(par) >= 5:
        for idx, value in enumerate(par):
            print('par[{}] = {}'.format(idx, value))
        par = []

    elif len(impar) >= 5:
        for idx, value in enumerate(impar):
            print('impar[{}] = {}'.format(idx, value))
        impar = []

for idx, value in enumerate(impar):
    print('impar[{}] = {}'.format(idx, value))

for idx, value in enumerate(par):
    print('par[{}] = {}'.format(idx, value))

