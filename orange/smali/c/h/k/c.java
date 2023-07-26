public class c.h.k.c {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.h.k.p a;
	 public final android.os.Handler b;
	 /* # direct methods */
	 public c.h.k.c ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Integer p0 ) {
		 /* .locals 3 */
		 /* .line 3 */
		 v0 = this.a;
		 /* .line 4 */
		 v1 = this.b;
		 /* new-instance v2, Lc/h/k/b; */
		 /* invoke-direct {v2, p0, v0, p1}, Lc/h/k/b;-><init>(Lc/h/k/c;Lc/h/k/p;I)V */
		 (( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
		 return;
	 } // .end method
	 public final void a ( android.graphics.Typeface p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.a;
		 /* .line 2 */
		 v1 = this.b;
		 /* new-instance v2, Lc/h/k/a; */
		 /* invoke-direct {v2, p0, v0, p1}, Lc/h/k/a;-><init>(Lc/h/k/c;Lc/h/k/p;Landroid/graphics/Typeface;)V */
		 (( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
		 return;
	 } // .end method
	 public void a ( Object p0 ) {
		 /* .locals 1 */
		 /* .line 5 */
		 v0 = 		 (( c.h.k.l ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/k/l;->a()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 6 */
			 p1 = this.a;
			 (( c.h.k.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/k/c;->a(Landroid/graphics/Typeface;)V
			 /* .line 7 */
		 } // :cond_0
		 /* iget p1, p1, Lc/h/k/l;->b:I */
		 (( c.h.k.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/k/c;->a(I)V
	 } // :goto_0
	 return;
} // .end method
