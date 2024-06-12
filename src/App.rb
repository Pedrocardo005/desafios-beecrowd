s = 1.0
numerador = 3.0
divisor = 2.0

while numerador <= 39
  s += numerador / divisor.to_f

  numerador += 2.0
  divisor *= 2.0
end

numero = sprintf('%.2f', s)
puts numero
