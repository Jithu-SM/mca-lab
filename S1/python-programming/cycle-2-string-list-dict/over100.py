nums=list(map(int,input("Enter the numbers:").split(' ')))
result=["over" if x>100 else x for x in nums]
print(result)
