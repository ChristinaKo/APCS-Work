import java.io.*;
import java.util.*;

public class Disease{
    private double[][] continents= new double[8][7];
    public double totalInfected,totalDead, totalchance, tchancedead, totalPop;
  public int  DNAPoints,decEf;
    public String name, choice,choiceA,choiceB,choiceC,choiceD;
    private  boolean nausea = false,coughing =false,rash=false,anemia=false,livestock=false,rodent=false,bird=false,insect=false,blood=false,air=false,water=false,coldR=false,heatR=false,drugR=false,GeneticH=false,GeneticR=false,notEnough=true;
    // countries in order = N america, S. America, Antartica, Africa, Asia, Australia, Europe
    // populations in millions
   
    private double[] currentPop = {529, 386, 0.004, 995, 4140, 36, 739};
    //1
    private double[] airInteraction = {10,6,1,4,9,5,8}; //to be changed
    //2
    private double[] waterInteraction = {9,5,1,6,9,5,9};
    //3    
    private double[] infected = {0,0,0,0,0,0,0};
    //4
    private double[] temp={ 0.05,0.05,0.08,0.01,0.05,0.05,0.03}; // still need to decide
    //5    
    private double[] chanceInfected = {0,0,0,0,0,0,0};
    //6
    private double[] chanceDead = {0,0,0,0,0,0,0};
    //7
    private double[] dead = {0,0,0,0,0,0,0};
				
    public Disease(String n){
	name = n;
	totalInfected = 0;
	totalDead = 0;
	DNAPoints = 0;
    }

    public int getPop(){
	for (int i = 0; i < currentPop.length;i ++){
	    totalPop = totalPop + currentPop[i];
	}
	return (int) (totalPop);
    }
	    
    //1 UPGRADE METHODS


    //chooseA, chooseTr, chooseAb, chooseSy
    public boolean chooseA(){
	boolean ans;
	System.out.println("--------------------------------");
	System.out.println(" ");
	System.out.println("1 Upgrade Transmission");
	System.out.println("2 Upgrade Abilities");
	System.out.println("3 Upgrade Symptoms");
	System.out.print("Choose one of above: ");
	Scanner scA = new Scanner(System.in);
        choiceA = scA.next();
	if (choiceA.equals("1")){
	    ans = false;
	}
	else if(choiceA.equals("2")){
	    ans = false;
	}
	else if(choiceA.equals("3")){
	    ans = false;
	}
	else{
	    ans = true;
	}
	return ans;
    }


    public boolean chooseTr(){
	boolean ans;
	System.out.println("--------------------------");
	System.out.println("DNA Points: " + DNAPoints);
	System.out.println(" ");
	if (livestock){
	    System.out.print("*ON* ");
	}
	System.out.println("1 - upgrade livestock - 2 DNA Points");
	if (rodent){
	    System.out.print("*ON* ");
	}
	System.out.println("2 - upgrade rodent - 2 DNA Points");
	if (bird){
	    System.out.print("*ON* ");
	}
	System.out.println("3 - upgrade bird - 3 DNA Points");
	if (insect){
	    System.out.print("*ON* ");
	}
	System.out.println("4 - upgrade insect - 4 DNA Points");
	if (blood){
	    System.out.print("*ON* ");
	}
	System.out.println("5 - upgrade blood - 4 DNA Points");
	if (air){
	    System.out.print("*ON* ");
	}
	System.out.println("6 - upgrade air - 5 DNA Points");
	if (water){
	    System.out.print("*ON* ");
	}
	System.out.println("7 - upgrade water - 5 DNA Points");
	System.out.println("Enter number of desired upgrade:");
	Scanner scB = new Scanner(System.in);
        choiceB = scB.next();
	if (choiceB.equals("1")){
	    if (livestock){
		System.out.println("Livestock has already been upgraded.");
		ans = true;
	    }
	    else if (DNAPoints <2){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
		notEnough = true;
	    }
	    else {
		ans = false;
		notEnough = false;
		DNAPoints = DNAPoints - 2;
	    }
	}
	else if(choiceB.equals("2")){
	    if (rodent){
		System.out.println("Rodent has already been upgraded.");
		ans = true;
	    }
	    else if (DNAPoints <2){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
		notEnough = true;
	    }
	    else {
		DNAPoints = DNAPoints - 2;
		notEnough = false;
		ans = false;
	    }
	}

	else if(choiceB.equals("3")){
	    if (bird){
		System.out.println("Bird has already been upgraded.");
		ans = true;
	    }
	    else if (DNAPoints <3){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
		notEnough = true;
	    }
	    else {
		DNAPoints = DNAPoints - 3;
		ans = false;
		notEnough = false;
	    }
	}

	else if(choiceB.equals("4")){
	    if (insect){
		System.out.println("Insect has already been upgraded.");
		ans = true;
	    }
	    else if (DNAPoints <4){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = true;
		notEnough = true;
	    }
	    else {
		DNAPoints = DNAPoints - 4;
		ans = false;
		notEnough = false;
	    }
	}

	else if(choiceB.equals("5")){
	    if (blood){
		System.out.println("Blood has already been upgraded.");
		ans = true;
	    }
	    else if (DNAPoints <4){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
		notEnough = true;
	    }
	    else {
		DNAPoints = DNAPoints - 4;
		ans = false;
		notEnough =false;
	    }
	}

	else if(choiceB.equals("6")){
	    if (air){
		System.out.println("Air has already been upgraded.");
		ans = true;
	    }
	    else if (DNAPoints <5){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
	    }
	    else {
		DNAPoints = DNAPoints - 5;
		ans = false;
	    }
	}

	else if(choiceB.equals("7")){
	    if (water){
		System.out.println("Water has already been upgraded.");
		ans = true;
	    }
	    else if (DNAPoints <5){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
		notEnough = true;
	    }
	    else {
		DNAPoints = DNAPoints - 5;
		ans = false;
		notEnough =false;
	    }
	}
	else{
	    ans = true;
		    }

	return ans;
    }

