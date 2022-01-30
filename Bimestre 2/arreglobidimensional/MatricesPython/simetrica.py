n = int(input("Ingrese el tamaño de la matriz cuadrada: "))
A = []
simetrica = True
print("Ingresar los elementos de la matriz A")
for i in range(0, n):
    A.append([])
    for j in range(0, n):
        pos = int(input("A[" + str(i) + "]["+str(j)+"]= "))
        A[i].append(pos)
print('Matriz A')
for i in range(0, n):
    for j in range(0, n):
        print(A[i][j], end='   ')
    print('  ')

for i in range(0, n):
    for j in range(0, n):
        if A[i][j] != A[j][i]:
            simetrica = False
            i = n
            break
if simetrica == True:
    print("La matriz es simetrica")
else:
    print("La matriz no es simetrica")