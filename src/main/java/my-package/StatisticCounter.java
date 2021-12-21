


import org.apache.hadoop.io.IntWritable;



import java.io.IOException;

public class StatisticCounter extends Reducer<bmstu.ru.AirportWritableComparable, FlightWritable, IntWritable, Text> {
    private static final String format = "Airport:%s  AVG_DELAY:%f, MIN_DELAY %f, MAX_DELAY:%f, NUM_FLIGHTS:%d";


    protected void reduce(bmstu.ru.AirportWritableComparable key, Iterable<FlightWritable> values, Context context) throws IOException, InterruptedException {
        float averageDelay = 0;








            if (delayWritable.getType() == Type.AIRPORT){

            }

            cnt ++;
            float delay = delayWritable.getDelay();





        if (cnt > 0) {



        }

}
