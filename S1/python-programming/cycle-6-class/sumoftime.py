class Time:
    def __init__(self,hour,min,sec):
        self.hour=hour
        self.min=min
        self.sec=sec
    def __add__(self,other):
        secs=self.to_secs()+other.to_secs()
        return Time.from_secs(secs)
    def to_secs(self):
        return self.hour*3600+self.min*60+self.sec
    @staticmethod
    def from_secs(secs):
        hour=secs//3600
        secs%=3600
        min=secs//60
        sec=secs%60
        return Time(hour,min,sec)
    def display(self):
        print(f"{self.hour:02d}:{self.min:02d}:{self.sec:02d}")

print("Time 1")
hr1=int(input("Enter hours:"))
min1=int(input("Enter minutes:"))
sec1=int(input("Enter seconds:"))
time1=Time(hr1,min1,sec1)

print("Time 2")
hr2=int(input("Enter hours:"))
min2=int(input("Enter minutes:"))
sec2=int(input("Enter seconds:"))
time2=Time(hr2,min2,sec2)
time3=time1+time2

print("Sum of times:")
time3.display()