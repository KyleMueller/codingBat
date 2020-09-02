def first_last6(nums):
  if nums[0] == 6 or nums[len(nums)-1] == 6:
    return True
  return False

def same_first_last(nums):
  if len(nums) < 1:
    return False
  if nums[0] == nums[len(nums) -1]:
    return True
  return False

def make_pi():
  pi = [3,1,4]
  return pi

def common_end(a, b):
  if a[0] == b[0]:
    return True
  if a[len(a)-1] == b[len(b) - 1]:
    return True
  return False

def sum3(nums):
  sum = 0
  for x in nums:
    sum = sum + x
  return sum

def rotate_left3(nums):
  temp = nums[0]
  nums[0] = nums[1]
  nums[1] = nums[2]
  nums[2] = temp
  return nums

def reverse3(nums):
  temp = nums[2]
  nums[2] = nums[0]
  nums[0] = temp
  return nums

def max_end3(nums):
  val = max(nums[0], nums[2])
  for x in range(0,3):
    nums[x] = val
  return nums

def sum2(nums):
  if len(nums) == 0:
    return 0
  if len(nums) == 1:
    return nums[0]
  return nums[0] + nums[1]

def middle_way(a, b):
  return [a[1],b[1]]

def make_ends(nums):
  return [nums[0],nums[len(nums) -1]]

def has23(nums):
  for x in nums:
    if x == 2 or x == 3:
      return True
  return False
