public class c.b.q.l1 extends android.database.DataSetObserver {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.b.q.p1 a; //synthetic
	 /* # direct methods */
	 public c.b.q.l1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onChanged ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 v0 = 		 (( c.b.q.p1 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/q/p1;->b()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = this.a;
			 (( c.b.q.p1 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/p1;->a()V
		 } // :cond_0
		 return;
	 } // .end method
	 public void onInvalidated ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 (( c.b.q.p1 ) v0 ).dismiss ( ); // invoke-virtual {v0}, Lc/b/q/p1;->dismiss()V
		 return;
	 } // .end method
