with open('data.txt', 'r') as file:
    content = file.read()
    print(content)

# Writing files
with open('output.txt', 'w') as file:
    file.write("Hello, file!")