    public boolean chooseAb(){
	boolean ans;
	System.out.println("--------------------------");
	System.out.println("DNA Points: " + DNAPoints);
	System.out.println("");
	if (coldR){
	    System.out.print("*ON* ");
	}
	System.out.println("1 - upgrade Cold Resistance - 3 DNA Points");
	if (heatR){
	    System.out.print("*ON* ");
	}
	System.out.println("2 - upgrade Heat Resistance - 3 DNA Points");
	if (drugR){
	    System.out.print("*ON* ");
	}
	System.out.println("3 - upgrade Drug Resistance - 4 DNA Points");
	if (GeneticH){
	    System.out.print("*ON* ");
	}
	System.out.println("4 - upgrade Genetic Hardening - 5 DNA Points");
	if (GeneticR){
	    System.out.print("*ON* ");
	}
	System.out.println("5 - upgrade Genetic Resistance - 5 DNA Points");
	System.out.println("Enter number of desired upgrade");
	Scanner scC = new Scanner(System.in);
	choiceC = scC.next();
	decEf = 0;

	if (choiceC.equals("1")){
	    if (coldR){
		System.out.println("Cold resistance has already been upgraded.");
		ans = true;
	    }
	    else if (DNAPoints <3){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
		notEnough = true;
	    }
	    else {
		DNAPoints = DNAPoints -3;
		notEnough = false;
		ans = false;
	    }
	}
	else if(choiceC.equals("2")){
	    if (heatR){
		System.out.println("Heat resistance has already been upgraded.");
		ans = true;
	    }
	     else if (DNAPoints <3){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
		notEnough = true;
	    }
	    else {
		DNAPoints = DNAPoints -3;
		notEnough = false;
		ans = false;
	    }
	}
	else if(choiceC.equals("3")){
	    if (drugR){
		System.out.println("Drug resistance has already been upgraded.");
		ans = true;
	    }
	    else if (DNAPoints <4){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
		notEnough = true;
	    }
	    else {
		DNAPoints = DNAPoints -4;
		notEnough = false;
		ans = false;
	    }
	}
	else if(choiceC.equals("4")){
	    if (GeneticH){
		System.out.println("Genetic hardening has already been upgraded.");
		ans = true;
	    }
	     else if (DNAPoints <5){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
		notEnough = true;
	    }
	    else {
		DNAPoints = DNAPoints -5;
		notEnough = false;
		ans = false;
	    }
	}
	else if(choiceC.equals("5")){
	    if (GeneticR){
		System.out.println("Genetic resistance has already been upgraded.");
		ans = true;
	    }
	   else if (DNAPoints <5){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
		notEnough = true;
	    }
	    else {
		DNAPoints = DNAPoints -5;
		notEnough = false;
		ans = false;
	    }
	}
	else{
	    ans = true;
	}
	return ans;
    }

