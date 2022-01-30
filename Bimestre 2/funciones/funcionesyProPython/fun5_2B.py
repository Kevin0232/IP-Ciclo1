def Numerador(num):
    num = num+2
    return num
def Denominador(den):
    den = den + 2
    return den
def Factorial(den):
    fact=1
    for j in range(1,den+1):
        fact = fact * j
    return fact
def Potencia(pot):
    pot = pot + 3
    return pot
numP= -1
denP=0
potP=0
factP=0
suma=0
n = int(input('Ingrese el limite de la serie: '))
for i in range(1,n+1):
    numP = Numerador(numP)
    denP = Denominador(denP)
    factP = Factorial(denP)
    potP = Potencia(potP)
    print(str(numP) + "^" + str(potP) + "/"+ str(denP) +"!")

    suma = suma + ((numP^potP)/factP)
print("La suma de la serie númerica es: "+ str(suma))