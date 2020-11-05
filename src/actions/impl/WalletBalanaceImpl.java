package actions.impl;

import actions.Constants;
import actions.TicketAction;
import tickets.dao.TicketTypeDao;
import tickets.entities.TicketEntity;
import tickets.entities.TicketType;

/**
 * Created by vipul.k on 11/5/20.
 */
public class WalletBalanaceImpl implements TicketAction {

    private TicketTypeDao ticketTypeDao;

    public WalletBalanaceImpl(TicketTypeDao ticketTypeDao) {
        this.ticketTypeDao = ticketTypeDao;
    }

    @Override
    public TicketType getTicketType() {
        // Will throw exception if correspoding type in dao not found
        return ticketTypeDao.getFromId(Constants.WALLET_TYPE_ACTION).get();
    }

    @Override
    public void doAction(TicketEntity ticketEntity) {
        System.out.println("Inside doAction WalletBalanaceImpl");
    }
}
