def compound_interest(p, r, t):
	a = p * pow((1 + (r / 100)), t)
	c = a-p
	print(c)

compound_interest(10000, 10.25, 5)