package ca.ulaval.glo4002.solid_srp;

public class MovieTicketService {

    private TicketPrinter printer;
    private TicketFactory factory;

    public MovieTicketService(TicketPrinter printer, TicketFactory factory) {
        this.printer = printer;
        this.factory = factory;
    }

    // TODO add : a flag to know if this is a student. Apply 10%.
    // TODO add : a flag to know whether the ticket should be printed or not.
    public void generateMovieTicket(Integer personAge, boolean isStudent, boolean printTicket) {
        MovieTicket ticket = factory.createTicket(personAge, isStudent);
        if (printTicket) {
            print(ticket);
        }
    }

    private void print(MovieTicket ticket) {
        printer.print(ticket);
    }
}
