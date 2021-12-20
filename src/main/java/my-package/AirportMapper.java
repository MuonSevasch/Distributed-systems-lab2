package bmstu.ru;



import org.apache.hadoop.io.Text;


import java.io.IOException;

public class AirportMapper extends Mapper<LongWritable, Text, AirportWritableComparable, FlightWritable> {


    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {





}
