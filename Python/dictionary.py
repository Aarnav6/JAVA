import pandas as pd

data_dict = {
    "name": ["Aarav Sharma", "Meera Singh", "Kabir Verma", "Aadarsh Sahu", "Adhyatma Singh Chouhan"],
    "enrollment_no": [2023001, 2023002, 2023003, 2023004, 2023005],
    "age": [20, 19, 21, 18, 22],
    "marks": [8, 92, 75, 80, 95],
}

# Create DataFrame
data = pd.DataFrame(data_dict)
i = data["name"]
# Display full student data
print("Student Data:\n")
print(data)
