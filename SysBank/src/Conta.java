public class Conta {
       private double saldo;
       private int agencia;
       private int numero;
       private String titular;
       private String cpf;
       private static int total;

       public Conta(int agencia, int numero, String titular, String cpf){
           Conta.total++;
           this.agencia = agencia;
           this.numero = numero;
           this.titular = titular;
           this.cpf = cpf;
       }

        public void depositar (double valor){
                this.saldo += valor;
        }

        public boolean sacar (double valorSacado){
                if(this.saldo >= valorSacado){
                        this.saldo -= valorSacado;
                        return true;
                }else{
                        return false;
                }
        }

        public boolean transferir(double valor, Conta destino){
                if(this.saldo >= valor){
                        this.saldo -= valor;
                        destino.depositar(valor);
                        System.out.println("Transferencia feito com sucesso!");
                        return true;
                }else{
                        System.out.println("Transferencia falhou!");
                        return false;
                }
        }
        public double getSaldo(){
           System.out.print("O saldo da sua conta é de ");
                return this.saldo;
        }
        public int getNumero(){
                return  this.numero;
        }
        public void setNumero(int numero){
            if(numero <= 0){
                System.out.println("Número da conta não pode ser negativo!");
                return;
            }
                this.numero = numero;
        }
        public int getAgencia(){
                return this.agencia;
        }
        public void setAgencia(int agencia){
            if(agencia <= 0){
                System.out.println("O valor da agência não pode ser negativo!");
                return;
            }
                this.agencia = agencia;
        }

        public String getTitular() {
                return this.titular;
        }

        public void setTitular(String titular) {
                this.titular = titular;
        }
        public String getCpf(){
           return this.cpf;
        }
        public void setCpf(String cpf){
           this.cpf = cpf;
        }
        public static int getTotal(){
           System.out.print("O total de contas criadas é de ");
           return Conta.total;
        }
}
