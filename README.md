# Java Spring Start Project
 This is my first java spring project to learn it.

# Starting the Project
'java -jar <current demo name>'

# Currently There Is Only Local DataBase. So Closing Program Will Delete All Data

# Testing it via Postman or other programs

# Addding Person
After switching to body and raw type, add name and age as a json file. Name is string and age is integer.
Example Json Data:
'{
    "name":"Can",
    "age":21
}'

POST 'localhost:8080/api/v1/person'

# Getting Data By ID
GET 'localhost:8080/api/v1/person/<Spesific ID>'

# Getting All Data
GET 'localhost:8080/api/v1/person'

# Updating Person By ID
You need to do same configurations as Adding Perosn
PUT 'localhost:8080/api/v1/person/<Spesific ID>'

# Deleting Person By ID
'localhost:8080/api/v1/person/<Spesific ID>'