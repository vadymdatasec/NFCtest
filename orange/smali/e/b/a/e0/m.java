public abstract class e.b.a.e0.m {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Double a;
	 /* # direct methods */
	 public static e.b.a.e0.m ( ) {
		 /* .locals 7 */
		 /* .line 1 */
		 /* const-wide/high16 v1, 0x3ff0000000000000L # 1.0 */
		 /* const/16 v3, 0x11 */
		 /* if-lt v0, v3, :cond_0 */
		 /* const-wide/high16 v3, 0x4024000000000000L # 10.0 */
		 /* const-wide/high16 v5, 0x4018000000000000L # 6.0 */
		 java.lang.Math .pow ( v3,v4,v5,v6 );
		 /* move-result-wide v3 */
		 /* div-double/2addr v1, v3 */
	 } // :cond_0
	 /* sput-wide v1, Le/b/a/e0/m;->a:D */
	 return;
} // .end method
public static Double a ( Long p0 ) {
	 /* .locals 2 */
	 /* .line 4 */
	 e.b.a.e0.m .a ( );
	 /* move-result-wide v0 */
	 /* sub-long/2addr v0, p0 */
	 /* long-to-double p0, v0 */
	 /* sget-wide v0, Le/b/a/e0/m;->a:D */
	 /* mul-double p0, p0, v0 */
	 /* return-wide p0 */
} // .end method
public static Long a ( ) {
	 /* .locals 2 */
	 /* .annotation build Landroid/annotation/TargetApi; */
	 /* value = 0x11 */
} // .end annotation
/* .line 1 */
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
android.os.SystemClock .elapsedRealtimeNanos ( );
/* move-result-wide v0 */
/* return-wide v0 */
/* .line 3 */
} // :cond_0
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
