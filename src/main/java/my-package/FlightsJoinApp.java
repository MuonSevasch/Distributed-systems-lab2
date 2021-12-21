







import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;




public class FlightsJoinApp {
    private static final String usageString = "Usage: WordCountApp <input path> <input path> <output path>";








        job.setJarByClass(FlightsJoinApp.class);


        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, FlightsMapper.class);













        job.setNumReduceTasks(2);

        System.exit(job.waitForCompletion(true) ? 0 : 1);

}
