package actions;

import tickets.entities.TicketEntity;
import tickets.entities.TicketType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActionsRegistry {

    private Map<TicketType, TicketAction> regsitry = new HashMap<>();

    public ActionsRegistry(List<TicketAction> ticketActions) {
        ticketActions.forEach(t -> {

            // TODO: setup validations that the ticket ype has action type = automated, ony then proceed.
            if (regsitry.get(t.getTicketType()) != null) {
                throw new RuntimeException("Multiple impl found for type " + String.valueOf(t.getTicketType()));
            }
            regsitry.put(t.getTicketType(), t);

        });
    }


    public void doAction(TicketEntity ticketEntity) {
        if (regsitry.get(ticketEntity.getType()) == null) {
            throw new UnsupportedOperationException("Action not supported for type " + ticketEntity.getType());
        }
        regsitry.get(ticketEntity.getType()).doAction(ticketEntity);
    }
}
