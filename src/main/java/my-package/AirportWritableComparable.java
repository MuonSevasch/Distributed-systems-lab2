

import org.apache.hadoop.io.WritableComparable;


import java.io.DataOutput;
import java.io.IOException;

enum Type{


}

public class AirportWritableComparable implements WritableComparable<AirportWritableComparable> {
    private Type type;

    private int id;



    }



    }

    public Type getType(){




        return name;
    }




        this.name = name;



        int x = this.type.ordinal() -o.getType().ordinal();
        if (x != 0){
            return x;
        } else{




    public void write(DataOutput dataOutput) throws IOException {





    public void readFields(DataInput dataInput) throws IOException {
        this.id = dataInput.readInt();

    }
}
