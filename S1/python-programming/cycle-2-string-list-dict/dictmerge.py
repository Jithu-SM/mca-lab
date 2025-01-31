dict1={"a":1,"b":2,"c":3}
dict2={"d":4,"e":5,"f":6}
print(f"dict1={dict1}\ndict2={dict2}")
merged_dict={**dict1,**dict2}
print("Merged dictionary:",merged_dict)