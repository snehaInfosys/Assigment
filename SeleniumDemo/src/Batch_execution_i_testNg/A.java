package Batch_execution_i_testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
	
@Test
public void TC1() {
	Reporter.log("running tc1",true);
}
@Test
public void TC2() {
	Reporter.log("running tc2",true);
}
@Test
public void TC3() {
	Reporter.log("running tc3",true);
}
}
