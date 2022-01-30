n = int(input("Ingrese el tamaño de la matriz cuadrada: "))
A = []
l=0
k=0
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
    menor = A[i][0]
    for j in range(0, n):
        if A[i][j]< menor:
            menor = A[i][j]
            k=i
            l=j

    print("El elemento menor de la fila " +str(i) + " es " +str(menor)+" y está en A["+str(i)+"]["+ str(l) +"]")
    k=0
    l=0
