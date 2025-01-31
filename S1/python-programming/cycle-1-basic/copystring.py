str=input("Enter string:")
n=int(input("Enter no. of copies:"))
if n<0:
    print("Copies must be a positive integer")
else:
    result=str*n
print(result)