def leer_Matriz(fila,columna,M):
    for i in range(0, fila):
        M.append([])
        for j in range(0, columna):
            m = int(input("Digite el elemento de la posición ["+str(i)+"]["+str(j)+"]: "))
            M[i].append(m)

def mayor(fila,columna, M):
    May=0
    for i in range(0, fila):
        for j in range(0, columna):
            if M[i][j] > May:
                May = M[i][j]
    print("El elemento mayor de la matriz es: "+str(May)+"\n")
def escribir_Matriz(fila,columna,M):
    for i in range(0, fila):
        for j in range(0, columna):
            print("   "+str(M[i][j]),end=' ')
        print(' ')

def transpuesta(fila, columna, M1,M2):
    for i in range(0, fila):
        M2.append([])
        for j in range(0, columna):
            m2 = M1[j][i]
            M2[i].append(m2)
    escribir_Matriz(fila, columna, M2)
def impar(fila,columna,M,V,tam):
    tam=0
    for i in range(0, fila):
        for j in range(0, columna):
            if M[i][j] % 2 != 0:
                v = M[i][j]
                V.append(v)
                tam = tam + 1
    print("Tam ← "+ str(tam))
    return (tam-1)
def escribir_Vector(tam,v):
    for i in range(0, tam+1):
        print("El elemento en la posición "+str(i)+" es: "+str(v[i]))

k=50
A=[]
B=[]
C=[]
n = int(input("Ingrese el número de filas: "))
m = int(input("Ingrese el número de columnas:"))
leer_Matriz(n, m, A)
print("**Matriz Original**")
escribir_Matriz(n, m, A)
mayor (n, m, A)
print("**Matriz Transpuesta**")
transpuesta (n, m, A, B)
#escribir_matriz (n, m, B)
k = impar(n, m, A, C, k)
if k > 0:
    escribir_Vector(k, C)
else:
    print("La matriz no tiene números impares")
