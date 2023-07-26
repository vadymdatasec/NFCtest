public class e.f.c.l.e.m.m0 implements java.io.FilenameFilter {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.f.c.l.e.m.m0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public e.f.c.l.e.m.m0 ( ) { //synthethic
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Le/f/c/l/e/m/m0;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean accept ( java.io.File p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 v0 = e.f.c.l.e.m.v0.z;
		 /* if-nez p1, :cond_0 */
		 /* .line 2 */
		 e.f.c.l.e.m.v0 .t ( );
		 (( java.util.regex.Pattern ) p1 ).matcher ( p2 ); // invoke-virtual {p1, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
		 p1 = 		 (( java.util.regex.Matcher ) p1 ).matches ( ); // invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // :goto_0
} // .end method
