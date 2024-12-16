reguas = input()

valores = reguas.split(' ')

soma = 0

for valor in valores:
    soma += int(valor)

soma -= 3

print(soma)
