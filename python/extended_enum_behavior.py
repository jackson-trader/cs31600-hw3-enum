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
    
print("\nBeyond normal iteration\n")

x = None
print(x.value) # this will raise an AttributeError since x is None and does not have a value attribute
  
'''
since x is a standalone variable that is not an instance of the Light enum, it does not 
have the attributes and methods associated with the Light enum, thus giving an AttributeError.

'''
