from __future__ import print_function
import sys
import numpy as np

class BubbleSort:

	def generate_array(self):
		print("enter the size of array to be generated randomly")
		self.size = int(sys.stdin.readline())
		self.lst = np.random.randint(0, 100, self.size)
		print("before sorting : ", self.lst)

	def bubble_sort(self, arr):
		for j in range(0, len(arr)):
			for i in range(0, len(arr)-1):
				temp = ''
				if(arr[i] > arr[i+1]):
					temp = arr[i]
					arr[i] = arr[i+1]
					arr[i+1] = temp

		return arr


if __name__ == "__main__":
	a = BubbleSort()
	a.generate_array()
	sorted_list = a.bubble_sort(a.lst)
	print("after sorted : ",sorted_list)