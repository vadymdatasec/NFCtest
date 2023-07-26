public class androidx.core.widget.NestedScrollView$a extends c.h.n.d {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/core/widget/NestedScrollView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # direct methods */
public androidx.core.widget.NestedScrollView$a ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Lc/h/n/d;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( android.view.View p0, Object p1 ) {
/* .locals 2 */
/* .line 16 */
/* invoke-super {p0, p1, p2}, Lc/h/n/d;->a(Landroid/view/View;Lc/h/n/v1/h;)V */
/* .line 17 */
/* check-cast p1, Landroidx/core/widget/NestedScrollView; */
/* .line 18 */
/* const-class v0, Landroid/widget/ScrollView; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( c.h.n.v1.h ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Lc/h/n/v1/h;->a(Ljava/lang/CharSequence;)V
/* .line 19 */
v0 = (( android.widget.FrameLayout ) p1 ).isEnabled ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->isEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 20 */
	 v0 = 	 (( androidx.core.widget.NestedScrollView ) p1 ).getScrollRange ( ); // invoke-virtual {p1}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I
	 /* if-lez v0, :cond_1 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* .line 21 */
	 (( c.h.n.v1.h ) p2 ).f ( v1 ); // invoke-virtual {p2, v1}, Lc/h/n/v1/h;->f(Z)V
	 /* .line 22 */
	 v1 = 	 (( android.widget.FrameLayout ) p1 ).getScrollY ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getScrollY()I
	 /* if-lez v1, :cond_0 */
	 /* .line 23 */
	 v1 = c.h.n.v1.f.e;
	 (( c.h.n.v1.h ) p2 ).a ( v1 ); // invoke-virtual {p2, v1}, Lc/h/n/v1/h;->a(Lc/h/n/v1/f;)V
	 /* .line 24 */
	 v1 = c.h.n.v1.f.f;
	 (( c.h.n.v1.h ) p2 ).a ( v1 ); // invoke-virtual {p2, v1}, Lc/h/n/v1/h;->a(Lc/h/n/v1/f;)V
	 /* .line 25 */
} // :cond_0
p1 = (( android.widget.FrameLayout ) p1 ).getScrollY ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getScrollY()I
/* if-ge p1, v0, :cond_1 */
/* .line 26 */
p1 = c.h.n.v1.f.d;
(( c.h.n.v1.h ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lc/h/n/v1/h;->a(Lc/h/n/v1/f;)V
/* .line 27 */
p1 = c.h.n.v1.f.g;
(( c.h.n.v1.h ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lc/h/n/v1/h;->a(Lc/h/n/v1/f;)V
} // :cond_1
return;
} // .end method
public Boolean a ( android.view.View p0, Integer p1, android.os.Bundle p2 ) {
/* .locals 2 */
/* .line 1 */
p3 = /* invoke-super {p0, p1, p2, p3}, Lc/h/n/d;->a(Landroid/view/View;ILandroid/os/Bundle;)Z */
int v0 = 1; // const/4 v0, 0x1
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 2 */
} // :cond_0
/* check-cast p1, Landroidx/core/widget/NestedScrollView; */
/* .line 3 */
p3 = (( android.widget.FrameLayout ) p1 ).isEnabled ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->isEnabled()Z
int v1 = 0; // const/4 v1, 0x0
/* if-nez p3, :cond_1 */
} // :cond_1
/* const/16 p3, 0x1000 */
/* if-eq p2, p3, :cond_4 */
/* const/16 p3, 0x2000 */
/* if-eq p2, p3, :cond_2 */
/* const p3, 0x1020038 */
/* if-eq p2, p3, :cond_2 */
/* const p3, 0x102003a */
/* if-eq p2, p3, :cond_4 */
/* .line 4 */
} // :cond_2
p2 = (( android.widget.FrameLayout ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getHeight()I
p3 = (( android.widget.FrameLayout ) p1 ).getPaddingBottom ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* sub-int/2addr p2, p3 */
/* .line 5 */
p3 = (( android.widget.FrameLayout ) p1 ).getPaddingTop ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getPaddingTop()I
/* sub-int/2addr p2, p3 */
/* .line 6 */
p3 = (( android.widget.FrameLayout ) p1 ).getScrollY ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getScrollY()I
/* sub-int/2addr p3, p2 */
p2 = java.lang.Math .max ( p3,v1 );
/* .line 7 */
p3 = (( android.widget.FrameLayout ) p1 ).getScrollY ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getScrollY()I
/* if-eq p2, p3, :cond_3 */
/* .line 8 */
(( androidx.core.widget.NestedScrollView ) p1 ).a ( v1, p2, v0 ); // invoke-virtual {p1, v1, p2, v0}, Landroidx/core/widget/NestedScrollView;->a(IIZ)V
} // :cond_3
/* .line 9 */
} // :cond_4
p2 = (( android.widget.FrameLayout ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getHeight()I
p3 = (( android.widget.FrameLayout ) p1 ).getPaddingBottom ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* sub-int/2addr p2, p3 */
/* .line 10 */
p3 = (( android.widget.FrameLayout ) p1 ).getPaddingTop ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getPaddingTop()I
/* sub-int/2addr p2, p3 */
/* .line 11 */
p3 = (( android.widget.FrameLayout ) p1 ).getScrollY ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getScrollY()I
/* add-int/2addr p3, p2 */
/* .line 12 */
p2 = (( androidx.core.widget.NestedScrollView ) p1 ).getScrollRange ( ); // invoke-virtual {p1}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I
/* .line 13 */
p2 = java.lang.Math .min ( p3,p2 );
/* .line 14 */
p3 = (( android.widget.FrameLayout ) p1 ).getScrollY ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getScrollY()I
/* if-eq p2, p3, :cond_5 */
/* .line 15 */
(( androidx.core.widget.NestedScrollView ) p1 ).a ( v1, p2, v0 ); // invoke-virtual {p1, v1, p2, v0}, Landroidx/core/widget/NestedScrollView;->a(IIZ)V
} // :cond_5
} // .end method
public void b ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/h/n/d;->b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */
/* .line 2 */
/* check-cast p1, Landroidx/core/widget/NestedScrollView; */
/* .line 3 */
/* const-class v0, Landroid/widget/ScrollView; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( android.view.accessibility.AccessibilityEvent ) p2 ).setClassName ( v0 ); // invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
/* .line 4 */
v0 = (( androidx.core.widget.NestedScrollView ) p1 ).getScrollRange ( ); // invoke-virtual {p1}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I
/* if-lez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
} // :goto_0
(( android.view.accessibility.AccessibilityEvent ) p2 ).setScrollable ( v0 ); // invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V
/* .line 6 */
v0 = (( android.widget.FrameLayout ) p1 ).getScrollX ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getScrollX()I
(( android.view.accessibility.AccessibilityEvent ) p2 ).setScrollX ( v0 ); // invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setScrollX(I)V
/* .line 7 */
v0 = (( android.widget.FrameLayout ) p1 ).getScrollY ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getScrollY()I
(( android.view.accessibility.AccessibilityEvent ) p2 ).setScrollY ( v0 ); // invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setScrollY(I)V
/* .line 8 */
v0 = (( android.widget.FrameLayout ) p1 ).getScrollX ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getScrollX()I
c.h.n.v1.j .a ( p2,v0 );
/* .line 9 */
p1 = (( androidx.core.widget.NestedScrollView ) p1 ).getScrollRange ( ); // invoke-virtual {p1}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I
c.h.n.v1.j .b ( p2,p1 );
return;
} // .end method
