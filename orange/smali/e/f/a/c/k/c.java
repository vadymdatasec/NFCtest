public abstract class e.f.a.c.k.c extends e.f.a.c.k.d {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/f/a/c/k/d<", */
	 /* "Landroid/view/View;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final android.graphics.Rect d;
public final android.graphics.Rect e;
public Integer f;
public Integer g;
/* # direct methods */
public e.f.a.c.k.c ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Le/f/a/c/k/d;-><init>()V */
	 /* .line 2 */
	 /* new-instance v0, Landroid/graphics/Rect; */
	 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
	 this.d = v0;
	 /* .line 3 */
	 /* new-instance v0, Landroid/graphics/Rect; */
	 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
	 this.e = v0;
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 4 */
	 /* iput v0, p0, Le/f/a/c/k/c;->f:I */
	 return;
} // .end method
public e.f.a.c.k.c ( ) {
	 /* .locals 0 */
	 /* .line 5 */
	 /* invoke-direct {p0, p1, p2}, Le/f/a/c/k/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 /* .line 6 */
	 /* new-instance p1, Landroid/graphics/Rect; */
	 /* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
	 this.d = p1;
	 /* .line 7 */
	 /* new-instance p1, Landroid/graphics/Rect; */
	 /* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
	 this.e = p1;
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 8 */
	 /* iput p1, p0, Le/f/a/c/k/c;->f:I */
	 return;
} // .end method
public static Integer c ( Integer p0 ) {
	 /* .locals 0 */
	 /* if-nez p0, :cond_0 */
	 /* const p0, 0x800033 */
} // :cond_0
} // .end method
/* # virtual methods */
public final Integer a ( android.view.View p0 ) {
/* .locals 3 */
/* .line 13 */
/* iget v0, p0, Le/f/a/c/k/c;->g:I */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 14 */
} // :cond_0
p1 = (( e.f.a.c.k.c ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/k/c;->b(Landroid/view/View;)F
/* iget v0, p0, Le/f/a/c/k/c;->g:I */
/* int-to-float v2, v0 */
/* mul-float p1, p1, v2 */
/* float-to-int p1, p1 */
v1 = c.h.i.a .a ( p1,v1,v0 );
} // :goto_0
} // .end method
public abstract android.view.View a ( java.util.List p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Landroid/view/View;", */
/* ">;)", */
/* "Landroid/view/View;" */
/* } */
} // .end annotation
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 12 */
/* move-object v0, p0 */
/* .line 1 */
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I */
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_0 */
int v3 = -2; // const/4 v3, -0x2
/* if-ne v1, v3, :cond_5 */
/* .line 2 */
} // :cond_0
(( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->b(Landroid/view/View;)Ljava/util/List;
/* .line 3 */
(( e.f.a.c.k.c ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Le/f/a/c/k/c;->a(Ljava/util/List;)Landroid/view/View;
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 4 */
v4 = c.h.n.v0 .l ( v3 );
int v5 = 1; // const/4 v5, 0x1
if ( v4 != null) { // if-eqz v4, :cond_1
v4 = c.h.n.v0 .l ( p2 );
/* if-nez v4, :cond_1 */
/* move-object v4, p2 */
/* .line 5 */
c.h.n.v0 .a ( p2,v5 );
/* .line 6 */
v6 = c.h.n.v0 .l ( p2 );
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 7 */
(( android.view.View ) p2 ).requestLayout ( ); // invoke-virtual {p2}, Landroid/view/View;->requestLayout()V
} // :cond_1
/* move-object v4, p2 */
/* .line 8 */
} // :cond_2
v6 = /* invoke-static/range {p5 ..p5}, Landroid/view/View$MeasureSpec;->getSize(I)I */
/* if-nez v6, :cond_3 */
/* .line 9 */
v6 = (( android.view.ViewGroup ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I
/* .line 10 */
} // :cond_3
v7 = (( android.view.View ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
/* sub-int/2addr v6, v7 */
v3 = (( e.f.a.c.k.c ) p0 ).c ( v3 ); // invoke-virtual {p0, v3}, Le/f/a/c/k/c;->c(Landroid/view/View;)I
/* add-int/2addr v6, v3 */
/* if-ne v1, v2, :cond_4 */
/* const/high16 v1, 0x40000000 # 2.0f */
} // :cond_4
/* const/high16 v1, -0x80000000 */
/* .line 11 */
} // :goto_0
v10 = android.view.View$MeasureSpec .makeMeasureSpec ( v6,v1 );
/* move-object v6, p1 */
/* move-object v7, p2 */
/* move v8, p3 */
/* move/from16 v9, p4 */
/* move/from16 v11, p6 */
/* .line 12 */
/* invoke-virtual/range {v6 ..v11}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->a(Landroid/view/View;IIII)V */
} // :cond_5
int v1 = 0; // const/4 v1, 0x0
} // .end method
public abstract Float b ( android.view.View p0 ) {
} // .end method
public final void b ( Integer p0 ) {
/* .locals 0 */
/* .line 26 */
/* iput p1, p0, Le/f/a/c/k/c;->g:I */
return;
} // .end method
public void b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2 ) {
/* .locals 8 */
/* .line 1 */
(( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->b(Landroid/view/View;)Ljava/util/List;
/* .line 2 */
(( e.f.a.c.k.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/c/k/c;->a(Ljava/util/List;)Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
/* .line 4 */
v5 = this.d;
/* .line 5 */
v2 = (( android.view.ViewGroup ) p1 ).getPaddingLeft ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v2, v3 */
/* .line 6 */
v3 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v3, v4 */
/* .line 7 */
v4 = (( android.view.ViewGroup ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I
v6 = (( android.view.ViewGroup ) p1 ).getPaddingRight ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingRight()I
/* sub-int/2addr v4, v6 */
/* iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* sub-int/2addr v4, v6 */
/* .line 8 */
v6 = (( android.view.ViewGroup ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I
v7 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* add-int/2addr v6, v7 */
v7 = (( android.view.ViewGroup ) p1 ).getPaddingBottom ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* sub-int/2addr v6, v7 */
/* iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* sub-int/2addr v6, v7 */
/* .line 9 */
(( android.graphics.Rect ) v5 ).set ( v2, v3, v4, v6 ); // invoke-virtual {v5, v2, v3, v4, v6}, Landroid/graphics/Rect;->set(IIII)V
/* .line 10 */
(( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).getLastWindowInsets ( ); // invoke-virtual {p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->getLastWindowInsets()Lc/h/n/u1;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 11 */
p1 = c.h.n.v0 .l ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 12 */
p1 = c.h.n.v0 .l ( p2 );
/* if-nez p1, :cond_0 */
/* .line 13 */
/* iget p1, v5, Landroid/graphics/Rect;->left:I */
v3 = (( c.h.n.u1 ) v2 ).g ( ); // invoke-virtual {v2}, Lc/h/n/u1;->g()I
/* add-int/2addr p1, v3 */
/* iput p1, v5, Landroid/graphics/Rect;->left:I */
/* .line 14 */
/* iget p1, v5, Landroid/graphics/Rect;->right:I */
v2 = (( c.h.n.u1 ) v2 ).h ( ); // invoke-virtual {v2}, Lc/h/n/u1;->h()I
/* sub-int/2addr p1, v2 */
/* iput p1, v5, Landroid/graphics/Rect;->right:I */
/* .line 15 */
} // :cond_0
p1 = this.e;
/* .line 16 */
/* iget v1, v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->c:I */
/* .line 17 */
v2 = e.f.a.c.k.c .c ( v1 );
/* .line 18 */
v3 = (( android.view.View ) p2 ).getMeasuredWidth ( ); // invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I
/* .line 19 */
v4 = (( android.view.View ) p2 ).getMeasuredHeight ( ); // invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I
/* move-object v6, p1 */
/* move v7, p3 */
/* .line 20 */
/* invoke-static/range {v2 ..v7}, Lc/h/n/i;->a(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V */
/* .line 21 */
p3 = (( e.f.a.c.k.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/c/k/c;->a(Landroid/view/View;)I
/* .line 22 */
/* iget v1, p1, Landroid/graphics/Rect;->left:I */
/* iget v2, p1, Landroid/graphics/Rect;->top:I */
/* sub-int/2addr v2, p3 */
/* iget v3, p1, Landroid/graphics/Rect;->right:I */
/* iget v4, p1, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr v4, p3 */
(( android.view.View ) p2 ).layout ( v1, v2, v3, v4 ); // invoke-virtual {p2, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V
/* .line 23 */
/* iget p1, p1, Landroid/graphics/Rect;->top:I */
p2 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* sub-int/2addr p1, p2 */
/* iput p1, p0, Le/f/a/c/k/c;->f:I */
/* .line 24 */
} // :cond_1
/* invoke-super {p0, p1, p2, p3}, Le/f/a/c/k/d;->b(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V */
int p1 = 0; // const/4 p1, 0x0
/* .line 25 */
/* iput p1, p0, Le/f/a/c/k/c;->f:I */
} // :goto_0
return;
} // .end method
public final Integer c ( ) {
/* .locals 1 */
/* .line 2 */
/* iget v0, p0, Le/f/a/c/k/c;->g:I */
} // .end method
public Integer c ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
} // .end method
public final Integer d ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/a/c/k/c;->f:I */
} // .end method
