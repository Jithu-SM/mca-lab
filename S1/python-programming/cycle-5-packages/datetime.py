import time as t
import datetime as dt
ctime=t.ctime()
date=dt.datetime.now()
print("Current date and time:",date)
print("Current year:",t.strptime(ctime)[0])
print("Month of the year:",date.strftime("%B"))
print("Week number of the year:",date.isocalendar()[1])
print("Weekday of the week:",date.strftime("%A"))
print("Day of year:",t.strptime(ctime)[7])
print("Day of month:",t.strptime(ctime)[2])
print("Day of week:",t.strptime(ctime)[6])