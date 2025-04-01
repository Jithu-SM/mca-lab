#!/bin/bash
echo "Enter three marks:"
read m1 m2 m3
sum=$((m1 + m2 + m3))
avg=$((sum / 3))
echo "Average: $avg"
if [ $avg -ge 90 ]; then
    echo "Grade: S"
elif [ $avg -ge 80 ]; then
    echo "Grade: A"
elif [ $avg -ge 60 ]; then
    echo "Grade: B"
elif [ $avg -ge 40 ]; then
    echo "Grade: P"
else
    echo "Grade: F"
fi
