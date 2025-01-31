n=int(input("Enter a number:"))
count=0
for i in range(2,n+1):
    prime=True
    for j in range(2,i):
        if i%j==0:
            prime=False
            break
    if prime:
        if count%2==0:
            print(i,end=" ")
        count+=1
