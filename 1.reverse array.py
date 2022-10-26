# -*- coding: utf-8 -*-
"""
Created on Fri Jul  9 22:38:56 2021

@author: subha
"""

#to reverse an array
#Python arrays are much faster than list as it uses less memory
import array
def reverse():
    arr = array.array('i', [1,2,3,4,5,6])
    arr.reverse()
    print(arr)

if __name__=='__main__':
    reverse()