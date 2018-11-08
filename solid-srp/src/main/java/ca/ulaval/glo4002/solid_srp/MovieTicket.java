package ca.ulaval.glo4002.solid_srp;

public abstract class MovieTicket {
    public static final Float STUDENT_REBATE = 0.10f;

    private Float price;
    private boolean isStudentTicket;

    public MovieTicket(Float price, boolean isStudentTicket) {
        this.price = price;
        this.isStudentTicket = isStudentTicket;
    }

    public Float getPrice() {
        if (isStudentTicket) {
            return price - STUDENT_REBATE * price;
        }
        return price;
    }

    public boolean isStudentTicket() {
        return isStudentTicket;
    }
}
