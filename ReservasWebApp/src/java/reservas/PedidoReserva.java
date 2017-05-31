/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservas;


public class PedidoReserva {
    private Reserva reserva;

    public PedidoReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    /**
     * @return the reserva
     */
    public Reserva getReserva() {
        return reserva;
    }

    /**
     * @param reserva the reserva to set
     */
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    
}
