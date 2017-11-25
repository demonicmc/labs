# /* Максимум четырех чисел
# Ввести с клавиатуры четыре числа, и вывести максимальное из них.
# */

class Solution

  def Solution.min4(numb1, numb2, numb3, numb4)

  a = Solution.min2(numb1, numb2)
  b = Solution.min2(numb3, numb4)
    if numb1 == numb2 && numb3 == numb4 && numb2 == numb4
      numb1
    elsif a > b
      b
    else
      a
    end
  end

  def Solution.min2(numb1, numb2)
    if numb1 > numb2
      numb2
    else numb1
    end
  end
end

n1 = gets.chomp
n2 = gets.chomp
n3 = gets.chomp
n4 = gets.chomp

puts Solution.min4(n1, n2, n3, n4)