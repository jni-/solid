package ca.ulaval.glo4002.solid_srp;

public class RegularMovieTicket extends MovieTicket {

    private static final Float PRICE = 15.0f;

    public RegularMovieTicket(boolean isStudentTicket) {
        super(PRICE, isStudentTicket);
    }
}
