

import org.apache.hadoop.io.WritableComparable;


public class FlightComparator extends WritableComparator {
    public FlightComparator(){
        super(AirportWritableComparable.class, true);
    }

    @Override

        return ((AirportWritableComparable)a).getId() - ((AirportWritableComparable)b).getId();
    }
}
