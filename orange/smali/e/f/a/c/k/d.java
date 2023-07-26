public abstract class e.f.a.c.k.d extends androidx.coordinatorlayout.widget.CoordinatorLayout$b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<V:", */
	 /* "Landroid/view/View;", */
	 /* ">", */
	 /* "Landroidx/coordinatorlayout/widget/CoordinatorLayout$b<", */
	 /* "TV;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public e.f.a.c.k.e a;
public Integer b;
public Integer c;
/* # direct methods */
public e.f.a.c.k.d ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;-><init>()V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* iput v0, p0, Le/f/a/c/k/d;->b:I */
	 /* .line 3 */
	 /* iput v0, p0, Le/f/a/c/k/d;->c:I */
	 return;
} // .end method
public e.f.a.c.k.d ( ) {
	 /* .locals 0 */
	 /* .line 4 */
	 /* invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 5 */
	 /* iput p1, p0, Le/f/a/c/k/d;->b:I */
	 /* .line 6 */
	 /* iput p1, p0, Le/f/a/c/k/d;->c:I */
	 return;
} // .end method
/* # virtual methods */
public Boolean a ( Integer p0 ) {
	 /* .locals 1 */
	 /* .line 11 */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 12 */
		 p1 = 		 (( e.f.a.c.k.e ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/c/k/e;->b(I)Z
		 /* .line 13 */
	 } // :cond_0
	 /* iput p1, p0, Le/f/a/c/k/d;->b:I */
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
	 /* "TV;I)Z" */
	 /* } */
} // .end annotation
/* .line 1 */
(( e.f.a.c.k.d ) p0 ).b ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/f/a/c/k/d;->b(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V
/* .line 2 */
p1 = this.a;
/* if-nez p1, :cond_0 */
/* .line 3 */
/* new-instance p1, Le/f/a/c/k/e; */
/* invoke-direct {p1, p2}, Le/f/a/c/k/e;-><init>(Landroid/view/View;)V */
this.a = p1;
/* .line 4 */
} // :cond_0
p1 = this.a;
(( e.f.a.c.k.e ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/c/k/e;->b()V
/* .line 5 */
/* iget p1, p0, Le/f/a/c/k/d;->b:I */
int p2 = 0; // const/4 p2, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 6 */
p3 = this.a;
(( e.f.a.c.k.e ) p3 ).b ( p1 ); // invoke-virtual {p3, p1}, Le/f/a/c/k/e;->b(I)Z
/* .line 7 */
/* iput p2, p0, Le/f/a/c/k/d;->b:I */
/* .line 8 */
} // :cond_1
/* iget p1, p0, Le/f/a/c/k/d;->c:I */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 9 */
p3 = this.a;
(( e.f.a.c.k.e ) p3 ).a ( p1 ); // invoke-virtual {p3, p1}, Le/f/a/c/k/e;->a(I)Z
/* .line 10 */
/* iput p2, p0, Le/f/a/c/k/d;->c:I */
} // :cond_2
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( e.f.a.c.k.e ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/c/k/e;->a()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;I)V" */
/* } */
} // .end annotation
/* .line 1 */
(( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).d ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->d(Landroid/view/View;I)V
return;
} // .end method
