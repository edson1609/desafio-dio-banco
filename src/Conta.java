public class Conta implements iConta {
    
    private static int AgenciaPadrao =1;
    private static int sequencia = 1;
    
   
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AgenciaPadrao;
        this.numero = sequencia++;
        this.cliente = cliente;
    }
 
    
    public void sacar() {
       
        
    }
    public void depositar() {
        
    }
    public void transferir(){

    }
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    @Override
    public void sacar(double valor) {
        saldo -= valor;
        
    }
    @Override
    public void depositar(double valor) {
         saldo+=valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }
    protected void imprimirInfosComuns(){
        System.out.println(String.format("Agencia: %d",this.agencia ) );
        System.out.println(String.format("Número: %d",this.numero ) );
        System.out.println(String.format("Saldo: %2f",this.saldo ) );
        System.out.println(String.format("Titular: %s",this.cliente.getNome() ) );
    }   
    @Override
    public void imprimirExtrato() {
      
        
    }


    @Override
    public void imprimirClientes() {
       
    }
        


    
    
}
