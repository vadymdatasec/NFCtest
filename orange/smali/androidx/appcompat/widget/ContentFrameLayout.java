public class androidx.appcompat.widget.ContentFrameLayout extends android.widget.FrameLayout {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/appcompat/widget/ContentFrameLayout$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public android.util.TypedValue b;
public android.util.TypedValue c;
public android.util.TypedValue d;
public android.util.TypedValue e;
public android.util.TypedValue f;
public android.util.TypedValue g;
public final android.graphics.Rect h;
public androidx.appcompat.widget.ContentFrameLayout$a i;
/* # direct methods */
public androidx.appcompat.widget.ContentFrameLayout ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 1 */
	 /* invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ContentFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public androidx.appcompat.widget.ContentFrameLayout ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/ContentFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
public androidx.appcompat.widget.ContentFrameLayout ( ) {
	 /* .locals 0 */
	 /* .line 3 */
	 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* .line 4 */
	 /* new-instance p1, Landroid/graphics/Rect; */
	 /* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
	 this.h = p1;
	 return;
} // .end method
/* # virtual methods */
public void a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
	 /* .locals 1 */
	 /* .line 2 */
	 v0 = this.h;
	 (( android.graphics.Rect ) v0 ).set ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V
	 /* .line 3 */
	 p1 = 	 c.h.n.v0 .D ( p0 );
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 4 */
		 (( android.widget.FrameLayout ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->requestLayout()V
	 } // :cond_0
	 return;
} // .end method
public void a ( android.graphics.Rect p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 (( android.widget.FrameLayout ) p0 ).fitSystemWindows ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->fitSystemWindows(Landroid/graphics/Rect;)Z
	 return;
} // .end method
public android.util.TypedValue getFixedHeightMajor ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.f;
	 /* if-nez v0, :cond_0 */
	 /* new-instance v0, Landroid/util/TypedValue; */
	 /* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
	 this.f = v0;
	 /* .line 2 */
} // :cond_0
v0 = this.f;
} // .end method
public android.util.TypedValue getFixedHeightMinor ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
this.g = v0;
/* .line 2 */
} // :cond_0
v0 = this.g;
} // .end method
public android.util.TypedValue getFixedWidthMajor ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
this.d = v0;
/* .line 2 */
} // :cond_0
v0 = this.d;
} // .end method
public android.util.TypedValue getFixedWidthMinor ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
this.e = v0;
/* .line 2 */
} // :cond_0
v0 = this.e;
} // .end method
public android.util.TypedValue getMinWidthMajor ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
this.b = v0;
/* .line 2 */
} // :cond_0
v0 = this.b;
} // .end method
public android.util.TypedValue getMinWidthMinor ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
this.c = v0;
/* .line 2 */
} // :cond_0
v0 = this.c;
} // .end method
public void onAttachedToWindow ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V */
/* .line 2 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
} // :cond_0
return;
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V */
/* .line 2 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
} // :cond_0
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 13 */
/* .line 1 */
(( android.widget.FrameLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 2 */
/* iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I */
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* if-ge v1, v2, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :goto_0
v2 = android.view.View$MeasureSpec .getMode ( p1 );
/* .line 4 */
v5 = android.view.View$MeasureSpec .getMode ( p2 );
int v6 = 6; // const/4 v6, 0x6
int v7 = 5; // const/4 v7, 0x5
/* const/high16 v8, -0x80000000 */
/* const/high16 v9, 0x40000000 # 2.0f */
/* if-ne v2, v8, :cond_4 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 5 */
v10 = this.e;
} // :cond_1
v10 = this.d;
} // :goto_1
if ( v10 != null) { // if-eqz v10, :cond_4
/* .line 6 */
/* iget v11, v10, Landroid/util/TypedValue;->type:I */
if ( v11 != null) { // if-eqz v11, :cond_4
/* if-ne v11, v7, :cond_2 */
/* .line 7 */
v10 = (( android.util.TypedValue ) v10 ).getDimension ( v0 ); // invoke-virtual {v10, v0}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F
} // :goto_2
/* float-to-int v10, v10 */
} // :cond_2
/* if-ne v11, v6, :cond_3 */
/* .line 8 */
/* iget v11, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-float v12, v11 */
/* int-to-float v11, v11 */
v10 = (( android.util.TypedValue ) v10 ).getFraction ( v12, v11 ); // invoke-virtual {v10, v12, v11}, Landroid/util/TypedValue;->getFraction(FF)F
} // :cond_3
int v10 = 0; // const/4 v10, 0x0
} // :goto_3
/* if-lez v10, :cond_4 */
/* .line 9 */
v11 = this.h;
/* iget v12, v11, Landroid/graphics/Rect;->left:I */
/* iget v11, v11, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v12, v11 */
/* sub-int/2addr v10, v12 */
/* .line 10 */
p1 = android.view.View$MeasureSpec .getSize ( p1 );
/* .line 11 */
p1 = java.lang.Math .min ( v10,p1 );
/* .line 12 */
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( p1,v9 );
int v10 = 1; // const/4 v10, 0x1
} // :cond_4
int v10 = 0; // const/4 v10, 0x0
} // :goto_4
/* if-ne v5, v8, :cond_8 */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 13 */
v5 = this.f;
} // :cond_5
v5 = this.g;
} // :goto_5
if ( v5 != null) { // if-eqz v5, :cond_8
/* .line 14 */
/* iget v11, v5, Landroid/util/TypedValue;->type:I */
if ( v11 != null) { // if-eqz v11, :cond_8
/* if-ne v11, v7, :cond_6 */
/* .line 15 */
v5 = (( android.util.TypedValue ) v5 ).getDimension ( v0 ); // invoke-virtual {v5, v0}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F
} // :goto_6
/* float-to-int v5, v5 */
} // :cond_6
/* if-ne v11, v6, :cond_7 */
/* .line 16 */
/* iget v11, v0, Landroid/util/DisplayMetrics;->heightPixels:I */
/* int-to-float v12, v11 */
/* int-to-float v11, v11 */
v5 = (( android.util.TypedValue ) v5 ).getFraction ( v12, v11 ); // invoke-virtual {v5, v12, v11}, Landroid/util/TypedValue;->getFraction(FF)F
} // :cond_7
int v5 = 0; // const/4 v5, 0x0
} // :goto_7
/* if-lez v5, :cond_8 */
/* .line 17 */
v11 = this.h;
/* iget v12, v11, Landroid/graphics/Rect;->top:I */
/* iget v11, v11, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr v12, v11 */
/* sub-int/2addr v5, v12 */
/* .line 18 */
p2 = android.view.View$MeasureSpec .getSize ( p2 );
/* .line 19 */
p2 = java.lang.Math .min ( v5,p2 );
/* .line 20 */
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v9 );
/* .line 21 */
} // :cond_8
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V */
/* .line 22 */
p1 = (( android.widget.FrameLayout ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredWidth()I
/* .line 23 */
v5 = android.view.View$MeasureSpec .makeMeasureSpec ( p1,v9 );
/* if-nez v10, :cond_d */
/* if-ne v2, v8, :cond_d */
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 24 */
v1 = this.c;
} // :cond_9
v1 = this.b;
} // :goto_8
if ( v1 != null) { // if-eqz v1, :cond_d
/* .line 25 */
/* iget v2, v1, Landroid/util/TypedValue;->type:I */
if ( v2 != null) { // if-eqz v2, :cond_d
/* if-ne v2, v7, :cond_a */
/* .line 26 */
v0 = (( android.util.TypedValue ) v1 ).getDimension ( v0 ); // invoke-virtual {v1, v0}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F
} // :goto_9
/* float-to-int v0, v0 */
} // :cond_a
/* if-ne v2, v6, :cond_b */
/* .line 27 */
/* iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-float v2, v0 */
/* int-to-float v0, v0 */
v0 = (( android.util.TypedValue ) v1 ).getFraction ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/util/TypedValue;->getFraction(FF)F
} // :cond_b
int v0 = 0; // const/4 v0, 0x0
} // :goto_a
/* if-lez v0, :cond_c */
/* .line 28 */
v1 = this.h;
/* iget v2, v1, Landroid/graphics/Rect;->left:I */
/* iget v1, v1, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v2, v1 */
/* sub-int/2addr v0, v2 */
} // :cond_c
/* if-ge p1, v0, :cond_d */
/* .line 29 */
v5 = android.view.View$MeasureSpec .makeMeasureSpec ( v0,v9 );
} // :cond_d
int v3 = 0; // const/4 v3, 0x0
} // :goto_b
if ( v3 != null) { // if-eqz v3, :cond_e
/* .line 30 */
/* invoke-super {p0, v5, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V */
} // :cond_e
return;
} // .end method
public void setAttachListener ( androidx.appcompat.widget.ContentFrameLayout$a p0 ) {
/* .locals 0 */
/* .line 1 */
this.i = p1;
return;
} // .end method
