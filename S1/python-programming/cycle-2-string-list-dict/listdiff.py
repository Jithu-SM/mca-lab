color_list1=input("Enter color list 1:").split(' ')
color_list2=input("Enter color list 2:").split(' ')
difference=[color.strip() for color in color_list1 if color.strip() not in [c.strip() for c in color_list2]]
print("Colors in list 1 and not in list 2:",difference)