/**
* @Company 青鸟软通   
* @Title: MybatisGenerator.java 
* @Package org.bana.code.mybatis 
* @author Liu Wenjie   
* @date 2014-11-3 上午10:31:21 
* @version V1.0   
*/ 
package org.bana.code.mybatis;

import java.util.ArrayList;
import java.util.List;

import org.bana.common.util.code.CodeGenerator;
import org.bana.common.util.code.dao.mybatis.mysql.MybatisGeneratorConfig4Mysql;
import org.bana.common.util.code.impl.CodeTemplateConfig;
import org.bana.common.util.code.impl.GeneratorOptions;
import org.bana.common.util.code.impl.GeneratorOptions.CoverResourceFile;
import org.bana.common.util.code.impl.SimpleCodeGenerator;
import org.junit.Test;

/** 
 * @ClassName: MybatisGenerator 
 * @Description: Mybatis的代码生成方法
 *  
 */
//@Ignore
public class MybatisGenerator {
	@Test
	public void testGenerator(){
		MybatisGeneratorConfig4Mysql mybatisGeneratorConfig = new MybatisGeneratorConfig4Mysql("t_isales_dailymgt_offduty", "isales_app");
		mybatisGeneratorConfig.setProjectBasePath("D:/isales/isales/isales-biz");
		mybatisGeneratorConfig.setBasePackage("com/haier/isales");
		mybatisGeneratorConfig.setModule("dailymgt");
//		mybatisGeneratorConfig.setFunctionPacage("dailyMgt");
		mybatisGeneratorConfig.setFunction("dailyOffduty");
		//设置生成代码中注释的用户名
		mybatisGeneratorConfig.setUserName("Huang Nana");
		//设置是否将功能名称作为生成功能代码的报名,默认是true.即会将function作为包名的一部分
		mybatisGeneratorConfig.setFunctionPackage(false);
		//设置生成配置文件的文件夹，是否包含function。默认是false，即不包含function路径
		mybatisGeneratorConfig.setFunctionPath(false);
		//是否生成CommonDao，第一次生成时使用它，之后就不要使用这个参数
		//mybatisGeneratorConfig.setGeneratorCommonDao(true);
		//生成器的调用
		//生成时的选项，是否覆盖已有的文件，请慎用
		GeneratorOptions option = new GeneratorOptions();
		option.setCoverCodeFile(true);
		option.setCoverResourceFile(CoverResourceFile.覆盖);
		mybatisGeneratorConfig.setGeneratorOptions(option);
		
		/*List<CodeTemplateConfig> codeList = new ArrayList<CodeTemplateConfig>();
		codeList.add(MybatisGeneratorConfig4Mysql.default_domain);
		mybatisGeneratorConfig.setResourceVelocities(codeList);
		mybatisGeneratorConfig.setCodeVelocities(codeList);*/
		//不生成代码文件
		//mybatisGeneratorConfig.setCodeVelocities(null);
		//配置制定的配置文件模板
/*		List<CodeTemplateConfig> resourceList = new ArrayList<CodeTemplateConfig>();
		resourceList.add(MybatisGeneratorConfig4Mysql.default_common_mapper);
		mybatisGeneratorConfig.setResourceVelocities(resourceList);*/
//		
		CodeGenerator codeGenerator = new SimpleCodeGenerator();
		codeGenerator.setGeneratorConfig(mybatisGeneratorConfig);
		codeGenerator.generate();
	}
}
