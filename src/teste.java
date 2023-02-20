public class teste {
    public static void main(String[] args) {
        
        Cliente clodoaldo = new Cliente();
        clodoaldo.setNome("Clodoaldo");
        Cliente edson = new Cliente();
        edson.setNome("Edson");


        Conta contaCorrente = new ContaCorrente(clodoaldo);
        contaCorrente.depositar(100);
        Conta contaPoupanca = new ContaPoupança(clodoaldo);
        contaCorrente.transferir(80,contaPoupanca);

        Conta contaCorrente2 = new ContaCorrente(edson);
        Conta contaPoupanca2 = new ContaPoupança(edson); 
        
        contaCorrente2.imprimirExtrato();
        contaPoupanca2.imprimirExtrato();
        
      
        

        
    }
}
