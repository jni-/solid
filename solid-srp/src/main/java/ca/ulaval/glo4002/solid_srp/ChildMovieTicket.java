package ca.ulaval.glo4002.solid_srp;

public class ChildMovieTicket extends MovieTicket {

    private static final Float PRICE = 10.0f;

    public ChildMovieTicket(boolean isStudentTicket) {
        super(PRICE, isStudentTicket);
    }

}
