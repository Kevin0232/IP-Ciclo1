def PAR1(A,n):
    par=0
    for i in range(0,n):
        if A[i]%2 ==0:
            par= par+1
    return par
def Neg1(A,n):
    neg=0
    for i in range(0,n):
        if A[i]<0:
            neg =neg+1
    return neg

def Prim1(A,n):
    div = 0
    prim = 0
    for i in range(0,n):
        for j in range(1,(A[i]+1)):
            if A[i]%j==0:
                div= div + 1
        if div==2:
            prim = prim+1
        div=0
    return prim
def EscribirPar(Par,par):
    print("\nVector Par =  ")
    for i in range(0, par):
        print(str(Par[i]),end='     ')
    print('')
def EscribirNeg(Neg,neg):
    print("\nVector negativo =  ")
    for i in range(0, neg):
        print(str(Neg[i]), end='     ')
    print('')
def Escribirprim(Primos,prim):
    print("\nVector Primos =  ")
    for i in range(0, prim):
        print(str(Primos[i]), end='     ')
    print('')

n=0
par=0
neg=0
prim=0
cont=-1
cont1=-1
cont2=-1
div=0
Ppar=0
Pneg=0
Pprim=0
NN=0
n= int(input("Ingrese el tamaño de la matriz cuadrada: "))
NN = n
A=[]
print("Ingresar datos de la matriz A")
for i in range(0,n):
    a = int(input("A["+str(i)+"]= "))
    A.append(a)
par = PAR1(A,n)
neg = Neg1(A,n)
prim= Prim1(A,n)
Par=[]
Neg=[]
Primos=[]
# Almacenar los datos en los vectores
for i in range(0,n):
    if A[i]%2 == 0:
        cont=cont+1
        p = A[i]
        Par.append(p)
    if A[i]<0:
        cont1 = cont1 + 1
        n = A[i]
        Neg.append(n)
    for j in range(1,(A[i]+1)):
        if A[i]%j==0:
            div = div + 1
    if div == 2:
        cont2 = cont2 + 1
        pm= A[i]
        Primos.append(pm)
    div=0
Ppar = par
Pneg = neg
Pprim = prim

print("Hay "+ str(par)+" números pares que son el "+str((Ppar/NN)*100) +"% del total de números")
print("Hay "+ str(neg)+" números negativos que son el "+str((Pneg/NN)*100) +"% del total de números")
print("Hay "+ str(prim)+" números primos que son el "+str((Pprim/NN)*100) +"% del total de números")
EscribirPar(Par,par)
EscribirNeg(Neg,neg)
Escribirprim(Primos,prim)