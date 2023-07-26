public class androidx.appcompat.widget.ActionBarContainer extends android.widget.FrameLayout {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean b;
	 public android.view.View c;
	 public android.view.View d;
	 public android.view.View e;
	 public android.graphics.drawable.Drawable f;
	 public android.graphics.drawable.Drawable g;
	 public android.graphics.drawable.Drawable h;
	 public Boolean i;
	 public Boolean j;
	 public Integer k;
	 /* # direct methods */
	 public androidx.appcompat.widget.ActionBarContainer ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public androidx.appcompat.widget.ActionBarContainer ( ) {
		 /* .locals 2 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 3 */
		 /* new-instance v0, Lc/b/q/c; */
		 /* invoke-direct {v0, p0}, Lc/b/q/c;-><init>(Landroidx/appcompat/widget/ActionBarContainer;)V */
		 /* .line 4 */
		 c.h.n.v0 .a ( p0,v0 );
		 /* .line 5 */
		 v0 = c.b.j.ActionBar;
		 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
		 /* .line 6 */
		 (( android.content.res.TypedArray ) p1 ).getDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
		 this.f = p2;
		 /* .line 7 */
		 (( android.content.res.TypedArray ) p1 ).getDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
		 this.g = p2;
		 /* .line 8 */
		 int v0 = -1; // const/4 v0, -0x1
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
		 /* iput p2, p0, Landroidx/appcompat/widget/ActionBarContainer;->k:I */
		 /* .line 9 */
		 p2 = 		 (( android.widget.FrameLayout ) p0 ).getId ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getId()I
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-ne p2, v0, :cond_0 */
		 /* .line 10 */
		 /* iput-boolean v1, p0, Landroidx/appcompat/widget/ActionBarContainer;->i:Z */
		 /* .line 11 */
		 (( android.content.res.TypedArray ) p1 ).getDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
		 this.h = p2;
		 /* .line 12 */
	 } // :cond_0
	 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 /* .line 13 */
	 /* iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarContainer;->i:Z */
	 int p2 = 0; // const/4 p2, 0x0
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 p1 = this.h;
		 /* if-nez p1, :cond_2 */
	 } // :cond_1
	 p1 = this.f;
	 /* if-nez p1, :cond_2 */
	 p1 = this.g;
	 /* if-nez p1, :cond_2 */
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
(( android.widget.FrameLayout ) p0 ).setWillNotDraw ( v1 ); // invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->setWillNotDraw(Z)V
return;
} // .end method
/* # virtual methods */
public final Integer a ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 2 */
p1 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
/* iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* add-int/2addr p1, v1 */
/* iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr p1, v0 */
} // .end method
public final Boolean b ( android.view.View p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 1 */
v0 = (( android.view.View ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
/* const/16 v1, 0x8 */
/* if-eq v0, v1, :cond_1 */
p1 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
/* if-nez p1, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public void drawableStateChanged ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->drawableStateChanged()V */
/* .line 2 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.f;
(( android.widget.FrameLayout ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* .line 4 */
} // :cond_0
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
v0 = this.g;
(( android.widget.FrameLayout ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* .line 6 */
} // :cond_1
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 7 */
v0 = this.h;
(( android.widget.FrameLayout ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_2
return;
} // .end method
public android.view.View getTabContainer ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public void jumpDrawablesToCurrentState ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->jumpDrawablesToCurrentState()V */
/* .line 2 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
/* .line 4 */
} // :cond_0
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
(( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
/* .line 6 */
} // :cond_1
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 7 */
(( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
} // :cond_2
return;
} // .end method
public void onFinishInflate ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->onFinishInflate()V */
/* .line 2 */
(( android.widget.FrameLayout ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;
this.d = v0;
/* .line 3 */
(( android.widget.FrameLayout ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;
this.e = v0;
return;
} // .end method
public Boolean onHoverEvent ( android.view.MotionEvent p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onHoverEvent(Landroid/view/MotionEvent;)Z */
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean onInterceptTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarContainer;->b:Z */
/* if-nez v0, :cond_1 */
p1 = /* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z */
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 4 */
/* .line 1 */
/* invoke-super/range {p0 ..p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V */
/* .line 2 */
p1 = this.c;
/* const/16 p3, 0x8 */
int p5 = 1; // const/4 p5, 0x1
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
v1 = (( android.view.View ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
/* if-eq v1, p3, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
v2 = (( android.view.View ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
/* if-eq v2, p3, :cond_1 */
/* .line 5 */
p3 = (( android.widget.FrameLayout ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredHeight()I
/* .line 6 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 7 */
v3 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
/* sub-int v3, p3, v3 */
/* .line 8 */
/* iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* sub-int/2addr v3, v2 */
/* sub-int/2addr p3, v2 */
(( android.view.View ) p1 ).layout ( p2, v3, p4, p3 ); // invoke-virtual {p1, p2, v3, p4, p3}, Landroid/view/View;->layout(IIII)V
/* .line 9 */
} // :cond_1
/* iget-boolean p2, p0, Landroidx/appcompat/widget/ActionBarContainer;->i:Z */
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 10 */
p1 = this.h;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 11 */
p2 = (( android.widget.FrameLayout ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredWidth()I
p3 = (( android.widget.FrameLayout ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredHeight()I
(( android.graphics.drawable.Drawable ) p1 ).setBounds ( v0, v0, p2, p3 ); // invoke-virtual {p1, v0, v0, p2, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* goto/16 :goto_2 */
} // :cond_2
int p5 = 0; // const/4 p5, 0x0
/* goto/16 :goto_2 */
/* .line 12 */
} // :cond_3
p2 = this.f;
if ( p2 != null) { // if-eqz p2, :cond_6
/* .line 13 */
p2 = this.d;
p2 = (( android.view.View ) p2 ).getVisibility ( ); // invoke-virtual {p2}, Landroid/view/View;->getVisibility()I
/* if-nez p2, :cond_4 */
/* .line 14 */
p2 = this.f;
p3 = this.d;
p3 = (( android.view.View ) p3 ).getLeft ( ); // invoke-virtual {p3}, Landroid/view/View;->getLeft()I
p4 = this.d;
p4 = (( android.view.View ) p4 ).getTop ( ); // invoke-virtual {p4}, Landroid/view/View;->getTop()I
v0 = this.d;
/* .line 15 */
v0 = (( android.view.View ) v0 ).getRight ( ); // invoke-virtual {v0}, Landroid/view/View;->getRight()I
v2 = this.d;
v2 = (( android.view.View ) v2 ).getBottom ( ); // invoke-virtual {v2}, Landroid/view/View;->getBottom()I
/* .line 16 */
(( android.graphics.drawable.Drawable ) p2 ).setBounds ( p3, p4, v0, v2 ); // invoke-virtual {p2, p3, p4, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 17 */
} // :cond_4
p2 = this.e;
if ( p2 != null) { // if-eqz p2, :cond_5
/* .line 18 */
p2 = (( android.view.View ) p2 ).getVisibility ( ); // invoke-virtual {p2}, Landroid/view/View;->getVisibility()I
/* if-nez p2, :cond_5 */
/* .line 19 */
p2 = this.f;
p3 = this.e;
p3 = (( android.view.View ) p3 ).getLeft ( ); // invoke-virtual {p3}, Landroid/view/View;->getLeft()I
p4 = this.e;
p4 = (( android.view.View ) p4 ).getTop ( ); // invoke-virtual {p4}, Landroid/view/View;->getTop()I
v0 = this.e;
/* .line 20 */
v0 = (( android.view.View ) v0 ).getRight ( ); // invoke-virtual {v0}, Landroid/view/View;->getRight()I
v2 = this.e;
v2 = (( android.view.View ) v2 ).getBottom ( ); // invoke-virtual {v2}, Landroid/view/View;->getBottom()I
/* .line 21 */
(( android.graphics.drawable.Drawable ) p2 ).setBounds ( p3, p4, v0, v2 ); // invoke-virtual {p2, p3, p4, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 22 */
} // :cond_5
p2 = this.f;
(( android.graphics.drawable.Drawable ) p2 ).setBounds ( v0, v0, v0, v0 ); // invoke-virtual {p2, v0, v0, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
} // :goto_1
int v0 = 1; // const/4 v0, 0x1
/* .line 23 */
} // :cond_6
/* iput-boolean v1, p0, Landroidx/appcompat/widget/ActionBarContainer;->j:Z */
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 24 */
p2 = this.g;
if ( p2 != null) { // if-eqz p2, :cond_7
/* .line 25 */
p3 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
p4 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* .line 26 */
v0 = (( android.view.View ) p1 ).getRight ( ); // invoke-virtual {p1}, Landroid/view/View;->getRight()I
p1 = (( android.view.View ) p1 ).getBottom ( ); // invoke-virtual {p1}, Landroid/view/View;->getBottom()I
/* .line 27 */
(( android.graphics.drawable.Drawable ) p2 ).setBounds ( p3, p4, v0, p1 ); // invoke-virtual {p2, p3, p4, v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
} // :cond_7
/* move p5, v0 */
} // :goto_2
if ( p5 != null) { // if-eqz p5, :cond_8
/* .line 28 */
(( android.widget.FrameLayout ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidate()V
} // :cond_8
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.d;
/* const/high16 v1, -0x80000000 */
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = android.view.View$MeasureSpec .getMode ( p2 );
/* if-ne v0, v1, :cond_0 */
/* iget v0, p0, Landroidx/appcompat/widget/ActionBarContainer;->k:I */
/* if-ltz v0, :cond_0 */
/* .line 3 */
p2 = android.view.View$MeasureSpec .getSize ( p2 );
p2 = java.lang.Math .min ( v0,p2 );
/* .line 4 */
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v1 );
/* .line 5 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V */
/* .line 6 */
p1 = this.d;
/* if-nez p1, :cond_1 */
return;
/* .line 7 */
} // :cond_1
p1 = android.view.View$MeasureSpec .getMode ( p2 );
/* .line 8 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = (( android.view.View ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
/* const/16 v2, 0x8 */
/* if-eq v0, v2, :cond_5 */
/* const/high16 v0, 0x40000000 # 2.0f */
/* if-eq p1, v0, :cond_5 */
/* .line 9 */
v0 = this.d;
v0 = (( androidx.appcompat.widget.ActionBarContainer ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ActionBarContainer;->b(Landroid/view/View;)Z
/* if-nez v0, :cond_2 */
/* .line 10 */
v0 = this.d;
v0 = (( androidx.appcompat.widget.ActionBarContainer ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ActionBarContainer;->a(Landroid/view/View;)I
/* .line 11 */
} // :cond_2
v0 = this.e;
v0 = (( androidx.appcompat.widget.ActionBarContainer ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ActionBarContainer;->b(Landroid/view/View;)Z
/* if-nez v0, :cond_3 */
/* .line 12 */
v0 = this.e;
v0 = (( androidx.appcompat.widget.ActionBarContainer ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ActionBarContainer;->a(Landroid/view/View;)I
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ne p1, v1, :cond_4 */
/* .line 13 */
p1 = android.view.View$MeasureSpec .getSize ( p2 );
} // :cond_4
/* const p1, 0x7fffffff */
/* .line 14 */
} // :goto_1
p2 = (( android.widget.FrameLayout ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredWidth()I
v1 = this.c;
/* .line 15 */
v1 = (( androidx.appcompat.widget.ActionBarContainer ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Landroidx/appcompat/widget/ActionBarContainer;->a(Landroid/view/View;)I
/* add-int/2addr v0, v1 */
p1 = java.lang.Math .min ( v0,p1 );
/* .line 16 */
(( android.widget.FrameLayout ) p0 ).setMeasuredDimension ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Landroid/widget/FrameLayout;->setMeasuredDimension(II)V
} // :cond_5
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z */
int p1 = 1; // const/4 p1, 0x1
} // .end method
public void setPrimaryBackground ( android.graphics.drawable.Drawable p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 3 */
v0 = this.f;
(( android.widget.FrameLayout ) p0 ).unscheduleDrawable ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 4 */
} // :cond_0
this.f = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 5 */
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 6 */
p1 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 7 */
v0 = this.f;
p1 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
v1 = this.d;
v1 = (( android.view.View ) v1 ).getTop ( ); // invoke-virtual {v1}, Landroid/view/View;->getTop()I
v2 = this.d;
/* .line 8 */
v2 = (( android.view.View ) v2 ).getRight ( ); // invoke-virtual {v2}, Landroid/view/View;->getRight()I
v3 = this.d;
v3 = (( android.view.View ) v3 ).getBottom ( ); // invoke-virtual {v3}, Landroid/view/View;->getBottom()I
/* .line 9 */
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( p1, v1, v2, v3 ); // invoke-virtual {v0, p1, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 10 */
} // :cond_1
/* iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarContainer;->i:Z */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = this.h;
/* if-nez p1, :cond_3 */
} // :cond_2
p1 = this.f;
/* if-nez p1, :cond_3 */
p1 = this.g;
/* if-nez p1, :cond_3 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
(( android.widget.FrameLayout ) p0 ).setWillNotDraw ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setWillNotDraw(Z)V
/* .line 11 */
(( android.widget.FrameLayout ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidate()V
/* .line 12 */
/* const/16 v0, 0x15 */
/* if-lt p1, v0, :cond_4 */
/* .line 13 */
(( android.widget.FrameLayout ) p0 ).invalidateOutline ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidateOutline()V
} // :cond_4
return;
} // .end method
public void setSplitBackground ( android.graphics.drawable.Drawable p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 3 */
v0 = this.h;
(( android.widget.FrameLayout ) p0 ).unscheduleDrawable ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 4 */
} // :cond_0
this.h = p1;
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 5 */
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 6 */
/* iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarContainer;->i:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.h;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 7 */
v1 = (( android.widget.FrameLayout ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredWidth()I
v2 = (( android.widget.FrameLayout ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredHeight()I
(( android.graphics.drawable.Drawable ) p1 ).setBounds ( v0, v0, v1, v2 ); // invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 8 */
} // :cond_1
/* iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarContainer;->i:Z */
int v1 = 1; // const/4 v1, 0x1
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = this.h;
/* if-nez p1, :cond_3 */
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
p1 = this.f;
/* if-nez p1, :cond_3 */
p1 = this.g;
/* if-nez p1, :cond_3 */
} // :cond_3
} // :goto_1
(( android.widget.FrameLayout ) p0 ).setWillNotDraw ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setWillNotDraw(Z)V
/* .line 9 */
(( android.widget.FrameLayout ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidate()V
/* .line 10 */
/* const/16 v0, 0x15 */
/* if-lt p1, v0, :cond_4 */
/* .line 11 */
(( android.widget.FrameLayout ) p0 ).invalidateOutline ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidateOutline()V
} // :cond_4
return;
} // .end method
public void setStackedBackground ( android.graphics.drawable.Drawable p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 3 */
v0 = this.g;
(( android.widget.FrameLayout ) p0 ).unscheduleDrawable ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 4 */
} // :cond_0
this.g = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 5 */
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 6 */
/* iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarContainer;->j:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.g;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 7 */
v0 = this.c;
v0 = (( android.view.View ) v0 ).getLeft ( ); // invoke-virtual {v0}, Landroid/view/View;->getLeft()I
v1 = this.c;
v1 = (( android.view.View ) v1 ).getTop ( ); // invoke-virtual {v1}, Landroid/view/View;->getTop()I
v2 = this.c;
/* .line 8 */
v2 = (( android.view.View ) v2 ).getRight ( ); // invoke-virtual {v2}, Landroid/view/View;->getRight()I
v3 = this.c;
v3 = (( android.view.View ) v3 ).getBottom ( ); // invoke-virtual {v3}, Landroid/view/View;->getBottom()I
/* .line 9 */
(( android.graphics.drawable.Drawable ) p1 ).setBounds ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 10 */
} // :cond_1
/* iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarContainer;->i:Z */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = this.h;
/* if-nez p1, :cond_3 */
} // :cond_2
p1 = this.f;
/* if-nez p1, :cond_3 */
p1 = this.g;
/* if-nez p1, :cond_3 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
(( android.widget.FrameLayout ) p0 ).setWillNotDraw ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setWillNotDraw(Z)V
/* .line 11 */
(( android.widget.FrameLayout ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidate()V
/* .line 12 */
/* const/16 v0, 0x15 */
/* if-lt p1, v0, :cond_4 */
/* .line 13 */
(( android.widget.FrameLayout ) p0 ).invalidateOutline ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidateOutline()V
} // :cond_4
return;
} // .end method
public void setTabContainer ( c.b.q.c2 p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.widget.FrameLayout ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V
/* .line 3 */
} // :cond_0
this.c = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
(( android.widget.FrameLayout ) p0 ).addView ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
/* .line 5 */
(( android.widget.HorizontalScrollView ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/widget/HorizontalScrollView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
int v1 = -1; // const/4 v1, -0x1
/* .line 6 */
/* iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I */
int v1 = -2; // const/4 v1, -0x2
/* .line 7 */
/* iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
(( c.b.q.c2 ) p1 ).setAllowCollapse ( v0 ); // invoke-virtual {p1, v0}, Lc/b/q/c2;->setAllowCollapse(Z)V
} // :cond_1
return;
} // .end method
public void setTransitioning ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarContainer;->b:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
/* const/high16 p1, 0x60000 */
} // :cond_0
/* const/high16 p1, 0x40000 */
/* .line 2 */
} // :goto_0
(( android.widget.FrameLayout ) p0 ).setDescendantFocusability ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setDescendantFocusability(I)V
return;
} // .end method
public void setVisibility ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :goto_0
v1 = this.f;
if ( v1 != null) { // if-eqz v1, :cond_1
(( android.graphics.drawable.Drawable ) v1 ).setVisible ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
/* .line 3 */
} // :cond_1
v1 = this.g;
if ( v1 != null) { // if-eqz v1, :cond_2
(( android.graphics.drawable.Drawable ) v1 ).setVisible ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
/* .line 4 */
} // :cond_2
v1 = this.h;
if ( v1 != null) { // if-eqz v1, :cond_3
(( android.graphics.drawable.Drawable ) v1 ).setVisible ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
} // :cond_3
return;
} // .end method
public android.view.ActionMode startActionModeForChild ( android.view.View p0, android.view.ActionMode$Callback p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.view.ActionMode startActionModeForChild ( android.view.View p0, android.view.ActionMode$Callback p1, Integer p2 ) {
/* .locals 0 */
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 1 */
/* invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->startActionModeForChild(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode; */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean verifyDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
/* if-ne p1, v0, :cond_0 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarContainer;->i:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_0
v0 = this.g;
/* if-ne p1, v0, :cond_1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarContainer;->j:Z */
/* if-nez v0, :cond_3 */
} // :cond_1
v0 = this.h;
/* if-ne p1, v0, :cond_2 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarContainer;->i:Z */
/* if-nez v0, :cond_3 */
/* .line 2 */
} // :cond_2
p1 = /* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z */
if ( p1 != null) { // if-eqz p1, :cond_4
} // :cond_3
int p1 = 1; // const/4 p1, 0x1
} // :cond_4
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
