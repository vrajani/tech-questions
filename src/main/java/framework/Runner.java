package framework;

public class Runner {

    public static void main(String[] args){
        long start = System.nanoTime();
        try {
            Solution runner = Solution.getSoutionInstance("Palindromes");
            System.out.println("Execution Start time:" + start);
            runner.execute();
        } catch (Exception ex){
            System.out.println("FAILURE!!!!!");
            ex.printStackTrace();
        } finally {
            System.out.println("Completed Execution in nano seconds:" + (System.nanoTime() - start));
        }
    }
}
