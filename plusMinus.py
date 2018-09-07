#!/bin/python

import math
import os
import random
import re
import sys
from decimal import *


# Complete the plusMinus function below.
def plusMinus(arr):  
    getcontext().prec = 6
    positives = 0.000000
    negatives = 0.000000
    neutro = 0.000000    
    for e1 in arr:
        if e1 > 0:
            positives = positives + 1
        if e1 == 0:
            neutro = neutro + 1
        if e1 < 0:
            negatives = negatives + 1
    print(positives / n)
    print(negatives / n)
    print(neutro / n)

if __name__ == '__main__':
    n = int(raw_input())

    arr = map(int, raw_input().rstrip().split())

    plusMinus(arr)
 
