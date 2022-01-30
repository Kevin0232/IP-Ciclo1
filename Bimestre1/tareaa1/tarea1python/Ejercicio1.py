# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


def print_hi(name):
    # Use a breakpoint in the code line below to debug your script.
    print(f'Hi, {name}')  # Press Ctrl+F8 to toggle the breakpoint.


# Press the green button in the gutter to run the script.
print("Reconocer el costo de la llamada\n")
nombre = input("Como se llama usted: ")

print("--------------\n")
tL = input("Ingresa el tiempo de la llamada: ")
cM = input("Ingresa el costo por minuto de la llamada: ")

#proceso
cT =float(tL) * float(cM)

print("El costo total de la llamada es:", cT )

# See PyCharm help at https://www.jetbrains.com/help/pycharm/








