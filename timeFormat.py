#!/usr/bin/env python2
# -*- coding: utf-8 -*-
"""
Created on Sat Sep  8 18:55:31 2018

@author: skuarch
"""

import time
from time import gmtime, strftime

s = "07:05:45PM"
struct_time = time.strptime(s, "%I:%M:%S%p")
t = strftime("%H:%M:%S", struct_time)
print(t)