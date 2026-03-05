print("Hello, World!")
name = input("What is your name? ")
print("My name is", name)
a = int(input("Enter a number: "))
b = int(input("Enter another number: "))
print("The sum of a and b is: " + str(a + b))
# This is a comment
if a > b:
    print("a is greater than b")
elif a < b:
    print("a is less than b")
else:
    print("a is equal to b")

for i in range(5):
    print(i, end=' ')

print()
count = 0
while count < 5:
    print(count, end=' ')
    count += 1