
# /* Реализовать метод addNewCat
# Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота), количество котов увеличивалось на 1.
# За количество котов отвечает переменная catsCount.
# */

class Cat
  @@catsCount = 0

  def getcatsCount
    @@catsCount
  end

  def addNewCat()
    @@catsCount += 1
  end

end

cat = Cat.new()

cat.addNewCat
cat.addNewCat

p cat.getcatsCount