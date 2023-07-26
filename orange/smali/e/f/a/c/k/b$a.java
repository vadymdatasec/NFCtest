public class e.f.a.c.k.b$a implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Le/f/a/c/k/b; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public final androidx.coordinatorlayout.widget.CoordinatorLayout b;
public final android.view.View c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TV;" */
/* } */
} // .end annotation
} // .end field
public final e.f.a.c.k.b d; //synthetic
/* # direct methods */
public e.f.a.c.k.b$a ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;)V" */
/* } */
} // .end annotation
/* .line 1 */
this.d = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p2;
/* .line 3 */
this.c = p3;
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.d;
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = (( android.widget.OverScroller ) v0 ).computeScrollOffset ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.d;
v1 = this.b;
v2 = this.c;
v3 = this.e;
v3 = (( android.widget.OverScroller ) v3 ).getCurrY ( ); // invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrY()I
(( e.f.a.c.k.b ) v0 ).c ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Le/f/a/c/k/b;->c(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)I
/* .line 4 */
v0 = this.c;
c.h.n.v0 .a ( v0,p0 );
/* .line 5 */
} // :cond_0
v0 = this.d;
v1 = this.b;
v2 = this.c;
(( e.f.a.c.k.b ) v0 ).e ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/a/c/k/b;->e(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)V
} // :cond_1
} // :goto_0
return;
} // .end method
