# list = [100, 124, 12, 34, 56, 78, 91]

# list.append(100)
# list.remove(56)
# list.insert(2, 45)
# list.sort(reverse=True)
# list.pop(3)
# print(list.count(100))
# print(len(list))
# print(len("Aaryan"))
# # print("The original list is:", list)
# for item in list:
#     # if item % 2 == 0:
#         print(item, end=' ')
# print()
# for index, item in enumerate(list):
#     print(index, item)

# print(list[2:5])
# print(list[2:])
# print(list[:5])
# print(list[-3:])
# print(list[::-1])
# list.reverse()
# list.reverse()
# print(list)


# tuple
# t = (12, 10, 34, 56, 78, 91)
# print(t)
# print(t[2:5])
# print(t[2:])
# print(t[:5])
# print(t[-3:])
# print(t[::-1])

# Dictionary

# d = {"name": "Aaryan", "age": 25, "city": "New York"}
# print(d["age"])
# print(d.get("name"))
# d["age"] = 26
# print(d)
# d["country"] = "USA"
# print(d)
# for key in d:
#     print(key, d[key])

# for key, value in d.items():
#     print(key, value)
# print(list(d.keys()))
# print(list(d.values()))

# for index, key in enumerate(d):
#     print(index, key, d[key])

# for i in list(zip(d.keys(), d.values())):
#     print(i)

# set
s = {12, 10, 34, 56, 78, 91, 12, 34}
s1 = {100, 200, 300, 1}

print(s)
s.add(100)
print(s)
s.remove(34)
print(s)


s.update({200, 300})
print(s)
print("Union of s and s1:", s.union(s1))
print("Intersection of s and s1:", s.intersection(s1))
for item in s:
    print(item, end=' ')