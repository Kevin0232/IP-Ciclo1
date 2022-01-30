n = int(input("Ingrese el tamaño del vector: "))
num = int(input("Ingrese un número entero: "))
cont=0
# Declarar el vector
A=[]
for i in range(0,n):
    a = int(input("Ingrese el elemento A["+str(i)+"]: "))
    A.append(a)
    if A[i] == num:
        cont = cont + 1
for i in range(0,n):
    if A[i] == num:
        print("El número entero "+str(num)+" se ha repetido en la posición: A["+str(i)+"]")
print("El número entero " +str(num)+ " se ha repetido "+str(cont)+" veces.")