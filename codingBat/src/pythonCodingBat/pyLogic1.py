def cigar_party(cigars, is_weekend):
  if is_weekend:
    if cigars >= 40:
      return True
    return False
  else:
    if cigars >= 40 and cigars <= 60:
      return True
    return False

def date_fashion(you, date):
  hi = max(you,date)
  lo = min(you,date)
  if lo < 3:
    return 0
  if hi >= 8:
    return 2
  return 1

def squirrel_play(temp, is_summer):
  hi = 90
  if is_summer:
    hi = 100
  if temp >= 60 and temp <= hi:
    return True
  return False

def caught_speeding(speed, is_birthday):
  hi = 80
  lo = 60
  if is_birthday:
    hi = 85
    lo = 65
  if speed <= lo:
    return 0
  if speed <= hi:
    return 1
  return 2

def sorta_sum(a, b):
  sum = a + b
  if sum <= 19 and sum >= 10:
    return 20
  return sum

def alarm_clock(day, vacation):
  if vacation:
    if day == 0 or day == 6:
      return "off"
    return "10:00"
  if day == 0 or day == 6:
    return "10:00"
  return "7:00"

def love6(a, b):
  if a == 6 or b == 6:
    return True
  if a + b == 6 or abs(a-b) == 6:
    return True
  return False

def in1to10(n, outside_mode):
  if outside_mode:
    if n <= 1 or n >= 10:
      return True
  else:
    if n >= 1 and n <= 10:
      return True
  return False

def near_ten(num):
  if num%10 < 3 or num%10 >= 8:
    return True
  return False




