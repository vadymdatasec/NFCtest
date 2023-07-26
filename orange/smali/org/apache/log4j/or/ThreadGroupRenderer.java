public class org.apache.log4j.or.ThreadGroupRenderer implements org.apache.log4j.or.ObjectRenderer {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public org.apache.log4j.or.ThreadGroupRenderer ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String doRender ( java.lang.Object p0 ) {
		 /* .locals 6 */
		 /* .line 1 */
		 /* instance-of v0, p1, Ljava/lang/ThreadGroup; */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 2 */
			 /* new-instance v0, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
			 /* .line 3 */
			 /* check-cast p1, Ljava/lang/ThreadGroup; */
			 final String v1 = "java.lang.ThreadGroup[name="; // const-string v1, "java.lang.ThreadGroup[name="
			 /* .line 4 */
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 /* .line 5 */
			 (( java.lang.ThreadGroup ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/ThreadGroup;->getName()Ljava/lang/String;
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String v1 = ", maxpri="; // const-string v1, ", maxpri="
			 /* .line 6 */
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 /* .line 7 */
			 v1 = 			 (( java.lang.ThreadGroup ) p1 ).getMaxPriority ( ); // invoke-virtual {p1}, Ljava/lang/ThreadGroup;->getMaxPriority()I
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
			 final String v1 = "]"; // const-string v1, "]"
			 /* .line 8 */
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 /* .line 9 */
			 v2 = 			 (( java.lang.ThreadGroup ) p1 ).activeCount ( ); // invoke-virtual {p1}, Ljava/lang/ThreadGroup;->activeCount()I
			 /* new-array v3, v2, [Ljava/lang/Thread; */
			 /* .line 10 */
			 (( java.lang.ThreadGroup ) p1 ).enumerate ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/ThreadGroup;->enumerate([Ljava/lang/Thread;)I
			 int p1 = 0; // const/4 p1, 0x0
		 } // :goto_0
		 /* if-ge p1, v2, :cond_0 */
		 /* .line 11 */
		 v4 = org.apache.log4j.Layout.LINE_SEP;
		 (( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v4 = " Thread=["; // const-string v4, " Thread=["
		 /* .line 12 */
		 (( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* .line 13 */
		 /* aget-object v4, v3, p1 */
		 (( java.lang.Thread ) v4 ).getName ( ); // invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;
		 (( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v4 = ","; // const-string v4, ","
		 /* .line 14 */
		 (( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* .line 15 */
		 /* aget-object v5, v3, p1 */
		 v5 = 		 (( java.lang.Thread ) v5 ).getPriority ( ); // invoke-virtual {v5}, Ljava/lang/Thread;->getPriority()I
		 (( java.lang.StringBuffer ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
		 /* .line 16 */
		 (( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* .line 17 */
		 /* aget-object v4, v3, p1 */
		 v4 = 		 (( java.lang.Thread ) v4 ).isDaemon ( ); // invoke-virtual {v4}, Ljava/lang/Thread;->isDaemon()Z
		 (( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;
		 /* .line 18 */
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* add-int/lit8 p1, p1, 0x1 */
		 /* .line 19 */
	 } // :cond_0
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 /* .line 20 */
} // :cond_1
try { // :try_start_0
	 (( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* .line 21 */
	 (( java.lang.Exception ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;
} // .end method
