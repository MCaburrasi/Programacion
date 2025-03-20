cantidad_pan = int(input("¿Cuanto pan no fresco se ha vendido hoy?: "))
PRECIO_PAN = 3.49
DESCUENTO = 0.6
precio_final = round(cantidad_pan*(precio_pan - precio_pan*descuento),2)
print ("El total de pan que ha vendido, a",PRECIO_PAN,"euros cada una, con un descuento del",int(DESCUENTO*100),"% cada una es",precio_final,"euros.")
