public class c.b.p.l extends c.h.n.e1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean a;
	 public Integer b;
	 public final c.b.p.m c; //synthetic
	 /* # direct methods */
	 public c.b.p.l ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 /* invoke-direct {p0}, Lc/h/n/e1;-><init>()V */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
		 /* iput-boolean p1, p0, Lc/b/p/l;->a:Z */
		 /* .line 3 */
		 /* iput p1, p0, Lc/b/p/l;->b:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* iput v0, p0, Lc/b/p/l;->b:I */
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lc/b/p/l;->a:Z */
		 /* .line 3 */
		 v0 = this.c;
		 (( c.b.p.m ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/p/m;->b()V
		 return;
	 } // .end method
	 public void a ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .line 4 */
		 /* iget p1, p0, Lc/b/p/l;->b:I */
		 /* add-int/lit8 p1, p1, 0x1 */
		 /* iput p1, p0, Lc/b/p/l;->b:I */
		 v0 = this.c;
		 v0 = this.a;
		 v0 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 /* if-ne p1, v0, :cond_1 */
		 /* .line 5 */
		 p1 = this.c;
		 p1 = this.d;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 6 */
			 /* .line 7 */
		 } // :cond_0
		 (( c.b.p.l ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/p/l;->a()V
	 } // :cond_1
	 return;
} // .end method
public void b ( android.view.View p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget-boolean p1, p0, Lc/b/p/l;->a:Z */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 return;
	 } // :cond_0
	 int p1 = 1; // const/4 p1, 0x1
	 /* .line 2 */
	 /* iput-boolean p1, p0, Lc/b/p/l;->a:Z */
	 /* .line 3 */
	 p1 = this.c;
	 p1 = this.d;
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
	 } // :cond_1
	 return;
} // .end method
