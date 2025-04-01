#!/bin/bash
if [ -e "$1" ]; then
    echo "File '$1' exists."
else
    echo "File '$1' does not exist."
fi
