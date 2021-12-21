package bmstu.ru;

import org.apache.hadoop.io.FloatWritable;

import org.apache.hadoop.io.Text;







    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        Airport data =  new Airport(value.toString());


                      new FlightWritable(data.getName(), 0, Type.AIRPORT));

}
