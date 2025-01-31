str=input("Enter a string:")
for char in set(str):
    count=str.count(char)
    print(f"{char} : {count}")