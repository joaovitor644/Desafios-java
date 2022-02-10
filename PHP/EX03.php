<?php 


function tableMultiply($num){
    $cont = 0;

    while($cont <= 10){
        $res = $num * $cont;
        echo $num . " X " . $cont . " = " . $res . "\n";
        $cont++;			
    }
}

tableMultiply(15);