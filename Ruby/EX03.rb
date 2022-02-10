def TableM(num)
    cont = 0

    while cont <= 10 
        res = num * cont
        puts num.to_s + " X " + cont.to_s + " = " + res.to_s
        cont += 1
    end
end

puts "digite um numero:"
n1 = gets.chomp.to_i;
TableM(n1);


