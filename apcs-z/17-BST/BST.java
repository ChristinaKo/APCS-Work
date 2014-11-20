public class BST {
    private Node root;

    public BST() {
        root = null;
    }
    public Node getRoot(){
	return root;
    }
    public void insert(int n){
	Node c = root;
	Node l = root;
	if (c==null){
	    Node tmp = new Node(n)
	    c= tmp;

	}	while (c!=null){
	    if(c.getData()<n){
		l = c;
		c=c.getRight();
	    }
	    else{
		l = c;
		c = c.getLeft();
	    }
	}
	Node newn = new Node(n);
	l.setLeft(newn);

    }
    public void transverse(Node n){
	if(n == null){
	    System.out.println("");
	}
	else{
	    System.out.println(n.getData());
	    transverse(n.getLeft());
	    transverse(n.getRight());
	}
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
	if(c.getData()== x){
	    return c;
	}
	else{
	    if(c.getData()<x){
		search2(c.getRight(), x);
	    }
	    else{
		search2(c.getLeft(), x);
	    }
	}
	return c;
    }
    public void delete(int x){
	Node c = root;
	Node n = root;
	while(c!=null){
	    if(c.getData() > x){
		n=c;
		c = c.getLeft();
	    }
	    else{
		n=c;
		c = c.getRight();
	    }
	    if(c.getData() ==x){
		if(c.getRight()==null && c.getLeft()==null){
		    n.setRight(null);
		    n.setRight(null);
		}
		else if(c.getRight()!= null && c.getLeft()==null){
		    n.setRight(c.getRight());
		}
		else if(c.getLeft()!=null && c.getRight()==null){
		    n.setLeft(c.getLeft());
		}
		else if(c.getLeft()!=null && c.getRight() != null){
		    Node last = c;
		    c =c.getRight(); 
		    while(c != null){
			last = c;
			c=c.getLeft();
		    }
		    last.setLeft(null);
		    n=c;
		}
	    }
	}
    }

}

