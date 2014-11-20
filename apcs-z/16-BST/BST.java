public class BST {
    private Node root;

    public BST() {
        root = null;
    }
    public void insert(int n){
	Node c = root;
	Node l = root;
	while (c!=null){
	    if(c.getData()<n){
		l = c;
		c=c.getRight();
	    }
	    else{
		l = c
		c = c.getLeft();
	    }
	}
	Node newn = new Node(n);
	l.setLeft(newn);

    }
    public Node  search (int n){
	Node c = root;
	while(c!= null && c.getData()!=n){
	    if(c.getData()<n){
		c=c.getRight();
	    }
	    else{
		c = c.getLeft();
	    }
	}
	return c;
    }
    public Node search2(Node c, int x){
	if(c.getData()== x || c ==null){
	    return c;
	}
	else{
	    if(c.getData()<x){
		search(c.getRight(), x);
	    }
	    else{
		search(c.getLeft(), x);
	    }
	}
	    return c;
    }

}