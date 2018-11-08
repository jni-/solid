package ca.ulaval.glo4002.solid_srp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTicketTest {
    private static final Float TICKET_PRICE = 20.0f;

    @Test
    public void whenNotAStudentTicket_thenStudentRebateIsNotApplied() {
        MovieTicket ticket = new AMovieTicket(TICKET_PRICE, false);

        assertEquals(TICKET_PRICE, ticket.getPrice());
    }

    @Test
    public void whenAStudentTicket_thenStudentRebateIsApplied() {
        MovieTicket ticket = new AMovieTicket(TICKET_PRICE, true);
        Float studentRebate = MovieTicket.STUDENT_REBATE;

        assertEquals(TICKET_PRICE - studentRebate * TICKET_PRICE, ticket.getPrice(), 0.0);
    }

    private class AMovieTicket extends MovieTicket {
        public AMovieTicket(Float price, boolean isStudentTicket) {
            super(price, isStudentTicket);
        }
    }
}