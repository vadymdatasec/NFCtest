public class androidx.preference.PreferenceGroup$a implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/preference/PreferenceGroup; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.preference.PreferenceGroup b; //synthetic
/* # direct methods */
public androidx.preference.PreferenceGroup$a ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .line 1 */
/* monitor-enter p0 */
/* .line 2 */
try { // :try_start_0
	 v0 = this.b;
	 v0 = this.w;
	 (( c.e.i ) v0 ).clear ( ); // invoke-virtual {v0}, Lc/e/i;->clear()V
	 /* .line 3 */
	 /* monitor-exit p0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
