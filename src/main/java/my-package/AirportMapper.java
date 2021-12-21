package bmstu.ru;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;





        Airport data =  new Airport(value.toString());

        context.write(new AirportWritableComparable(data.getId(), data.getName(), Type.AIRPORT),
                      new FlightWritable(data.getName(), 0, Type.AIRPORT));

}
