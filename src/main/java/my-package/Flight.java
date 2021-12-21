package bmstu.ru;



public class Flight{

    private static final int DELAY_TIME = 18;


    private static final String DELIMITER = ",";


    private boolean isCancelled;

    private int airportId;

    public Flight (String s) throws IOException {
        String[] data = s.split(DELIMITER);
        this.airportId = Integer.parseInt(data[AIRPORT_ID]);
        this.isCancelled = data[IS_CANCELLED].equals(CANCELLED_FLAG);
        this.delayTime = (data[DELAY_TIME].equals("")) ? 0 : Float.parseFloat(data[DELAY_TIME]);
    }


        return isCancelled;
    }

    public float getDelayTime() {
        return delayTime;
    }

    public int getAirportId() {
        return airportId;

}
