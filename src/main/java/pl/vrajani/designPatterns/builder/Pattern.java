package pl.vrajani.designPatterns.builder;

public class Pattern {
    public static void main(String[] args){
        Hero hero = new Builder("profession", "name")
                .withHairColor("Black")
                .build();

        System.out.println("hero " + hero.toString());
    }
}
