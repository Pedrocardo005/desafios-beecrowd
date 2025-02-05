def resolve_question(numero: int):
    """
    >>> resolve_question(1)
      1
    >>> resolve_question(2)
      1   2
      2   1
    >>> resolve_question(3)
      1   2   3
      2   1   2
      3   2   1
    >>> resolve_question(4)
      1   2   3   4
      2   1   2   3
      3   2   1   2
      4   3   2   1
    >>> resolve_question(5)
      1   2   3   4   5
      2   1   2   3   4
      3   2   1   2   3
      4   3   2   1   2
      5   4   3   2   1
    """
    matriz = [[None] * numero for _ in range(0, numero)]

    for x in range(0, numero):
        inc = False
        current_val = x + 1
        for y in range(0, numero):

            if current_val == 1:
                inc = True

            matriz[x][y] = current_val

            if inc:
                current_val += 1
            else:
                current_val -= 1

    for x in range(0, numero):
        for y in range(0, numero):
            if y == 0:
                print(f'  {matriz[x][y]}', end="")
            else:
                print(f'   {matriz[x][y]}', end="")

        print()


numeros = []

while True:
    n = int(input())

    if n != 0:
        numeros.append(n)

    else:
        break

[resolve_question(numero) for numero in numeros]

# if __name__ == "__main__":
#    import doctest
#    doctest.testmod()
