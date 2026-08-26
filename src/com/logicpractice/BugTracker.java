package com.logicpractice;

public class BugTracker {
	int bugId;
	String ApplicationName;
	String bugTittle;
	String severity;
	String priority;
	String status;
	
    int getBugId() {
    	return bugId;
    }
    String getApplicationName() {
    	return ApplicationName;
    }
    String getbugTittle() {
    	return bugTittle;
    }
    String getseverity() {
    	return severity;
    }
    String getpriority() {
    	return priority;
    }
    String getStatus() {
    	return status;
    }
    void  getAssignToDevloper(int bugId,String devloperName) {
         System.out.println("The bug id is:"+bugId);
         System.out.println("The devloper name is:"+devloperName);
    }
    void  getupdateStatus(String newStatus) {
    	status= newStatus;
    	System.out.println("Updated status:"+status);
    }
    void displaybug(int a,String b, String c,String d,String e,String f) {
    	System.out.println("The bugid is:"+a);
    	System.out.println("Application name:"+b);
    	System.out.println("Bug tittle:"+c);
    	System.out.println("Severity:"+d);
    	System.out.println("Priority:"+e);
    	System.out.println("Status:"+f);
    	
    	
    }
	public static void main(String[] args) {
		BugTracker A=new BugTracker();
		A.bugId=12345678;
		A. ApplicationName="ratnakar";
		A. bugTittle="sytax bug";
		A. severity="medium";
		A. priority="low level";
		A.status="incompleted";
		int  a=A.getBugId();
		String b=A.getApplicationName();
		String c=A.getbugTittle();
		String d=A.getpriority();
		String e=A.getseverity();
		String f=A.getStatus();
		
		
		System.out.println("--------------------------------");
		A.displaybug(a, b, c, d, e, f);
		A.getAssignToDevloper(a, "aditya");
		A.getupdateStatus("completed");
		System.out.println("--------------------------------");
	}

}
