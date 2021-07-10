package com.belahsen.cinema.entities;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="ticketproj",types=Ticket.class)
public interface TicketProjection {
    public Long getId();
    public String GetNomClient();
    public double getPrix();
    public Integer codePayement();
    public boolean getReserve();
    public Place getPlace();
}
