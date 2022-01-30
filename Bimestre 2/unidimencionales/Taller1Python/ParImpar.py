n = int(input("Ingrese el límite de números a evaluar: "))
A=[]
np=0
ni=0
for i in range(0,n):
    a = int(input("Ingrese el elemento A["+str(i)+"]: "))
    A.append(a)
    if A[i]%2 == 0:
        np = np + 1
    else:
        ni = ni+1
# Presentar cada elemento de A
print('VECTOR A')
for i in range(0,n):
    print('A['+str(i)+']'+str(A[i]))
# Declarar el vector Par e Impar
Par=[]
Impar=[]
j=0
for i in range(0,n):
    if A[i] % 2 == 0:
        p = A[i]
        Par.append(p)
        j = j + 1
j=0
for i in range(0,n):
    if A[i] % 2 != 0:
        I = A[i]
        Impar.append(I)
        j = j + 1

# Presentar el vector Par
print("\n---VECTOR PAR--")
for j in range(0,np):
    print("Par ["+str(j)+"]: "+str(Par[j]))
# Presentar el vector Impar
print("\n---VECTOR IMPAR--")
for j in range(0,ni):
    print("Impar ["+str(j)+"]: "+str(Impar[j]))
