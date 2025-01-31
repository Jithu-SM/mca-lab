num=int(input("Enter a number:"))
fact=1
for i in range(1,num+1):
    fact*=i
print(f"{num}!={fact}" if num>0 else "Enter a positive integer")