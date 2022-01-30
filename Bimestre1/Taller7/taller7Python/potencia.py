# Declaración e inicialización de variables
i = int(1)
result = int(1)
# ingreso de datos
base = int(input("Ingrese la base: "))

pot = int(input("ingrese la potencia: "))


while i <= pot:
    result = result * base

    i = i+1

print("La potencia ", pot, " de la base ", base, " es: ", result)