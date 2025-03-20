letra = input("Dime una letra: ") #Puedes usar un break para no repetir la funcion input

while letra != "":
    if letra == "A"|"a"|"E"|"e"|"I"|"i"|"O"|"o"|"U"|"u":
        print("Vocal")
    else:
        print("Consonante")
    letra = input("Dime una letra: ")