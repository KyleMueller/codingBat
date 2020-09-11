def double_char(str):
  ret = ""
  for x in range (0,len(str)):
    ret = ret + str[x] + str[x]
  return ret

def count_hi(str):
  count = 0
  for x in range(0,len(str) -1):
    if str[x:x+2] == "hi":
      count = count + 1
  return count

def cat_dog(str):
  cats = 0
  dogs = 0
  for x in range(0, len(str) - 2):
    if str[x:x+3] == "cat":
      cats = cats + 1
    if str[x:x+3] == "dog":
      dogs = dogs + 1
  if cats == dogs:
    return True
  return False

def count_code(str):
  count = 0
  for x in range(0,len(str) - 3):
    if str[x:x+2] == "co" and str[x+3] == "e":
      count = count + 1
  return count

def end_other(a, b):
  if len(a) < len(b):
    lo = a.lower()
    hi = b.lower()
  else:
    lo = b.lower()
    hi = a.lower()
  if hi[len(hi) - len(lo):] == lo:
    return True
  return False

def xyz_there(str):
  for x in range(0,len(str) - 2):
    if str[x:x+3] == "xyz":
      if x == 0:
        return True
      elif str[x-1] != ".":
        return True
  return False