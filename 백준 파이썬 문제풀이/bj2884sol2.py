h, m = map(int, input().split())
total = h * 60 + m
if total < 45:
    total = 1440 + total - 45
else:
    total = total - 45
    h = total // 60
    m = total % 60
print(h,m)