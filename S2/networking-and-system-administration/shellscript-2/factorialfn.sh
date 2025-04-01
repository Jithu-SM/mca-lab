#!/bin/bash
factorial() {
    num=$1
    fact=1
    while [ $num -gt 1 ]
    do
        fact=$((fact * num))
        num=$((num - 1))
    done
    echo "Factorial: $fact"
}
echo -n "Enter a number: "
read n
factorial $n
