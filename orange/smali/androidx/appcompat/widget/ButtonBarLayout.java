public class androidx.appcompat.widget.ButtonBarLayout extends android.widget.LinearLayout {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean b;
	 public Integer c;
	 public Integer d;
	 /* # direct methods */
	 public androidx.appcompat.widget.ButtonBarLayout ( ) {
		 /* .locals 8 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 2 */
		 /* iput v0, p0, Landroidx/appcompat/widget/ButtonBarLayout;->c:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput v0, p0, Landroidx/appcompat/widget/ButtonBarLayout;->d:I */
		 /* .line 4 */
		 v0 = c.b.j.ButtonBarLayout;
		 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
		 /* .line 5 */
		 /* const/16 v2, 0x1d */
		 /* if-lt v1, v2, :cond_0 */
		 /* .line 6 */
		 v3 = c.b.j.ButtonBarLayout;
		 int v6 = 0; // const/4 v6, 0x0
		 int v7 = 0; // const/4 v7, 0x0
		 /* move-object v1, p0 */
		 /* move-object v2, p1 */
		 /* move-object v4, p2 */
		 /* move-object v5, v0 */
		 /* invoke-virtual/range {v1 ..v7}, Landroid/widget/LinearLayout;->saveAttributeDataForStyleable(Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V */
		 /* .line 7 */
	 } // :cond_0
	 int p2 = 1; // const/4 p2, 0x1
	 p1 = 	 (( android.content.res.TypedArray ) v0 ).getBoolean ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
	 /* iput-boolean p1, p0, Landroidx/appcompat/widget/ButtonBarLayout;->b:Z */
	 /* .line 8 */
	 (( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
	 return;
} // .end method
private void setStacked ( Boolean p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 (( android.widget.LinearLayout ) p0 ).setOrientation ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 int v0 = 5; // const/4 v0, 0x5
	 } // :cond_0
	 /* const/16 v0, 0x50 */
	 /* .line 2 */
} // :goto_0
(( android.widget.LinearLayout ) p0 ).setGravity ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setGravity(I)V
/* .line 3 */
(( android.widget.LinearLayout ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_2
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 /* const/16 p1, 0x8 */
	 } // :cond_1
	 int p1 = 4; // const/4 p1, 0x4
	 /* .line 4 */
} // :goto_1
(( android.view.View ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V
/* .line 5 */
} // :cond_2
p1 = (( android.widget.LinearLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I
/* add-int/lit8 p1, p1, -0x2 */
} // :goto_2
/* if-ltz p1, :cond_3 */
/* .line 6 */
(( android.widget.LinearLayout ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
(( android.widget.LinearLayout ) p0 ).bringChildToFront ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->bringChildToFront(Landroid/view/View;)V
/* add-int/lit8 p1, p1, -0x1 */
} // :cond_3
return;
} // .end method
/* # virtual methods */
public final Integer a ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( android.widget.LinearLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I
} // :goto_0
/* if-ge p1, v0, :cond_1 */
/* .line 2 */
(( android.widget.LinearLayout ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
v1 = (( android.view.View ) v1 ).getVisibility ( ); // invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
/* if-nez v1, :cond_0 */
} // :cond_0
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_1
int p1 = -1; // const/4 p1, -0x1
} // .end method
public final Boolean a ( ) {
/* .locals 2 */
/* .line 3 */
v0 = (( android.widget.LinearLayout ) p0 ).getOrientation ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getOrientation()I
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public Integer getMinimumHeight ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/ButtonBarLayout;->d:I */
v1 = /* invoke-super {p0}, Landroid/widget/LinearLayout;->getMinimumHeight()I */
v0 = java.lang.Math .max ( v0,v1 );
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 5 */
/* .line 1 */
v0 = android.view.View$MeasureSpec .getSize ( p1 );
/* .line 2 */
/* iget-boolean v1, p0, Landroidx/appcompat/widget/ButtonBarLayout;->b:Z */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 3 */
/* iget v1, p0, Landroidx/appcompat/widget/ButtonBarLayout;->c:I */
/* if-le v0, v1, :cond_0 */
v1 = (( androidx.appcompat.widget.ButtonBarLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ButtonBarLayout;->a()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
/* invoke-direct {p0, v2}, Landroidx/appcompat/widget/ButtonBarLayout;->setStacked(Z)V */
/* .line 5 */
} // :cond_0
/* iput v0, p0, Landroidx/appcompat/widget/ButtonBarLayout;->c:I */
/* .line 6 */
} // :cond_1
v1 = (( androidx.appcompat.widget.ButtonBarLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ButtonBarLayout;->a()Z
int v3 = 1; // const/4 v3, 0x1
/* if-nez v1, :cond_2 */
v1 = android.view.View$MeasureSpec .getMode ( p1 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* if-ne v1, v4, :cond_2 */
/* const/high16 v1, -0x80000000 */
/* .line 7 */
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v0,v1 );
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
/* move v0, p1 */
int v1 = 0; // const/4 v1, 0x0
/* .line 8 */
} // :goto_0
/* invoke-super {p0, v0, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V */
/* .line 9 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/ButtonBarLayout;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = (( androidx.appcompat.widget.ButtonBarLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ButtonBarLayout;->a()Z
/* if-nez v0, :cond_4 */
/* .line 10 */
v0 = (( android.widget.LinearLayout ) p0 ).getMeasuredWidthAndState ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getMeasuredWidthAndState()I
/* const/high16 v4, -0x1000000 */
/* and-int/2addr v0, v4 */
/* const/high16 v4, 0x1000000 */
/* if-ne v0, v4, :cond_3 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 11 */
/* invoke-direct {p0, v3}, Landroidx/appcompat/widget/ButtonBarLayout;->setStacked(Z)V */
int v1 = 1; // const/4 v1, 0x1
} // :cond_4
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 12 */
/* invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V */
/* .line 13 */
} // :cond_5
p1 = (( androidx.appcompat.widget.ButtonBarLayout ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Landroidx/appcompat/widget/ButtonBarLayout;->a(I)I
/* if-ltz p1, :cond_8 */
/* .line 14 */
(( android.widget.LinearLayout ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
/* .line 15 */
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 16 */
v1 = (( android.widget.LinearLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getPaddingTop()I
p2 = (( android.view.View ) p2 ).getMeasuredHeight ( ); // invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v1, p2 */
/* iget p2, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v1, p2 */
/* iget p2, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v1, p2 */
/* add-int/2addr v1, v2 */
/* .line 17 */
p2 = (( androidx.appcompat.widget.ButtonBarLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ButtonBarLayout;->a()Z
if ( p2 != null) { // if-eqz p2, :cond_7
/* add-int/2addr p1, v3 */
/* .line 18 */
p1 = (( androidx.appcompat.widget.ButtonBarLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ButtonBarLayout;->a(I)I
/* if-ltz p1, :cond_6 */
/* .line 19 */
(( android.widget.LinearLayout ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
p1 = (( android.view.View ) p1 ).getPaddingTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I
/* const/high16 p2, 0x41800000 # 16.0f */
/* .line 20 */
(( android.widget.LinearLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
/* mul-float v0, v0, p2 */
/* float-to-int p2, v0 */
/* add-int/2addr p1, p2 */
/* add-int/2addr v1, p1 */
} // :cond_6
/* move v2, v1 */
/* .line 21 */
} // :cond_7
p1 = (( android.widget.LinearLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getPaddingBottom()I
/* add-int v2, v1, p1 */
/* .line 22 */
} // :cond_8
} // :goto_2
p1 = c.h.n.v0 .p ( p0 );
/* if-eq p1, v2, :cond_9 */
/* .line 23 */
(( android.widget.LinearLayout ) p0 ).setMinimumHeight ( v2 ); // invoke-virtual {p0, v2}, Landroid/widget/LinearLayout;->setMinimumHeight(I)V
} // :cond_9
return;
} // .end method
public void setAllowStacking ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/ButtonBarLayout;->b:Z */
/* if-eq v0, p1, :cond_1 */
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/ButtonBarLayout;->b:Z */
/* if-nez p1, :cond_0 */
/* .line 3 */
p1 = (( android.widget.LinearLayout ) p0 ).getOrientation ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getOrientation()I
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 4 */
/* invoke-direct {p0, p1}, Landroidx/appcompat/widget/ButtonBarLayout;->setStacked(Z)V */
/* .line 5 */
} // :cond_0
(( android.widget.LinearLayout ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->requestLayout()V
} // :cond_1
return;
} // .end method
