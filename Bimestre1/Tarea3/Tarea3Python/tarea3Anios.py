print("Programa para conocer la edad de una persona en dias, meses y años.\n")
print("Ingrese todos sus datos con numeros\n")
an = int(input("Ingrese año de nacimiento:  "))
mn = int(input("Ingrese mes de nacimiento: "))
dn = int(input("Ingresar dia de nacimiento: "))
aa = int(input("Ingrese año actual: "))
ma = int(input("Ingrese el mes actual: "))
da = int(input("Ingrese el dia actual: "))

#proceso

if (mn > ma) & (ma <= 12) & (mn <= 12):
    ap = (aa - an)-1

else:
    ap = (aa - an)

if (mn <= ma):
    mp = (ma-mn)

else:
    mp=(12-(mn-ma))

if (dn > da):
    dp= (30-(dn-da))

else:

    dp= da-dn

if (mp >= 12):
    ap= ap+1
    mp=mp-12


if (dp > 30):
    mp = mp+1
    dp=dp-31
#salida
print("la persona tiene ", ap, " años, ", mp, " meses y ", dp, " días." )













