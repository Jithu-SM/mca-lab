#!/bin/bash
echo -n "Enter a decimal number: "
read num
binary=""
while [ $num -gt 0 ]
do
    remainder=$((num % 2))
    binary="$remainder$binary"
    num=$((num / 2))
done
echo "Binary: $binary"
