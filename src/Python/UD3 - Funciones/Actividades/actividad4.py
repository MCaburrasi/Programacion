def precio_total(importe, iva=21):
    total = importe + (importe * (iva / 100))
    return total

if __name__ == "__main__":

    importe = float(input("¿Cuanto cuesta el producto?: "))
    iva = 21
    print(f"El precio total del producto es {precio_total(importe, iva):.2f}")