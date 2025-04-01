#!/bin/bash
echo "Enter two numbers:"
read a b
sum=$((a + b))
diff=$((a - b))
prod=$((a * b))
if [ $b -ne 0 ]; then
    quot=$((a / b))
else
    quot="undefined (division by zero)"
fi
echo "Sum: $sum"
echo "Difference: $diff"
echo "Product: $prod"
echo "Quotient: $quot"
