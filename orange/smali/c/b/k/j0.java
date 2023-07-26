public class c.b.k.j0 extends c.b.k.i0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.b.k.a1 c;
	 public final c.b.k.n0 d; //synthetic
	 /* # direct methods */
	 public c.b.k.j0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.d = p1;
		 /* invoke-direct {p0, p1}, Lc/b/k/i0;-><init>(Lc/b/k/n0;)V */
		 /* .line 2 */
		 this.c = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.content.IntentFilter b ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Landroid/content/IntentFilter; */
		 /* invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V */
		 final String v1 = "android.intent.action.TIME_SET"; // const-string v1, "android.intent.action.TIME_SET"
		 /* .line 2 */
		 (( android.content.IntentFilter ) v0 ).addAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
		 final String v1 = "android.intent.action.TIMEZONE_CHANGED"; // const-string v1, "android.intent.action.TIMEZONE_CHANGED"
		 /* .line 3 */
		 (( android.content.IntentFilter ) v0 ).addAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
		 final String v1 = "android.intent.action.TIME_TICK"; // const-string v1, "android.intent.action.TIME_TICK"
		 /* .line 4 */
		 (( android.content.IntentFilter ) v0 ).addAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
	 } // .end method
	 public Integer c ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
		 v0 = 		 (( c.b.k.a1 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/k/a1;->b()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 2; // const/4 v0, 0x2
		 } // :cond_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // .end method
public void d ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
	 (( c.b.k.n0 ) v0 ).k ( ); // invoke-virtual {v0}, Lc/b/k/n0;->k()Z
	 return;
} // .end method
