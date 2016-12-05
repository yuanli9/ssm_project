# ssm_project

spring+springMvc+mybatis整合

简单的登录验证


整合过程中遇到的问题：
-->userMpaper.xml中namespace具体到对应的Dao 如这里是com.ssm.yuanli.dao.UserDao
如果只写了包名则启动服务器时不报异常，但是登录的时候会报500
error： Invalid bound statement (not found): com.ssm.yuanli.dao.UserDao.login


-->自动扫描组件配置时注意包名范围
	如service层，包名如果是com.ssm.yuanli.service和com.ssm.yuanli.service.impl
那么配置时可以只写前者也可以，如果service实现的包名是com.ssm.yuanli.serviceImpl，则需要多写一个。

error：Error creating bean with name 'userController': Injection of resource dependencies failed; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.ssm.yuanli.service.UserService] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency.