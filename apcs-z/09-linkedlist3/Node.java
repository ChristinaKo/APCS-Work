public class Node{
    private String data;
    private Node next;
    private Node before;
    public Node(String d){
	data = d;
	next = null;
    }
    public Node(){
	data = null;
	next = null;
    }
    public void setBefore(Node n){
	before = n;
    }
    public Node getBefore(){
	return before;
    }
    public void setData(String d){
	data = d;
    }
    public String getData(){
	return data;
    }       
    public void setNext(Node n){
	next = n;
    }
    public Node getNext(){
	return next;
    }
    public String toString(){
	return data;
    }
}