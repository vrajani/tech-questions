package pl.vrajani.solution.binarytree.common;

import pl.vrajani.solution.binarytree.serialization.Serializer;

public class Util {

    public static TreeNode formTreeFrom (String string){
        Serializer serializer = new Serializer();
        return serializer.deserialize(string);
    }
}
