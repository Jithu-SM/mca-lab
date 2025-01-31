import calendar as c
year=int(input("Enter year:"))
print(year,"is a leap year" if c.isleap(year) else "is not a leap year")