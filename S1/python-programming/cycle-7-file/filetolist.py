filename=input("Enter the filename to read:")
with open(filename,'r') as file:
    lines=file.readlines()
print("File contents:")
print(lines)