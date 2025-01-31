ul=int(input("Enter a number:"))
total=0
for i in range(ul):
    if i%6==0 and i%4!=0:
        total+=i
print("Sum =",total)