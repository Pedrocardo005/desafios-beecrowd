number = gets.chomp
number = number.to_i

for i in 1..number
  if i % 2 == 0
    quadrado = i * i
    puts "#{i}^2 = #{quadrado}"
  end
end
