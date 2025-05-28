# gcd : greatest common divisor code in python 

def greater (i , j) :
    if(i >= j):
        return i
    else :
        return j

def gcd (x , y):
    length = greater(x,y)
    res = 1
    for i in range(2 , length+1) :
        if(x%i==0 and y%i == 0) :
            res = i
    return res

a  = int (input("enter the 1st number: "))
b = int (input("enter the 2nd number: "))

res = gcd(a,b)        
print (res)