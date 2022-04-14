package posnet;

public class Posnet {

    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTA = 1;
    public static final int MAX_CANT_CUOTA = 6;

    public Posnet() {
        
    }

    public Ticket efectuarPago(TarjetaDeCredito tarjetaDeCredito, double montoPagar, int cantCuotas){
        Ticket ticket=null;
        
        if(validarDatos(tarjetaDeCredito, montoPagar, cantCuotas)){
            double montoFinal = montoPagar + montoPagar * recargoPorCuota(cantCuotas);
            
            if(tarjetaDeCredito.tieneSaldoDisponible(montoFinal)){
                
                tarjetaDeCredito.descontar(montoFinal);
                
                double montoPorCuota = montoFinal / cantCuotas;
                
                String nombreCompleto = tarjetaDeCredito.getNombreCompleto();
                
                ticket = new Ticket(nombreCompleto, montoFinal, montoPorCuota);
                
            }
        }
        
        return ticket;
    }

    private boolean validarDatos(TarjetaDeCredito tarjetaDeCredito, double montoPagar, int cantCuotas){
        boolean isTarjetaValida = false, isMontoPagar = true, isCantCuota = false;
        
        if(tarjetaDeCredito != null){
            isTarjetaValida = true;
        }
        if(montoPagar >= 0){
            isMontoPagar = true;
        }
        if((cantCuotas >= MIN_CANT_CUOTA) && (cantCuotas <= MAX_CANT_CUOTA)){
            isCantCuota = true;
        }
        
        return isTarjetaValida && isMontoPagar && isCantCuota;
    }

    private double recargoPorCuota(int cantCuotas) {
        return (cantCuotas - 1) * RECARGO_POR_CUOTA;
    }
    
}
