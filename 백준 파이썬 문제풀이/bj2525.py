import sys

h, m = map(int, sys.stdin.readline().split())
min = int(sys.stdin.readline())
total = h*60 + m + min
hh = total//60
mm = total%60

if hh > 24:
    hh = hh//24 + hh%24

elif hh == 24:
    hh = 0

print(hh, mm)