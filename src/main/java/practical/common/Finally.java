package practical.common;


import framework.Solution;

//What need to be included in try catch to make sure finally is not executed
public class Finally extends Solution {

    private static boolean callMethod2() {
        try {
            System.exit(0);
            return false;
        }finally {
            System.out.println("Here");
            return true;
        }
    }

    private static boolean callMethod() {
        try {
            return false;
        }finally {
            System.out.println("Here");
            return true;
        }
    }

    @Override
    protected void execute() {
        System.out.println("#### METHOD 1 #####");
        System.out.println(callMethod());


        System.out.println("#### METHOD 2 #####");
        System.out.println(callMethod2());
    }
}
