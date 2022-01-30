
n = int(input("Ingrese el número de filas: "))
m = int(input("Ingrese el número de columnas: "))
A = []
B = []
print("Ingresar los elementos de la matriz A")
for i in range(0, n):
    A.append([])
    for j in range(0, m):
        pos = int(input("A[" + str(i) + "]["+str(j)+"]= "))
        A[i].append(pos)

print('\n')
print("Ingresar los elementos de la matriz B")
for i in range(0, n):
    B.append([])
    for j in range(0, m):
        pos = int(input("A[" + str(i) + "]["+str(j)+"]= "))
        B[i].append(pos)
print('--------------------------------------------------------')
print('Matriz A')
for i in range(0, n):
    for j in range(0, m):
        print(A[i][j], end='   ')
    print('  ')

print('\n')
print('------------------------------------------------------')
print('Matriz B')
for i in range(0, n):
    for j in range(0, m):
        print(B[i][j], end='   ')
    print('  ')