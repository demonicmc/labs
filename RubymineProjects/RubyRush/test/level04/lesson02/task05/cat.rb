# /* Подсчитать количество котов
# Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильно их количество.
# */

class Cat
  @@count = 0

  def initialize
    @@count += 1
  end

  def Cat.count
    @@count
  end
end

cat1 = Cat.new
cat2 = Cat.new
cat3 = Cat.new

puts Cat.count