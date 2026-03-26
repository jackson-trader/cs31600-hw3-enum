from enum import Enum

class Light (Enum):
    RED = 1
    YELLOW = 2
    GREEN = 3

print("Normal iteration for Light\n")

for i in Light:
   print(i)
    
class Light2 (Enum):
    RED = 1
    YELLOW = 2
    GREEN = 2
    BLUE = 3

print("\nBeyond normal iteration for Light2\n")

for i in Light2:
    print(i)
  
'''
  the for loop for Light2 will only print the first instance of the value 2, which is YELLOW in this instance.
  GREEN will be ignored since it's the second instance of the value 2. This is because in Python's Enum, 
  members with the same value are considered aliases, and only the first member with that value is included in iteration.
  
'''  
 
# https://docs.python.org/3/library/enum.html#iteration-and-order