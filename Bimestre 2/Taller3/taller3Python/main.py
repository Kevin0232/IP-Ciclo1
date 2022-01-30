n = int(input("Ingrese el tamaño en filas de la matriz A y B: "))
m = int(input("Ingrese el tamaño en columnas de la matriz A y B: "))
A=[]
B=[]
C=[]
# Ingresar vector A
print("\nINGRESAR DATOS DE LA MATRIZ A")
for i in range(0,n):
    A.append([])
    for j in range(0,m):
        a = int(input("A ["+str(i)+"] ["+str(j)+"] = "))
        A[i].append(a)

# Ingresar vector B
print("\nINGRESAR DATOS DE LA MATRIZ B")
for i in range(0,n):
    B.append([])
    for j in range(0,m):
        b = int(input("A ["+str(i)+"] ["+str(j)+"] = "))
        B[i].append(b)

print("Matriz A")
for i in range(0,n):
    for j in range(0,m):
        print( str(A[i][j]) +'   ',end=' ')
    print('')

print("Matriz B")
for i in range(0,n):
    for j in range(0,m):
        print( str(B[i][j]) +'   ',end=' ')
    print('')

print("Matriz C")
for i in range(0,n):
    C.append([])
    for j in range(0,m):
        c = int(A[i][j]) + int(B[i][j])
        C[i].append(c)
for i in range(0,n):
    for j in range(0,m):
        print( str(C[i][j]) +'   ',end=' ')
    print('')
