def string_times(str, n):
  ret = ""
  for x in range(n):
    ret = ret + str
  return ret

def front_times(str, n):
  front = ""
  if len(str) <= 3:
    front = str
  else:
    front = str[0:3]
  ret = ""
  for x in range(n):
    ret = ret + front
  return ret

def string_bits(str):
  ret = ""
  for x in range(len(str)):
    if x%2 == 0:
      ret = ret + str[x]
  return ret

def string_splosion(str):
  ret = ""
  for x in range(len(str) + 1):
    ret = ret + str[0:x]
  return ret

def last2(str):
  count = -1
  if len(str) == 0:
    return 0
  back = str[len(str) - 2:len(str)]
  for x in range(len(str)):
    if str[x:x+2] == back:
      count = count + 1
  return count

def array_count9(nums):
  count = 0
  for x in range (len(nums)):
    if nums[x] == 9:
      count = count + 1
  return count

def array_front9(nums):
  if len(nums) <= 4:
    for x in range(len(nums)):
      if nums[x] == 9:
        return True
    return False
  
  for x in range(4):
    if nums[x] == 9:
      return True
  return False

def array123(nums):
  for x in range(len(nums) - 2):
    if nums[x] == 1 and nums[x + 1] == 2 and nums[x + 2] == 3:
      return True
  return False

def string_match(a, b):
  min = 0
  if len(a) > len(b):
    min = len(b)
  else:
    min = len(a)
    
  count = 0
  for x in range(min - 1):
    if a[x:x+2] == b[x:x+2]:
      count = count + 1
  return count
