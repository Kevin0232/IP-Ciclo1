A=[]
B=[]
for i in range(0,5):
    a = int(input("Ingrese el elemento A["+str(i)+"]: "))
    A.append(a)
for i in range(0,5):
    b = int(input("Ingrese el elemento B["+str(i)+"]: "))
    B.append(b)

# Comparar ambos vectores
for i in range(0,5):
    if A[i] == B[i]:
        print("El vector A y B en la posición "+str(i)+" tienen el mismo número ("+str(A[i])+")")
    else:
        print("El vector A["+str(i)+"]"+" y el vector B ["+str(i)+"] no tienen el mismo número.")
        print("A = "+str(A[i])+" y B = "+str(B[i]))
