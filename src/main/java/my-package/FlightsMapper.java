package bmstu.ru;

import org.apache.hadoop.io.FloatWritable;


import org.apache.hadoop.mapreduce.Mapper;



public class FlightsMapper extends Mapper<LongWritable, Text, bmstu.ru.AirportWritableComparable, FlightWritable> {

    @Override



            context.write(new AirportWritableComparable(data.getAirportId(), "", Type.FLIGHT),
                    new FlightWritable("", data.getDelayTime(), Type.FLIGHT));


}
