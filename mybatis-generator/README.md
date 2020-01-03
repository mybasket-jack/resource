# resource
分享一些配置资源
>利用mybatis逆向生成工具生成informix的数据表的 mapper, pojo, example 等类，通过example对象实现对表的增删改查
# 需要的包
![lib包](https://upload-images.jianshu.io/upload_images/3944205-b4b1227fe229e3ec.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
#注意事项
> 数据库的字段类型的映射
> 不用schema时，url链接需要指定database
# 开启注解和配置mybatis的扫描
```
<!-- 开启注解扫描 -->
<context:component-scan base-package="cn.myccit.ifactory.action.mesview,
cn.myccit.ifactory.mybatis/>

<!-- mybatis -->
<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
	<property name="dataSource" ref="informixDataSource" />
</bean>

<!-- mybatis  mapper 扫描 -->
 <bean  class="org.mybatis.spring.mapper.MapperScannerConfigurer">
	<property name="basePackage" value="cn.myccit.ifactory.mybatis.mapper" />
	<property name="sqlSessionFactoryBeanName" value="sqlSessionFactory"/>
</bean>
```
#参考链接
[mybatis-generator官网](http://mybatis.org/generator/)

