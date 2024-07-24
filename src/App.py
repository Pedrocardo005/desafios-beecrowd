listagem = input()

numeros = listagem.split(' ')

a = int(numeros[0])

del numeros[0]

n = 0

for num in numeros:
    current_num = int(num)
    if current_num > 0:
        n = current_num
        break

somatorio = 0
for x in range(0, n):

    somatorio = somatorio + a + x

print(somatorio)