#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the kangaroo function below.
def kangaroo(x1, v1, x2, v2):
    jumps = 10000
    # k1 = []
    # k2 = []
    jump1 = x1
    jump2 = x2
    
    for x in range(jumps):
        jump1 = jump1 + v1
        jump2 = jump2 + v2
        # k1.append(jump1)
        # k2.append(jump2)
        if jump1 == jump2:
            return 'YES'
    
    #for x in range(jumps):
    #   if k1[x] == k2[x]:
    #       return 'YES'
    return 'NO'

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    x1V1X2V2 = input().split()
    x1 = int(x1V1X2V2[0])
    v1 = int(x1V1X2V2[1])
    x2 = int(x1V1X2V2[2])
    v2 = int(x1V1X2V2[3])
    result = kangaroo(x1, v1, x2, v2)
    fptr.write(result + '\n')
    fptr.close()
