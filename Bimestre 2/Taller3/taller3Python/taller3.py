n = int(input("Ingrese el tamaño en filas de la matriz: "))
m = int(input("Ingrese el tamaño en columnas de la matriz: "))
A=[]
for i in range(0,n):
    A.append([])
    for j in range(0,m):
        a = int(input("A ["+str(i)+"] ["+str(j)+"] = "))
        A[i].append(a)
print("Matriz Original")
for i in range(0,n):
    for j in range(0,m):
        print( str(A[i][j]) +'   ',end=' ')
    print('')
print("Matriz Invertida")
for j in range(0,m):
    for i in range(0,n):
        print(str(A[i][j]) +'   ',end=' ')
    print('')