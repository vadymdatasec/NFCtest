public class com.google.android.material.appbar.AppBarLayout$c extends android.widget.LinearLayout$LayoutParams {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/android/material/appbar/AppBarLayout; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "c" */
} // .end annotation
/* # instance fields */
public Integer a;
public android.view.animation.Interpolator b;
/* # direct methods */
public com.google.android.material.appbar.AppBarLayout$c ( ) {
/* .locals 0 */
/* .line 9 */
/* invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
int p1 = 1; // const/4 p1, 0x1
/* .line 10 */
/* iput p1, p0, Lcom/google/android/material/appbar/AppBarLayout$c;->a:I */
return;
} // .end method
public com.google.android.material.appbar.AppBarLayout$c ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout$c;->a:I */
/* .line 3 */
v0 = e.f.a.c.i.AppBarLayout_Layout;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
/* .line 4 */
int v1 = 0; // const/4 v1, 0x0
v0 = (( android.content.res.TypedArray ) p2 ).getInt ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout$c;->a:I */
/* .line 5 */
v0 = (( android.content.res.TypedArray ) p2 ).hasValue ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 6 */
	 v0 = 	 (( android.content.res.TypedArray ) p2 ).getResourceId ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
	 /* .line 7 */
	 android.view.animation.AnimationUtils .loadInterpolator ( p1,v0 );
	 this.b = p1;
	 /* .line 8 */
} // :cond_0
(( android.content.res.TypedArray ) p2 ).recycle ( ); // invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
public com.google.android.material.appbar.AppBarLayout$c ( ) {
/* .locals 0 */
/* .line 11 */
/* invoke-direct {p0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
int p1 = 1; // const/4 p1, 0x1
/* .line 12 */
/* iput p1, p0, Lcom/google/android/material/appbar/AppBarLayout$c;->a:I */
return;
} // .end method
public com.google.android.material.appbar.AppBarLayout$c ( ) {
/* .locals 0 */
/* .line 13 */
/* invoke-direct {p0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
int p1 = 1; // const/4 p1, 0x1
/* .line 14 */
/* iput p1, p0, Lcom/google/android/material/appbar/AppBarLayout$c;->a:I */
return;
} // .end method
public com.google.android.material.appbar.AppBarLayout$c ( ) {
/* .locals 0 */
/* .line 15 */
/* invoke-direct {p0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/widget/LinearLayout$LayoutParams;)V */
int p1 = 1; // const/4 p1, 0x1
/* .line 16 */
/* iput p1, p0, Lcom/google/android/material/appbar/AppBarLayout$c;->a:I */
return;
} // .end method
/* # virtual methods */
public Integer a ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout$c;->a:I */
} // .end method
public android.view.animation.Interpolator b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public Boolean c ( ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout$c;->a:I */
/* and-int/lit8 v1, v0, 0x1 */
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_0 */
/* and-int/lit8 v0, v0, 0xa */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
} // .end method
