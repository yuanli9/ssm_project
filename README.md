# ssm_project

spring+springMvc+mybatis����

�򵥵ĵ�¼��֤


���Ϲ��������������⣺
-->userMpaper.xml��namespace���嵽��Ӧ��Dao ��������com.ssm.yuanli.dao.UserDao
���ֻд�˰���������������ʱ�����쳣�����ǵ�¼��ʱ��ᱨ500
error�� Invalid bound statement (not found): com.ssm.yuanli.dao.UserDao.login


-->�Զ�ɨ���������ʱע�������Χ
	��service�㣬���������com.ssm.yuanli.service��com.ssm.yuanli.service.impl
��ô����ʱ����ֻдǰ��Ҳ���ԣ����serviceʵ�ֵİ�����com.ssm.yuanli.serviceImpl������Ҫ��дһ����

error��Error creating bean with name 'userController': Injection of resource dependencies failed; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.ssm.yuanli.service.UserService] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency.