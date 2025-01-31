def fibonacci(n):
    if n<=1:
        return n
    else:
        return fibonacci(n-1)+fibonacci(n-2)

terms=int(input("Enter number of terms:"))
for i in range(terms):
    print(fibonacci(i),end="\t")