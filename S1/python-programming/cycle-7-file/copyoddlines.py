sour=input("Enter source file:")
dest=input("Enter destination file:")

with open(sour,'r') as src, open(dest,'w') as des:
    lines=src.readlines()
for i in range(len(lines)):
    if i%2==0:
        des.write(lines[i])
print(f"Odd lines copied to {dest} successfully")

with open(dest,'r') as file:
    lines=file.readlines()
print("File contents:")
print(lines)