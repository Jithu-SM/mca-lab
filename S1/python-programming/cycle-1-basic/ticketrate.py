age = int(input("Enter the age of the visitor: "))
if age < 10:
    rate = 7
elif age >= 10 and age < 60:
    rate = 10
else:
    rate = 5
print(f"The entry ticket rate for a visitor aged {age} is: {rate}")
