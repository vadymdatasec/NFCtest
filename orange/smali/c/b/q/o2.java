public class c.b.q.o2 implements c.b.q.z0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public androidx.appcompat.widget.Toolbar a;
	 public Integer b;
	 public android.view.View c;
	 public android.view.View d;
	 public android.graphics.drawable.Drawable e;
	 public android.graphics.drawable.Drawable f;
	 public android.graphics.drawable.Drawable g;
	 public Boolean h;
	 public java.lang.CharSequence i;
	 public java.lang.CharSequence j;
	 public java.lang.CharSequence k;
	 public android.view.Window$Callback l;
	 public Boolean m;
	 public c.b.q.k n;
	 public Integer o;
	 public Integer p;
	 public android.graphics.drawable.Drawable q;
	 /* # direct methods */
	 public c.b.q.o2 ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0, v1}, Lc/b/q/o2;-><init>(Landroidx/appcompat/widget/Toolbar;ZII)V */
		 return;
	 } // .end method
	 public c.b.q.o2 ( ) {
		 /* .locals 3 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int p4 = 0; // const/4 p4, 0x0
		 /* .line 3 */
		 /* iput p4, p0, Lc/b/q/o2;->o:I */
		 /* .line 4 */
		 /* iput p4, p0, Lc/b/q/o2;->p:I */
		 /* .line 5 */
		 this.a = p1;
		 /* .line 6 */
		 (( androidx.appcompat.widget.Toolbar ) p1 ).getTitle ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;
		 this.i = v0;
		 /* .line 7 */
		 (( androidx.appcompat.widget.Toolbar ) p1 ).getSubtitle ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getSubtitle()Ljava/lang/CharSequence;
		 this.j = v0;
		 /* .line 8 */
		 v0 = this.i;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 /* iput-boolean v0, p0, Lc/b/q/o2;->h:Z */
	 /* .line 9 */
	 (( androidx.appcompat.widget.Toolbar ) p1 ).getNavigationIcon ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;
	 this.g = v0;
	 /* .line 10 */
	 (( android.view.ViewGroup ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
	 int v0 = 0; // const/4 v0, 0x0
	 v1 = c.b.j.ActionBar;
	 c.b.q.k2 .a ( p1,v0,v1,v2,p4 );
	 /* .line 11 */
	 (( c.b.q.k2 ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
	 this.q = v0;
	 if ( p2 != null) { // if-eqz p2, :cond_c
		 /* .line 12 */
		 (( c.b.q.k2 ) p1 ).e ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->e(I)Ljava/lang/CharSequence;
		 /* .line 13 */
		 v0 = 		 android.text.TextUtils .isEmpty ( p2 );
		 /* if-nez v0, :cond_1 */
		 /* .line 14 */
		 (( c.b.q.o2 ) p0 ).setTitle ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/o2;->setTitle(Ljava/lang/CharSequence;)V
		 /* .line 15 */
	 } // :cond_1
	 (( c.b.q.k2 ) p1 ).e ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->e(I)Ljava/lang/CharSequence;
	 /* .line 16 */
	 v0 = 	 android.text.TextUtils .isEmpty ( p2 );
	 /* if-nez v0, :cond_2 */
	 /* .line 17 */
	 (( c.b.q.o2 ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/o2;->b(Ljava/lang/CharSequence;)V
	 /* .line 18 */
} // :cond_2
(( c.b.q.k2 ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
if ( p2 != null) { // if-eqz p2, :cond_3
	 /* .line 19 */
	 (( c.b.q.o2 ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/o2;->a(Landroid/graphics/drawable/Drawable;)V
	 /* .line 20 */
} // :cond_3
(( c.b.q.k2 ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
if ( p2 != null) { // if-eqz p2, :cond_4
	 /* .line 21 */
	 (( c.b.q.o2 ) p0 ).setIcon ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/o2;->setIcon(Landroid/graphics/drawable/Drawable;)V
	 /* .line 22 */
} // :cond_4
p2 = this.g;
/* if-nez p2, :cond_5 */
p2 = this.q;
if ( p2 != null) { // if-eqz p2, :cond_5
	 /* .line 23 */
	 (( c.b.q.o2 ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/o2;->b(Landroid/graphics/drawable/Drawable;)V
	 /* .line 24 */
} // :cond_5
p2 = (( c.b.q.k2 ) p1 ).d ( p2, p4 ); // invoke-virtual {p1, p2, p4}, Lc/b/q/k2;->d(II)I
(( c.b.q.o2 ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/o2;->c(I)V
/* .line 25 */
p2 = (( c.b.q.k2 ) p1 ).g ( p2, p4 ); // invoke-virtual {p1, p2, p4}, Lc/b/q/k2;->g(II)I
if ( p2 != null) { // if-eqz p2, :cond_6
	 /* .line 26 */
	 v0 = this.a;
	 (( android.view.ViewGroup ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
	 android.view.LayoutInflater .from ( v0 );
	 v1 = this.a;
	 (( android.view.LayoutInflater ) v0 ).inflate ( p2, v1, p4 ); // invoke-virtual {v0, p2, v1, p4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
	 (( c.b.q.o2 ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/o2;->a(Landroid/view/View;)V
	 /* .line 27 */
	 /* iget p2, p0, Lc/b/q/o2;->b:I */
	 /* or-int/lit8 p2, p2, 0x10 */
	 (( c.b.q.o2 ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/o2;->c(I)V
	 /* .line 28 */
} // :cond_6
p2 = (( c.b.q.k2 ) p1 ).f ( p2, p4 ); // invoke-virtual {p1, p2, p4}, Lc/b/q/k2;->f(II)I
/* if-lez p2, :cond_7 */
/* .line 29 */
v0 = this.a;
(( android.view.ViewGroup ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 30 */
/* iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* .line 31 */
p2 = this.a;
(( android.view.ViewGroup ) p2 ).setLayoutParams ( v0 ); // invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 32 */
} // :cond_7
int v0 = -1; // const/4 v0, -0x1
p2 = (( c.b.q.k2 ) p1 ).b ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lc/b/q/k2;->b(II)I
/* .line 33 */
v0 = (( c.b.q.k2 ) p1 ).b ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lc/b/q/k2;->b(II)I
/* if-gez p2, :cond_8 */
/* if-ltz v0, :cond_9 */
/* .line 34 */
} // :cond_8
v1 = this.a;
p2 = java.lang.Math .max ( p2,p4 );
/* .line 35 */
v0 = java.lang.Math .max ( v0,p4 );
/* .line 36 */
(( androidx.appcompat.widget.Toolbar ) v1 ).a ( p2, v0 ); // invoke-virtual {v1, p2, v0}, Landroidx/appcompat/widget/Toolbar;->a(II)V
/* .line 37 */
} // :cond_9
p2 = (( c.b.q.k2 ) p1 ).g ( p2, p4 ); // invoke-virtual {p1, p2, p4}, Lc/b/q/k2;->g(II)I
if ( p2 != null) { // if-eqz p2, :cond_a
/* .line 38 */
v0 = this.a;
(( android.view.ViewGroup ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( androidx.appcompat.widget.Toolbar ) v0 ).b ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/content/Context;I)V
/* .line 39 */
} // :cond_a
p2 = (( c.b.q.k2 ) p1 ).g ( p2, p4 ); // invoke-virtual {p1, p2, p4}, Lc/b/q/k2;->g(II)I
if ( p2 != null) { // if-eqz p2, :cond_b
/* .line 40 */
v0 = this.a;
(( android.view.ViewGroup ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( androidx.appcompat.widget.Toolbar ) v0 ).a ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/content/Context;I)V
/* .line 41 */
} // :cond_b
p2 = (( c.b.q.k2 ) p1 ).g ( p2, p4 ); // invoke-virtual {p1, p2, p4}, Lc/b/q/k2;->g(II)I
if ( p2 != null) { // if-eqz p2, :cond_d
/* .line 42 */
p4 = this.a;
(( androidx.appcompat.widget.Toolbar ) p4 ).setPopupTheme ( p2 ); // invoke-virtual {p4, p2}, Landroidx/appcompat/widget/Toolbar;->setPopupTheme(I)V
/* .line 43 */
} // :cond_c
p2 = (( c.b.q.o2 ) p0 ).p ( ); // invoke-virtual {p0}, Lc/b/q/o2;->p()I
/* iput p2, p0, Lc/b/q/o2;->b:I */
/* .line 44 */
} // :cond_d
} // :goto_1
(( c.b.q.k2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/k2;->a()V
/* .line 45 */
(( c.b.q.o2 ) p0 ).d ( p3 ); // invoke-virtual {p0, p3}, Lc/b/q/o2;->d(I)V
/* .line 46 */
p1 = this.a;
(( androidx.appcompat.widget.Toolbar ) p1 ).getNavigationContentDescription ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;
this.k = p1;
/* .line 47 */
p1 = this.a;
/* new-instance p2, Lc/b/q/m2; */
/* invoke-direct {p2, p0}, Lc/b/q/m2;-><init>(Lc/b/q/o2;)V */
(( androidx.appcompat.widget.Toolbar ) p1 ).setNavigationOnClickListener ( p2 ); // invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V
return;
} // .end method
/* # virtual methods */
public c.h.n.c1 a ( Integer p0, Long p1 ) {
/* .locals 2 */
/* .line 24 */
v0 = this.a;
c.h.n.v0 .a ( v0 );
/* if-nez p1, :cond_0 */
/* const/high16 v1, 0x3f800000 # 1.0f */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 25 */
} // :goto_0
(( c.h.n.c1 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/h/n/c1;->a(F)Lc/h/n/c1;
/* .line 26 */
(( c.h.n.c1 ) v0 ).a ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Lc/h/n/c1;->a(J)Lc/h/n/c1;
/* new-instance p2, Lc/b/q/n2; */
/* invoke-direct {p2, p0, p1}, Lc/b/q/n2;-><init>(Lc/b/q/o2;I)V */
/* .line 27 */
(( c.h.n.c1 ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lc/h/n/c1;->a(Lc/h/n/d1;)Lc/h/n/c1;
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .line 30 */
v0 = this.a;
(( android.view.ViewGroup ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V
return;
} // .end method
public void a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .line 1 */
this.f = p1;
/* .line 2 */
(( c.b.q.o2 ) p0 ).s ( ); // invoke-virtual {p0}, Lc/b/q/o2;->s()V
return;
} // .end method
public void a ( android.view.Menu p0, c.b.p.o.z$a p1 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.n;
/* if-nez v0, :cond_0 */
/* .line 5 */
/* new-instance v0, Lc/b/q/k; */
v1 = this.a;
(( android.view.ViewGroup ) v1 ).getContext ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Lc/b/q/k;-><init>(Landroid/content/Context;)V */
this.n = v0;
/* .line 6 */
(( c.b.p.o.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/p/o/b;->a(I)V
/* .line 7 */
} // :cond_0
v0 = this.n;
(( c.b.p.o.b ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lc/b/p/o/b;->a(Lc/b/p/o/z$a;)V
/* .line 8 */
p2 = this.a;
/* check-cast p1, Lc/b/p/o/m; */
v0 = this.n;
(( androidx.appcompat.widget.Toolbar ) p2 ).a ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Landroidx/appcompat/widget/Toolbar;->a(Lc/b/p/o/m;Lc/b/q/k;)V
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 2 */
/* .line 19 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v1, p0, Lc/b/q/o2;->b:I */
/* and-int/lit8 v1, v1, 0x10 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 20 */
v1 = this.a;
(( android.view.ViewGroup ) v1 ).removeView ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 21 */
} // :cond_0
this.d = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 22 */
/* iget v0, p0, Lc/b/q/o2;->b:I */
/* and-int/lit8 v0, v0, 0x10 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 23 */
v0 = this.a;
(( android.view.ViewGroup ) v0 ).addView ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
} // :cond_1
return;
} // .end method
public void a ( c.b.p.o.z$a p0, c.b.p.o.m$a p1 ) {
/* .locals 1 */
/* .line 31 */
v0 = this.a;
(( androidx.appcompat.widget.Toolbar ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/Toolbar;->a(Lc/b/p/o/z$a;Lc/b/p/o/m$a;)V
return;
} // .end method
public void a ( c.b.q.c2 p0 ) {
/* .locals 2 */
/* .line 9 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
v1 = this.a;
/* if-ne v0, v1, :cond_0 */
/* .line 10 */
v0 = this.c;
(( android.view.ViewGroup ) v1 ).removeView ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 11 */
} // :cond_0
this.c = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 12 */
/* iget v0, p0, Lc/b/q/o2;->o:I */
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_1 */
/* .line 13 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( android.view.ViewGroup ) v0 ).addView ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V
/* .line 14 */
v0 = this.c;
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/appcompat/widget/Toolbar$e; */
int v1 = -2; // const/4 v1, -0x2
/* .line 15 */
/* iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* .line 16 */
/* iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
/* const v1, 0x800053 */
/* .line 17 */
/* iput v1, v0, Lc/b/k/a$a;->a:I */
int v0 = 1; // const/4 v0, 0x1
/* .line 18 */
(( c.b.q.c2 ) p1 ).setAllowCollapse ( v0 ); // invoke-virtual {p1, v0}, Lc/b/q/c2;->setAllowCollapse(Z)V
} // :cond_1
return;
} // .end method
public void a ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 28 */
this.k = p1;
/* .line 29 */
(( c.b.q.o2 ) p0 ).q ( ); // invoke-virtual {p0}, Lc/b/q/o2;->q()V
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 0 */
return;
} // .end method
public Boolean a ( ) {
/* .locals 1 */
/* .line 3 */
v0 = this.a;
v0 = (( androidx.appcompat.widget.Toolbar ) v0 ).m ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->m()Z
} // .end method
public void b ( Integer p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4 */
(( c.b.q.o2 ) p0 ).k ( ); // invoke-virtual {p0}, Lc/b/q/o2;->k()Landroid/content/Context;
c.b.l.a.b .c ( v0,p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
(( c.b.q.o2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/o2;->a(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void b ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .line 7 */
this.g = p1;
/* .line 8 */
(( c.b.q.o2 ) p0 ).r ( ); // invoke-virtual {p0}, Lc/b/q/o2;->r()V
return;
} // .end method
public void b ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
this.j = p1;
/* .line 2 */
/* iget v0, p0, Lc/b/q/o2;->b:I */
/* and-int/lit8 v0, v0, 0x8 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.a;
(( androidx.appcompat.widget.Toolbar ) v0 ).setSubtitle ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V
} // :cond_0
return;
} // .end method
public void b ( Boolean p0 ) {
/* .locals 1 */
/* .line 6 */
v0 = this.a;
(( androidx.appcompat.widget.Toolbar ) v0 ).setCollapsible ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setCollapsible(Z)V
return;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .line 5 */
v0 = this.a;
v0 = (( androidx.appcompat.widget.Toolbar ) v0 ).n ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->n()Z
} // .end method
public void c ( Integer p0 ) {
/* .locals 3 */
/* .line 5 */
/* iget v0, p0, Lc/b/q/o2;->b:I */
/* xor-int/2addr v0, p1 */
/* .line 6 */
/* iput p1, p0, Lc/b/q/o2;->b:I */
if ( v0 != null) { // if-eqz v0, :cond_6
/* and-int/lit8 v1, v0, 0x4 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* and-int/lit8 v1, p1, 0x4 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 7 */
(( c.b.q.o2 ) p0 ).q ( ); // invoke-virtual {p0}, Lc/b/q/o2;->q()V
/* .line 8 */
} // :cond_0
(( c.b.q.o2 ) p0 ).r ( ); // invoke-virtual {p0}, Lc/b/q/o2;->r()V
} // :cond_1
/* and-int/lit8 v1, v0, 0x3 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 9 */
(( c.b.q.o2 ) p0 ).s ( ); // invoke-virtual {p0}, Lc/b/q/o2;->s()V
} // :cond_2
/* and-int/lit8 v1, v0, 0x8 */
if ( v1 != null) { // if-eqz v1, :cond_4
/* and-int/lit8 v1, p1, 0x8 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 10 */
v1 = this.a;
v2 = this.i;
(( androidx.appcompat.widget.Toolbar ) v1 ).setTitle ( v2 ); // invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V
/* .line 11 */
v1 = this.a;
v2 = this.j;
(( androidx.appcompat.widget.Toolbar ) v1 ).setSubtitle ( v2 ); // invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V
/* .line 12 */
} // :cond_3
v1 = this.a;
int v2 = 0; // const/4 v2, 0x0
(( androidx.appcompat.widget.Toolbar ) v1 ).setTitle ( v2 ); // invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V
/* .line 13 */
v1 = this.a;
(( androidx.appcompat.widget.Toolbar ) v1 ).setSubtitle ( v2 ); // invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V
} // :cond_4
} // :goto_0
/* and-int/lit8 v0, v0, 0x10 */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 14 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_6
/* and-int/lit8 p1, p1, 0x10 */
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 15 */
p1 = this.a;
(( android.view.ViewGroup ) p1 ).addView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* .line 16 */
} // :cond_5
p1 = this.a;
(( android.view.ViewGroup ) p1 ).removeView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
} // :cond_6
} // :goto_1
return;
} // .end method
public final void c ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
this.i = p1;
/* .line 2 */
/* iget v0, p0, Lc/b/q/o2;->b:I */
/* and-int/lit8 v0, v0, 0x8 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.a;
(( androidx.appcompat.widget.Toolbar ) v0 ).setTitle ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V
} // :cond_0
return;
} // .end method
public Boolean c ( ) {
/* .locals 1 */
/* .line 4 */
v0 = this.a;
v0 = (( androidx.appcompat.widget.Toolbar ) v0 ).l ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->l()Z
} // .end method
public void collapseActionView ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( androidx.appcompat.widget.Toolbar ) v0 ).c ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->c()V
return;
} // .end method
public void d ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/o2;->p:I */
/* if-ne p1, v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* iput p1, p0, Lc/b/q/o2;->p:I */
/* .line 3 */
p1 = this.a;
(( androidx.appcompat.widget.Toolbar ) p1 ).getNavigationContentDescription ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;
p1 = android.text.TextUtils .isEmpty ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
/* iget p1, p0, Lc/b/q/o2;->p:I */
(( c.b.q.o2 ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/o2;->e(I)V
} // :cond_1
return;
} // .end method
public Boolean d ( ) {
/* .locals 1 */
/* .line 5 */
v0 = this.a;
v0 = (( androidx.appcompat.widget.Toolbar ) v0 ).r ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->r()Z
} // .end method
public void e ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Lc/b/q/o2;->m:Z */
return;
} // .end method
public void e ( Integer p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
(( c.b.q.o2 ) p0 ).k ( ); // invoke-virtual {p0}, Lc/b/q/o2;->k()Landroid/content/Context;
(( android.content.Context ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
} // :goto_0
(( c.b.q.o2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/o2;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
public Boolean f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = (( androidx.appcompat.widget.Toolbar ) v0 ).b ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->b()Z
} // .end method
public void g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( androidx.appcompat.widget.Toolbar ) v0 ).d ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->d()V
return;
} // .end method
public java.lang.CharSequence getTitle ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( androidx.appcompat.widget.Toolbar ) v0 ).getTitle ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;
} // .end method
public Integer h ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/o2;->b:I */
} // .end method
public android.view.Menu i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( androidx.appcompat.widget.Toolbar ) v0 ).getMenu ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;
} // .end method
public android.view.ViewGroup j ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public android.content.Context k ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( android.view.ViewGroup ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
} // .end method
public Integer l ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/o2;->o:I */
} // .end method
public void m ( ) {
/* .locals 2 */
final String v0 = "ToolbarWidgetWrapper"; // const-string v0, "ToolbarWidgetWrapper"
final String v1 = "Progress display unsupported"; // const-string v1, "Progress display unsupported"
/* .line 1 */
android.util.Log .i ( v0,v1 );
return;
} // .end method
public Boolean n ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = (( androidx.appcompat.widget.Toolbar ) v0 ).k ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->k()Z
} // .end method
public void o ( ) {
/* .locals 2 */
final String v0 = "ToolbarWidgetWrapper"; // const-string v0, "ToolbarWidgetWrapper"
final String v1 = "Progress display unsupported"; // const-string v1, "Progress display unsupported"
/* .line 1 */
android.util.Log .i ( v0,v1 );
return;
} // .end method
public final Integer p ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
(( androidx.appcompat.widget.Toolbar ) v0 ).getNavigationIcon ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/16 v0, 0xf */
/* .line 2 */
v1 = this.a;
(( androidx.appcompat.widget.Toolbar ) v1 ).getNavigationIcon ( ); // invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;
this.q = v1;
} // :cond_0
/* const/16 v0, 0xb */
} // :goto_0
} // .end method
public final void q ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/o2;->b:I */
/* and-int/lit8 v0, v0, 0x4 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = this.k;
v0 = android.text.TextUtils .isEmpty ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.a;
/* iget v1, p0, Lc/b/q/o2;->p:I */
(( androidx.appcompat.widget.Toolbar ) v0 ).setNavigationContentDescription ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(I)V
/* .line 4 */
} // :cond_0
v0 = this.a;
v1 = this.k;
(( androidx.appcompat.widget.Toolbar ) v0 ).setNavigationContentDescription ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V
} // :cond_1
} // :goto_0
return;
} // .end method
public final void r ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/o2;->b:I */
/* and-int/lit8 v0, v0, 0x4 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = this.a;
v1 = this.g;
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
v1 = this.q;
} // :goto_0
(( androidx.appcompat.widget.Toolbar ) v0 ).setNavigationIcon ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V
/* .line 3 */
} // :cond_1
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( androidx.appcompat.widget.Toolbar ) v0 ).setNavigationIcon ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V
} // :goto_1
return;
} // .end method
public final void s ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/o2;->b:I */
/* and-int/lit8 v1, v0, 0x2 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* and-int/lit8 v0, v0, 0x1 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
v0 = this.e;
/* .line 3 */
} // :cond_1
v0 = this.e;
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
} // :goto_0
v1 = this.a;
(( androidx.appcompat.widget.Toolbar ) v1 ).setLogo ( v0 ); // invoke-virtual {v1, v0}, Landroidx/appcompat/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setIcon ( Integer p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
(( c.b.q.o2 ) p0 ).k ( ); // invoke-virtual {p0}, Lc/b/q/o2;->k()Landroid/content/Context;
c.b.l.a.b .c ( v0,p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
(( c.b.q.o2 ) p0 ).setIcon ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/o2;->setIcon(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .line 2 */
this.e = p1;
/* .line 3 */
(( c.b.q.o2 ) p0 ).s ( ); // invoke-virtual {p0}, Lc/b/q/o2;->s()V
return;
} // .end method
public void setTitle ( java.lang.CharSequence p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Lc/b/q/o2;->h:Z */
/* .line 2 */
(( c.b.q.o2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/o2;->c(Ljava/lang/CharSequence;)V
return;
} // .end method
public void setWindowCallback ( android.view.Window$Callback p0 ) {
/* .locals 0 */
/* .line 1 */
this.l = p1;
return;
} // .end method
public void setWindowTitle ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/q/o2;->h:Z */
/* if-nez v0, :cond_0 */
/* .line 2 */
(( c.b.q.o2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/o2;->c(Ljava/lang/CharSequence;)V
} // :cond_0
return;
} // .end method
