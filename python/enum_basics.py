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

test = Light('BLUE', 4) 

print(test)

# https://docs.python.org/3/library/enum.html

