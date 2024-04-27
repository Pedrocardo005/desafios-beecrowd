numero = gets.chomp
numero = numero.to_i

for n in 2..9999
  if n % numero == 2
    puts n
  end
end
