public class c.b.q.s2 implements android.view.View$OnLongClickListener implements android.view.View$OnHoverListener implements android.view.View$OnAttachStateChangeListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static c.b.q.s2 k;
	 public static c.b.q.s2 l;
	 /* # instance fields */
	 public final android.view.View b;
	 public final java.lang.CharSequence c;
	 public final Integer d;
	 public final java.lang.Runnable e;
	 public final java.lang.Runnable f;
	 public Integer g;
	 public Integer h;
	 public c.b.q.t2 i;
	 public Boolean j;
	 /* # direct methods */
	 public c.b.q.s2 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lc/b/q/q2; */
		 /* invoke-direct {v0, p0}, Lc/b/q/q2;-><init>(Lc/b/q/s2;)V */
		 this.e = v0;
		 /* .line 3 */
		 /* new-instance v0, Lc/b/q/r2; */
		 /* invoke-direct {v0, p0}, Lc/b/q/r2;-><init>(Lc/b/q/s2;)V */
		 this.f = v0;
		 /* .line 4 */
		 this.b = p1;
		 /* .line 5 */
		 this.c = p2;
		 /* .line 6 */
		 (( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
		 android.view.ViewConfiguration .get ( p1 );
		 /* .line 7 */
		 p1 = 		 c.h.n.w0 .a ( p1 );
		 /* iput p1, p0, Lc/b/q/s2;->d:I */
		 /* .line 8 */
		 (( c.b.q.s2 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/q/s2;->b()V
		 /* .line 9 */
		 p1 = this.b;
		 (( android.view.View ) p1 ).setOnLongClickListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
		 /* .line 10 */
		 p1 = this.b;
		 (( android.view.View ) p1 ).setOnHoverListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, java.lang.CharSequence p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = c.b.q.s2.k;
		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.b;
			 /* if-ne v0, p0, :cond_0 */
			 /* .line 2 */
			 c.b.q.s2 .a ( v1 );
			 /* .line 3 */
		 } // :cond_0
		 v0 = 		 android.text.TextUtils .isEmpty ( p1 );
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 4 */
			 p1 = c.b.q.s2.l;
			 if ( p1 != null) { // if-eqz p1, :cond_1
				 v0 = this.b;
				 /* if-ne v0, p0, :cond_1 */
				 /* .line 5 */
				 (( c.b.q.s2 ) p1 ).c ( ); // invoke-virtual {p1}, Lc/b/q/s2;->c()V
				 /* .line 6 */
			 } // :cond_1
			 (( android.view.View ) p0 ).setOnLongClickListener ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
			 int p1 = 0; // const/4 p1, 0x0
			 /* .line 7 */
			 (( android.view.View ) p0 ).setLongClickable ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setLongClickable(Z)V
			 /* .line 8 */
			 (( android.view.View ) p0 ).setOnHoverListener ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V
			 /* .line 9 */
		 } // :cond_2
		 /* new-instance v0, Lc/b/q/s2; */
		 /* invoke-direct {v0, p0, p1}, Lc/b/q/s2;-><init>(Landroid/view/View;Ljava/lang/CharSequence;)V */
	 } // :goto_0
	 return;
} // .end method
public static void a ( c.b.q.s2 p0 ) {
	 /* .locals 1 */
	 /* .line 25 */
	 v0 = c.b.q.s2.k;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 26 */
		 (( c.b.q.s2 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/s2;->a()V
		 /* .line 27 */
	 } // :cond_0
	 if ( p0 != null) { // if-eqz p0, :cond_1
		 /* .line 28 */
		 (( c.b.q.s2 ) p0 ).d ( ); // invoke-virtual {p0}, Lc/b/q/s2;->d()V
	 } // :cond_1
	 return;
} // .end method
/* # virtual methods */
public final void a ( ) {
	 /* .locals 2 */
	 /* .line 29 */
	 v0 = this.b;
	 v1 = this.e;
	 (( android.view.View ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
	 return;
} // .end method
public void a ( Boolean p0 ) {
	 /* .locals 7 */
	 /* .line 10 */
	 v0 = this.b;
	 v0 = 	 c.h.n.v0 .C ( v0 );
	 /* if-nez v0, :cond_0 */
	 return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
c.b.q.s2 .a ( v0 );
/* .line 12 */
v0 = c.b.q.s2.l;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 13 */
	 (( c.b.q.s2 ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/q/s2;->c()V
	 /* .line 14 */
} // :cond_1
/* .line 15 */
/* iput-boolean p1, p0, Lc/b/q/s2;->j:Z */
/* .line 16 */
/* new-instance v1, Lc/b/q/t2; */
p1 = this.b;
(( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
/* invoke-direct {v1, p1}, Lc/b/q/t2;-><init>(Landroid/content/Context;)V */
this.i = v1;
/* .line 17 */
v2 = this.b;
/* iget v3, p0, Lc/b/q/s2;->g:I */
/* iget v4, p0, Lc/b/q/s2;->h:I */
/* iget-boolean v5, p0, Lc/b/q/s2;->j:Z */
v6 = this.c;
/* invoke-virtual/range {v1 ..v6}, Lc/b/q/t2;->a(Landroid/view/View;IIZLjava/lang/CharSequence;)V */
/* .line 18 */
p1 = this.b;
(( android.view.View ) p1 ).addOnAttachStateChangeListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
/* .line 19 */
/* iget-boolean p1, p0, Lc/b/q/s2;->j:Z */
if ( p1 != null) { // if-eqz p1, :cond_2
	 /* const-wide/16 v0, 0x9c4 */
	 /* .line 20 */
} // :cond_2
p1 = this.b;
p1 = c.h.n.v0 .w ( p1 );
int v0 = 1; // const/4 v0, 0x1
/* and-int/2addr p1, v0 */
/* if-ne p1, v0, :cond_3 */
/* const-wide/16 v0, 0xbb8 */
/* .line 21 */
p1 = android.view.ViewConfiguration .getLongPressTimeout ( );
} // :cond_3
/* const-wide/16 v0, 0x3a98 */
/* .line 22 */
p1 = android.view.ViewConfiguration .getLongPressTimeout ( );
} // :goto_0
/* int-to-long v2, p1 */
/* sub-long/2addr v0, v2 */
/* .line 23 */
} // :goto_1
p1 = this.b;
v2 = this.f;
(( android.view.View ) p1 ).removeCallbacks ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 24 */
p1 = this.b;
v2 = this.f;
(( android.view.View ) p1 ).postDelayed ( v2, v0, v1 ); // invoke-virtual {p1, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
return;
} // .end method
public final Boolean a ( android.view.MotionEvent p0 ) {
/* .locals 3 */
/* .line 30 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v0, v0 */
/* .line 31 */
p1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int p1, p1 */
/* .line 32 */
/* iget v1, p0, Lc/b/q/s2;->g:I */
/* sub-int v1, v0, v1 */
v1 = java.lang.Math .abs ( v1 );
/* iget v2, p0, Lc/b/q/s2;->d:I */
/* if-gt v1, v2, :cond_0 */
/* iget v1, p0, Lc/b/q/s2;->h:I */
/* sub-int v1, p1, v1 */
/* .line 33 */
v1 = java.lang.Math .abs ( v1 );
/* iget v2, p0, Lc/b/q/s2;->d:I */
/* if-gt v1, v2, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 34 */
} // :cond_0
/* iput v0, p0, Lc/b/q/s2;->g:I */
/* .line 35 */
/* iput p1, p0, Lc/b/q/s2;->h:I */
int p1 = 1; // const/4 p1, 0x1
} // .end method
public final void b ( ) {
/* .locals 1 */
/* const v0, 0x7fffffff */
/* .line 1 */
/* iput v0, p0, Lc/b/q/s2;->g:I */
/* .line 2 */
/* iput v0, p0, Lc/b/q/s2;->h:I */
return;
} // .end method
public void c ( ) {
/* .locals 3 */
/* .line 1 */
v0 = c.b.q.s2.l;
int v1 = 0; // const/4 v1, 0x0
/* if-ne v0, p0, :cond_1 */
/* .line 2 */
/* .line 3 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
(( c.b.q.t2 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/t2;->a()V
/* .line 5 */
this.i = v1;
/* .line 6 */
(( c.b.q.s2 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/q/s2;->b()V
/* .line 7 */
v0 = this.b;
(( android.view.View ) v0 ).removeOnAttachStateChangeListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
} // :cond_0
final String v0 = "TooltipCompatHandler"; // const-string v0, "TooltipCompatHandler"
final String v2 = "sActiveHandler.mPopup == null"; // const-string v2, "sActiveHandler.mPopup == null"
/* .line 8 */
android.util.Log .e ( v0,v2 );
/* .line 9 */
} // :cond_1
} // :goto_0
v0 = c.b.q.s2.k;
/* if-ne v0, p0, :cond_2 */
/* .line 10 */
c.b.q.s2 .a ( v1 );
/* .line 11 */
} // :cond_2
v0 = this.b;
v1 = this.f;
(( android.view.View ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
return;
} // .end method
public final void d ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.b;
v1 = this.e;
v2 = android.view.ViewConfiguration .getLongPressTimeout ( );
/* int-to-long v2, v2 */
(( android.view.View ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
return;
} // .end method
public Boolean onHover ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 2 */
/* .line 1 */
p1 = this.i;
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
/* iget-boolean p1, p0, Lc/b/q/s2;->j:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
} // :cond_0
p1 = this.b;
/* .line 3 */
(( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
final String v1 = "accessibility"; // const-string v1, "accessibility"
(( android.content.Context ) p1 ).getSystemService ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p1, Landroid/view/accessibility/AccessibilityManager; */
/* .line 4 */
v1 = (( android.view.accessibility.AccessibilityManager ) p1 ).isEnabled ( ); // invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z
if ( v1 != null) { // if-eqz v1, :cond_1
p1 = (( android.view.accessibility.AccessibilityManager ) p1 ).isTouchExplorationEnabled ( ); // invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 5 */
} // :cond_1
p1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
int v1 = 7; // const/4 v1, 0x7
/* if-eq p1, v1, :cond_3 */
/* const/16 p2, 0xa */
/* if-eq p1, p2, :cond_2 */
/* .line 6 */
} // :cond_2
(( c.b.q.s2 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/q/s2;->b()V
/* .line 7 */
(( c.b.q.s2 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/q/s2;->c()V
/* .line 8 */
} // :cond_3
p1 = this.b;
p1 = (( android.view.View ) p1 ).isEnabled ( ); // invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z
if ( p1 != null) { // if-eqz p1, :cond_4
p1 = this.i;
/* if-nez p1, :cond_4 */
p1 = (( c.b.q.s2 ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/s2;->a(Landroid/view/MotionEvent;)Z
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 9 */
c.b.q.s2 .a ( p0 );
} // :cond_4
} // :goto_0
} // .end method
public Boolean onLongClick ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* div-int/lit8 v0, v0, 0x2 */
/* iput v0, p0, Lc/b/q/s2;->g:I */
/* .line 2 */
p1 = (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
/* div-int/lit8 p1, p1, 0x2 */
/* iput p1, p0, Lc/b/q/s2;->h:I */
int p1 = 1; // const/4 p1, 0x1
/* .line 3 */
(( c.b.q.s2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/s2;->a(Z)V
} // .end method
public void onViewAttachedToWindow ( android.view.View p0 ) {
/* .locals 0 */
return;
} // .end method
public void onViewDetachedFromWindow ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.b.q.s2 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/q/s2;->c()V
return;
} // .end method
