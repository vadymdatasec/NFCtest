public abstract class e.f.a.b.c.p.j {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.f.a.b.c.p.j ( ) {
		 /* .locals 1 */
		 final String v0 = "\\$\\{(.*?)\\}"; // const-string v0, "\\$\\{(.*?)\\}"
		 /* .line 1 */
		 java.util.regex.Pattern .compile ( v0 );
		 return;
	 } // .end method
	 public static Boolean a ( java.lang.String p0 ) {
		 /* .locals 0 */
		 if ( p0 != null) { // if-eqz p0, :cond_1
			 /* .line 1 */
			 (( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
			 p0 = 			 (( java.lang.String ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z
			 if ( p0 != null) { // if-eqz p0, :cond_0
			 } // :cond_0
			 int p0 = 0; // const/4 p0, 0x0
		 } // :cond_1
	 } // :goto_0
	 int p0 = 1; // const/4 p0, 0x1
} // .end method
