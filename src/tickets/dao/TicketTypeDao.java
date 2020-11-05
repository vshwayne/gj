package tickets.dao;

import tickets.entities.TicketType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by vipul.k on 11/5/20.
 */

// TODO : convert to interafce - impl model
public class TicketTypeDao {

    List<TicketType> entities = new ArrayList<>();

    public Optional<TicketType> getFromId(String id) {
        return entities.stream().filter(e -> e.getId().equals(id)).findFirst();
    }
}
