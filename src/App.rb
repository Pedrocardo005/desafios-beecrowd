entrada = gets.chomp.to_i
pares = []
posicao_array = 0

while entrada != 0
  pares_encontrados = 0
  _valores = entrada
  while pares_encontrados < 5
    if _valores % 2 == 0
      if pares[posicao_array].nil?
        pares[posicao_array] = _valores
      else
        pares[posicao_array] += _valores
      end
      pares_encontrados += 1
    end
    _valores += 1
  end

  puts pares[posicao_array]
  posicao_array += 1
  entrada = gets.chomp.to_i
end