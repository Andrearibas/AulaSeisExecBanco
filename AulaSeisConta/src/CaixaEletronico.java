public class CaixaEletronico {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        cliente.setNome("Andrea");
        cliente.setSobrenome("Gomes Ribas");
        cliente.setCpf("123.456.789-10");
        cliente.setRg("12.345.678-1");
        cliente.setNumero("65432-1");

        cliente.imprimirDados();

        contaCorrente.setSaldo(300F);
        contaCorrente.setCliente(cliente);
        contaCorrente.setLimiteChequeEspecial(4F);

    }
}
