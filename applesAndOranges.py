#!/bin/python

import math
import os
import random
import re
import sys

# Complete the countApplesAndOranges function below.
def countApplesAndOranges(s, t, a, b, apples, oranges):

    st = raw_input().split()
    s = int(st[0])
    t = int(st[1])
    ab = raw_input().split()
    a = int(ab[0])
    b = int(ab[1])
    mn = raw_input().split()
    m = int(mn[0])
    n = int(mn[1])
    apples = map(int, raw_input().rstrip().split())
    oranges = map(int, raw_input().rstrip().split())
    print('mocos')
        
s=0
t=0
a=0
b=0
apples=[1,2]
oranges=[1,2]
countApplesAndOranges(s, t, a, b, apples, oranges)
