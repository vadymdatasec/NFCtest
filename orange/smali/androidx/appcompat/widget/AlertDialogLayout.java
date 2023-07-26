public class androidx.appcompat.widget.AlertDialogLayout extends androidx.appcompat.widget.LinearLayoutCompat {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public androidx.appcompat.widget.AlertDialogLayout ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;)V */
		 return;
	 } // .end method
	 public androidx.appcompat.widget.AlertDialogLayout ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 private void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
		 /* .locals 0 */
		 /* add-int/2addr p4, p2 */
		 /* add-int/2addr p5, p3 */
		 /* .line 1 */
		 (( android.view.View ) p1 ).layout ( p2, p3, p4, p5 ); // invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V
		 return;
	 } // .end method
	 private void b ( Integer p0, Integer p1 ) {
		 /* .locals 10 */
		 /* .line 1 */
		 v0 = 		 (( android.view.ViewGroup ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I
		 /* const/high16 v1, 0x40000000 # 2.0f */
		 /* .line 2 */
		 v0 = 		 android.view.View$MeasureSpec .makeMeasureSpec ( v0,v1 );
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 /* if-ge v1, p1, :cond_1 */
	 /* .line 3 */
	 (( android.view.ViewGroup ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
	 /* .line 4 */
	 v2 = 	 (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
	 /* const/16 v4, 0x8 */
	 /* if-eq v2, v4, :cond_0 */
	 /* .line 5 */
	 (( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
	 /* move-object v8, v2 */
	 /* check-cast v8, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
	 /* .line 6 */
	 /* iget v2, v8, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
	 int v4 = -1; // const/4 v4, -0x1
	 /* if-ne v2, v4, :cond_0 */
	 /* .line 7 */
	 /* iget v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
	 /* .line 8 */
	 v2 = 	 (( android.view.View ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
	 /* iput v2, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
	 int v5 = 0; // const/4 v5, 0x0
	 int v7 = 0; // const/4 v7, 0x0
	 /* move-object v2, p0 */
	 /* move v4, v0 */
	 /* move v6, p2 */
	 /* .line 9 */
	 /* invoke-virtual/range {v2 ..v7}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V */
	 /* .line 10 */
	 /* iput v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public static Integer c ( android.view.View p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = c.h.n.v0 .p ( p0 );
/* if-lez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* instance-of v0, p0, Landroid/view/ViewGroup; */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
/* check-cast p0, Landroid/view/ViewGroup; */
/* .line 4 */
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_1 */
/* .line 5 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
p0 = androidx.appcompat.widget.AlertDialogLayout .c ( p0 );
} // :cond_1
} // .end method
/* # virtual methods */
public final Boolean e ( Integer p0, Integer p1 ) {
/* .locals 16 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, p1 */
/* move/from16 v2, p2 */
/* .line 1 */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getChildCount()I */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* move-object v6, v4 */
/* move-object v7, v6 */
int v8 = 0; // const/4 v8, 0x0
} // :goto_0
/* const/16 v9, 0x8 */
/* if-ge v8, v3, :cond_6 */
/* .line 2 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v8 ); // invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 3 */
v11 = (( android.view.View ) v10 ).getVisibility ( ); // invoke-virtual {v10}, Landroid/view/View;->getVisibility()I
/* if-ne v11, v9, :cond_0 */
/* .line 4 */
} // :cond_0
v9 = (( android.view.View ) v10 ).getId ( ); // invoke-virtual {v10}, Landroid/view/View;->getId()I
/* .line 5 */
/* if-ne v9, v11, :cond_1 */
/* move-object v4, v10 */
/* .line 6 */
} // :cond_1
/* if-ne v9, v11, :cond_2 */
/* move-object v6, v10 */
/* .line 7 */
} // :cond_2
/* if-eq v9, v11, :cond_4 */
/* if-ne v9, v11, :cond_3 */
} // :cond_3
} // :cond_4
} // :goto_1
if ( v7 != null) { // if-eqz v7, :cond_5
} // :cond_5
/* move-object v7, v10 */
} // :goto_2
/* add-int/lit8 v8, v8, 0x1 */
/* .line 8 */
} // :cond_6
v8 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getMode(I)I */
/* .line 9 */
v10 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getSize(I)I */
/* .line 10 */
v11 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getMode(I)I */
/* .line 11 */
v12 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
v13 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingBottom()I */
/* add-int/2addr v12, v13 */
if ( v4 != null) { // if-eqz v4, :cond_7
/* .line 12 */
(( android.view.View ) v4 ).measure ( v1, v5 ); // invoke-virtual {v4, v1, v5}, Landroid/view/View;->measure(II)V
/* .line 13 */
v13 = (( android.view.View ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v12, v13 */
/* .line 14 */
v4 = (( android.view.View ) v4 ).getMeasuredState ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredState()I
v4 = android.view.View .combineMeasuredStates ( v5,v4 );
} // :cond_7
int v4 = 0; // const/4 v4, 0x0
} // :goto_3
if ( v6 != null) { // if-eqz v6, :cond_8
/* .line 15 */
(( android.view.View ) v6 ).measure ( v1, v5 ); // invoke-virtual {v6, v1, v5}, Landroid/view/View;->measure(II)V
/* .line 16 */
v13 = androidx.appcompat.widget.AlertDialogLayout .c ( v6 );
/* .line 17 */
v14 = (( android.view.View ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I
/* sub-int/2addr v14, v13 */
/* add-int/2addr v12, v13 */
/* .line 18 */
v15 = (( android.view.View ) v6 ).getMeasuredState ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredState()I
v4 = android.view.View .combineMeasuredStates ( v4,v15 );
} // :cond_8
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
} // :goto_4
if ( v7 != null) { // if-eqz v7, :cond_a
/* if-nez v8, :cond_9 */
int v15 = 0; // const/4 v15, 0x0
} // :cond_9
/* sub-int v15, v10, v12 */
/* .line 19 */
v15 = java.lang.Math .max ( v5,v15 );
/* .line 20 */
v15 = android.view.View$MeasureSpec .makeMeasureSpec ( v15,v8 );
/* .line 21 */
} // :goto_5
(( android.view.View ) v7 ).measure ( v1, v15 ); // invoke-virtual {v7, v1, v15}, Landroid/view/View;->measure(II)V
/* .line 22 */
v15 = (( android.view.View ) v7 ).getMeasuredHeight ( ); // invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v12, v15 */
/* .line 23 */
v5 = (( android.view.View ) v7 ).getMeasuredState ( ); // invoke-virtual {v7}, Landroid/view/View;->getMeasuredState()I
v4 = android.view.View .combineMeasuredStates ( v4,v5 );
} // :cond_a
int v15 = 0; // const/4 v15, 0x0
} // :goto_6
/* sub-int/2addr v10, v12 */
/* const/high16 v5, 0x40000000 # 2.0f */
if ( v6 != null) { // if-eqz v6, :cond_c
/* sub-int/2addr v12, v13 */
/* .line 24 */
v14 = java.lang.Math .min ( v10,v14 );
/* if-lez v14, :cond_b */
/* sub-int/2addr v10, v14 */
/* add-int/2addr v13, v14 */
/* .line 25 */
} // :cond_b
v13 = android.view.View$MeasureSpec .makeMeasureSpec ( v13,v5 );
/* .line 26 */
(( android.view.View ) v6 ).measure ( v1, v13 ); // invoke-virtual {v6, v1, v13}, Landroid/view/View;->measure(II)V
/* .line 27 */
v13 = (( android.view.View ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v12, v13 */
/* .line 28 */
v6 = (( android.view.View ) v6 ).getMeasuredState ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredState()I
v4 = android.view.View .combineMeasuredStates ( v4,v6 );
} // :cond_c
if ( v7 != null) { // if-eqz v7, :cond_d
/* if-lez v10, :cond_d */
/* sub-int/2addr v12, v15 */
/* add-int/2addr v15, v10 */
/* .line 29 */
v6 = android.view.View$MeasureSpec .makeMeasureSpec ( v15,v8 );
/* .line 30 */
(( android.view.View ) v7 ).measure ( v1, v6 ); // invoke-virtual {v7, v1, v6}, Landroid/view/View;->measure(II)V
/* .line 31 */
v6 = (( android.view.View ) v7 ).getMeasuredHeight ( ); // invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v12, v6 */
/* .line 32 */
v6 = (( android.view.View ) v7 ).getMeasuredState ( ); // invoke-virtual {v7}, Landroid/view/View;->getMeasuredState()I
v4 = android.view.View .combineMeasuredStates ( v4,v6 );
} // :cond_d
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
} // :goto_7
/* if-ge v6, v3, :cond_f */
/* .line 33 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v6 ); // invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 34 */
v10 = (( android.view.View ) v8 ).getVisibility ( ); // invoke-virtual {v8}, Landroid/view/View;->getVisibility()I
/* if-eq v10, v9, :cond_e */
/* .line 35 */
v8 = (( android.view.View ) v8 ).getMeasuredWidth ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
v7 = java.lang.Math .max ( v7,v8 );
} // :cond_e
/* add-int/lit8 v6, v6, 0x1 */
/* .line 36 */
} // :cond_f
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
v8 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* add-int/2addr v6, v8 */
/* add-int/2addr v7, v6 */
/* .line 37 */
v1 = android.view.View .resolveSizeAndState ( v7,v1,v4 );
int v4 = 0; // const/4 v4, 0x0
/* .line 38 */
v4 = android.view.View .resolveSizeAndState ( v12,v2,v4 );
/* .line 39 */
(( android.view.ViewGroup ) v0 ).setMeasuredDimension ( v1, v4 ); // invoke-virtual {v0, v1, v4}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V
/* if-eq v11, v5, :cond_10 */
/* .line 40 */
/* invoke-direct {v0, v3, v2}, Landroidx/appcompat/widget/AlertDialogLayout;->b(II)V */
} // :cond_10
int v1 = 1; // const/4 v1, 0x1
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 17 */
/* move-object/from16 v6, p0 */
/* .line 1 */
v7 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
/* sub-int v0, p4, p2 */
/* .line 2 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* sub-int v8, v0, v1 */
/* sub-int/2addr v0, v7 */
/* .line 3 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* sub-int v9, v0, v1 */
/* .line 4 */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I */
/* .line 5 */
v10 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getChildCount()I */
/* .line 6 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getGravity()I */
/* and-int/lit8 v2, v1, 0x70 */
/* const v3, 0x800007 */
/* and-int v11, v1, v3 */
/* const/16 v1, 0x10 */
/* if-eq v2, v1, :cond_1 */
/* const/16 v1, 0x50 */
/* if-eq v2, v1, :cond_0 */
/* .line 7 */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
/* .line 8 */
} // :cond_0
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
/* add-int v1, v1, p5 */
/* sub-int v1, v1, p3 */
/* sub-int v0, v1, v0 */
/* .line 9 */
} // :cond_1
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
/* sub-int v2, p5, p3 */
/* sub-int/2addr v2, v0 */
/* div-int/lit8 v2, v2, 0x2 */
/* add-int v0, v1, v2 */
/* .line 10 */
} // :goto_0
/* invoke-virtual/range {p0 ..p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getDividerDrawable()Landroid/graphics/drawable/Drawable; */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_2 */
int v12 = 0; // const/4 v12, 0x0
/* .line 11 */
} // :cond_2
v1 = (( android.graphics.drawable.Drawable ) v1 ).getIntrinsicHeight ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* move v12, v1 */
} // :goto_1
int v13 = 0; // const/4 v13, 0x0
} // :goto_2
/* if-ge v13, v10, :cond_8 */
/* .line 12 */
(( android.view.ViewGroup ) v6 ).getChildAt ( v13 ); // invoke-virtual {v6, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 13 */
v2 = (( android.view.View ) v1 ).getVisibility ( ); // invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
/* const/16 v3, 0x8 */
/* if-eq v2, v3, :cond_7 */
/* .line 14 */
v4 = (( android.view.View ) v1 ).getMeasuredWidth ( ); // invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I
/* .line 15 */
v14 = (( android.view.View ) v1 ).getMeasuredHeight ( ); // invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I
/* .line 16 */
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v15, v2 */
/* check-cast v15, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
/* .line 17 */
/* iget v2, v15, Landroidx/appcompat/widget/LinearLayoutCompat$a;->b:I */
/* if-gez v2, :cond_3 */
/* move v2, v11 */
/* .line 18 */
} // :cond_3
v3 = /* invoke-static/range {p0 ..p0}, Lc/h/n/v0;->o(Landroid/view/View;)I */
/* .line 19 */
v2 = c.h.n.i .a ( v2,v3 );
/* and-int/lit8 v2, v2, 0x7 */
int v3 = 1; // const/4 v3, 0x1
/* if-eq v2, v3, :cond_5 */
int v3 = 5; // const/4 v3, 0x5
/* if-eq v2, v3, :cond_4 */
/* .line 20 */
/* iget v2, v15, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v2, v7 */
} // :cond_4
/* sub-int v2, v8, v4 */
/* .line 21 */
/* iget v3, v15, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
} // :cond_5
/* sub-int v2, v9, v4 */
/* .line 22 */
/* div-int/lit8 v2, v2, 0x2 */
/* add-int/2addr v2, v7 */
/* iget v3, v15, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v2, v3 */
/* iget v3, v15, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
} // :goto_3
/* sub-int/2addr v2, v3 */
/* .line 23 */
} // :goto_4
v3 = (( androidx.appcompat.widget.LinearLayoutCompat ) v6 ).b ( v13 ); // invoke-virtual {v6, v13}, Landroidx/appcompat/widget/LinearLayoutCompat;->b(I)Z
if ( v3 != null) { // if-eqz v3, :cond_6
/* add-int/2addr v0, v12 */
/* .line 24 */
} // :cond_6
/* iget v3, v15, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int v16, v0, v3 */
/* move-object/from16 v0, p0 */
/* move/from16 v3, v16 */
/* move v5, v14 */
/* .line 25 */
/* invoke-direct/range {v0 ..v5}, Landroidx/appcompat/widget/AlertDialogLayout;->a(Landroid/view/View;IIII)V */
/* .line 26 */
/* iget v0, v15, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v14, v0 */
/* add-int v16, v16, v14 */
/* move/from16 v0, v16 */
} // :cond_7
/* add-int/lit8 v13, v13, 0x1 */
} // :cond_8
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( androidx.appcompat.widget.AlertDialogLayout ) p0 ).e ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/AlertDialogLayout;->e(II)Z
/* if-nez v0, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V */
} // :cond_0
return;
} // .end method
