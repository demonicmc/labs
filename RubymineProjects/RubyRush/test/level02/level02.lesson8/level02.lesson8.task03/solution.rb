=begin
Минимум трех чисел
Написать функцию, которая вычисляет минимум из трёх чисел.
=end
def min_of_third (a, b, c)
  min = a
  num1 = b
  num2 = c

  res = 0
  if min > num1 && min < num2
     res = num1
  elsif min > num2 && min < num1
     res = num2
  elsif min < num2 && min < num1
     res = min
  elsif min > num1 && min > num2 && num1 > num2
     res = num2
  elsif min > num1 && min > num2 && num2 > num1
     res = num1
  elsif min == num1 && min == num2
     res = num1
  end
  res
end

puts min_of_third(1,1, 1).to_s