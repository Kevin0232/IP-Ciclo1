def pronfun(B):
    prom = 0
    sum = 0
    for i in range(0, 10):
            sum = sum + B[i]
    prom = float(sum/10)
    return prom
print('Función que tome un vector de 10 posiciones y devuelva su promedio real\n')
A = [None]*10
for i in range(0,10):
    A[i] = int(input("A[" + str(i) + "]= "))

print('Vector A')
for i in range(0, 10):
    print(A[i], end='    ')
print('')

prom = pronfun(A)

print("El promedio real del vector es: "+ str(prom))






