def media(cont)
    som = 0
    i = 0

    while i < cont
        puts "digite um numero:"
        num = gets.chomp.to_i
        som = som + num 
        i += 1
    end

    med = som / cont
    return puts "a média desses valores é " + med.to_s

end

media(5)