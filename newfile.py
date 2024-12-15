def health_check():
    
    fever = input("Do you have a fever? (yes/no): ").lower()
    cough = input("Do you have a cough? (yes/no): ").lower()
    breathing_difficulty = input("Do you have difficulty in breathing? (yes/no): ").lower()

    if fever == 'yes':
        print("You reported having a fever.")
    else:
        print("You reported not having a fever.")
    
    if cough == 'yes':
        print("You reported having a cough.")
    else:
        print("You reported not having a cough.")
    
    if breathing_difficulty == 'yes':
        print("You reported having difficulty in breathing.")
    else:
        print("You reported not having difficulty in breathing.")

health_check()
