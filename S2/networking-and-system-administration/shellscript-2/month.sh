#Jithu S
#Roll No:28
#!/bin/bash
while true
do
    echo "Enter a number (1-12) to get the corresponding month, or 0 to exit:"
    read num
    if [ $num -eq 0 ]; then
        echo "Exiting..."
        exit
    fi
    case $num in
        1) echo "January" ;;
        2) echo "February" ;;
        3) echo "March" ;;
        4) echo "April" ;;
        5) echo "May" ;;
        6) echo "June" ;;
        7) echo "July" ;;
        8) echo "August" ;;
        9) echo "September" ;;
        10) echo "October" ;;
        11) echo "November" ;;
        12) echo "December" ;;
        *) echo "Invalid number! Enter a value between 1 and 12." ;;
    esac
done
