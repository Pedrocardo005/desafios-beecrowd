a = int(float(input()))
n = 0
while True:
    n = int(float(input()))

    if n > 0:
        break
somatorio = 0
for x in range(0, n):

    somatorio = somatorio + a + x

print(somatorio)