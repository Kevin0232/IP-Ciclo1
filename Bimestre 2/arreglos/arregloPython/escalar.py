n = int(input('Ingrese el tamaño del vector: '))
escalar = int(input('Ingrese el escalar a multiplicar: '))
A=[]
B=[]

for i in range(0,n):
    a = int(input("Ingrese el numero del vector A[" +str(i)+ "]: "))
    A.append(a)
for i in range(0, n):
    b = int(A[i]) * escalar
    B.append(b)
print("------------------------")
for i in range(0, n):
    print("El vector A[" + str(i) + "] es: " +str(A[i]))
print("------------------------")
for i in range(0,n):
    print("El vector B[" + str(i) + "] es: " + str(B[i]))