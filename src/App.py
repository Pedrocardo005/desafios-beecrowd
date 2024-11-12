op = input()

matriz = [None] * 12

saida = 0.0

for index, element in enumerate(matriz):
    matriz[index] = [None] * 12

for line_index, element in enumerate(matriz):
    for col_index, element in enumerate(matriz):
        leitura = float(input())
        matriz[line_index][col_index] = leitura
        if line_index < 6 and line_index + col_index > 11:
            saida += leitura
        elif line_index >= 6 and col_index - line_index > 0:
            saida += leitura

if op == 'M':
    saida /= 30

print(round(saida, 1))
