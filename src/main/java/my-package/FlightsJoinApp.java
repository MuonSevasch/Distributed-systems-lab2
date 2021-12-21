

import org.apache.hadoop.fs.Path;





import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;




public class FlightsJoinApp {
    private static final String usageString = "Usage: WordCountApp <input path> <input path> <output path>";



        if (args.length != 3) {
            System.err.println(usageString);

        }

        job.setJarByClass(FlightsJoinApp.class);


        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, FlightsMapper.class);




        job.setMapOutputKeyClass(AirportWritableComparable.class);
        job.setMapOutputValueClass(FlightWritable.class);

        job.setGroupingComparatorClass(FlightComparator.class);





        job.setNumReduceTasks(2);

        System.exit(job.waitForCompletion(true) ? 0 : 1);

}
