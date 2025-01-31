from graphics import rectangle
from graphics import circle
from graphics.threedgraphics.cuboid import *
from graphics.threedgraphics import sphere

print("Select a shape:\n1.rectangle\n2.circle\n3.cuboid\n4.sphere\n5.Exit")
while(True):
    shape=int(input("Your choice:"))
    if shape==1:
        l=int(input("Enter the length:"))
        b=int(input("Enter the width:")) 
        print(f"Area={rectangle.area(l,b)}\nPerimeter={rectangle.perimeter(l,b)}")
    elif shape==2:
        rad=int(input("Enter the radius:")) 
        print(f"Area={circle.area(rad)}\nPerimeter={circle.perimeter(rad)}")
    elif shape==3:
        l=int(input("Enter the length:"))
        b=int(input("Enter the width:"))
        h=int(input("Enter the height:"))
        print(f"Volume={volume(l,b,h)}\nSurface Area={surfacearea(l,b,h)}")
    elif shape==4:
        rad=int(input("Enter the radius:")) 
        print(f"Volume={sphere.volume(rad)}\nSurfaceArea={sphere.surfacearea(rad)}")
    elif shape==5:
        exit()
    else:
        print("Wrong input")
