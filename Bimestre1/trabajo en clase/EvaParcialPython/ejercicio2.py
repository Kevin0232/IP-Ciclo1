# declarar e inicializar variables

dif = int(0)
# ingresar los 2 numeros
print("---Programa para determinar se la diferencia de dos numeros es multiplo de alguno de ellos---\n")
num1 = int(input("Ingrese el primer número: "))

num2 = int(input("Ingrese el segundo numero: "))

# Proceso para obtener la diferencia y verificar si es multiplo
dif = (num1 - num2)
if (num1 % dif == 0) and (num2 % dif == 0):
    print("La diferencia ", dif, " es múltiplo de ", num1, " y de ", num2)
else:
    if num1 % dif == 0:
        print("La diferencia ", dif, " es múltiplo de ", num1)
    else:
        if num2 % dif == 0:
            print("La diferencia ", dif, " es múltiplo de ", num2)

        else:
            print("La diferencia ", dif, " no es múltiplo de ninguno de los 2 números ")
