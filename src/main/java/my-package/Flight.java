



public class Flight{

    private static final int DELAY_TIME = 18;


    private static final String DELIMITER = ",";




    private int airportId;

    public Flight (String s) throws IOException {
        String[] data = s.split(DELIMITER);
        this.airportId = Integer.parseInt(data[AIRPORT_ID]);
        this.isCancelled = data[IS_CANCELLED].equals(CANCELLED_FLAG);

    }


        return isCancelled;
    }


        return delayTime;
    }

    public int getAirportId() {
        return airportId;

}
