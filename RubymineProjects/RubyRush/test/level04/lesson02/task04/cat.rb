
# /* Реализовать метод setName
# Реализовать метод setName, чтобы с его помощью можно было
# устанавливать значение переменной private String fullName равное значению локальной переменной String fullName.
# */

class Cat
  @fullName
  attr_accessor :fullName
end

cat = Cat.new
cat.fullName = "Name"
p cat.fullName