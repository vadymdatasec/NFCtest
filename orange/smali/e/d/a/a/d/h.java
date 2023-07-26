public abstract class e.d.a.a.d.h {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.regex.Pattern a;
	 /* # direct methods */
	 public static e.d.a.a.d.h ( ) {
		 /* .locals 1 */
		 final String v0 = "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"; // const-string v0, "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"
		 /* .line 1 */
		 java.util.regex.Pattern .compile ( v0 );
		 return;
	 } // .end method
	 public static Boolean a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.d.a.a.d.h.a;
		 (( java.util.regex.Pattern ) v0 ).matcher ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
		 p0 = 		 (( java.util.regex.Matcher ) p0 ).matches ( ); // invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z
	 } // .end method
