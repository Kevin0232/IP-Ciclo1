print("Programa para calcular el área de un poligono compueston\n");

lc = 0;
at = 0;
ar = 0;
A = 0;
B = 0;
D = 0;
ats = 0;
area = 0;
#ingresar los datos
lc = input("Ingrese el lado del cuadrado: ")

at = input("Ingrese la altura del triangulo: ")

ar = input("Ingrese la altura del rectangulo: ")


# Proceso
A = pow(float(lc), 2)
B = (float(lc) * float(at)) / 2
ats = float(B) * 3
D = float(lc) * float(ar)
area = (float(A) + float(B) + float(ats))

# salida
print("El resultado del poligono es:" , area ,
                   " Con un cuadrado de area ",A, "y 3 rectangulos de area ", ats,
                   " Y un rectangulo de área ", D, "\n");