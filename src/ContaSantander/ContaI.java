package ContaSantander;

public class ContaI {

    String titular;
    int numero;
    String agencia;
    double saldo;
    String abertura;

    public ContaI(String titulas, int numero, String agencia, double saldo, String abertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.abertura = abertura;
    }

    public ContaI() {

    }

    public String getTitulas() {
        return titular;
    }

    public void setTitulas(String titulas) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public void sacar(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    public void depositar(double quantidade){
        this.saldo += quantidade;
    }

    public boolean saca(double valor){
        if (this.saldo < valor){
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    @Override
    public String toString() {
        return "ContaI{" +
                "titulas='" + titular + '\'' +
                ", numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", abertura='" + abertura + '\'' +
                '}';
    }
}

