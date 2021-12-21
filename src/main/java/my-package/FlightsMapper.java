








public class FlightsMapper extends Mapper<LongWritable, Text, bmstu.ru.AirportWritableComparable, FlightWritable> {

    @Override



            context.write(new AirportWritableComparable(data.getAirportId(), "", Type.FLIGHT),



}
