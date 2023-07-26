public class androidx.viewpager.widget.ViewPager$h extends c.h.n.d {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/viewpager/widget/ViewPager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "h" */
} // .end annotation
/* # instance fields */
public final androidx.viewpager.widget.ViewPager d; //synthetic
/* # direct methods */
public androidx.viewpager.widget.ViewPager$h ( ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
/* invoke-direct {p0}, Lc/h/n/d;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( android.view.View p0, Object p1 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/h/n/d;->a(Landroid/view/View;Lc/h/n/v1/h;)V */
/* .line 2 */
/* const-class p1, Landroidx/viewpager/widget/ViewPager; */
(( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( c.h.n.v1.h ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lc/h/n/v1/h;->a(Ljava/lang/CharSequence;)V
/* .line 3 */
p1 = (( androidx.viewpager.widget.ViewPager$h ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager$h;->b()Z
(( c.h.n.v1.h ) p2 ).f ( p1 ); // invoke-virtual {p2, p1}, Lc/h/n/v1/h;->f(Z)V
/* .line 4 */
p1 = this.d;
int v0 = 1; // const/4 v0, 0x1
p1 = (( androidx.viewpager.widget.ViewPager ) p1 ).canScrollHorizontally ( v0 ); // invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->canScrollHorizontally(I)Z
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* const/16 p1, 0x1000 */
	 /* .line 5 */
	 (( c.h.n.v1.h ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lc/h/n/v1/h;->a(I)V
	 /* .line 6 */
} // :cond_0
p1 = this.d;
int v0 = -1; // const/4 v0, -0x1
p1 = (( androidx.viewpager.widget.ViewPager ) p1 ).canScrollHorizontally ( v0 ); // invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->canScrollHorizontally(I)Z
if ( p1 != null) { // if-eqz p1, :cond_1
	 /* const/16 p1, 0x2000 */
	 /* .line 7 */
	 (( c.h.n.v1.h ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lc/h/n/v1/h;->a(I)V
} // :cond_1
return;
} // .end method
public Boolean a ( android.view.View p0, Integer p1, android.os.Bundle p2 ) {
/* .locals 1 */
/* .line 8 */
p1 = /* invoke-super {p0, p1, p2, p3}, Lc/h/n/d;->a(Landroid/view/View;ILandroid/os/Bundle;)Z */
int p3 = 1; // const/4 p3, 0x1
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
/* const/16 p1, 0x1000 */
int v0 = 0; // const/4 v0, 0x0
/* if-eq p2, p1, :cond_3 */
/* const/16 p1, 0x2000 */
/* if-eq p2, p1, :cond_1 */
/* .line 9 */
} // :cond_1
p1 = this.d;
int p2 = -1; // const/4 p2, -0x1
p1 = (( androidx.viewpager.widget.ViewPager ) p1 ).canScrollHorizontally ( p2 ); // invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->canScrollHorizontally(I)Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 10 */
p1 = this.d;
/* iget p2, p1, Landroidx/viewpager/widget/ViewPager;->g:I */
/* sub-int/2addr p2, p3 */
(( androidx.viewpager.widget.ViewPager ) p1 ).setCurrentItem ( p2 ); // invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V
} // :cond_2
/* .line 11 */
} // :cond_3
p1 = this.d;
p1 = (( androidx.viewpager.widget.ViewPager ) p1 ).canScrollHorizontally ( p3 ); // invoke-virtual {p1, p3}, Landroidx/viewpager/widget/ViewPager;->canScrollHorizontally(I)Z
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 12 */
p1 = this.d;
/* iget p2, p1, Landroidx/viewpager/widget/ViewPager;->g:I */
/* add-int/2addr p2, p3 */
(( androidx.viewpager.widget.ViewPager ) p1 ).setCurrentItem ( p2 ); // invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V
} // :cond_4
} // .end method
public void b ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/h/n/d;->b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */
/* .line 2 */
/* const-class p1, Landroidx/viewpager/widget/ViewPager; */
(( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( android.view.accessibility.AccessibilityEvent ) p2 ).setClassName ( p1 ); // invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
/* .line 3 */
p1 = (( androidx.viewpager.widget.ViewPager$h ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager$h;->b()Z
(( android.view.accessibility.AccessibilityEvent ) p2 ).setScrollable ( p1 ); // invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V
/* .line 4 */
p1 = (( android.view.accessibility.AccessibilityEvent ) p2 ).getEventType ( ); // invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I
/* const/16 v0, 0x1000 */
/* if-ne p1, v0, :cond_0 */
p1 = this.d;
p1 = this.f;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 5 */
p1 = (( c.y.a.a ) p1 ).a ( ); // invoke-virtual {p1}, Lc/y/a/a;->a()I
(( android.view.accessibility.AccessibilityEvent ) p2 ).setItemCount ( p1 ); // invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V
/* .line 6 */
p1 = this.d;
/* iget p1, p1, Landroidx/viewpager/widget/ViewPager;->g:I */
(( android.view.accessibility.AccessibilityEvent ) p2 ).setFromIndex ( p1 ); // invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V
/* .line 7 */
p1 = this.d;
/* iget p1, p1, Landroidx/viewpager/widget/ViewPager;->g:I */
(( android.view.accessibility.AccessibilityEvent ) p2 ).setToIndex ( p1 ); // invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V
} // :cond_0
return;
} // .end method
public final Boolean b ( ) {
/* .locals 2 */
/* .line 8 */
v0 = this.d;
v0 = this.f;
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.y.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/y/a/a;->a()I
/* if-le v0, v1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
