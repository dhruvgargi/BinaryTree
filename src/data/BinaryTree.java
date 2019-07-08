package data;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private BinaryTree leftChildNode;
    private BinaryTree rightChildNode;
    private String nodeValue;
    private String rootNode;

    //First Project Implementation
    public BinaryTree(){
        super();
        this.rootNode = null;
    }

    public BinaryTree(String nodeValue){
        super();
        this.nodeValue = nodeValue;
        this.rootNode = nodeValue;
    }

    public BinaryTree(BinaryTree leftChildNode, BinaryTree rightChildNode, String nodeValue){
        super();
        this.nodeValue = nodeValue;
        this.leftChildNode = leftChildNode;
        try {
            this.leftChildNode.rootNode = this.leftChildNode == null ? null : nodeValue;
        }catch(NullPointerException nre){
            //System.out.println("LeftChildNode is null for nodeValue: "+nodeValue);
        }
        this.rightChildNode = rightChildNode;
        try {
            this.rightChildNode.rootNode = this.rightChildNode == null ? null : nodeValue;
        }catch(NullPointerException nre){
            //System.out.println("RightChildNode is null for nodeValue: "+nodeValue);
        }
    }

    public BinaryTree getLeftChildNode() {
        return leftChildNode;
    }

    public void setLeftChildNode(BinaryTree leftChildNode) {
        this.leftChildNode = leftChildNode;
    }

    public BinaryTree getRightChildNode() {
        return rightChildNode;
    }

    public void setRightChildNode(BinaryTree rightChildNode) {
        this.rightChildNode = rightChildNode;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    public String getRootNode(){
        return this.rootNode;
    }

    @Override
    public String toString(){
        System.out.println("\t"+this.nodeValue);
        System.out.print(this.leftChildNode.nodeValue +"_|"+"  ");
        System.out.print("|_"+ this.rightChildNode.nodeValue);
        return "";
    }

    private void printTreeNodes(BinaryTree binaryTree){

        while(true){
            if(binaryTree == null) break;
            Queue<String> treeQueue = new LinkedList<>();
            treeQueue.add(binaryTree.getNodeValue());

        }

    }
}
