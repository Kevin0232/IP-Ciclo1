print("Programa que presente el menor número primo ingresado por el usuario, tenga en cuenta que se tiene que "
      "el número ingrsado es primo o no.")
# inicialización de variables
i = int(1)
num = 0
divisor = int(0)
menor = int(0)
prim = int(0)
# Ingresar datos
n = int(input("Ingresar el límite: "))
# Proceso
while (i <= n):
      num= int(input("Ingrese un número: "))
      j = int(1)
      while j <= num:
            if (num % j == 0):
                  divisor = (divisor + 1)
            j = j + 1
      if (divisor == 2):
            print("Es un número primo")
            prim = (prim)+ 1
            if (prim == 1):
                  menor = num

            if (num < menor):
                  menor = num
      else:
            print("No es un número primo, no se lo tomará en cuenta.")
      i = i + 1
      divisor = 0


print("Se ha ingresado un total de ", prim, " números primos")
print("El menor número primo ingresado es: ", menor)
