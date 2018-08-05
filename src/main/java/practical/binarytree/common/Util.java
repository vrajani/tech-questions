package practical.binarytree.common;

import practical.binarytree.serialization.Serializer;

public class Util {

    public static TreeNode formTreeFrom (String string){
        Serializer serializer = new Serializer();
        return serializer.deserialize(string);
    }
}
