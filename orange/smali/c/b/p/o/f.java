public class c.b.p.o.f implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.p.o.h b; //synthetic
	 public final android.view.MenuItem c; //synthetic
	 public final c.b.p.o.m d; //synthetic
	 public final c.b.p.o.g e; //synthetic
	 /* # direct methods */
	 public c.b.p.o.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.e = p1;
		 this.b = p2;
		 this.c = p3;
		 this.d = p4;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v1 = this.e;
			 v1 = this.b;
			 int v2 = 1; // const/4 v2, 0x1
			 /* iput-boolean v2, v1, Lc/b/p/o/i;->B:Z */
			 /* .line 3 */
			 v0 = this.b;
			 int v1 = 0; // const/4 v1, 0x0
			 (( c.b.p.o.m ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/p/o/m;->a(Z)V
			 /* .line 4 */
			 v0 = this.e;
			 v0 = this.b;
			 /* iput-boolean v1, v0, Lc/b/p/o/i;->B:Z */
			 /* .line 5 */
		 } // :cond_0
		 v0 = 		 v0 = this.c;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = 			 v0 = this.c;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 6 */
				 v0 = this.d;
				 v1 = this.c;
				 int v2 = 4; // const/4 v2, 0x4
				 (( c.b.p.o.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/b/p/o/m;->a(Landroid/view/MenuItem;I)Z
			 } // :cond_1
			 return;
		 } // .end method
