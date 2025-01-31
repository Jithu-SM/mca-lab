import math
a = float(input("Enter the coefficient a: "))
b = float(input("Enter the coefficient b: "))
c = float(input("Enter the coefficient c: "))
discriminant = b**2 - 4*a*c
if discriminant > 0:
    root1 = (-b + math.sqrt(discriminant)) / (2*a)
    root2 = (-b - math.sqrt(discriminant)) / (2*a)
    print(f"The roots are real and distinct: {root1} and {root2}")
elif discriminant == 0:
    root = -b / (2*a)
    print(f"The root is real and repeated: {root}")
else:
    real_part = -b / (2*a)
    imag_part = math.sqrt(-discriminant) / (2*a)
    print(f"The roots are complex: {real_part} + {imag_part}i and {real_part} - {imag_part}i")