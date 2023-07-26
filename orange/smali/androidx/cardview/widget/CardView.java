public class androidx.cardview.widget.CardView extends android.widget.FrameLayout {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final i;
	 public static final c.d.f.g j;
	 /* # instance fields */
	 public Boolean b;
	 public Boolean c;
	 public Integer d;
	 public Integer e;
	 public final android.graphics.Rect f;
	 public final android.graphics.Rect g;
	 public final c.d.f.f h;
	 /* # direct methods */
	 public static androidx.cardview.widget.CardView ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [I */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const v2, 0x1010031 */
		 /* aput v2, v0, v1 */
		 /* .line 1 */
		 /* .line 2 */
		 /* const/16 v1, 0x15 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 3 */
		 /* new-instance v0, Lc/d/f/c; */
		 /* invoke-direct {v0}, Lc/d/f/c;-><init>()V */
	 } // :cond_0
	 /* const/16 v1, 0x11 */
	 /* if-lt v0, v1, :cond_1 */
	 /* .line 4 */
	 /* new-instance v0, Lc/d/f/b; */
	 /* invoke-direct {v0}, Lc/d/f/b;-><init>()V */
	 /* .line 5 */
} // :cond_1
/* new-instance v0, Lc/d/f/e; */
/* invoke-direct {v0}, Lc/d/f/e;-><init>()V */
/* .line 6 */
} // :goto_0
v0 = androidx.cardview.widget.CardView.j;
return;
} // .end method
public androidx.cardview.widget.CardView ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, v0}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public androidx.cardview.widget.CardView ( ) {
/* .locals 1 */
/* .line 2 */
/* invoke-direct {p0, p1, p2, v0}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public androidx.cardview.widget.CardView ( ) {
/* .locals 8 */
/* .line 3 */
/* invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* .line 4 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
this.f = v0;
/* .line 5 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
this.g = v0;
/* .line 6 */
/* new-instance v0, Landroidx/cardview/widget/CardView$a; */
/* invoke-direct {v0, p0}, Landroidx/cardview/widget/CardView$a;-><init>(Landroidx/cardview/widget/CardView;)V */
this.h = v0;
/* .line 7 */
v0 = c.d.e.CardView;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0, p3, v1 ); // invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
/* .line 8 */
p3 = (( android.content.res.TypedArray ) p2 ).hasValue ( p3 ); // invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z
int v0 = 0; // const/4 v0, 0x0
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 9 */
(( android.content.res.TypedArray ) p2 ).getColorStateList ( p3 ); // invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;
} // :goto_0
/* move-object v4, p3 */
/* .line 10 */
} // :cond_0
(( android.widget.FrameLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;
v1 = androidx.cardview.widget.CardView.i;
(( android.content.Context ) p3 ).obtainStyledAttributes ( v1 ); // invoke-virtual {p3, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
/* .line 11 */
v1 = (( android.content.res.TypedArray ) p3 ).getColor ( v0, v0 ); // invoke-virtual {p3, v0, v0}, Landroid/content/res/TypedArray;->getColor(II)I
/* .line 12 */
(( android.content.res.TypedArray ) p3 ).recycle ( ); // invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V
int p3 = 3; // const/4 p3, 0x3
/* new-array p3, p3, [F */
/* .line 13 */
android.graphics.Color .colorToHSV ( v1,p3 );
int v1 = 2; // const/4 v1, 0x2
/* .line 14 */
/* aget p3, p3, v1 */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* cmpl-float p3, p3, v1 */
/* if-lez p3, :cond_1 */
/* .line 15 */
(( android.widget.FrameLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;
p3 = (( android.content.res.Resources ) p3 ).getColor ( v1 ); // invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I
/* .line 16 */
} // :cond_1
(( android.widget.FrameLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;
p3 = (( android.content.res.Resources ) p3 ).getColor ( v1 ); // invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I
/* .line 17 */
} // :goto_1
android.content.res.ColorStateList .valueOf ( p3 );
/* .line 18 */
} // :goto_2
int v1 = 0; // const/4 v1, 0x0
v5 = (( android.content.res.TypedArray ) p2 ).getDimension ( p3, v1 ); // invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F
/* .line 19 */
v6 = (( android.content.res.TypedArray ) p2 ).getDimension ( p3, v1 ); // invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F
/* .line 20 */
p3 = (( android.content.res.TypedArray ) p2 ).getDimension ( p3, v1 ); // invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F
/* .line 21 */
v1 = (( android.content.res.TypedArray ) p2 ).getBoolean ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* iput-boolean v1, p0, Landroidx/cardview/widget/CardView;->b:Z */
/* .line 22 */
int v2 = 1; // const/4 v2, 0x1
v1 = (( android.content.res.TypedArray ) p2 ).getBoolean ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* iput-boolean v1, p0, Landroidx/cardview/widget/CardView;->c:Z */
/* .line 23 */
v1 = (( android.content.res.TypedArray ) p2 ).getDimensionPixelSize ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
/* .line 24 */
v2 = this.f;
v3 = (( android.content.res.TypedArray ) p2 ).getDimensionPixelSize ( v3, v1 ); // invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
/* iput v3, v2, Landroid/graphics/Rect;->left:I */
/* .line 25 */
v2 = this.f;
v3 = (( android.content.res.TypedArray ) p2 ).getDimensionPixelSize ( v3, v1 ); // invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
/* iput v3, v2, Landroid/graphics/Rect;->top:I */
/* .line 26 */
v2 = this.f;
v3 = (( android.content.res.TypedArray ) p2 ).getDimensionPixelSize ( v3, v1 ); // invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
/* iput v3, v2, Landroid/graphics/Rect;->right:I */
/* .line 27 */
v2 = this.f;
v1 = (( android.content.res.TypedArray ) p2 ).getDimensionPixelSize ( v3, v1 ); // invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
/* iput v1, v2, Landroid/graphics/Rect;->bottom:I */
/* cmpl-float v1, v6, p3 */
/* if-lez v1, :cond_2 */
/* move v7, v6 */
} // :cond_2
/* move v7, p3 */
/* .line 28 */
} // :goto_3
p3 = (( android.content.res.TypedArray ) p2 ).getDimensionPixelSize ( p3, v0 ); // invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
/* iput p3, p0, Landroidx/cardview/widget/CardView;->d:I */
/* .line 29 */
p3 = (( android.content.res.TypedArray ) p2 ).getDimensionPixelSize ( p3, v0 ); // invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
/* iput p3, p0, Landroidx/cardview/widget/CardView;->e:I */
/* .line 30 */
(( android.content.res.TypedArray ) p2 ).recycle ( ); // invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V
/* .line 31 */
v1 = androidx.cardview.widget.CardView.j;
v2 = this.h;
/* move-object v3, p1 */
/* invoke-interface/range {v1 ..v7}, Lc/d/f/g;->a(Lc/d/f/f;Landroid/content/Context;Landroid/content/res/ColorStateList;FFF)V */
return;
} // .end method
public static void a ( androidx.cardview.widget.CardView p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setMinimumWidth(I)V */
return;
} // .end method
public static void a ( androidx.cardview.widget.CardView p0, Integer p1, Integer p2, Integer p3, Integer p4 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->setPadding(IIII)V */
return;
} // .end method
public static void b ( androidx.cardview.widget.CardView p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setMinimumHeight(I)V */
return;
} // .end method
/* # virtual methods */
public void a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.f;
(( android.graphics.Rect ) v0 ).set ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V
/* .line 4 */
p1 = androidx.cardview.widget.CardView.j;
p2 = this.h;
return;
} // .end method
public android.content.res.ColorStateList getCardBackgroundColor ( ) {
/* .locals 2 */
/* .line 1 */
v0 = androidx.cardview.widget.CardView.j;
v1 = this.h;
} // .end method
public Float getCardElevation ( ) {
/* .locals 2 */
/* .line 1 */
v0 = androidx.cardview.widget.CardView.j;
v0 = v1 = this.h;
} // .end method
public Integer getContentPaddingBottom ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
/* iget v0, v0, Landroid/graphics/Rect;->bottom:I */
} // .end method
public Integer getContentPaddingLeft ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
/* iget v0, v0, Landroid/graphics/Rect;->left:I */
} // .end method
public Integer getContentPaddingRight ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
/* iget v0, v0, Landroid/graphics/Rect;->right:I */
} // .end method
public Integer getContentPaddingTop ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
/* iget v0, v0, Landroid/graphics/Rect;->top:I */
} // .end method
public Float getMaxCardElevation ( ) {
/* .locals 2 */
/* .line 1 */
v0 = androidx.cardview.widget.CardView.j;
v0 = v1 = this.h;
} // .end method
public Boolean getPreventCornerOverlap ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/cardview/widget/CardView;->c:Z */
} // .end method
public Float getRadius ( ) {
/* .locals 2 */
/* .line 1 */
v0 = androidx.cardview.widget.CardView.j;
v0 = v1 = this.h;
} // .end method
public Boolean getUseCompatPadding ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/cardview/widget/CardView;->b:Z */
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 5 */
/* .line 1 */
v0 = androidx.cardview.widget.CardView.j;
/* instance-of v0, v0, Lc/d/f/c; */
/* if-nez v0, :cond_2 */
/* .line 2 */
v0 = android.view.View$MeasureSpec .getMode ( p1 );
/* const/high16 v1, 0x40000000 # 2.0f */
/* const/high16 v2, -0x80000000 */
/* if-eq v0, v2, :cond_0 */
/* if-eq v0, v1, :cond_0 */
/* .line 3 */
} // :cond_0
v3 = androidx.cardview.widget.CardView.j;
v3 = v4 = this.h;
/* float-to-double v3, v3 */
java.lang.Math .ceil ( v3,v4 );
/* move-result-wide v3 */
/* double-to-int v3, v3 */
/* .line 4 */
p1 = android.view.View$MeasureSpec .getSize ( p1 );
/* .line 5 */
p1 = java.lang.Math .max ( v3,p1 );
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( p1,v0 );
/* .line 6 */
} // :goto_0
v0 = android.view.View$MeasureSpec .getMode ( p2 );
/* if-eq v0, v2, :cond_1 */
/* if-eq v0, v1, :cond_1 */
/* .line 7 */
} // :cond_1
v1 = androidx.cardview.widget.CardView.j;
v1 = v2 = this.h;
/* float-to-double v1, v1 */
java.lang.Math .ceil ( v1,v2 );
/* move-result-wide v1 */
/* double-to-int v1, v1 */
/* .line 8 */
p2 = android.view.View$MeasureSpec .getSize ( p2 );
/* .line 9 */
p2 = java.lang.Math .max ( v1,p2 );
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v0 );
/* .line 10 */
} // :goto_1
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V */
/* .line 11 */
} // :cond_2
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V */
} // :goto_2
return;
} // .end method
public void setCardBackgroundColor ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = androidx.cardview.widget.CardView.j;
v1 = this.h;
android.content.res.ColorStateList .valueOf ( p1 );
return;
} // .end method
public void setCardBackgroundColor ( android.content.res.ColorStateList p0 ) {
/* .locals 2 */
/* .line 2 */
v0 = androidx.cardview.widget.CardView.j;
v1 = this.h;
return;
} // .end method
public void setCardElevation ( Float p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = androidx.cardview.widget.CardView.j;
v1 = this.h;
return;
} // .end method
public void setMaxCardElevation ( Float p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = androidx.cardview.widget.CardView.j;
v1 = this.h;
return;
} // .end method
public void setMinimumHeight ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/cardview/widget/CardView;->e:I */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setMinimumHeight(I)V */
return;
} // .end method
public void setMinimumWidth ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/cardview/widget/CardView;->d:I */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setMinimumWidth(I)V */
return;
} // .end method
public void setPadding ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
return;
} // .end method
public void setPaddingRelative ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
return;
} // .end method
public void setPreventCornerOverlap ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/cardview/widget/CardView;->c:Z */
/* if-eq p1, v0, :cond_0 */
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/cardview/widget/CardView;->c:Z */
/* .line 3 */
p1 = androidx.cardview.widget.CardView.j;
v0 = this.h;
} // :cond_0
return;
} // .end method
public void setRadius ( Float p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = androidx.cardview.widget.CardView.j;
v1 = this.h;
return;
} // .end method
public void setUseCompatPadding ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/cardview/widget/CardView;->b:Z */
/* if-eq v0, p1, :cond_0 */
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/cardview/widget/CardView;->b:Z */
/* .line 3 */
p1 = androidx.cardview.widget.CardView.j;
v0 = this.h;
} // :cond_0
return;
} // .end method
