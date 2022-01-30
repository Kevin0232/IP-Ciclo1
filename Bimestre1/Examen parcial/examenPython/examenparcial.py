print("---Programa para conocer el valor total de libros---")

# Entrada de datos
nombre = input("Ingrese nombre del cliente: ")

cantL = int(input("Ingrese la cantidad de libros: "))

costL = float(input("Ingrese el costo por libro: "))

print("Observe el siguiente menú.")
print("1. Cliente")
print("2. Estudiante")
print("3. Docente")
opc = int(input("Seleccione el tipo de cliente según el menú: "))

if opc ==1:
    total = costL * cantL
    if cantL <= 5:
        desc = total * (0.1)
        netoP = total-desc
    else:
        if (cantL > 5) and (cantL <= 10):
            desc= total * (0.14)
            netoP= total-desc
        else:
            if cantL > 10:
                desc= total * (0.18)
                netoP= total-desc
if opc == 2:
    total = costL * cantL
    if cantL <= 5:
        desc = total * (0.2)
        netoP = total - desc
    else:
        if (cantL > 5) and (cantL <= 10):
            desc = total * (0.24)
            netoP = total - desc
        else:
            if cantL > 10:
                desc = total * (0.28)
                netoP = total - desc
if opc == 3:
    total = costL * cantL
    if cantL <= 5:
        desc = total * (0.3)
        netoP = total - desc
    else:
        if (cantL > 5) and (cantL <= 10):
            desc = total * (0.34)
            netoP = total - desc
        else:
            if cantL > 10:
                desc = total * (0.38)
                netoP = total - desc
if (opc<1) or (opc >= 4):
    print("Error: Se ha ingresado un número fuera del menú")
print("Nombre del cliente: " + str(nombre))
print("Total a pagar: " + str(total))
print("Descuento: " + str(desc))
print("Neto a pagar:  " + str(netoP))
