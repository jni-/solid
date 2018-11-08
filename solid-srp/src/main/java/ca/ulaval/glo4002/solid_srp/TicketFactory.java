package ca.ulaval.glo4002.solid_srp;

public class TicketFactory {
    private static final Integer MAXIMUM_AGE_CHILD_PRICE = 10;

    public MovieTicket createTicket(Integer personAge, boolean isStudent) {
        if (personAge <= MAXIMUM_AGE_CHILD_PRICE) {
            return new ChildMovieTicket(isStudent);
        }
        else {
            return new RegularMovieTicket(isStudent);
        }
    }
}
