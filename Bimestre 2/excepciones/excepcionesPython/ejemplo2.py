print("")

try:
    valor1 = int(input("Ingrese el valor 1: ")) #Se espera el ingreso de un valor entero
    valor2 = int(input("Ingrese el valor 2: ")) # Si se ingresa un valor decimal y genera error

    resultado = valor1/valor2

    print("El resultado es: ",resultado)

except ValueError:
    print("")
    print("Existe un error en la entrada de datos")
    print("de tipo ",ValueError)
    print("")

