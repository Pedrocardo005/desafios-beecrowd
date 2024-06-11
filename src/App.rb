s = 1.0
numerador = 3
divisor = 2

while (numerador <= 39) {
  s += (numerador / divisor.to_f)

  numerador += 2
  divisor *= 2
}

puts "#{s.round(2)}"
