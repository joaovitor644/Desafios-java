<?php
    
    function media($cont){
        $num = 0;
        $som = 0;
        $i = 0;
        while($i < $cont){
            echo "Digite um número:";
            $num = fgets(STDIN);
            $som = $som + intval($num);
            $i++;
        }

        $med = $som / $cont;

        return  "A media dos valores é $med";
    }

   $m = media(4);

   echo $m;

?>