public class CaixaEletronico {
    public static void main(String[] args) {
        // CaixaEletronico.java
       double saldo = 25.0;
       double valorSolicitado = 16.0;

       if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        }
        else {
            System.out.println("Saldo insuficiente");
        }
        

       
    }
}
