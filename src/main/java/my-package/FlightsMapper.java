package bmstu.ru;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightsMapper extends Mapper<LongWritable, Text, bmstu.ru.AirportWritableComparable, FlightWritable> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        Flight data = new Flight(value.toString());
        if (!data.isCancelled()) {

                    new FlightWritable("", data.getDelayTime(), Type.FLIGHT));

    }
}
