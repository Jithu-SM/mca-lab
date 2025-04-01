#!/bin/bash
while true
do
    echo "MENU:"
    echo "1. Sum"
    echo "2. Difference"
    echo "3. Product"
    echo "4. Quotient"
    echo "5. Exit"
    echo -n "Enter your choice: "
    read choice
    if [ $choice -eq 5 ]; then
        echo "Exiting..."
        exit
    fi
    echo -n "Enter first number: "
    read num1
    echo -n "Enter second number: "
    read num2
    case $choice in
        1) echo "Sum: $((num1 + num2))" ;;
        2) echo "Difference: $((num1 - num2))" ;;
        3) echo "Product: $((num1 * num2))" ;;
        4) if [ $num2 -eq 0 ]; then
                echo "Division by zero is not allowed!"
           else
                echo "Quotient: $((num1 / num2))"
           fi
           ;;
        *) echo "Invalid choice!" ;;
    esac
done
