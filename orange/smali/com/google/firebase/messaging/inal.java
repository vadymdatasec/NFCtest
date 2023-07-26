public class inal extends java.lang.Exception {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
		 /* .line 2 */
		 (( com.google.firebase.messaging.SendException ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/SendException;->a(Ljava/lang/String;)I
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Integer a ( java.lang.String p0 ) {
		 /* .locals 7 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* if-nez p1, :cond_0 */
		 /* .line 1 */
	 } // :cond_0
	 v1 = java.util.Locale.US;
	 (( java.lang.String ) p1 ).toLowerCase ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
	 int v1 = -1; // const/4 v1, -0x1
	 v2 = 	 (( java.lang.String ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/String;->hashCode()I
	 int v3 = 4; // const/4 v3, 0x4
	 int v4 = 3; // const/4 v4, 0x3
	 int v5 = 2; // const/4 v5, 0x2
	 int v6 = 1; // const/4 v6, 0x1
	 /* sparse-switch v2, :sswitch_data_0 */
	 /* :sswitch_0 */
	 final String v2 = "missing_to"; // const-string v2, "missing_to"
	 p1 = 	 (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 int v1 = 1; // const/4 v1, 0x1
		 /* :sswitch_1 */
		 final String v2 = "messagetoobig"; // const-string v2, "messagetoobig"
		 p1 = 		 (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 int v1 = 2; // const/4 v1, 0x2
			 /* :sswitch_2 */
			 final String v2 = "invalid_parameters"; // const-string v2, "invalid_parameters"
			 p1 = 			 (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( p1 != null) { // if-eqz p1, :cond_1
				 int v1 = 0; // const/4 v1, 0x0
				 /* :sswitch_3 */
				 final String v2 = "toomanymessages"; // const-string v2, "toomanymessages"
				 p1 = 				 (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 if ( p1 != null) { // if-eqz p1, :cond_1
					 int v1 = 4; // const/4 v1, 0x4
					 /* :sswitch_4 */
					 final String v2 = "service_not_available"; // const-string v2, "service_not_available"
					 p1 = 					 (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
					 if ( p1 != null) { // if-eqz p1, :cond_1
						 int v1 = 3; // const/4 v1, 0x3
					 } // :cond_1
				 } // :goto_0
				 if ( v1 != null) { // if-eqz v1, :cond_5
					 /* if-eq v1, v6, :cond_5 */
					 /* if-eq v1, v5, :cond_4 */
					 /* if-eq v1, v4, :cond_3 */
					 /* if-eq v1, v3, :cond_2 */
				 } // :cond_2
			 } // :cond_3
		 } // :cond_4
	 } // :cond_5
	 /* nop */
	 /* :sswitch_data_0 */
	 /* .sparse-switch */
	 /* -0x67e7c3ad -> :sswitch_4 */
	 /* -0x4cf26401 -> :sswitch_3 */
	 /* -0x36e3eace -> :sswitch_2 */
	 /* -0x24c7160d -> :sswitch_1 */
	 /* -0x5aa500c -> :sswitch_0 */
} // .end sparse-switch
} // .end method
