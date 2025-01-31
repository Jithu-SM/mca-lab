names=input("Enter names:").split(" ")
count=sum(name.count('a') for name in names)
print("Occurance of a:",count)