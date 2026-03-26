from enum import Enum
from enum import auto

class Grades(Enum):
    A = 1
    B = 2
    C = 3
    D = 4
    F = 5

class Grades(Enum):
    A = "90"
    B = 2
    C = 3
    D = 4
    F = 5

    

    def whatIsYourgrade(self):
        print(f'', self.value)

class MainMethodTest():
    def mainMethod():

        print(f"", Grades.A.name)
        Grades.A.whatIsYourgrade()

if __name__ == "__main__":
    MainMethodTest.mainMethod()