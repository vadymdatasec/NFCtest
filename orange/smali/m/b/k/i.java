public abstract class m.b.k.i extends m.b.k.q0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.String a;
	 public java.lang.String b;
	 /* # direct methods */
	 public m.b.k.i ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lm/b/k/q0;-><init>()V */
		 /* .line 2 */
		 m.b.h.j .b ( p1 );
		 /* .line 3 */
		 m.b.h.j .b ( p2 );
		 /* .line 4 */
		 (( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
		 (( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 this.a = p1;
		 final String p1 = "\""; // const-string p1, "\""
		 /* .line 5 */
		 v0 = 		 (( java.lang.String ) p2 ).startsWith ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 p1 = 			 (( java.lang.String ) p2 ).endsWith ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
			 /* if-nez p1, :cond_1 */
		 } // :cond_0
		 final String p1 = "\'"; // const-string p1, "\'"
		 /* .line 6 */
		 v0 = 		 (( java.lang.String ) p2 ).startsWith ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 p1 = 			 (( java.lang.String ) p2 ).endsWith ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
			 if ( p1 != null) { // if-eqz p1, :cond_2
				 /* .line 7 */
			 } // :cond_1
			 p1 = 			 (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
			 int v0 = 1; // const/4 v0, 0x1
			 /* sub-int/2addr p1, v0 */
			 (( java.lang.String ) p2 ).substring ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
			 /* .line 8 */
		 } // :cond_2
		 (( java.lang.String ) p2 ).trim ( ); // invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;
		 (( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 this.b = p1;
		 return;
	 } // .end method
