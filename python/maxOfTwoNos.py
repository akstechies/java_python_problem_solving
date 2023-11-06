a = 455
b = 355

if(a>b):
	print("a is max")
else:
	print("b is max")

# USING MAX
maximum = max(a,b)
print(f"max is {a}")

# TERNARY
maximum2 = a if a>b else b
print(maximum2)

# LAMBDA
maximum3 = lambda a,b: a if a>b else b
print(maximum3(a,b))

# USING SORT means we will create a list then sort it, so sort will in small to large
# then we will get -1 index which is the last index as it is sorted so last one will be big
# this is good approach when there are many numbers as we don't have to add conditions
x = [a,b]
x.sort()
print(f"Grater is {x[-1]}")