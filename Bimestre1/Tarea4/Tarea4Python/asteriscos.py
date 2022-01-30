print("**asteriscos**")
#inicializar variables
i = int(1)
j = int(1)
#datos de entrada
n = int(input("Ingrese un número: "))
while i<=n:
    while j<=i:
        print("*",end='')
        j = j + 1
    i = i + 1