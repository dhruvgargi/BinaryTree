package implementation;
import static java.lang.System.out;

import data.BinaryTree;
import factory.BinaryTreeFactory;
import factory.DesignFactory;

public class BinaryTreeImpl {

    public static void main(String[] args){

        DesignFactory designFactory = new BinaryTreeFactory();

        BinaryTree binaryTree =
                designFactory.getBinaryTree(designFactory.getBinaryTree(designFactory.getBinaryTree(null,null,"D"),
                        designFactory.getBinaryTree(null,null,"E"),"B"),
                designFactory.getBinaryTree(null,null,"C"),
                        "A");

        out.println("Root Node: "+binaryTree.getRootNode());
        out.println("Root Node: for left subtree - "+binaryTree.getLeftChildNode().getRootNode()+" with Node Value: "+binaryTree.getLeftChildNode().getNodeValue());
        out.println("Root Node: for right subtree - "+binaryTree.getRightChildNode().getRootNode()+" with Node Value: "+binaryTree.getRightChildNode().getNodeValue());
    }

}
