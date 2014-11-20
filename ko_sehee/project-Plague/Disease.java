public class Disease{
    private double[][] continents= new double[7][6];
    private double infected,dead,chanceInfected,chanceDead;
    private int  DNAPoints;
    private String name;
    private  boolean nausea = false,coughing =false,rash=false,anemia=false,livestock=false,rodent=false,bird=false,insect=false,blood=false,air=false,water=false,coldR=false,heatR=false,drugR=false,GeneticH=false,GeneticR=false;
    // countries in order = N america, S. America, Antartica, Africa, Asia, Australia, Europe
    //populations in millions
    //0   
    private int[] currentPop = {529, 386, 0.004, 995, 4140,36, 739};
    //1
    private int[] airInteraction = {10,6,1,4,9,5,8}; //to be changed
    //2
    private int[] waterInteraction = {9,5,0,6,9,5,9};
    //3    
    private int[] infected = {0,0,0,0,0,0,0};
    //4
    private int[] temp{/*still need to decide*/};
    //5    
    private int[] chanceInfected = {0,0,0,0,0,0,0};
				
    public Disease(String n){
	name = n;
	infected = 0;
	dead = 0;
	chanceInfected = .1;
	chanceDead = .01;
	DNAPoints = 0;
    }

    //all these methods for if player chooses to (1) UPGRADE
    
    public String upgradeTransmission(String name) {
	if (name == "livestock"){
	    chanceInfected = chanceInfected + .05;
	    livestock = true;
	}
	if (name == "rodent"){
	    chanceInfected = chanceInfected + .06;
	    rodent= true;
	}
	if (name == "bird"){
	    chanceInfected = chanceInfected + .05;
	    bird=true;	
	}
	if (name == "insect"){
	    chanceInfected = chanceInfected + .06;
	    insect =true;
	}
	if (name == "blood"){
	    chanceInfected = chanceInfected + .05;
	    blood =true;	
	}
	if (name == "air"){
	    chanceInfected = chanceInfected + .06;
	    air =true;	
	}
	if (name == "water"){
	    chanceInfected = chanceInfected + .05;
	    water =true;	
	}
	return "";
    }

    public void upgradeSymptoms(String name) {
	if (name == "nausea"){
	    chanceInfected = chanceInfected + .01;
	    chanceDead = chanceDead + .03;
	    nausea=true;
	    System.out.println("nausea turned ON.");
	}
	else if (name == "coughing"){	
	    chanceInfected = chanceInfected + .02;
	    chanceDead = chanceDead + .04;
	    coughing = true;
	}
	else if (name == "rash"){
	    chanceInfected = chanceInfected + .01;
	    chanceDead = chanceDead + .03;
	    rash = true;
	}
	else if (name == "anemia"){
	    chanceInfected = chanceInfected + .02;
	    chanceDead = chanceDead + .05;
	    anemia = true;
	}
    
    }


    public void upgradeAbilities(String name){
	//fixed!!!

	if (name == "coldR"){
	    coldR = true;
	    //efficiency of Cure is reduced by .04
	}
	if (name == "heatR"){
	    heatR = true;
	    //efficiency of Cure is reduced by .04
	}
	if (name == "drugR"){
	    drugR = true;
	    //efficiency of Cure is reduced by .04
	}
	if (name == "GeneticH"){
	    GeneticH = true;
	    //efficiency of Cure is reduced by .04
	}
	if (name == "GeneticR"){
	    GeneticR= true;
	    //efficiency of Cure is reduced by .04
	}
    }
    public void winner(){
	System.out.println ("Congratulations! Your disease, " +name + "has successfully destroyed the human population!");
    }
    public void winYet(){
	if (dead == 1){
	    this.winner();
	}
    }
    
    public void setChanceInfected(int cont){
	continents[cont][5]=((airInteraction[cont]+ waterInteraction[cont])/100)+ (temp/5); 
    }

    //Will be called when user first creates disease    
    public void firstSpread(int cont){
	setChanceInfected(cont);
    }
    public void spread(){
	for (int i = 0; i < continents.length; i ++){
	    if (continents[i][5]>0){
		if (Math.random() < continents[i][5]) {
		    infected = infected + 2 + (chanceInfected/2);
		    System.out.println("Infectivity: " +( chanceInfected*100 )+"%");
		    System.out.println("Infected: " +( infected*100 )+"%");
		}
		//need to add a chanceDead characteristic to continents
		if (Math.random()< chanceDead) {
		    dead = dead + 2 + (chanceDead/2);
		    System.out.println("Severity: " +( chanceDead*100 )+"%");
		    System.out.println("Dead: " +(dead*100 )+"%");
		}
	    }
	    else{
		setChanceInfected(i);
	    }
	}
    }
		


	
    }
    //

    public void upgrade(int choice){
	if (choice == 1){
	    System.out.prinln("You chose to Upgrade Transmission");
	    //list choices
	    //scanner
	    //upgrade
	}
	if (choice ==2){
	}
	if (choice == 3){
	}
	    
    }


    //only happens if player chooses to (2)WAIT AND ANALYZE
    public String  turn(int choice) {
	this.winYet();
	if (choice ==1){
	    System.out.println("1 Upgrade Transmission");
	    System.out.println("2 upgrade Abilities");
	    System.out.println("3 Upgrade Symptoms");
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Choose one of above: ");
	    int ans = sc.nextLine();
	    upgrade(ans);

	}

	
	if (Math.random() < chanceInfected+chanceDead) {
	    DNAPoints = DNAPoints + 2;
	    System.out.println("DNA Points: " + DNAPoints);
	}
	return "";
    }
}
	    
      
