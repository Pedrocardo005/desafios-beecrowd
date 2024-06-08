s = 1.0

for n in 2..100
  s = s + (1.0 / n)
end

puts "#{s.round(2)}"
