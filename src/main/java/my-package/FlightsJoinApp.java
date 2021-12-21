







import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;




public class FlightsJoinApp {












        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, FlightsMapper.class);













        job.setNumReduceTasks(2);

        System.exit(job.waitForCompletion(true) ? 0 : 1);

}
