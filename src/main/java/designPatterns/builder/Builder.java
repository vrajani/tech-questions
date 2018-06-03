package designPatterns.builder;

public class Builder {
    public String profession;
    public String name;
    public String hairColor;
    public String hairType;

    //Making certain required attributes to construct the element.
    public Builder(String profession, String name) {
        if (profession == null || name == null) {
            throw new IllegalArgumentException("profession and name can not be null");
        }
        this.profession = profession;
        this.name = name;
    }

    public Builder withHairType(String hairType) {
        this.hairType = hairType;
        return this;
    }

    public Builder withHairColor(String hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public Hero build() {
        return new Hero(this);
    }
}

