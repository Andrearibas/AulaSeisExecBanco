public class Conta {

    private Float saldo;
    private Cliente cliente;

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void sacar(Float quantiaDinheiro){
        if (saldo>=quantiaDinheiro){
            saldo = saldo - quantiaDinheiro;
            System.out.println("Saque Efetuado");
            System.out.println("Seu novo saldo é R$ "+saldo);
        }else {
            System.out.println("Saldo infuficiente para saque: R$ "+saldo);
        }
    }

    public void depositar(Float quantiaDinheiro){
        this.saldo = saldo + quantiaDinheiro;
        System.out.println("Deposito efetuado com sucesso");
        System.out.println("Seu novo saldo é R$ "+saldo);
    }

    public void imprimirSaldo(){
        System.out.println(saldo);
    }
}
