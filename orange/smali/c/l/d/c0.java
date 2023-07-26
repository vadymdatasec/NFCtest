public class c.l.d.c0 implements androidx.savedstate.SavedStateRegistry$b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.l.d.f0 a; //synthetic
	 /* # direct methods */
	 public c.l.d.c0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.os.Bundle a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Landroid/os/Bundle; */
		 /* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
		 /* .line 2 */
		 v1 = this.a;
		 (( c.l.d.f0 ) v1 ).l ( ); // invoke-virtual {v1}, Lc/l/d/f0;->l()V
		 /* .line 3 */
		 v1 = this.a;
		 v1 = this.k;
		 v2 = c.n.g$a.ON_STOP;
		 (( c.n.l ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lc/n/l;->a(Lc/n/g$a;)V
		 /* .line 4 */
		 v1 = this.a;
		 v1 = this.j;
		 (( c.l.d.p0 ) v1 ).l ( ); // invoke-virtual {v1}, Lc/l/d/p0;->l()Landroid/os/Parcelable;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 final String v2 = "android:support:fragments"; // const-string v2, "android:support:fragments"
			 /* .line 5 */
			 (( android.os.Bundle ) v0 ).putParcelable ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
		 } // :cond_0
	 } // .end method
