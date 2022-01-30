def Cuadrado_Suc(m):
    j=m
    r=0
    while j != 0:
        r = r + m
        j = j - 1
    return r
print('Cálculo de los cuadrados de V')
V=[]
C=[]
n= int(input('Ingresar el valor de n: '))

for i in range (0,n):
    v = int(input("ingrese el valor de V["+str(i)+"]= "))
    V.append(v)

# Llamado de la función que calcula los cuadrados de los números
for i in range (0,n):
    c = Cuadrado_Suc(V[i])
    C.append(c)
# Impresión de los cuadrados sucesivos contenidos en el vector C
i=0
while i<n:
    print("El número contenido en la posición "+ str(i)+ " del vector")
    print(str(V [i])+ " tiene cuadrado "+ str(C[i]))
    i = i+1