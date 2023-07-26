public class org.apache.log4j.helpers.UtilLoggingLevel extends org.apache.log4j.Level {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final org.apache.log4j.helpers.UtilLoggingLevel CONFIG;
	 public static final Integer CONFIG_INT;
	 public static final org.apache.log4j.helpers.UtilLoggingLevel FINE;
	 public static final org.apache.log4j.helpers.UtilLoggingLevel FINER;
	 public static final Integer FINER_INT;
	 public static final org.apache.log4j.helpers.UtilLoggingLevel FINEST;
	 public static final Integer FINEST_INT;
	 public static final Integer FINE_INT;
	 public static final org.apache.log4j.helpers.UtilLoggingLevel INFO;
	 public static final org.apache.log4j.helpers.UtilLoggingLevel SEVERE;
	 public static final Integer SEVERE_INT;
	 public static final Integer UNKNOWN_INT;
	 public static final org.apache.log4j.helpers.UtilLoggingLevel WARNING;
	 public static final Integer WARNING_INT;
	 /* # direct methods */
	 public static org.apache.log4j.helpers.UtilLoggingLevel ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/helpers/UtilLoggingLevel; */
		 /* const/16 v1, 0x55f0 */
		 final String v2 = "SEVERE"; // const-string v2, "SEVERE"
		 int v3 = 0; // const/4 v3, 0x0
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/helpers/UtilLoggingLevel;-><init>(ILjava/lang/String;I)V */
		 /* .line 2 */
		 /* new-instance v0, Lorg/apache/log4j/helpers/UtilLoggingLevel; */
		 /* const/16 v1, 0x5208 */
		 final String v2 = "WARNING"; // const-string v2, "WARNING"
		 int v3 = 4; // const/4 v3, 0x4
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/helpers/UtilLoggingLevel;-><init>(ILjava/lang/String;I)V */
		 /* .line 3 */
		 /* new-instance v0, Lorg/apache/log4j/helpers/UtilLoggingLevel; */
		 /* const/16 v1, 0x4e20 */
		 final String v2 = "INFO"; // const-string v2, "INFO"
		 int v3 = 5; // const/4 v3, 0x5
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/helpers/UtilLoggingLevel;-><init>(ILjava/lang/String;I)V */
		 /* .line 4 */
		 /* new-instance v0, Lorg/apache/log4j/helpers/UtilLoggingLevel; */
		 /* const/16 v1, 0x36b0 */
		 final String v2 = "CONFIG"; // const-string v2, "CONFIG"
		 int v3 = 6; // const/4 v3, 0x6
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/helpers/UtilLoggingLevel;-><init>(ILjava/lang/String;I)V */
		 /* .line 5 */
		 /* new-instance v0, Lorg/apache/log4j/helpers/UtilLoggingLevel; */
		 /* const/16 v1, 0x32c8 */
		 final String v2 = "FINE"; // const-string v2, "FINE"
		 int v3 = 7; // const/4 v3, 0x7
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/helpers/UtilLoggingLevel;-><init>(ILjava/lang/String;I)V */
		 /* .line 6 */
		 /* new-instance v0, Lorg/apache/log4j/helpers/UtilLoggingLevel; */
		 /* const/16 v1, 0x2ee0 */
		 final String v2 = "FINER"; // const-string v2, "FINER"
		 /* const/16 v3, 0x8 */
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/helpers/UtilLoggingLevel;-><init>(ILjava/lang/String;I)V */
		 /* .line 7 */
		 /* new-instance v0, Lorg/apache/log4j/helpers/UtilLoggingLevel; */
		 /* const/16 v1, 0x2af8 */
		 final String v2 = "FINEST"; // const-string v2, "FINEST"
		 /* const/16 v3, 0x9 */
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/helpers/UtilLoggingLevel;-><init>(ILjava/lang/String;I)V */
		 return;
	 } // .end method
	 public org.apache.log4j.helpers.UtilLoggingLevel ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 return;
	 } // .end method
	 public static java.util.List getAllPossibleLevels ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 /* .line 2 */
		 v1 = org.apache.log4j.helpers.UtilLoggingLevel.FINE;
		 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 /* .line 3 */
		 v1 = org.apache.log4j.helpers.UtilLoggingLevel.FINER;
		 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 /* .line 4 */
		 v1 = org.apache.log4j.helpers.UtilLoggingLevel.FINEST;
		 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 /* .line 5 */
		 v1 = org.apache.log4j.helpers.UtilLoggingLevel.INFO;
		 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 /* .line 6 */
		 v1 = org.apache.log4j.helpers.UtilLoggingLevel.CONFIG;
		 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 /* .line 7 */
		 v1 = org.apache.log4j.helpers.UtilLoggingLevel.WARNING;
		 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 /* .line 8 */
		 v1 = org.apache.log4j.helpers.UtilLoggingLevel.SEVERE;
		 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 } // .end method
	 public static org.apache.log4j.Level toLevel ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 8 */
		 v0 = org.apache.log4j.helpers.UtilLoggingLevel.FINEST;
		 org.apache.log4j.helpers.UtilLoggingLevel .toLevel ( p0,v0 );
	 } // .end method
	 public static org.apache.log4j.Level toLevel ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .line 9 */
		 v0 = org.apache.log4j.Level.DEBUG;
		 org.apache.log4j.helpers.UtilLoggingLevel .toLevel ( p0,v0 );
	 } // .end method
	 public static org.apache.log4j.Level toLevel ( java.lang.String p0, org.apache.log4j.Level p1 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 /* .line 10 */
	 } // :cond_0
	 (( java.lang.String ) p0 ).toUpperCase ( ); // invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
	 final String v0 = "SEVERE"; // const-string v0, "SEVERE"
	 /* .line 11 */
	 v0 = 	 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 12 */
		 p0 = org.apache.log4j.helpers.UtilLoggingLevel.SEVERE;
	 } // :cond_1
	 final String v0 = "WARNING"; // const-string v0, "WARNING"
	 /* .line 13 */
	 v0 = 	 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 14 */
		 p0 = org.apache.log4j.helpers.UtilLoggingLevel.WARNING;
	 } // :cond_2
	 final String v0 = "INFO"; // const-string v0, "INFO"
	 /* .line 15 */
	 v0 = 	 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* .line 16 */
		 p0 = org.apache.log4j.helpers.UtilLoggingLevel.INFO;
	 } // :cond_3
	 final String v0 = "CONFI"; // const-string v0, "CONFI"
	 /* .line 17 */
	 v0 = 	 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_4
		 /* .line 18 */
		 p0 = org.apache.log4j.helpers.UtilLoggingLevel.CONFIG;
	 } // :cond_4
	 final String v0 = "FINE"; // const-string v0, "FINE"
	 /* .line 19 */
	 v0 = 	 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_5
		 /* .line 20 */
		 p0 = org.apache.log4j.helpers.UtilLoggingLevel.FINE;
	 } // :cond_5
	 final String v0 = "FINER"; // const-string v0, "FINER"
	 /* .line 21 */
	 v0 = 	 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_6
		 /* .line 22 */
		 p0 = org.apache.log4j.helpers.UtilLoggingLevel.FINER;
	 } // :cond_6
	 final String v0 = "FINEST"; // const-string v0, "FINEST"
	 /* .line 23 */
	 p0 = 	 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( p0 != null) { // if-eqz p0, :cond_7
		 /* .line 24 */
		 p0 = org.apache.log4j.helpers.UtilLoggingLevel.FINEST;
	 } // :cond_7
} // .end method
public static org.apache.log4j.helpers.UtilLoggingLevel toLevel ( Integer p0, org.apache.log4j.helpers.UtilLoggingLevel p1 ) {
	 /* .locals 1 */
	 /* const/16 v0, 0x2af8 */
	 /* if-eq p0, v0, :cond_6 */
	 /* const/16 v0, 0x2ee0 */
	 /* if-eq p0, v0, :cond_5 */
	 /* const/16 v0, 0x32c8 */
	 /* if-eq p0, v0, :cond_4 */
	 /* const/16 v0, 0x36b0 */
	 /* if-eq p0, v0, :cond_3 */
	 /* const/16 v0, 0x4e20 */
	 /* if-eq p0, v0, :cond_2 */
	 /* const/16 v0, 0x5208 */
	 /* if-eq p0, v0, :cond_1 */
	 /* const/16 v0, 0x55f0 */
	 /* if-eq p0, v0, :cond_0 */
	 /* .line 1 */
} // :cond_0
p0 = org.apache.log4j.helpers.UtilLoggingLevel.SEVERE;
/* .line 2 */
} // :cond_1
p0 = org.apache.log4j.helpers.UtilLoggingLevel.WARNING;
/* .line 3 */
} // :cond_2
p0 = org.apache.log4j.helpers.UtilLoggingLevel.INFO;
/* .line 4 */
} // :cond_3
p0 = org.apache.log4j.helpers.UtilLoggingLevel.CONFIG;
/* .line 5 */
} // :cond_4
p0 = org.apache.log4j.helpers.UtilLoggingLevel.FINE;
/* .line 6 */
} // :cond_5
p0 = org.apache.log4j.helpers.UtilLoggingLevel.FINER;
/* .line 7 */
} // :cond_6
p0 = org.apache.log4j.helpers.UtilLoggingLevel.FINEST;
} // .end method
