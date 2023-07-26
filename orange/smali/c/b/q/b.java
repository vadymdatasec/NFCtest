public abstract class c.b.q.b extends android.view.ViewGroup {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.b.q.a b;
	 public final android.content.Context c;
	 public androidx.appcompat.widget.ActionMenuView d;
	 public c.b.q.k e;
	 public Integer f;
	 public c.h.n.c1 g;
	 public Boolean h;
	 public Boolean i;
	 /* # direct methods */
	 public c.b.q.b ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 2 */
		 /* new-instance p2, Lc/b/q/a; */
		 /* invoke-direct {p2, p0}, Lc/b/q/a;-><init>(Lc/b/q/b;)V */
		 this.b = p2;
		 /* .line 3 */
		 /* new-instance p2, Landroid/util/TypedValue; */
		 /* invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V */
		 /* .line 4 */
		 (( android.content.Context ) p1 ).getTheme ( ); // invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
		 int v1 = 1; // const/4 v1, 0x1
		 p3 = 		 (( android.content.res.Resources$Theme ) p3 ).resolveAttribute ( v0, p2, v1 ); // invoke-virtual {p3, v0, p2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 /* iget p3, p2, Landroid/util/TypedValue;->resourceId:I */
			 if ( p3 != null) { // if-eqz p3, :cond_0
				 /* .line 5 */
				 /* new-instance p3, Landroid/view/ContextThemeWrapper; */
				 /* iget p2, p2, Landroid/util/TypedValue;->resourceId:I */
				 /* invoke-direct {p3, p1, p2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V */
				 this.c = p3;
				 /* .line 6 */
			 } // :cond_0
			 this.c = p1;
		 } // :goto_0
		 return;
	 } // .end method
	 public static Integer a ( Integer p0, Integer p1, Boolean p2 ) {
		 /* .locals 0 */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* sub-int/2addr p0, p1 */
		 } // :cond_0
		 /* add-int/2addr p0, p1 */
	 } // :goto_0
} // .end method
public static void a ( Object p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V */
	 return;
} // .end method
public static void b ( Object p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V */
	 return;
} // .end method
/* # virtual methods */
public Integer a ( android.view.View p0, Integer p1, Integer p2, Integer p3 ) {
	 /* .locals 1 */
	 /* const/high16 v0, -0x80000000 */
	 /* .line 12 */
	 v0 = 	 android.view.View$MeasureSpec .makeMeasureSpec ( p2,v0 );
	 (( android.view.View ) p1 ).measure ( v0, p3 ); // invoke-virtual {p1, v0, p3}, Landroid/view/View;->measure(II)V
	 /* .line 13 */
	 p1 = 	 (( android.view.View ) p1 ).getMeasuredWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
	 /* sub-int/2addr p2, p1 */
	 /* sub-int/2addr p2, p4 */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 14 */
	 p1 = 	 java.lang.Math .max ( p1,p2 );
} // .end method
public Integer a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Boolean p4 ) {
	 /* .locals 2 */
	 /* .line 15 */
	 v0 = 	 (( android.view.View ) p1 ).getMeasuredWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
	 /* .line 16 */
	 v1 = 	 (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
	 /* sub-int/2addr p4, v1 */
	 /* .line 17 */
	 /* div-int/lit8 p4, p4, 0x2 */
	 /* add-int/2addr p3, p4 */
	 if ( p5 != null) { // if-eqz p5, :cond_0
		 /* sub-int p4, p2, v0 */
		 /* add-int/2addr v1, p3 */
		 /* .line 18 */
		 (( android.view.View ) p1 ).layout ( p4, p3, p2, v1 ); // invoke-virtual {p1, p4, p3, p2, v1}, Landroid/view/View;->layout(IIII)V
	 } // :cond_0
	 /* add-int p4, p2, v0 */
	 /* add-int/2addr v1, p3 */
	 /* .line 19 */
	 (( android.view.View ) p1 ).layout ( p2, p3, p4, v1 ); // invoke-virtual {p1, p2, p3, p4, v1}, Landroid/view/View;->layout(IIII)V
} // :goto_0
if ( p5 != null) { // if-eqz p5, :cond_1
	 /* neg-int v0, v0 */
} // :cond_1
} // .end method
public c.h.n.c1 a ( Integer p0, Long p1 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 3 */
	 (( c.h.n.c1 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/n/c1;->a()V
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_2 */
/* .line 4 */
v1 = (( android.view.ViewGroup ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getVisibility()I
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 5 */
	 (( android.view.ViewGroup ) p0 ).setAlpha ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setAlpha(F)V
	 /* .line 6 */
} // :cond_1
c.h.n.v0 .a ( p0 );
/* const/high16 v1, 0x3f800000 # 1.0f */
(( c.h.n.c1 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/h/n/c1;->a(F)Lc/h/n/c1;
/* .line 7 */
(( c.h.n.c1 ) v0 ).a ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Lc/h/n/c1;->a(J)Lc/h/n/c1;
/* .line 8 */
p2 = this.b;
(( c.b.q.a ) p2 ).a ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Lc/b/q/a;->a(Lc/h/n/c1;I)Lc/b/q/a;
(( c.h.n.c1 ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lc/h/n/c1;->a(Lc/h/n/d1;)Lc/h/n/c1;
/* .line 9 */
} // :cond_2
c.h.n.v0 .a ( p0 );
(( c.h.n.c1 ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lc/h/n/c1;->a(F)Lc/h/n/c1;
/* .line 10 */
(( c.h.n.c1 ) v1 ).a ( p2, p3 ); // invoke-virtual {v1, p2, p3}, Lc/h/n/c1;->a(J)Lc/h/n/c1;
/* .line 11 */
p2 = this.b;
(( c.b.q.a ) p2 ).a ( v1, p1 ); // invoke-virtual {p2, v1, p1}, Lc/b/q/a;->a(Lc/h/n/c1;I)Lc/b/q/a;
(( c.h.n.c1 ) v1 ).a ( p2 ); // invoke-virtual {v1, p2}, Lc/h/n/c1;->a(Lc/h/n/d1;)Lc/h/n/c1;
} // .end method
public Integer getAnimatedVisibility ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.b;
/* iget v0, v0, Lc/b/q/a;->b:I */
/* .line 3 */
} // :cond_0
v0 = (( android.view.ViewGroup ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getVisibility()I
} // .end method
public Integer getContentHeight ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/b;->f:I */
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 5 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
v1 = c.b.j.ActionBar;
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
(( android.content.Context ) v0 ).obtainStyledAttributes ( v4, v1, v2, v3 ); // invoke-virtual {v0, v4, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
/* .line 3 */
v1 = (( android.content.res.TypedArray ) v0 ).getLayoutDimension ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I
(( c.b.q.b ) p0 ).setContentHeight ( v1 ); // invoke-virtual {p0, v1}, Lc/b/q/b;->setContentHeight(I)V
/* .line 4 */
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
/* .line 5 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
(( c.b.q.k ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/k;->a(Landroid/content/res/Configuration;)V
} // :cond_0
return;
} // .end method
public Boolean onHoverEvent ( android.view.MotionEvent p0 ) {
/* .locals 5 */
/* .line 1 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x9 */
/* if-ne v0, v2, :cond_0 */
/* .line 2 */
/* iput-boolean v1, p0, Lc/b/q/b;->i:Z */
/* .line 3 */
} // :cond_0
/* iget-boolean v3, p0, Lc/b/q/b;->i:Z */
int v4 = 1; // const/4 v4, 0x1
/* if-nez v3, :cond_1 */
/* .line 4 */
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onHoverEvent(Landroid/view/MotionEvent;)Z */
/* if-ne v0, v2, :cond_1 */
/* if-nez p1, :cond_1 */
/* .line 5 */
/* iput-boolean v4, p0, Lc/b/q/b;->i:Z */
} // :cond_1
/* const/16 p1, 0xa */
/* if-eq v0, p1, :cond_2 */
int p1 = 3; // const/4 p1, 0x3
/* if-ne v0, p1, :cond_3 */
/* .line 6 */
} // :cond_2
/* iput-boolean v1, p0, Lc/b/q/b;->i:Z */
} // :cond_3
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
/* iput-boolean v1, p0, Lc/b/q/b;->h:Z */
/* .line 3 */
} // :cond_0
/* iget-boolean v2, p0, Lc/b/q/b;->h:Z */
int v3 = 1; // const/4 v3, 0x1
/* if-nez v2, :cond_1 */
/* .line 4 */
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z */
/* if-nez v0, :cond_1 */
/* if-nez p1, :cond_1 */
/* .line 5 */
/* iput-boolean v3, p0, Lc/b/q/b;->h:Z */
} // :cond_1
/* if-eq v0, v3, :cond_2 */
int p1 = 3; // const/4 p1, 0x3
/* if-ne v0, p1, :cond_3 */
/* .line 6 */
} // :cond_2
/* iput-boolean v1, p0, Lc/b/q/b;->h:Z */
} // :cond_3
} // .end method
public abstract void setContentHeight ( Integer p0 ) {
} // .end method
public void setVisibility ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( android.view.ViewGroup ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getVisibility()I
/* if-eq p1, v0, :cond_1 */
/* .line 2 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.h.n.c1 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/n/c1;->a()V
/* .line 4 */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V */
} // :cond_1
return;
} // .end method
