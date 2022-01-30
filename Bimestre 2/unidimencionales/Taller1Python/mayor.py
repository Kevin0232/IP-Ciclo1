n = int(input("Ingrese el tamaño del vector: "))
# Declarar el vector
A=[]
for i in range(0,n):
    a = int(input("Ingrese el elemento A["+str(i)+"]: "))
    A.append(a)
    if i==0:
        mayor = A[i]
    if mayor < A[i]:
        mayor = A[i]
print("El número mayor del vector A es: "+str(mayor))