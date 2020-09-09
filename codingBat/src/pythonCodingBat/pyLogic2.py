def make_bricks(small, big, goal):
  if goal <= big*5:
    goal = goal%5
  else:
    goal = goal - big*5
  if goal <= small:
    return True
  return False

def lone_sum(a, b, c):
  sum = 0
  if a != b and a != c:
    sum = sum + a
  if b != a and b != c:
    sum = sum + b
  if c != a and c != b:
    sum = sum + c
  return sum

def lucky_sum(a, b, c):
  sum = 0
  if a == 13:
    return 0
  sum = sum + a
  if b == 13:
    return sum
  sum = sum + b
  if c == 13:
    return sum
  return sum + c

def no_teen_sum(a, b, c):
  return fix_teen(a) + fix_teen(b) + fix_teen(c)
def fix_teen(n):
  if n <= 19 and n >= 13:
    if n == 15 or n == 16:
      return n
    else: 
      return 0
  return n

def round_sum(a, b, c):
  return round10(a) + round10(b) + round10(c)
def round10(n):
  if n%10 < 5:
    return n - n%5
  else:
    return n/10 * 10 + 10

def close_far(a, b, c):
  if abs(a-b) < 2 and abs(a-c) >= 2 and abs(c-b) >= 2:
    return True
  if abs(b-c) < 2 and abs(a-c) >= 2 and abs(a-b) >= 2:
    return True
  if abs(a-c) < 2 and abs(b-c) >= 2 and abs(a-b) >= 2:
    return True
  return False

def make_chocolate(small, big, goal):
  if goal < big *5:
    goal = goal%5
  else:
    goal = goal - big*5
  if goal > small:
    return -1
  return goal
