
# /* Реализовать метод setCatsCount
# Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать
# значение переменной catsCount равное переданному параметру.
# */

class Cat
  @@catsCount = 0

  attr_accessor :catsCount
end

cat = Cat.new

cat.catsCount = 23
p cat.catsCount