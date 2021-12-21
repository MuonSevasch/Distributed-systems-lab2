


import org.apache.hadoop.io.IntWritable;



import java.io.IOException;

public class StatisticCounter extends Reducer<bmstu.ru.AirportWritableComparable, FlightWritable, IntWritable, Text> {
    private static final String format = "Airport:%s  AVG_DELAY:%f, MIN_DELAY %f, MAX_DELAY:%f, NUM_FLIGHTS:%d";












            if (delayWritable.getType() == Type.AIRPORT){
















}
