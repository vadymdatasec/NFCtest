public class org.apache.log4j.jmx.Agent {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static org.apache.log4j.Logger a;
	 public static java.lang.Class b; //synthetic
	 /* # direct methods */
	 public static org.apache.log4j.jmx.Agent ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.jmx.Agent.b;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.jmx.Agent"; // const-string v0, "org.apache.log4j.jmx.Agent"
		 org.apache.log4j.jmx.Agent .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 return;
} // .end method
public org.apache.log4j.jmx.Agent ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public static java.lang.Class a ( java.lang.String p0 ) { //synthethic
	 /* .locals 1 */
	 /* .line 1 */
	 try { // :try_start_0
		 java.lang.Class .forName ( p0 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p0 */
		 /* new-instance v0, Ljava/lang/NoClassDefFoundError; */
		 /* invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V */
		 (( java.lang.NoClassDefFoundError ) v0 ).initCause ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
		 /* throw p0 */
	 } // .end method
	 public static java.lang.Object a ( ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 final String v0 = "com.sun.jdmk.comm.HtmlAdapterServer"; // const-string v0, "com.sun.jdmk.comm.HtmlAdapterServer"
			 /* .line 2 */
			 java.lang.Class .forName ( v0 );
			 (( java.lang.Class ) v0 ).newInstance ( ); // invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_2 */
			 /* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 3 */
			 /* new-instance v1, Ljava/lang/RuntimeException; */
			 (( java.lang.IllegalAccessException ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->toString()Ljava/lang/String;
			 /* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
			 /* throw v1 */
			 /* :catch_1 */
			 /* move-exception v0 */
			 /* .line 4 */
			 /* new-instance v1, Ljava/lang/RuntimeException; */
			 (( java.lang.InstantiationException ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/InstantiationException;->toString()Ljava/lang/String;
			 /* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
			 /* throw v1 */
			 /* :catch_2 */
			 /* move-exception v0 */
			 /* .line 5 */
			 /* new-instance v1, Ljava/lang/RuntimeException; */
			 (( java.lang.ClassNotFoundException ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/ClassNotFoundException;->toString()Ljava/lang/String;
			 /* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
			 /* throw v1 */
		 } // .end method
		 public static void a ( java.lang.Object p0 ) {
			 /* .locals 4 */
			 /* .line 6 */
			 try { // :try_start_0
				 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
				 final String v1 = "start"; // const-string v1, "start"
				 int v2 = 0; // const/4 v2, 0x0
				 /* new-array v3, v2, [Ljava/lang/Class; */
				 (( java.lang.Class ) v0 ).getMethod ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
				 /* new-array v1, v2, [Ljava/lang/Object; */
				 (( java.lang.reflect.Method ) v0 ).invoke ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
				 /* :try_end_0 */
				 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_2 */
				 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
				 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
				 return;
				 /* :catch_0 */
				 /* move-exception p0 */
				 /* .line 7 */
				 /* new-instance v0, Ljava/lang/RuntimeException; */
				 (( java.lang.IllegalAccessException ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/IllegalAccessException;->toString()Ljava/lang/String;
				 /* invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
				 /* throw v0 */
				 /* :catch_1 */
				 /* move-exception p0 */
				 /* .line 8 */
				 /* new-instance v0, Ljava/lang/RuntimeException; */
				 (( java.lang.NoSuchMethodException ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/NoSuchMethodException;->toString()Ljava/lang/String;
				 /* invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
				 /* throw v0 */
				 /* :catch_2 */
				 /* move-exception p0 */
				 /* .line 9 */
				 (( java.lang.reflect.InvocationTargetException ) p0 ).getTargetException ( ); // invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
				 /* .line 10 */
				 /* instance-of v0, p0, Ljava/lang/RuntimeException; */
				 /* if-nez v0, :cond_3 */
				 if ( p0 != null) { // if-eqz p0, :cond_2
					 /* .line 11 */
					 /* instance-of v0, p0, Ljava/lang/InterruptedException; */
					 /* if-nez v0, :cond_0 */
					 /* instance-of v0, p0, Ljava/io/InterruptedIOException; */
					 if ( v0 != null) { // if-eqz v0, :cond_1
						 /* .line 12 */
					 } // :cond_0
					 java.lang.Thread .currentThread ( );
					 (( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
					 /* .line 13 */
				 } // :cond_1
				 /* new-instance v0, Ljava/lang/RuntimeException; */
				 (( java.lang.Throwable ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
				 /* invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
				 /* throw v0 */
				 /* .line 14 */
			 } // :cond_2
			 /* new-instance p0, Ljava/lang/RuntimeException; */
			 /* invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V */
			 /* throw p0 */
			 /* .line 15 */
		 } // :cond_3
		 /* check-cast p0, Ljava/lang/RuntimeException; */
		 /* throw p0 */
	 } // .end method
	 /* # virtual methods */
	 public void start ( ) {
		 /* .locals 6 */
		 final String v0 = "Problem while registering MBeans instances."; // const-string v0, "Problem while registering MBeans instances."
		 /* .line 1 */
		 javax.management.MBeanServerFactory .createMBeanServer ( );
		 /* .line 2 */
		 org.apache.log4j.jmx.Agent .a ( );
		 /* .line 3 */
		 try { // :try_start_0
			 v3 = org.apache.log4j.jmx.Agent.a;
			 final String v4 = "Registering HtmlAdaptorServer instance."; // const-string v4, "Registering HtmlAdaptorServer instance."
			 (( org.apache.log4j.Category ) v3 ).info ( v4 ); // invoke-virtual {v3, v4}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
			 /* .line 4 */
			 /* new-instance v3, Ljavax/management/ObjectName; */
			 final String v4 = "Adaptor:name=html,port=8082"; // const-string v4, "Adaptor:name=html,port=8082"
			 /* invoke-direct {v3, v4}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;)V */
			 /* .line 5 */
			 v3 = org.apache.log4j.jmx.Agent.a;
			 final String v4 = "Registering HierarchyDynamicMBean instance."; // const-string v4, "Registering HierarchyDynamicMBean instance."
			 (( org.apache.log4j.Category ) v3 ).info ( v4 ); // invoke-virtual {v3, v4}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
			 /* .line 6 */
			 /* new-instance v3, Lorg/apache/log4j/jmx/HierarchyDynamicMBean; */
			 /* invoke-direct {v3}, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;-><init>()V */
			 /* .line 7 */
			 /* new-instance v4, Ljavax/management/ObjectName; */
			 final String v5 = "log4j:hiearchy=default"; // const-string v5, "log4j:hiearchy=default"
			 /* invoke-direct {v4, v5}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;)V */
			 /* :try_end_0 */
			 /* .catch Ljavax/management/JMException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 8 */
			 org.apache.log4j.jmx.Agent .a ( v2 );
			 return;
			 /* :catch_0 */
			 /* move-exception v1 */
			 /* .line 9 */
			 v2 = org.apache.log4j.jmx.Agent.a;
			 (( org.apache.log4j.Category ) v2 ).error ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
			 return;
			 /* :catch_1 */
			 /* move-exception v1 */
			 /* .line 10 */
			 v2 = org.apache.log4j.jmx.Agent.a;
			 (( org.apache.log4j.Category ) v2 ).error ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
			 return;
		 } // .end method
