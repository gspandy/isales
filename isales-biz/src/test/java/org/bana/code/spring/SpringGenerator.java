/**
* @Company 青鸟软通   
* @Title: SpringGenerator.java 
* @Package org.bana.code.spring 
* @author Liu Wenjie   
* @date 2014-11-3 下午7:31:01 
* @version V1.0   
*/ 
package org.bana.code.spring;

import org.bana.common.util.code.CodeGenerator;
import org.bana.common.util.code.impl.GeneratorOptions;
import org.bana.common.util.code.impl.GeneratorOptions.CoverResourceFile;
import org.bana.common.util.code.impl.SimpleCodeGenerator;
import org.bana.common.util.code.service.spring.SpringGeneratorConfig;
import org.bana.common.util.code.service.spring.plugin.SpringGeneratorConfigMybatisPlugin;
import org.junit.Test;

/** 
 * @ClassName: SpringGenerator 
 * @Description: spring 的代码生成器使用方法
 *  
 */
public class SpringGenerator {
	
	@Test
	public void testGenerator(){
		SpringGeneratorConfigMybatisPlugin springGeneratorConfig = new SpringGeneratorConfigMybatisPlugin();
		springGeneratorConfig.setProjectBasePath("D:/isales/isales/isales-biz");
		springGeneratorConfig.setBasePackage("com/haier/isales");
		springGeneratorConfig.setModule("dailymgt");
		springGeneratorConfig.setFunction("dailyMgt");
		//设置生成代码中注释的用户名
		springGeneratorConfig.setUserName("Huang Nana");
		//设置是否将功能名称作为生成功能代码的报名,默认是true.即会将function作为包名的一部分,如果function为null则默认会是false
		springGeneratorConfig.setFunctionPackage(false);
		//设置生成配置文件的文件夹，是否包含function。默认是false，即不包含function路径
		springGeneratorConfig.setFunctionPath(false);
		//可以主动设置dao对应的baseDAO的名称
		//springGeneratorConfig.setBaseDaoName("baseHrnetDAO");
		//生成器的调用
		//生成时的选项，是否覆盖已有的文件，请慎用
//		GeneratorOptions option = new GeneratorOptions();
//		option.setCoverCodeFile(true);
//		option.setCoverResourceFile(CoverResourceFile.覆盖);
//		springGeneratorConfig.setGeneratorOptions(option);
		
		CodeGenerator codeGenerator = new SimpleCodeGenerator();
		codeGenerator.setGeneratorConfig(springGeneratorConfig);
		codeGenerator.generate();
	}
}
