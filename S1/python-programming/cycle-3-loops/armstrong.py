num=int(input("Enter a number:"))
len=len(str(num))
temp=num
total=0
while temp>0:
    digit=temp%10
    total+=digit**len
    temp//=10
if total==num:
    print(num," is an armstrong number")
else:
    print(num," is not an armstrong number")