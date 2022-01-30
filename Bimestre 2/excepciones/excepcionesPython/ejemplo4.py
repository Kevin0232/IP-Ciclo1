import sys
try:
    valor1=int(input("Ingrese el valor 1: "))

    valor2 =int(input("Ingrese el valor 2: "))

    resultado = valor1/valor2
    print("El resultado es ",resultado)
##catch(ArithmeticException ExpresionAritmetica){
#    print("LO sentimos hay un error")
#    print("de tipo "+ExpresionAritmetica)

#catch(InputMismatchException ExcepcionErrorEntrada){
#    print("Existe un error de entrada de datos")
#    print("De tipo: "+ExcepcionErrorEntrada)
except:
   print("LO sentimos hay un error")
   print("de tipo ",sys.exc_info()[0])