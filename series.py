import os
#0,2,4,6,8....
#0,1,2,3,4,5...
def series_(index):
    oindex=index-1
#for i in range(oindex/2):
    if index%2==0:
        nth_term = 0+((round(oindex/2)-1)*1)
    else:
        nth_term = 0+((round(oindex/2)-1)*2)
    print(nth_term)

if __name__=='__main__':
    series_(10)