package ifactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;



public class MybatisGenerator {
	public  void generator() throws Exception{
	    List<String> warnings = new ArrayList<String>();
	    boolean overview = true;
	    //指定逆向工程的配置文件
	    //File configFile = new File("C:/mesWorkspace/mybatis-generator/src/ifactory/generatorConfig-base.xml");
	    File configFile = new File("./src/ifactory/generatorConfig-base.xml");
	    ConfigurationParser cp = new ConfigurationParser(warnings);
	    Configuration config = cp.parseConfiguration(configFile);
	    DefaultShellCallback callback = new DefaultShellCallback(overview);
	    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback,warnings);
	    myBatisGenerator.generate(null);
	    System.out.println("代码生成完毕>>>>>>>>>>>>");

	}


	public static void main(String[] args) throws Exception {
	   
		MybatisGenerator generatorSqlmap = new MybatisGenerator();
	    generatorSqlmap.generator();
	        
	}
}
