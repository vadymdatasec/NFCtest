public class c.b.q.q0 extends android.widget.Spinner implements c.h.n.z {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final j;
	 /* # instance fields */
	 public final c.b.q.m b;
	 public final android.content.Context c;
	 public c.b.q.h1 d;
	 public android.widget.SpinnerAdapter e;
	 public final Boolean f;
	 public c.b.q.p0 g;
	 public Integer h;
	 public final android.graphics.Rect i;
	 /* # direct methods */
	 public static c.b.q.q0 ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [I */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const v2, 0x10102f1 */
		 /* aput v2, v0, v1 */
		 /* .line 1 */
		 return;
	 } // .end method
	 public c.b.q.q0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Lc/b/q/q0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public c.b.q.q0 ( ) {
		 /* .locals 1 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, p3, v0}, Lc/b/q/q0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 return;
	 } // .end method
	 public c.b.q.q0 ( ) {
		 /* .locals 6 */
		 int v5 = 0; // const/4 v5, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* .line 3 */
		 /* invoke-direct/range {v0 ..v5}, Lc/b/q/q0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V */
		 return;
	 } // .end method
	 public c.b.q.q0 ( ) {
		 /* .locals 6 */
		 /* .line 4 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 5 */
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 this.i = v0;
		 /* .line 6 */
		 v0 = c.b.j.Spinner;
		 int v1 = 0; // const/4 v1, 0x0
		 c.b.q.k2 .a ( p1,p2,v0,p3,v1 );
		 /* .line 7 */
		 /* new-instance v2, Lc/b/q/m; */
		 /* invoke-direct {v2, p0}, Lc/b/q/m;-><init>(Landroid/view/View;)V */
		 this.b = v2;
		 if ( p5 != null) { // if-eqz p5, :cond_0
			 /* .line 8 */
			 /* new-instance v2, Lc/b/p/e; */
			 /* invoke-direct {v2, p1, p5}, Lc/b/p/e;-><init>(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V */
			 this.c = v2;
			 /* .line 9 */
		 } // :cond_0
		 p5 = 		 (( c.b.q.k2 ) v0 ).g ( p5, v1 ); // invoke-virtual {v0, p5, v1}, Lc/b/q/k2;->g(II)I
		 if ( p5 != null) { // if-eqz p5, :cond_1
			 /* .line 10 */
			 /* new-instance v2, Lc/b/p/e; */
			 /* invoke-direct {v2, p1, p5}, Lc/b/p/e;-><init>(Landroid/content/Context;I)V */
			 this.c = v2;
			 /* .line 11 */
		 } // :cond_1
		 this.c = p1;
	 } // :goto_0
	 int p5 = -1; // const/4 p5, -0x1
	 int v2 = 0; // const/4 v2, 0x0
	 /* if-ne p4, p5, :cond_4 */
	 /* .line 12 */
	 try { // :try_start_0
		 p5 = c.b.q.q0.j;
		 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, p5, p3, v1 ); // invoke-virtual {p1, p2, p5, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 13 */
		 try { // :try_start_1
			 v3 = 			 (( android.content.res.TypedArray ) p5 ).hasValue ( v1 ); // invoke-virtual {p5, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z
			 if ( v3 != null) { // if-eqz v3, :cond_2
				 /* .line 14 */
				 p4 = 				 (( android.content.res.TypedArray ) p5 ).getInt ( v1, v1 ); // invoke-virtual {p5, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I
				 /* :try_end_1 */
				 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
			 } // :cond_2
			 if ( p5 != null) { // if-eqz p5, :cond_4
				 /* .line 15 */
			 } // :goto_1
			 (( android.content.res.TypedArray ) p5 ).recycle ( ); // invoke-virtual {p5}, Landroid/content/res/TypedArray;->recycle()V
			 /* :catch_0 */
			 /* move-exception v3 */
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* :catch_1 */
			 /* move-exception v3 */
			 /* move-object p5, v2 */
		 } // :goto_2
		 try { // :try_start_2
			 final String v4 = "AppCompatSpinner"; // const-string v4, "AppCompatSpinner"
			 final String v5 = "Could not read android:spinnerMode"; // const-string v5, "Could not read android:spinnerMode"
			 /* .line 16 */
			 android.util.Log .i ( v4,v5,v3 );
			 /* :try_end_2 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
			 if ( p5 != null) { // if-eqz p5, :cond_4
				 /* :catchall_1 */
				 /* move-exception p1 */
				 /* move-object v2, p5 */
			 } // :goto_3
			 if ( v2 != null) { // if-eqz v2, :cond_3
				 /* .line 17 */
				 (( android.content.res.TypedArray ) v2 ).recycle ( ); // invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V
				 /* .line 18 */
			 } // :cond_3
			 /* throw p1 */
		 } // :cond_4
	 } // :goto_4
	 int p5 = 1; // const/4 p5, 0x1
	 if ( p4 != null) { // if-eqz p4, :cond_6
		 /* if-eq p4, p5, :cond_5 */
		 /* .line 19 */
	 } // :cond_5
	 /* new-instance p4, Lc/b/q/m0; */
	 v3 = this.c;
	 /* invoke-direct {p4, p0, v3, p2, p3}, Lc/b/q/m0;-><init>(Lc/b/q/q0;Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* .line 20 */
	 v3 = this.c;
	 v4 = c.b.j.Spinner;
	 c.b.q.k2 .a ( v3,p2,v4,p3,v1 );
	 /* .line 21 */
	 int v4 = -2; // const/4 v4, -0x2
	 v3 = 	 (( c.b.q.k2 ) v1 ).f ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Lc/b/q/k2;->f(II)I
	 /* iput v3, p0, Lc/b/q/q0;->h:I */
	 /* .line 22 */
	 /* .line 23 */
	 (( c.b.q.k2 ) v1 ).b ( v3 ); // invoke-virtual {v1, v3}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
	 /* .line 24 */
	 (( c.b.q.p1 ) p4 ).a ( v3 ); // invoke-virtual {p4, v3}, Lc/b/q/p1;->a(Landroid/graphics/drawable/Drawable;)V
	 /* .line 25 */
	 (( c.b.q.k2 ) v0 ).d ( v3 ); // invoke-virtual {v0, v3}, Lc/b/q/k2;->d(I)Ljava/lang/String;
	 (( c.b.q.m0 ) p4 ).a ( v3 ); // invoke-virtual {p4, v3}, Lc/b/q/m0;->a(Ljava/lang/CharSequence;)V
	 /* .line 26 */
	 (( c.b.q.k2 ) v1 ).a ( ); // invoke-virtual {v1}, Lc/b/q/k2;->a()V
	 /* .line 27 */
	 this.g = p4;
	 /* .line 28 */
	 /* new-instance v1, Lc/b/q/f0; */
	 /* invoke-direct {v1, p0, p0, p4}, Lc/b/q/f0;-><init>(Lc/b/q/q0;Landroid/view/View;Lc/b/q/m0;)V */
	 this.d = v1;
	 /* .line 29 */
} // :cond_6
/* new-instance p4, Lc/b/q/h0; */
/* invoke-direct {p4, p0}, Lc/b/q/h0;-><init>(Lc/b/q/q0;)V */
this.g = p4;
/* .line 30 */
(( c.b.q.k2 ) v0 ).d ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/k2;->d(I)Ljava/lang/String;
/* .line 31 */
} // :goto_5
(( c.b.q.k2 ) v0 ).f ( p4 ); // invoke-virtual {v0, p4}, Lc/b/q/k2;->f(I)[Ljava/lang/CharSequence;
if ( p4 != null) { // if-eqz p4, :cond_7
/* .line 32 */
/* new-instance v1, Landroid/widget/ArrayAdapter; */
/* const v3, 0x1090008 */
/* invoke-direct {v1, p1, v3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V */
/* .line 33 */
(( android.widget.ArrayAdapter ) v1 ).setDropDownViewResource ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V
/* .line 34 */
(( c.b.q.q0 ) p0 ).setAdapter ( v1 ); // invoke-virtual {p0, v1}, Lc/b/q/q0;->setAdapter(Landroid/widget/SpinnerAdapter;)V
/* .line 35 */
} // :cond_7
(( c.b.q.k2 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/k2;->a()V
/* .line 36 */
/* iput-boolean p5, p0, Lc/b/q/q0;->f:Z */
/* .line 37 */
p1 = this.e;
if ( p1 != null) { // if-eqz p1, :cond_8
/* .line 38 */
(( c.b.q.q0 ) p0 ).setAdapter ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/q0;->setAdapter(Landroid/widget/SpinnerAdapter;)V
/* .line 39 */
this.e = v2;
/* .line 40 */
} // :cond_8
p1 = this.b;
(( c.b.q.m ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/m;->a(Landroid/util/AttributeSet;I)V
return;
} // .end method
/* # virtual methods */
public Integer a ( android.widget.SpinnerAdapter p0, android.graphics.drawable.Drawable p1 ) {
/* .locals 10 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 1 */
} // :cond_0
v1 = (( android.widget.Spinner ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/widget/Spinner;->getMeasuredWidth()I
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v1,v0 );
/* .line 2 */
v2 = (( android.widget.Spinner ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/widget/Spinner;->getMeasuredHeight()I
v2 = android.view.View$MeasureSpec .makeMeasureSpec ( v2,v0 );
/* .line 3 */
v3 = (( android.widget.Spinner ) p0 ).getSelectedItemPosition ( ); // invoke-virtual {p0}, Landroid/widget/Spinner;->getSelectedItemPosition()I
v3 = java.lang.Math .max ( v0,v3 );
v4 = /* .line 4 */
/* add-int/lit8 v5, v3, 0xf */
v4 = java.lang.Math .min ( v4,v5 );
/* sub-int v5, v4, v3 */
/* rsub-int/lit8 v5, v5, 0xf */
/* sub-int/2addr v3, v5 */
/* .line 5 */
v3 = java.lang.Math .max ( v0,v3 );
int v5 = 0; // const/4 v5, 0x0
/* move v6, v3 */
/* move-object v7, v5 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v6, v4, :cond_3 */
v8 = /* .line 6 */
/* if-eq v8, v0, :cond_1 */
/* move-object v7, v5 */
/* move v0, v8 */
/* .line 7 */
} // :cond_1
/* .line 8 */
(( android.view.View ) v7 ).getLayoutParams ( ); // invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* if-nez v8, :cond_2 */
/* .line 9 */
/* new-instance v8, Landroid/view/ViewGroup$LayoutParams; */
int v9 = -2; // const/4 v9, -0x2
/* invoke-direct {v8, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
(( android.view.View ) v7 ).setLayoutParams ( v8 ); // invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 10 */
} // :cond_2
(( android.view.View ) v7 ).measure ( v1, v2 ); // invoke-virtual {v7, v1, v2}, Landroid/view/View;->measure(II)V
/* .line 11 */
v8 = (( android.view.View ) v7 ).getMeasuredWidth ( ); // invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I
v3 = java.lang.Math .max ( v3,v8 );
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_3
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 12 */
p1 = this.i;
(( android.graphics.drawable.Drawable ) p2 ).getPadding ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* .line 13 */
p1 = this.i;
/* iget p2, p1, Landroid/graphics/Rect;->left:I */
/* iget p1, p1, Landroid/graphics/Rect;->right:I */
/* add-int/2addr p2, p1 */
/* add-int/2addr v3, p2 */
} // :cond_4
} // .end method
public void a ( ) {
/* .locals 3 */
/* .line 14 */
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_0 */
/* .line 15 */
v0 = this.g;
v1 = (( android.widget.Spinner ) p0 ).getTextDirection ( ); // invoke-virtual {p0}, Landroid/widget/Spinner;->getTextDirection()I
v2 = (( android.widget.Spinner ) p0 ).getTextAlignment ( ); // invoke-virtual {p0}, Landroid/widget/Spinner;->getTextAlignment()I
/* .line 16 */
} // :cond_0
v0 = this.g;
int v1 = -1; // const/4 v1, -0x1
} // :goto_0
return;
} // .end method
public void drawableStateChanged ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/Spinner;->drawableStateChanged()V */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.m ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/m;->a()V
} // :cond_0
return;
} // .end method
public Integer getDropDownHorizontalOffset ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = /* .line 2 */
/* .line 3 */
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* .line 4 */
v0 = /* invoke-super {p0}, Landroid/widget/Spinner;->getDropDownHorizontalOffset()I */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getDropDownVerticalOffset ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = /* .line 2 */
/* .line 3 */
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* .line 4 */
v0 = /* invoke-super {p0}, Landroid/widget/Spinner;->getDropDownVerticalOffset()I */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getDropDownWidth ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iget v0, p0, Lc/b/q/q0;->h:I */
/* .line 3 */
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* .line 4 */
v0 = /* invoke-super {p0}, Landroid/widget/Spinner;->getDropDownWidth()I */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final c.b.q.p0 getInternalPopup ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
} // .end method
public android.graphics.drawable.Drawable getPopupBackground ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* .line 3 */
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* .line 4 */
/* invoke-super {p0}, Landroid/widget/Spinner;->getPopupBackground()Landroid/graphics/drawable/Drawable; */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.content.Context getPopupContext ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public java.lang.CharSequence getPrompt ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
/* invoke-super {p0}, Landroid/widget/Spinner;->getPrompt()Ljava/lang/CharSequence; */
} // :goto_0
} // .end method
public android.content.res.ColorStateList getSupportBackgroundTintList ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.m ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/q/m;->b()Landroid/content/res/ColorStateList;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.m ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/q/m;->c()Landroid/graphics/PorterDuff$Mode;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/Spinner;->onDetachedFromWindow()V */
/* .line 2 */
v0 = this.g;
v0 = if ( v0 != null) { // if-eqz v0, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.g;
} // :cond_0
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/widget/Spinner;->onMeasure(II)V */
/* .line 2 */
p2 = this.g;
if ( p2 != null) { // if-eqz p2, :cond_0
p2 = android.view.View$MeasureSpec .getMode ( p1 );
/* const/high16 v0, -0x80000000 */
/* if-ne p2, v0, :cond_0 */
/* .line 3 */
p2 = (( android.widget.Spinner ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/widget/Spinner;->getMeasuredWidth()I
/* .line 4 */
(( android.widget.Spinner ) p0 ).getAdapter ( ); // invoke-virtual {p0}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;
(( android.widget.Spinner ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/widget/Spinner;->getBackground()Landroid/graphics/drawable/Drawable;
v0 = (( c.b.q.q0 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/b/q/q0;->a(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
/* .line 5 */
p2 = java.lang.Math .max ( p2,v0 );
/* .line 6 */
p1 = android.view.View$MeasureSpec .getSize ( p1 );
/* .line 7 */
p1 = java.lang.Math .min ( p2,p1 );
/* .line 8 */
p2 = (( android.widget.Spinner ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/widget/Spinner;->getMeasuredHeight()I
/* .line 9 */
(( android.widget.Spinner ) p0 ).setMeasuredDimension ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/widget/Spinner;->setMeasuredDimension(II)V
} // :cond_0
return;
} // .end method
public void onRestoreInstanceState ( android.os.Parcelable p0 ) {
/* .locals 1 */
/* .line 1 */
/* check-cast p1, Lc/b/q/o0; */
/* .line 2 */
(( android.view.View$BaseSavedState ) p1 ).getSuperState ( ); // invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;
/* invoke-super {p0, v0}, Landroid/widget/Spinner;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
/* .line 3 */
/* iget-boolean p1, p1, Lc/b/q/o0;->b:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4 */
(( android.widget.Spinner ) p0 ).getViewTreeObserver ( ); // invoke-virtual {p0}, Landroid/widget/Spinner;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 5 */
/* new-instance v0, Lc/b/q/g0; */
/* invoke-direct {v0, p0}, Lc/b/q/g0;-><init>(Lc/b/q/q0;)V */
/* .line 6 */
(( android.view.ViewTreeObserver ) p1 ).addOnGlobalLayoutListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
} // :cond_0
return;
} // .end method
public android.os.Parcelable onSaveInstanceState ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Lc/b/q/o0; */
/* .line 2 */
/* invoke-super {p0}, Landroid/widget/Spinner;->onSaveInstanceState()Landroid/os/Parcelable; */
/* invoke-direct {v0, v1}, Lc/b/q/o0;-><init>(Landroid/os/Parcelable;)V */
/* .line 3 */
v1 = this.g;
v1 = if ( v1 != null) { // if-eqz v1, :cond_0
if ( v1 != null) { // if-eqz v1, :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* iput-boolean v1, v0, Lc/b/q/o0;->b:Z */
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.b.q.h1 ) v0 ).onTouch ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lc/b/q/h1;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
} // :cond_0
p1 = /* invoke-super {p0, p1}, Landroid/widget/Spinner;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public Boolean performClick ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = /* .line 2 */
/* if-nez v0, :cond_0 */
/* .line 3 */
(( c.b.q.q0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/q0;->a()V
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
} // :cond_1
v0 = /* invoke-super {p0}, Landroid/widget/Spinner;->performClick()Z */
} // .end method
public void setAdapter ( android.widget.Adapter p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Landroid/widget/SpinnerAdapter; */
(( c.b.q.q0 ) p0 ).setAdapter ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/q0;->setAdapter(Landroid/widget/SpinnerAdapter;)V
return;
} // .end method
public void setAdapter ( android.widget.SpinnerAdapter p0 ) {
/* .locals 3 */
/* .line 2 */
/* iget-boolean v0, p0, Lc/b/q/q0;->f:Z */
/* if-nez v0, :cond_0 */
/* .line 3 */
this.e = p1;
return;
/* .line 4 */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V */
/* .line 5 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
v0 = this.c;
/* if-nez v0, :cond_1 */
(( android.widget.Spinner ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/Spinner;->getContext()Landroid/content/Context;
/* .line 7 */
} // :cond_1
v1 = this.g;
/* new-instance v2, Lc/b/q/i0; */
(( android.content.Context ) v0 ).getTheme ( ); // invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
/* invoke-direct {v2, p1, v0}, Lc/b/q/i0;-><init>(Landroid/widget/SpinnerAdapter;Landroid/content/res/Resources$Theme;)V */
} // :cond_2
return;
} // .end method
public void setBackgroundDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.m ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->b(Landroid/graphics/drawable/Drawable;)V
} // :cond_0
return;
} // .end method
public void setBackgroundResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setBackgroundResource(I)V */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->a(I)V
} // :cond_0
return;
} // .end method
public void setDropDownHorizontalOffset ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* .line 3 */
v0 = this.g;
/* .line 4 */
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* .line 5 */
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownHorizontalOffset(I)V */
} // :cond_1
} // :goto_0
return;
} // .end method
public void setDropDownVerticalOffset ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* .line 3 */
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* .line 4 */
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownVerticalOffset(I)V */
} // :cond_1
} // :goto_0
return;
} // .end method
public void setDropDownWidth ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iput p1, p0, Lc/b/q/q0;->h:I */
/* .line 3 */
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* .line 4 */
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownWidth(I)V */
} // :cond_1
} // :goto_0
return;
} // .end method
public void setPopupBackgroundDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* .line 3 */
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* .line 4 */
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
} // :cond_1
} // :goto_0
return;
} // .end method
public void setPopupBackgroundResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( c.b.q.q0 ) p0 ).getPopupContext ( ); // invoke-virtual {p0}, Lc/b/q/q0;->getPopupContext()Landroid/content/Context;
c.b.l.a.b .c ( v0,p1 );
(( c.b.q.q0 ) p0 ).setPopupBackgroundDrawable ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/q0;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setPrompt ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* .line 3 */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setPrompt(Ljava/lang/CharSequence;)V */
} // :goto_0
return;
} // .end method
public void setSupportBackgroundTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.m ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->b(Landroid/content/res/ColorStateList;)V
} // :cond_0
return;
} // .end method
public void setSupportBackgroundTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->a(Landroid/graphics/PorterDuff$Mode;)V
} // :cond_0
return;
} // .end method
