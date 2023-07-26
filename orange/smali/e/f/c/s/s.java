public class e.f.c.s.s {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Long a;
	 public static final java.util.regex.Pattern b;
	 /* # direct methods */
	 public static e.f.c.s.s ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = java.util.concurrent.TimeUnit.HOURS;
		 /* const-wide/16 v1, 0x1 */
		 (( java.util.concurrent.TimeUnit ) v0 ).toSeconds ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J
		 /* move-result-wide v0 */
		 /* sput-wide v0, Le/f/c/s/s;->a:J */
		 final String v0 = "\\AA[\\w-]{38}\\z"; // const-string v0, "\\AA[\\w-]{38}\\z"
		 /* .line 2 */
		 java.util.regex.Pattern .compile ( v0 );
		 return;
	 } // .end method
	 public e.f.c.s.s ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .line 5 */
		 v0 = e.f.c.s.s.b;
		 (( java.util.regex.Pattern ) v0 ).matcher ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
		 p0 = 		 (( java.util.regex.Matcher ) p0 ).matches ( ); // invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z
	 } // .end method
	 public static Boolean b ( java.lang.String p0 ) {
		 /* .locals 1 */
		 final String v0 = ":"; // const-string v0, ":"
		 /* .line 1 */
		 p0 = 		 (( java.lang.String ) p0 ).contains ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
	 } // .end method
	 /* # virtual methods */
	 public Long a ( ) {
		 /* .locals 3 */
		 /* .line 4 */
		 v0 = java.util.concurrent.TimeUnit.MILLISECONDS;
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v1 */
		 (( java.util.concurrent.TimeUnit ) v0 ).toSeconds ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J
		 /* move-result-wide v0 */
		 /* return-wide v0 */
	 } // .end method
	 public Boolean a ( Object p0 ) {
		 /* .locals 8 */
		 /* .line 1 */
		 (( e.f.c.s.t.h ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->a()Ljava/lang/String;
		 v0 = 		 android.text.TextUtils .isEmpty ( v0 );
		 int v1 = 1; // const/4 v1, 0x1
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
		 } // :cond_0
		 (( e.f.c.s.t.h ) p1 ).g ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->g()J
		 /* move-result-wide v2 */
		 (( e.f.c.s.t.h ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->b()J
		 /* move-result-wide v4 */
		 /* add-long/2addr v2, v4 */
		 /* .line 3 */
		 (( e.f.c.s.s ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/s/s;->a()J
		 /* move-result-wide v4 */
		 /* sget-wide v6, Le/f/c/s/s;->a:J */
		 /* add-long/2addr v4, v6 */
		 /* cmp-long p1, v2, v4 */
		 /* if-gez p1, :cond_1 */
	 } // :cond_1
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
