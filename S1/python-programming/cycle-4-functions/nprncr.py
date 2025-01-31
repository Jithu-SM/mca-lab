def fact(n):
    return 1 if n==0 else n*fact(n-1)
def permutations(n,r):
    return fact(n)//fact(n-r)
def combinations(n,r):
    return fact(n)//(fact(r)*fact(n-r))

n=int(input("Enter n:"))
r=int(input("Enter r:"))
print(f"P({n},{r})={permutations(n,r)}")
print(f"C({n},{r})={combinations(n,r)}")