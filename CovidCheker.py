correctFirst = "yes"
correctSecond = "yes"
correctThird = "yes"

retry = "Yes"

while retry.lower() == "yes":
    
    typeFirst = input("Do you have a fever? ")
    typeSecond = input("Do you have cough? ")
    typeThird = input("Do you have difficulty in breathing? ")

    if typeFirst.lower() == correctFirst or typeSecond.lower() == correctSecond or typeThird.lower() == correctThird:
        print("You may have COVID-19 symptoms. Please consult a healthcare professional.")
    else:
        print("You do not exhibit significant COVID-19 symptoms. Stay safe!")
    
    retry = input("Do you want to check symptoms again? ")