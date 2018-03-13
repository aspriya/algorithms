'''
The selection sort improves on the bubble sort by making only one exchange for every pass 
through the list. In order to do this, a selection sort looks for the largest value as it 
makes a pass and, after completing the pass, places it in the proper location. As with a 
bubble sort, after the first pass, the largest item is in the correct place.
'''

from __future__ import print_function
import sys
import numpy as np

class SelectSort():

	def generate_lst(self):
		print("enter the size of the numer list to be generated ")
		self.size = int(sys.stdin.readline())
		self.lst = np.random.randint(0, 100, self.size)
		print("before sorting : ", self.lst)

	def select_sort(self, lst):
		for i in range(len(lst)-1, -1, -1):
			maxindex = 0
			for j in range(0, i+1):
				if(lst[j] > lst[maxindex]):
					maxindex = j

			temp = lst[i]
			lst[i] = lst[maxindex]
			lst[maxindex] = temp

		return lst

if __name__ == "__main__":
	obj = SelectSort()
	obj.generate_lst()
	sorted_list = obj.select_sort(obj.lst)
	print("after sorting : ", sorted_list)