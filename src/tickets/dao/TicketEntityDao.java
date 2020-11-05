package tickets.dao;

import tickets.entities.TicketEntity;
import tickets.entities.TicketStatus;

import java.util.List;
import java.util.Optional;

/**
 * Created by vipul.k on 11/5/20.
 */
public interface TicketEntityDao {

    Optional<TicketEntity> get(int id);
    TicketEntity create(TicketEntity ticketEntity);
    TicketEntity update(TicketEntity ticketEntity);
    List<TicketEntity> getAll();

}
