package bmstu.ru;



public class FlightPartitioner extends Partitioner<AirportWritableComparable, FlightWritable> {
    @Override
    public int getPartition(AirportWritableComparable key, FlightWritable val, int i) {

    }
}
