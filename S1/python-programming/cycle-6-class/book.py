class Publisher:
    def __init__(self,pid,pname):
        self.pid=pid
        self.pname=pname
    def display(self):
        print(f"Publisher ID: {self.pid}\nPublisher Name: {self.pname}")

class Book(Publisher):
    def __init__(self,pid,pname,title,author):
        super().__init__(pid,pname)
        self.title=title
        self.author=author
    def display(self):
        super().display()
        print(f"Title: {self.title}\nAuthor: {self.author}")

class Python(Book):
    def __init__(self,pid,pname,title,author,price,pages):
        super().__init__(pid,pname,title,author)
        self.price=price
        self.pages=pages
    def display(self):
        super().display()
        print(f"Price: {self.price}\nPages: {self.pages}")

pid=int(input("Enter publisher ID:"))
pname=input("Enter publisher name:")
title=input("Enter book title:")
author=input("Enter author name:")
price=float(input("Enter price:"))
pages=int(input("Enter number of pages:"))

book=Python(pid,pname,title,author,price,pages)
book.display()
