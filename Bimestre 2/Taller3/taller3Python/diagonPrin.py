n = int(input("Ingrese el tamaño de la matriz cuadrada: "))
A=[]
for i in range(0,n):
    A.append([])
    for j in range(0,n):
        a = int(input("A ["+str(i)+"] ["+str(j)+"] = "))
        A[i].append(a)
print("Matriz A")
for i in range(0,n):
    for j in range(0,n):
        print( str(A[i][j]) +'   ',end=' ')
    print('')
print("ELEMENTOS ENCIMA DE LA DIAGONAL REEMPLAZADOS")
for i in range(0,n):
    for j in range(0,n):
        if i<j:
            A[i][j] = 0

for i in range(0,n):
    for j in range(0,n):
        print( str(A[i][j]) +'   ',end=' ')
    print('')