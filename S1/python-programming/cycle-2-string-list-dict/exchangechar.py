str=input("Enter string:")
if len(str)>1:
    str=str[-1]+str[1:-1]+str[0]
    print(str)