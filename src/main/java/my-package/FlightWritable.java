



import java.io.DataInput;

import java.io.IOException;

public class FlightWritable implements Writable {
    private String name;

    private Type type;


        return name;



        return delay;


    public Type getType() {








        this.type = type;
    }

    public void write(DataOutput dataOutput) throws IOException {


        dataOutput.writeInt(type.ordinal());
    }





    }
}
