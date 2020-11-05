package tickets.dao;

import tickets.entities.TicketEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by vipul.k on 11/5/20.
 */
public class TicketEntityDaoImpl implements TicketEntityDao {

    List<TicketEntity> entities = new ArrayList<>();
    int idIncr = 0;

    @Override
    public Optional<TicketEntity> get(int id) {
        return entities.stream().filter(e -> e.getId() == id).findFirst();
    }

    @Override
    public List<TicketEntity> getAll() {
        return new ArrayList<>(entities);
    }

    @Override
    public TicketEntity create(TicketEntity ticketEntity) {
        if (ticketEntity == null) {
            return null;
        }
        // TODO : add validations to mimic db constarints, trhow exception in line above (Bad request)
        ticketEntity.setId(getId());
        entities.add(ticketEntity);
        return ticketEntity;
    }

    @Override
    public TicketEntity update(TicketEntity ticketEntity) {
        if (ticketEntity == null) {
            return null;
        }
        Optional<TicketEntity> tkt = entities.stream().filter(e -> e.getId() == ticketEntity.getId()).findAny();
        tkt.ifPresent(t -> {
            // copy properties
        });
        return ticketEntity;
    }

    private int getId() {
        synchronized (this) {
            idIncr++;
            return idIncr - 1;
        }
    }
}
