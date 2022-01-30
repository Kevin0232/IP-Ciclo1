# Inicialización de variables
i = int(1)
suma = int(0)
# Proceso
n = int(input("Ingrese el número del ciclo: "))
while i <= n:
    suma = suma + i
    print(i)
    i = i + 1
print("i es: ", i)
print("La suma es: ",suma)
j = n
suma = int(0)
while j >= 1:
    suma = suma + j
    print(j)
    j = j - 1
print("i es: ", j)
print("La suma es: ",suma)