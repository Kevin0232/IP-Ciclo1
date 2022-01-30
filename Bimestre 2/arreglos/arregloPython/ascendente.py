n = int(input('Ingrese el tamaño del vector: '))
A=[]
aux=0
print("Ingrese los elementos del vector")
for i in range(0,n):
    a = int(input("A[" +str(i)+ "]: "))
    A.append(a)
# presentar vector
print('Vector A')
for i in range(0,n):
    print(str(A[i]) +'  ',end='')
print(' ')
# ordenar el vector ascendente
for i in range(0,n):
    for j in range(i+1, n):
        if A[i]>A[j]:
            aux = A[i]
            A[i] = A[j]
            A[j] = aux
# Presentar el vector ordenado
print("--VECTOR ORDENADO ASCENDENTE---")
for i in range(0,n):
    print("A[" +str(i)+ "]: " +str(A[i]))
# ordenar el vector descendente
for i in range(0,n):
    for j in range(i+1, n):
        if A[i]<A[j]:
            aux = A[i]
            A[i] = A[j]
            A[j] = aux
# Presentar el vector ordenado
print("--VECTOR ORDENADO DESCENDENTE---")
for i in range(0,n):
    print("A[" +str(i)+ "]: " +str(A[i]))
