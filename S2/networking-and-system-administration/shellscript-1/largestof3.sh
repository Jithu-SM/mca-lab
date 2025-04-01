#!/bin/bash
echo "Enter three numbers:"
read a b c
if [ $a -ge $b ] && [ $a -ge $c ]; then
    echo "Largest number is: $a"
elif [ $b -ge $c ]; then
    echo "Largest number is: $b"
else
    echo "Largest number is: $c"
fi
