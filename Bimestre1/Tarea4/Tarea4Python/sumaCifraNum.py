#inicialización de variables
sdn = int(0)
nd = int(0)
n = int(input("Por favor digite un número: "))
cn = n
if cn < 0:
    cn = -cn
if cn == 0:
    # Si el número es 0, entonces n tiene 1 dígito
    # y la suma de las cifras es 0
    sdn=0
    nd=0
else:
    while cn > 0:
        #se acumula la suma de cifras
        sdn = sdn+ (cn%10)
        nd = nd + 1
        #se descarta la cifra sumada
        cn = cn // 10
print(n, " tiene ", nd, " dígitos y la suma de los digitos de ", n, " es: ", sdn)