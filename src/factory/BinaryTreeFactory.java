package factory;

import data.BinaryTree;

public class BinaryTreeFactory implements DesignFactory {

    public BinaryTree getBinaryTree(){
        return new BinaryTree();
    }

    public BinaryTree getBinaryTree(String nodeValue){
        return new BinaryTree(nodeValue);
    }

    public BinaryTree getBinaryTree(BinaryTree leftChildNode, BinaryTree righChildNode,String nodeValue){
        return new BinaryTree((BinaryTree) leftChildNode,(BinaryTree) righChildNode,nodeValue);
    }

}
