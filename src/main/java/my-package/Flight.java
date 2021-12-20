



public class Flight{

    private static final int DELAY_TIME = 18;







    private int airportId;

    public Flight (String s) throws IOException {
        String[] data = s.split(DELIMITER);
        this.airportId = Integer.parseInt(data[AIRPORT_ID]);


    }


        return isCancelled;
    }


        return delayTime;
    }

    public int getAirportId() {
        return airportId;

}
