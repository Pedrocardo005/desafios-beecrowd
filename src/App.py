correto = int(input())

linha = input()
numeros = linha.split(" ")

corretos = 0

for numero in numeros:
    if int(numero) == correto:
        corretos += 1

print(corretos)
