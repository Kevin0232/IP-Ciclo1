print("---OPREACIONS SOBRE MATRICES CUADRADAS--")
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
print('Cambiar con 0 la diagonal principal')
for i in range(0, n):
    for j in range(0, n):
        if i == j:
            A[i][j] = 0
for i in range(0, n):
    for j in range(0, n):
        print(A[i][j], end='   ')
    print('  ')

print('---------------------------------------')
print('Cambiar con 0 la diagonal secundaria')
for i in range(0, n):
    for j in range(0, n):
        if (i + j) == (n-1):
            A[i][j] = 0
for i in range(0, n):
    for j in range(0, n):
        print(A[i][j], end='   ')
    print('  ')

print('---------------------------------------')
print('Cambiar esquinas')
A[0][0] = 99
A[0][n-1] = 99
A[n-1][0] = 99
A[n-1][n-1] = 99
for i in range(0, n):
    for j in range(0, n):
        print(A[i][j], end='   ')
    print('  ')
