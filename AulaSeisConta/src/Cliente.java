public class Cliente {

    private String numero;
    private String nome;
    private String sobrenome;
    private String rg;
    private String cpf;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimirDados(){
        System.out.println("Nome: "+ nome + " " +sobrenome);
        System.out.println("Numero RG: "+rg);
        System.out.println("Numero CPF: "+cpf);
        System.out.println("Numero da Conta: "+numero);
    }
}
