public class e.b.a.y.x.h1.l implements java.io.FilenameFilter {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.regex.Pattern a; //synthetic
	 /* # direct methods */
	 public e.b.a.y.x.h1.l ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean accept ( java.io.File p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.a;
		 (( java.util.regex.Pattern ) p1 ).matcher ( p2 ); // invoke-virtual {p1, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
		 p1 = 		 (( java.util.regex.Matcher ) p1 ).matches ( ); // invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z
	 } // .end method
