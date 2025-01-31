import csv
data={}
keys=input("Enter the keys:").split()
for key in keys:
    values=input(f"Enter the values for {key}:").split()
    data[key]=[value.strip() for value in values]

csv_file=input("Enter the csv file name:")
with open(csv_file,'w',newline='') as file:
    writer=csv.DictWriter(file,fieldnames=data.keys())
    writer.writeheader()
for i in range(len(next(iter(data.values())))):
    row={key:data[key][i] for key in data.keys()}
    writer.writerow(row)
print(f"Dictionaries written to {csv_file} successfully")

print("\nContents of the CSV file:")
with open(csv_file,'r') as file:
    reader=csv.reader(file)
for row in reader:
    print(row)