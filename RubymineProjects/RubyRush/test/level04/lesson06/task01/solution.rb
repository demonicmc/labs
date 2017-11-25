# /* Минимум двух чисел
# Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
# */

class Solution
  def Solution.min2(numb1, numb2)
    if numb1 > numb2
      return numb2
    else
      return numb1
    end
  end
end

numb1 = gets.chomp
numb2 = gets.chomp

puts Solution.min2(numb1, numb2)