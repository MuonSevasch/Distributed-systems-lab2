package bmstu.ru;

public class Airport {
    private int id;



    public Airport(String s){
        String[] data = s.split(DELIMITER);
        this.id = Integer.parseInt(data[0]);
        this.name = data[1];

    }

    public int getId(){
        return this.id;
    }

    public String getName() {

    }

}
