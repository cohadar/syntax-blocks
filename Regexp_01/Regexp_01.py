import sys
import re

def matchAID(line):
	return re.match(r"^i-[0-9a-fA-F]{8}$", line)

for line in sys.stdin:
	if matchAID(line):
		print line,