
public class CinemaTicket
{
    static String cinemaName="Kino Złe";
    String filmTitle;
    int row,seat;
    int price;

    public void CinemaTicket(){
        CinemaTicket ticket1= new CinemaTicket();
        ticket1.filmTitle="Hobbit";
        ticket1.row=5;
        ticket1.seat=18;
        ticket1.ticketPrice(row);
        System.out.println(ticket1.toString());
        CinemaTicket ticket2= new CinemaTicket();
        ticket2.filmTitle="Avatar";
        ticket2.row=18;
        ticket2.seat=30;
        ticket2.ticketPrice(row);
        System.out.println(ticket2.toString());
    }
    public void ticketPrice(int row){
        if (row>2){
            price=25;
        }else{
            price=10;
        }
    }
    public String toString(){
        return "Witamy w "+cinemaName+" Twój film to: "+filmTitle+" masz miejsce: "+seat+" w rzędzie: "+row+
        ". Cena biletu wynosi: "+price;
    }
    

    
}
