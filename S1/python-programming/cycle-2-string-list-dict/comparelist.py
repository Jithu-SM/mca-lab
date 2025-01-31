list1=list(map(int,input("Enter number list 1:").split(' ')))
list2=list(map(int,input("Enter number list 2:").split(' ')))
print("Same length" if len(list1)==len(list2) else "Not same length")
print("Eqaul sum" if sum(list1)==sum(list2) else "Not equal sum")
common_values = [x for x in list1 if x in list2]
if common_values:
    print("Common values in both lists")
    print(common_values)
else:
    print("No common values in both lists")