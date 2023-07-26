public class c.l.d.a3 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.l.d.d3 b; //synthetic
	 public final c.l.d.i3 c; //synthetic
	 /* # direct methods */
	 public c.l.d.a3 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.c;
		 v0 = this.b;
		 v1 = this.b;
		 v0 = 		 (( java.util.ArrayList ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = this.b;
			 (( c.l.d.h3 ) v0 ).c ( ); // invoke-virtual {v0}, Lc/l/d/h3;->c()Lc/l/d/g3;
			 v1 = this.b;
			 (( c.l.d.h3 ) v1 ).d ( ); // invoke-virtual {v1}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;
			 v1 = this.I;
			 (( c.l.d.g3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/l/d/g3;->a(Landroid/view/View;)V
		 } // :cond_0
		 return;
	 } // .end method
