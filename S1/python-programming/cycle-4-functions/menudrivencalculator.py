def add(a,b):
    return a+b
def subtract(a,b):
    return a-b
def multiply(a,b):
    return a*b
def divide(a,b):
    return a/b if b!=0 else "Division by 0 is not undefined"
def mod(a,b):
    return a%b if b!=0 else "Mod by 0 is not undefined"

print("1>ADD\n2>SUBTRACT\n3>MULTIPLY\n4>DIVIDE\n5>MODULUS")
choice=int(input("Enter your choice:"))
a=float(input("Enter first number:"))
b=float(input("Enter second number:"))
if choice==1:
    print(f"{a} + {b} = {add(a,b)}")
elif choice==2:
    print(f"{a} - {b} = {subtract(a,b)}")
elif choice==3:
    print(f"{a} * {b} = {multiply(a,b)}")
elif choice==4:
    print(f"{a} / {b} = {divide(a,b)}")
elif choice==5:
    print(f"{a} % {b} = {mod(a,b)}")
else:
    print("Invalid choice!")