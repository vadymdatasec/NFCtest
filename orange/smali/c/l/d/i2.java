public class c.l.d.i2 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.Object b; //synthetic
	 public final c.l.d.x2 c; //synthetic
	 public final android.view.View d; //synthetic
	 public final androidx.fragment.app.Fragment e; //synthetic
	 public final java.util.ArrayList f; //synthetic
	 public final java.util.ArrayList g; //synthetic
	 public final java.util.ArrayList h; //synthetic
	 public final java.lang.Object i; //synthetic
	 /* # direct methods */
	 public c.l.d.i2 ( ) {
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
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v1 = this.c;
			 v2 = this.d;
			 (( c.l.d.x2 ) v1 ).b ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lc/l/d/x2;->b(Ljava/lang/Object;Landroid/view/View;)V
			 /* .line 3 */
			 v0 = this.c;
			 v1 = this.b;
			 v2 = this.e;
			 v3 = this.f;
			 v4 = this.d;
			 c.l.d.n2 .a ( v0,v1,v2,v3,v4 );
			 /* .line 4 */
			 v1 = this.g;
			 (( java.util.ArrayList ) v1 ).addAll ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
			 /* .line 5 */
		 } // :cond_0
		 v0 = this.h;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 6 */
			 v0 = this.i;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 7 */
				 /* new-instance v0, Ljava/util/ArrayList; */
				 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
				 /* .line 8 */
				 v1 = this.d;
				 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
				 /* .line 9 */
				 v1 = this.c;
				 v2 = this.i;
				 v3 = this.h;
				 (( c.l.d.x2 ) v1 ).a ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Lc/l/d/x2;->a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
				 /* .line 10 */
			 } // :cond_1
			 v0 = this.h;
			 (( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
			 /* .line 11 */
			 v0 = this.h;
			 v1 = this.d;
			 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 } // :cond_2
		 return;
	 } // .end method
