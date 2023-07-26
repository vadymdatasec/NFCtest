public class androidx.appcompat.widget.ActionMenuView extends androidx.appcompat.widget.LinearLayoutCompat implements c.b.p.o.m$b implements c.b.p.o.a0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/appcompat/widget/ActionMenuView$c;, */
	 /* Landroidx/appcompat/widget/ActionMenuView$a;, */
	 /* Landroidx/appcompat/widget/ActionMenuView$b;, */
	 /* Landroidx/appcompat/widget/ActionMenuView$d;, */
	 /* Landroidx/appcompat/widget/ActionMenuView$e; */
	 /* } */
} // .end annotation
/* # instance fields */
public Integer A;
public androidx.appcompat.widget.ActionMenuView$e B;
public c.b.p.o.m q;
public android.content.Context r;
public Integer s;
public Boolean t;
public c.b.q.k u;
public c.b.p.o.z$a v;
public c.b.p.o.m$a w;
public Boolean x;
public Integer y;
public Integer z;
/* # direct methods */
public androidx.appcompat.widget.ActionMenuView ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 1 */
	 /* invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ActionMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public androidx.appcompat.widget.ActionMenuView ( ) {
	 /* .locals 2 */
	 /* .line 2 */
	 /* invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 int p2 = 0; // const/4 p2, 0x0
	 /* .line 3 */
	 (( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).setBaselineAligned ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->setBaselineAligned(Z)V
	 /* .line 4 */
	 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 /* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
	 /* const/high16 v1, 0x42600000 # 56.0f */
	 /* mul-float v1, v1, v0 */
	 /* float-to-int v1, v1 */
	 /* .line 5 */
	 /* iput v1, p0, Landroidx/appcompat/widget/ActionMenuView;->z:I */
	 /* const/high16 v1, 0x40800000 # 4.0f */
	 /* mul-float v0, v0, v1 */
	 /* float-to-int v0, v0 */
	 /* .line 6 */
	 /* iput v0, p0, Landroidx/appcompat/widget/ActionMenuView;->A:I */
	 /* .line 7 */
	 this.r = p1;
	 /* .line 8 */
	 /* iput p2, p0, Landroidx/appcompat/widget/ActionMenuView;->s:I */
	 return;
} // .end method
public static Integer b ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
	 /* .locals 5 */
	 /* .line 1 */
	 (( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
	 /* check-cast v0, Landroidx/appcompat/widget/ActionMenuView$c; */
	 /* .line 2 */
	 v1 = 	 android.view.View$MeasureSpec .getSize ( p3 );
	 /* sub-int/2addr v1, p4 */
	 /* .line 3 */
	 p3 = 	 android.view.View$MeasureSpec .getMode ( p3 );
	 /* .line 4 */
	 p3 = 	 android.view.View$MeasureSpec .makeMeasureSpec ( v1,p3 );
	 /* .line 5 */
	 /* instance-of p4, p0, Landroidx/appcompat/view/menu/ActionMenuItemView; */
	 if ( p4 != null) { // if-eqz p4, :cond_0
		 /* move-object p4, p0 */
		 /* check-cast p4, Landroidx/appcompat/view/menu/ActionMenuItemView; */
	 } // :cond_0
	 int p4 = 0; // const/4 p4, 0x0
} // :goto_0
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
if ( p4 != null) { // if-eqz p4, :cond_1
	 /* .line 6 */
	 p4 = 	 (( androidx.appcompat.view.menu.ActionMenuItemView ) p4 ).e ( ); // invoke-virtual {p4}, Landroidx/appcompat/view/menu/ActionMenuItemView;->e()Z
	 if ( p4 != null) { // if-eqz p4, :cond_1
		 int p4 = 1; // const/4 p4, 0x1
	 } // :cond_1
	 int p4 = 0; // const/4 p4, 0x0
} // :goto_1
int v3 = 2; // const/4 v3, 0x2
/* if-lez p2, :cond_5 */
if ( p4 != null) { // if-eqz p4, :cond_2
	 /* if-lt p2, v3, :cond_5 */
} // :cond_2
/* mul-int p2, p2, p1 */
/* const/high16 v4, -0x80000000 */
/* .line 7 */
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v4 );
/* .line 8 */
(( android.view.View ) p0 ).measure ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroid/view/View;->measure(II)V
/* .line 9 */
p2 = (( android.view.View ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I
/* .line 10 */
/* div-int v4, p2, p1 */
/* .line 11 */
/* rem-int/2addr p2, p1 */
if ( p2 != null) { // if-eqz p2, :cond_3
	 /* add-int/lit8 v4, v4, 0x1 */
} // :cond_3
if ( p4 != null) { // if-eqz p4, :cond_4
	 /* if-ge v4, v3, :cond_4 */
} // :cond_4
/* move v3, v4 */
} // :cond_5
int v3 = 0; // const/4 v3, 0x0
/* .line 12 */
} // :goto_2
/* iget-boolean p2, v0, Landroidx/appcompat/widget/ActionMenuView$c;->c:Z */
/* if-nez p2, :cond_6 */
if ( p4 != null) { // if-eqz p4, :cond_6
} // :cond_6
int v1 = 0; // const/4 v1, 0x0
/* .line 13 */
} // :goto_3
/* iput-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuView$c;->f:Z */
/* .line 14 */
/* iput v3, v0, Landroidx/appcompat/widget/ActionMenuView$c;->d:I */
/* mul-int p1, p1, v3 */
/* const/high16 p2, 0x40000000 # 2.0f */
/* .line 15 */
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( p1,p2 );
(( android.view.View ) p0 ).measure ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Landroid/view/View;->measure(II)V
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
/* .locals 0 */
/* .line 2 */
this.q = p1;
return;
} // .end method
public void a ( c.b.p.o.z$a p0, c.b.p.o.m$a p1 ) {
/* .locals 0 */
/* .line 3 */
this.v = p1;
/* .line 4 */
this.w = p2;
return;
} // .end method
public Boolean a ( Object p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.q;
int v1 = 0; // const/4 v1, 0x0
p1 = (( c.b.p.o.m ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/b/p/o/m;->a(Landroid/view/MenuItem;I)Z
} // .end method
public Boolean checkLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 0 */
/* .line 1 */
/* instance-of p1, p1, Landroidx/appcompat/widget/ActionMenuView$c; */
} // .end method
public void d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.k ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/q/k;->b()Z
} // :cond_0
return;
} // .end method
public Boolean d ( Integer p0 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, p1, -0x1 */
/* .line 3 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 4 */
(( android.view.ViewGroup ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 5 */
v3 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ge p1, v3, :cond_1 */
/* instance-of v3, v1, Landroidx/appcompat/widget/ActionMenuView$a; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 6 */
v1 = /* check-cast v1, Landroidx/appcompat/widget/ActionMenuView$a; */
/* or-int/2addr v0, v1 */
} // :cond_1
/* if-lez p1, :cond_2 */
/* .line 7 */
/* instance-of p1, v2, Landroidx/appcompat/widget/ActionMenuView$a; */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 8 */
p1 = /* check-cast v2, Landroidx/appcompat/widget/ActionMenuView$a; */
/* or-int/2addr v0, p1 */
} // :cond_2
} // .end method
public Boolean dispatchPopulateAccessibilityEvent ( android.view.accessibility.AccessibilityEvent p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public androidx.appcompat.widget.ActionMenuView$c e ( ) {
/* .locals 2 */
/* .line 65 */
(( androidx.appcompat.widget.ActionMenuView ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->generateDefaultLayoutParams()Landroidx/appcompat/widget/ActionMenuView$c;
int v1 = 1; // const/4 v1, 0x1
/* .line 66 */
/* iput-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuView$c;->c:Z */
} // .end method
public final void e ( Integer p0, Integer p1 ) {
/* .locals 29 */
/* move-object/from16 v0, p0 */
/* .line 1 */
v1 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getMode(I)I */
/* .line 2 */
v2 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getSize(I)I */
/* .line 3 */
v3 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getSize(I)I */
/* .line 4 */
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* add-int/2addr v4, v5 */
/* .line 5 */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingBottom()I */
/* add-int/2addr v5, v6 */
int v6 = -2; // const/4 v6, -0x2
/* move/from16 v7, p2 */
/* .line 6 */
v6 = android.view.ViewGroup .getChildMeasureSpec ( v7,v5,v6 );
/* sub-int/2addr v2, v4 */
/* .line 7 */
/* iget v4, v0, Landroidx/appcompat/widget/ActionMenuView;->z:I */
/* div-int v7, v2, v4 */
/* .line 8 */
/* rem-int v8, v2, v4 */
int v9 = 0; // const/4 v9, 0x0
/* if-nez v7, :cond_0 */
/* .line 9 */
(( android.view.ViewGroup ) v0 ).setMeasuredDimension ( v2, v9 ); // invoke-virtual {v0, v2, v9}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V
return;
/* .line 10 */
} // :cond_0
/* div-int/2addr v8, v7 */
/* add-int/2addr v4, v8 */
/* .line 11 */
v8 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getChildCount()I */
int v10 = 0; // const/4 v10, 0x0
int v12 = 0; // const/4 v12, 0x0
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
int v15 = 0; // const/4 v15, 0x0
/* const/16 v16, 0x0 */
/* const-wide/16 v17, 0x0 */
} // :goto_0
/* if-ge v12, v8, :cond_8 */
/* .line 12 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v12 ); // invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 13 */
v9 = (( android.view.View ) v11 ).getVisibility ( ); // invoke-virtual {v11}, Landroid/view/View;->getVisibility()I
/* move/from16 v19, v3 */
/* const/16 v3, 0x8 */
/* if-ne v9, v3, :cond_1 */
/* goto/16 :goto_5 */
/* .line 14 */
} // :cond_1
/* instance-of v3, v11, Landroidx/appcompat/view/menu/ActionMenuItemView; */
/* add-int/lit8 v14, v14, 0x1 */
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 15 */
/* iget v9, v0, Landroidx/appcompat/widget/ActionMenuView;->A:I */
/* move/from16 v20, v14 */
int v14 = 0; // const/4 v14, 0x0
(( android.view.View ) v11 ).setPadding ( v9, v14, v9, v14 ); // invoke-virtual {v11, v9, v14, v9, v14}, Landroid/view/View;->setPadding(IIII)V
} // :cond_2
/* move/from16 v20, v14 */
int v14 = 0; // const/4 v14, 0x0
/* .line 16 */
} // :goto_1
(( android.view.View ) v11 ).getLayoutParams ( ); // invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v9, Landroidx/appcompat/widget/ActionMenuView$c; */
/* .line 17 */
/* iput-boolean v14, v9, Landroidx/appcompat/widget/ActionMenuView$c;->h:Z */
/* .line 18 */
/* iput v14, v9, Landroidx/appcompat/widget/ActionMenuView$c;->e:I */
/* .line 19 */
/* iput v14, v9, Landroidx/appcompat/widget/ActionMenuView$c;->d:I */
/* .line 20 */
/* iput-boolean v14, v9, Landroidx/appcompat/widget/ActionMenuView$c;->f:Z */
/* .line 21 */
/* iput v14, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* .line 22 */
/* iput v14, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 23 */
/* move-object v3, v11 */
/* check-cast v3, Landroidx/appcompat/view/menu/ActionMenuItemView; */
v3 = (( androidx.appcompat.view.menu.ActionMenuItemView ) v3 ).e ( ); // invoke-virtual {v3}, Landroidx/appcompat/view/menu/ActionMenuItemView;->e()Z
if ( v3 != null) { // if-eqz v3, :cond_3
int v3 = 1; // const/4 v3, 0x1
} // :cond_3
int v3 = 0; // const/4 v3, 0x0
} // :goto_2
/* iput-boolean v3, v9, Landroidx/appcompat/widget/ActionMenuView$c;->g:Z */
/* .line 24 */
/* iget-boolean v3, v9, Landroidx/appcompat/widget/ActionMenuView$c;->c:Z */
if ( v3 != null) { // if-eqz v3, :cond_4
int v3 = 1; // const/4 v3, 0x1
} // :cond_4
/* move v3, v7 */
/* .line 25 */
} // :goto_3
v3 = androidx.appcompat.widget.ActionMenuView .b ( v11,v4,v3,v6,v5 );
/* .line 26 */
v15 = java.lang.Math .max ( v15,v3 );
/* .line 27 */
/* iget-boolean v14, v9, Landroidx/appcompat/widget/ActionMenuView$c;->f:Z */
if ( v14 != null) { // if-eqz v14, :cond_5
/* add-int/lit8 v16, v16, 0x1 */
/* .line 28 */
} // :cond_5
/* iget-boolean v9, v9, Landroidx/appcompat/widget/ActionMenuView$c;->c:Z */
if ( v9 != null) { // if-eqz v9, :cond_6
int v13 = 1; // const/4 v13, 0x1
} // :cond_6
/* sub-int/2addr v7, v3 */
/* .line 29 */
v9 = (( android.view.View ) v11 ).getMeasuredHeight ( ); // invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I
v10 = java.lang.Math .max ( v10,v9 );
int v9 = 1; // const/4 v9, 0x1
/* if-ne v3, v9, :cond_7 */
/* shl-int v3, v9, v12 */
/* move v11, v10 */
/* int-to-long v9, v3 */
/* or-long v9, v17, v9 */
/* move-wide/from16 v17, v9 */
/* move v10, v11 */
} // :cond_7
/* move v11, v10 */
} // :goto_4
/* move/from16 v14, v20 */
} // :goto_5
/* add-int/lit8 v12, v12, 0x1 */
/* move/from16 v3, v19 */
int v9 = 0; // const/4 v9, 0x0
} // :cond_8
/* move/from16 v19, v3 */
int v3 = 2; // const/4 v3, 0x2
if ( v13 != null) { // if-eqz v13, :cond_9
/* if-ne v14, v3, :cond_9 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_9
int v5 = 0; // const/4 v5, 0x0
} // :goto_6
int v9 = 0; // const/4 v9, 0x0
} // :goto_7
/* if-lez v16, :cond_13 */
/* if-lez v7, :cond_13 */
/* const v20, 0x7fffffff */
int v3 = 0; // const/4 v3, 0x0
int v11 = 0; // const/4 v11, 0x0
/* const v12, 0x7fffffff */
/* const-wide/16 v20, 0x0 */
} // :goto_8
/* if-ge v11, v8, :cond_d */
/* .line 30 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v11 ); // invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 31 */
/* invoke-virtual/range {v24 ..v24}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
/* move/from16 v25, v9 */
/* move-object/from16 v9, v24 */
/* check-cast v9, Landroidx/appcompat/widget/ActionMenuView$c; */
/* move/from16 v24, v10 */
/* .line 32 */
/* iget-boolean v10, v9, Landroidx/appcompat/widget/ActionMenuView$c;->f:Z */
/* if-nez v10, :cond_a */
/* .line 33 */
} // :cond_a
/* iget v9, v9, Landroidx/appcompat/widget/ActionMenuView$c;->d:I */
/* if-ge v9, v12, :cond_b */
/* const-wide/16 v22, 0x1 */
/* shl-long v20, v22, v11 */
/* move v12, v9 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_b
/* const-wide/16 v22, 0x1 */
/* if-ne v9, v12, :cond_c */
/* shl-long v9, v22, v11 */
/* or-long v9, v20, v9 */
/* add-int/lit8 v3, v3, 0x1 */
/* move-wide/from16 v20, v9 */
} // :cond_c
} // :goto_9
/* add-int/lit8 v11, v11, 0x1 */
/* move/from16 v10, v24 */
/* move/from16 v9, v25 */
} // :cond_d
/* move/from16 v25, v9 */
/* move/from16 v24, v10 */
/* or-long v17, v17, v20 */
/* if-le v3, v7, :cond_e */
/* move v11, v1 */
/* move/from16 v26, v2 */
} // :cond_e
/* add-int/lit8 v12, v12, 0x1 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_a
/* if-ge v3, v8, :cond_12 */
/* .line 34 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v3 ); // invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 35 */
(( android.view.View ) v9 ).getLayoutParams ( ); // invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v10, Landroidx/appcompat/widget/ActionMenuView$c; */
/* move/from16 v26, v2 */
int v11 = 1; // const/4 v11, 0x1
/* shl-int v2, v11, v3 */
/* move v11, v1 */
/* int-to-long v1, v2 */
/* and-long v22, v20, v1 */
/* const-wide/16 v27, 0x0 */
/* cmp-long v25, v22, v27 */
/* if-nez v25, :cond_10 */
/* .line 36 */
/* iget v9, v10, Landroidx/appcompat/widget/ActionMenuView$c;->d:I */
/* if-ne v9, v12, :cond_f */
/* or-long v17, v17, v1 */
} // :cond_f
/* move/from16 v27, v5 */
} // :cond_10
if ( v5 != null) { // if-eqz v5, :cond_11
/* .line 37 */
/* iget-boolean v1, v10, Landroidx/appcompat/widget/ActionMenuView$c;->g:Z */
if ( v1 != null) { // if-eqz v1, :cond_11
int v1 = 1; // const/4 v1, 0x1
/* if-ne v7, v1, :cond_11 */
/* .line 38 */
/* iget v2, v0, Landroidx/appcompat/widget/ActionMenuView;->A:I */
/* add-int v1, v2, v4 */
/* move/from16 v27, v5 */
int v5 = 0; // const/4 v5, 0x0
(( android.view.View ) v9 ).setPadding ( v1, v5, v2, v5 ); // invoke-virtual {v9, v1, v5, v2, v5}, Landroid/view/View;->setPadding(IIII)V
} // :cond_11
/* move/from16 v27, v5 */
/* .line 39 */
} // :goto_b
/* iget v1, v10, Landroidx/appcompat/widget/ActionMenuView$c;->d:I */
int v2 = 1; // const/4 v2, 0x1
/* add-int/2addr v1, v2 */
/* iput v1, v10, Landroidx/appcompat/widget/ActionMenuView$c;->d:I */
/* .line 40 */
/* iput-boolean v2, v10, Landroidx/appcompat/widget/ActionMenuView$c;->h:Z */
/* add-int/lit8 v7, v7, -0x1 */
} // :goto_c
/* add-int/lit8 v3, v3, 0x1 */
/* move v1, v11 */
/* move/from16 v2, v26 */
/* move/from16 v5, v27 */
} // :cond_12
/* move/from16 v10, v24 */
int v3 = 2; // const/4 v3, 0x2
int v9 = 1; // const/4 v9, 0x1
/* goto/16 :goto_7 */
} // :cond_13
/* move v11, v1 */
/* move/from16 v26, v2 */
/* move/from16 v25, v9 */
/* move/from16 v24, v10 */
} // :goto_d
int v1 = 1; // const/4 v1, 0x1
/* if-nez v13, :cond_14 */
/* if-ne v14, v1, :cond_14 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_14
int v2 = 0; // const/4 v2, 0x0
} // :goto_e
/* if-lez v7, :cond_20 */
/* const-wide/16 v9, 0x0 */
/* cmp-long v3, v17, v9 */
if ( v3 != null) { // if-eqz v3, :cond_20
/* sub-int/2addr v14, v1 */
/* if-lt v7, v14, :cond_15 */
/* if-nez v2, :cond_15 */
/* if-le v15, v1, :cond_20 */
/* .line 41 */
} // :cond_15
v1 = /* invoke-static/range {v17 ..v18}, Ljava/lang/Long;->bitCount(J)I */
/* int-to-float v1, v1 */
/* if-nez v2, :cond_17 */
/* const-wide/16 v2, 0x1 */
/* and-long v2, v17, v2 */
/* const/high16 v5, 0x3f000000 # 0.5f */
/* const-wide/16 v9, 0x0 */
/* cmp-long v12, v2, v9 */
int v14 = 0; // const/4 v14, 0x0
if ( v12 != null) { // if-eqz v12, :cond_16
/* .line 42 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v14 ); // invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroidx/appcompat/widget/ActionMenuView$c; */
/* .line 43 */
/* iget-boolean v2, v2, Landroidx/appcompat/widget/ActionMenuView$c;->g:Z */
/* if-nez v2, :cond_16 */
/* sub-float/2addr v1, v5 */
} // :cond_16
/* add-int/lit8 v2, v8, -0x1 */
int v3 = 1; // const/4 v3, 0x1
/* shl-int v9, v3, v2 */
/* int-to-long v9, v9 */
/* and-long v9, v17, v9 */
/* const-wide/16 v12, 0x0 */
/* cmp-long v3, v9, v12 */
if ( v3 != null) { // if-eqz v3, :cond_18
/* .line 44 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroidx/appcompat/widget/ActionMenuView$c; */
/* .line 45 */
/* iget-boolean v2, v2, Landroidx/appcompat/widget/ActionMenuView$c;->g:Z */
/* if-nez v2, :cond_18 */
/* sub-float/2addr v1, v5 */
} // :cond_17
int v14 = 0; // const/4 v14, 0x0
} // :cond_18
} // :goto_f
int v2 = 0; // const/4 v2, 0x0
/* cmpl-float v2, v1, v2 */
/* if-lez v2, :cond_19 */
/* mul-int v7, v7, v4 */
/* int-to-float v2, v7 */
/* div-float/2addr v2, v1 */
/* float-to-int v1, v2 */
} // :cond_19
int v1 = 0; // const/4 v1, 0x0
} // :goto_10
/* move/from16 v9, v25 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_11
/* if-ge v2, v8, :cond_21 */
int v3 = 1; // const/4 v3, 0x1
/* shl-int v5, v3, v2 */
/* int-to-long v12, v5 */
/* and-long v12, v17, v12 */
/* const-wide/16 v15, 0x0 */
/* cmp-long v3, v12, v15 */
/* if-nez v3, :cond_1a */
int v3 = 1; // const/4 v3, 0x1
int v7 = 2; // const/4 v7, 0x2
/* .line 46 */
} // :cond_1a
(( android.view.ViewGroup ) v0 ).getChildAt ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 47 */
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroidx/appcompat/widget/ActionMenuView$c; */
/* .line 48 */
/* instance-of v3, v3, Landroidx/appcompat/view/menu/ActionMenuItemView; */
if ( v3 != null) { // if-eqz v3, :cond_1c
/* .line 49 */
/* iput v1, v5, Landroidx/appcompat/widget/ActionMenuView$c;->e:I */
int v3 = 1; // const/4 v3, 0x1
/* .line 50 */
/* iput-boolean v3, v5, Landroidx/appcompat/widget/ActionMenuView$c;->h:Z */
/* if-nez v2, :cond_1b */
/* .line 51 */
/* iget-boolean v3, v5, Landroidx/appcompat/widget/ActionMenuView$c;->g:Z */
/* if-nez v3, :cond_1b */
/* neg-int v3, v1 */
int v7 = 2; // const/4 v7, 0x2
/* .line 52 */
/* div-int/2addr v3, v7 */
/* iput v3, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
} // :cond_1b
int v7 = 2; // const/4 v7, 0x2
} // :goto_12
int v3 = 1; // const/4 v3, 0x1
} // :cond_1c
int v7 = 2; // const/4 v7, 0x2
/* .line 53 */
/* iget-boolean v3, v5, Landroidx/appcompat/widget/ActionMenuView$c;->c:Z */
if ( v3 != null) { // if-eqz v3, :cond_1d
/* .line 54 */
/* iput v1, v5, Landroidx/appcompat/widget/ActionMenuView$c;->e:I */
int v3 = 1; // const/4 v3, 0x1
/* .line 55 */
/* iput-boolean v3, v5, Landroidx/appcompat/widget/ActionMenuView$c;->h:Z */
/* neg-int v9, v1 */
/* .line 56 */
/* div-int/2addr v9, v7 */
/* iput v9, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
} // :goto_13
int v9 = 1; // const/4 v9, 0x1
} // :cond_1d
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_1e
/* .line 57 */
/* div-int/lit8 v10, v1, 0x2 */
/* iput v10, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
} // :cond_1e
/* add-int/lit8 v10, v8, -0x1 */
/* if-eq v2, v10, :cond_1f */
/* .line 58 */
/* div-int/lit8 v10, v1, 0x2 */
/* iput v10, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
} // :cond_1f
} // :goto_14
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_20
int v14 = 0; // const/4 v14, 0x0
/* move/from16 v9, v25 */
} // :cond_21
/* const/high16 v1, 0x40000000 # 2.0f */
if ( v9 != null) { // if-eqz v9, :cond_23
int v9 = 0; // const/4 v9, 0x0
} // :goto_15
/* if-ge v9, v8, :cond_23 */
/* .line 59 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v9 ); // invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 60 */
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroidx/appcompat/widget/ActionMenuView$c; */
/* .line 61 */
/* iget-boolean v5, v3, Landroidx/appcompat/widget/ActionMenuView$c;->h:Z */
/* if-nez v5, :cond_22 */
/* .line 62 */
} // :cond_22
/* iget v5, v3, Landroidx/appcompat/widget/ActionMenuView$c;->d:I */
/* mul-int v5, v5, v4 */
/* iget v3, v3, Landroidx/appcompat/widget/ActionMenuView$c;->e:I */
/* add-int/2addr v5, v3 */
/* .line 63 */
v3 = android.view.View$MeasureSpec .makeMeasureSpec ( v5,v1 );
(( android.view.View ) v2 ).measure ( v3, v6 ); // invoke-virtual {v2, v3, v6}, Landroid/view/View;->measure(II)V
} // :goto_16
/* add-int/lit8 v9, v9, 0x1 */
} // :cond_23
/* if-eq v11, v1, :cond_24 */
/* move/from16 v3, v24 */
} // :cond_24
/* move/from16 v3, v19 */
} // :goto_17
/* move/from16 v2, v26 */
/* .line 64 */
(( android.view.ViewGroup ) v0 ).setMeasuredDimension ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V
return;
} // .end method
public Boolean f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.b.q.k ) v0 ).e ( ); // invoke-virtual {v0}, Lc/b/q/k;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.b.q.k ) v0 ).g ( ); // invoke-virtual {v0}, Lc/b/q/k;->g()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionMenuView ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->generateDefaultLayoutParams()Landroidx/appcompat/widget/ActionMenuView$c;
} // .end method
public androidx.appcompat.widget.ActionMenuView$c generateDefaultLayoutParams ( ) {
/* .locals 2 */
/* .line 3 */
/* new-instance v0, Landroidx/appcompat/widget/ActionMenuView$c; */
int v1 = -2; // const/4 v1, -0x2
/* invoke-direct {v0, v1, v1}, Landroidx/appcompat/widget/ActionMenuView$c;-><init>(II)V */
/* const/16 v1, 0x10 */
/* .line 4 */
/* iput v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat$a;->b:I */
} // .end method
public androidx.appcompat.widget.LinearLayoutCompat$a generateDefaultLayoutParams ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 2 */
(( androidx.appcompat.widget.ActionMenuView ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->generateDefaultLayoutParams()Landroidx/appcompat/widget/ActionMenuView$c;
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( androidx.appcompat.widget.ActionMenuView ) p0 ).generateLayoutParams ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionMenuView;->generateLayoutParams(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/ActionMenuView$c;
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
(( androidx.appcompat.widget.ActionMenuView ) p0 ).generateLayoutParams ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionMenuView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$c;
} // .end method
public androidx.appcompat.widget.ActionMenuView$c generateLayoutParams ( android.util.AttributeSet p0 ) {
/* .locals 2 */
/* .line 5 */
/* new-instance v0, Landroidx/appcompat/widget/ActionMenuView$c; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroidx/appcompat/widget/ActionMenuView$c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public androidx.appcompat.widget.ActionMenuView$c generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 6 */
/* instance-of v0, p1, Landroidx/appcompat/widget/ActionMenuView$c; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Landroidx/appcompat/widget/ActionMenuView$c; */
/* check-cast p1, Landroidx/appcompat/widget/ActionMenuView$c; */
/* invoke-direct {v0, p1}, Landroidx/appcompat/widget/ActionMenuView$c;-><init>(Landroidx/appcompat/widget/ActionMenuView$c;)V */
} // :cond_0
/* new-instance v0, Landroidx/appcompat/widget/ActionMenuView$c; */
/* invoke-direct {v0, p1}, Landroidx/appcompat/widget/ActionMenuView$c;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
/* .line 7 */
} // :goto_0
/* iget p1, v0, Landroidx/appcompat/widget/LinearLayoutCompat$a;->b:I */
/* if-gtz p1, :cond_1 */
/* const/16 p1, 0x10 */
/* .line 8 */
/* iput p1, v0, Landroidx/appcompat/widget/LinearLayoutCompat$a;->b:I */
} // :cond_1
/* .line 9 */
} // :cond_2
(( androidx.appcompat.widget.ActionMenuView ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->generateDefaultLayoutParams()Landroidx/appcompat/widget/ActionMenuView$c;
} // .end method
public androidx.appcompat.widget.LinearLayoutCompat$a generateLayoutParams ( android.util.AttributeSet p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 3 */
(( androidx.appcompat.widget.ActionMenuView ) p0 ).generateLayoutParams ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionMenuView;->generateLayoutParams(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/ActionMenuView$c;
} // .end method
public androidx.appcompat.widget.LinearLayoutCompat$a generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 4 */
(( androidx.appcompat.widget.ActionMenuView ) p0 ).generateLayoutParams ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionMenuView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$c;
} // .end method
public android.view.Menu getMenu ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.q;
/* if-nez v0, :cond_1 */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* .line 3 */
/* new-instance v1, Lc/b/p/o/m; */
/* invoke-direct {v1, v0}, Lc/b/p/o/m;-><init>(Landroid/content/Context;)V */
this.q = v1;
/* .line 4 */
/* new-instance v2, Landroidx/appcompat/widget/ActionMenuView$d; */
/* invoke-direct {v2, p0}, Landroidx/appcompat/widget/ActionMenuView$d;-><init>(Landroidx/appcompat/widget/ActionMenuView;)V */
(( c.b.p.o.m ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lc/b/p/o/m;->a(Lc/b/p/o/m$a;)V
/* .line 5 */
/* new-instance v1, Lc/b/q/k; */
/* invoke-direct {v1, v0}, Lc/b/q/k;-><init>(Landroid/content/Context;)V */
this.u = v1;
int v0 = 1; // const/4 v0, 0x1
/* .line 6 */
(( c.b.q.k ) v1 ).c ( v0 ); // invoke-virtual {v1, v0}, Lc/b/q/k;->c(Z)V
/* .line 7 */
v0 = this.u;
v1 = this.v;
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
/* new-instance v1, Landroidx/appcompat/widget/ActionMenuView$b; */
/* invoke-direct {v1}, Landroidx/appcompat/widget/ActionMenuView$b;-><init>()V */
} // :goto_0
(( c.b.p.o.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/p/o/b;->a(Lc/b/p/o/z$a;)V
/* .line 8 */
v0 = this.q;
v1 = this.u;
v2 = this.r;
(( c.b.p.o.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/b/p/o/m;->a(Lc/b/p/o/z;Landroid/content/Context;)V
/* .line 9 */
v0 = this.u;
(( c.b.q.k ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/b/q/k;->a(Landroidx/appcompat/widget/ActionMenuView;)V
/* .line 10 */
} // :cond_1
v0 = this.q;
} // .end method
public android.graphics.drawable.Drawable getOverflowIcon ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionMenuView ) p0 ).getMenu ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getMenu()Landroid/view/Menu;
/* .line 2 */
v0 = this.u;
(( c.b.q.k ) v0 ).d ( ); // invoke-virtual {v0}, Lc/b/q/k;->d()Landroid/graphics/drawable/Drawable;
} // .end method
public Integer getPopupTheme ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/ActionMenuView;->s:I */
} // .end method
public Integer getWindowAnimations ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean h ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.b.q.k ) v0 ).h ( ); // invoke-virtual {v0}, Lc/b/q/k;->h()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean i ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuView;->t:Z */
} // .end method
public c.b.p.o.m j ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.q;
} // .end method
public Boolean k ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.b.q.k ) v0 ).i ( ); // invoke-virtual {v0}, Lc/b/q/k;->i()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
/* .line 2 */
p1 = this.u;
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( c.b.q.k ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/b/q/k;->a(Z)V
/* .line 4 */
p1 = this.u;
p1 = (( c.b.q.k ) p1 ).h ( ); // invoke-virtual {p1}, Lc/b/q/k;->h()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 5 */
p1 = this.u;
(( c.b.q.k ) p1 ).e ( ); // invoke-virtual {p1}, Lc/b/q/k;->e()Z
/* .line 6 */
p1 = this.u;
(( c.b.q.k ) p1 ).i ( ); // invoke-virtual {p1}, Lc/b/q/k;->i()Z
} // :cond_0
return;
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
/* .line 2 */
(( androidx.appcompat.widget.ActionMenuView ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->d()V
return;
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 17 */
/* move-object/from16 v0, p0 */
/* .line 1 */
/* iget-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuView;->x:Z */
/* if-nez v1, :cond_0 */
/* .line 2 */
/* invoke-super/range {p0 ..p5}, Landroidx/appcompat/widget/LinearLayoutCompat;->onLayout(ZIIII)V */
return;
/* .line 3 */
} // :cond_0
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getChildCount()I */
/* sub-int v2, p5, p3 */
/* .line 4 */
/* div-int/lit8 v2, v2, 0x2 */
/* .line 5 */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getDividerWidth()I */
/* sub-int v4, p4, p2 */
/* .line 6 */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* sub-int v5, v4, v5 */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
/* sub-int/2addr v5, v6 */
/* .line 7 */
v6 = /* invoke-static/range {p0 ..p0}, Lc/b/q/v2;->a(Landroid/view/View;)Z */
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
} // :goto_0
/* const/16 v11, 0x8 */
int v12 = 1; // const/4 v12, 0x1
/* if-ge v8, v1, :cond_5 */
/* .line 8 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v8 ); // invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 9 */
v14 = (( android.view.View ) v13 ).getVisibility ( ); // invoke-virtual {v13}, Landroid/view/View;->getVisibility()I
/* if-ne v14, v11, :cond_1 */
/* .line 10 */
} // :cond_1
(( android.view.View ) v13 ).getLayoutParams ( ); // invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v11, Landroidx/appcompat/widget/ActionMenuView$c; */
/* .line 11 */
/* iget-boolean v14, v11, Landroidx/appcompat/widget/ActionMenuView$c;->c:Z */
if ( v14 != null) { // if-eqz v14, :cond_4
/* .line 12 */
v9 = (( android.view.View ) v13 ).getMeasuredWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
/* .line 13 */
v14 = (( androidx.appcompat.widget.ActionMenuView ) v0 ).d ( v8 ); // invoke-virtual {v0, v8}, Landroidx/appcompat/widget/ActionMenuView;->d(I)Z
if ( v14 != null) { // if-eqz v14, :cond_2
/* add-int/2addr v9, v3 */
/* .line 14 */
} // :cond_2
v14 = (( android.view.View ) v13 ).getMeasuredHeight ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 15 */
v15 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
/* iget v11, v11, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v15, v11 */
/* add-int v11, v15, v9 */
/* .line 16 */
} // :cond_3
v15 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getWidth()I */
v16 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* sub-int v15, v15, v16 */
/* iget v11, v11, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* sub-int v11, v15, v11 */
/* sub-int v15, v11, v9 */
/* .line 17 */
} // :goto_1
/* div-int/lit8 v16, v14, 0x2 */
/* sub-int v7, v2, v16 */
/* add-int/2addr v14, v7 */
/* .line 18 */
(( android.view.View ) v13 ).layout ( v15, v7, v11, v14 ); // invoke-virtual {v13, v15, v7, v11, v14}, Landroid/view/View;->layout(IIII)V
/* sub-int/2addr v5, v9 */
int v9 = 1; // const/4 v9, 0x1
/* .line 19 */
} // :cond_4
v7 = (( android.view.View ) v13 ).getMeasuredWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
/* iget v12, v11, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v7, v12 */
/* iget v11, v11, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v7, v11 */
/* sub-int/2addr v5, v7 */
/* .line 20 */
v7 = (( androidx.appcompat.widget.ActionMenuView ) v0 ).d ( v8 ); // invoke-virtual {v0, v8}, Landroidx/appcompat/widget/ActionMenuView;->d(I)Z
/* add-int/lit8 v10, v10, 0x1 */
} // :goto_2
/* add-int/lit8 v8, v8, 0x1 */
} // :cond_5
/* if-ne v1, v12, :cond_6 */
/* if-nez v9, :cond_6 */
int v3 = 0; // const/4 v3, 0x0
/* .line 21 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v3 ); // invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 22 */
v3 = (( android.view.View ) v1 ).getMeasuredWidth ( ); // invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I
/* .line 23 */
v5 = (( android.view.View ) v1 ).getMeasuredHeight ( ); // invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I
/* .line 24 */
/* div-int/lit8 v4, v4, 0x2 */
/* .line 25 */
/* div-int/lit8 v6, v3, 0x2 */
/* sub-int/2addr v4, v6 */
/* .line 26 */
/* div-int/lit8 v6, v5, 0x2 */
/* sub-int/2addr v2, v6 */
/* add-int/2addr v3, v4 */
/* add-int/2addr v5, v2 */
/* .line 27 */
(( android.view.View ) v1 ).layout ( v4, v2, v3, v5 ); // invoke-virtual {v1, v4, v2, v3, v5}, Landroid/view/View;->layout(IIII)V
return;
} // :cond_6
/* xor-int/lit8 v3, v9, 0x1 */
/* sub-int/2addr v10, v3 */
/* if-lez v10, :cond_7 */
/* .line 28 */
/* div-int v3, v5, v10 */
} // :cond_7
int v3 = 0; // const/4 v3, 0x0
} // :goto_3
int v4 = 0; // const/4 v4, 0x0
v3 = java.lang.Math .max ( v4,v3 );
if ( v6 != null) { // if-eqz v6, :cond_a
/* .line 29 */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getWidth()I */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* sub-int/2addr v5, v6 */
int v7 = 0; // const/4 v7, 0x0
} // :goto_4
/* if-ge v7, v1, :cond_d */
/* .line 30 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v7 ); // invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 31 */
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v6, Landroidx/appcompat/widget/ActionMenuView$c; */
/* .line 32 */
v8 = (( android.view.View ) v4 ).getVisibility ( ); // invoke-virtual {v4}, Landroid/view/View;->getVisibility()I
/* if-eq v8, v11, :cond_9 */
/* iget-boolean v8, v6, Landroidx/appcompat/widget/ActionMenuView$c;->c:Z */
if ( v8 != null) { // if-eqz v8, :cond_8
/* .line 33 */
} // :cond_8
/* iget v8, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* sub-int/2addr v5, v8 */
/* .line 34 */
v8 = (( android.view.View ) v4 ).getMeasuredWidth ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I
/* .line 35 */
v9 = (( android.view.View ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I
/* .line 36 */
/* div-int/lit8 v10, v9, 0x2 */
/* sub-int v10, v2, v10 */
/* sub-int v12, v5, v8 */
/* add-int/2addr v9, v10 */
/* .line 37 */
(( android.view.View ) v4 ).layout ( v12, v10, v5, v9 ); // invoke-virtual {v4, v12, v10, v5, v9}, Landroid/view/View;->layout(IIII)V
/* .line 38 */
/* iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v8, v4 */
/* add-int/2addr v8, v3 */
/* sub-int/2addr v5, v8 */
} // :cond_9
} // :goto_5
/* add-int/lit8 v7, v7, 0x1 */
/* .line 39 */
} // :cond_a
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
int v7 = 0; // const/4 v7, 0x0
} // :goto_6
/* if-ge v7, v1, :cond_d */
/* .line 40 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v7 ); // invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 41 */
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v6, Landroidx/appcompat/widget/ActionMenuView$c; */
/* .line 42 */
v8 = (( android.view.View ) v4 ).getVisibility ( ); // invoke-virtual {v4}, Landroid/view/View;->getVisibility()I
/* if-eq v8, v11, :cond_c */
/* iget-boolean v8, v6, Landroidx/appcompat/widget/ActionMenuView$c;->c:Z */
if ( v8 != null) { // if-eqz v8, :cond_b
/* .line 43 */
} // :cond_b
/* iget v8, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v5, v8 */
/* .line 44 */
v8 = (( android.view.View ) v4 ).getMeasuredWidth ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I
/* .line 45 */
v9 = (( android.view.View ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I
/* .line 46 */
/* div-int/lit8 v10, v9, 0x2 */
/* sub-int v10, v2, v10 */
/* add-int v12, v5, v8 */
/* add-int/2addr v9, v10 */
/* .line 47 */
(( android.view.View ) v4 ).layout ( v5, v10, v12, v9 ); // invoke-virtual {v4, v5, v10, v12, v9}, Landroid/view/View;->layout(IIII)V
/* .line 48 */
/* iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v8, v4 */
/* add-int/2addr v8, v3 */
/* add-int/2addr v5, v8 */
} // :cond_c
} // :goto_7
/* add-int/lit8 v7, v7, 0x1 */
} // :cond_d
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 5 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuView;->x:Z */
/* .line 2 */
v1 = android.view.View$MeasureSpec .getMode ( p1 );
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
/* const/high16 v4, 0x40000000 # 2.0f */
/* if-ne v1, v4, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* iput-boolean v1, p0, Landroidx/appcompat/widget/ActionMenuView;->x:Z */
/* if-eq v0, v1, :cond_1 */
/* .line 3 */
/* iput v3, p0, Landroidx/appcompat/widget/ActionMenuView;->y:I */
/* .line 4 */
} // :cond_1
v0 = android.view.View$MeasureSpec .getSize ( p1 );
/* .line 5 */
/* iget-boolean v1, p0, Landroidx/appcompat/widget/ActionMenuView;->x:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = this.q;
if ( v1 != null) { // if-eqz v1, :cond_2
/* iget v4, p0, Landroidx/appcompat/widget/ActionMenuView;->y:I */
/* if-eq v0, v4, :cond_2 */
/* .line 6 */
/* iput v0, p0, Landroidx/appcompat/widget/ActionMenuView;->y:I */
/* .line 7 */
(( c.b.p.o.m ) v1 ).c ( v2 ); // invoke-virtual {v1, v2}, Lc/b/p/o/m;->c(Z)V
/* .line 8 */
} // :cond_2
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* .line 9 */
/* iget-boolean v1, p0, Landroidx/appcompat/widget/ActionMenuView;->x:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
/* if-lez v0, :cond_3 */
/* .line 10 */
(( androidx.appcompat.widget.ActionMenuView ) p0 ).e ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/ActionMenuView;->e(II)V
} // :cond_3
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
/* if-ge v1, v0, :cond_4 */
/* .line 11 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 12 */
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroidx/appcompat/widget/ActionMenuView$c; */
/* .line 13 */
/* iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 14 */
} // :cond_4
/* invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V */
} // :goto_2
return;
} // .end method
public void setExpandedActionViewsExclusive ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
(( c.b.q.k ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/k;->b(Z)V
return;
} // .end method
public void setOnMenuItemClickListener ( androidx.appcompat.widget.ActionMenuView$e p0 ) {
/* .locals 0 */
/* .line 1 */
this.B = p1;
return;
} // .end method
public void setOverflowIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionMenuView ) p0 ).getMenu ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getMenu()Landroid/view/Menu;
/* .line 2 */
v0 = this.u;
(( c.b.q.k ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/k;->a(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setOverflowReserved ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/ActionMenuView;->t:Z */
return;
} // .end method
public void setPopupTheme ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/ActionMenuView;->s:I */
/* if-eq v0, p1, :cond_1 */
/* .line 2 */
/* iput p1, p0, Landroidx/appcompat/widget/ActionMenuView;->s:I */
/* if-nez p1, :cond_0 */
/* .line 3 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
this.r = p1;
/* .line 4 */
} // :cond_0
/* new-instance v0, Landroid/view/ContextThemeWrapper; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V */
this.r = v0;
} // :cond_1
} // :goto_0
return;
} // .end method
public void setPresenter ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
this.u = p1;
/* .line 2 */
(( c.b.q.k ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lc/b/q/k;->a(Landroidx/appcompat/widget/ActionMenuView;)V
return;
} // .end method
