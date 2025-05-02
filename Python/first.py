# in pyhton list are mutalble
# in pyhton tuple are in immutable

# ----- 1st

# a = int (input("enter the value of a: "))
# b = int (input("enter the value of b: "))
# c = a+b
# print(c)

# ----- 2nd

# x = 5
# for i in range(1,11) :
#     print(x , "X" , i , "=" , x*i)

# ----- 3rd

# a = int (input("enter the value of a: "))
# if a%2 == 0 :
#   print("a is even")
# else :
#   print("a is odd")

# ----- 4rth

# Arr = [10 ,5 , 9 , 7 , 8 , 45 ]
# for i in Arr:
#     if i%2 == 0 :
#         print(i ,"is even")
#     else :
#         print(i ,"is odd")

# ----- 5th

# x  = [int (x) for x in input().split()]
# for i in x :
#     print("the value u entered was:" , i)
# avg = 0
# count = 0
# for i in x:
#     avg += i
# result = avg / len(x)
# print(result)

# ----- 6th

# dic = {"a":1 , "b":2 , "c":3}
# for i in dic :
#   print(i)
#   print(dic[i])

# ----- 7th

#dic = {"a":1 , "b":2 , "c":3}
#for key,value in dic.items():
#    print("key = {} and value = {}".format(key,value))

# ----- 8th

# import pandas
# # convert into dataframe
# dic = {"name":["a","b","c"],"age":[4,5,6]}
# data = pandas.DataFrame(dic)
# #print (data)
# print(data[" age"])

# ----- 9th

# import pandas
# # convert into dataframe
# dic = {"name":["a","b","c"],"age":[4,5,6]}
# data = pandas.DataFrame(dic)
# age = data["age"]
# print("max is: ",max(age))
# print("min is: ",min(age))
# print("mean is: ",age.mean())