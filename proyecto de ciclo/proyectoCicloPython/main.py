print("Programa para identificar los multiplos de 5 y determinar las posición de estos dentro de un vector.")
n = int(input(" Ingrese el tamaño del vector: "))

A = [None]*n
print("Ingresar los elementos del vector A")
for i in range(0, n):
    A[i] = int(input("A[" + str(i) + "]= "))
print('Vector A')
for i in range(0, n):
    print(A[i], end='    ')
print('')
for i in range(0, n):
    if A[i]% 5 ==0:
        print("El número " +str(A[i])+ " es múltiplo de 5 y está en la posición A["+ str(i)+ "].")
