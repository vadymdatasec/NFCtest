public class c.b.k.g0 extends c.b.k.i0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.os.PowerManager c;
	 public final c.b.k.n0 d; //synthetic
	 /* # direct methods */
	 public c.b.k.g0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.d = p1;
		 /* invoke-direct {p0, p1}, Lc/b/k/i0;-><init>(Lc/b/k/n0;)V */
		 final String p1 = "power"; // const-string p1, "power"
		 /* .line 2 */
		 (( android.content.Context ) p2 ).getSystemService ( p1 ); // invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast p1, Landroid/os/PowerManager; */
		 this.c = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.content.IntentFilter b ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* const/16 v1, 0x15 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 2 */
		 /* new-instance v0, Landroid/content/IntentFilter; */
		 /* invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V */
		 final String v1 = "android.os.action.POWER_SAVE_MODE_CHANGED"; // const-string v1, "android.os.action.POWER_SAVE_MODE_CHANGED"
		 /* .line 3 */
		 (( android.content.IntentFilter ) v0 ).addAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer c ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* const/16 v2, 0x15 */
	 /* if-lt v0, v2, :cond_0 */
	 /* .line 2 */
	 v0 = this.c;
	 v0 = 	 (( android.os.PowerManager ) v0 ).isPowerSaveMode ( ); // invoke-virtual {v0}, Landroid/os/PowerManager;->isPowerSaveMode()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v1 = 2; // const/4 v1, 0x2
	 } // :cond_0
} // .end method
public void d ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
	 (( c.b.k.n0 ) v0 ).k ( ); // invoke-virtual {v0}, Lc/b/k/n0;->k()Z
	 return;
} // .end method
