n = int(input("Ingrese el tamaño de la matriz cuadrada: "))
A = []
print("Ingresar los elementos de la matriz A")
for i in range(0, n):
    A.append([])
    for j in range(0, n):
        pos = int(input("A[" + str(i) + "]["+str(j)+"]= "))
        A[i].append(pos)
print('Matriz A Original')
for i in range(0, n):
    for j in range(0, n):
        print(A[i][j], end='   ')
    print('  ')

print('---------------------------------------')
print('Matriz donde pares son 0')
for i in range(0, n):
    for j in range(0, n):
        if (A[i][j]) % 2 == 0:
            A[i][j] = 0
for i in range(0, n):
    for j in range(0, n):
        print(A[i][j], end='   ')
    print('  ')

print('---------------------------------------')
print('Matriz donde se remplaza i o j')
for i in range(0, n):
    for j in range(0, n):
        if (i == (n-1)) or (j == (n-1)):
            A[i][j] = 1
for i in range(0, n):
    for j in range(0, n):
        print(A[i][j], end='   ')
    print('  ')