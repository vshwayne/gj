package tickets.entities;

/**
 * Created by vipul.k on 11/5/20.
 */
public class TicketType {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TicketActionType getTicketActionType() {
        return ticketActionType;
    }

    public void setTicketActionType(TicketActionType ticketActionType) {
        this.ticketActionType = ticketActionType;
    }

    private TicketActionType ticketActionType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TicketType)) return false;

        TicketType that = (TicketType) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return ticketActionType == that.ticketActionType;
    }



}
