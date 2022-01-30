print("Desarrollar un programa que transforme una cantidad en metros y la convierta "
                   , "a centímetros, kilómetros, pies y pulgadas.");

# Creación e inicialización de variables
m = 0;
cm = 0;
km = 0;
ft = 0;
p = 0;

# Entrada de datos
m = input("Ingrese la cantidad en metros:");

# proceso
cm = float(m) * 100
km = float(m) / 1000
ft = float(m) * 3.28084
p = float(m) * 39.3701

# salida
print("La cantidad transformada a centimetros es: " , cm)
print("La cantidad transformada a kilometros es: " , km)
print("La cantidad transformada a pies es: " , ft)
print("La cantidad transformada a pulgadas es: ", p)