    public boolean chooseSy(){
	boolean ans;
	System.out.println("--------------------------");
	System.out.println("DNA Points: " + DNAPoints);
	System.out.println("");
	if (nausea){
	    System.out.print("*ON* ");
	}
	System.out.println("1 - upgrade nausea - 2 DNA Points");
	if (coughing){
	    System.out.print("*ON* ");
	}
	System.out.println("2 - upgrade coughing - 3 DNA Points");
	if (rash){
	    System.out.print("*ON* ");
	}
	System.out.println("3 - upgrade rash - 4 DNA Points");
	if (anemia){
	    System.out.print("*ON* ");
	}
	System.out.println("4 - upgrade anemia - 5 DNA Points");
	System.out.println("Enter number of desired upgrade");
	Scanner scD = new Scanner(System.in);
	choiceD = scD.next();
	if (choiceD.equals("1")){
	    if (nausea){
		System.out.println("Nausea has already been upgraded.");
		ans = true;
	    }
	   else if (DNAPoints <2){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
		notEnough = true;
	    }
	    else {
		DNAPoints = DNAPoints -2;
		notEnough = false;
		ans = false;
	    }
	}
	else if(choiceD.equals("2")){
	    if (coughing){
		System.out.println("Coughing has already been upgraded.");
		ans = true;
	    }
	   else if (DNAPoints <3){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
		notEnough = true;
	    }
	    else {
		DNAPoints = DNAPoints -3;
		notEnough = false;
		ans = false;
	    }
	}
	else if(choiceD.equals("3")){
	    if (rash){
		System.out.println("Rash has already been upgraded.");
		ans = true;
	    }
	    else if (DNAPoints <4){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
		notEnough = true;
	    }
	    else {
		DNAPoints = DNAPoints -4;
		notEnough = false;
		ans =false;
	    }
	}
	else if(choiceD.equals("4")){
	    if (anemia){
		System.out.println("Anemia has already been upgraded.");
		ans = true;
	    }
	    else if (DNAPoints <5){
		System.out.println("Not enough DNA Points to upgrade this.");
		ans = false;
		notEnough = true;
	    }
	    else {
		DNAPoints = DNAPoints -5;
		notEnough = false;
		ans = false;
	    }
	}
	else {
	    ans = true;
	}
  
	return ans;
    }


    //upgrade (called in turn)
    public void upgrade(){
	while(this.chooseA()){
	}
	if(choiceA.equals("1")){
	    System.out.println("You chose to Upgrade Transmission");
	    upgradeTr();
	}
	if (choiceA.equals("2")){
	    System.out.println("You chose to Upgrade Abilities");
	    upgradeAb();
	}
	if (choiceA.equals("3")){
	    System.out.println("You chose to Upgrade Symptoms");
	    upgradeSy();
	}
    }

    //upgradeTr, upgradeAb, upgradeSy
    public void upgradeTr(){
	while(this.chooseTr()){
	}

	if (notEnough){
	    System.out.println("No upgrade was made.");
	}
	else {
	    if(choiceB.equals("1")){
		System.out.println("You chose to upgrade livestock.");
		upgradeTransmission("livestock");
	    }
	    if(choiceB.equals("2")){
		System.out.println("You chose to upgrade rodent");
		upgradeTransmission("rodent");
	    }	
	    if(choiceB.equals("3")){
		System.out.println("You chose to upgrade bird");
		upgradeTransmission("bird");
	    }
	    if(choiceB.equals("4")){
		System.out.println("You chose to upgrade insect");
		upgradeTransmission("insect");
	    }
	    if(choiceB.equals("5")){
		System.out.println("You chose to upgrade blood");
		upgradeTransmission("blood");
	    }
	    if(choiceB.equals("6")){
		System.out.println("You chose to upgrade air");
		upgradeTransmission("air");
	    }
	    if(choiceB.equals("7")){
		System.out.println("You chose to upgrade water");
		upgradeTransmission("water");
	    }
	}
    }

