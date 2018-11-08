package ca.ulaval.glo4002.solid_srp;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TicketFactoryTest {

    private TicketFactory factory;

    @Before
    public void setUp() {
        this.factory = new TicketFactory();
    }

    @Test
    public void createsChildTicketForAgeUpTo10Inclusive() {
        final Integer childAge = 10;

        MovieTicket ticket = factory.createTicket(childAge, false);

        assertThat(ticket, instanceOf(ChildMovieTicket.class));
    }

    @Test
    public void createsAStudentChildTicketIfUnder10IfAStudent() {
        final Integer childAge = 9;

        MovieTicket ticket = factory.createTicket(childAge, true);

        assertTrue(ticket.isStudentTicket());
    }

    @Test
    public void createsARegularTicketIfNotUnder10AndNotAStudent() {
        final Integer notChildAge = 15;

        MovieTicket ticket = factory.createTicket(notChildAge, false);

        assertThat(ticket, instanceOf(RegularMovieTicket.class));
    }

    @Test
    public void createsARegularStudentTicketIfNotUnder10AndAStudent() {
        final Integer notChildAge = 15;

        MovieTicket ticket = factory.createTicket(notChildAge, true);

        assertTrue(ticket.isStudentTicket());
    }
}
