package bmstu.ru;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;


import java.io.IOException;

public class StatisticCounter extends Reducer<bmstu.ru.AirportWritableComparable, FlightWritable, IntWritable, Text> {
    private static final String format = "Airport:%s  AVG_DELAY:%f, MIN_DELAY %f, MAX_DELAY:%f, NUM_FLIGHTS:%d";

    @Override
    protected void reduce(bmstu.ru.AirportWritableComparable key, Iterable<FlightWritable> values, Context context) throws IOException, InterruptedException {
        float averageDelay = 0;
        float maxDelay = 0;


        String name = " ";



        for (FlightWritable delayWritable : values){
            if (delayWritable.getType() == Type.AIRPORT){

            }

            cnt ++;
            float delay = delayWritable.getDelay();
            averageDelay += delay;
            minDelay = Math.min(minDelay, delay);
            maxDelay = Math.max(maxDelay, delay);
        }


            averageDelay /= cnt;
            context.write(new IntWritable(key.getId()),

        }
    }
}
