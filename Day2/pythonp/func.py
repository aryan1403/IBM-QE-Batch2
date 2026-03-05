def add(a, b=10):
    return a + b

num1 = int(input("Enter a number: "))
num2 = int(input("Enter another number: "))

print("The sum of a and b is:", add(b=num2, a=num1))
