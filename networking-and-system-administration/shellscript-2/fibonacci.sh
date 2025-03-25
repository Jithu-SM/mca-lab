#Jithu S
#Roll no: 28
#!/bin/bash
echo -n "Enter N: "
read n
a=0
b=1
echo "Fibonacci series up to $n:"
echo -n "$a $b "
while [ $((a + b)) -le $n ]
do
    fib=$((a + b))
    echo -n "$fib "
    a=$b
    b=$fib
done
echo
