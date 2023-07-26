public class e.f.a.c.k.e {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.view.View a;
	 public Integer b;
	 public Integer c;
	 public Integer d;
	 public Integer e;
	 /* # direct methods */
	 public e.f.a.c.k.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( ) {
		 /* .locals 1 */
		 /* .line 4 */
		 /* iget v0, p0, Le/f/a/c/k/e;->d:I */
	 } // .end method
	 public Boolean a ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Le/f/a/c/k/e;->e:I */
		 /* if-eq v0, p1, :cond_0 */
		 /* .line 2 */
		 /* iput p1, p0, Le/f/a/c/k/e;->e:I */
		 /* .line 3 */
		 (( e.f.a.c.k.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/k/e;->c()V
		 int p1 = 1; // const/4 p1, 0x1
	 } // :cond_0
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
public void b ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.a;
	 v0 = 	 (( android.view.View ) v0 ).getTop ( ); // invoke-virtual {v0}, Landroid/view/View;->getTop()I
	 /* iput v0, p0, Le/f/a/c/k/e;->b:I */
	 /* .line 2 */
	 v0 = this.a;
	 v0 = 	 (( android.view.View ) v0 ).getLeft ( ); // invoke-virtual {v0}, Landroid/view/View;->getLeft()I
	 /* iput v0, p0, Le/f/a/c/k/e;->c:I */
	 /* .line 3 */
	 (( e.f.a.c.k.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/k/e;->c()V
	 return;
} // .end method
public Boolean b ( Integer p0 ) {
	 /* .locals 1 */
	 /* .line 4 */
	 /* iget v0, p0, Le/f/a/c/k/e;->d:I */
	 /* if-eq v0, p1, :cond_0 */
	 /* .line 5 */
	 /* iput p1, p0, Le/f/a/c/k/e;->d:I */
	 /* .line 6 */
	 (( e.f.a.c.k.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/k/e;->c()V
	 int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void c ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.a;
/* iget v1, p0, Le/f/a/c/k/e;->d:I */
v2 = (( android.view.View ) v0 ).getTop ( ); // invoke-virtual {v0}, Landroid/view/View;->getTop()I
/* iget v3, p0, Le/f/a/c/k/e;->b:I */
/* sub-int/2addr v2, v3 */
/* sub-int/2addr v1, v2 */
c.h.n.v0 .e ( v0,v1 );
/* .line 2 */
v0 = this.a;
/* iget v1, p0, Le/f/a/c/k/e;->e:I */
v2 = (( android.view.View ) v0 ).getLeft ( ); // invoke-virtual {v0}, Landroid/view/View;->getLeft()I
/* iget v3, p0, Le/f/a/c/k/e;->c:I */
/* sub-int/2addr v2, v3 */
/* sub-int/2addr v1, v2 */
c.h.n.v0 .d ( v0,v1 );
return;
} // .end method
