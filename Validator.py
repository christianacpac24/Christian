import sys

def validator(username, password):
    defaultUsername = "Kurt"
    defaultPassword = "1234"
    if username == defaultUsername and password == defaultPassword:
        return "success"
    else:
        return "failed"

attempt = 1


while attempt < 6:
    username = input("Enter Username: ")
    password = input("Enter Password: ")
    status = validator(username, password)
    
    if status == "success":
        print("Login successful")
        sys.close(0)
    elif status == "failed":
        print("Login Failed! Try again")
        attempt += 1
    
    if attempt == 6:
        print(f"You have reached {attempt} attempts. Please try again later.")
        sys.close(0)