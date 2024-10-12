tipo_char = int(input())

respostas_competidores = input()

acertos = 0

for valor in respostas_competidores.split(' '):
    if int(valor) == tipo_char:
        acertos += 1

print(acertos)
