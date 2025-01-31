nums=list(map(int,input("Enter the numbers:").split(' ')))
result=[x for x in nums if x%2!=0]
print(result)