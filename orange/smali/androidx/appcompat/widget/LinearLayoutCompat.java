public class androidx.appcompat.widget.LinearLayoutCompat extends android.view.ViewGroup {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/appcompat/widget/LinearLayoutCompat$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public Boolean b;
public Integer c;
public Integer d;
public Integer e;
public Integer f;
public Integer g;
public Float h;
public Boolean i;
public j;
public k;
public android.graphics.drawable.Drawable l;
public Integer m;
public Integer n;
public Integer o;
public Integer p;
/* # direct methods */
public androidx.appcompat.widget.LinearLayoutCompat ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 1 */
	 /* invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public androidx.appcompat.widget.LinearLayoutCompat ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
public androidx.appcompat.widget.LinearLayoutCompat ( ) {
	 /* .locals 4 */
	 /* .line 3 */
	 /* invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 4 */
	 /* iput-boolean v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->b:Z */
	 int v1 = -1; // const/4 v1, -0x1
	 /* .line 5 */
	 /* iput v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->c:I */
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 6 */
	 /* iput v2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->d:I */
	 /* const v3, 0x800033 */
	 /* .line 7 */
	 /* iput v3, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I */
	 /* .line 8 */
	 v3 = c.b.j.LinearLayoutCompat;
	 c.b.q.k2 .a ( p1,p2,v3,p3,v2 );
	 /* .line 9 */
	 p2 = 	 (( c.b.q.k2 ) p1 ).d ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/b/q/k2;->d(II)I
	 /* if-ltz p2, :cond_0 */
	 /* .line 10 */
	 (( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).setOrientation ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V
	 /* .line 11 */
} // :cond_0
p2 = (( c.b.q.k2 ) p1 ).d ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/b/q/k2;->d(II)I
/* if-ltz p2, :cond_1 */
/* .line 12 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).setGravity ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->setGravity(I)V
/* .line 13 */
} // :cond_1
p2 = (( c.b.q.k2 ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lc/b/q/k2;->a(IZ)Z
/* if-nez p2, :cond_2 */
/* .line 14 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).setBaselineAligned ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->setBaselineAligned(Z)V
/* .line 15 */
} // :cond_2
/* const/high16 p3, -0x40800000 # -1.0f */
p2 = (( c.b.q.k2 ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/k2;->a(IF)F
/* iput p2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->h:F */
/* .line 16 */
/* .line 17 */
p2 = (( c.b.q.k2 ) p1 ).d ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/b/q/k2;->d(II)I
/* iput p2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->c:I */
/* .line 18 */
p2 = (( c.b.q.k2 ) p1 ).a ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Lc/b/q/k2;->a(IZ)Z
/* iput-boolean p2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->i:Z */
/* .line 19 */
(( c.b.q.k2 ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).setDividerDrawable ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 20 */
p2 = (( c.b.q.k2 ) p1 ).d ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Lc/b/q/k2;->d(II)I
/* iput p2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->o:I */
/* .line 21 */
p2 = (( c.b.q.k2 ) p1 ).c ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Lc/b/q/k2;->c(II)I
/* iput p2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->p:I */
/* .line 22 */
(( c.b.q.k2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/k2;->a()V
return;
} // .end method
/* # virtual methods */
public Integer a ( android.view.View p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer a ( android.view.View p0, Integer p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.view.View a ( Integer p0 ) {
/* .locals 0 */
/* .line 22 */
(( android.view.ViewGroup ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
} // .end method
public final void a ( Integer p0, Integer p1 ) {
/* .locals 10 */
/* .line 23 */
v0 = (( android.view.ViewGroup ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I
/* const/high16 v1, 0x40000000 # 2.0f */
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v0,v1 );
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, p1, :cond_1 */
/* .line 24 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
/* .line 25 */
v2 = (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
/* const/16 v4, 0x8 */
/* if-eq v2, v4, :cond_0 */
/* .line 26 */
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v8, v2 */
/* check-cast v8, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* .line 27 */
/* iget v2, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
int v4 = -1; // const/4 v4, -0x1
/* if-ne v2, v4, :cond_0 */
/* .line 28 */
/* iget v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* .line 29 */
v2 = (( android.view.View ) v3 ).getMeasuredWidth ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
/* iput v2, v8, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
int v5 = 0; // const/4 v5, 0x0
int v7 = 0; // const/4 v7, 0x0
/* move-object v2, p0 */
/* move v4, p2 */
/* move v6, v0 */
/* .line 30 */
/* invoke-virtual/range {v2 ..v7}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V */
/* .line 31 */
/* iput v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public void a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 24 */
/* move-object/from16 v6, p0 */
/* .line 33 */
v0 = /* invoke-static/range {p0 ..p0}, Lc/b/q/v2;->a(Landroid/view/View;)Z */
/* .line 34 */
v7 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
/* sub-int v1, p4, p2 */
/* .line 35 */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingBottom()I */
/* sub-int v8, v1, v2 */
/* sub-int/2addr v1, v7 */
/* .line 36 */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingBottom()I */
/* sub-int v9, v1, v2 */
/* .line 37 */
v10 = /* invoke-virtual/range {p0 ..p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getVirtualChildCount()I */
/* .line 38 */
/* iget v1, v6, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I */
/* const v2, 0x800007 */
/* and-int/2addr v2, v1 */
/* and-int/lit8 v11, v1, 0x70 */
/* .line 39 */
/* iget-boolean v12, v6, Landroidx/appcompat/widget/LinearLayoutCompat;->b:Z */
/* .line 40 */
v13 = this.j;
/* .line 41 */
v14 = this.k;
/* .line 42 */
v1 = /* invoke-static/range {p0 ..p0}, Lc/h/n/v0;->o(Landroid/view/View;)I */
/* .line 43 */
v1 = c.h.n.i .a ( v2,v1 );
int v15 = 2; // const/4 v15, 0x2
int v5 = 1; // const/4 v5, 0x1
/* if-eq v1, v5, :cond_1 */
int v2 = 5; // const/4 v2, 0x5
/* if-eq v1, v2, :cond_0 */
/* .line 44 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
/* .line 45 */
} // :cond_0
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
/* add-int v1, v1, p3 */
/* sub-int v1, v1, p1 */
/* iget v2, v6, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* sub-int/2addr v1, v2 */
/* .line 46 */
} // :cond_1
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
/* sub-int v2, p3, p1 */
/* iget v3, v6, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* sub-int/2addr v2, v3 */
/* div-int/2addr v2, v15 */
/* add-int/2addr v1, v2 */
} // :goto_0
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
/* add-int/lit8 v0, v10, -0x1 */
/* move/from16 v16, v0 */
/* const/16 v17, -0x1 */
} // :cond_2
/* const/16 v16, 0x0 */
/* const/16 v17, 0x1 */
} // :goto_1
int v3 = 0; // const/4 v3, 0x0
} // :goto_2
/* if-ge v3, v10, :cond_d */
/* mul-int v0, v17, v3 */
/* add-int v2, v16, v0 */
/* .line 47 */
(( androidx.appcompat.widget.LinearLayoutCompat ) v6 ).a ( v2 ); // invoke-virtual {v6, v2}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
/* if-nez v0, :cond_3 */
/* .line 48 */
v0 = (( androidx.appcompat.widget.LinearLayoutCompat ) v6 ).c ( v2 ); // invoke-virtual {v6, v2}, Landroidx/appcompat/widget/LinearLayoutCompat;->c(I)I
/* add-int/2addr v1, v0 */
/* goto/16 :goto_6 */
/* .line 49 */
} // :cond_3
v5 = (( android.view.View ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
/* const/16 v15, 0x8 */
/* if-eq v5, v15, :cond_c */
/* .line 50 */
v15 = (( android.view.View ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
/* .line 51 */
v5 = (( android.view.View ) v0 ).getMeasuredHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
/* .line 52 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object/from16 v4, v18 */
/* check-cast v4, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* move/from16 v18, v3 */
if ( v12 != null) { // if-eqz v12, :cond_4
/* .line 53 */
/* iget v3, v4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
/* move/from16 v19, v10 */
int v10 = -1; // const/4 v10, -0x1
/* if-eq v3, v10, :cond_5 */
/* .line 54 */
v10 = (( android.view.View ) v0 ).getBaseline ( ); // invoke-virtual {v0}, Landroid/view/View;->getBaseline()I
} // :cond_4
/* move/from16 v19, v10 */
} // :cond_5
int v10 = -1; // const/4 v10, -0x1
/* .line 55 */
} // :goto_3
/* iget v3, v4, Landroidx/appcompat/widget/LinearLayoutCompat$a;->b:I */
/* if-gez v3, :cond_6 */
/* move v3, v11 */
} // :cond_6
/* and-int/lit8 v3, v3, 0x70 */
/* move/from16 v20, v11 */
/* const/16 v11, 0x10 */
/* if-eq v3, v11, :cond_a */
/* const/16 v11, 0x30 */
/* if-eq v3, v11, :cond_8 */
/* const/16 v11, 0x50 */
/* if-eq v3, v11, :cond_7 */
/* move v3, v7 */
int v11 = -1; // const/4 v11, -0x1
} // :cond_7
/* sub-int v3, v8, v5 */
/* .line 56 */
/* iget v11, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* sub-int/2addr v3, v11 */
int v11 = -1; // const/4 v11, -0x1
/* if-eq v10, v11, :cond_9 */
/* .line 57 */
v21 = (( android.view.View ) v0 ).getMeasuredHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
/* sub-int v21, v21, v10 */
int v10 = 2; // const/4 v10, 0x2
/* .line 58 */
/* aget v22, v14, v10 */
/* sub-int v22, v22, v21 */
/* sub-int v3, v3, v22 */
} // :cond_8
int v11 = -1; // const/4 v11, -0x1
/* .line 59 */
/* iget v3, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v3, v7 */
/* if-eq v10, v11, :cond_9 */
/* const/16 v21, 0x1 */
/* .line 60 */
/* aget v22, v13, v21 */
/* sub-int v22, v22, v10 */
/* add-int v3, v3, v22 */
} // :cond_9
} // :goto_4
/* const/16 v21, 0x1 */
} // :cond_a
int v11 = -1; // const/4 v11, -0x1
/* const/16 v21, 0x1 */
/* sub-int v3, v9, v5 */
int v10 = 2; // const/4 v10, 0x2
/* .line 61 */
/* div-int/2addr v3, v10 */
/* add-int/2addr v3, v7 */
/* iget v10, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v3, v10 */
/* iget v10, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* sub-int/2addr v3, v10 */
/* .line 62 */
} // :goto_5
v10 = (( androidx.appcompat.widget.LinearLayoutCompat ) v6 ).b ( v2 ); // invoke-virtual {v6, v2}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(I)Z
if ( v10 != null) { // if-eqz v10, :cond_b
/* .line 63 */
/* iget v10, v6, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I */
/* add-int/2addr v1, v10 */
/* .line 64 */
} // :cond_b
/* iget v10, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v10, v1 */
/* .line 65 */
v1 = (( androidx.appcompat.widget.LinearLayoutCompat ) v6 ).a ( v0 ); // invoke-virtual {v6, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/view/View;)I
/* add-int v22, v10, v1 */
/* move-object v1, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 p1, v1 */
/* move v11, v2 */
/* move/from16 v2, v22 */
/* move/from16 v22, v7 */
/* const/16 v23, -0x1 */
/* move-object v7, v4 */
/* move v4, v15 */
/* invoke-virtual/range {v0 ..v5}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/view/View;IIII)V */
/* .line 66 */
/* iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v15, v0 */
/* move-object/from16 v0, p1 */
/* .line 67 */
v1 = (( androidx.appcompat.widget.LinearLayoutCompat ) v6 ).b ( v0 ); // invoke-virtual {v6, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(Landroid/view/View;)I
/* add-int/2addr v15, v1 */
/* add-int/2addr v10, v15 */
/* .line 68 */
v0 = (( androidx.appcompat.widget.LinearLayoutCompat ) v6 ).a ( v0, v11 ); // invoke-virtual {v6, v0, v11}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/view/View;I)I
/* add-int v3, v18, v0 */
/* move v1, v10 */
} // :cond_c
/* move/from16 v18, v3 */
} // :goto_6
/* move/from16 v22, v7 */
/* move/from16 v19, v10 */
/* move/from16 v20, v11 */
/* const/16 v21, 0x1 */
/* const/16 v23, -0x1 */
} // :goto_7
/* add-int/lit8 v3, v3, 0x1 */
/* move/from16 v10, v19 */
/* move/from16 v11, v20 */
/* move/from16 v7, v22 */
int v5 = 1; // const/4 v5, 0x1
int v15 = 2; // const/4 v15, 0x2
/* goto/16 :goto_2 */
} // :cond_d
return;
} // .end method
public void a ( android.graphics.Canvas p0 ) {
/* .locals 6 */
/* .line 1 */
v0 = (( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).getVirtualChildCount ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getVirtualChildCount()I
/* .line 2 */
v1 = c.b.q.v2 .a ( p0 );
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_2 */
/* .line 3 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 4 */
v4 = (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
/* const/16 v5, 0x8 */
/* if-eq v4, v5, :cond_1 */
/* .line 5 */
v4 = (( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(I)Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 6 */
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v4, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 7 */
v3 = (( android.view.View ) v3 ).getRight ( ); // invoke-virtual {v3}, Landroid/view/View;->getRight()I
/* iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v3, v4 */
/* .line 8 */
} // :cond_0
v3 = (( android.view.View ) v3 ).getLeft ( ); // invoke-virtual {v3}, Landroid/view/View;->getLeft()I
/* iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* sub-int/2addr v3, v4 */
/* iget v4, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I */
/* sub-int/2addr v3, v4 */
/* .line 9 */
} // :goto_1
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).b ( p1, v3 ); // invoke-virtual {p0, p1, v3}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(Landroid/graphics/Canvas;I)V
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
/* .line 10 */
} // :cond_2
v2 = (( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(I)Z
if ( v2 != null) { // if-eqz v2, :cond_6
/* add-int/lit8 v0, v0, -0x1 */
/* .line 11 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
/* if-nez v0, :cond_4 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 12 */
v0 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* .line 13 */
} // :cond_3
v0 = (( android.view.ViewGroup ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I
v1 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* sub-int/2addr v0, v1 */
/* iget v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I */
/* .line 14 */
} // :cond_4
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 15 */
v0 = (( android.view.View ) v0 ).getLeft ( ); // invoke-virtual {v0}, Landroid/view/View;->getLeft()I
/* iget v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* sub-int/2addr v0, v1 */
/* iget v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I */
} // :goto_2
/* sub-int/2addr v0, v1 */
/* .line 16 */
} // :cond_5
v0 = (( android.view.View ) v0 ).getRight ( ); // invoke-virtual {v0}, Landroid/view/View;->getRight()I
/* iget v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v0, v1 */
/* .line 17 */
} // :goto_3
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).b ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(Landroid/graphics/Canvas;I)V
} // :cond_6
return;
} // .end method
public void a ( android.graphics.Canvas p0, Integer p1 ) {
/* .locals 4 */
/* .line 18 */
v0 = this.l;
v1 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* iget v2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->p:I */
/* add-int/2addr v1, v2 */
/* .line 19 */
v2 = (( android.view.ViewGroup ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I
v3 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->p:I */
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I */
/* add-int/2addr v3, p2 */
/* .line 20 */
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( v1, p2, v2, v3 ); // invoke-virtual {v0, v1, p2, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 21 */
p2 = this.l;
(( android.graphics.drawable.Drawable ) p2 ).draw ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
return;
} // .end method
public final void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* add-int/2addr p4, p2 */
/* add-int/2addr p5, p3 */
/* .line 69 */
(( android.view.View ) p1 ).layout ( p2, p3, p4, p5 ); // invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 6 */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p3 */
/* move v3, p4 */
/* move v4, p5 */
/* move v5, p6 */
/* .line 32 */
/* invoke-virtual/range {v0 ..v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V */
return;
} // .end method
public Integer b ( android.view.View p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void b ( Integer p0, Integer p1 ) {
/* .locals 10 */
/* .line 23 */
v0 = (( android.view.ViewGroup ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I
/* const/high16 v1, 0x40000000 # 2.0f */
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v0,v1 );
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, p1, :cond_1 */
/* .line 24 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
/* .line 25 */
v2 = (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
/* const/16 v4, 0x8 */
/* if-eq v2, v4, :cond_0 */
/* .line 26 */
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v8, v2 */
/* check-cast v8, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* .line 27 */
/* iget v2, v8, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
int v4 = -1; // const/4 v4, -0x1
/* if-ne v2, v4, :cond_0 */
/* .line 28 */
/* iget v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
/* .line 29 */
v2 = (( android.view.View ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
/* iput v2, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
int v5 = 0; // const/4 v5, 0x0
int v7 = 0; // const/4 v7, 0x0
/* move-object v2, p0 */
/* move v4, v0 */
/* move v6, p2 */
/* .line 30 */
/* invoke-virtual/range {v2 ..v7}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V */
/* .line 31 */
/* iput v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public void b ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 17 */
/* move-object/from16 v6, p0 */
/* .line 32 */
v7 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
/* sub-int v0, p3, p1 */
/* .line 33 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* sub-int v8, v0, v1 */
/* sub-int/2addr v0, v7 */
/* .line 34 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* sub-int v9, v0, v1 */
/* .line 35 */
v10 = /* invoke-virtual/range {p0 ..p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getVirtualChildCount()I */
/* .line 36 */
/* iget v0, v6, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I */
/* and-int/lit8 v1, v0, 0x70 */
/* const v2, 0x800007 */
/* and-int v11, v0, v2 */
/* const/16 v0, 0x10 */
/* if-eq v1, v0, :cond_1 */
/* const/16 v0, 0x50 */
/* if-eq v1, v0, :cond_0 */
/* .line 37 */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
/* .line 38 */
} // :cond_0
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
/* add-int v0, v0, p4 */
/* sub-int v0, v0, p2 */
/* iget v1, v6, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* sub-int/2addr v0, v1 */
/* .line 39 */
} // :cond_1
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
/* sub-int v1, p4, p2 */
/* iget v2, v6, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* sub-int/2addr v1, v2 */
/* div-int/lit8 v1, v1, 0x2 */
/* add-int/2addr v0, v1 */
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
int v12 = 0; // const/4 v12, 0x0
} // :goto_1
/* if-ge v12, v10, :cond_8 */
/* .line 40 */
(( androidx.appcompat.widget.LinearLayoutCompat ) v6 ).a ( v12 ); // invoke-virtual {v6, v12}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
int v14 = 1; // const/4 v14, 0x1
/* if-nez v13, :cond_2 */
/* .line 41 */
v1 = (( androidx.appcompat.widget.LinearLayoutCompat ) v6 ).c ( v12 ); // invoke-virtual {v6, v12}, Landroidx/appcompat/widget/LinearLayoutCompat;->c(I)I
/* add-int/2addr v0, v1 */
/* goto/16 :goto_4 */
/* .line 42 */
} // :cond_2
v1 = (( android.view.View ) v13 ).getVisibility ( ); // invoke-virtual {v13}, Landroid/view/View;->getVisibility()I
/* const/16 v2, 0x8 */
/* if-eq v1, v2, :cond_7 */
/* .line 43 */
v4 = (( android.view.View ) v13 ).getMeasuredWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
/* .line 44 */
v15 = (( android.view.View ) v13 ).getMeasuredHeight ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
/* .line 45 */
(( android.view.View ) v13 ).getLayoutParams ( ); // invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v5, v1 */
/* check-cast v5, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* .line 46 */
/* iget v1, v5, Landroidx/appcompat/widget/LinearLayoutCompat$a;->b:I */
/* if-gez v1, :cond_3 */
/* move v1, v11 */
/* .line 47 */
} // :cond_3
v2 = /* invoke-static/range {p0 ..p0}, Lc/h/n/v0;->o(Landroid/view/View;)I */
/* .line 48 */
v1 = c.h.n.i .a ( v1,v2 );
/* and-int/lit8 v1, v1, 0x7 */
/* if-eq v1, v14, :cond_5 */
int v2 = 5; // const/4 v2, 0x5
/* if-eq v1, v2, :cond_4 */
/* .line 49 */
/* iget v1, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v1, v7 */
} // :cond_4
/* sub-int v1, v8, v4 */
/* .line 50 */
/* iget v2, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
} // :cond_5
/* sub-int v1, v9, v4 */
/* .line 51 */
/* div-int/lit8 v1, v1, 0x2 */
/* add-int/2addr v1, v7 */
/* iget v2, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v1, v2 */
/* iget v2, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
} // :goto_2
/* sub-int/2addr v1, v2 */
} // :goto_3
/* move v2, v1 */
/* .line 52 */
v1 = (( androidx.appcompat.widget.LinearLayoutCompat ) v6 ).b ( v12 ); // invoke-virtual {v6, v12}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(I)Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 53 */
/* iget v1, v6, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I */
/* add-int/2addr v0, v1 */
/* .line 54 */
} // :cond_6
/* iget v1, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int v16, v0, v1 */
/* .line 55 */
v0 = (( androidx.appcompat.widget.LinearLayoutCompat ) v6 ).a ( v13 ); // invoke-virtual {v6, v13}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/view/View;)I
/* add-int v3, v16, v0 */
/* move-object/from16 v0, p0 */
/* move-object v1, v13 */
/* move-object v14, v5 */
/* move v5, v15 */
/* invoke-virtual/range {v0 ..v5}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/view/View;IIII)V */
/* .line 56 */
/* iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v15, v0 */
v0 = (( androidx.appcompat.widget.LinearLayoutCompat ) v6 ).b ( v13 ); // invoke-virtual {v6, v13}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(Landroid/view/View;)I
/* add-int/2addr v15, v0 */
/* add-int v16, v16, v15 */
/* .line 57 */
v0 = (( androidx.appcompat.widget.LinearLayoutCompat ) v6 ).a ( v13, v12 ); // invoke-virtual {v6, v13, v12}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/view/View;I)I
/* add-int/2addr v12, v0 */
/* move/from16 v0, v16 */
} // :cond_7
} // :goto_4
int v1 = 1; // const/4 v1, 0x1
/* add-int/2addr v12, v1 */
} // :cond_8
return;
} // .end method
public void b ( android.graphics.Canvas p0 ) {
/* .locals 5 */
/* .line 1 */
v0 = (( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).getVirtualChildCount ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getVirtualChildCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 2 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 3 */
v3 = (( android.view.View ) v2 ).getVisibility ( ); // invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
/* const/16 v4, 0x8 */
/* if-eq v3, v4, :cond_0 */
/* .line 4 */
v3 = (( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(I)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 5 */
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* .line 6 */
v2 = (( android.view.View ) v2 ).getTop ( ); // invoke-virtual {v2}, Landroid/view/View;->getTop()I
/* iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I */
/* sub-int/2addr v2, v3 */
/* .line 7 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).a ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/graphics/Canvas;I)V
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
/* .line 8 */
} // :cond_1
v1 = (( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(I)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* add-int/lit8 v0, v0, -0x1 */
/* .line 9 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
/* if-nez v0, :cond_2 */
/* .line 10 */
v0 = (( android.view.ViewGroup ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I
v1 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* sub-int/2addr v0, v1 */
/* iget v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I */
/* sub-int/2addr v0, v1 */
/* .line 11 */
} // :cond_2
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* .line 12 */
v0 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
/* .line 13 */
} // :goto_1
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/graphics/Canvas;I)V
} // :cond_3
return;
} // .end method
public void b ( android.graphics.Canvas p0, Integer p1 ) {
/* .locals 5 */
/* .line 14 */
v0 = this.l;
v1 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* iget v2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->p:I */
/* add-int/2addr v1, v2 */
/* iget v2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I */
/* add-int/2addr v2, p2 */
/* .line 15 */
v3 = (( android.view.ViewGroup ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I
v4 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* sub-int/2addr v3, v4 */
/* iget v4, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->p:I */
/* sub-int/2addr v3, v4 */
/* .line 16 */
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( p2, v1, v2, v3 ); // invoke-virtual {v0, p2, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 17 */
p2 = this.l;
(( android.graphics.drawable.Drawable ) p2 ).draw ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
return;
} // .end method
public Boolean b ( Integer p0 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* if-nez p1, :cond_1 */
/* .line 18 */
/* iget p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->o:I */
/* and-int/2addr p1, v1 */
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
/* .line 19 */
} // :cond_1
v2 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ne p1, v2, :cond_3 */
/* .line 20 */
/* iget p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->o:I */
/* and-int/lit8 p1, p1, 0x4 */
if ( p1 != null) { // if-eqz p1, :cond_2
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
/* .line 21 */
} // :cond_3
/* iget v2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->o:I */
/* and-int/lit8 v2, v2, 0x2 */
if ( v2 != null) { // if-eqz v2, :cond_5
/* sub-int/2addr p1, v1 */
} // :goto_0
/* if-ltz p1, :cond_5 */
/* .line 22 */
(( android.view.ViewGroup ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
v2 = (( android.view.View ) v2 ).getVisibility ( ); // invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
/* const/16 v3, 0x8 */
/* if-eq v2, v3, :cond_4 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_4
/* add-int/lit8 p1, p1, -0x1 */
} // :cond_5
} // :goto_1
} // .end method
public Integer c ( Integer p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void c ( Integer p0, Integer p1 ) {
/* .locals 37 */
/* move-object/from16 v7, p0 */
/* move/from16 v8, p1 */
/* move/from16 v9, p2 */
int v10 = 0; // const/4 v10, 0x0
/* .line 1 */
/* iput v10, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 2 */
v11 = /* invoke-virtual/range {p0 ..p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getVirtualChildCount()I */
/* .line 3 */
v12 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getMode(I)I */
/* .line 4 */
v13 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getMode(I)I */
/* .line 5 */
v0 = this.j;
int v14 = 4; // const/4 v14, 0x4
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.k;
/* if-nez v0, :cond_1 */
} // :cond_0
/* new-array v0, v14, [I */
/* .line 6 */
this.j = v0;
/* new-array v0, v14, [I */
/* .line 7 */
this.k = v0;
/* .line 8 */
} // :cond_1
v15 = this.j;
/* .line 9 */
v6 = this.k;
/* const/16 v16, 0x3 */
int v5 = -1; // const/4 v5, -0x1
/* .line 10 */
/* aput v5, v15, v16 */
/* const/16 v17, 0x2 */
/* aput v5, v15, v17 */
/* const/16 v18, 0x1 */
/* aput v5, v15, v18 */
/* aput v5, v15, v10 */
/* .line 11 */
/* aput v5, v6, v16 */
/* aput v5, v6, v17 */
/* aput v5, v6, v18 */
/* aput v5, v6, v10 */
/* .line 12 */
/* iget-boolean v4, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->b:Z */
/* .line 13 */
/* iget-boolean v3, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->i:Z */
/* const/high16 v2, 0x40000000 # 2.0f */
/* if-ne v12, v2, :cond_2 */
/* const/16 v19, 0x1 */
} // :cond_2
/* const/16 v19, 0x0 */
} // :goto_0
/* const/16 v20, 0x0 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
int v14 = 0; // const/4 v14, 0x0
/* const/16 v21, 0x0 */
/* const/16 v22, 0x0 */
/* const/16 v23, 0x0 */
/* const/16 v24, 0x0 */
/* const/16 v25, 0x0 */
/* const/16 v26, 0x1 */
/* const/16 v27, 0x0 */
} // :goto_1
/* move-object/from16 v28, v6 */
/* const/16 v5, 0x8 */
/* if-ge v1, v11, :cond_15 */
/* .line 14 */
(( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v1 ); // invoke-virtual {v7, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
/* if-nez v6, :cond_3 */
/* .line 15 */
/* iget v5, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
v6 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).c ( v1 ); // invoke-virtual {v7, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;->c(I)I
/* add-int/2addr v5, v6 */
/* iput v5, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
} // :goto_2
/* move v2, v1 */
/* move/from16 v32, v3 */
/* move/from16 v36, v4 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* goto/16 :goto_e */
/* .line 16 */
} // :cond_3
v10 = (( android.view.View ) v6 ).getVisibility ( ); // invoke-virtual {v6}, Landroid/view/View;->getVisibility()I
/* if-ne v10, v5, :cond_4 */
/* .line 17 */
v5 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v6, v1 ); // invoke-virtual {v7, v6, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/view/View;I)I
/* add-int/2addr v1, v5 */
/* .line 18 */
} // :cond_4
v5 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).b ( v1 ); // invoke-virtual {v7, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(I)Z
if ( v5 != null) { // if-eqz v5, :cond_5
/* .line 19 */
/* iget v5, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* iget v10, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I */
/* add-int/2addr v5, v10 */
/* iput v5, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 20 */
} // :cond_5
(( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v10, v5 */
/* check-cast v10, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* .line 21 */
/* iget v5, v10, Landroidx/appcompat/widget/LinearLayoutCompat$a;->a:F */
/* add-float v31, v0, v5 */
/* if-ne v12, v2, :cond_8 */
/* .line 22 */
/* iget v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* if-nez v0, :cond_8 */
/* cmpl-float v0, v5, v20 */
/* if-lez v0, :cond_8 */
if ( v19 != null) { // if-eqz v19, :cond_6
/* .line 23 */
/* iget v0, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* iget v5, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* iget v2, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v5, v2 */
/* add-int/2addr v0, v5 */
/* iput v0, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 24 */
} // :cond_6
/* iget v0, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 25 */
/* iget v2, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v2, v0 */
/* iget v5, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v2, v5 */
v0 = java.lang.Math .max ( v0,v2 );
/* iput v0, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
} // :goto_3
if ( v4 != null) { // if-eqz v4, :cond_7
int v0 = 0; // const/4 v0, 0x0
/* .line 26 */
v2 = android.view.View$MeasureSpec .makeMeasureSpec ( v0,v0 );
/* .line 27 */
(( android.view.View ) v6 ).measure ( v2, v2 ); // invoke-virtual {v6, v2, v2}, Landroid/view/View;->measure(II)V
/* move/from16 v34, v1 */
/* move/from16 v32, v3 */
/* move/from16 v36, v4 */
/* move-object v3, v6 */
/* const/16 v30, -0x2 */
/* goto/16 :goto_7 */
} // :cond_7
/* move/from16 v34, v1 */
/* move/from16 v32, v3 */
/* move/from16 v36, v4 */
/* move-object v3, v6 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* const/16 v24, 0x1 */
/* const/16 v30, -0x2 */
/* goto/16 :goto_8 */
/* .line 28 */
} // :cond_8
/* iget v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* if-nez v0, :cond_9 */
/* iget v0, v10, Landroidx/appcompat/widget/LinearLayoutCompat$a;->a:F */
/* cmpl-float v0, v0, v20 */
/* if-lez v0, :cond_9 */
int v5 = -2; // const/4 v5, -0x2
/* .line 29 */
/* iput v5, v10, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
int v2 = 0; // const/4 v2, 0x0
} // :cond_9
int v5 = -2; // const/4 v5, -0x2
/* const/high16 v2, -0x80000000 */
} // :goto_4
/* cmpl-float v0, v31, v20 */
/* if-nez v0, :cond_a */
/* .line 30 */
/* iget v0, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* move/from16 v29, v0 */
} // :cond_a
/* const/16 v29, 0x0 */
} // :goto_5
/* const/16 v33, 0x0 */
/* move-object/from16 v0, p0 */
/* move/from16 v34, v1 */
/* move-object v1, v6 */
/* move/from16 v35, v2 */
/* move/from16 v2, v34 */
/* move/from16 v32, v3 */
/* move/from16 v3, p1 */
/* move/from16 v36, v4 */
/* move/from16 v4, v29 */
int v9 = -1; // const/4 v9, -0x1
/* const/16 v29, -0x2 */
/* move/from16 v5, p2 */
/* move-object/from16 v29, v6 */
/* const/high16 v9, -0x80000000 */
/* const/16 v30, -0x2 */
/* move/from16 v6, v33 */
/* invoke-virtual/range {v0 ..v6}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/view/View;IIIII)V */
/* move/from16 v0, v35 */
/* if-eq v0, v9, :cond_b */
/* .line 31 */
/* iput v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* .line 32 */
} // :cond_b
v0 = /* invoke-virtual/range {v29 ..v29}, Landroid/view/View;->getMeasuredWidth()I */
if ( v19 != null) { // if-eqz v19, :cond_c
/* .line 33 */
/* iget v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* iget v2, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v2, v0 */
/* iget v3, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v2, v3 */
/* move-object/from16 v3, v29 */
/* .line 34 */
v4 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).b ( v3 ); // invoke-virtual {v7, v3}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(Landroid/view/View;)I
/* add-int/2addr v2, v4 */
/* add-int/2addr v1, v2 */
/* iput v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
} // :cond_c
/* move-object/from16 v3, v29 */
/* .line 35 */
/* iget v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* add-int v2, v1, v0 */
/* .line 36 */
/* iget v4, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v2, v4 */
/* iget v4, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v2, v4 */
/* .line 37 */
v4 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).b ( v3 ); // invoke-virtual {v7, v3}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(Landroid/view/View;)I
/* add-int/2addr v2, v4 */
/* .line 38 */
v1 = java.lang.Math .max ( v1,v2 );
/* iput v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
} // :goto_6
if ( v32 != null) { // if-eqz v32, :cond_d
/* .line 39 */
v14 = java.lang.Math .max ( v0,v14 );
} // :cond_d
} // :goto_7
/* const/high16 v1, 0x40000000 # 2.0f */
} // :goto_8
/* if-eq v13, v1, :cond_e */
/* .line 40 */
/* iget v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
int v2 = -1; // const/4 v2, -0x1
/* if-ne v0, v2, :cond_e */
int v0 = 1; // const/4 v0, 0x1
/* const/16 v27, 0x1 */
} // :cond_e
int v0 = 0; // const/4 v0, 0x0
/* .line 41 */
} // :goto_9
/* iget v2, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* iget v4, v10, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v2, v4 */
/* .line 42 */
v4 = (( android.view.View ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v4, v2 */
/* .line 43 */
v5 = (( android.view.View ) v3 ).getMeasuredState ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredState()I
/* move/from16 v6, v25 */
v25 = android.view.View .combineMeasuredStates ( v6,v5 );
if ( v36 != null) { // if-eqz v36, :cond_10
/* .line 44 */
v5 = (( android.view.View ) v3 ).getBaseline ( ); // invoke-virtual {v3}, Landroid/view/View;->getBaseline()I
int v6 = -1; // const/4 v6, -0x1
/* if-eq v5, v6, :cond_10 */
/* .line 45 */
/* iget v6, v10, Landroidx/appcompat/widget/LinearLayoutCompat$a;->b:I */
/* if-gez v6, :cond_f */
/* iget v6, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I */
} // :cond_f
/* and-int/lit8 v6, v6, 0x70 */
int v9 = 4; // const/4 v9, 0x4
/* shr-int/2addr v6, v9 */
/* and-int/lit8 v6, v6, -0x2 */
/* shr-int/lit8 v6, v6, 0x1 */
/* .line 46 */
/* aget v9, v15, v6 */
v9 = java.lang.Math .max ( v9,v5 );
/* aput v9, v15, v6 */
/* .line 47 */
/* aget v9, v28, v6 */
/* sub-int v5, v4, v5 */
v5 = java.lang.Math .max ( v9,v5 );
/* aput v5, v28, v6 */
} // :cond_10
/* move/from16 v5, v21 */
/* .line 48 */
v21 = java.lang.Math .max ( v5,v4 );
if ( v26 != null) { // if-eqz v26, :cond_11
/* .line 49 */
/* iget v5, v10, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
int v6 = -1; // const/4 v6, -0x1
/* if-ne v5, v6, :cond_11 */
/* const/16 v26, 0x1 */
} // :cond_11
/* const/16 v26, 0x0 */
/* .line 50 */
} // :goto_a
/* iget v5, v10, Landroidx/appcompat/widget/LinearLayoutCompat$a;->a:F */
/* cmpl-float v5, v5, v20 */
/* if-lez v5, :cond_13 */
if ( v0 != null) { // if-eqz v0, :cond_12
} // :cond_12
/* move v2, v4 */
} // :goto_b
/* move/from16 v10, v23 */
/* .line 51 */
v23 = java.lang.Math .max ( v10,v2 );
} // :cond_13
/* move/from16 v10, v23 */
if ( v0 != null) { // if-eqz v0, :cond_14
} // :cond_14
/* move v2, v4 */
} // :goto_c
/* move/from16 v4, v22 */
/* .line 52 */
v22 = java.lang.Math .max ( v4,v2 );
/* move/from16 v23, v10 */
} // :goto_d
/* move/from16 v10, v34 */
/* .line 53 */
v0 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v3, v10 ); // invoke-virtual {v7, v3, v10}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/view/View;I)I
/* add-int/2addr v0, v10 */
/* move v2, v0 */
/* move/from16 v0, v31 */
} // :goto_e
/* add-int/lit8 v2, v2, 0x1 */
/* move/from16 v9, p2 */
/* move v1, v2 */
/* move-object/from16 v6, v28 */
/* move/from16 v3, v32 */
/* move/from16 v4, v36 */
/* const/high16 v2, 0x40000000 # 2.0f */
int v5 = -1; // const/4 v5, -0x1
int v10 = 0; // const/4 v10, 0x0
/* goto/16 :goto_1 */
} // :cond_15
/* move/from16 v32, v3 */
/* move/from16 v36, v4 */
/* move/from16 v2, v21 */
/* move/from16 v4, v22 */
/* move/from16 v10, v23 */
/* move/from16 v6, v25 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* const/high16 v9, -0x80000000 */
/* const/16 v30, -0x2 */
/* .line 54 */
/* iget v3, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* if-lez v3, :cond_16 */
v3 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).b ( v11 ); // invoke-virtual {v7, v11}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(I)Z
if ( v3 != null) { // if-eqz v3, :cond_16
/* .line 55 */
/* iget v3, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* iget v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I */
/* add-int/2addr v3, v1 */
/* iput v3, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 56 */
} // :cond_16
/* aget v1, v15, v18 */
int v3 = -1; // const/4 v3, -0x1
/* if-ne v1, v3, :cond_18 */
int v1 = 0; // const/4 v1, 0x0
/* aget v5, v15, v1 */
/* if-ne v5, v3, :cond_18 */
/* aget v1, v15, v17 */
/* if-ne v1, v3, :cond_18 */
/* aget v1, v15, v16 */
/* if-eq v1, v3, :cond_17 */
} // :cond_17
/* move v1, v2 */
/* move/from16 v23, v6 */
/* .line 57 */
} // :cond_18
} // :goto_f
/* aget v1, v15, v16 */
int v3 = 0; // const/4 v3, 0x0
/* aget v5, v15, v3 */
/* aget v9, v15, v18 */
/* aget v3, v15, v17 */
/* .line 58 */
v3 = java.lang.Math .max ( v9,v3 );
/* .line 59 */
v3 = java.lang.Math .max ( v5,v3 );
/* .line 60 */
v1 = java.lang.Math .max ( v1,v3 );
/* .line 61 */
/* aget v3, v28, v16 */
int v5 = 0; // const/4 v5, 0x0
/* aget v9, v28, v5 */
/* aget v5, v28, v18 */
/* move/from16 v23, v6 */
/* aget v6, v28, v17 */
/* .line 62 */
v5 = java.lang.Math .max ( v5,v6 );
/* .line 63 */
v5 = java.lang.Math .max ( v9,v5 );
/* .line 64 */
v3 = java.lang.Math .max ( v3,v5 );
/* add-int/2addr v1, v3 */
/* .line 65 */
v1 = java.lang.Math .max ( v2,v1 );
} // :goto_10
if ( v32 != null) { // if-eqz v32, :cond_1d
/* const/high16 v2, -0x80000000 */
/* if-eq v12, v2, :cond_19 */
/* if-nez v12, :cond_1d */
} // :cond_19
int v2 = 0; // const/4 v2, 0x0
/* .line 66 */
/* iput v2, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
int v2 = 0; // const/4 v2, 0x0
} // :goto_11
/* if-ge v2, v11, :cond_1d */
/* .line 67 */
(( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v2 ); // invoke-virtual {v7, v2}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
/* if-nez v3, :cond_1a */
/* .line 68 */
/* iget v3, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
v5 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).c ( v2 ); // invoke-virtual {v7, v2}, Landroidx/appcompat/widget/LinearLayoutCompat;->c(I)I
/* add-int/2addr v3, v5 */
/* iput v3, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 69 */
} // :cond_1a
v5 = (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
/* const/16 v6, 0x8 */
/* if-ne v5, v6, :cond_1b */
/* .line 70 */
v3 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v3, v2 ); // invoke-virtual {v7, v3, v2}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/view/View;I)I
/* add-int/2addr v2, v3 */
} // :goto_12
/* move/from16 v22, v1 */
/* .line 71 */
} // :cond_1b
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
if ( v19 != null) { // if-eqz v19, :cond_1c
/* .line 72 */
/* iget v6, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* iget v9, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v9, v14 */
/* iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v9, v5 */
/* .line 73 */
v3 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).b ( v3 ); // invoke-virtual {v7, v3}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(Landroid/view/View;)I
/* add-int/2addr v9, v3 */
/* add-int/2addr v6, v9 */
/* iput v6, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 74 */
} // :cond_1c
/* iget v6, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* add-int v9, v6, v14 */
/* move/from16 v22, v1 */
/* .line 75 */
/* iget v1, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v9, v1 */
/* iget v1, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v9, v1 */
/* .line 76 */
v1 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).b ( v3 ); // invoke-virtual {v7, v3}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(Landroid/view/View;)I
/* add-int/2addr v9, v1 */
/* .line 77 */
v1 = java.lang.Math .max ( v6,v9 );
/* iput v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
} // :goto_13
/* add-int/lit8 v2, v2, 0x1 */
/* move/from16 v1, v22 */
} // :cond_1d
/* move/from16 v22, v1 */
/* .line 78 */
/* iget v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* add-int/2addr v2, v3 */
/* add-int/2addr v1, v2 */
/* iput v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 79 */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I */
v1 = java.lang.Math .max ( v1,v2 );
int v2 = 0; // const/4 v2, 0x0
/* .line 80 */
v1 = android.view.View .resolveSizeAndState ( v1,v8,v2 );
/* const v2, 0xffffff */
/* and-int/2addr v2, v1 */
/* .line 81 */
/* iget v3, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* sub-int/2addr v2, v3 */
/* if-nez v24, :cond_22 */
if ( v2 != null) { // if-eqz v2, :cond_1e
/* cmpl-float v5, v0, v20 */
/* if-lez v5, :cond_1e */
/* .line 82 */
} // :cond_1e
v0 = java.lang.Math .max ( v4,v10 );
if ( v32 != null) { // if-eqz v32, :cond_21
/* const/high16 v2, 0x40000000 # 2.0f */
/* if-eq v12, v2, :cond_21 */
int v10 = 0; // const/4 v10, 0x0
} // :goto_14
/* if-ge v10, v11, :cond_21 */
/* .line 83 */
(( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v10 ); // invoke-virtual {v7, v10}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
if ( v2 != null) { // if-eqz v2, :cond_20
/* .line 84 */
v4 = (( android.view.View ) v2 ).getVisibility ( ); // invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
/* const/16 v5, 0x8 */
/* if-ne v4, v5, :cond_1f */
/* .line 85 */
} // :cond_1f
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v4, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* .line 86 */
/* iget v4, v4, Landroidx/appcompat/widget/LinearLayoutCompat$a;->a:F */
/* cmpl-float v4, v4, v20 */
/* if-lez v4, :cond_20 */
/* const/high16 v4, 0x40000000 # 2.0f */
/* .line 87 */
v5 = android.view.View$MeasureSpec .makeMeasureSpec ( v14,v4 );
/* .line 88 */
v6 = (( android.view.View ) v2 ).getMeasuredHeight ( ); // invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I
v6 = android.view.View$MeasureSpec .makeMeasureSpec ( v6,v4 );
/* .line 89 */
(( android.view.View ) v2 ).measure ( v5, v6 ); // invoke-virtual {v2, v5, v6}, Landroid/view/View;->measure(II)V
} // :cond_20
} // :goto_15
/* add-int/lit8 v10, v10, 0x1 */
} // :cond_21
/* move/from16 v2, p2 */
/* move/from16 v25, v11 */
/* move/from16 v3, v22 */
/* goto/16 :goto_24 */
/* .line 90 */
} // :cond_22
} // :goto_16
/* iget v5, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->h:F */
/* cmpl-float v6, v5, v20 */
/* if-lez v6, :cond_23 */
/* move v0, v5 */
} // :cond_23
int v5 = -1; // const/4 v5, -0x1
/* .line 91 */
/* aput v5, v15, v16 */
/* aput v5, v15, v17 */
/* aput v5, v15, v18 */
int v6 = 0; // const/4 v6, 0x0
/* aput v5, v15, v6 */
/* .line 92 */
/* aput v5, v28, v16 */
/* aput v5, v28, v17 */
/* aput v5, v28, v18 */
/* aput v5, v28, v6 */
/* .line 93 */
/* iput v6, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* move v6, v4 */
/* move/from16 v9, v23 */
int v4 = -1; // const/4 v4, -0x1
int v10 = 0; // const/4 v10, 0x0
} // :goto_17
/* if-ge v10, v11, :cond_32 */
/* .line 94 */
(( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v10 ); // invoke-virtual {v7, v10}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
if ( v14 != null) { // if-eqz v14, :cond_31
/* .line 95 */
v5 = (( android.view.View ) v14 ).getVisibility ( ); // invoke-virtual {v14}, Landroid/view/View;->getVisibility()I
/* const/16 v3, 0x8 */
/* if-ne v5, v3, :cond_24 */
/* goto/16 :goto_20 */
/* .line 96 */
} // :cond_24
(( android.view.View ) v14 ).getLayoutParams ( ); // invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* .line 97 */
/* iget v3, v5, Landroidx/appcompat/widget/LinearLayoutCompat$a;->a:F */
/* cmpl-float v23, v3, v20 */
/* if-lez v23, :cond_29 */
/* int-to-float v8, v2 */
/* mul-float v8, v8, v3 */
/* div-float/2addr v8, v0 */
/* float-to-int v8, v8 */
/* sub-float/2addr v0, v3 */
/* sub-int/2addr v2, v8 */
/* .line 98 */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
v23 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingBottom()I */
/* add-int v3, v3, v23 */
/* move/from16 v23, v0 */
/* iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v3, v0 */
/* iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v3, v0 */
/* iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
/* move/from16 v24, v2 */
/* move/from16 v25, v11 */
int v11 = -1; // const/4 v11, -0x1
/* move/from16 v2, p2 */
/* .line 99 */
v0 = android.view.ViewGroup .getChildMeasureSpec ( v2,v3,v0 );
/* .line 100 */
/* iget v3, v5, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* if-nez v3, :cond_27 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* if-eq v12, v3, :cond_25 */
} // :cond_25
/* if-lez v8, :cond_26 */
} // :cond_26
int v8 = 0; // const/4 v8, 0x0
/* .line 101 */
} // :goto_18
v8 = android.view.View$MeasureSpec .makeMeasureSpec ( v8,v3 );
(( android.view.View ) v14 ).measure ( v8, v0 ); // invoke-virtual {v14, v8, v0}, Landroid/view/View;->measure(II)V
} // :cond_27
/* const/high16 v3, 0x40000000 # 2.0f */
/* .line 102 */
} // :goto_19
v29 = (( android.view.View ) v14 ).getMeasuredWidth ( ); // invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I
/* add-int v8, v29, v8 */
/* if-gez v8, :cond_28 */
int v8 = 0; // const/4 v8, 0x0
/* .line 103 */
} // :cond_28
v8 = android.view.View$MeasureSpec .makeMeasureSpec ( v8,v3 );
/* .line 104 */
(( android.view.View ) v14 ).measure ( v8, v0 ); // invoke-virtual {v14, v8, v0}, Landroid/view/View;->measure(II)V
/* .line 105 */
} // :goto_1a
v0 = (( android.view.View ) v14 ).getMeasuredState ( ); // invoke-virtual {v14}, Landroid/view/View;->getMeasuredState()I
/* const/high16 v3, -0x1000000 */
/* and-int/2addr v0, v3 */
/* .line 106 */
v9 = android.view.View .combineMeasuredStates ( v9,v0 );
/* move/from16 v0, v23 */
/* move/from16 v3, v24 */
} // :cond_29
/* move v3, v2 */
/* move/from16 v25, v11 */
int v11 = -1; // const/4 v11, -0x1
/* move/from16 v2, p2 */
} // :goto_1b
if ( v19 != null) { // if-eqz v19, :cond_2a
/* .line 107 */
/* iget v8, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
v23 = (( android.view.View ) v14 ).getMeasuredWidth ( ); // invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I
/* iget v11, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int v23, v23, v11 */
/* iget v11, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int v23, v23, v11 */
/* .line 108 */
v11 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).b ( v14 ); // invoke-virtual {v7, v14}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(Landroid/view/View;)I
/* add-int v23, v23, v11 */
/* add-int v8, v8, v23 */
/* iput v8, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* move/from16 v23, v0 */
/* .line 109 */
} // :cond_2a
/* iget v8, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 110 */
v11 = (( android.view.View ) v14 ).getMeasuredWidth ( ); // invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr v11, v8 */
/* move/from16 v23, v0 */
/* iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v11, v0 */
/* iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v11, v0 */
/* .line 111 */
v0 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).b ( v14 ); // invoke-virtual {v7, v14}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(Landroid/view/View;)I
/* add-int/2addr v11, v0 */
/* .line 112 */
v0 = java.lang.Math .max ( v8,v11 );
/* iput v0, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
} // :goto_1c
/* const/high16 v0, 0x40000000 # 2.0f */
/* if-eq v13, v0, :cond_2b */
/* .line 113 */
/* iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
int v8 = -1; // const/4 v8, -0x1
/* if-ne v0, v8, :cond_2b */
int v0 = 1; // const/4 v0, 0x1
} // :cond_2b
int v0 = 0; // const/4 v0, 0x0
/* .line 114 */
} // :goto_1d
/* iget v8, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* iget v11, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v8, v11 */
/* .line 115 */
v11 = (( android.view.View ) v14 ).getMeasuredHeight ( ); // invoke-virtual {v14}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v11, v8 */
/* .line 116 */
v4 = java.lang.Math .max ( v4,v11 );
if ( v0 != null) { // if-eqz v0, :cond_2c
} // :cond_2c
/* move v8, v11 */
/* .line 117 */
} // :goto_1e
v0 = java.lang.Math .max ( v6,v8 );
if ( v26 != null) { // if-eqz v26, :cond_2d
/* .line 118 */
/* iget v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
int v8 = -1; // const/4 v8, -0x1
/* if-ne v6, v8, :cond_2e */
int v6 = 1; // const/4 v6, 0x1
} // :cond_2d
int v8 = -1; // const/4 v8, -0x1
} // :cond_2e
int v6 = 0; // const/4 v6, 0x0
} // :goto_1f
if ( v36 != null) { // if-eqz v36, :cond_30
/* .line 119 */
v14 = (( android.view.View ) v14 ).getBaseline ( ); // invoke-virtual {v14}, Landroid/view/View;->getBaseline()I
/* if-eq v14, v8, :cond_30 */
/* .line 120 */
/* iget v5, v5, Landroidx/appcompat/widget/LinearLayoutCompat$a;->b:I */
/* if-gez v5, :cond_2f */
/* iget v5, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I */
} // :cond_2f
/* and-int/lit8 v5, v5, 0x70 */
int v8 = 4; // const/4 v8, 0x4
/* shr-int/2addr v5, v8 */
/* and-int/lit8 v5, v5, -0x2 */
/* shr-int/lit8 v5, v5, 0x1 */
/* .line 121 */
/* aget v8, v15, v5 */
v8 = java.lang.Math .max ( v8,v14 );
/* aput v8, v15, v5 */
/* .line 122 */
/* aget v8, v28, v5 */
/* sub-int/2addr v11, v14 */
v8 = java.lang.Math .max ( v8,v11 );
/* aput v8, v28, v5 */
} // :cond_30
/* move/from16 v26, v6 */
/* move v6, v0 */
/* move/from16 v0, v23 */
} // :cond_31
} // :goto_20
/* move v3, v2 */
/* move/from16 v25, v11 */
/* move/from16 v2, p2 */
} // :goto_21
/* add-int/lit8 v10, v10, 0x1 */
/* move/from16 v8, p1 */
/* move v2, v3 */
/* move/from16 v11, v25 */
int v5 = -1; // const/4 v5, -0x1
/* goto/16 :goto_17 */
} // :cond_32
/* move/from16 v2, p2 */
/* move/from16 v25, v11 */
/* .line 123 */
/* iget v0, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* add-int/2addr v3, v5 */
/* add-int/2addr v0, v3 */
/* iput v0, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 124 */
/* aget v0, v15, v18 */
int v3 = -1; // const/4 v3, -0x1
/* if-ne v0, v3, :cond_34 */
int v0 = 0; // const/4 v0, 0x0
/* aget v5, v15, v0 */
/* if-ne v5, v3, :cond_34 */
/* aget v0, v15, v17 */
/* if-ne v0, v3, :cond_34 */
/* aget v0, v15, v16 */
/* if-eq v0, v3, :cond_33 */
} // :cond_33
/* move v0, v4 */
/* .line 125 */
} // :cond_34
} // :goto_22
/* aget v0, v15, v16 */
int v3 = 0; // const/4 v3, 0x0
/* aget v5, v15, v3 */
/* aget v8, v15, v18 */
/* aget v10, v15, v17 */
/* .line 126 */
v8 = java.lang.Math .max ( v8,v10 );
/* .line 127 */
v5 = java.lang.Math .max ( v5,v8 );
/* .line 128 */
v0 = java.lang.Math .max ( v0,v5 );
/* .line 129 */
/* aget v5, v28, v16 */
/* aget v3, v28, v3 */
/* aget v8, v28, v18 */
/* aget v10, v28, v17 */
/* .line 130 */
v8 = java.lang.Math .max ( v8,v10 );
/* .line 131 */
v3 = java.lang.Math .max ( v3,v8 );
/* .line 132 */
v3 = java.lang.Math .max ( v5,v3 );
/* add-int/2addr v0, v3 */
/* .line 133 */
v0 = java.lang.Math .max ( v4,v0 );
} // :goto_23
/* move v3, v0 */
/* move v0, v6 */
/* move/from16 v23, v9 */
} // :goto_24
/* if-nez v26, :cond_35 */
/* const/high16 v4, 0x40000000 # 2.0f */
/* if-eq v13, v4, :cond_35 */
} // :cond_35
/* move v0, v3 */
/* .line 134 */
} // :goto_25
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingBottom()I */
/* add-int/2addr v3, v4 */
/* add-int/2addr v0, v3 */
/* .line 135 */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I */
v0 = java.lang.Math .max ( v0,v3 );
/* const/high16 v3, -0x1000000 */
/* and-int v3, v23, v3 */
/* or-int/2addr v1, v3 */
/* shl-int/lit8 v3, v23, 0x10 */
/* .line 136 */
v0 = android.view.View .resolveSizeAndState ( v0,v2,v3 );
/* .line 137 */
(( android.view.ViewGroup ) v7 ).setMeasuredDimension ( v1, v0 ); // invoke-virtual {v7, v1, v0}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V
if ( v27 != null) { // if-eqz v27, :cond_36
/* move/from16 v0, p1 */
/* move/from16 v1, v25 */
/* .line 138 */
(( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v1, v0 ); // invoke-virtual {v7, v1, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(II)V
} // :cond_36
return;
} // .end method
public Boolean checkLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 0 */
/* .line 1 */
/* instance-of p1, p1, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
} // .end method
public void d ( Integer p0, Integer p1 ) {
/* .locals 33 */
/* move-object/from16 v7, p0 */
/* move/from16 v8, p1 */
/* move/from16 v9, p2 */
int v10 = 0; // const/4 v10, 0x0
/* .line 1 */
/* iput v10, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 2 */
v11 = /* invoke-virtual/range {p0 ..p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getVirtualChildCount()I */
/* .line 3 */
v12 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getMode(I)I */
/* .line 4 */
v13 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getMode(I)I */
/* .line 5 */
/* iget v14, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->c:I */
/* .line 6 */
/* iget-boolean v15, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->i:Z */
/* const/16 v16, 0x0 */
/* const/16 v17, 0x1 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* const/16 v18, 0x0 */
/* const/16 v19, 0x1 */
/* const/16 v20, 0x0 */
} // :goto_0
/* const/16 v10, 0x8 */
/* move/from16 v22, v4 */
/* if-ge v6, v11, :cond_10 */
/* .line 7 */
(( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v6 ); // invoke-virtual {v7, v6}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
/* if-nez v4, :cond_0 */
/* .line 8 */
/* iget v4, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
v10 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).c ( v6 ); // invoke-virtual {v7, v6}, Landroidx/appcompat/widget/LinearLayoutCompat;->c(I)I
/* add-int/2addr v4, v10 */
/* iput v4, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* move/from16 v26, v11 */
/* move/from16 v24, v13 */
/* move/from16 v4, v22 */
/* goto/16 :goto_a */
} // :cond_0
/* move/from16 v24, v1 */
/* .line 9 */
v1 = (( android.view.View ) v4 ).getVisibility ( ); // invoke-virtual {v4}, Landroid/view/View;->getVisibility()I
/* if-ne v1, v10, :cond_1 */
/* .line 10 */
v1 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v4, v6 ); // invoke-virtual {v7, v4, v6}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/view/View;I)I
/* add-int/2addr v6, v1 */
/* move/from16 v26, v11 */
/* move/from16 v4, v22 */
/* move/from16 v1, v24 */
/* move/from16 v24, v13 */
/* goto/16 :goto_a */
/* .line 11 */
} // :cond_1
v1 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).b ( v6 ); // invoke-virtual {v7, v6}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(I)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 12 */
/* iget v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* iget v10, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I */
/* add-int/2addr v1, v10 */
/* iput v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 13 */
} // :cond_2
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v10, v1 */
/* check-cast v10, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* .line 14 */
/* iget v1, v10, Landroidx/appcompat/widget/LinearLayoutCompat$a;->a:F */
/* add-float v25, v0, v1 */
/* const/high16 v0, 0x40000000 # 2.0f */
/* if-ne v13, v0, :cond_3 */
/* .line 15 */
/* iget v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
/* if-nez v0, :cond_3 */
/* cmpl-float v0, v1, v16 */
/* if-lez v0, :cond_3 */
/* .line 16 */
/* iget v0, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 17 */
/* iget v1, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v1, v0 */
/* move/from16 v26, v2 */
/* iget v2, v10, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v1, v2 */
v0 = java.lang.Math .max ( v0,v1 );
/* iput v0, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* move v0, v3 */
/* move-object v3, v4 */
/* move/from16 v31, v5 */
/* move/from16 v8, v24 */
/* move/from16 v29, v26 */
/* const/16 v18, 0x1 */
/* move/from16 v26, v11 */
/* move/from16 v24, v13 */
/* move/from16 v13, v22 */
/* move v11, v6 */
/* goto/16 :goto_3 */
} // :cond_3
/* move/from16 v26, v2 */
/* .line 18 */
/* iget v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
/* if-nez v0, :cond_4 */
/* iget v0, v10, Landroidx/appcompat/widget/LinearLayoutCompat$a;->a:F */
/* cmpl-float v0, v0, v16 */
/* if-lez v0, :cond_4 */
int v0 = -2; // const/4 v0, -0x2
/* .line 19 */
/* iput v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
int v2 = 0; // const/4 v2, 0x0
} // :cond_4
/* const/high16 v2, -0x80000000 */
} // :goto_1
/* const/16 v27, 0x0 */
/* cmpl-float v0, v25, v16 */
/* if-nez v0, :cond_5 */
/* .line 20 */
/* iget v0, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* move/from16 v23, v0 */
} // :cond_5
/* const/16 v23, 0x0 */
} // :goto_2
/* const/high16 v28, 0x40000000 # 2.0f */
/* move-object/from16 v0, p0 */
/* move/from16 v8, v24 */
/* move-object v1, v4 */
/* move/from16 v30, v2 */
/* move/from16 v29, v26 */
/* move v2, v6 */
/* move v9, v3 */
/* move/from16 v3, p1 */
/* move/from16 v26, v11 */
/* move/from16 v24, v13 */
/* move/from16 v13, v22 */
/* const/high16 v11, 0x40000000 # 2.0f */
/* move-object/from16 v22, v4 */
/* move/from16 v4, v27 */
/* move/from16 v31, v5 */
/* move/from16 v5, p2 */
/* move v11, v6 */
/* move/from16 v6, v23 */
/* invoke-virtual/range {v0 ..v6}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/view/View;IIIII)V */
/* move/from16 v0, v30 */
/* const/high16 v1, -0x80000000 */
/* if-eq v0, v1, :cond_6 */
/* .line 21 */
/* iput v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
/* .line 22 */
} // :cond_6
v0 = /* invoke-virtual/range {v22 ..v22}, Landroid/view/View;->getMeasuredHeight()I */
/* .line 23 */
/* iget v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* add-int v2, v1, v0 */
/* .line 24 */
/* iget v3, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v2, v3 */
/* iget v3, v10, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v2, v3 */
/* move-object/from16 v3, v22 */
/* .line 25 */
v4 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).b ( v3 ); // invoke-virtual {v7, v3}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(Landroid/view/View;)I
/* add-int/2addr v2, v4 */
/* .line 26 */
v1 = java.lang.Math .max ( v1,v2 );
/* iput v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
if ( v15 != null) { // if-eqz v15, :cond_7
/* .line 27 */
v0 = java.lang.Math .max ( v0,v9 );
} // :cond_7
/* move v0, v9 */
} // :goto_3
/* if-ltz v14, :cond_8 */
/* add-int/lit8 v6, v11, 0x1 */
/* if-ne v14, v6, :cond_8 */
/* .line 28 */
/* iget v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* iput v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->d:I */
} // :cond_8
/* if-ge v11, v14, :cond_a */
/* .line 29 */
/* iget v1, v10, Landroidx/appcompat/widget/LinearLayoutCompat$a;->a:F */
/* cmpl-float v1, v1, v16 */
/* if-gtz v1, :cond_9 */
/* .line 30 */
} // :cond_9
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.Either remove the weight, or don\'t set mBaselineAlignedChildIndex."; // const-string v1, "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.Either remove the weight, or don\'t set mBaselineAlignedChildIndex."
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_a
} // :goto_4
/* const/high16 v1, 0x40000000 # 2.0f */
/* if-eq v12, v1, :cond_b */
/* .line 31 */
/* iget v1, v10, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
int v2 = -1; // const/4 v2, -0x1
/* if-ne v1, v2, :cond_b */
int v1 = 1; // const/4 v1, 0x1
/* const/16 v20, 0x1 */
} // :cond_b
int v1 = 0; // const/4 v1, 0x0
/* .line 32 */
} // :goto_5
/* iget v2, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* iget v4, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v2, v4 */
/* .line 33 */
v4 = (( android.view.View ) v3 ).getMeasuredWidth ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr v4, v2 */
/* move/from16 v5, v29 */
/* .line 34 */
v5 = java.lang.Math .max ( v5,v4 );
/* .line 35 */
v6 = (( android.view.View ) v3 ).getMeasuredState ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredState()I
/* .line 36 */
v6 = android.view.View .combineMeasuredStates ( v8,v6 );
if ( v19 != null) { // if-eqz v19, :cond_c
/* .line 37 */
/* iget v8, v10, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
int v9 = -1; // const/4 v9, -0x1
/* if-ne v8, v9, :cond_c */
/* const/16 v19, 0x1 */
} // :cond_c
/* const/16 v19, 0x0 */
/* .line 38 */
} // :goto_6
/* iget v8, v10, Landroidx/appcompat/widget/LinearLayoutCompat$a;->a:F */
/* cmpl-float v8, v8, v16 */
/* if-lez v8, :cond_e */
if ( v1 != null) { // if-eqz v1, :cond_d
} // :cond_d
/* move v2, v4 */
/* .line 39 */
} // :goto_7
v4 = java.lang.Math .max ( v13,v2 );
/* move/from16 v1, v31 */
} // :cond_e
if ( v1 != null) { // if-eqz v1, :cond_f
} // :cond_f
/* move v2, v4 */
} // :goto_8
/* move/from16 v1, v31 */
/* .line 40 */
v1 = java.lang.Math .max ( v1,v2 );
/* move v4, v13 */
/* .line 41 */
} // :goto_9
v2 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v3, v11 ); // invoke-virtual {v7, v3, v11}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/view/View;I)I
/* add-int/2addr v2, v11 */
/* move v3, v0 */
/* move/from16 v0, v25 */
/* move/from16 v32, v5 */
/* move v5, v1 */
/* move v1, v6 */
/* move v6, v2 */
/* move/from16 v2, v32 */
} // :goto_a
/* add-int/lit8 v6, v6, 0x1 */
/* move/from16 v8, p1 */
/* move/from16 v9, p2 */
/* move/from16 v13, v24 */
/* move/from16 v11, v26 */
/* goto/16 :goto_0 */
} // :cond_10
/* move v8, v1 */
/* move v9, v3 */
/* move v1, v5 */
/* move/from16 v26, v11 */
/* move/from16 v24, v13 */
/* move/from16 v13, v22 */
/* move v5, v2 */
/* .line 42 */
/* iget v2, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* if-lez v2, :cond_11 */
/* move/from16 v2, v26 */
v3 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).b ( v2 ); // invoke-virtual {v7, v2}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(I)Z
if ( v3 != null) { // if-eqz v3, :cond_12
/* .line 43 */
/* iget v3, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* iget v4, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I */
/* add-int/2addr v3, v4 */
/* iput v3, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
} // :cond_11
/* move/from16 v2, v26 */
} // :cond_12
} // :goto_b
/* move/from16 v3, v24 */
if ( v15 != null) { // if-eqz v15, :cond_16
/* const/high16 v4, -0x80000000 */
/* if-eq v3, v4, :cond_13 */
/* if-nez v3, :cond_16 */
} // :cond_13
int v4 = 0; // const/4 v4, 0x0
/* .line 44 */
/* iput v4, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
int v4 = 0; // const/4 v4, 0x0
} // :goto_c
/* if-ge v4, v2, :cond_16 */
/* .line 45 */
(( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v4 ); // invoke-virtual {v7, v4}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
/* if-nez v6, :cond_14 */
/* .line 46 */
/* iget v6, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
v11 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).c ( v4 ); // invoke-virtual {v7, v4}, Landroidx/appcompat/widget/LinearLayoutCompat;->c(I)I
/* add-int/2addr v6, v11 */
/* iput v6, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 47 */
} // :cond_14
v11 = (( android.view.View ) v6 ).getVisibility ( ); // invoke-virtual {v6}, Landroid/view/View;->getVisibility()I
/* if-ne v11, v10, :cond_15 */
/* .line 48 */
v6 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v6, v4 ); // invoke-virtual {v7, v6, v4}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/view/View;I)I
/* add-int/2addr v4, v6 */
/* .line 49 */
} // :cond_15
(( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v11, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* .line 50 */
/* iget v14, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* add-int v21, v14, v9 */
/* .line 51 */
/* iget v10, v11, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int v21, v21, v10 */
/* iget v10, v11, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int v21, v21, v10 */
/* .line 52 */
v6 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).b ( v6 ); // invoke-virtual {v7, v6}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(Landroid/view/View;)I
/* add-int v6, v21, v6 */
/* .line 53 */
v6 = java.lang.Math .max ( v14,v6 );
/* iput v6, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
} // :goto_d
/* add-int/lit8 v4, v4, 0x1 */
/* const/16 v10, 0x8 */
/* .line 54 */
} // :cond_16
/* iget v4, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
v10 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingBottom()I */
/* add-int/2addr v6, v10 */
/* add-int/2addr v4, v6 */
/* iput v4, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 55 */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I */
v4 = java.lang.Math .max ( v4,v6 );
/* move/from16 v6, p2 */
/* move v10, v9 */
int v9 = 0; // const/4 v9, 0x0
/* .line 56 */
v4 = android.view.View .resolveSizeAndState ( v4,v6,v9 );
/* const v9, 0xffffff */
/* and-int/2addr v9, v4 */
/* .line 57 */
/* iget v11, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* sub-int/2addr v9, v11 */
/* if-nez v18, :cond_1b */
if ( v9 != null) { // if-eqz v9, :cond_17
/* cmpl-float v11, v0, v16 */
/* if-lez v11, :cond_17 */
/* .line 58 */
} // :cond_17
v0 = java.lang.Math .max ( v1,v13 );
if ( v15 != null) { // if-eqz v15, :cond_1a
/* const/high16 v1, 0x40000000 # 2.0f */
/* if-eq v3, v1, :cond_1a */
int v1 = 0; // const/4 v1, 0x0
} // :goto_e
/* if-ge v1, v2, :cond_1a */
/* .line 59 */
(( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v1 ); // invoke-virtual {v7, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
if ( v3 != null) { // if-eqz v3, :cond_19
/* .line 60 */
v9 = (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
/* const/16 v11, 0x8 */
/* if-ne v9, v11, :cond_18 */
/* .line 61 */
} // :cond_18
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v9, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* .line 62 */
/* iget v9, v9, Landroidx/appcompat/widget/LinearLayoutCompat$a;->a:F */
/* cmpl-float v9, v9, v16 */
/* if-lez v9, :cond_19 */
/* .line 63 */
v9 = (( android.view.View ) v3 ).getMeasuredWidth ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
/* const/high16 v11, 0x40000000 # 2.0f */
v9 = android.view.View$MeasureSpec .makeMeasureSpec ( v9,v11 );
/* .line 64 */
v13 = android.view.View$MeasureSpec .makeMeasureSpec ( v10,v11 );
/* .line 65 */
(( android.view.View ) v3 ).measure ( v9, v13 ); // invoke-virtual {v3, v9, v13}, Landroid/view/View;->measure(II)V
} // :cond_19
} // :goto_f
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1a
/* move/from16 v11, p1 */
/* move v1, v8 */
/* goto/16 :goto_1a */
/* .line 66 */
} // :cond_1b
} // :goto_10
/* iget v10, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->h:F */
/* cmpl-float v11, v10, v16 */
/* if-lez v11, :cond_1c */
/* move v0, v10 */
} // :cond_1c
int v10 = 0; // const/4 v10, 0x0
/* .line 67 */
/* iput v10, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* move v11, v9 */
/* move v9, v1 */
/* move v1, v8 */
int v8 = 0; // const/4 v8, 0x0
} // :goto_11
/* if-ge v8, v2, :cond_27 */
/* .line 68 */
(( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).a ( v8 ); // invoke-virtual {v7, v8}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(I)Landroid/view/View;
/* .line 69 */
v14 = (( android.view.View ) v13 ).getVisibility ( ); // invoke-virtual {v13}, Landroid/view/View;->getVisibility()I
/* const/16 v15, 0x8 */
/* if-ne v14, v15, :cond_1d */
/* move/from16 v21, v11 */
/* move/from16 v11, p1 */
/* goto/16 :goto_19 */
/* .line 70 */
} // :cond_1d
(( android.view.View ) v13 ).getLayoutParams ( ); // invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v14, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* .line 71 */
/* iget v10, v14, Landroidx/appcompat/widget/LinearLayoutCompat$a;->a:F */
/* cmpl-float v18, v10, v16 */
/* if-lez v18, :cond_22 */
/* int-to-float v15, v11 */
/* mul-float v15, v15, v10 */
/* div-float/2addr v15, v0 */
/* float-to-int v15, v15 */
/* sub-float/2addr v0, v10 */
/* sub-int/2addr v11, v15 */
/* .line 72 */
v10 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
v18 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* add-int v10, v10, v18 */
/* move/from16 v18, v0 */
/* iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v10, v0 */
/* iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v10, v0 */
/* iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* move/from16 v21, v11 */
/* move/from16 v11, p1 */
/* .line 73 */
v0 = android.view.ViewGroup .getChildMeasureSpec ( v11,v10,v0 );
/* .line 74 */
/* iget v10, v14, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
/* if-nez v10, :cond_20 */
/* const/high16 v10, 0x40000000 # 2.0f */
/* if-eq v3, v10, :cond_1e */
} // :cond_1e
/* if-lez v15, :cond_1f */
} // :cond_1f
int v15 = 0; // const/4 v15, 0x0
/* .line 75 */
} // :goto_12
v15 = android.view.View$MeasureSpec .makeMeasureSpec ( v15,v10 );
/* .line 76 */
(( android.view.View ) v13 ).measure ( v0, v15 ); // invoke-virtual {v13, v0, v15}, Landroid/view/View;->measure(II)V
} // :cond_20
/* const/high16 v10, 0x40000000 # 2.0f */
/* .line 77 */
} // :goto_13
v23 = (( android.view.View ) v13 ).getMeasuredHeight ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
/* add-int v15, v23, v15 */
/* if-gez v15, :cond_21 */
int v15 = 0; // const/4 v15, 0x0
/* .line 78 */
} // :cond_21
v15 = android.view.View$MeasureSpec .makeMeasureSpec ( v15,v10 );
/* .line 79 */
(( android.view.View ) v13 ).measure ( v0, v15 ); // invoke-virtual {v13, v0, v15}, Landroid/view/View;->measure(II)V
/* .line 80 */
} // :goto_14
v0 = (( android.view.View ) v13 ).getMeasuredState ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredState()I
/* and-int/lit16 v0, v0, -0x100 */
/* .line 81 */
v1 = android.view.View .combineMeasuredStates ( v1,v0 );
/* move/from16 v0, v18 */
} // :cond_22
/* move v10, v11 */
/* move/from16 v11, p1 */
/* move/from16 v21, v10 */
/* .line 82 */
} // :goto_15
/* iget v10, v14, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* iget v15, v14, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v10, v15 */
/* .line 83 */
v15 = (( android.view.View ) v13 ).getMeasuredWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr v15, v10 */
/* .line 84 */
v5 = java.lang.Math .max ( v5,v15 );
/* move/from16 v18, v0 */
/* const/high16 v0, 0x40000000 # 2.0f */
/* if-eq v12, v0, :cond_23 */
/* .line 85 */
/* iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* move/from16 v23, v1 */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_24 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_23
/* move/from16 v23, v1 */
int v1 = -1; // const/4 v1, -0x1
} // :cond_24
int v0 = 0; // const/4 v0, 0x0
} // :goto_16
if ( v0 != null) { // if-eqz v0, :cond_25
} // :cond_25
/* move v10, v15 */
/* .line 86 */
} // :goto_17
v0 = java.lang.Math .max ( v9,v10 );
if ( v19 != null) { // if-eqz v19, :cond_26
/* .line 87 */
/* iget v9, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* if-ne v9, v1, :cond_26 */
int v9 = 1; // const/4 v9, 0x1
} // :cond_26
int v9 = 0; // const/4 v9, 0x0
/* .line 88 */
} // :goto_18
/* iget v10, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* .line 89 */
v15 = (( android.view.View ) v13 ).getMeasuredHeight ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v15, v10 */
/* iget v1, v14, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v15, v1 */
/* iget v1, v14, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v15, v1 */
/* .line 90 */
v1 = (( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).b ( v13 ); // invoke-virtual {v7, v13}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(Landroid/view/View;)I
/* add-int/2addr v15, v1 */
/* .line 91 */
v1 = java.lang.Math .max ( v10,v15 );
/* iput v1, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* move/from16 v19, v9 */
/* move/from16 v1, v23 */
/* move v9, v0 */
/* move/from16 v0, v18 */
} // :goto_19
/* add-int/lit8 v8, v8, 0x1 */
/* move/from16 v11, v21 */
int v10 = 0; // const/4 v10, 0x0
/* goto/16 :goto_11 */
} // :cond_27
/* move/from16 v11, p1 */
/* .line 92 */
/* iget v0, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
v8 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingBottom()I */
/* add-int/2addr v3, v8 */
/* add-int/2addr v0, v3 */
/* iput v0, v7, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* move v0, v9 */
} // :goto_1a
/* if-nez v19, :cond_28 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* if-eq v12, v3, :cond_28 */
} // :cond_28
/* move v0, v5 */
/* .line 93 */
} // :goto_1b
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* add-int/2addr v3, v5 */
/* add-int/2addr v0, v3 */
/* .line 94 */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I */
v0 = java.lang.Math .max ( v0,v3 );
/* .line 95 */
v0 = android.view.View .resolveSizeAndState ( v0,v11,v1 );
(( android.view.ViewGroup ) v7 ).setMeasuredDimension ( v0, v4 ); // invoke-virtual {v7, v0, v4}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V
if ( v20 != null) { // if-eqz v20, :cond_29
/* .line 96 */
(( androidx.appcompat.widget.LinearLayoutCompat ) v7 ).b ( v2, v6 ); // invoke-virtual {v7, v2, v6}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(II)V
} // :cond_29
return;
} // .end method
public android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->generateDefaultLayoutParams()Landroidx/appcompat/widget/LinearLayoutCompat$a;
} // .end method
public androidx.appcompat.widget.LinearLayoutCompat$a generateDefaultLayoutParams ( ) {
/* .locals 3 */
/* .line 2 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I */
int v1 = -2; // const/4 v1, -0x2
/* if-nez v0, :cond_0 */
/* .line 3 */
/* new-instance v0, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* invoke-direct {v0, v1, v1}, Landroidx/appcompat/widget/LinearLayoutCompat$a;-><init>(II)V */
} // :cond_0
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_1 */
/* .line 4 */
/* new-instance v0, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
int v2 = -1; // const/4 v2, -0x1
/* invoke-direct {v0, v2, v1}, Landroidx/appcompat/widget/LinearLayoutCompat$a;-><init>(II)V */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).generateLayoutParams ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->generateLayoutParams(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/LinearLayoutCompat$a;
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).generateLayoutParams ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/LinearLayoutCompat$a;
} // .end method
public androidx.appcompat.widget.LinearLayoutCompat$a generateLayoutParams ( android.util.AttributeSet p0 ) {
/* .locals 2 */
/* .line 3 */
/* new-instance v0, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroidx/appcompat/widget/LinearLayoutCompat$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public androidx.appcompat.widget.LinearLayoutCompat$a generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* .line 4 */
/* new-instance v0, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* invoke-direct {v0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat$a;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // .end method
public Integer getBaseline ( ) {
/* .locals 5 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->c:I */
/* if-gez v0, :cond_0 */
/* .line 2 */
v0 = /* invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I */
/* .line 3 */
} // :cond_0
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* iget v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->c:I */
/* if-le v0, v1, :cond_6 */
/* .line 4 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 5 */
v1 = (( android.view.View ) v0 ).getBaseline ( ); // invoke-virtual {v0}, Landroid/view/View;->getBaseline()I
int v2 = -1; // const/4 v2, -0x1
/* if-ne v1, v2, :cond_2 */
/* .line 6 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->c:I */
/* if-nez v0, :cond_1 */
/* .line 7 */
} // :cond_1
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline."; // const-string v1, "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline."
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 8 */
} // :cond_2
/* iget v2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->d:I */
/* .line 9 */
/* iget v3, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I */
int v4 = 1; // const/4 v4, 0x1
/* if-ne v3, v4, :cond_5 */
/* .line 10 */
/* iget v3, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I */
/* and-int/lit8 v3, v3, 0x70 */
/* const/16 v4, 0x30 */
/* if-eq v3, v4, :cond_5 */
/* const/16 v4, 0x10 */
/* if-eq v3, v4, :cond_4 */
/* const/16 v4, 0x50 */
/* if-eq v3, v4, :cond_3 */
/* .line 11 */
} // :cond_3
v2 = (( android.view.ViewGroup ) p0 ).getBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getBottom()I
v3 = (( android.view.ViewGroup ) p0 ).getTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getTop()I
/* sub-int/2addr v2, v3 */
v3 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* sub-int/2addr v2, v3 */
/* .line 12 */
} // :cond_4
v3 = (( android.view.ViewGroup ) p0 ).getBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getBottom()I
v4 = (( android.view.ViewGroup ) p0 ).getTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getTop()I
/* sub-int/2addr v3, v4 */
v4 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* sub-int/2addr v3, v4 */
v4 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* sub-int/2addr v3, v4 */
/* iget v4, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->g:I */
/* sub-int/2addr v3, v4 */
/* div-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* .line 13 */
} // :cond_5
} // :goto_0
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* .line 14 */
/* iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v2, v0 */
/* add-int/2addr v2, v1 */
/* .line 15 */
} // :cond_6
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."; // const-string v1, "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Integer getBaselineAlignedChildIndex ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->c:I */
} // .end method
public android.graphics.drawable.Drawable getDividerDrawable ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.l;
} // .end method
public Integer getDividerPadding ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->p:I */
} // .end method
public Integer getDividerWidth ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I */
} // .end method
public Integer getGravity ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I */
} // .end method
public Integer getOrientation ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I */
} // .end method
public Integer getShowDividers ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->o:I */
} // .end method
public Integer getVirtualChildCount ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
} // .end method
public Float getWeightSum ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->h:F */
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.l;
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_1 */
/* .line 3 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(Landroid/graphics/Canvas;)V
/* .line 4 */
} // :cond_1
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(Landroid/graphics/Canvas;)V
} // :goto_0
return;
} // .end method
public void onInitializeAccessibilityEvent ( android.view.accessibility.AccessibilityEvent p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V */
final String v0 = "androidx.appcompat.widget.LinearLayoutCompat"; // const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"
/* .line 2 */
(( android.view.accessibility.AccessibilityEvent ) p1 ).setClassName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
return;
} // .end method
public void onInitializeAccessibilityNodeInfo ( android.view.accessibility.AccessibilityNodeInfo p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V */
final String v0 = "androidx.appcompat.widget.LinearLayoutCompat"; // const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"
/* .line 2 */
(( android.view.accessibility.AccessibilityNodeInfo ) p1 ).setClassName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V
return;
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 1 */
/* .line 1 */
/* iget p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
/* .line 2 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).b ( p2, p3, p4, p5 ); // invoke-virtual {p0, p2, p3, p4, p5}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(IIII)V
/* .line 3 */
} // :cond_0
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).a ( p2, p3, p4, p5 ); // invoke-virtual {p0, p2, p3, p4, p5}, Landroidx/appcompat/widget/LinearLayoutCompat;->a(IIII)V
} // :goto_0
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 2 */
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->d(II)V
/* .line 3 */
} // :cond_0
(( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->c(II)V
} // :goto_0
return;
} // .end method
public void setBaselineAligned ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->b:Z */
return;
} // .end method
public void setBaselineAlignedChildIndex ( Integer p0 ) {
/* .locals 2 */
/* if-ltz p1, :cond_0 */
/* .line 1 */
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ge p1, v0, :cond_0 */
/* .line 2 */
/* iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->c:I */
return;
/* .line 3 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "base aligned child index out of range (0, "; // const-string v1, "base aligned child index out of range (0, "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 4 */
v1 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void setDividerDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.l;
/* if-ne p1, v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
this.l = p1;
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 3 */
v1 = (( android.graphics.drawable.Drawable ) p1 ).getIntrinsicWidth ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* iput v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I */
/* .line 4 */
v1 = (( android.graphics.drawable.Drawable ) p1 ).getIntrinsicHeight ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* iput v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I */
/* .line 5 */
} // :cond_1
/* iput v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I */
/* .line 6 */
/* iput v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I */
} // :goto_0
/* if-nez p1, :cond_2 */
int v0 = 1; // const/4 v0, 0x1
/* .line 7 */
} // :cond_2
(( android.view.ViewGroup ) p0 ).setWillNotDraw ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V
/* .line 8 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
return;
} // .end method
public void setDividerPadding ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->p:I */
return;
} // .end method
public void setGravity ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I */
/* if-eq v0, p1, :cond_2 */
/* const v0, 0x800007 */
/* and-int/2addr v0, p1 */
/* if-nez v0, :cond_0 */
/* const v0, 0x800003 */
/* or-int/2addr p1, v0 */
} // :cond_0
/* and-int/lit8 v0, p1, 0x70 */
/* if-nez v0, :cond_1 */
/* or-int/lit8 p1, p1, 0x30 */
/* .line 2 */
} // :cond_1
/* iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I */
/* .line 3 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
} // :cond_2
return;
} // .end method
public void setHorizontalGravity ( Integer p0 ) {
/* .locals 2 */
/* const v0, 0x800007 */
/* and-int/2addr p1, v0 */
/* .line 1 */
/* iget v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I */
/* and-int/2addr v0, v1 */
/* if-eq v0, p1, :cond_0 */
/* const v0, -0x800008 */
/* and-int/2addr v0, v1 */
/* or-int/2addr p1, v0 */
/* .line 2 */
/* iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I */
/* .line 3 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
} // :cond_0
return;
} // .end method
public void setMeasureWithLargestChildEnabled ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->i:Z */
return;
} // .end method
public void setOrientation ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I */
/* if-eq v0, p1, :cond_0 */
/* .line 2 */
/* iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I */
/* .line 3 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
} // :cond_0
return;
} // .end method
public void setShowDividers ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->o:I */
/* if-eq p1, v0, :cond_0 */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
/* .line 3 */
} // :cond_0
/* iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->o:I */
return;
} // .end method
public void setVerticalGravity ( Integer p0 ) {
/* .locals 2 */
/* and-int/lit8 p1, p1, 0x70 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I */
/* and-int/lit8 v1, v0, 0x70 */
/* if-eq v1, p1, :cond_0 */
/* and-int/lit8 v0, v0, -0x71 */
/* or-int/2addr p1, v0 */
/* .line 2 */
/* iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I */
/* .line 3 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
} // :cond_0
return;
} // .end method
public void setWeightSum ( Float p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
p1 = java.lang.Math .max ( v0,p1 );
/* iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->h:F */
return;
} // .end method
public Boolean shouldDelayChildPressedState ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
