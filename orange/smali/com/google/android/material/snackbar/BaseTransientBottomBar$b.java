public abstract class com.google.android.material.snackbar.BaseTransientBottomBar$b extends android.widget.FrameLayout {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/android/material/snackbar/BaseTransientBottomBar; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "b" */
} // .end annotation
/* # instance fields */
public final android.view.accessibility.AccessibilityManager b;
public final c.h.n.v1.c c;
public e.f.a.c.s.o d;
public e.f.a.c.s.n e;
/* # direct methods */
public com.google.android.material.snackbar.BaseTransientBottomBar$b ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public com.google.android.material.snackbar.BaseTransientBottomBar$b ( ) {
/* .locals 2 */
/* .line 2 */
/* invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* .line 3 */
v0 = e.f.a.c.i.SnackbarLayout;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
/* .line 4 */
v0 = (( android.content.res.TypedArray ) p2 ).hasValue ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 5 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 6 */
	 v0 = 	 (( android.content.res.TypedArray ) p2 ).getDimensionPixelSize ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
	 /* int-to-float v0, v0 */
	 /* .line 7 */
	 c.h.n.v0 .a ( p0,v0 );
	 /* .line 8 */
} // :cond_0
(( android.content.res.TypedArray ) p2 ).recycle ( ); // invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V
final String p2 = "accessibility"; // const-string p2, "accessibility"
/* .line 9 */
(( android.content.Context ) p1 ).getSystemService ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p1, Landroid/view/accessibility/AccessibilityManager; */
this.b = p1;
/* .line 10 */
/* new-instance p1, Le/f/a/c/s/p; */
/* invoke-direct {p1, p0}, Le/f/a/c/s/p;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;)V */
this.c = p1;
/* .line 11 */
p2 = this.b;
c.h.n.v1.e .a ( p2,p1 );
/* .line 12 */
p1 = this.b;
p1 = (( android.view.accessibility.AccessibilityManager ) p1 ).isTouchExplorationEnabled ( ); // invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z
/* invoke-direct {p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->setClickableOrFocusableBasedOnAccessibility(Z)V */
return;
} // .end method
public static void a ( com.google.android.material.snackbar.BaseTransientBottomBar$b p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->setClickableOrFocusableBasedOnAccessibility(Z)V */
return;
} // .end method
private void setClickableOrFocusableBasedOnAccessibility ( Boolean p0 ) {
/* .locals 1 */
/* xor-int/lit8 v0, p1, 0x1 */
/* .line 1 */
(( android.widget.FrameLayout ) p0 ).setClickable ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setClickable(Z)V
/* .line 2 */
(( android.widget.FrameLayout ) p0 ).setFocusable ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setFocusable(Z)V
return;
} // .end method
/* # virtual methods */
public void onAttachedToWindow ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V */
/* .line 2 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 3 */
	 /* .line 4 */
} // :cond_0
c.h.n.v0 .I ( p0 );
return;
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V */
/* .line 2 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 3 */
	 /* .line 4 */
} // :cond_0
v0 = this.b;
v1 = this.c;
c.h.n.v1.e .b ( v0,v1 );
return;
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 6 */
/* .line 1 */
/* invoke-super/range {p0 ..p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V */
/* .line 2 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* move-object v1, p0 */
	 /* move v2, p2 */
	 /* move v3, p3 */
	 /* move v4, p4 */
	 /* move v5, p5 */
	 /* .line 3 */
	 /* invoke-interface/range {v0 ..v5}, Le/f/a/c/s/o;->a(Landroid/view/View;IIII)V */
} // :cond_0
return;
} // .end method
public void setOnAttachStateChangeListener ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
this.e = p1;
return;
} // .end method
public void setOnLayoutChangeListener ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
return;
} // .end method
