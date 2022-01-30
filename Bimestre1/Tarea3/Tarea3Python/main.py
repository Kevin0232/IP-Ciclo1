print("Programa para conocer si la diferencia de dos números es divisor exacto de alguno de ellos\n")

# ingresar datos de entrada

a = int(input("Ingresar el primer numero: "))
b = int(input("Ingresar el primer numero: "))

resta = a-b
if (a % resta == 0) &( b% resta == 0):
    print("La diferencia ", resta, " es un divisor exacto de ", a, " y de ", b)
else:
    if (a % resta == 0):
        print("La diferencia ", resta, " es un divisor exacto de ", a)
    else:
        if(b % resta == 0):
            print("La diferencia ", resta, " es un divisor exacto de ", b)
        else:
            print("La diferencia ", resta," no es un divisor exacto de ninguno de los 2 números ")