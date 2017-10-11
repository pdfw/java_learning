第三周

题目：
    研发题：
       1）创建一个Service，并通过一个方法输出上一周作业的整形数组。
       2）创建一个RestControll，通过注解调用上述的Service方法，并将结果输出到前端。同时需要返回服务器端的起始时间、结束时间以及执行耗时
     
       注意事项：
           1）日期输出格式必须为long 类型。
           2) 项目的包依赖配置管理需要通过Gradle。
           3）通过Jetty Web容器提供服务
           4）必须通过内嵌容器的方式运行服务。
       可参考Gradle内嵌容器配置代码：
     
               ext['jetty.version'] = '9.4.5.v20170502'

               compile('org.springframework.boot:spring-boot-starter-web')
		{
			exclude module:'spring-boot-starter-tomcat'

		}

题目连接：		
https://github.com/mrjiangyan/java_learning/wiki/%E6%AF%8F%E5%91%A8%E5%AD%A6%E4%B9%A0%E8%AE%A1%E5%88%92		