from enum import Enum

class Light(Enum):
    RED = 1
    YELLOW = 2
    GREEN = 3
    BLUE = 4

for i in Light:
    if i == Light.RED:
        print("Stop")
    if i == Light.YELLOW:
        print("Yield")
    if i == Light.GREEN:
        print("Go")
    
    
if __name__ == "__main__":
    pass

    '''
    BLUE was added to the Light enum, but isn't considered a variant in our version of switch/match statement, so it continues running silently.
    '''


# https://docs.python.org/3/howto/enum.html
# https://docs.python.org/uk/3.8/library/enum.html
# https://www.geeksforgeeks.org/python/enum-in-python/
 



