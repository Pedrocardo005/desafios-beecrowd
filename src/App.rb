numero = gets.chomp.to_i
divisor = 1

while divisor <= numero
  if numero % divisor == 0
    puts divisor
  end

  divisor += 1
end

