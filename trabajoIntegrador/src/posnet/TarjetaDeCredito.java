package posnet;

public class TarjetaDeCredito {
    private String entidadBancaria;
    private String numeroTarjeta;
    private double saldo;
    public Persona titular;
    public EntidadFinanciera entidadFinanciera;

    public TarjetaDeCredito(String entidadBancaria, String numeroTarjeta, double saldo, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
        this.entidadFinanciera = entidadFinanciera;
    }

    @Override
    public String toString() {
        return "Tarjeta De Credito:" + "\nEntidad Bancaria: " + entidadBancaria + "\nNumero de Tarjeta: " + numeroTarjeta + "\nSaldo: " + saldo + titular + "\nEntidad Financiera: " + entidadFinanciera;
    }

    boolean tieneSaldoDisponible(double montoFinal) {
        return saldo >= montoFinal;
    }

    void descontar(double montoFinal) {
        saldo -= montoFinal;
    }

    String getNombreCompleto() {
        return titular.getNombre() + " " + titular.getApellido();
    }
    
}
