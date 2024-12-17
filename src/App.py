

def resolve_question(salario: float):
    """
    >>> resolve_question(3002.00)
    'R$ 80.36'
    >>> resolve_question(1701.12)
    'Isento'
    >>> resolve_question(4520.00)
    'R$ 355.60'
    """

    if salario <= 2000:
        return "Isento"

    if salario <= 3000:
        salario -= 2000
        imposto = salario * 0.08
        formatted_number = "%.2f" % imposto
        return f'R$ {formatted_number}'

    if salario <= 4500:
        salario -= 2000
        imposto_1 = 80.00
        salario -= 1000
        imposto_2 = salario * 0.18
        impostos = imposto_1 + imposto_2
        formatted_number = "%.2f" % impostos
        return f'R$ {formatted_number}'

    if salario > 4500:
        salario -= 2000
        imposto_1 = 80.00
        salario -= 1000
        imposto_2 = 1500 * 0.18
        salario -= 1500
        imposto_3 = salario * 0.28
        impostos = imposto_1 + imposto_2 + imposto_3
        formatted_number = "%.2f" % impostos
        return f'R$ {formatted_number}'


valor = float(input())
print(resolve_question(valor))
