package posnet;

public class Principal {

    public static void main(String[] args) {
        
        Posnet posnet = new Posnet();
        Persona titular = new Persona("4444", "José", "Perez", "1234-5678", "perez@gmail.com");
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito ("BBVA", "5555", 15000, titular, EntidadFinanciera.VISA);
        
        System.out.println(titular);
        
        System.out.println(tarjetaDeCredito);
        
        Ticket ticket = posnet.efectuarPago(tarjetaDeCredito, 10000, 5);
        
        System.out.println(tarjetaDeCredito);
        
        System.out.println(ticket);
        
    }
    
}