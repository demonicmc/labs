# /* Реализовать метод setName
# Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной
# private String name равное переданному параметру String name.
# */

class Cat1
  @name

  def name(name)
    @name = name
  end

  def getname
    @name
  end
end

n = Cat1.new
n.name("odin")
p n.getname

# n.name = "Alex"
# p n