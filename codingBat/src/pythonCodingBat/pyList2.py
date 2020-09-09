def count_evens(nums):
  count = 0
  for num in nums:
    if num % 2 == 0:
      count = count + 1
  return count

def big_diff(nums):
  lo = nums[0]
  hi = nums[0]
  for x in nums:
    lo = min(lo,x)
    hi = max(hi,x)
  return (hi - lo)

def centered_average(nums):
  lo = nums[0]
  hi = nums[0]
  sum = 0
  for x in nums:
    lo = min(lo,x)
    hi = max(hi,x)
    sum = sum + x
  return (sum - hi - lo)/(len(nums) - 2)

def sum13(nums):
  if len(nums) == 0:
    return 0
  count = 0
  for x in range(0, len(nums)):
    if nums[x] != 13:
      count = count + nums[x]
    else:
      if x +1 < len(nums):
        nums[x+1] = 0
  return count

def sum67(nums):
  count = 0
  for x in range (0, len(nums)):
    if nums[x] == 6:
      for y in range(x, len(nums)):
        if nums[y] == 7:
          nums[y] = 0
          break
        nums[y] = 0
    else:
      count = count + nums[x]
  return count

def has22(nums):
  for x in range(0,len(nums) -1):
    if nums[x] == 2 and nums[x+1] == 2:
      return True
  return False