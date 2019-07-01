package pl.vrajani.framework;

public class Runner {

    public static void main(String[] args){
        long start = System.nanoTime();
        try {
            String className = "MergeSort";
            if(args[0] != null){
                className = args[0];
            }
            Solution runner = Solution.getSoutionInstance(className);
            System.out.println("Execution Start time:" + start + " in nano seconds.");
            runner.execute();
        } catch (Exception ex){
            System.out.println("FAILURE!!!!!");
            ex.printStackTrace();
        } finally {
            System.out.println("Completed Execution in nano seconds:" + (System.nanoTime() - start));
        }
    }
}
