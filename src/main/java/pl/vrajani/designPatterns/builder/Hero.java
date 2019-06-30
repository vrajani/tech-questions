package pl.vrajani.designPatterns.builder;

public class Hero {

    private final String profession;
    private final String name;
    private final String hairType;
    private final String hairColor;

    protected Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
    }

    @Override
    public String toString(){
        return new StringBuilder("Hero=[")
                .append("profession=").append(profession)
                .append(",name=").append(name)
                .append(",hairType=").append(hairType)
                .append(",hairColor=").append(hairColor)
                .append("]").toString();
    }
}
