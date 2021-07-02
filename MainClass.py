a = 0
b = 1
c = 1
        
iterations = input()
print("")
for i in range(int(iterations)):
  c = b + a
  a = b
  b = c
  for d in range(c):
    print("#", end="")
  print(c)
