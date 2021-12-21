

import org.apache.hadoop.io.WritableComparable;


public class FlightComparator extends WritableComparator {

        super(AirportWritableComparable.class, true);




        return ((AirportWritableComparable)a).getId() - ((AirportWritableComparable)b).getId();

}
