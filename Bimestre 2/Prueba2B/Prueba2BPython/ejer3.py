A=[]
B=[]
suma=0
print("Ingresar datos de la matriz A")
for i in range(0,5):
    A.append([])
    for j in range(0,5):
        a = int(input("A[" + str(i) + "][" + str(j) + "]: "))
        A[i].append(a)
print("\nIngresar datos de la matriz A")
for i in range(0,5):
    B.append([])
    for j in range(0,5):
        b = int(input("B[" + str(i) + "][" + str(j) + "]: "))
        B[i].append(b)

print("\nMatriz A")
for i in range(0,5):
    for j in range(0,5):
        print(str(A[i][j]), end='     ')
    print(' ')

print("\nMatriz B")
for i in range(0,5):
    for j in range(0,5):
        print(str(A[i][j]), end='     ')
    print(' ')

# diagonal secundaria A
for i in range(0,5):
    for j in range(0,5):
        if(i+j)== (5-1):
            suma = suma + A[i][j]
prom1 = int(suma/5)
# diagonal secundaria B
suma1=0
for i in range(0,5):
    for j in range(0,5):
        if(i+j) == (5-1):
            suma1 = suma1 + B[i][j]
prom2 = int(suma1/5)
print('---------------------------')
if prom1 == prom2:
    print("Ambas matrices tienen el mismo promedio en sus diagonales secundarias.")
    print("suma matriz A=" + str(suma))
    print("promedio matriz A= " + str(prom1))
    print("suma matriz B=" + str(suma1))
    print("promedio matriz B= " + str(prom2))
else:
    print("La matriz A y la Matriz B tienen diferentes promedios en sus diagonales secundarias.")
    print("suma matriz A=" + str(suma))
    print("promedio matriz A= " + str(prom1))
    print("suma matriz B=" + str(suma1))
    print("promedio matriz B= " + str(prom2))

