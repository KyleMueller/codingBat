def hello_name(name):
  return "Hello " + name + "!"

def make_abba(a, b):
  return a + b + b + a

def make_tags(tag, word):
  ftag = "<" + tag + ">"
  btag = "</" + tag + ">"
  return ftag + word + btag

def make_out_word(out, word):
  half = len(out)/2
  return out[0:half] + word + out[half:len(out)]

def extra_end(str):
  if len(str) <= 2:
    return str + str + str
  en = str[len(str) - 2: len(str)]
  return en + en + en

def first_two(str):
  if len(str) <= 2:
    return str
  return str[0:2]

def first_half(str):
  half = len(str)/2
  return str[0:half]

def without_end(str):
  if len(str) <= 2:
    return ""
  return str[1:len(str)-1]

def combo_string(a, b):
  if len(a) > len(b):
    return b + a + b
  return a + b + a

def non_start(a, b):
  return a[1:len(a)] + b[1:len(b)]

def left2(str):
  if len(str) == 2:
    return str
  fr = str[0:2]
  return str[2:len(str)] + fr
