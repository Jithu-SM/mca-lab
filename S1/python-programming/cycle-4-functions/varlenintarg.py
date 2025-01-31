def add_numbers(*args):
    """
    Returns the sum of variable length integer arguments args
    """
    return sum(args)
li=list(map(int,input("Enter numbers:").split()))
print("Sum =",add_numbers(*li))