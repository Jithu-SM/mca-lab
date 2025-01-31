def isPrime(num):
    if num<=1:
        return False
    for i in range(2,(num//2)+1):
        if num%i==0:
            return False
    return True

n=int(input("Enter n:"))
count=0
num=2
while count<n:
    if isPrime(num):
        count+=1
    if count==n:
        print(f"{n}th prime number is {num}")
    num+=1
