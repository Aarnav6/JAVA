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

# import pandas as pd
# import random
# import matplotlib.pyplot as plt
# 
# # Define moods and emojis
# moods = {
#     "Happy": "😊",
#     "Sad": "😢",
#     "Excited": "🤩",
#     "Tired": "🥱",
#     "Stressed": "😫",
#     "Chill": "😎"
# }
# 
# # Generate random mood data for a week
# days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
# week_moods = [random.choice(list(moods.keys())) for _ in days]
# 
# # Create DataFrame
# df = pd.DataFrame({"Day": days, "Mood": week_moods})
# df["Emoji"] = df["Mood"].map(moods)
# 
# # Print table nicely
# print("\n🌟 Your Mood Tracker for the Week 🌟\n")
# print(df.to_string(index=False))
# 
# # Plot mood trend
# mood_values = {mood: i for i, mood in enumerate(moods.keys())}
# df["MoodIndex"] = df["Mood"].map(mood_values)
# 
# plt.figure(figsize=(10, 5))
# plt.plot(df["Day"], df["MoodIndex"], marker='o', linestyle='-', color='purple')
# plt.title("Weekly Mood Vibe 🎵")
# plt.xlabel("Day")
# plt.ylabel("Mood")
# plt.yticks(list(mood_values.values()), list(mood_values.keys()))
# plt.grid(True)
# plt.show()


import pandas
# convert into dataframe
dic = {"name":["a","b","c"],"age":[4,5,6]}
data = pandas.DataFrame(dic)
age = data["age"]
print("max is: ",max(age))
print("min is: ",min(age))
print("mean is: ",age.mean())
