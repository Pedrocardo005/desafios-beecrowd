vector_len = int(input())

less = 9999
less_index = 0

vector = input()
vector = vector.split(' ')

for index, value in enumerate(vector):
    try:
        read = int(value)
    except ValueError:
        continue

    if read < less:
        less = read
        less_index = index

print(f'Menor valor: {less}')
print(f'Posicao: {less_index}')
