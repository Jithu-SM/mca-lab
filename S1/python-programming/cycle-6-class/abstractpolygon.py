from abc import ABC,abstractmethod
class Polygon(ABC):
    def area(self):
        pass

class Rectangle(Polygon):
    def __init__(self,len,bre):
        self.len=len
        self.bre=bre
    def area(self):
        return self.len*self.bre
    
class Triangle(Polygon):
    def __init__(self,base,hei):
        self.base=base
        self.hei=hei
    def area(self):
        return 0.5*base*hei

choice=input("Calculate area for rectangle/triangle:").lower()
if choice=="rectangle":
    len=float(input("Enter length:"))
    bre=float(input("Enter breadth:"))
    rect=Rectangle(len,bre)
    print("Area:",rect.area())
elif choice=="triangle":
    base=float(input("Enter base:"))
    hei=float(input("Enter height:"))
    tri=Triangle(base,hei)
    print("Area:",tri.area())
else:
    print("Invalid choice!")