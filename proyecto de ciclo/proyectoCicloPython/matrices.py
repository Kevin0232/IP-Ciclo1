print('Programa para sacar el promedio de numero menores en cada ila de una matriz y ver si es igual'
      ' a alguna dato en las esquinas de otra matriz')
prom=0; sum=0; menor=0;

A = []
B = []
print("Ingresar los elementos de la matriz A")
for i in range(0, 5):
    A.append([])
    for j in range(0, 5):
        pos = int(input("A[" + str(i) + "]["+str(j)+"]= "))
        A[i].append(pos)

print('\n')
print("Ingresar los elementos de la matriz B")
for i in range(0, 5):
    B.append([])
    for j in range(0, 5):
        pos = int(input("B[" + str(i) + "]["+str(j)+"]= "))
        B[i].append(pos)
print('--------------------------------------------------------')
print('Matriz A')
for i in range(0, 5):
    for j in range(0, 5):
        print(A[i][j], end='   ')
    print('  ')

print('\n')
print('------------------------------------------------------')
print('Matriz B')
for i in range(0, 5):
    for j in range(0, 5):
        print(B[i][j], end='   ')
    print('  ')

print('------------------------------------------------------')

print('Menores en matriz A')
for i in range(0, 5):
    menor = A[i][0]
    for j in range(0, 5):
        if menor > A[i][j]:
            menor = A[i][j]
    sum = sum + menor

print("SUMA DE MENORES "+ str(sum))
prom = int(sum/5)
print('El promedio de los menores de las filas de la matriz A es: '+ str(prom))
if prom == B[0][0] :
    print("El promedio de las filas de la matriz A es igual a la esquina en la poscición B[0][0]")

if(prom == B[0][4] ):
    print("El promedio de las filas de la matriz A es igual a la esquina en la poscición B[0][4]")

if(prom == B[4][0] ):
    print("El promedio de las filas de la matriz A es igual a la esquina en la poscición B[4][0]")

if(prom == B[4][4] ):
    print("El promedio de las filas de la matriz A es igual a la esquina en la poscición B[4][4]")

print('------------------------------------------------------')
sum = 0
print('Menores en matriz B')
for i in range(0, 5):
    menor = B[i][0]
    for j in range(0, 5):
        if menor > B[i][j]:
            menor = B[i][j]
    sum = sum + menor

print("SUMA DE MENORES "+ str(sum))
prom = int(sum/5)
print('El promedio de los menores de las filas de la matriz A es: '+ str(prom))
if prom == A[0][0] :
    print("El promedio de las filas de la matriz A es igual a la esquina en la poscición A[0][0]")

if(prom == A[0][4] ):
    print("El promedio de las filas de la matriz A es igual a la esquina en la poscición A[0][4]")

if(prom == A[4][0] ):
    print("El promedio de las filas de la matriz A es igual a la esquina en la poscición A[4][0]")

if(prom == A[4][4] ):
    print("El promedio de las filas de la matriz A es igual a la esquina en la poscición A[4][4]")
