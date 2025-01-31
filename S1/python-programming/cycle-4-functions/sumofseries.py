def factorial(n):
    return 1 if n==0 or n==1 else n*factorial(n-1)

n=int(input("Enter the number of terms:"))
total=0
series=[]
for i in range(1,n+1):
    term=(i**i)/factorial(i)
    series.append(f"{i}^{i}/{i}!")
    total+=term
print("Series:","+".join(series))
print("Sum:",total)