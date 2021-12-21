



public class FlightPartitioner extends Partitioner<AirportWritableComparable, FlightWritable> {

    public int getPartition(AirportWritableComparable key, FlightWritable val, int i) {
        return key.getId() % i;

}
