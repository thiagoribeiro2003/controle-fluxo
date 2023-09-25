// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {

       int nota = 6;
       
       /* 
        if(nota >= 7) {
                System.out.println("Aprovado");
        } else if(nota >=5 && nota<7){ // true or false
                System.out.println("Recuperação");
        } else {
                System.out.println("Reprovado");
        }
       */

    // Exemplo usando operador ternário
        /* Perceba que usando o ternário na declaração da variável
           ja fazemos a condição, sendo:
            1 - Estabelecer condição
            2 - ? (Para mostrar o resultado de uma condição)
            3 - O primeiro comando depois do primeiro ? é se a condição for verdadeira
            4 - : funciona como se fosse uma elseif ou else, mostrando uma nova condição ou a ultima condição caso nenhuma das outras tenha sido atingida 
        */
      // String resultado = nota >=7 ? "Aprovado" : "Reprovado";
      // System.out.println(resultado);

       // Cenário 2
       String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);

    }
}