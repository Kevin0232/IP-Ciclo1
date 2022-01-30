#declarar variables de tipo entero
num1 = 10
num2 = 13
#declarar variables de tipo decimal
num3 = 45.789
num4 = 23.9

#Declarar variables de tipo char

encender = 'S'
encender = 'N'
#Declarar variables de tipo cadena
cadena = "Kevin Joel"
apellido = "Bustamante Moncayo"

#operadores aritmeticos

suma = 10 + 15
suma = num1 + num2

print("La suma es:", suma, " puntos")

suma1 = int(14) + int(34)

print(suma1)


mult = 13 * 23

mult1 = num1 * num2

print(mult1)


div = float(34.5) / float(12.4)

div1 = num1 / num2

print(div1)
print("Funciones matemáticas")

print(pow(2, 4))
print(max(12, 10))
print(min(45, 1))

#Operadores condicionales
print("-- Operadores Condicionales --")

a = 34;

b = 7;

print ( a > b) # true)
print(a >= b) #true
print(a < b) # false
print(a <= b) # false
print(a == b) # false
print(a != b) # true


print("-- Operadores Lógicos --")
print("-- Conjunción - AND --")

print(True) and (True) # true
print(True and False) # false
print(False and False) # false
print("----")
print((a > b) & (a >= b)) # true
print((a == b) & (b > a)) # false
print("-- disyuncion - OR --")

print(True or True)# true
print(True or False)# true
print(False or False)# false

print("-- Negación --")

print(not True) #false
print(not False) # true