import csv
csv_file=input("Enter filename:")

with open(csv_file,'r') as file:
    reader=csv.reader(file)
for row in reader:
    print(row)