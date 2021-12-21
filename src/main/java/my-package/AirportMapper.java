package bmstu.ru;

import org.apache.hadoop.io.FloatWritable;

import org.apache.hadoop.io.Text;










        context.write(new AirportWritableComparable(data.getId(), data.getName(), Type.AIRPORT),
                      new FlightWritable(data.getName(), 0, Type.AIRPORT));

}
