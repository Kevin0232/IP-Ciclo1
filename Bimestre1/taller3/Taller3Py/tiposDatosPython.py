print("***programa de tipos de datos, operadores y expresiones Java ***");
print("Introducción a la programación");
print("Kevin Bustamante");
print("---");
# datos

num1 = int(4)
num2 = int(9)
num3 = num1 + num2
print("El valor de la variable entera es: " , num3)

print("---")
# variables, expresión

dec1 = float(25.8)

dec2 = float(30.6)
dec3 = float(dec1) * float(dec2)
print("El valor de la variable dec3 es igual a: ", dec3);

print("---");
# Expresión

letra1 = 'F'
letra2 = 'T'
print("Los caracteres son: " , letra1 ,"y", letra2);

print("---");
# Expresión

nombre = "Kevin"
apellido = "Bustamante"
domicilio = "Loja"
telefono = int(2615617)

print("**Presentar variables string***");
print("Mi nombre es: ", nombre);
print("Mi apellido es: ", apellido);
print("Vivo en:", domicilio);
print("Mi número de teléfono es: ", telefono);
print("\n");
print("me llamo" , nombre , "" , apellido , ", vivo en" , domicilio , "y mi telefono de casa es" , telefono , "\n");

print("**Presentar en una sola linea***");

print("me llamo ",nombre, apellido, " vivo en ", domicilio, " y mi numero de casa es ", telefono)
print("**Presentar concatenar variables tipo string*** \n");

print("Me llamo ",nombre, apellido," y vivo en", domicilio, "y mi telefono es ", telefono)