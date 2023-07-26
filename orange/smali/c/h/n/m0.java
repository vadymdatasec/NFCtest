public class c.h.n.m0 implements android.view.View$OnApplyWindowInsetsListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.h.n.u1 a;
	 public final android.view.View b; //synthetic
	 public final c.h.n.x c; //synthetic
	 /* # direct methods */
	 public c.h.n.m0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 this.c = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.view.WindowInsets onApplyWindowInsets ( android.view.View p0, android.view.WindowInsets p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 c.h.n.u1 .a ( p2,p1 );
		 /* .line 2 */
		 /* const/16 v2, 0x1e */
		 /* if-ge v1, v2, :cond_0 */
		 /* .line 3 */
		 v1 = this.b;
		 c.h.n.n0 .a ( p2,v1 );
		 /* .line 4 */
		 p2 = this.a;
		 p2 = 		 (( c.h.n.u1 ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Lc/h/n/u1;->equals(Ljava/lang/Object;)Z
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 5 */
			 p2 = this.c;
			 /* .line 6 */
			 (( c.h.n.u1 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/h/n/u1;->k()Landroid/view/WindowInsets;
			 /* .line 7 */
		 } // :cond_0
		 this.a = v0;
		 /* .line 8 */
		 p2 = this.c;
		 /* .line 9 */
		 /* if-lt v0, v2, :cond_1 */
		 /* .line 10 */
		 (( c.h.n.u1 ) p2 ).k ( ); // invoke-virtual {p2}, Lc/h/n/u1;->k()Landroid/view/WindowInsets;
		 /* .line 11 */
	 } // :cond_1
	 c.h.n.v0 .I ( p1 );
	 /* .line 12 */
	 (( c.h.n.u1 ) p2 ).k ( ); // invoke-virtual {p2}, Lc/h/n/u1;->k()Landroid/view/WindowInsets;
} // .end method
