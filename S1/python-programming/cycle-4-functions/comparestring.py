def compare(S1,S2,n):
    return S1[:n]==S2[:n]
S1=input("Enter first string:")
S2=input("Enter second string:")
n=int(input("Enter n:"))
if compare(S1,S2,n):
    print(f"First {n} characters of both string are same")
else:
    print(f"First {n} characters of both string are not same")
