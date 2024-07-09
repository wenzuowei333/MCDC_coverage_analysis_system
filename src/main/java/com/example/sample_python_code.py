# SampleCode.py
import sys

x = int(sys.argv[1])
y = int(sys.argv[2])

# Simple if statement
if x > 5:
    print("x is greater than 5")
else:
    print("x is 5 or less")

# Nested if statement
if x > 2:
    if y < 10:
        print("x is greater than 2 and y is less than 10")
    elif y == 10:
        print("x is greater than 2 and y is equal to 10")
    else:
        print("x is greater than 2 and y is greater than 10")
else:
    print("x is 2 or less")
