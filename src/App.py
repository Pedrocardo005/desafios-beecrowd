def resolve_question(valor_matriz: int):
    """
    >>> resolve_question(1)
    1
    >>> resolve_question(2)
    1 2
    2 4
    >>> resolve_question(3)
    1  2  4
    2  4  8
    4  8 16
    >>> resolve_question(4)
    1  2  4  8
    2  4  8 16
    4  8 16 32
    8 16 32 64
    >>> resolve_question(5)
    1   2   4   8  16
    2   4   8  16  32
    4   8  16  32  64
    8  16  32  64 128
    16  32  64 128 256
    """
    matriz = [[None] * valor_matriz] * valor_matriz

    initial_x = 1
    for x in range(0, valor_matriz):
        initial_y = initial_x
        for y in range(0, valor_matriz):
            matriz[x][y] = str(initial_y)
            initial_y += initial_y
        initial_x += initial_x

    for x in range(0, valor_matriz):
        print(" ".join(matriz[x]))

    print()


while True:
    valor = int(input())
    if valor != 0:
        resolve_question(valor)
    else:
        break

# if __name__ == "__main__":
#     import doctest
#     doctest.testmod()
