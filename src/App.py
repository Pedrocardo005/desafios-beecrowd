def resolve_question(parametro: int):
    """
    >>> resolve_question(0)
    'vai ter copa!'
    >>> resolve_question(1)
    'vai ter duas!'
    >>> resolve_question(0)
    'vai ter copa!'
    >>> resolve_question(2)
    'vai ter duas!'
    >>> resolve_question(100)
    'vai ter duas!'
    >>> resolve_question(0)
    'vai ter copa!'
    """
    if parametro > 0:
        return "vai ter duas!"
    else:
        return "vai ter copa!"


try:
    while True:
        valor = int(input())

        print(resolve_question(valor))
except:
    ...

# if __name__ == "__main__":
#    import doctest

#    doctest.testmod()
