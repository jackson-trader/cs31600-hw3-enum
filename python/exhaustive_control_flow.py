from enum import Enum

class Color(Enum):
    Red = 1
    Green = 2
    Blue = 3

class MainApplication:
    def mainFunction():
        colorList = []

        colorList.append(Color.Red)
        colorList.append(Color.Green)
        #colorList.append(Color.Blue)

        #colorList.append(Color.Yellow)

        for i in colorList:

            if(i == Color.Red):
                print("Red")
            elif(i == Color.Green):
                print("Green")
            elif(i == Color.Blue):
                print("Blue")

if __name__ == "__main__":
    MainApplication.mainFunction()


# https://docs.python.org/3/howto/enum.html
# https://docs.python.org/uk/3.8/library/enum.html
# https://www.geeksforgeeks.org/python/enum-in-python/
 



