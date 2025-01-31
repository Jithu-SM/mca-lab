import csv
csv_file=input("Enter the csv filename:")
columns=list(map(int,input("Enter column indices:").split()))

with open(csv_file,'r') as file:
    reader=csv.reader(file)
for row in reader:
    sel=[row[col] for col in columns if col<len(row)]
    print(sel)