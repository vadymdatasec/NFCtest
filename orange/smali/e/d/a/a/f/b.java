public abstract class e.d.a.a.f.b {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.String a ( android.content.Context p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 c.q.b .a ( p0 );
		 final String v0 = ""; // const-string v0, ""
		 final String v1 = "TRUSTKIT_VENDOR_ID"; // const-string v1, "TRUSTKIT_VENDOR_ID"
		 /* .line 2 */
		 /* .line 3 */
		 v0 = 		 (( java.lang.String ) v2 ).equals ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v0 = "Generating new vendor identifier..."; // const-string v0, "Generating new vendor identifier..."
			 /* .line 4 */
			 e.d.a.a.f.a .a ( v0 );
			 /* .line 5 */
			 java.util.UUID .randomUUID ( );
			 (( java.util.UUID ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;
			 /* .line 6 */
			 /* .line 7 */
			 /* .line 8 */
		 } // :cond_0
	 } // .end method
