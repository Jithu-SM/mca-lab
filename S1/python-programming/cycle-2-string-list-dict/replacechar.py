s=input("Enter a string:")
if len(s)>0:
    first=s[0]
    s=first+s[1:].replace(first,'$')
    print(s)