public class org.apache.log4j.PropertyConfigurator implements org.apache.log4j.spi.Configurator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.String LOGGER_FACTORY_KEY;
	 public static java.lang.Class d; //synthetic
	 public static java.lang.Class e; //synthetic
	 public static java.lang.Class f; //synthetic
	 public static java.lang.Class g; //synthetic
	 public static java.lang.Class h; //synthetic
	 public static java.lang.Class i; //synthetic
	 /* # instance fields */
	 public java.util.Hashtable a;
	 public org.apache.log4j.spi.LoggerRepository b;
	 public org.apache.log4j.spi.LoggerFactory c;
	 /* # direct methods */
	 public org.apache.log4j.PropertyConfigurator ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/util/Hashtable; */
		 /* const/16 v1, 0xb */
		 /* invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V */
		 this.a = v0;
		 /* .line 3 */
		 /* new-instance v0, Lm/a/b/b; */
		 /* invoke-direct {v0}, Lm/a/b/b;-><init>()V */
		 this.c = v0;
		 return;
	 } // .end method
	 public static java.lang.Class b ( java.lang.String p0 ) { //synthethic
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
		 public static void configure ( java.io.InputStream p0 ) {
			 /* .locals 2 */
			 /* .line 3 */
			 /* new-instance v0, Lorg/apache/log4j/PropertyConfigurator; */
			 /* invoke-direct {v0}, Lorg/apache/log4j/PropertyConfigurator;-><init>()V */
			 org.apache.log4j.LogManager .getLoggerRepository ( );
			 (( org.apache.log4j.PropertyConfigurator ) v0 ).doConfigure ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Lorg/apache/log4j/PropertyConfigurator;->doConfigure(Ljava/io/InputStream;Lorg/apache/log4j/spi/LoggerRepository;)V
			 return;
		 } // .end method
		 public static void configure ( java.lang.String p0 ) {
			 /* .locals 2 */
			 /* .line 1 */
			 /* new-instance v0, Lorg/apache/log4j/PropertyConfigurator; */
			 /* invoke-direct {v0}, Lorg/apache/log4j/PropertyConfigurator;-><init>()V */
			 org.apache.log4j.LogManager .getLoggerRepository ( );
			 (( org.apache.log4j.PropertyConfigurator ) v0 ).doConfigure ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Lorg/apache/log4j/PropertyConfigurator;->doConfigure(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerRepository;)V
			 return;
		 } // .end method
		 public static void configure ( java.net.URL p0 ) {
			 /* .locals 2 */
			 /* .line 2 */
			 /* new-instance v0, Lorg/apache/log4j/PropertyConfigurator; */
			 /* invoke-direct {v0}, Lorg/apache/log4j/PropertyConfigurator;-><init>()V */
			 org.apache.log4j.LogManager .getLoggerRepository ( );
			 (( org.apache.log4j.PropertyConfigurator ) v0 ).doConfigure ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Lorg/apache/log4j/PropertyConfigurator;->doConfigure(Ljava/net/URL;Lorg/apache/log4j/spi/LoggerRepository;)V
			 return;
		 } // .end method
		 public static void configure ( java.util.Properties p0 ) {
			 /* .locals 2 */
			 /* .line 4 */
			 /* new-instance v0, Lorg/apache/log4j/PropertyConfigurator; */
			 /* invoke-direct {v0}, Lorg/apache/log4j/PropertyConfigurator;-><init>()V */
			 org.apache.log4j.LogManager .getLoggerRepository ( );
			 (( org.apache.log4j.PropertyConfigurator ) v0 ).doConfigure ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Lorg/apache/log4j/PropertyConfigurator;->doConfigure(Ljava/util/Properties;Lorg/apache/log4j/spi/LoggerRepository;)V
			 return;
		 } // .end method
		 public static void configureAndWatch ( java.lang.String p0 ) {
			 /* .locals 2 */
			 /* const-wide/32 v0, 0xea60 */
			 /* .line 1 */
			 org.apache.log4j.PropertyConfigurator .configureAndWatch ( p0,v0,v1 );
			 return;
		 } // .end method
		 public static void configureAndWatch ( java.lang.String p0, Long p1 ) {
			 /* .locals 1 */
			 /* .line 2 */
			 /* new-instance v0, Lm/a/b/d; */
			 /* invoke-direct {v0, p0}, Lm/a/b/d;-><init>(Ljava/lang/String;)V */
			 /* .line 3 */
			 (( org.apache.log4j.helpers.FileWatchdog ) v0 ).setDelay ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/apache/log4j/helpers/FileWatchdog;->setDelay(J)V
			 /* .line 4 */
			 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
			 return;
		 } // .end method
		 /* # virtual methods */
		 public org.apache.log4j.Appender a ( java.lang.String p0 ) {
			 /* .locals 1 */
			 /* .line 109 */
			 v0 = this.a;
			 (( java.util.Hashtable ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast p1, Lorg/apache/log4j/Appender; */
		 } // .end method
		 public org.apache.log4j.Appender a ( java.util.Properties p0, java.lang.String p1 ) {
			 /* .locals 16 */
			 /* move-object/from16 v0, p0 */
			 /* move-object/from16 v1, p1 */
			 /* move-object/from16 v2, p2 */
			 /* .line 37 */
			 (( org.apache.log4j.PropertyConfigurator ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lorg/apache/log4j/PropertyConfigurator;->a(Ljava/lang/String;)Lorg/apache/log4j/Appender;
			 if ( v3 != null) { // if-eqz v3, :cond_0
				 /* .line 38 */
				 /* new-instance v1, Ljava/lang/StringBuffer; */
				 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
				 final String v4 = "Appender \""; // const-string v4, "Appender \""
				 (( java.lang.StringBuffer ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 final String v2 = "\" was already parsed."; // const-string v2, "\" was already parsed."
				 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
				 org.apache.log4j.helpers.LogLog .debug ( v1 );
				 /* .line 39 */
			 } // :cond_0
			 /* new-instance v3, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
			 final String v4 = "log4j.appender."; // const-string v4, "log4j.appender."
			 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 /* .line 40 */
			 /* new-instance v4, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
			 (( java.lang.StringBuffer ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String v5 = ".layout"; // const-string v5, ".layout"
			 (( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 /* .line 41 */
			 v5 = org.apache.log4j.PropertyConfigurator.f;
			 /* if-nez v5, :cond_1 */
			 final String v5 = "org.apache.log4j.Appender"; // const-string v5, "org.apache.log4j.Appender"
			 org.apache.log4j.PropertyConfigurator .b ( v5 );
		 } // :cond_1
		 int v6 = 0; // const/4 v6, 0x0
		 org.apache.log4j.helpers.OptionConverter .instantiateByKey ( v1,v3,v5,v6 );
		 /* check-cast v5, Lorg/apache/log4j/Appender; */
		 final String v7 = "\"."; // const-string v7, "\"."
		 /* if-nez v5, :cond_2 */
		 /* .line 42 */
		 /* new-instance v1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v3 = "Could not instantiate appender named \""; // const-string v3, "Could not instantiate appender named \""
		 (( java.lang.StringBuffer ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).append ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .error ( v1 );
		 /* .line 43 */
	 } // :cond_2
	 /* .line 44 */
	 /* instance-of v8, v5, Lorg/apache/log4j/spi/OptionHandler; */
	 if ( v8 != null) { // if-eqz v8, :cond_b
		 v8 = 		 /* .line 45 */
		 final String v9 = "."; // const-string v9, "."
		 if ( v8 != null) { // if-eqz v8, :cond_4
			 /* .line 46 */
			 v8 = org.apache.log4j.PropertyConfigurator.g;
			 /* if-nez v8, :cond_3 */
			 final String v8 = "org.apache.log4j.Layout"; // const-string v8, "org.apache.log4j.Layout"
			 org.apache.log4j.PropertyConfigurator .b ( v8 );
		 } // :cond_3
		 org.apache.log4j.helpers.OptionConverter .instantiateByKey ( v1,v4,v8,v6 );
		 /* check-cast v8, Lorg/apache/log4j/Layout; */
		 if ( v8 != null) { // if-eqz v8, :cond_4
			 /* .line 47 */
			 /* .line 48 */
			 /* new-instance v10, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V */
			 final String v11 = "Parsing layout options for \""; // const-string v11, "Parsing layout options for \""
			 (( java.lang.StringBuffer ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v10 ).append ( v2 ); // invoke-virtual {v10, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v10 ).append ( v7 ); // invoke-virtual {v10, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 org.apache.log4j.helpers.LogLog .debug ( v10 );
			 /* .line 49 */
			 /* new-instance v10, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V */
			 (( java.lang.StringBuffer ) v10 ).append ( v4 ); // invoke-virtual {v10, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v10 ).append ( v9 ); // invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 org.apache.log4j.config.PropertySetter .setProperties ( v8,v1,v4 );
			 /* .line 50 */
			 /* new-instance v4, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
			 final String v8 = "End of parsing for \""; // const-string v8, "End of parsing for \""
			 (( java.lang.StringBuffer ) v4 ).append ( v8 ); // invoke-virtual {v4, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v4 ).append ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 org.apache.log4j.helpers.LogLog .debug ( v4 );
			 /* .line 51 */
		 } // :cond_4
		 /* new-instance v4, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v8 = ".errorhandler"; // const-string v8, ".errorhandler"
		 (( java.lang.StringBuffer ) v4 ).append ( v8 ); // invoke-virtual {v4, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 /* .line 52 */
		 org.apache.log4j.helpers.OptionConverter .findAndSubst ( v4,v1 );
		 if ( v8 != null) { // if-eqz v8, :cond_a
			 /* .line 53 */
			 v8 = org.apache.log4j.PropertyConfigurator.h;
			 /* if-nez v8, :cond_5 */
			 final String v8 = "org.apache.log4j.spi.ErrorHandler"; // const-string v8, "org.apache.log4j.spi.ErrorHandler"
			 org.apache.log4j.PropertyConfigurator .b ( v8 );
		 } // :cond_5
		 org.apache.log4j.helpers.OptionConverter .instantiateByKey ( v1,v4,v8,v6 );
		 /* check-cast v6, Lorg/apache/log4j/spi/ErrorHandler; */
		 if ( v6 != null) { // if-eqz v6, :cond_a
			 /* .line 54 */
			 /* .line 55 */
			 /* new-instance v8, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V */
			 final String v10 = "Parsing errorhandler options for \""; // const-string v10, "Parsing errorhandler options for \""
			 (( java.lang.StringBuffer ) v8 ).append ( v10 ); // invoke-virtual {v8, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v8 ).append ( v2 ); // invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v8 ).append ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 org.apache.log4j.helpers.LogLog .debug ( v8 );
			 /* .line 56 */
			 v8 = this.b;
			 (( org.apache.log4j.PropertyConfigurator ) v0 ).a ( v6, v4, v1, v8 ); // invoke-virtual {v0, v6, v4, v1, v8}, Lorg/apache/log4j/PropertyConfigurator;->a(Lorg/apache/log4j/spi/ErrorHandler;Ljava/lang/String;Ljava/util/Properties;Lorg/apache/log4j/spi/LoggerRepository;)V
			 /* .line 57 */
			 /* new-instance v8, Ljava/util/Properties; */
			 /* invoke-direct {v8}, Ljava/util/Properties;-><init>()V */
			 int v10 = 3; // const/4 v10, 0x3
			 /* new-array v11, v10, [Ljava/lang/String; */
			 /* .line 58 */
			 /* new-instance v12, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v12}, Ljava/lang/StringBuffer;-><init>()V */
			 (( java.lang.StringBuffer ) v12 ).append ( v4 ); // invoke-virtual {v12, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v12 ).append ( v9 ); // invoke-virtual {v12, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String v13 = "root-ref"; // const-string v13, "root-ref"
			 (( java.lang.StringBuffer ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 int v13 = 0; // const/4 v13, 0x0
			 /* aput-object v12, v11, v13 */
			 /* new-instance v12, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v12}, Ljava/lang/StringBuffer;-><init>()V */
			 (( java.lang.StringBuffer ) v12 ).append ( v4 ); // invoke-virtual {v12, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v12 ).append ( v9 ); // invoke-virtual {v12, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String v14 = "logger-ref"; // const-string v14, "logger-ref"
			 (( java.lang.StringBuffer ) v12 ).append ( v14 ); // invoke-virtual {v12, v14}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 int v14 = 1; // const/4 v14, 0x1
			 /* aput-object v12, v11, v14 */
			 int v12 = 2; // const/4 v12, 0x2
			 /* new-instance v14, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v14}, Ljava/lang/StringBuffer;-><init>()V */
			 (( java.lang.StringBuffer ) v14 ).append ( v4 ); // invoke-virtual {v14, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v14 ).append ( v9 ); // invoke-virtual {v14, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String v15 = "appender-ref"; // const-string v15, "appender-ref"
			 (( java.lang.StringBuffer ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 /* aput-object v14, v11, v12 */
			 /* .line 59 */
			 /* invoke-virtual/range {p1 ..p1}, Ljava/util/Properties;->entrySet()Ljava/util/Set; */
		 v14 = 		 } // :goto_0
		 if ( v14 != null) { // if-eqz v14, :cond_9
			 /* .line 60 */
			 /* check-cast v14, Ljava/util/Map$Entry; */
			 int v15 = 0; // const/4 v15, 0x0
		 } // :goto_1
		 /* if-ge v15, v10, :cond_7 */
		 /* .line 61 */
		 /* aget-object v13, v11, v15 */
		 v10 = 		 (( java.lang.String ) v13 ).equals ( v10 ); // invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v10 != null) { // if-eqz v10, :cond_6
			 int v10 = 3; // const/4 v10, 0x3
		 } // :cond_6
		 /* add-int/lit8 v15, v15, 0x1 */
		 int v10 = 3; // const/4 v10, 0x3
		 int v13 = 0; // const/4 v13, 0x0
	 } // :cond_7
} // :goto_2
/* if-ne v15, v10, :cond_8 */
/* .line 62 */
(( java.util.Properties ) v8 ).put ( v13, v14 ); // invoke-virtual {v8, v13, v14}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_8
int v13 = 0; // const/4 v13, 0x0
/* .line 63 */
} // :cond_9
/* new-instance v10, Ljava/lang/StringBuffer; */
/* invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v10 ).append ( v4 ); // invoke-virtual {v10, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v10 ).append ( v9 ); // invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.config.PropertySetter .setProperties ( v6,v8,v4 );
/* .line 64 */
/* new-instance v4, Ljava/lang/StringBuffer; */
/* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
final String v6 = "End of errorhandler parsing for \""; // const-string v6, "End of errorhandler parsing for \""
(( java.lang.StringBuffer ) v4 ).append ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).append ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v4 );
/* .line 65 */
} // :cond_a
/* new-instance v4, Ljava/lang/StringBuffer; */
/* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).append ( v9 ); // invoke-virtual {v4, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.config.PropertySetter .setProperties ( v5,v1,v3 );
/* .line 66 */
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "Parsed \""; // const-string v4, "Parsed \""
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v4 = "\" options."; // const-string v4, "\" options."
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v3 );
/* .line 67 */
} // :cond_b
(( org.apache.log4j.PropertyConfigurator ) v0 ).a ( v1, v2, v5 ); // invoke-virtual {v0, v1, v2, v5}, Lorg/apache/log4j/PropertyConfigurator;->a(Ljava/util/Properties;Ljava/lang/String;Lorg/apache/log4j/Appender;)V
/* .line 68 */
(( org.apache.log4j.PropertyConfigurator ) v0 ).a ( v5 ); // invoke-virtual {v0, v5}, Lorg/apache/log4j/PropertyConfigurator;->a(Lorg/apache/log4j/Appender;)V
} // .end method
public void a ( java.util.Properties p0 ) {
/* .locals 3 */
final String v0 = "log4j.loggerFactory"; // const-string v0, "log4j.loggerFactory"
/* .line 1 */
org.apache.log4j.helpers.OptionConverter .findAndSubst ( v0,p1 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Setting category factory to ["; // const-string v2, "Setting category factory to ["
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = "]."; // const-string v2, "]."
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v1 );
/* .line 3 */
v1 = org.apache.log4j.PropertyConfigurator.d;
/* if-nez v1, :cond_0 */
final String v1 = "org.apache.log4j.spi.LoggerFactory"; // const-string v1, "org.apache.log4j.spi.LoggerFactory"
org.apache.log4j.PropertyConfigurator .b ( v1 );
} // :cond_0
v2 = this.c;
org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( v0,v1,v2 );
/* check-cast v0, Lorg/apache/log4j/spi/LoggerFactory; */
this.c = v0;
final String v1 = "log4j.factory."; // const-string v1, "log4j.factory."
/* .line 4 */
org.apache.log4j.config.PropertySetter .setProperties ( v0,p1,v1 );
} // :cond_1
return;
} // .end method
public void a ( java.util.Properties p0, java.lang.String p1, org.apache.log4j.Appender p2 ) {
/* .locals 9 */
/* .line 77 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "log4j.appender."; // const-string v1, "log4j.appender."
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = ".filter."; // const-string p2, ".filter."
(( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 78 */
v0 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* .line 79 */
/* new-instance v1, Ljava/util/Hashtable; */
/* invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V */
/* .line 80 */
(( java.util.Properties ) p1 ).keys ( ); // invoke-virtual {p1}, Ljava/util/Properties;->keys()Ljava/util/Enumeration;
final String v3 = ""; // const-string v3, ""
/* .line 81 */
} // :cond_0
v4 = } // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 82 */
/* check-cast v4, Ljava/lang/String; */
/* .line 83 */
v5 = (( java.lang.String ) v4 ).startsWith ( p2 ); // invoke-virtual {v4, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v5 != null) { // if-eqz v5, :cond_0
/* const/16 v5, 0x2e */
/* .line 84 */
v5 = (( java.lang.String ) v4 ).indexOf ( v5, v0 ); // invoke-virtual {v4, v5, v0}, Ljava/lang/String;->indexOf(II)I
int v6 = -1; // const/4 v6, -0x1
/* if-eq v5, v6, :cond_1 */
int v3 = 0; // const/4 v3, 0x0
/* .line 85 */
(( java.lang.String ) v4 ).substring ( v3, v5 ); // invoke-virtual {v4, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* add-int/lit8 v7, v5, 0x1 */
/* .line 86 */
(( java.lang.String ) v4 ).substring ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;
} // :cond_1
/* move-object v7, v3 */
/* move-object v3, v4 */
/* .line 87 */
} // :goto_1
(( java.util.Hashtable ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v8, Ljava/util/Vector; */
/* if-nez v8, :cond_2 */
/* .line 88 */
/* new-instance v8, Ljava/util/Vector; */
/* invoke-direct {v8}, Ljava/util/Vector;-><init>()V */
/* .line 89 */
(( java.util.Hashtable ) v1 ).put ( v3, v8 ); // invoke-virtual {v1, v3, v8}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_2
/* if-eq v5, v6, :cond_3 */
/* .line 90 */
org.apache.log4j.helpers.OptionConverter .findAndSubst ( v4,p1 );
/* .line 91 */
/* new-instance v4, Lm/a/b/c; */
/* invoke-direct {v4, v7, v3}, Lm/a/b/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.Vector ) v8 ).add ( v4 ); // invoke-virtual {v8, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
} // :cond_3
/* move-object v3, v7 */
/* .line 92 */
} // :cond_4
/* new-instance p2, Lm/a/b/g; */
/* invoke-direct {p2, v1}, Lm/a/b/g;-><init>(Ljava/util/Hashtable;)V */
/* .line 93 */
} // :cond_5
v0 = } // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 94 */
/* check-cast v0, Ljava/lang/String; */
/* .line 95 */
(( java.util.Properties ) p1 ).getProperty ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 96 */
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "Filter key: ["; // const-string v4, "Filter key: ["
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v4 = "] class: ["; // const-string v4, "] class: ["
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.util.Properties ) p1 ).getProperty ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v4 = "] props: "; // const-string v4, "] props: "
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.util.Hashtable ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v3 );
/* .line 97 */
v3 = org.apache.log4j.PropertyConfigurator.i;
/* if-nez v3, :cond_6 */
final String v3 = "org.apache.log4j.spi.Filter"; // const-string v3, "org.apache.log4j.spi.Filter"
org.apache.log4j.PropertyConfigurator .b ( v3 );
} // :cond_6
int v4 = 0; // const/4 v4, 0x0
org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( v2,v3,v4 );
/* check-cast v2, Lorg/apache/log4j/spi/Filter; */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 98 */
/* new-instance v3, Lorg/apache/log4j/config/PropertySetter; */
/* invoke-direct {v3, v2}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V */
/* .line 99 */
(( java.util.Hashtable ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/Vector; */
/* .line 100 */
(( java.util.Vector ) v0 ).elements ( ); // invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;
/* .line 101 */
v4 = } // :goto_3
if ( v4 != null) { // if-eqz v4, :cond_7
/* .line 102 */
/* check-cast v4, Lm/a/b/c; */
/* .line 103 */
v5 = this.a;
v4 = this.b;
(( org.apache.log4j.config.PropertySetter ) v3 ).setProperty ( v5, v4 ); // invoke-virtual {v3, v5, v4}, Lorg/apache/log4j/config/PropertySetter;->setProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 104 */
} // :cond_7
(( org.apache.log4j.config.PropertySetter ) v3 ).activate ( ); // invoke-virtual {v3}, Lorg/apache/log4j/config/PropertySetter;->activate()V
/* .line 105 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Adding filter of type ["; // const-string v3, "Adding filter of type ["
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Object ) v2 ).getClass ( ); // invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String v3 = "] to appender named ["; // const-string v3, "] to appender named ["
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = "]."; // const-string v3, "]."
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v0 );
/* .line 106 */
/* goto/16 :goto_2 */
/* .line 107 */
} // :cond_8
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Missing class definition for filter: ["; // const-string v3, "Missing class definition for filter: ["
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "]"; // const-string v0, "]"
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( v0 );
/* goto/16 :goto_2 */
} // :cond_9
return;
} // .end method
public void a ( java.util.Properties p0, org.apache.log4j.Logger p1, java.lang.String p2 ) {
/* .locals 2 */
/* .line 12 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "log4j.additivity."; // const-string v1, "log4j.additivity."
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.OptionConverter .findAndSubst ( v0,p1 );
/* .line 13 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Handling log4j.additivity."; // const-string v1, "Handling log4j.additivity."
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "=["; // const-string v1, "=["
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "]"; // const-string v1, "]"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v0 );
if ( p1 != null) { // if-eqz p1, :cond_0
final String v0 = ""; // const-string v0, ""
/* .line 14 */
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 15 */
p1 = org.apache.log4j.helpers.OptionConverter .toBoolean ( p1,v0 );
/* .line 16 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Setting additivity for \""; // const-string v1, "Setting additivity for \""
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p3 = "\" to "; // const-string p3, "\" to "
(( java.lang.StringBuffer ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p3 );
/* .line 17 */
(( org.apache.log4j.Category ) p2 ).setAdditivity ( p1 ); // invoke-virtual {p2, p1}, Lorg/apache/log4j/Category;->setAdditivity(Z)V
} // :cond_0
return;
} // .end method
public void a ( java.util.Properties p0, org.apache.log4j.Logger p1, java.lang.String p2, java.lang.String p3, java.lang.String p4 ) {
/* .locals 4 */
/* .line 18 */
/* new-instance p3, Ljava/lang/StringBuffer; */
/* invoke-direct {p3}, Ljava/lang/StringBuffer;-><init>()V */
final String v0 = "Parsing for ["; // const-string v0, "Parsing for ["
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "] with value=["; // const-string v0, "] with value=["
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( p5 ); // invoke-virtual {p3, p5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "]."; // const-string v0, "]."
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p3 );
/* .line 19 */
/* new-instance p3, Ljava/util/StringTokenizer; */
final String v1 = ","; // const-string v1, ","
/* invoke-direct {p3, p5, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 20 */
v2 = (( java.lang.String ) p5 ).startsWith ( v1 ); // invoke-virtual {p5, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v2, :cond_4 */
final String v2 = ""; // const-string v2, ""
p5 = (( java.lang.String ) p5 ).equals ( v2 ); // invoke-virtual {p5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez p5, :cond_4 */
/* .line 21 */
p5 = (( java.util.StringTokenizer ) p3 ).hasMoreTokens ( ); // invoke-virtual {p3}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
/* if-nez p5, :cond_0 */
return;
/* .line 22 */
} // :cond_0
(( java.util.StringTokenizer ) p3 ).nextToken ( ); // invoke-virtual {p3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
/* .line 23 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Level token is ["; // const-string v3, "Level token is ["
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p5 ); // invoke-virtual {v2, p5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v0 );
final String v0 = "inherited"; // const-string v0, "inherited"
/* .line 24 */
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( p5 ); // invoke-virtual {v0, p5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v0, :cond_2 */
final String v0 = "null"; // const-string v0, "null"
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( p5 ); // invoke-virtual {v0, p5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 25 */
} // :cond_1
v0 = org.apache.log4j.Level.DEBUG;
org.apache.log4j.helpers.OptionConverter .toLevel ( p5,v0 );
(( org.apache.log4j.Category ) p2 ).setLevel ( p5 ); // invoke-virtual {p2, p5}, Lorg/apache/log4j/Category;->setLevel(Lorg/apache/log4j/Level;)V
} // :cond_2
} // :goto_0
final String p5 = "root"; // const-string p5, "root"
/* .line 26 */
p5 = (( java.lang.String ) p4 ).equals ( p5 ); // invoke-virtual {p4, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p5 != null) { // if-eqz p5, :cond_3
final String p5 = "The root logger cannot be set to null."; // const-string p5, "The root logger cannot be set to null."
/* .line 27 */
org.apache.log4j.helpers.LogLog .warn ( p5 );
} // :cond_3
int p5 = 0; // const/4 p5, 0x0
/* .line 28 */
(( org.apache.log4j.Category ) p2 ).setLevel ( p5 ); // invoke-virtual {p2, p5}, Lorg/apache/log4j/Category;->setLevel(Lorg/apache/log4j/Level;)V
/* .line 29 */
} // :goto_1
/* new-instance p5, Ljava/lang/StringBuffer; */
/* invoke-direct {p5}, Ljava/lang/StringBuffer;-><init>()V */
final String v0 = "Category "; // const-string v0, "Category "
(( java.lang.StringBuffer ) p5 ).append ( v0 ); // invoke-virtual {p5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p5 ).append ( p4 ); // invoke-virtual {p5, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p4 = " set to "; // const-string p4, " set to "
(( java.lang.StringBuffer ) p5 ).append ( p4 ); // invoke-virtual {p5, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.Category ) p2 ).getLevel ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getLevel()Lorg/apache/log4j/Level;
(( java.lang.StringBuffer ) p5 ).append ( p4 ); // invoke-virtual {p5, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p5 ).toString ( ); // invoke-virtual {p5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p4 );
/* .line 30 */
} // :cond_4
(( org.apache.log4j.Category ) p2 ).removeAllAppenders ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->removeAllAppenders()V
/* .line 31 */
} // :cond_5
} // :goto_2
p4 = (( java.util.StringTokenizer ) p3 ).hasMoreTokens ( ); // invoke-virtual {p3}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
if ( p4 != null) { // if-eqz p4, :cond_7
/* .line 32 */
(( java.util.StringTokenizer ) p3 ).nextToken ( ); // invoke-virtual {p3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
(( java.lang.String ) p4 ).trim ( ); // invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;
if ( p4 != null) { // if-eqz p4, :cond_5
/* .line 33 */
p5 = (( java.lang.String ) p4 ).equals ( v1 ); // invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p5 != null) { // if-eqz p5, :cond_6
/* .line 34 */
} // :cond_6
/* new-instance p5, Ljava/lang/StringBuffer; */
/* invoke-direct {p5}, Ljava/lang/StringBuffer;-><init>()V */
final String v0 = "Parsing appender named \""; // const-string v0, "Parsing appender named \""
(( java.lang.StringBuffer ) p5 ).append ( v0 ); // invoke-virtual {p5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p5 ).append ( p4 ); // invoke-virtual {p5, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "\"."; // const-string v0, "\"."
(( java.lang.StringBuffer ) p5 ).append ( v0 ); // invoke-virtual {p5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p5 ).toString ( ); // invoke-virtual {p5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p5 );
/* .line 35 */
(( org.apache.log4j.PropertyConfigurator ) p0 ).a ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Lorg/apache/log4j/PropertyConfigurator;->a(Ljava/util/Properties;Ljava/lang/String;)Lorg/apache/log4j/Appender;
if ( p4 != null) { // if-eqz p4, :cond_5
/* .line 36 */
(( org.apache.log4j.Category ) p2 ).addAppender ( p4 ); // invoke-virtual {p2, p4}, Lorg/apache/log4j/Category;->addAppender(Lorg/apache/log4j/Appender;)V
} // :cond_7
return;
} // .end method
public void a ( java.util.Properties p0, org.apache.log4j.spi.LoggerRepository p1 ) {
/* .locals 8 */
final String v0 = "log4j.rootLogger"; // const-string v0, "log4j.rootLogger"
/* .line 5 */
org.apache.log4j.helpers.OptionConverter .findAndSubst ( v0,p1 );
/* if-nez v0, :cond_0 */
final String v0 = "log4j.rootCategory"; // const-string v0, "log4j.rootCategory"
/* .line 6 */
org.apache.log4j.helpers.OptionConverter .findAndSubst ( v0,p1 );
final String v1 = "log4j.rootCategory"; // const-string v1, "log4j.rootCategory"
} // :cond_0
final String v1 = "log4j.rootLogger"; // const-string v1, "log4j.rootLogger"
} // :goto_0
/* move-object v7, v0 */
/* move-object v5, v1 */
/* if-nez v7, :cond_1 */
final String p1 = "Could not find root logger information.Is this OK?"; // const-string p1, "Could not find root logger information.Is this OK?"
/* .line 7 */
org.apache.log4j.helpers.LogLog .debug ( p1 );
/* .line 8 */
} // :cond_1
/* .line 9 */
/* monitor-enter p2 */
try { // :try_start_0
final String v6 = "root"; // const-string v6, "root"
/* move-object v2, p0 */
/* move-object v3, p1 */
/* move-object v4, p2 */
/* .line 10 */
/* invoke-virtual/range {v2 ..v7}, Lorg/apache/log4j/PropertyConfigurator;->a(Ljava/util/Properties;Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 11 */
/* monitor-exit p2 */
} // :goto_1
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public void a ( org.apache.log4j.Appender p0 ) {
/* .locals 2 */
/* .line 108 */
v0 = this.a;
(( java.util.Hashtable ) v0 ).put ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
public final void a ( org.apache.log4j.spi.ErrorHandler p0, java.lang.String p1, java.util.Properties p2, org.apache.log4j.spi.LoggerRepository p3 ) {
/* .locals 2 */
/* .line 69 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "root-ref"; // const-string v1, "root-ref"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.OptionConverter .findAndSubst ( v0,p3 );
int v1 = 0; // const/4 v1, 0x0
v0 = org.apache.log4j.helpers.OptionConverter .toBoolean ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 70 */
/* .line 71 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "logger-ref"; // const-string v1, "logger-ref"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.OptionConverter .findAndSubst ( v0,p3 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 72 */
v1 = this.c;
/* if-nez v1, :cond_1 */
} // :cond_1
/* .line 73 */
} // :goto_0
/* .line 74 */
} // :cond_2
/* new-instance p4, Ljava/lang/StringBuffer; */
/* invoke-direct {p4}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p4 ).append ( p2 ); // invoke-virtual {p4, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = "appender-ref"; // const-string p2, "appender-ref"
(( java.lang.StringBuffer ) p4 ).append ( p2 ); // invoke-virtual {p4, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p4 ).toString ( ); // invoke-virtual {p4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.OptionConverter .findAndSubst ( p2,p3 );
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 75 */
(( org.apache.log4j.PropertyConfigurator ) p0 ).a ( p3, p2 ); // invoke-virtual {p0, p3, p2}, Lorg/apache/log4j/PropertyConfigurator;->a(Ljava/util/Properties;Ljava/lang/String;)Lorg/apache/log4j/Appender;
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 76 */
} // :cond_3
return;
} // .end method
public void b ( java.util.Properties p0, org.apache.log4j.spi.LoggerRepository p1 ) {
/* .locals 9 */
/* .line 2 */
(( java.util.Properties ) p1 ).propertyNames ( ); // invoke-virtual {p1}, Ljava/util/Properties;->propertyNames()Ljava/util/Enumeration;
/* .line 3 */
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 4 */
/* move-object v5, v1 */
/* check-cast v5, Ljava/lang/String; */
final String v1 = "log4j.category."; // const-string v1, "log4j.category."
/* .line 5 */
v1 = (( java.lang.String ) v5 ).startsWith ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* const/16 v2, 0xf */
int v3 = 0; // const/4 v3, 0x0
/* if-nez v1, :cond_5 */
final String v1 = "log4j.logger."; // const-string v1, "log4j.logger."
v1 = (( java.lang.String ) v5 ).startsWith ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_1
final String v1 = "log4j.renderer."; // const-string v1, "log4j.renderer."
/* .line 6 */
v1 = (( java.lang.String ) v5 ).startsWith ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 7 */
(( java.lang.String ) v5 ).substring ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 8 */
org.apache.log4j.helpers.OptionConverter .findAndSubst ( v5,p1 );
/* .line 9 */
/* instance-of v3, p2, Lorg/apache/log4j/spi/RendererSupport; */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 10 */
/* move-object v3, p2 */
/* check-cast v3, Lorg/apache/log4j/spi/RendererSupport; */
org.apache.log4j.or.RendererMap .addRenderer ( v3,v1,v2 );
} // :cond_2
final String v1 = "log4j.throwableRenderer"; // const-string v1, "log4j.throwableRenderer"
/* .line 11 */
v1 = (( java.lang.String ) v5 ).equals ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 12 */
/* instance-of v1, p2, Lorg/apache/log4j/spi/ThrowableRendererSupport; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 13 */
v1 = org.apache.log4j.PropertyConfigurator.e;
/* if-nez v1, :cond_3 */
final String v1 = "org.apache.log4j.spi.ThrowableRenderer"; // const-string v1, "org.apache.log4j.spi.ThrowableRenderer"
org.apache.log4j.PropertyConfigurator .b ( v1 );
} // :cond_3
final String v2 = "log4j.throwableRenderer"; // const-string v2, "log4j.throwableRenderer"
org.apache.log4j.helpers.OptionConverter .instantiateByKey ( p1,v2,v1,v3 );
/* check-cast v1, Lorg/apache/log4j/spi/ThrowableRenderer; */
/* if-nez v1, :cond_4 */
final String v1 = "Could not instantiate throwableRenderer."; // const-string v1, "Could not instantiate throwableRenderer."
/* .line 14 */
org.apache.log4j.helpers.LogLog .error ( v1 );
/* .line 15 */
} // :cond_4
/* new-instance v2, Lorg/apache/log4j/config/PropertySetter; */
/* invoke-direct {v2, v1}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V */
final String v3 = "log4j.throwableRenderer."; // const-string v3, "log4j.throwableRenderer."
/* .line 16 */
(( org.apache.log4j.config.PropertySetter ) v2 ).setProperties ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Lorg/apache/log4j/config/PropertySetter;->setProperties(Ljava/util/Properties;Ljava/lang/String;)V
/* .line 17 */
/* move-object v2, p2 */
/* check-cast v2, Lorg/apache/log4j/spi/ThrowableRendererSupport; */
} // :cond_5
} // :goto_1
final String v1 = "log4j.category."; // const-string v1, "log4j.category."
/* .line 18 */
v1 = (( java.lang.String ) v5 ).startsWith ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 19 */
(( java.lang.String ) v5 ).substring ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
} // :cond_6
final String v1 = "log4j.logger."; // const-string v1, "log4j.logger."
/* .line 20 */
v1 = (( java.lang.String ) v5 ).startsWith ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* const/16 v1, 0xd */
/* .line 21 */
(( java.lang.String ) v5 ).substring ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
} // :cond_7
} // :goto_2
/* move-object v1, v3 */
/* .line 22 */
org.apache.log4j.helpers.OptionConverter .findAndSubst ( v5,p1 );
/* .line 23 */
v2 = this.c;
/* .line 24 */
/* monitor-enter v8 */
/* move-object v2, p0 */
/* move-object v3, p1 */
/* move-object v4, v8 */
/* move-object v6, v1 */
/* .line 25 */
try { // :try_start_0
/* invoke-virtual/range {v2 ..v7}, Lorg/apache/log4j/PropertyConfigurator;->a(Ljava/util/Properties;Lorg/apache/log4j/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 26 */
(( org.apache.log4j.PropertyConfigurator ) p0 ).a ( p1, v8, v1 ); // invoke-virtual {p0, p1, v8, v1}, Lorg/apache/log4j/PropertyConfigurator;->a(Ljava/util/Properties;Lorg/apache/log4j/Logger;Ljava/lang/String;)V
/* .line 27 */
/* monitor-exit v8 */
/* goto/16 :goto_0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v8 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // :cond_8
return;
} // .end method
public void doConfigure ( java.io.InputStream p0, org.apache.log4j.spi.LoggerRepository p1 ) {
/* .locals 2 */
/* .line 33 */
/* new-instance v0, Ljava/util/Properties; */
/* invoke-direct {v0}, Ljava/util/Properties;-><init>()V */
/* .line 34 */
try { // :try_start_0
(( java.util.Properties ) v0 ).load ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 35 */
(( org.apache.log4j.PropertyConfigurator ) p0 ).doConfigure ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lorg/apache/log4j/PropertyConfigurator;->doConfigure(Ljava/util/Properties;Lorg/apache/log4j/spi/LoggerRepository;)V
return;
/* :catch_0 */
/* move-exception p2 */
/* .line 36 */
/* instance-of v0, p2, Ljava/io/InterruptedIOException; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 37 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
/* .line 38 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Could not read configuration file from InputStream ["; // const-string v1, "Could not read configuration file from InputStream ["
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String v1 = "]."; // const-string v1, "]."
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v0,p2 );
/* .line 39 */
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
final String v0 = "Ignoring configuration InputStream ["; // const-string v0, "Ignoring configuration InputStream ["
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p1 );
return;
} // .end method
public void doConfigure ( java.lang.String p0, org.apache.log4j.spi.LoggerRepository p1 ) {
/* .locals 4 */
final String v0 = "]."; // const-string v0, "]."
/* .line 1 */
/* new-instance v1, Ljava/util/Properties; */
/* invoke-direct {v1}, Ljava/util/Properties;-><init>()V */
int v2 = 0; // const/4 v2, 0x0
/* .line 2 */
try { // :try_start_0
/* new-instance v3, Ljava/io/FileInputStream; */
/* invoke-direct {v3, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_2 */
/* .line 3 */
try { // :try_start_1
(( java.util.Properties ) v1 ).load ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
/* .line 4 */
(( java.io.FileInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* .line 5 */
try { // :try_start_2
(( java.io.FileInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/io/InterruptedIOException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 6 */
/* :catch_0 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) p1 ).interrupt ( ); // invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
/* .line 7 */
/* :catchall_0 */
} // :goto_0
(( org.apache.log4j.PropertyConfigurator ) p0 ).doConfigure ( v1, p2 ); // invoke-virtual {p0, v1, p2}, Lorg/apache/log4j/PropertyConfigurator;->doConfigure(Ljava/util/Properties;Lorg/apache/log4j/spi/LoggerRepository;)V
return;
/* :catchall_1 */
/* move-exception p1 */
/* move-object v2, v3 */
/* :catch_1 */
/* move-exception p2 */
/* move-object v2, v3 */
/* :catchall_2 */
/* move-exception p1 */
/* :catch_2 */
/* move-exception p2 */
/* .line 8 */
} // :goto_1
try { // :try_start_3
/* instance-of v1, p2, Ljava/io/InterruptedIOException; */
/* if-nez v1, :cond_0 */
/* instance-of v1, p2, Ljava/lang/InterruptedException; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 9 */
} // :cond_0
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
/* .line 10 */
} // :cond_1
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Could not read configuration file ["; // const-string v3, "Could not read configuration file ["
(( java.lang.StringBuffer ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v1,p2 );
/* .line 11 */
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Ignoring configuration file ["; // const-string v1, "Ignoring configuration file ["
(( java.lang.StringBuffer ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p1 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 12 */
try { // :try_start_4
(( java.io.FileInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
/* :try_end_4 */
/* .catch Ljava/io/InterruptedIOException; {:try_start_4 ..:try_end_4} :catch_3 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_3 */
/* .line 13 */
/* :catch_3 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) p1 ).interrupt ( ); // invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
/* :catchall_3 */
} // :cond_2
} // :goto_2
return;
} // :goto_3
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 14 */
try { // :try_start_5
(( java.io.FileInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
/* :try_end_5 */
/* .catch Ljava/io/InterruptedIOException; {:try_start_5 ..:try_end_5} :catch_4 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_4 */
/* .line 15 */
/* :catch_4 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) p2 ).interrupt ( ); // invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V
/* .line 16 */
/* :catchall_4 */
} // :cond_3
} // :goto_4
/* throw p1 */
} // .end method
public void doConfigure ( java.net.URL p0, org.apache.log4j.spi.LoggerRepository p1 ) {
/* .locals 5 */
final String v0 = "]."; // const-string v0, "]."
/* .line 40 */
/* new-instance v1, Ljava/util/Properties; */
/* invoke-direct {v1}, Ljava/util/Properties;-><init>()V */
/* .line 41 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Reading configuration from URL "; // const-string v3, "Reading configuration from URL "
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v2 );
int v2 = 0; // const/4 v2, 0x0
/* .line 42 */
try { // :try_start_0
(( java.net.URL ) p1 ).openConnection ( ); // invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
int v4 = 0; // const/4 v4, 0x0
/* .line 43 */
(( java.net.URLConnection ) v3 ).setUseCaches ( v4 ); // invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setUseCaches(Z)V
/* .line 44 */
(( java.net.URLConnection ) v3 ).getInputStream ( ); // invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
/* .line 45 */
(( java.util.Properties ) v1 ).load ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 46 */
try { // :try_start_1
(( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/io/InterruptedIOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 47 */
/* :catch_0 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) p1 ).interrupt ( ); // invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
/* .line 48 */
/* :catch_1 */
} // :cond_0
} // :goto_0
(( org.apache.log4j.PropertyConfigurator ) p0 ).doConfigure ( v1, p2 ); // invoke-virtual {p0, v1, p2}, Lorg/apache/log4j/PropertyConfigurator;->doConfigure(Ljava/util/Properties;Lorg/apache/log4j/spi/LoggerRepository;)V
return;
/* :catchall_0 */
/* move-exception p1 */
/* :catch_2 */
/* move-exception p2 */
/* .line 49 */
try { // :try_start_2
/* instance-of v1, p2, Ljava/io/InterruptedIOException; */
/* if-nez v1, :cond_1 */
/* instance-of v1, p2, Ljava/lang/InterruptedException; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 50 */
} // :cond_1
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
/* .line 51 */
} // :cond_2
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Could not read configuration file from URL ["; // const-string v3, "Could not read configuration file from URL ["
(( java.lang.StringBuffer ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v1,p2 );
/* .line 52 */
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Ignoring configuration file ["; // const-string v1, "Ignoring configuration file ["
(( java.lang.StringBuffer ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p1 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 53 */
try { // :try_start_3
(( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/io/InterruptedIOException; {:try_start_3 ..:try_end_3} :catch_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_4 */
/* .catch Ljava/lang/RuntimeException; {:try_start_3 ..:try_end_3} :catch_4 */
/* .line 54 */
/* :catch_3 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) p1 ).interrupt ( ); // invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
/* :catch_4 */
} // :cond_3
} // :goto_1
return;
} // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 55 */
try { // :try_start_4
(( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
/* :try_end_4 */
/* .catch Ljava/io/InterruptedIOException; {:try_start_4 ..:try_end_4} :catch_5 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_6 */
/* .catch Ljava/lang/RuntimeException; {:try_start_4 ..:try_end_4} :catch_6 */
/* .line 56 */
/* :catch_5 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) p2 ).interrupt ( ); // invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V
/* .line 57 */
/* :catch_6 */
} // :cond_4
} // :goto_3
/* throw p1 */
} // .end method
public void doConfigure ( java.util.Properties p0, org.apache.log4j.spi.LoggerRepository p1 ) {
/* .locals 2 */
/* .line 17 */
this.b = p2;
final String v0 = "log4j.debug"; // const-string v0, "log4j.debug"
/* .line 18 */
(( java.util.Properties ) p1 ).getProperty ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
/* if-nez v0, :cond_0 */
final String v0 = "log4j.configDebug"; // const-string v0, "log4j.configDebug"
/* .line 19 */
(( java.util.Properties ) p1 ).getProperty ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
final String v1 = "[log4j.configDebug] is deprecated.Use [log4j.debug] instead."; // const-string v1, "[log4j.configDebug] is deprecated.Use [log4j.debug] instead."
/* .line 20 */
org.apache.log4j.helpers.LogLog .warn ( v1 );
} // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
int v1 = 1; // const/4 v1, 0x1
/* .line 21 */
v0 = org.apache.log4j.helpers.OptionConverter .toBoolean ( v0,v1 );
org.apache.log4j.helpers.LogLog .setInternalDebugging ( v0 );
} // :cond_1
final String v0 = "log4j.reset"; // const-string v0, "log4j.reset"
/* .line 22 */
(( java.util.Properties ) p1 ).getProperty ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_2
int v1 = 0; // const/4 v1, 0x0
/* .line 23 */
v0 = org.apache.log4j.helpers.OptionConverter .toBoolean ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 24 */
} // :cond_2
final String v0 = "log4j.threshold"; // const-string v0, "log4j.threshold"
/* .line 25 */
org.apache.log4j.helpers.OptionConverter .findAndSubst ( v0,p1 );
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 26 */
v1 = org.apache.log4j.Level.ALL;
org.apache.log4j.helpers.OptionConverter .toLevel ( v0,v1 );
/* .line 27 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Hierarchy threshold set to ["; // const-string v1, "Hierarchy threshold set to ["
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String v1 = "]."; // const-string v1, "]."
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v0 );
/* .line 28 */
} // :cond_3
(( org.apache.log4j.PropertyConfigurator ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/PropertyConfigurator;->a(Ljava/util/Properties;Lorg/apache/log4j/spi/LoggerRepository;)V
/* .line 29 */
(( org.apache.log4j.PropertyConfigurator ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/PropertyConfigurator;->a(Ljava/util/Properties;)V
/* .line 30 */
(( org.apache.log4j.PropertyConfigurator ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/PropertyConfigurator;->b(Ljava/util/Properties;Lorg/apache/log4j/spi/LoggerRepository;)V
final String p1 = "Finished configuring."; // const-string p1, "Finished configuring."
/* .line 31 */
org.apache.log4j.helpers.LogLog .debug ( p1 );
/* .line 32 */
p1 = this.a;
(( java.util.Hashtable ) p1 ).clear ( ); // invoke-virtual {p1}, Ljava/util/Hashtable;->clear()V
return;
} // .end method
