public class Node {

    private int data;
    private Node right, left;

    public Node(int  d) {
	data = d;
	left = null;
	right = null;
    }

    public void setData(int  d) {
	data = d;
    }
    public int  getData() {
	return data;
    }
    public void setRight(Node n){
	right = n;
    }
    public Node getRight() {
	return right;
    }
    public void setLeft(Node n){
	left = n;
    }
    public Node getLeft() {
	return left;
    }
    public String toString() {
	return ""+data;
    }

}
