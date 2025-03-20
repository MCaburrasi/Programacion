from math import pi
def area_circulo(radio):
    area = pi * radio ** 2
    return area

def volumen_cilindro(radio, altura):
    volumen = area_circulo(radio) * altura
    return volumen

if __name__ == "__main__":
    radio = float(input("Radio del circulo: "))
    altura = float(input("Altura del cilindro: "))
    print(f"El area de un circulo con radio {radio} es {area_circulo(radio)}")
    print(f"El volumen de un cilindro con mismo radio y altura {altura} es {volumen_cilindro(radio, altura)}")