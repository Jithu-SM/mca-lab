import palindrome as p
str=input("Enter a string:")
substr=[]
for i in range(len(str)+1):
    for j in range(i,len(str)+1):
        substr.append(str[i:j])
substr=list(set(substr))
pal=[x for x in substr if p.palindrome(x)]
print("Longest palindromic substring:",max(pal,key=len))
