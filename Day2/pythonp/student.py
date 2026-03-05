name = "Arush"
enrollment_number = 12345
course = "Computer Science"
branch = "Software Engineering"
year_of_study = 2
gpa = 3.8

# print("Name:", name, "Enrollment Number:", enrollment_number, "Course:", course, "Branch:", branch, "Year of Study:", year_of_study, "GPA:", gpa)
# print(f"Name: {name.upper()}, Enrollment Number: {enrollment_number}, Course: {course}, Branch: {branch}, Year of Study: {year_of_study}, GPA: {gpa}")

coor = (5, 6)
(x, y) = coor
# print(f"Coordinates: x={x}, y={y}")

text = "  Python Programming  "
print(text.strip())        # Remove whitespace
print(text.upper())        # Convert to uppercase
print(text.split())        # Split into list
print(f"Learning {text.strip()}")  # f-strings
print("Length of text:", len(text.strip()))  # Length of string
print(text[::-1])       # Reverse the string
print(text.replace("Python", "Java")) # Replace substring
print(text.strip()[7:])

try:
    number = int(input("Enter a number: "))
    result = 10 / number
    print(f"Result: {result}")
except ValueError:
    print("Please enter a valid number")
except ZeroDivisionError:
    print("Cannot divide by zero")
finally:
    print("Operation completed")