    public void upgradeAb(){
	while(this.chooseAb()){
	}

	if (notEnough){
	    System.out.println("No upgrade was made.");
	}
	else {
	    if (choiceC.equals("1")){
		System.out.println("You chose to upgrade cold resistance");
		upgradeAbilities("coldR");
	    }
	    if(choiceC.equals("2")){
		System.out.println("You chose to upgrade heat resistance.");
		upgradeAbilities("heatR");
	    }	
	    if(choiceC.equals("3")){
		System.out.println("You chose to upgrade Drug resistance");
	        upgradeAbilities("drugR");
	    }
	    if(choiceC.equals("4")){
		System.out.println("You chose to upgrade genetic hardening");
	        upgradeAbilities("GeneticH");
	    }
	    if(choiceC.equals("5")){
		System.out.println("You chose to upgrade genetic resistance");
	        upgradeAbilities("GeneticR");
	    }
	}
    }

    public void upgradeSy(){
	while(this.chooseSy()){
	}

	if (notEnough){
	    System.out.println("No upgrade was made");
	}
	else {

	    if (choiceD.equals("1")){
		System.out.println("You chose to upgrade nausea");
		upgradeSymptoms("nausea");
	    }
	    if(choiceD.equals("2")){
		System.out.println("You chose to upgrade coughing.");
		upgradeSymptoms("coughing");
	    }	
	    if(choiceD.equals("3")){
		System.out.println("You chose to upgrade rash");
		upgradeSymptoms("rash");
	    }
	    if(choiceD.equals("4")){
		System.out.println("You chose to upgrade anemia");
		upgradeSymptoms("anemia");
	    }
	}
    }


    //upgradeTransmission, upgradeAbility, upgradeSyptoms
    public void upgradeTransmission(String name) {
	

	if (name.equals("livestock")){
	    for (int i = 0; i <continents[5].length; i ++){
		continents[5][i] = continents[5][i] + .05;
	    }
	    livestock = true;
	    System.out.println(".......");
	    System.out.println( "Successfully upgraded livestock!");
	}
	if (name.equals("rodent")){
	    for (int i = 0; i <continents[5].length; i ++){
		continents[5][i] = continents[5][i] + .05;
	    }
	    rodent= true;
	    System.out.println(".......");
	    System.out.println( "Successfully upgraded rodent!");
	}
	if (name.equals("bird")){
	    for (int i = 0; i <continents[5].length; i ++){
		continents[5][i] = continents[5][i] + .05;
	    }
	    bird=true;	
	    System.out.println(".......");
	    System.out.println("successfully upgraded bird");
	}
	if (name.equals("insect")){
	    for (int i = 0; i <continents[5].length; i ++){
		continents[5][i] = continents[5][i] + .06;
	    }
	    insect =true;
	    System.out.println(".......");
	    System.out.println("Successfully upgraded insect!");
	}
	if (name.equals("blood")){
	    for (int i = 0; i <continents[5].length; i ++){
		continents[5][i] = continents[5][i] + .05;
	    }
	    blood =true;
	    System.out.println(".......");
	    System.out.println("Successfully upgraded blood!");	
	}
	if (name.equals("air")){
	    for (int i = 0; i <continents[5].length; i ++){
		continents[5][i] = continents[5][i] + .06;;
	    }
	    air =true;	
	    System.out.println(".......");
	    System.out.println("Successfully upgraded air!");
	}
	if (name.equals("water")){
	    for (int i = 0; i <continents[5].length; i ++){
		continents[5][i] = continents[5][i] + .05;
	    }
	    water =true;
	    System.out.println(".......");
	    System.out.println("Successfully upgraded water!");	
	}
    }

    public void upgradeSymptoms(String name) {
	if (name.equals("nausea")){
	    for (int i = 0; i <continents[5].length; i ++){
		continents[5][i] = continents[5][i] + .01;
	    }
	    for (int i = 0; i < continents[6].length; i ++){
		continents[6][i] =continents[6][i] + .03;
	    }
	    nausea=true;
	    System.out.println(".......");
	    System.out.println("Successfully upgraded nausea!");
	}
	else if (name.equals("coughing")){	
	    for (int i = 0; i <continents[5].length; i ++){
		continents[5][i] = continents[5][i] + .02;
	    }
	    for (int i = 0; i < continents[6].length; i ++){
		continents[6][i] =continents[6][i] + .04;
	    }
	    coughing = true;
	    System.out.println(".......");
	    System.out.println("Successfully upgraded coughing!");
	}
	else if (name.equals("rash")){
	    for (int i = 0; i <continents[5].length; i ++){
		continents[5][i] = continents[5][i] + .01;
	    }
	    for (int i = 0; i < continents[6].length; i ++){
		continents[6][i] =continents[6][i] + .03;
	    }
	    rash = true;
	    System.out.println(".......");
	    System.out.println("Successfully upgraded rash!");
	}
	else if (name.equals("anemia")){
	    for (int i = 0; i <continents[5].length; i ++){
		continents[5][i] = continents[5][i] + .02;
	    }
	    for (int i = 0; i < continents[6].length; i ++){
		continents[6][i] =continents[6][i] + .05;
	    }
	    anemia = true;
	    System.out.println(".......");
	    System.out.println("Successfully upgraded rash!");
	}
    }


