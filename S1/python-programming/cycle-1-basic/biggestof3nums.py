num1=int(input("Enter a number:"))
num2=int(input("Enter a number:"))
num3=int(input("Enter a number:"))
if (num1>num2) & (num1>num3):
    print(num1," is largest")
elif num2>num3:
    print(num2," is largest")
else:
    print(num3," is largest")
