/**
* @Company 青鸟软通   
* @Title: TestIKExpression.java 
* @Package org.bana.code.ikexpresion 
* @author Liu Wenjie   
* @date 2014-11-17 下午8:44:37 
* @version V1.0   
*/ 
package org.bana.code.ikexpresion;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.wltea.expression.ExpressionEvaluator;
import org.wltea.expression.datameta.Variable;




/** 
 * @ClassName: TestIKExpression 
 * @Description: 
 *  
 */
public class TestIKExpression {
	@Test
	public void test1(){
	    //定义表达式  
	    String expression = "\"Hello World \" + 用户名";  
	    //给表达式中的变量 "用户名" 付上下文的值  
	    List<Variable> variables = new ArrayList<Variable>();  
	    variables.add(Variable.createVariable("用户名", "IK Expression"));  
	    //执行表达式  
	    Object result = ExpressionEvaluator.evaluate(expression, variables);  
	    System.out.println("Result = " + result);    
	}
	
	@Test
	public void test2(){
		//定义表达式  
	    String expression = "(申请金额  > 10000)?\"总经理审批\":\"部门经理审批\"";  
	    //给表达式中的变量 "用户名" 付上下文的值  
	    List<Variable> variables = new ArrayList<Variable>();  
	    variables.add(Variable.createVariable("申请金额", 200));  
	    //执行表达式  
	    Object result = ExpressionEvaluator.evaluate(expression, variables);  
	    System.out.println("Result = " + result);    
	}
	
	@Test
	public void test3(){
		//定义表达式  
	    String expression = "(登录次数 + 级别) * 2 + 参数";  
	    //给表达式中的变量 "用户名" 付上下文的值  
	    List<Variable> variables = new ArrayList<Variable>();  
	    variables.add(Variable.createVariable("登录次数", 5));  
	    variables.add(Variable.createVariable("级别", 2));  
	    variables.add(Variable.createVariable("参数", 8));  
	    //执行表达式  
	    Object result = ExpressionEvaluator.evaluate(expression, variables);  
	    System.out.println("Result = " + result);  
	}
	
	@Test
	public void test4(){
		//定义表达式  
	    String expression = "(申请金额  > 10000 && 测试2 > 5)?" +
	    						" ((测试1 > 200) ? \"你好\" : \"可以\") " +
	    					": " +
	    					"	\"部门经理审批\"";  
	    //给表达式中的变量 "用户名" 付上下文的值  
	    List<Variable> variables = new ArrayList<Variable>();  
	    variables.add(Variable.createVariable("申请金额", 20000));  
	    variables.add(Variable.createVariable("测试1", 300));  
	    variables.add(Variable.createVariable("测试2", 300));  
	    //执行表达式  
	    Object result = ExpressionEvaluator.evaluate(expression, variables);  
	    System.out.println("Result = " + result);    
	}
	
	
	@Test
	public void test5(){
		//定义表达式  
		String expression = "((当天录入销量<2000 && 是否当天销量) ? \"当天\" : \"\")+\"销量，获得\"+((当天录入销量<2000 && 是否当天销量) ? 6 : 3)+\"颗海星星\"";  
		//给表达式中的变量 "用户名" 付上下文的值  
		List<Variable> variables = new ArrayList<Variable>();  
		variables.add(Variable.createVariable("当天录入销量", 2));  
		variables.add(Variable.createVariable("是否当天销量", true));  
		//执行表达式  
		Object result = ExpressionEvaluator.evaluate(expression, variables);  
		System.out.println("Result = " + result);    
	}
	
}
