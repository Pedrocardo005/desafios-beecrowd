

def resolve_question(valor_matriz: int):
    """
    >>> resolve_question(4)
    1332
    3123
    3213
    2331
    >>> resolve_question(7)
    1333332
    3133323
    3313233
    3332333
    3323133
    3233313
    2333331
    """
    idx_um = 0
    idx_dois = valor_matriz - 1
    matriz = []
    for x in range(0, valor_matriz):
        matriz.append([])
        for y in range(0, valor_matriz):
            if y == idx_dois:
                matriz[x].append('2')
            elif y == idx_um:
                matriz[x].append('1')
            else:
                matriz[x].append('3')
        idx_um += 1
        idx_dois -= 1

    for linha in matriz:
        print(''.join(linha))


valor = int(input())
resolve_question(valor)

# if __name__ == "__main__":
#     import doctest
#     doctest.testmod()
