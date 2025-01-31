area_square=lambda side:side**2
area_rectangle=lambda len,wid:len*wid
area_triangle=lambda base,hei:0.5*base*hei

side=float(input("SQUARE:\nEnter side:"))
len=float(input("RECTANGLE:\nEnter length:"))
wid=float(input("Enter width:"))
base=float(input("TRIANGLE:\nEnter base:"))
height=float(input("Enter height:"))

print("Square area:",area_square(side))
print("Rectangle area:",area_rectangle(len,wid))
print("Triangle area:",area_triangle(base,height))