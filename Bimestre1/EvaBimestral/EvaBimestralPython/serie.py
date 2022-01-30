# Creación e inicialización de variables.
n = float(0); i = float(1); denom = float(0); pot = float(1); suma = float(0)
num = float(3); pot1 = float(0);j = 1;pot2 = float(0);denom1 = float(4)

# proceso
n = float(input("Ingrese un limite: "))
while i <= n:
    if i % 2 == 0:
        num = 2
    else:
        num = 1

    j = 1
    while j <= i:
        pot1 = pot1+2

        pot = pot *(num * num)
        pot2 = pot2 + 1

        j = j + 1
    denom = denom1 + 3
    suma = suma + (pot/denom)
    print("(", num,  "^",  pot1, "/", denom,  ")")
    denom1 = denom1 + (3*pot2)
    pot = 1
    pot1 = 0
    pot2 = 0
    i = i + 1
print("suma es: ", suma)