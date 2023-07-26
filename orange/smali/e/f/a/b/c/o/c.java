public abstract class e.f.a.b.c.o.c {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.String a ( android.os.PowerManager$WakeLock p0, java.lang.String p1 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = 		 android.os.Process .myPid ( );
		 /* int-to-long v0, v0 */
		 /* const/16 v2, 0x20 */
		 /* shl-long/2addr v0, v2 */
		 p0 = 		 java.lang.System .identityHashCode ( p0 );
		 /* int-to-long v2, p0 */
		 /* or-long/2addr v0, v2 */
		 /* .line 2 */
		 java.lang.String .valueOf ( v0,v1 );
		 java.lang.String .valueOf ( p0 );
		 /* .line 3 */
		 v0 = 		 android.text.TextUtils .isEmpty ( p1 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String p1 = ""; // const-string p1, ""
		 } // :cond_0
		 java.lang.String .valueOf ( p1 );
		 v0 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 (( java.lang.String ) p0 ).concat ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
		 } // :cond_1
		 /* new-instance p1, Ljava/lang/String; */
		 /* invoke-direct {p1, p0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 final String v0 = "com.google.android.gms"; // const-string v0, "com.google.android.gms"
		 /* .line 6 */
		 v0 = 		 (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int p0 = 0; // const/4 p0, 0x0
		 } // :cond_0
	 } // .end method
	 public static java.util.List a ( java.util.List p0 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/lang/String;", */
		 /* ">;)", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/lang/String;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 v0 = 		 /* .line 4 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-ne v0, v1, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 5 */
		 final String v1 = "com.google.android.gms"; // const-string v1, "com.google.android.gms"
		 v0 = 		 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int p0 = 0; // const/4 p0, 0x0
		 } // :cond_0
	 } // .end method
