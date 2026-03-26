from enum import Enum

class Light (Enum):
    RED = ("STOP", 1)
    YELLOW = ("YIELD", 2)
    GREEN = ("GO", 3)
    
print ("Normal iteration for Light\n")

for i in Light:
    print(i)
    print(i.value) # value of the enum is stored as a tuple, so we can access the individual elements of the tuple using indexing
    print(i.value[0]) # access the first element of the tuple
    print(i.value[1]) # access the second element of the tuple
    print(i.name)
    
class Light2 (Enum):
    RED = ("STOP", 1)
    YELLOW = ("YIELD", 2)
    GREEN = ("GO", 3)
    BLUE = (None) # since python enforces initialization in enum, 
    
print("\nBeyond normal iteration for Light2\n")
x = None

for i in Light2:
    print(i)
    print(i.value) 
    print(i.value[0]) 
    print(i.value[1]) 
    print(i.name)
  
  
'''
the for loop for Light2 produced a TypeError when it tried to access the elements of the tuple for the BLUE member, 
which has a value of None.

python doesn't explicitly allow 'null'or 'uninitialized' values in enums.

What if we stored the values in an __init__ method instead of as a tuple?

'''
