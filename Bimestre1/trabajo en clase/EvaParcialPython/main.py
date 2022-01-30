print("----Programa para calcular los descuentos por tipo de cliente----\n")
tCliente = int(0)
cantLibros = int(0)
costoLibro = float(0)
desc = float(0)
descTotal = float(0)
costoLibro = float(0)
total = float(0)
nombre = input("Ingrese el nombre del cliente: ")
print("1. Docente")
print("2. Estudiante")
print("3. Publico en general")

tCliente = int(input("Ingrese el tipo de cliente: "))
cantLibros = int(input("Ingrese la cantidad de libros: "))
costoLibro = float(input("Ingrese el costo por libro: "))

# proceso
if tCliente == 1:
    desc=0.30

else:
    if tCliente == 2:
        desc=0.20


    else:
        if tCliente == 3:
            desc=0.10


        else:
            desc=0
# condición para determinar el descuento según la cantidad de libros
if (cantLibros > 5) and (cantLibros <= 10):
    desc= desc+0.04

else:
    if cantLibros > 10:
        desc= desc+0.08
# Obtener el subtotal y el valor neto a pagar
subtotal = cantLibros * costoLibro
descTotal = (subtotal * desc)
total = subtotal - descTotal
# presentar los datos de salida
print("Nombre del cliente: ", nombre)
print("Total a pagar: ", subtotal)
print("Descuento: ", descTotal)
print("Neto a pagar: ", total)
