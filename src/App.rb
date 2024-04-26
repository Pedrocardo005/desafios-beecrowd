number = gets.chomp
number = number.to_i

lista = [0]

for i in 1..number
  number_buffer = gets.chomp
  lista[i] = number_buffer.to_i
end

for i in 1..number
  element = lista[i]

  if element == 0
    puts "NULL"
    next
  end

  if element.even?
    print "EVEN "
    if element > 0
      puts "POSITIVE"
    else
      puts "NEGATIVE"
    end
  else
    print "ODD "
    if element > 0
      puts "POSITIVE"
    else
      puts "NEGATIVE"
    end
  end
end
