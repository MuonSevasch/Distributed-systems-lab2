package bmstu.ru;



import org.apache.hadoop.io.Text;


import java.io.IOException;

public class AirportMapper extends Mapper<LongWritable, Text, AirportWritableComparable, FlightWritable> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        Airport data =  new Airport(value.toString());


                      new FlightWritable(data.getName(), 0, Type.AIRPORT));

}
