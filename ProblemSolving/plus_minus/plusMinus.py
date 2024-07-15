#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    positive_count = 0
    negative_count = 0
    zero_count = 0
    total_count = len(arr)
    
    for i in range(total_count):
        if arr[i] > 0:
            positive_count += 1
        elif arr[i] < 0:
            negative_count += 1
        else:
            zero_count += 1
    
    positives = positive_count / total_count
    negatives = negative_count / total_count
    zeroes = zero_count / total_count
    print('%.6f' % positives)
    print('%.6f' % negatives)
    print('%.6f' % zeroes)
     
        

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)