    public void upgradeAbilities(String name){
	if (name.equals("coldR")){
	    coldR = true;
	    decEf = 10;
	}
	if (name.equals("heatR")){
	    heatR = true;
	    decEf = 15;

	}
	if (name.equals("drugR")){
	    drugR = true;
	    decEf = 20;

	}
	if (name.equals("GeneticH")){
	    GeneticH = true;
	    decEf = 25;
	}
	if (name.equals("GeneticR")){
	    GeneticR= true;
	    decEf = 30;
	}

    }

    //winning methods
    public void winner(){
	System.out.println ("Congratulations! Your disease, " +name + " has successfully destroyed the human population!");
	System.exit(0);
    }

    public void winYet(){
	if (totalDead/1000000 >= totalPop){
	
	    this.winner();
	}
    }
    
    //methods used in turn
    public void setChanceInfected(int cont){
	continents[5][cont]=((airInteraction[cont] + waterInteraction[cont])/100.0)+ (temp[cont]/5.0); 
    }
    
    //will be called when user first creates disease    
    public void firstSpread(int cont){
	setChanceInfected(cont);
    }
    public void spread(){
	for (int i = 0; i < continents[5].length; i ++){
	    if (totalchance >= 1.00){
		continents[3][i]= continents[3][i] + (continents[5][i]+15)*1000;
	    }
	    if (tchancedead >= 1.00){
		continents[7][i] = continents[7][i] + (continents[6][i]+ 20)*1000;
	}
	    if (continents[5][i]>0){
		if (Math.random() < continents[5][i]) {
		    continents[3][i] = continents[3][i] + 10 + (continents[5][i]*2);
		    totalchance =totalchance + continents[5][i];
		    
		}
	    if (Math.random()< continents[6][i]) {
		continents[7][i] =  continents[7][i] + 10 + (continents[6][i]*2);
		continents[6][i] = continents[6][i] + (5/100);
		
		tchancedead = tchancedead + continents[6][i];
		
	    }
	    }
	    else{
		setChanceInfected(i);
	    }
	}
	
    }
    
    public boolean choose(){
	boolean ans;
	System.out.println("Return 1 if you would like to upgrade your disease " + name);
	System.out.println("Return 2 if you would like to wait and collect DNAPoints");
	Scanner sc = new Scanner(System.in);
	choice = sc.nextLine();
	if (choice.equals("1")){
	    ans = false;
	}
	else if(choice.equals("2")){
	    ans = false;
	}
	else{
	    ans = true;
	}
	return ans;
    }


    public void turn() {
	this.winYet();

	for (int i = 0; i < continents[7].length; i ++){
	    totalDead = totalDead + continents[7][i];
	    totalInfected = totalInfected + continents[3][i];
	}

	System.out.println("Number dead: " + (long)totalDead);
	System.out.println("Number infected: " + (long)totalInfected);
	if (totalchance > 1.00){
	    double newchance = 1.00;
	    System.out.println("Infectivity: " + newchance *100 +"%");
	}
	if (tchancedead > 1.00){
	    double  newchancedead = 1.00;
	    System.out.println("Severity: " + newchancedead*100 + "%");
	}
	if (totalchance <= 1.00){
	    System.out.println("Infectivity: " + totalchance*100 + "%");
	}
	if (tchancedead <= 1.00){
	    System.out.println("Severity: " + tchancedead*100 + "%");
	    
	}

	while(this.choose()){
	}
	

	if(choice.equals("1")){
	    upgrade();
	}
	
	else if (choice.equals("2")){
	    if (Math.random() < totalInfected+totalDead) {
		DNAPoints = DNAPoints + 2;
		System.out.println("DNA Points: " + DNAPoints);
	    }
		//basically all the spread happens here and stats are returned again
		//the more infected in the entire world, the easier to obtain DNA points
		this.spread();

       
	    

	}
    }
}
   
