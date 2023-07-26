public abstract class c.v.r1 extends c.v.k0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String L;
	 /* # instance fields */
	 public Integer K;
	 /* # direct methods */
	 public static c.v.r1 ( ) {
		 /* .locals 2 */
		 final String v0 = "android:visibility:visibility"; // const-string v0, "android:visibility:visibility"
		 final String v1 = "android:visibility:parent"; // const-string v1, "android:visibility:parent"
		 /* .line 1 */
		 /* filled-new-array {v0, v1}, [Ljava/lang/String; */
		 return;
	 } // .end method
	 public c.v.r1 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/v/k0;-><init>()V */
		 int v0 = 3; // const/4 v0, 0x3
		 /* .line 2 */
		 /* iput v0, p0, Lc/v/r1;->K:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract android.animation.Animator a ( android.view.ViewGroup p0, android.view.View p1, c.v.u0 p2, c.v.u0 p3 ) {
	 } // .end method
	 public android.animation.Animator a ( android.view.ViewGroup p0, c.v.u0 p1, Integer p2, c.v.u0 p3, Integer p4 ) {
		 /* .locals 2 */
		 /* .line 9 */
		 /* iget p3, p0, Lc/v/r1;->K:I */
		 int p5 = 1; // const/4 p5, 0x1
		 /* and-int/2addr p3, p5 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* if-ne p3, p5, :cond_2 */
		 /* if-nez p4, :cond_0 */
	 } // :cond_0
	 /* if-nez p2, :cond_1 */
	 /* .line 10 */
	 p3 = this.b;
	 (( android.view.View ) p3 ).getParent ( ); // invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
	 /* check-cast p3, Landroid/view/View; */
	 int p5 = 0; // const/4 p5, 0x0
	 /* .line 11 */
	 (( c.v.k0 ) p0 ).b ( p3, p5 ); // invoke-virtual {p0, p3, p5}, Lc/v/k0;->b(Landroid/view/View;Z)Lc/v/u0;
	 /* .line 12 */
	 (( c.v.k0 ) p0 ).c ( p3, p5 ); // invoke-virtual {p0, p3, p5}, Lc/v/k0;->c(Landroid/view/View;Z)Lc/v/u0;
	 /* .line 13 */
	 (( c.v.r1 ) p0 ).b ( v1, p3 ); // invoke-virtual {p0, v1, p3}, Lc/v/r1;->b(Lc/v/u0;Lc/v/u0;)Lc/v/q1;
	 /* .line 14 */
	 /* iget-boolean p3, p3, Lc/v/q1;->a:Z */
	 if ( p3 != null) { // if-eqz p3, :cond_1
		 /* .line 15 */
	 } // :cond_1
	 p3 = this.b;
	 (( c.v.r1 ) p0 ).a ( p1, p3, p2, p4 ); // invoke-virtual {p0, p1, p3, p2, p4}, Lc/v/r1;->a(Landroid/view/ViewGroup;Landroid/view/View;Lc/v/u0;Lc/v/u0;)Landroid/animation/Animator;
} // :cond_2
} // :goto_0
} // .end method
public android.animation.Animator a ( android.view.ViewGroup p0, c.v.u0 p1, c.v.u0 p2 ) {
/* .locals 8 */
/* .line 4 */
(( c.v.r1 ) p0 ).b ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lc/v/r1;->b(Lc/v/u0;Lc/v/u0;)Lc/v/q1;
/* .line 5 */
/* iget-boolean v1, v0, Lc/v/q1;->a:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = this.e;
/* if-nez v1, :cond_0 */
v1 = this.f;
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* .line 6 */
} // :cond_0
/* iget-boolean v1, v0, Lc/v/q1;->b:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 7 */
	 /* iget v5, v0, Lc/v/q1;->c:I */
	 /* iget v7, v0, Lc/v/q1;->d:I */
	 /* move-object v2, p0 */
	 /* move-object v3, p1 */
	 /* move-object v4, p2 */
	 /* move-object v6, p3 */
	 /* invoke-virtual/range {v2 ..v7}, Lc/v/r1;->a(Landroid/view/ViewGroup;Lc/v/u0;ILc/v/u0;I)Landroid/animation/Animator; */
	 /* .line 8 */
} // :cond_1
/* iget v3, v0, Lc/v/q1;->c:I */
/* iget v5, v0, Lc/v/q1;->d:I */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v4, p3 */
/* invoke-virtual/range {v0 ..v5}, Lc/v/r1;->b(Landroid/view/ViewGroup;Lc/v/u0;ILc/v/u0;I)Landroid/animation/Animator; */
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* and-int/lit8 v0, p1, -0x4 */
/* if-nez v0, :cond_0 */
/* .line 1 */
/* iput p1, p0, Lc/v/r1;->K:I */
return;
/* .line 2 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "Only MODE_IN and MODE_OUT flags are allowed"; // const-string v0, "Only MODE_IN and MODE_OUT flags are allowed"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( c.v.u0 p0 ) {
/* .locals 0 */
/* .line 3 */
(( c.v.r1 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/v/r1;->d(Lc/v/u0;)V
return;
} // .end method
public Boolean a ( c.v.u0 p0, c.v.u0 p1 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* if-nez p2, :cond_0 */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 16 */
v1 = this.a;
final String v2 = "android:visibility:visibility"; // const-string v2, "android:visibility:visibility"
v1 = /* .line 17 */
v3 = this.a;
v2 = /* .line 18 */
/* if-eq v1, v2, :cond_1 */
/* .line 19 */
} // :cond_1
(( c.v.r1 ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/v/r1;->b(Lc/v/u0;Lc/v/u0;)Lc/v/q1;
/* .line 20 */
/* iget-boolean p2, p1, Lc/v/q1;->a:Z */
if ( p2 != null) { // if-eqz p2, :cond_3
/* iget p2, p1, Lc/v/q1;->c:I */
if ( p2 != null) { // if-eqz p2, :cond_2
/* iget p1, p1, Lc/v/q1;->d:I */
/* if-nez p1, :cond_3 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
} // .end method
public abstract android.animation.Animator b ( android.view.ViewGroup p0, android.view.View p1, c.v.u0 p2, c.v.u0 p3 ) {
} // .end method
public android.animation.Animator b ( android.view.ViewGroup p0, c.v.u0 p1, Integer p2, c.v.u0 p3, Integer p4 ) {
/* .locals 6 */
/* .line 32 */
/* iget p3, p0, Lc/v/r1;->K:I */
int v0 = 2; // const/4 v0, 0x2
/* and-int/2addr p3, v0 */
int v1 = 0; // const/4 v1, 0x0
/* if-eq p3, v0, :cond_0 */
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 33 */
p3 = this.b;
} // :cond_1
/* move-object p3, v1 */
} // :goto_0
if ( p4 != null) { // if-eqz p4, :cond_2
/* .line 34 */
v2 = this.b;
} // :cond_2
/* move-object v2, v1 */
} // :goto_1
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 35 */
(( android.view.View ) v2 ).getParent ( ); // invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* if-nez v4, :cond_3 */
} // :cond_3
int v4 = 4; // const/4 v4, 0x4
/* if-ne p5, v4, :cond_4 */
} // :cond_4
/* if-ne p3, v2, :cond_5 */
} // :goto_2
/* move-object p3, v1 */
/* goto/16 :goto_6 */
/* .line 36 */
} // :cond_5
/* iget-boolean v2, p0, Lc/v/k0;->w:Z */
if ( v2 != null) { // if-eqz v2, :cond_6
/* .line 37 */
} // :cond_6
(( android.view.View ) p3 ).getParent ( ); // invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* check-cast v2, Landroid/view/View; */
/* .line 38 */
c.v.t0 .a ( p1,p3,v2 );
} // :cond_7
} // :goto_3
if ( v2 != null) { // if-eqz v2, :cond_8
/* move-object p3, v2 */
} // :goto_4
/* move-object v2, v1 */
} // :cond_8
if ( p3 != null) { // if-eqz p3, :cond_c
/* .line 39 */
(( android.view.View ) p3 ).getParent ( ); // invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* if-nez v2, :cond_9 */
} // :goto_5
/* .line 40 */
} // :cond_9
(( android.view.View ) p3 ).getParent ( ); // invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* instance-of v2, v2, Landroid/view/View; */
if ( v2 != null) { // if-eqz v2, :cond_c
/* .line 41 */
(( android.view.View ) p3 ).getParent ( ); // invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* check-cast v2, Landroid/view/View; */
/* .line 42 */
(( c.v.k0 ) p0 ).c ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lc/v/k0;->c(Landroid/view/View;Z)Lc/v/u0;
/* .line 43 */
(( c.v.k0 ) p0 ).b ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lc/v/k0;->b(Landroid/view/View;Z)Lc/v/u0;
/* .line 44 */
(( c.v.r1 ) p0 ).b ( v4, v5 ); // invoke-virtual {p0, v4, v5}, Lc/v/r1;->b(Lc/v/u0;Lc/v/u0;)Lc/v/q1;
/* .line 45 */
/* iget-boolean v4, v4, Lc/v/q1;->a:Z */
/* if-nez v4, :cond_a */
/* .line 46 */
c.v.t0 .a ( p1,p3,v2 );
/* .line 47 */
} // :cond_a
(( android.view.View ) v2 ).getParent ( ); // invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* if-nez v4, :cond_b */
/* .line 48 */
v2 = (( android.view.View ) v2 ).getId ( ); // invoke-virtual {v2}, Landroid/view/View;->getId()I
int v4 = -1; // const/4 v4, -0x1
/* if-eq v2, v4, :cond_b */
/* .line 49 */
(( android.view.ViewGroup ) p1 ).findViewById ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
if ( v2 != null) { // if-eqz v2, :cond_b
/* iget-boolean v2, p0, Lc/v/k0;->w:Z */
if ( v2 != null) { // if-eqz v2, :cond_b
} // :cond_b
/* move-object p3, v1 */
} // :cond_c
/* move-object p3, v1 */
/* move-object v2, p3 */
} // :goto_6
int v4 = 0; // const/4 v4, 0x0
if ( p3 != null) { // if-eqz p3, :cond_e
if ( p2 != null) { // if-eqz p2, :cond_e
/* .line 50 */
p5 = this.a;
final String v1 = "android:visibility:screenLocation"; // const-string v1, "android:visibility:screenLocation"
/* check-cast p5, [I */
/* .line 51 */
/* aget v1, p5, v4 */
/* .line 52 */
/* aget p5, p5, v3 */
/* new-array v0, v0, [I */
/* .line 53 */
(( android.view.ViewGroup ) p1 ).getLocationOnScreen ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V
/* .line 54 */
/* aget v2, v0, v4 */
/* sub-int/2addr v1, v2 */
v2 = (( android.view.View ) p3 ).getLeft ( ); // invoke-virtual {p3}, Landroid/view/View;->getLeft()I
/* sub-int/2addr v1, v2 */
(( android.view.View ) p3 ).offsetLeftAndRight ( v1 ); // invoke-virtual {p3, v1}, Landroid/view/View;->offsetLeftAndRight(I)V
/* .line 55 */
/* aget v0, v0, v3 */
/* sub-int/2addr p5, v0 */
v0 = (( android.view.View ) p3 ).getTop ( ); // invoke-virtual {p3}, Landroid/view/View;->getTop()I
/* sub-int/2addr p5, v0 */
(( android.view.View ) p3 ).offsetTopAndBottom ( p5 ); // invoke-virtual {p3, p5}, Landroid/view/View;->offsetTopAndBottom(I)V
/* .line 56 */
c.v.z0 .a ( p1 );
/* .line 57 */
/* .line 58 */
(( c.v.r1 ) p0 ).b ( p1, p3, p2, p4 ); // invoke-virtual {p0, p1, p3, p2, p4}, Lc/v/r1;->b(Landroid/view/ViewGroup;Landroid/view/View;Lc/v/u0;Lc/v/u0;)Landroid/animation/Animator;
/* if-nez p1, :cond_d */
/* .line 59 */
/* .line 60 */
} // :cond_d
/* new-instance p2, Lc/v/o1; */
/* invoke-direct {p2, p0, p5, p3}, Lc/v/o1;-><init>(Lc/v/r1;Lc/v/y0;Landroid/view/View;)V */
(( android.animation.Animator ) p1 ).addListener ( p2 ); // invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V
} // :goto_7
} // :cond_e
if ( v2 != null) { // if-eqz v2, :cond_10
/* .line 61 */
p3 = (( android.view.View ) v2 ).getVisibility ( ); // invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
/* .line 62 */
c.v.j1 .a ( v2,v4 );
/* .line 63 */
(( c.v.r1 ) p0 ).b ( p1, v2, p2, p4 ); // invoke-virtual {p0, p1, v2, p2, p4}, Lc/v/r1;->b(Landroid/view/ViewGroup;Landroid/view/View;Lc/v/u0;Lc/v/u0;)Landroid/animation/Animator;
if ( p1 != null) { // if-eqz p1, :cond_f
/* .line 64 */
/* new-instance p2, Lc/v/p1; */
/* invoke-direct {p2, v2, p5, v3}, Lc/v/p1;-><init>(Landroid/view/View;IZ)V */
/* .line 65 */
(( android.animation.Animator ) p1 ).addListener ( p2 ); // invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V
/* .line 66 */
c.v.b .a ( p1,p2 );
/* .line 67 */
(( c.v.k0 ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/v/k0;->a(Lc/v/j0;)Lc/v/k0;
/* .line 68 */
} // :cond_f
c.v.j1 .a ( v2,p3 );
} // :goto_8
} // :cond_10
} // .end method
public final c.v.q1 b ( c.v.u0 p0, c.v.u0 p1 ) {
/* .locals 7 */
/* .line 1 */
/* new-instance v0, Lc/v/q1; */
/* invoke-direct {v0}, Lc/v/q1;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
/* iput-boolean v1, v0, Lc/v/q1;->a:Z */
/* .line 3 */
/* iput-boolean v1, v0, Lc/v/q1;->b:Z */
final String v2 = "android:visibility:parent"; // const-string v2, "android:visibility:parent"
int v3 = 0; // const/4 v3, 0x0
int v4 = -1; // const/4 v4, -0x1
final String v5 = "android:visibility:visibility"; // const-string v5, "android:visibility:visibility"
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4 */
v6 = v6 = this.a;
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 5 */
v6 = this.a;
/* check-cast v6, Ljava/lang/Integer; */
v6 = (( java.lang.Integer ) v6 ).intValue ( ); // invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I
/* iput v6, v0, Lc/v/q1;->c:I */
/* .line 6 */
v6 = this.a;
/* check-cast v6, Landroid/view/ViewGroup; */
this.e = v6;
/* .line 7 */
} // :cond_0
/* iput v4, v0, Lc/v/q1;->c:I */
/* .line 8 */
this.e = v3;
} // :goto_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 9 */
v6 = v6 = this.a;
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 10 */
v3 = this.a;
/* check-cast v3, Ljava/lang/Integer; */
v3 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* iput v3, v0, Lc/v/q1;->d:I */
/* .line 11 */
v3 = this.a;
/* check-cast v2, Landroid/view/ViewGroup; */
this.f = v2;
/* .line 12 */
} // :cond_1
/* iput v4, v0, Lc/v/q1;->d:I */
/* .line 13 */
this.f = v3;
} // :goto_1
int v2 = 1; // const/4 v2, 0x1
if ( p1 != null) { // if-eqz p1, :cond_6
if ( p2 != null) { // if-eqz p2, :cond_6
/* .line 14 */
/* iget p1, v0, Lc/v/q1;->c:I */
/* iget p2, v0, Lc/v/q1;->d:I */
/* if-ne p1, p2, :cond_2 */
p1 = this.e;
p2 = this.f;
/* if-ne p1, p2, :cond_2 */
/* .line 15 */
} // :cond_2
/* iget p1, v0, Lc/v/q1;->c:I */
/* iget p2, v0, Lc/v/q1;->d:I */
/* if-eq p1, p2, :cond_4 */
/* if-nez p1, :cond_3 */
/* .line 16 */
/* iput-boolean v1, v0, Lc/v/q1;->b:Z */
/* .line 17 */
/* iput-boolean v2, v0, Lc/v/q1;->a:Z */
} // :cond_3
/* if-nez p2, :cond_8 */
/* .line 18 */
/* iput-boolean v2, v0, Lc/v/q1;->b:Z */
/* .line 19 */
/* iput-boolean v2, v0, Lc/v/q1;->a:Z */
/* .line 20 */
} // :cond_4
p1 = this.f;
/* if-nez p1, :cond_5 */
/* .line 21 */
/* iput-boolean v1, v0, Lc/v/q1;->b:Z */
/* .line 22 */
/* iput-boolean v2, v0, Lc/v/q1;->a:Z */
/* .line 23 */
} // :cond_5
p1 = this.e;
/* if-nez p1, :cond_8 */
/* .line 24 */
/* iput-boolean v2, v0, Lc/v/q1;->b:Z */
/* .line 25 */
/* iput-boolean v2, v0, Lc/v/q1;->a:Z */
} // :cond_6
/* if-nez p1, :cond_7 */
/* .line 26 */
/* iget p1, v0, Lc/v/q1;->d:I */
/* if-nez p1, :cond_7 */
/* .line 27 */
/* iput-boolean v2, v0, Lc/v/q1;->b:Z */
/* .line 28 */
/* iput-boolean v2, v0, Lc/v/q1;->a:Z */
} // :cond_7
/* if-nez p2, :cond_8 */
/* .line 29 */
/* iget p1, v0, Lc/v/q1;->c:I */
/* if-nez p1, :cond_8 */
/* .line 30 */
/* iput-boolean v1, v0, Lc/v/q1;->b:Z */
/* .line 31 */
/* iput-boolean v2, v0, Lc/v/q1;->a:Z */
} // :cond_8
} // :goto_2
} // .end method
public void c ( c.v.u0 p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.v.r1 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/v/r1;->d(Lc/v/u0;)V
return;
} // .end method
public final void d ( c.v.u0 p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
v0 = (( android.view.View ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
/* .line 2 */
v1 = this.a;
java.lang.Integer .valueOf ( v0 );
final String v2 = "android:visibility:visibility"; // const-string v2, "android:visibility:visibility"
/* .line 3 */
v0 = this.a;
v1 = this.b;
(( android.view.View ) v1 ).getParent ( ); // invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
final String v2 = "android:visibility:parent"; // const-string v2, "android:visibility:parent"
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [I */
/* .line 4 */
v1 = this.b;
(( android.view.View ) v1 ).getLocationOnScreen ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V
/* .line 5 */
p1 = this.a;
final String v1 = "android:visibility:screenLocation"; // const-string v1, "android:visibility:screenLocation"
return;
} // .end method
public java.lang.String n ( ) {
/* .locals 1 */
/* .line 1 */
v0 = c.v.r1.L;
} // .end method
