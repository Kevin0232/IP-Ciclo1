#inicializar variables
suma = int(0)
i = int(1)
#datos de entrada
while i <= 999:
    if i%3 ==0 or i%5 == 0:
        suma = suma + i
    i = i + 1
print(suma)
