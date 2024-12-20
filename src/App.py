

def resolve_question(dados: str):
    """
    >>> resolve_question('100 150 1.0 0')
    '51 anos.'
    >>> resolve_question('90000 120000 5.5 3.5')
    '16 anos.'
    >>> resolve_question('56700 72000 5.2 3.0')
    '12 anos.'
    >>> resolve_question('123 2000 3.0 2.0')
    'Mais de 1 seculo.'
    >>> resolve_question('100000 110000 1.5 0.5')
    '10 anos.'
    >>> resolve_question('62422 484317 3.1 1.0')
    '100 anos.'
    """

    valores = dados.split(' ')
    pa = int(valores[0])  # População A
    pb = int(valores[1])  # População B
    g1 = float(valores[2])  # Taxa de crescimento A (%)
    g2 = float(valores[3])  # Taxa de crescimento B (%)

    anos = 0
    while pa <= pb:
        # Atualiza populações com as taxas de crescimento
        pa += int(pa * (g1 / 100))
        pb += int(pb * (g2 / 100))

        anos += 1

        # Limita o número de anos a 100
        if anos > 100:
            return 'Mais de 1 seculo.'

    return f'{anos} anos.'


x = int(input())
for _ in range(0, x):
    valor = input()
    print(resolve_question(valor))

# if __name__ == "__main__":
#    import doctest
#    doctest.testmod()
