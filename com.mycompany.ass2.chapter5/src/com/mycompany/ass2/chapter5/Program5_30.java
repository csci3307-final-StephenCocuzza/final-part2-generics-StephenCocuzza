package com.mycompany.ass2.chapter5;
import java.util.Scanner;
public class Program5_30 {
	

	public class AutoPolicy 
	{
		
		   private int accountNumber; // policy account number
		   private String makeAndModel; // car that the policy applies to
		   private String state; // two-letter state abbreviation

		   // constructor
		   public AutoPolicy(int accountNumber, String makeAndModel)
		   {
		      this.accountNumber = accountNumber;
		      this.makeAndModel = makeAndModel;
		   }

		   // sets the accountNumber
		   public void setAccountNumber(int accountNumber)
		   {
		      this.accountNumber = accountNumber;
		   }

		   // returns the accountNumber
		   public int getAccountNumber()
		   {
		      return accountNumber;
		   } 

		   // sets the makeAndModel
		   public void setMakeAndModel(String makeAndModel)
		   {
		      this.makeAndModel = makeAndModel;
		   }

		   // returns the makeAndModel
		   public String getMakeAndModel()
		   {
		      return makeAndModel;
		   } 

		   // sets the state
		   public String setState(String state)
		   {
			  String result=""; 
		      if(state.equals("CT") || state.equals("MA") || state.equals("ME") || state.equals("NH") 
		    		  || state.equals("NJ") || state.equals("NY") || state.equals("PA") || state.equals("VT")){
		    	  this.state = state;
		    	  result="OK";
			   }
		      else{
		    	 System.out.println("invalid state code");
		    	  this.state="N/A";}
		      	
		      return result;
		   }

		   // returns the state
		   public String getState()
		   {
		      return state;
		   }

		   // predicate method returns whether the state has no-fault insurance
		   public boolean isNoFaultState()
		   {
		      boolean noFaultState; 
		      
		      // determine whether state has no-fault auto insurance
		      switch (getState()) // get AutoPolicy object's state abbreviation
		      {
		      case "CT":
		      case "MA":
		      case "ME":
		      case "NH":
		      case "VT":
		      case "NJ":
		      case "NY": 
		      case "PA":
		      noFaultState = true;
		            break;
		         default:
		            noFaultState = false;
		            break;
		      }

		      return noFaultState;
		   }
		   
		
		   }

		   // method that displays whether an AutoPolicy 
		   // is in a state with no-fault auto insurance
	}
