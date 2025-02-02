import javax.swing.*;
import java.awt.*;

public class Seat extends JButton {
    private int seatNumber;
    private boolean isReserved;
    private int seatPrice = 0;
//    private Color seatColor = new Color(227, 195, 157, 255);
    private Color seatColor = new Color(164, 181, 196, 255);

    public Seat(){
        this.seatNumber = 0;
        isReserved = false;
    }
    public Seat(int seatNumber, int seatPrice){ // could add seat icon and pass it to super

        super("" + seatNumber);
        super.setBackground(seatColor);
        this.seatPrice = seatPrice;
        isReserved = false;
    }

    public void reserveSeat(){
        this.isReserved = true;
    }
    public boolean isReserved(){
        return this.isReserved;
    }


    public void cancelSeat(){
        this.isReserved = false;
    }

    public void resetSeat(){
        this.isReserved = false;
    }

    public int getSeatPrice(){
        return this.seatPrice;
    }
    public int getSeatNumber(){
        return this.seatNumber;
    }
}
