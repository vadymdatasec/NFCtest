public class c.l.d.k2 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.l.d.x2 b; //synthetic
	 public final c.e.b c; //synthetic
	 public final java.lang.Object d; //synthetic
	 public final c.l.d.m2 e; //synthetic
	 public final java.util.ArrayList f; //synthetic
	 public final android.view.View g; //synthetic
	 public final androidx.fragment.app.Fragment h; //synthetic
	 public final androidx.fragment.app.Fragment i; //synthetic
	 public final Boolean j; //synthetic
	 public final java.util.ArrayList k; //synthetic
	 public final java.lang.Object l; //synthetic
	 public final android.graphics.Rect m; //synthetic
	 /* # direct methods */
	 public c.l.d.k2 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 this.c = p2;
		 this.d = p3;
		 this.e = p4;
		 this.f = p5;
		 this.g = p6;
		 this.h = p7;
		 this.i = p8;
		 /* iput-boolean p9, p0, Lc/l/d/k2;->j:Z */
		 this.k = p10;
		 this.l = p11;
		 this.m = p12;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = this.b;
		 v1 = this.c;
		 v2 = this.d;
		 v3 = this.e;
		 c.l.d.n2 .a ( v0,v1,v2,v3 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v1 = this.f;
			 (( c.e.b ) v0 ).values ( ); // invoke-virtual {v0}, Lc/e/b;->values()Ljava/util/Collection;
			 (( java.util.ArrayList ) v1 ).addAll ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
			 /* .line 3 */
			 v1 = this.f;
			 v2 = this.g;
			 (( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
			 /* .line 4 */
		 } // :cond_0
		 v1 = this.h;
		 v2 = this.i;
		 /* iget-boolean v3, p0, Lc/l/d/k2;->j:Z */
		 int v4 = 0; // const/4 v4, 0x0
		 c.l.d.n2 .a ( v1,v2,v3,v0,v4 );
		 /* .line 5 */
		 v1 = this.d;
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* .line 6 */
			 v2 = this.b;
			 v3 = this.k;
			 v4 = this.f;
			 (( c.l.d.x2 ) v2 ).b ( v1, v3, v4 ); // invoke-virtual {v2, v1, v3, v4}, Lc/l/d/x2;->b(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
			 /* .line 7 */
			 v1 = this.e;
			 v2 = this.l;
			 /* iget-boolean v3, p0, Lc/l/d/k2;->j:Z */
			 c.l.d.n2 .a ( v0,v1,v2,v3 );
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 8 */
				 v1 = this.b;
				 v2 = this.m;
				 (( c.l.d.x2 ) v1 ).a ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lc/l/d/x2;->a(Landroid/view/View;Landroid/graphics/Rect;)V
			 } // :cond_1
			 return;
		 } // .end method
