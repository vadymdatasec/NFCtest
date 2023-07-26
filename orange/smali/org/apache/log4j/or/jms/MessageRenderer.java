public class org.apache.log4j.or.jms.MessageRenderer implements org.apache.log4j.or.ObjectRenderer {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public org.apache.log4j.or.jms.MessageRenderer ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String doRender ( java.lang.Object p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* instance-of v0, p1, Ljavax/jms/Message; */
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 2 */
			 /* new-instance v0, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
			 /* .line 3 */
			 /* check-cast p1, Ljavax/jms/Message; */
			 try { // :try_start_0
				 final String v1 = "DeliveryMode="; // const-string v1, "DeliveryMode="
				 /* .line 4 */
				 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 v1 = 				 /* .line 5 */
				 int v2 = 1; // const/4 v2, 0x1
				 /* if-eq v1, v2, :cond_1 */
				 int v2 = 2; // const/4 v2, 0x2
				 /* if-eq v1, v2, :cond_0 */
				 final String v1 = "UNKNOWN"; // const-string v1, "UNKNOWN"
				 /* .line 6 */
				 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 } // :cond_0
			 final String v1 = "PERSISTENT"; // const-string v1, "PERSISTENT"
			 /* .line 7 */
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 } // :cond_1
		 final String v1 = "NON_PERSISTENT"; // const-string v1, "NON_PERSISTENT"
		 /* .line 8 */
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 } // :goto_0
	 final String v1 = ", CorrelationID="; // const-string v1, ", CorrelationID="
	 /* .line 9 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 10 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v1 = ", Destination="; // const-string v1, ", Destination="
	 /* .line 11 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 12 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
	 final String v1 = ", Expiration="; // const-string v1, ", Expiration="
	 /* .line 13 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 14 */
	 /* move-result-wide v1 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;
	 final String v1 = ", MessageID="; // const-string v1, ", MessageID="
	 /* .line 15 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 16 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v1 = ", Priority="; // const-string v1, ", Priority="
	 /* .line 17 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v1 = 	 /* .line 18 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
	 final String v1 = ", Redelivered="; // const-string v1, ", Redelivered="
	 /* .line 19 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v1 = 	 /* .line 20 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;
	 final String v1 = ", ReplyTo="; // const-string v1, ", ReplyTo="
	 /* .line 21 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 22 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
	 final String v1 = ", Timestamp="; // const-string v1, ", Timestamp="
	 /* .line 23 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 24 */
	 /* move-result-wide v1 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;
	 final String v1 = ", Type="; // const-string v1, ", Type="
	 /* .line 25 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 26 */
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* :try_end_0 */
	 /* .catch Ljavax/jms/JMSException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 final String v1 = "Could not parse Message."; // const-string v1, "Could not parse Message."
	 /* .line 27 */
	 org.apache.log4j.helpers.LogLog .error ( v1,p1 );
	 /* .line 28 */
} // :goto_1
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 29 */
} // :cond_2
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // .end method
