public class androidx.viewpager.widget.ViewPager$d implements c.h.n.x {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Landroidx/viewpager/widget/ViewPager;->d()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final android.graphics.Rect a;
public final androidx.viewpager.widget.ViewPager b; //synthetic
/* # direct methods */
public androidx.viewpager.widget.ViewPager$d ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance p1, Landroid/graphics/Rect; */
/* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
this.a = p1;
return;
} // .end method
/* # virtual methods */
public c.h.n.u1 a ( android.view.View p0, c.h.n.u1 p1 ) {
/* .locals 5 */
/* .line 1 */
c.h.n.v0 .b ( p1,p2 );
/* .line 2 */
p2 = (( c.h.n.u1 ) p1 ).j ( ); // invoke-virtual {p1}, Lc/h/n/u1;->j()Z
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 3 */
} // :cond_0
p2 = this.a;
/* .line 4 */
v0 = (( c.h.n.u1 ) p1 ).g ( ); // invoke-virtual {p1}, Lc/h/n/u1;->g()I
/* iput v0, p2, Landroid/graphics/Rect;->left:I */
/* .line 5 */
v0 = (( c.h.n.u1 ) p1 ).i ( ); // invoke-virtual {p1}, Lc/h/n/u1;->i()I
/* iput v0, p2, Landroid/graphics/Rect;->top:I */
/* .line 6 */
v0 = (( c.h.n.u1 ) p1 ).h ( ); // invoke-virtual {p1}, Lc/h/n/u1;->h()I
/* iput v0, p2, Landroid/graphics/Rect;->right:I */
/* .line 7 */
v0 = (( c.h.n.u1 ) p1 ).f ( ); // invoke-virtual {p1}, Lc/h/n/u1;->f()I
/* iput v0, p2, Landroid/graphics/Rect;->bottom:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
v1 = this.b;
v1 = (( android.view.ViewGroup ) v1 ).getChildCount ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I
} // :goto_0
/* if-ge v0, v1, :cond_1 */
/* .line 9 */
v2 = this.b;
/* .line 10 */
(( android.view.ViewGroup ) v2 ).getChildAt ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
c.h.n.v0 .a ( v2,p1 );
/* .line 11 */
v3 = (( c.h.n.u1 ) v2 ).g ( ); // invoke-virtual {v2}, Lc/h/n/u1;->g()I
/* iget v4, p2, Landroid/graphics/Rect;->left:I */
v3 = java.lang.Math .min ( v3,v4 );
/* iput v3, p2, Landroid/graphics/Rect;->left:I */
/* .line 12 */
v3 = (( c.h.n.u1 ) v2 ).i ( ); // invoke-virtual {v2}, Lc/h/n/u1;->i()I
/* iget v4, p2, Landroid/graphics/Rect;->top:I */
v3 = java.lang.Math .min ( v3,v4 );
/* iput v3, p2, Landroid/graphics/Rect;->top:I */
/* .line 13 */
v3 = (( c.h.n.u1 ) v2 ).h ( ); // invoke-virtual {v2}, Lc/h/n/u1;->h()I
/* iget v4, p2, Landroid/graphics/Rect;->right:I */
v3 = java.lang.Math .min ( v3,v4 );
/* iput v3, p2, Landroid/graphics/Rect;->right:I */
/* .line 14 */
v2 = (( c.h.n.u1 ) v2 ).f ( ); // invoke-virtual {v2}, Lc/h/n/u1;->f()I
/* iget v3, p2, Landroid/graphics/Rect;->bottom:I */
v2 = java.lang.Math .min ( v2,v3 );
/* iput v2, p2, Landroid/graphics/Rect;->bottom:I */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 15 */
} // :cond_1
/* iget v0, p2, Landroid/graphics/Rect;->left:I */
/* iget v1, p2, Landroid/graphics/Rect;->top:I */
/* iget v2, p2, Landroid/graphics/Rect;->right:I */
/* iget p2, p2, Landroid/graphics/Rect;->bottom:I */
(( c.h.n.u1 ) p1 ).a ( v0, v1, v2, p2 ); // invoke-virtual {p1, v0, v1, v2, p2}, Lc/h/n/u1;->a(IIII)Lc/h/n/u1;
} // .end method
