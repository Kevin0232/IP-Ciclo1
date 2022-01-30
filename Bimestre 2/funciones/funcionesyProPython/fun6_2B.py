def BuscarVector(B,num,n):
    cont=0
    for i in range(0,n):
        if B[i] == num:
            cont = cont + 1
    return cont
print("Funcion que permita encontrar cuantas veces se repite un número en un vector ")
n = int(input('Ingrese el tamaño del vector: '))

A = []
for i in range(0, n):
    a = int(input("Ingrese el elemento A["+str(i)+"]= "))
    A.append(a)

num = int(input("Ingrese el elemento a buscar en el vector: "))
cont = BuscarVector(A,num,n)
print("El número "+str(num) + " se ha encontrado "+ str(cont) + " veces en el vector.")
for i in range(0,n):
    print(A[i])

