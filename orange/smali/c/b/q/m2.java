public class c.b.q.m2 implements android.view.View$OnClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.p.o.a b;
	 public final c.b.q.o2 c; //synthetic
	 /* # direct methods */
	 public c.b.q.m2 ( ) {
		 /* .locals 7 */
		 /* .line 1 */
		 this.c = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance p1, Lc/b/p/o/a; */
		 v0 = this.c;
		 v0 = this.a;
		 (( android.view.ViewGroup ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
		 v0 = this.c;
		 v6 = this.i;
		 int v2 = 0; // const/4 v2, 0x0
		 /* const v3, 0x102002c */
		 int v4 = 0; // const/4 v4, 0x0
		 int v5 = 0; // const/4 v5, 0x0
		 /* move-object v0, p1 */
		 /* invoke-direct/range {v0 ..v6}, Lc/b/p/o/a;-><init>(Landroid/content/Context;IIIILjava/lang/CharSequence;)V */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onClick ( android.view.View p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 p1 = this.c;
		 v0 = this.l;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget-boolean p1, p1, Lc/b/q/o2;->m:Z */
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 int p1 = 0; // const/4 p1, 0x0
				 /* .line 2 */
				 v1 = this.b;
			 } // :cond_0
			 return;
		 } // .end method
