=begin
Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Использовать функцию из задачи 1.
=end

def min_of_four(a, b, c, d)
  min1 = min_of_two(a,b)
  min2 = min_of_two(c,d)
  return min = min1 > min2 ? min2 : min1
end

def min_of_two(a,b)
  res = 0
  if a > b
    return res = b
  elsif b > a
    return res = a
  elsif a == b
    return res = a
  end
  return res
end

puts min_of_four(0,0,0,0)