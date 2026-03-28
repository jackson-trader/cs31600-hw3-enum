from enum import Enum

# class syntax
class Light (Enum):
    RED = 1
    YELLOW = 2
    GREEN = 3

print(Light.RED)
print(Light.YELLOW)
print(Light.GREEN)

    
# functional syntax

Light = Enum('Light', [('RED', 1), ('YELLOW', 2), ('GREEN', 3)])


print(Light.RED)
print(Light.YELLOW)
print(Light.GREEN)

test = Light(4) 

# raises a ValueError since there is no member of Light with the value 4. 
# The valid values for Light are 1, 2, and 3, corresponding to RED, YELLOW, and GREEN respectively.te

print(test)

# https://docs.python.org/3/library/enum.html

