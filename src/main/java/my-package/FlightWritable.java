



import java.io.DataInput;



public class FlightWritable implements Writable {









        return delay;











        this.type = type;





        dataOutput.writeInt(type.ordinal());
    }






}
