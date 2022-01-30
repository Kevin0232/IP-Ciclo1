print('Programa que calcule la suma de los elementos de la diagonal principal')
sum=0;
n = int(input(" Ingrese el tamaño de la matriz cuadrada: "))
A = []
print("Ingresar los elementos de la matriz A")
for i in range(0, n):
    A.append([])
    for j in range(0, n):
        val = int(input("A[" + str(i) + "]["+str(j)+"]= "))
        A[i].append(val)

print('--------------------------------------------------------')
print('Matriz A')
for i in range(0, n):
    for j in range(0, n):
        print(A[i][j], end='   ')
    print('  ')

print('')
for i in range(0, n):
    for j in range(0, n):
        if i == j:
            sum = sum + A[i][j]

print('La suma de la matriz principal es: ' + str(sum))
