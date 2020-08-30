def sleep_in(weekday, vacation):
  if not weekday or vacation:
    return True
  return False

def monkey_trouble(a_smile, b_smile):
  if a_smile == b_smile:
    return True
  return False

def sum_double(a, b):
  if a == b:
    return (a + b) * 2
  return (a+b)

def diff21(n):
  if n > 21:
    return abs(n - 21) * 2
  return abs(n - 21)

def parrot_trouble(talking, hour):
  if talking:
    if hour > 20 or hour < 7:
      return True
  return False

def makes10(a, b):
  if a == 10 or b == 10:
    return True
  if a + b == 10:
    return True
  return False

def near_hundred(n):
  if abs(n - 100) <= 10:
    return True
  if abs(n - 200) <= 10:
    return True
  return False

def pos_neg(a, b, negative):
  if negative:
    if a < 0 and b < 0:
      return True
    return False
  else:
    if a > 0 and b < 0:
      return True
    if a < 0 and b > 0:
      return True
    return False

def not_string(str):
  s = str[0:3]
  if s == "not":
    return str
  return "not " + str

def missing_char(str, n):
  return str[0:n] + str[n + 1:]

def front_back(str):
  if len(str) <= 1:
    return str
  middle = str[1:len(str) -1]
  return str[len(str) - 1] + middle + str[0]

def front3(str):
  if len(str) <= 3:
    return str + str + str
  prefix = str[0:3]
  return prefix + prefix + prefix