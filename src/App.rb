def funcao(numero, qtd_somas)
  numero_privado = numero
  soma = 0
  while qtd_somas > 0
    if numero_privado % 2 != 0
      soma += numero_privado
      qtd_somas = qtd_somas - 1
    end
    numero_privado = numero_privado + 1
  end
  soma
end

qtd_vezes=gets.chomp.to_i

resultados = []

while qtd_vezes > 0
  line = gets.chomp
  nums = line.split(" ")
  num_1 = nums[0].to_i
  num_2 = nums[1].to_i
  resultados.push(funcao(num_1, num_2))
  qtd_vezes = qtd_vezes - 1
end
result_sem_um = resultados.length - 1
for x in 0..result_sem_um
  puts "#{resultados[x]}"
end
