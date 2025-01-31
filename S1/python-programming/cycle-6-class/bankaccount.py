class Account:
    def __init__(self,name,acno,type,balance):
        self.name=name
        self.acno=acno
        self.type=type
        self.balance=balance
    def deposit(self,amount):
        self.balance+=amount
        print(f"{amount} deposited successfully\n New balance: {self.balance}")
    def withdraw(self,amount):
        if self.balance>=amount:
            self.balance-=amount
            print(f"{amount} withdrawn successfully \nRemaining balance:{self.balance}")
        else:
            print("Insufficient balance!")
    def display(self):
        print(f"Account Holder\t:{self.name}\nAccount Number\t:{self.acno}\nAccount Type\t:{self.type}\nBalance\t\t:{self.balance}")

name=input("Enter name:")
acno=input("Enter account number:")
type=input("Enter account type:")
cash=int(input("Enter Amount:"))
account=Account(name,acno,type,cash)

while(True):
    print("\n1.Deposit\n2.Withdraw\n3.Display Details\n4.Exit")
    choice=int(input("Enter your choice:"))
    if choice==1:
        amount=float(input("Enter amount to deposit:"))
        account.deposit(amount)
    elif choice==2:
        amount=float(input("Enter amount to withdraw:"))
        account.withdraw(amount)
    elif choice==3:
        account.display()
    elif choice==4:
        break
    else:
        print("Invalid choice!")
