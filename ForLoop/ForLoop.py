import sys

n = input()
asum = 0
for line in sys.stdin:
	l = map(int, line.split())
	asum += sum(l)
	n -= len(l)
	if n <= 0:
		break
assert n == 0
print asum