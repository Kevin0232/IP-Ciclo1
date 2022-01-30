def Simetrica(B,m):
    sim = True
    for i in range(0,m):
        for j in range(0,m):
            if B[i][j] != B[j][i]:
                sim = False
                i=m
                break
    return sim

n= int(input("Ingrese el tamaño de la matriz cuadrada: "))
A=[]
print("Ingresar datos de la matriz A")
for i in range(0,n):
    A.append([])
    for j in range(0,n):
        a = int(input("A[" + str(i) + "][" + str(j) + "]: "))
        A[i].append(a)
cont = Simetrica(A,n)
if cont == True:
    print("La matriz es simetrica")
else:
    print("La matriz no es simetrica")
