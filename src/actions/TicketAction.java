package actions;

import tickets.entities.TicketEntity;
import tickets.entities.TicketType;

/**
 * Created by vipul.k on 11/5/20.
 */
public interface TicketAction {

    TicketType getTicketType();
    void doAction(TicketEntity ticketEntity);
}
