nums = list(map(int, input("Enter integers: ").split()))
positive = [x for x in nums if x > 0]
print(positive)
N = int(input("Enter N: "))
squares = [x**2 for x in range(1, N+1)]
print(squares)
word = input("Enter a word: ")
vowels = [char for char in word if char in 'aeiouAEIOU']
print(vowels)
word = input("Enter a word: ")
ord_values = [ord(char) for char in word]
print(ord_values)