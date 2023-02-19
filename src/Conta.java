public class Conta implements iConta {
    
    private static int AgenciaPadrao;
    private static int sequencia = 1;
    public Conta(){
        this.agencia = AgenciaPadrao;
        this.numero = sequencia++;
    }

    
    public int agencia;
    public int numero;
    private double saldo;
    
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
        // TODO Auto-generated method stub
        
    }
    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        // TODO Auto-generated method stub
        
    }
    
}
