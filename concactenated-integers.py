# solving /r/dailyprogrammer challenge #314
# Steven Sawtelle

import sys
import itertools

def main():
	line = sys.stdin.readline()
  
	entered_ints = [int(x) for x in line.split()]
	items = itertools.permutations(entered_ints)
  
	int_items = list(items)
	int_items.sort()
  
	print(int_items[0], int_items[1])

if __name__ == "__main__":
	main()
