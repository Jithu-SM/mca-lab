class Rectangle:
    def __init__(self,len,bre):
        self.len=len
        self.bre=bre
    def area(self):
        return self.len*self.bre
    def __gt__(self,other):
        return self.area()>other.area()

print("Rectangle 1")
len1=float(input("Enter length:"))
bre1=float(input("Enter breadth:"))
rect1=Rectangle(len1,bre1)
print("Rectangle 2")
len2=float(input("Enter length:"))
bre2=float(input("Enter breadth:"))
rect2=Rectangle(len2,bre2)
print(f"Rectangle 1 area:{rect1.area()}\nRectangle 2 area:{rect2.area()}")
print("Rectangle 1 is larger" if rect1>rect2 else "Rectangle 2 is larger")
