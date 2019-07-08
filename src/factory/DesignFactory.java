package factory;

import data.BinaryTree;

public interface DesignFactory {

    BinaryTree getBinaryTree();

    BinaryTree getBinaryTree(String nodeValue);

    BinaryTree getBinaryTree(BinaryTree leftChildNode, BinaryTree rightChildNode, String nodeValue);

}
