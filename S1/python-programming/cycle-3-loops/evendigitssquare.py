import math
ul=int(input("Enter upper limit:"))
ll=int(input("Enter lower limit:"))
l=[]
for i in range(ll,ul):
    even=True
    for digit in str(i):
        if int(digit)%2!=0:
            even=False
            break
    if even and math.isqrt(i)**2==i:
        l.append(i)
print(l)
