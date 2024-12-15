correctUsername = "Kurt"
correctPassword = "Keith"

balik = "Yes"

while balik.lower() == "yes":
  
    typeUsername = input("Enter Username: ")
    typePassword = input("Enter Password: ")
    
    
    if typeUsername == correctUsername and typePassword == correctPassword:
        print("Login successful")
        break
    else: print("Your Username and Password is incorrect") 
    
   
    balik = input("Do you want to try again?: ")