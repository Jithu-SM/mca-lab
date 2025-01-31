ul=int(input("Enter upper limit:"))
for num in range(1,ul+1):
    sum=0
    for digit in str(num):
        sum+=int(digit)
    prime=True
    if sum<2:
        prime=False
    else:
        for i in range(2,int(sum/2)+1):
            if sum%i==0:
                prime=False
                break
    if prime:
        print(f"Number:{num}\tSum of digits:{sum}(prime)")
