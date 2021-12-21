



import java.io.DataInput;



public class FlightWritable implements Writable {









        return delay;











        this.type = type;
    }

    public void write(DataOutput dataOutput) throws IOException {


        dataOutput.writeInt(type.ordinal());
    }





    }
}
