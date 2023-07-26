public class androidx.appcompat.widget.Toolbar extends android.view.ViewGroup {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/appcompat/widget/Toolbar$d;, */
	 /* Landroidx/appcompat/widget/Toolbar$g;, */
	 /* Landroidx/appcompat/widget/Toolbar$e;, */
	 /* Landroidx/appcompat/widget/Toolbar$f; */
	 /* } */
} // .end annotation
/* # instance fields */
public android.content.res.ColorStateList A;
public android.content.res.ColorStateList B;
public Boolean C;
public Boolean D;
public final java.util.ArrayList E;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final java.util.ArrayList F;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final G;
public androidx.appcompat.widget.Toolbar$f H;
public final androidx.appcompat.widget.ActionMenuView$e I;
public c.b.q.o2 J;
public c.b.q.k K;
public androidx.appcompat.widget.Toolbar$d L;
public c.b.p.o.z$a M;
public c.b.p.o.m$a N;
public Boolean O;
public final java.lang.Runnable P;
public androidx.appcompat.widget.ActionMenuView b;
public android.widget.TextView c;
public android.widget.TextView d;
public android.widget.ImageButton e;
public android.widget.ImageView f;
public android.graphics.drawable.Drawable g;
public java.lang.CharSequence h;
public android.widget.ImageButton i;
public android.view.View j;
public android.content.Context k;
public Integer l;
public Integer m;
public Integer n;
public Integer o;
public Integer p;
public Integer q;
public Integer r;
public Integer s;
public Integer t;
public c.b.q.b2 u;
public Integer v;
public Integer w;
public Integer x;
public java.lang.CharSequence y;
public java.lang.CharSequence z;
/* # direct methods */
public androidx.appcompat.widget.Toolbar ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public androidx.appcompat.widget.Toolbar ( ) {
/* .locals 1 */
/* .line 2 */
/* invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public androidx.appcompat.widget.Toolbar ( ) {
/* .locals 5 */
/* .line 3 */
/* invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* const p1, 0x800013 */
/* .line 4 */
/* iput p1, p0, Landroidx/appcompat/widget/Toolbar;->x:I */
/* .line 5 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.E = p1;
/* .line 6 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.F = p1;
int p1 = 2; // const/4 p1, 0x2
/* new-array p1, p1, [I */
/* .line 7 */
this.G = p1;
/* .line 8 */
/* new-instance p1, Landroidx/appcompat/widget/Toolbar$a; */
/* invoke-direct {p1, p0}, Landroidx/appcompat/widget/Toolbar$a;-><init>(Landroidx/appcompat/widget/Toolbar;)V */
this.I = p1;
/* .line 9 */
/* new-instance p1, Landroidx/appcompat/widget/Toolbar$b; */
/* invoke-direct {p1, p0}, Landroidx/appcompat/widget/Toolbar$b;-><init>(Landroidx/appcompat/widget/Toolbar;)V */
this.P = p1;
/* .line 10 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
v0 = c.b.j.Toolbar;
int v1 = 0; // const/4 v1, 0x0
c.b.q.k2 .a ( p1,p2,v0,p3,v1 );
/* .line 11 */
p2 = (( c.b.q.k2 ) p1 ).g ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/b/q/k2;->g(II)I
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->m:I */
/* .line 12 */
p2 = (( c.b.q.k2 ) p1 ).g ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/b/q/k2;->g(II)I
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->n:I */
/* .line 13 */
/* iget p3, p0, Landroidx/appcompat/widget/Toolbar;->x:I */
p2 = (( c.b.q.k2 ) p1 ).e ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/k2;->e(II)I
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->x:I */
/* .line 14 */
/* const/16 p3, 0x30 */
p2 = (( c.b.q.k2 ) p1 ).e ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/k2;->e(II)I
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->o:I */
/* .line 15 */
p2 = (( c.b.q.k2 ) p1 ).b ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/b/q/k2;->b(II)I
/* .line 16 */
p3 = (( c.b.q.k2 ) p1 ).g ( p3 ); // invoke-virtual {p1, p3}, Lc/b/q/k2;->g(I)Z
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 17 */
p2 = (( c.b.q.k2 ) p1 ).b ( p3, p2 ); // invoke-virtual {p1, p3, p2}, Lc/b/q/k2;->b(II)I
/* .line 18 */
} // :cond_0
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->t:I */
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->s:I */
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->r:I */
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->q:I */
/* .line 19 */
int p3 = -1; // const/4 p3, -0x1
p2 = (( c.b.q.k2 ) p1 ).b ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/k2;->b(II)I
/* if-ltz p2, :cond_1 */
/* .line 20 */
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->q:I */
/* .line 21 */
} // :cond_1
p2 = (( c.b.q.k2 ) p1 ).b ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/k2;->b(II)I
/* if-ltz p2, :cond_2 */
/* .line 22 */
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->r:I */
/* .line 23 */
} // :cond_2
p2 = (( c.b.q.k2 ) p1 ).b ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/k2;->b(II)I
/* if-ltz p2, :cond_3 */
/* .line 24 */
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->s:I */
/* .line 25 */
} // :cond_3
p2 = (( c.b.q.k2 ) p1 ).b ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/k2;->b(II)I
/* if-ltz p2, :cond_4 */
/* .line 26 */
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->t:I */
/* .line 27 */
} // :cond_4
p2 = (( c.b.q.k2 ) p1 ).c ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/k2;->c(II)I
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->p:I */
/* .line 28 */
/* const/high16 p3, -0x80000000 */
/* .line 29 */
p2 = (( c.b.q.k2 ) p1 ).b ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/k2;->b(II)I
/* .line 30 */
/* .line 31 */
v0 = (( c.b.q.k2 ) p1 ).b ( v0, p3 ); // invoke-virtual {p1, v0, p3}, Lc/b/q/k2;->b(II)I
/* .line 32 */
/* .line 33 */
v2 = (( c.b.q.k2 ) p1 ).c ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Lc/b/q/k2;->c(II)I
/* .line 34 */
/* .line 35 */
v3 = (( c.b.q.k2 ) p1 ).c ( v3, v1 ); // invoke-virtual {p1, v3, v1}, Lc/b/q/k2;->c(II)I
/* .line 36 */
(( androidx.appcompat.widget.Toolbar ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->f()V
/* .line 37 */
v4 = this.u;
(( c.b.q.b2 ) v4 ).a ( v2, v3 ); // invoke-virtual {v4, v2, v3}, Lc/b/q/b2;->a(II)V
/* if-ne p2, p3, :cond_5 */
/* if-eq v0, p3, :cond_6 */
/* .line 38 */
} // :cond_5
v2 = this.u;
(( c.b.q.b2 ) v2 ).b ( p2, v0 ); // invoke-virtual {v2, p2, v0}, Lc/b/q/b2;->b(II)V
/* .line 39 */
} // :cond_6
p2 = (( c.b.q.k2 ) p1 ).b ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/k2;->b(II)I
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->v:I */
/* .line 40 */
p2 = (( c.b.q.k2 ) p1 ).b ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/k2;->b(II)I
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->w:I */
/* .line 41 */
(( c.b.q.k2 ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
this.g = p2;
/* .line 42 */
(( c.b.q.k2 ) p1 ).e ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->e(I)Ljava/lang/CharSequence;
this.h = p2;
/* .line 43 */
(( c.b.q.k2 ) p1 ).e ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->e(I)Ljava/lang/CharSequence;
/* .line 44 */
p3 = android.text.TextUtils .isEmpty ( p2 );
/* if-nez p3, :cond_7 */
/* .line 45 */
(( androidx.appcompat.widget.Toolbar ) p0 ).setTitle ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V
/* .line 46 */
} // :cond_7
(( c.b.q.k2 ) p1 ).e ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->e(I)Ljava/lang/CharSequence;
/* .line 47 */
p3 = android.text.TextUtils .isEmpty ( p2 );
/* if-nez p3, :cond_8 */
/* .line 48 */
(( androidx.appcompat.widget.Toolbar ) p0 ).setSubtitle ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V
/* .line 49 */
} // :cond_8
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
this.k = p2;
/* .line 50 */
p2 = (( c.b.q.k2 ) p1 ).g ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/b/q/k2;->g(II)I
(( androidx.appcompat.widget.Toolbar ) p0 ).setPopupTheme ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/Toolbar;->setPopupTheme(I)V
/* .line 51 */
(( c.b.q.k2 ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
if ( p2 != null) { // if-eqz p2, :cond_9
/* .line 52 */
(( androidx.appcompat.widget.Toolbar ) p0 ).setNavigationIcon ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V
/* .line 53 */
} // :cond_9
(( c.b.q.k2 ) p1 ).e ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->e(I)Ljava/lang/CharSequence;
/* .line 54 */
p3 = android.text.TextUtils .isEmpty ( p2 );
/* if-nez p3, :cond_a */
/* .line 55 */
(( androidx.appcompat.widget.Toolbar ) p0 ).setNavigationContentDescription ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V
/* .line 56 */
} // :cond_a
(( c.b.q.k2 ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
if ( p2 != null) { // if-eqz p2, :cond_b
/* .line 57 */
(( androidx.appcompat.widget.Toolbar ) p0 ).setLogo ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V
/* .line 58 */
} // :cond_b
(( c.b.q.k2 ) p1 ).e ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->e(I)Ljava/lang/CharSequence;
/* .line 59 */
p3 = android.text.TextUtils .isEmpty ( p2 );
/* if-nez p3, :cond_c */
/* .line 60 */
(( androidx.appcompat.widget.Toolbar ) p0 ).setLogoDescription ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/Toolbar;->setLogoDescription(Ljava/lang/CharSequence;)V
/* .line 61 */
} // :cond_c
p2 = (( c.b.q.k2 ) p1 ).g ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z
if ( p2 != null) { // if-eqz p2, :cond_d
/* .line 62 */
(( c.b.q.k2 ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
(( androidx.appcompat.widget.Toolbar ) p0 ).setTitleTextColor ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/Toolbar;->setTitleTextColor(Landroid/content/res/ColorStateList;)V
/* .line 63 */
} // :cond_d
p2 = (( c.b.q.k2 ) p1 ).g ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z
if ( p2 != null) { // if-eqz p2, :cond_e
/* .line 64 */
(( c.b.q.k2 ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
(( androidx.appcompat.widget.Toolbar ) p0 ).setSubtitleTextColor ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/Toolbar;->setSubtitleTextColor(Landroid/content/res/ColorStateList;)V
/* .line 65 */
} // :cond_e
p2 = (( c.b.q.k2 ) p1 ).g ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z
if ( p2 != null) { // if-eqz p2, :cond_f
/* .line 66 */
p2 = (( c.b.q.k2 ) p1 ).g ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/b/q/k2;->g(II)I
(( androidx.appcompat.widget.Toolbar ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/Toolbar;->c(I)V
/* .line 67 */
} // :cond_f
(( c.b.q.k2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/k2;->a()V
return;
} // .end method
private android.view.MenuInflater getMenuInflater ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Lc/b/p/k; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Lc/b/p/k;-><init>(Landroid/content/Context;)V */
} // .end method
/* # virtual methods */
public final Integer a ( Integer p0 ) {
/* .locals 4 */
/* .line 103 */
v0 = c.h.n.v0 .o ( p0 );
/* .line 104 */
p1 = c.h.n.i .a ( p1,v0 );
/* and-int/lit8 p1, p1, 0x7 */
int v1 = 1; // const/4 v1, 0x1
/* if-eq p1, v1, :cond_1 */
int v2 = 3; // const/4 v2, 0x3
/* if-eq p1, v2, :cond_1 */
int v3 = 5; // const/4 v3, 0x5
/* if-eq p1, v3, :cond_1 */
/* if-ne v0, v1, :cond_0 */
int v2 = 5; // const/4 v2, 0x5
} // :cond_0
} // :cond_1
} // .end method
public final Integer a ( android.view.View p0 ) {
/* .locals 1 */
/* .line 105 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams; */
/* .line 106 */
v0 = c.h.n.m .b ( p1 );
/* .line 107 */
p1 = c.h.n.m .a ( p1 );
/* add-int/2addr v0, p1 */
} // .end method
public final Integer a ( android.view.View p0, Integer p1 ) {
/* .locals 6 */
/* .line 75 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 76 */
p1 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
int v1 = 0; // const/4 v1, 0x0
/* if-lez p2, :cond_0 */
/* sub-int p2, p1, p2 */
/* .line 77 */
/* div-int/lit8 p2, p2, 0x2 */
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
/* .line 78 */
} // :goto_0
/* iget v2, v0, Lc/b/k/a$a;->a:I */
v2 = (( androidx.appcompat.widget.Toolbar ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Landroidx/appcompat/widget/Toolbar;->b(I)I
/* const/16 v3, 0x30 */
/* if-eq v2, v3, :cond_4 */
/* const/16 v3, 0x50 */
/* if-eq v2, v3, :cond_3 */
/* .line 79 */
p2 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* .line 80 */
v2 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* .line 81 */
v3 = (( android.view.ViewGroup ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I
/* sub-int v4, v3, p2 */
/* sub-int/2addr v4, v2 */
/* sub-int/2addr v4, p1 */
/* .line 82 */
/* div-int/lit8 v4, v4, 0x2 */
/* .line 83 */
/* iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* if-ge v4, v5, :cond_1 */
/* move v4, v5 */
} // :cond_1
/* sub-int/2addr v3, v2 */
/* sub-int/2addr v3, p1 */
/* sub-int/2addr v3, v4 */
/* sub-int/2addr v3, p2 */
/* .line 84 */
/* iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* if-ge v3, p1, :cond_2 */
/* sub-int/2addr p1, v3 */
/* sub-int/2addr v4, p1 */
/* .line 85 */
v4 = java.lang.Math .max ( v1,v4 );
} // :cond_2
} // :goto_1
/* add-int/2addr p2, v4 */
/* .line 86 */
} // :cond_3
v1 = (( android.view.ViewGroup ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I
v2 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* sub-int/2addr v1, v2 */
/* sub-int/2addr v1, p1 */
/* iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* sub-int/2addr v1, p1 */
/* sub-int/2addr v1, p2 */
/* .line 87 */
} // :cond_4
p1 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* sub-int/2addr p1, p2 */
} // .end method
public final Integer a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer[] p5 ) {
/* .locals 7 */
/* .line 42 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams; */
/* .line 43 */
/* iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
int v2 = 0; // const/4 v2, 0x0
/* aget v3, p6, v2 */
/* sub-int/2addr v1, v3 */
/* .line 44 */
/* iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
int v4 = 1; // const/4 v4, 0x1
/* aget v5, p6, v4 */
/* sub-int/2addr v3, v5 */
/* .line 45 */
v5 = java.lang.Math .max ( v2,v1 );
/* .line 46 */
v6 = java.lang.Math .max ( v2,v3 );
/* add-int/2addr v5, v6 */
/* neg-int v1, v1 */
/* .line 47 */
v1 = java.lang.Math .max ( v2,v1 );
/* aput v1, p6, v2 */
/* neg-int v1, v3 */
/* .line 48 */
v1 = java.lang.Math .max ( v2,v1 );
/* aput v1, p6, v4 */
/* .line 49 */
p6 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
v1 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* add-int/2addr p6, v1 */
/* add-int/2addr p6, v5 */
/* add-int/2addr p6, p3 */
/* iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* .line 50 */
p2 = android.view.ViewGroup .getChildMeasureSpec ( p2,p6,p3 );
/* .line 51 */
p3 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
p6 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* add-int/2addr p3, p6 */
/* iget p6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr p3, p6 */
/* iget p6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr p3, p6 */
/* add-int/2addr p3, p5 */
/* iget p5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
/* .line 52 */
p3 = android.view.ViewGroup .getChildMeasureSpec ( p4,p3,p5 );
/* .line 53 */
(( android.view.View ) p1 ).measure ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V
/* .line 54 */
p1 = (( android.view.View ) p1 ).getMeasuredWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr p1, v5 */
} // .end method
public final Integer a ( android.view.View p0, Integer p1, Integer[] p2, Integer p3 ) {
/* .locals 4 */
/* .line 67 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 68 */
/* iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
int v2 = 0; // const/4 v2, 0x0
/* aget v3, p3, v2 */
/* sub-int/2addr v1, v3 */
/* .line 69 */
v3 = java.lang.Math .max ( v2,v1 );
/* add-int/2addr p2, v3 */
/* neg-int v1, v1 */
/* .line 70 */
v1 = java.lang.Math .max ( v2,v1 );
/* aput v1, p3, v2 */
/* .line 71 */
p3 = (( androidx.appcompat.widget.Toolbar ) p0 ).a ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;I)I
/* .line 72 */
p4 = (( android.view.View ) p1 ).getMeasuredWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
/* add-int v1, p2, p4 */
/* .line 73 */
v2 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v2, p3 */
(( android.view.View ) p1 ).layout ( p2, p3, v1, v2 ); // invoke-virtual {p1, p2, p3, v1, v2}, Landroid/view/View;->layout(IIII)V
/* .line 74 */
/* iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr p4, p1 */
/* add-int/2addr p2, p4 */
} // .end method
public final Integer a ( java.util.List p0, Integer[] p1 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Landroid/view/View;", */
/* ">;[I)I" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 55 */
/* aget v1, p2, v0 */
int v2 = 1; // const/4 v2, 0x1
/* .line 56 */
/* aget p2, p2, v2 */
v2 = /* .line 57 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_0 */
/* .line 58 */
/* check-cast v5, Landroid/view/View; */
/* .line 59 */
(( android.view.View ) v5 ).getLayoutParams ( ); // invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v6, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 60 */
/* iget v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* sub-int/2addr v7, v1 */
/* .line 61 */
/* iget v1, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* sub-int/2addr v1, p2 */
/* .line 62 */
p2 = java.lang.Math .max ( v0,v7 );
/* .line 63 */
v6 = java.lang.Math .max ( v0,v1 );
/* neg-int v7, v7 */
/* .line 64 */
v7 = java.lang.Math .max ( v0,v7 );
/* neg-int v1, v1 */
/* .line 65 */
v1 = java.lang.Math .max ( v0,v1 );
/* .line 66 */
v5 = (( android.view.View ) v5 ).getMeasuredWidth ( ); // invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr p2, v5 */
/* add-int/2addr p2, v6 */
/* add-int/2addr v4, p2 */
/* add-int/lit8 v3, v3, 0x1 */
/* move p2, v1 */
/* move v1, v7 */
} // :cond_0
} // .end method
public void a ( ) {
/* .locals 2 */
/* .line 108 */
v0 = this.F;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
/* .line 109 */
v1 = this.F;
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/view/View; */
(( android.view.ViewGroup ) p0 ).addView ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* add-int/lit8 v0, v0, -0x1 */
/* .line 110 */
} // :cond_0
v0 = this.F;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .line 21 */
(( androidx.appcompat.widget.Toolbar ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->f()V
/* .line 22 */
v0 = this.u;
(( c.b.q.b2 ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/q/b2;->b(II)V
return;
} // .end method
public void a ( android.content.Context p0, Integer p1 ) {
/* .locals 1 */
/* .line 18 */
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->n:I */
/* .line 19 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 20 */
(( android.widget.TextView ) v0 ).setTextAppearance ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
} // :cond_0
return;
} // .end method
public final void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 3 */
/* .line 33 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams; */
/* .line 34 */
v1 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
v2 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* add-int/2addr v1, v2 */
/* iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v1, v2 */
/* iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v1, v2 */
/* add-int/2addr v1, p3 */
/* iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* .line 35 */
p2 = android.view.ViewGroup .getChildMeasureSpec ( p2,v1,p3 );
/* .line 36 */
p3 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
v1 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* add-int/2addr p3, v1 */
/* iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr p3, v1 */
/* iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr p3, v1 */
/* add-int/2addr p3, p5 */
/* iget p5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
/* .line 37 */
p3 = android.view.ViewGroup .getChildMeasureSpec ( p4,p3,p5 );
/* .line 38 */
p4 = android.view.View$MeasureSpec .getMode ( p3 );
/* const/high16 p5, 0x40000000 # 2.0f */
/* if-eq p4, p5, :cond_1 */
/* if-ltz p6, :cond_1 */
if ( p4 != null) { // if-eqz p4, :cond_0
/* .line 39 */
p3 = android.view.View$MeasureSpec .getSize ( p3 );
p6 = java.lang.Math .min ( p3,p6 );
/* .line 40 */
} // :cond_0
p3 = android.view.View$MeasureSpec .makeMeasureSpec ( p6,p5 );
/* .line 41 */
} // :cond_1
(( android.view.View ) p1 ).measure ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V
return;
} // .end method
public final void a ( android.view.View p0, Boolean p1 ) {
/* .locals 2 */
/* .line 23 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* if-nez v0, :cond_0 */
/* .line 24 */
(( androidx.appcompat.widget.Toolbar ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->generateDefaultLayoutParams()Landroidx/appcompat/widget/Toolbar$e;
/* .line 25 */
} // :cond_0
v1 = (( androidx.appcompat.widget.Toolbar ) p0 ).checkLayoutParams ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
/* if-nez v1, :cond_1 */
/* .line 26 */
(( androidx.appcompat.widget.Toolbar ) p0 ).generateLayoutParams ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/Toolbar$e;
/* .line 27 */
} // :cond_1
/* check-cast v0, Landroidx/appcompat/widget/Toolbar$e; */
} // :goto_0
int v1 = 1; // const/4 v1, 0x1
/* .line 28 */
/* iput v1, v0, Landroidx/appcompat/widget/Toolbar$e;->b:I */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 29 */
p2 = this.j;
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 30 */
(( android.view.View ) p1 ).setLayoutParams ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 31 */
p2 = this.F;
(( java.util.ArrayList ) p2 ).add ( p1 ); // invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 32 */
} // :cond_2
(( android.view.ViewGroup ) p0 ).addView ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
} // :goto_1
return;
} // .end method
public void a ( Object p0, Object p1 ) {
/* .locals 3 */
/* if-nez p1, :cond_0 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
(( androidx.appcompat.widget.Toolbar ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->i()V
/* .line 3 */
v0 = this.b;
(( androidx.appcompat.widget.ActionMenuView ) v0 ).j ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->j()Lc/b/p/o/m;
/* if-ne v0, p1, :cond_1 */
return;
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 4 */
v1 = this.K;
(( c.b.p.o.m ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/b/p/o/m;->b(Lc/b/p/o/z;)V
/* .line 5 */
v1 = this.L;
(( c.b.p.o.m ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/b/p/o/m;->b(Lc/b/p/o/z;)V
/* .line 6 */
} // :cond_2
v0 = this.L;
/* if-nez v0, :cond_3 */
/* .line 7 */
/* new-instance v0, Landroidx/appcompat/widget/Toolbar$d; */
/* invoke-direct {v0, p0}, Landroidx/appcompat/widget/Toolbar$d;-><init>(Landroidx/appcompat/widget/Toolbar;)V */
this.L = v0;
} // :cond_3
int v0 = 1; // const/4 v0, 0x1
/* .line 8 */
(( c.b.q.k ) p2 ).b ( v0 ); // invoke-virtual {p2, v0}, Lc/b/q/k;->b(Z)V
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 9 */
v0 = this.k;
(( c.b.p.o.m ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lc/b/p/o/m;->a(Lc/b/p/o/z;Landroid/content/Context;)V
/* .line 10 */
v0 = this.L;
v1 = this.k;
(( c.b.p.o.m ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lc/b/p/o/m;->a(Lc/b/p/o/z;Landroid/content/Context;)V
/* .line 11 */
} // :cond_4
p1 = this.k;
int v1 = 0; // const/4 v1, 0x0
(( c.b.q.k ) p2 ).a ( p1, v1 ); // invoke-virtual {p2, p1, v1}, Lc/b/q/k;->a(Landroid/content/Context;Lc/b/p/o/m;)V
/* .line 12 */
p1 = this.L;
v2 = this.k;
(( androidx.appcompat.widget.Toolbar$d ) p1 ).a ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Landroidx/appcompat/widget/Toolbar$d;->a(Landroid/content/Context;Lc/b/p/o/m;)V
/* .line 13 */
(( c.b.q.k ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Lc/b/q/k;->a(Z)V
/* .line 14 */
p1 = this.L;
(( androidx.appcompat.widget.Toolbar$d ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar$d;->a(Z)V
/* .line 15 */
} // :goto_0
p1 = this.b;
/* iget v0, p0, Landroidx/appcompat/widget/Toolbar;->l:I */
(( androidx.appcompat.widget.ActionMenuView ) p1 ).setPopupTheme ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionMenuView;->setPopupTheme(I)V
/* .line 16 */
p1 = this.b;
(( androidx.appcompat.widget.ActionMenuView ) p1 ).setPresenter ( p2 ); // invoke-virtual {p1, p2}, Landroidx/appcompat/widget/ActionMenuView;->setPresenter(Lc/b/q/k;)V
/* .line 17 */
this.K = p2;
return;
} // .end method
public void a ( c.b.p.o.z$a p0, c.b.p.o.m$a p1 ) {
/* .locals 1 */
/* .line 111 */
this.M = p1;
/* .line 112 */
this.N = p2;
/* .line 113 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 114 */
(( androidx.appcompat.widget.ActionMenuView ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/ActionMenuView;->a(Lc/b/p/o/z$a;Lc/b/p/o/m$a;)V
} // :cond_0
return;
} // .end method
public final void a ( java.util.List p0, Integer p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Landroid/view/View;", */
/* ">;I)V" */
/* } */
} // .end annotation
/* .line 88 */
v0 = c.h.n.v0 .o ( p0 );
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 89 */
} // :goto_0
v3 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* .line 90 */
v4 = c.h.n.v0 .o ( p0 );
/* .line 91 */
p2 = c.h.n.i .a ( p2,v4 );
/* .line 92 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* sub-int/2addr v3, v2 */
} // :goto_1
/* if-ltz v3, :cond_4 */
/* .line 93 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v3 ); // invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 94 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 95 */
/* iget v2, v1, Landroidx/appcompat/widget/Toolbar$e;->b:I */
/* if-nez v2, :cond_1 */
v2 = (( androidx.appcompat.widget.Toolbar ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* iget v1, v1, Lc/b/k/a$a;->a:I */
/* .line 96 */
v1 = (( androidx.appcompat.widget.Toolbar ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->a(I)I
/* if-ne v1, p2, :cond_1 */
/* .line 97 */
} // :cond_1
/* add-int/lit8 v3, v3, -0x1 */
} // :cond_2
} // :goto_2
/* if-ge v1, v3, :cond_4 */
/* .line 98 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 99 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 100 */
/* iget v4, v2, Landroidx/appcompat/widget/Toolbar$e;->b:I */
/* if-nez v4, :cond_3 */
v4 = (( androidx.appcompat.widget.Toolbar ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* iget v2, v2, Lc/b/k/a$a;->a:I */
/* .line 101 */
v2 = (( androidx.appcompat.widget.Toolbar ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Landroidx/appcompat/widget/Toolbar;->a(I)I
/* if-ne v2, p2, :cond_3 */
/* .line 102 */
} // :cond_3
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_4
return;
} // .end method
public final Integer b ( Integer p0 ) {
/* .locals 1 */
/* and-int/lit8 p1, p1, 0x70 */
/* const/16 v0, 0x10 */
/* if-eq p1, v0, :cond_0 */
/* const/16 v0, 0x30 */
/* if-eq p1, v0, :cond_0 */
/* const/16 v0, 0x50 */
/* if-eq p1, v0, :cond_0 */
/* .line 13 */
/* iget p1, p0, Landroidx/appcompat/widget/Toolbar;->x:I */
/* and-int/lit8 p1, p1, 0x70 */
} // :cond_0
} // .end method
public final Integer b ( android.view.View p0 ) {
/* .locals 1 */
/* .line 14 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams; */
/* .line 15 */
/* iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v0, p1 */
} // .end method
public final Integer b ( android.view.View p0, Integer p1, Integer[] p2, Integer p3 ) {
/* .locals 5 */
/* .line 5 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 6 */
/* iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
int v2 = 1; // const/4 v2, 0x1
/* aget v3, p3, v2 */
/* sub-int/2addr v1, v3 */
int v3 = 0; // const/4 v3, 0x0
/* .line 7 */
v4 = java.lang.Math .max ( v3,v1 );
/* sub-int/2addr p2, v4 */
/* neg-int v1, v1 */
/* .line 8 */
v1 = java.lang.Math .max ( v3,v1 );
/* aput v1, p3, v2 */
/* .line 9 */
p3 = (( androidx.appcompat.widget.Toolbar ) p0 ).a ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;I)I
/* .line 10 */
p4 = (( android.view.View ) p1 ).getMeasuredWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
/* sub-int v1, p2, p4 */
/* .line 11 */
v2 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v2, p3 */
(( android.view.View ) p1 ).layout ( v1, p3, p2, v2 ); // invoke-virtual {p1, v1, p3, p2, v2}, Landroid/view/View;->layout(IIII)V
/* .line 12 */
/* iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr p4, p1 */
/* sub-int/2addr p2, p4 */
} // .end method
public void b ( android.content.Context p0, Integer p1 ) {
/* .locals 1 */
/* .line 2 */
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar;->m:I */
/* .line 3 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
(( android.widget.TextView ) v0 ).setTextAppearance ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
} // :cond_0
return;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( android.view.ViewGroup ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getVisibility()I
/* if-nez v0, :cond_0 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( androidx.appcompat.widget.ActionMenuView ) v0 ).i ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->i()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.c;
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
(( c.b.p.o.p ) v0 ).collapseActionView ( ); // invoke-virtual {v0}, Lc/b/p/o/p;->collapseActionView()Z
} // :cond_1
return;
} // .end method
public void c ( Integer p0 ) {
/* .locals 2 */
/* .line 3 */
/* invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->getMenuInflater()Landroid/view/MenuInflater; */
(( androidx.appcompat.widget.Toolbar ) p0 ).getMenu ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;
(( android.view.MenuInflater ) v0 ).inflate ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V
return;
} // .end method
public final Boolean c ( android.view.View p0 ) {
/* .locals 1 */
/* .line 4 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* if-eq v0, p0, :cond_1 */
v0 = this.F;
p1 = (( java.util.ArrayList ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public Boolean checkLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* instance-of p1, p1, Landroidx/appcompat/widget/Toolbar$e; */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.appcompat.widget.ActionMenuView ) v0 ).d ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->d()V
} // :cond_0
return;
} // .end method
public final Boolean d ( android.view.View p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* if-ne v0, p0, :cond_0 */
p1 = (( android.view.View ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
/* const/16 v0, 0x8 */
/* if-eq p1, v0, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void e ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.i;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/b/q/v; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, v2, v3}, Lc/b/q/v;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
this.i = v0;
/* .line 3 */
v1 = this.g;
(( android.widget.ImageButton ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 4 */
v0 = this.i;
v1 = this.h;
(( android.widget.ImageButton ) v0 ).setContentDescription ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V
/* .line 5 */
(( androidx.appcompat.widget.Toolbar ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->generateDefaultLayoutParams()Landroidx/appcompat/widget/Toolbar$e;
/* const v1, 0x800003 */
/* .line 6 */
/* iget v2, p0, Landroidx/appcompat/widget/Toolbar;->o:I */
/* and-int/lit8 v2, v2, 0x70 */
/* or-int/2addr v1, v2 */
/* iput v1, v0, Lc/b/k/a$a;->a:I */
int v1 = 2; // const/4 v1, 0x2
/* .line 7 */
/* iput v1, v0, Landroidx/appcompat/widget/Toolbar$e;->b:I */
/* .line 8 */
v1 = this.i;
(( android.widget.ImageButton ) v1 ).setLayoutParams ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 9 */
v0 = this.i;
/* new-instance v1, Landroidx/appcompat/widget/Toolbar$c; */
/* invoke-direct {v1, p0}, Landroidx/appcompat/widget/Toolbar$c;-><init>(Landroidx/appcompat/widget/Toolbar;)V */
(( android.widget.ImageButton ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
} // :cond_0
return;
} // .end method
public final void f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/b/q/b2; */
/* invoke-direct {v0}, Lc/b/q/b2;-><init>()V */
this.u = v0;
} // :cond_0
return;
} // .end method
public final void g ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.f;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/b/q/x; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Lc/b/q/x;-><init>(Landroid/content/Context;)V */
this.f = v0;
} // :cond_0
return;
} // .end method
public android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.Toolbar ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->generateDefaultLayoutParams()Landroidx/appcompat/widget/Toolbar$e;
} // .end method
public androidx.appcompat.widget.Toolbar$e generateDefaultLayoutParams ( ) {
/* .locals 2 */
/* .line 2 */
/* new-instance v0, Landroidx/appcompat/widget/Toolbar$e; */
int v1 = -2; // const/4 v1, -0x2
/* invoke-direct {v0, v1, v1}, Landroidx/appcompat/widget/Toolbar$e;-><init>(II)V */
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( androidx.appcompat.widget.Toolbar ) p0 ).generateLayoutParams ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->generateLayoutParams(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/Toolbar$e;
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
(( androidx.appcompat.widget.Toolbar ) p0 ).generateLayoutParams ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/Toolbar$e;
} // .end method
public androidx.appcompat.widget.Toolbar$e generateLayoutParams ( android.util.AttributeSet p0 ) {
/* .locals 2 */
/* .line 3 */
/* new-instance v0, Landroidx/appcompat/widget/Toolbar$e; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroidx/appcompat/widget/Toolbar$e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public androidx.appcompat.widget.Toolbar$e generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* .line 4 */
/* instance-of v0, p1, Landroidx/appcompat/widget/Toolbar$e; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
/* new-instance v0, Landroidx/appcompat/widget/Toolbar$e; */
/* check-cast p1, Landroidx/appcompat/widget/Toolbar$e; */
/* invoke-direct {v0, p1}, Landroidx/appcompat/widget/Toolbar$e;-><init>(Landroidx/appcompat/widget/Toolbar$e;)V */
/* .line 6 */
} // :cond_0
/* instance-of v0, p1, Lc/b/k/a$a; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
/* new-instance v0, Landroidx/appcompat/widget/Toolbar$e; */
/* check-cast p1, Lc/b/k/a$a; */
/* invoke-direct {v0, p1}, Landroidx/appcompat/widget/Toolbar$e;-><init>(Lc/b/k/a$a;)V */
/* .line 8 */
} // :cond_1
/* instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 9 */
/* new-instance v0, Landroidx/appcompat/widget/Toolbar$e; */
/* check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams; */
/* invoke-direct {v0, p1}, Landroidx/appcompat/widget/Toolbar$e;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
/* .line 10 */
} // :cond_2
/* new-instance v0, Landroidx/appcompat/widget/Toolbar$e; */
/* invoke-direct {v0, p1}, Landroidx/appcompat/widget/Toolbar$e;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // .end method
public java.lang.CharSequence getCollapseContentDescription ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.ImageButton ) v0 ).getContentDescription ( ); // invoke-virtual {v0}, Landroid/widget/ImageButton;->getContentDescription()Ljava/lang/CharSequence;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.graphics.drawable.Drawable getCollapseIcon ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.ImageButton ) v0 ).getDrawable ( ); // invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer getContentInsetEnd ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.b.q.b2 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/b2;->a()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer getContentInsetEndWithActions ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/Toolbar;->w:I */
/* const/high16 v1, -0x80000000 */
/* if-eq v0, v1, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).getContentInsetEnd ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetEnd()I
} // :goto_0
} // .end method
public Integer getContentInsetLeft ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.b.q.b2 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/q/b2;->b()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer getContentInsetRight ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.b.q.b2 ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/q/b2;->c()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer getContentInsetStart ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.b.q.b2 ) v0 ).d ( ); // invoke-virtual {v0}, Lc/b/q/b2;->d()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer getContentInsetStartWithNavigation ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/Toolbar;->v:I */
/* const/high16 v1, -0x80000000 */
/* if-eq v0, v1, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).getContentInsetStart ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStart()I
} // :goto_0
} // .end method
public Integer getCurrentContentInsetEnd ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.appcompat.widget.ActionMenuView ) v0 ).j ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->j()Lc/b/p/o/m;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = (( c.b.p.o.m ) v0 ).hasVisibleItems ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->hasVisibleItems()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).getContentInsetEnd ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetEnd()I
/* iget v2, p0, Landroidx/appcompat/widget/Toolbar;->w:I */
v1 = java.lang.Math .max ( v2,v1 );
v0 = java.lang.Math .max ( v0,v1 );
/* .line 5 */
} // :cond_1
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).getContentInsetEnd ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetEnd()I
} // :goto_1
} // .end method
public Integer getCurrentContentInsetLeft ( ) {
/* .locals 2 */
/* .line 1 */
v0 = c.h.n.v0 .o ( p0 );
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 2 */
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).getCurrentContentInsetEnd ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetEnd()I
/* .line 3 */
} // :cond_0
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).getCurrentContentInsetStart ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetStart()I
} // :goto_0
} // .end method
public Integer getCurrentContentInsetRight ( ) {
/* .locals 2 */
/* .line 1 */
v0 = c.h.n.v0 .o ( p0 );
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 2 */
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).getCurrentContentInsetStart ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetStart()I
/* .line 3 */
} // :cond_0
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).getCurrentContentInsetEnd ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetEnd()I
} // :goto_0
} // .end method
public Integer getCurrentContentInsetStart ( ) {
/* .locals 3 */
/* .line 1 */
(( androidx.appcompat.widget.Toolbar ) p0 ).getNavigationIcon ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).getContentInsetStart ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStart()I
/* iget v1, p0, Landroidx/appcompat/widget/Toolbar;->v:I */
int v2 = 0; // const/4 v2, 0x0
v1 = java.lang.Math .max ( v1,v2 );
v0 = java.lang.Math .max ( v0,v1 );
/* .line 3 */
} // :cond_0
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).getContentInsetStart ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStart()I
} // :goto_0
} // .end method
public android.graphics.drawable.Drawable getLogo ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.ImageView ) v0 ).getDrawable ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.lang.CharSequence getLogoDescription ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.ImageView ) v0 ).getContentDescription ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getContentDescription()Ljava/lang/CharSequence;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.view.Menu getMenu ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.Toolbar ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->h()V
/* .line 2 */
v0 = this.b;
(( androidx.appcompat.widget.ActionMenuView ) v0 ).getMenu ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->getMenu()Landroid/view/Menu;
} // .end method
public java.lang.CharSequence getNavigationContentDescription ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.ImageButton ) v0 ).getContentDescription ( ); // invoke-virtual {v0}, Landroid/widget/ImageButton;->getContentDescription()Ljava/lang/CharSequence;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.graphics.drawable.Drawable getNavigationIcon ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.ImageButton ) v0 ).getDrawable ( ); // invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public c.b.q.k getOuterActionMenuPresenter ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.K;
} // .end method
public android.graphics.drawable.Drawable getOverflowIcon ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.Toolbar ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->h()V
/* .line 2 */
v0 = this.b;
(( androidx.appcompat.widget.ActionMenuView ) v0 ).getOverflowIcon ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->getOverflowIcon()Landroid/graphics/drawable/Drawable;
} // .end method
public android.content.Context getPopupContext ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k;
} // .end method
public Integer getPopupTheme ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/Toolbar;->l:I */
} // .end method
public java.lang.CharSequence getSubtitle ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.z;
} // .end method
public final android.widget.TextView getSubtitleTextView ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public java.lang.CharSequence getTitle ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.y;
} // .end method
public Integer getTitleMarginBottom ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/Toolbar;->t:I */
} // .end method
public Integer getTitleMarginEnd ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/Toolbar;->r:I */
} // .end method
public Integer getTitleMarginStart ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/Toolbar;->q:I */
} // .end method
public Integer getTitleMarginTop ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/Toolbar;->s:I */
} // .end method
public final android.widget.TextView getTitleTextView ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public c.b.q.z0 getWrapper ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.J;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/b/q/o2; */
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {v0, p0, v1}, Lc/b/q/o2;-><init>(Landroidx/appcompat/widget/Toolbar;Z)V */
this.J = v0;
/* .line 3 */
} // :cond_0
v0 = this.J;
} // .end method
public final void h ( ) {
/* .locals 3 */
/* .line 1 */
(( androidx.appcompat.widget.Toolbar ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->i()V
/* .line 2 */
v0 = this.b;
(( androidx.appcompat.widget.ActionMenuView ) v0 ).j ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->j()Lc/b/p/o/m;
/* if-nez v0, :cond_1 */
/* .line 3 */
v0 = this.b;
(( androidx.appcompat.widget.ActionMenuView ) v0 ).getMenu ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->getMenu()Landroid/view/Menu;
/* check-cast v0, Lc/b/p/o/m; */
/* .line 4 */
v1 = this.L;
/* if-nez v1, :cond_0 */
/* .line 5 */
/* new-instance v1, Landroidx/appcompat/widget/Toolbar$d; */
/* invoke-direct {v1, p0}, Landroidx/appcompat/widget/Toolbar$d;-><init>(Landroidx/appcompat/widget/Toolbar;)V */
this.L = v1;
/* .line 6 */
} // :cond_0
v1 = this.b;
int v2 = 1; // const/4 v2, 0x1
(( androidx.appcompat.widget.ActionMenuView ) v1 ).setExpandedActionViewsExclusive ( v2 ); // invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ActionMenuView;->setExpandedActionViewsExclusive(Z)V
/* .line 7 */
v1 = this.L;
v2 = this.k;
(( c.b.p.o.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/b/p/o/m;->a(Lc/b/p/o/z;Landroid/content/Context;)V
} // :cond_1
return;
} // .end method
public final void i ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Landroidx/appcompat/widget/ActionMenuView; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Landroidx/appcompat/widget/ActionMenuView;-><init>(Landroid/content/Context;)V */
this.b = v0;
/* .line 3 */
/* iget v1, p0, Landroidx/appcompat/widget/Toolbar;->l:I */
(( androidx.appcompat.widget.ActionMenuView ) v0 ).setPopupTheme ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionMenuView;->setPopupTheme(I)V
/* .line 4 */
v0 = this.b;
v1 = this.I;
(( androidx.appcompat.widget.ActionMenuView ) v0 ).setOnMenuItemClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionMenuView;->setOnMenuItemClickListener(Landroidx/appcompat/widget/ActionMenuView$e;)V
/* .line 5 */
v0 = this.b;
v1 = this.M;
v2 = this.N;
(( androidx.appcompat.widget.ActionMenuView ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroidx/appcompat/widget/ActionMenuView;->a(Lc/b/p/o/z$a;Lc/b/p/o/m$a;)V
/* .line 6 */
(( androidx.appcompat.widget.Toolbar ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->generateDefaultLayoutParams()Landroidx/appcompat/widget/Toolbar$e;
/* const v1, 0x800005 */
/* .line 7 */
/* iget v2, p0, Landroidx/appcompat/widget/Toolbar;->o:I */
/* and-int/lit8 v2, v2, 0x70 */
/* or-int/2addr v1, v2 */
/* iput v1, v0, Lc/b/k/a$a;->a:I */
/* .line 8 */
v1 = this.b;
(( android.view.ViewGroup ) v1 ).setLayoutParams ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 9 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
(( androidx.appcompat.widget.Toolbar ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;Z)V
} // :cond_0
return;
} // .end method
public final void j ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.e;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/b/q/v; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, v2, v3}, Lc/b/q/v;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
this.e = v0;
/* .line 3 */
(( androidx.appcompat.widget.Toolbar ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->generateDefaultLayoutParams()Landroidx/appcompat/widget/Toolbar$e;
/* const v1, 0x800003 */
/* .line 4 */
/* iget v2, p0, Landroidx/appcompat/widget/Toolbar;->o:I */
/* and-int/lit8 v2, v2, 0x70 */
/* or-int/2addr v1, v2 */
/* iput v1, v0, Lc/b/k/a$a;->a:I */
/* .line 5 */
v1 = this.e;
(( android.widget.ImageButton ) v1 ).setLayoutParams ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
} // :cond_0
return;
} // .end method
public Boolean k ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean l ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( androidx.appcompat.widget.ActionMenuView ) v0 ).f ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->f()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean m ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( androidx.appcompat.widget.ActionMenuView ) v0 ).g ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->g()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean n ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( androidx.appcompat.widget.ActionMenuView ) v0 ).h ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->h()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final void o ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.P;
(( android.view.ViewGroup ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 2 */
v0 = this.P;
(( android.view.ViewGroup ) p0 ).post ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z
return;
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
/* .line 2 */
v0 = this.P;
(( android.view.ViewGroup ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z
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
/* iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->D:Z */
/* .line 3 */
} // :cond_0
/* iget-boolean v3, p0, Landroidx/appcompat/widget/Toolbar;->D:Z */
int v4 = 1; // const/4 v4, 0x1
/* if-nez v3, :cond_1 */
/* .line 4 */
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onHoverEvent(Landroid/view/MotionEvent;)Z */
/* if-ne v0, v2, :cond_1 */
/* if-nez p1, :cond_1 */
/* .line 5 */
/* iput-boolean v4, p0, Landroidx/appcompat/widget/Toolbar;->D:Z */
} // :cond_1
/* const/16 p1, 0xa */
/* if-eq v0, p1, :cond_2 */
int p1 = 3; // const/4 p1, 0x3
/* if-ne v0, p1, :cond_3 */
/* .line 6 */
} // :cond_2
/* iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->D:Z */
} // :cond_3
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 19 */
/* move-object/from16 v0, p0 */
/* .line 1 */
v1 = /* invoke-static/range {p0 ..p0}, Lc/h/n/v0;->o(Landroid/view/View;)I */
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
/* if-ne v1, v2, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
} // :goto_0
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getWidth()I */
/* .line 3 */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getHeight()I */
/* .line 4 */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
/* .line 5 */
v7 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* .line 6 */
v8 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
/* .line 7 */
v9 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingBottom()I */
/* sub-int v10, v4, v7 */
/* .line 8 */
v11 = this.G;
/* .line 9 */
/* aput v3, v11, v2 */
/* aput v3, v11, v3 */
/* .line 10 */
v12 = /* invoke-static/range {p0 ..p0}, Lc/h/n/v0;->p(Landroid/view/View;)I */
/* if-ltz v12, :cond_1 */
/* sub-int v13, p5, p3 */
/* .line 11 */
v12 = java.lang.Math .min ( v12,v13 );
} // :cond_1
int v12 = 0; // const/4 v12, 0x0
/* .line 12 */
} // :goto_1
v13 = this.e;
v13 = (( androidx.appcompat.widget.Toolbar ) v0 ).d ( v13 ); // invoke-virtual {v0, v13}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v13 != null) { // if-eqz v13, :cond_3
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 13 */
v13 = this.e;
v13 = (( androidx.appcompat.widget.Toolbar ) v0 ).b ( v13, v10, v11, v12 ); // invoke-virtual {v0, v13, v10, v11, v12}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/view/View;I[II)I
/* move v14, v13 */
/* move v13, v6 */
/* .line 14 */
} // :cond_2
v13 = this.e;
v13 = (( androidx.appcompat.widget.Toolbar ) v0 ).a ( v13, v6, v11, v12 ); // invoke-virtual {v0, v13, v6, v11, v12}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;I[II)I
} // :cond_3
/* move v13, v6 */
} // :goto_2
/* move v14, v10 */
/* .line 15 */
} // :goto_3
v15 = this.i;
v15 = (( androidx.appcompat.widget.Toolbar ) v0 ).d ( v15 ); // invoke-virtual {v0, v15}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v15 != null) { // if-eqz v15, :cond_5
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 16 */
v15 = this.i;
v14 = (( androidx.appcompat.widget.Toolbar ) v0 ).b ( v15, v14, v11, v12 ); // invoke-virtual {v0, v15, v14, v11, v12}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/view/View;I[II)I
/* .line 17 */
} // :cond_4
v15 = this.i;
v13 = (( androidx.appcompat.widget.Toolbar ) v0 ).a ( v15, v13, v11, v12 ); // invoke-virtual {v0, v15, v13, v11, v12}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;I[II)I
/* .line 18 */
} // :cond_5
} // :goto_4
v15 = this.b;
v15 = (( androidx.appcompat.widget.Toolbar ) v0 ).d ( v15 ); // invoke-virtual {v0, v15}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v15 != null) { // if-eqz v15, :cond_7
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 19 */
v15 = this.b;
v13 = (( androidx.appcompat.widget.Toolbar ) v0 ).a ( v15, v13, v11, v12 ); // invoke-virtual {v0, v15, v13, v11, v12}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;I[II)I
/* .line 20 */
} // :cond_6
v15 = this.b;
v14 = (( androidx.appcompat.widget.Toolbar ) v0 ).b ( v15, v14, v11, v12 ); // invoke-virtual {v0, v15, v14, v11, v12}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/view/View;I[II)I
/* .line 21 */
} // :cond_7
} // :goto_5
v15 = /* invoke-virtual/range {p0 ..p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetLeft()I */
/* .line 22 */
v16 = /* invoke-virtual/range {p0 ..p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetRight()I */
/* sub-int v2, v15, v13 */
/* .line 23 */
v2 = java.lang.Math .max ( v3,v2 );
/* aput v2, v11, v3 */
/* sub-int v2, v10, v14 */
/* sub-int v2, v16, v2 */
/* .line 24 */
v2 = java.lang.Math .max ( v3,v2 );
/* const/16 v17, 0x1 */
/* aput v2, v11, v17 */
/* .line 25 */
v2 = java.lang.Math .max ( v13,v15 );
/* sub-int v10, v10, v16 */
/* .line 26 */
v10 = java.lang.Math .min ( v14,v10 );
/* .line 27 */
v13 = this.j;
v13 = (( androidx.appcompat.widget.Toolbar ) v0 ).d ( v13 ); // invoke-virtual {v0, v13}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v13 != null) { // if-eqz v13, :cond_9
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 28 */
v13 = this.j;
v10 = (( androidx.appcompat.widget.Toolbar ) v0 ).b ( v13, v10, v11, v12 ); // invoke-virtual {v0, v13, v10, v11, v12}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/view/View;I[II)I
/* .line 29 */
} // :cond_8
v13 = this.j;
v2 = (( androidx.appcompat.widget.Toolbar ) v0 ).a ( v13, v2, v11, v12 ); // invoke-virtual {v0, v13, v2, v11, v12}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;I[II)I
/* .line 30 */
} // :cond_9
} // :goto_6
v13 = this.f;
v13 = (( androidx.appcompat.widget.Toolbar ) v0 ).d ( v13 ); // invoke-virtual {v0, v13}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v13 != null) { // if-eqz v13, :cond_b
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 31 */
v13 = this.f;
v10 = (( androidx.appcompat.widget.Toolbar ) v0 ).b ( v13, v10, v11, v12 ); // invoke-virtual {v0, v13, v10, v11, v12}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/view/View;I[II)I
/* .line 32 */
} // :cond_a
v13 = this.f;
v2 = (( androidx.appcompat.widget.Toolbar ) v0 ).a ( v13, v2, v11, v12 ); // invoke-virtual {v0, v13, v2, v11, v12}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;I[II)I
/* .line 33 */
} // :cond_b
} // :goto_7
v13 = this.c;
v13 = (( androidx.appcompat.widget.Toolbar ) v0 ).d ( v13 ); // invoke-virtual {v0, v13}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
/* .line 34 */
v14 = this.d;
v14 = (( androidx.appcompat.widget.Toolbar ) v0 ).d ( v14 ); // invoke-virtual {v0, v14}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v13 != null) { // if-eqz v13, :cond_c
/* .line 35 */
v15 = this.c;
(( android.widget.TextView ) v15 ).getLayoutParams ( ); // invoke-virtual {v15}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v15, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 36 */
/* iget v3, v15, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* move/from16 p4, v7 */
v7 = this.c;
v7 = (( android.widget.TextView ) v7 ).getMeasuredHeight ( ); // invoke-virtual {v7}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v3, v7 */
/* iget v7, v15, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v3, v7 */
int v7 = 0; // const/4 v7, 0x0
/* add-int/2addr v3, v7 */
} // :cond_c
/* move/from16 p4, v7 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_8
if ( v14 != null) { // if-eqz v14, :cond_d
/* .line 37 */
v7 = this.d;
(( android.widget.TextView ) v7 ).getLayoutParams ( ); // invoke-virtual {v7}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v7, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 38 */
/* iget v15, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* move/from16 v16, v4 */
v4 = this.d;
v4 = (( android.widget.TextView ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v15, v4 */
/* iget v4, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v15, v4 */
/* add-int/2addr v3, v15 */
} // :cond_d
/* move/from16 v16, v4 */
} // :goto_9
/* if-nez v13, :cond_f */
if ( v14 != null) { // if-eqz v14, :cond_e
} // :cond_e
/* move/from16 v18, v6 */
/* move/from16 p3, v12 */
} // :goto_a
int v1 = 0; // const/4 v1, 0x0
/* goto/16 :goto_17 */
} // :cond_f
} // :goto_b
if ( v13 != null) { // if-eqz v13, :cond_10
/* .line 39 */
v4 = this.c;
} // :cond_10
v4 = this.d;
} // :goto_c
if ( v14 != null) { // if-eqz v14, :cond_11
/* .line 40 */
v7 = this.d;
} // :cond_11
v7 = this.c;
/* .line 41 */
} // :goto_d
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v4, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 42 */
(( android.view.View ) v7 ).getLayoutParams ( ); // invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v7, Landroidx/appcompat/widget/Toolbar$e; */
if ( v13 != null) { // if-eqz v13, :cond_12
/* .line 43 */
v15 = this.c;
v15 = (( android.widget.TextView ) v15 ).getMeasuredWidth ( ); // invoke-virtual {v15}, Landroid/widget/TextView;->getMeasuredWidth()I
/* if-gtz v15, :cond_13 */
} // :cond_12
if ( v14 != null) { // if-eqz v14, :cond_14
v15 = this.d;
/* .line 44 */
v15 = (( android.widget.TextView ) v15 ).getMeasuredWidth ( ); // invoke-virtual {v15}, Landroid/widget/TextView;->getMeasuredWidth()I
/* if-lez v15, :cond_14 */
} // :cond_13
/* const/16 v17, 0x1 */
} // :cond_14
/* const/16 v17, 0x0 */
/* .line 45 */
} // :goto_e
/* iget v15, v0, Landroidx/appcompat/widget/Toolbar;->x:I */
/* and-int/lit8 v15, v15, 0x70 */
/* move/from16 v18, v6 */
/* const/16 v6, 0x30 */
/* if-eq v15, v6, :cond_18 */
/* const/16 v6, 0x50 */
/* if-eq v15, v6, :cond_17 */
/* sub-int v6, v5, v8 */
/* sub-int/2addr v6, v9 */
/* sub-int/2addr v6, v3 */
/* .line 46 */
/* div-int/lit8 v6, v6, 0x2 */
/* .line 47 */
/* iget v15, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* move/from16 p3, v12 */
/* iget v12, v0, Landroidx/appcompat/widget/Toolbar;->s:I */
/* move/from16 p5, v2 */
/* add-int v2, v15, v12 */
/* if-ge v6, v2, :cond_15 */
/* add-int v6, v15, v12 */
} // :cond_15
/* sub-int/2addr v5, v9 */
/* sub-int/2addr v5, v3 */
/* sub-int/2addr v5, v6 */
/* sub-int/2addr v5, v8 */
/* .line 48 */
/* iget v2, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* iget v3, v0, Landroidx/appcompat/widget/Toolbar;->t:I */
/* add-int/2addr v2, v3 */
/* if-ge v5, v2, :cond_16 */
/* .line 49 */
/* iget v2, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v2, v3 */
/* sub-int/2addr v2, v5 */
/* sub-int/2addr v6, v2 */
int v2 = 0; // const/4 v2, 0x0
v6 = java.lang.Math .max ( v2,v6 );
} // :cond_16
} // :goto_f
/* add-int/2addr v8, v6 */
} // :cond_17
/* move/from16 p5, v2 */
/* move/from16 p3, v12 */
/* sub-int/2addr v5, v9 */
/* .line 50 */
/* iget v2, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* sub-int/2addr v5, v2 */
/* iget v2, v0, Landroidx/appcompat/widget/Toolbar;->t:I */
/* sub-int/2addr v5, v2 */
/* sub-int v8, v5, v3 */
} // :cond_18
/* move/from16 p5, v2 */
/* move/from16 p3, v12 */
/* .line 51 */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
/* iget v3, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v2, v3 */
/* iget v3, v0, Landroidx/appcompat/widget/Toolbar;->s:I */
/* add-int v8, v2, v3 */
} // :goto_10
if ( v1 != null) { // if-eqz v1, :cond_1d
if ( v17 != null) { // if-eqz v17, :cond_19
/* .line 52 */
/* iget v1, v0, Landroidx/appcompat/widget/Toolbar;->q:I */
} // :cond_19
int v1 = 0; // const/4 v1, 0x0
} // :goto_11
int v2 = 1; // const/4 v2, 0x1
/* aget v3, v11, v2 */
/* sub-int/2addr v1, v3 */
int v3 = 0; // const/4 v3, 0x0
/* .line 53 */
v4 = java.lang.Math .max ( v3,v1 );
/* sub-int/2addr v10, v4 */
/* neg-int v1, v1 */
/* .line 54 */
v1 = java.lang.Math .max ( v3,v1 );
/* aput v1, v11, v2 */
if ( v13 != null) { // if-eqz v13, :cond_1a
/* .line 55 */
v1 = this.c;
(( android.widget.TextView ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 56 */
v2 = this.c;
v2 = (( android.widget.TextView ) v2 ).getMeasuredWidth ( ); // invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I
/* sub-int v2, v10, v2 */
/* .line 57 */
v3 = this.c;
v3 = (( android.widget.TextView ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v3, v8 */
/* .line 58 */
v4 = this.c;
(( android.widget.TextView ) v4 ).layout ( v2, v8, v10, v3 ); // invoke-virtual {v4, v2, v8, v10, v3}, Landroid/widget/TextView;->layout(IIII)V
/* .line 59 */
/* iget v4, v0, Landroidx/appcompat/widget/Toolbar;->r:I */
/* sub-int/2addr v2, v4 */
/* .line 60 */
/* iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int v8, v3, v1 */
} // :cond_1a
/* move v2, v10 */
} // :goto_12
if ( v14 != null) { // if-eqz v14, :cond_1b
/* .line 61 */
v1 = this.d;
(( android.widget.TextView ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 62 */
/* iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v8, v3 */
/* .line 63 */
v3 = this.d;
v3 = (( android.widget.TextView ) v3 ).getMeasuredWidth ( ); // invoke-virtual {v3}, Landroid/widget/TextView;->getMeasuredWidth()I
/* sub-int v3, v10, v3 */
/* .line 64 */
v4 = this.d;
v4 = (( android.widget.TextView ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v4, v8 */
/* .line 65 */
v5 = this.d;
(( android.widget.TextView ) v5 ).layout ( v3, v8, v10, v4 ); // invoke-virtual {v5, v3, v8, v10, v4}, Landroid/widget/TextView;->layout(IIII)V
/* .line 66 */
/* iget v3, v0, Landroidx/appcompat/widget/Toolbar;->r:I */
/* sub-int v3, v10, v3 */
/* .line 67 */
/* iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
} // :cond_1b
/* move v3, v10 */
} // :goto_13
if ( v17 != null) { // if-eqz v17, :cond_1c
/* .line 68 */
v1 = java.lang.Math .min ( v2,v3 );
/* move v10, v1 */
} // :cond_1c
/* move/from16 v2, p5 */
/* goto/16 :goto_a */
} // :cond_1d
if ( v17 != null) { // if-eqz v17, :cond_1e
/* .line 69 */
/* iget v7, v0, Landroidx/appcompat/widget/Toolbar;->q:I */
int v1 = 0; // const/4 v1, 0x0
} // :cond_1e
int v1 = 0; // const/4 v1, 0x0
int v7 = 0; // const/4 v7, 0x0
} // :goto_14
/* aget v2, v11, v1 */
/* sub-int/2addr v7, v2 */
/* .line 70 */
v2 = java.lang.Math .max ( v1,v7 );
/* add-int v2, p5, v2 */
/* neg-int v3, v7 */
/* .line 71 */
v3 = java.lang.Math .max ( v1,v3 );
/* aput v3, v11, v1 */
if ( v13 != null) { // if-eqz v13, :cond_1f
/* .line 72 */
v3 = this.c;
(( android.widget.TextView ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 73 */
v4 = this.c;
v4 = (( android.widget.TextView ) v4 ).getMeasuredWidth ( ); // invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredWidth()I
/* add-int/2addr v4, v2 */
/* .line 74 */
v5 = this.c;
v5 = (( android.widget.TextView ) v5 ).getMeasuredHeight ( ); // invoke-virtual {v5}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v5, v8 */
/* .line 75 */
v6 = this.c;
(( android.widget.TextView ) v6 ).layout ( v2, v8, v4, v5 ); // invoke-virtual {v6, v2, v8, v4, v5}, Landroid/widget/TextView;->layout(IIII)V
/* .line 76 */
/* iget v6, v0, Landroidx/appcompat/widget/Toolbar;->r:I */
/* add-int/2addr v4, v6 */
/* .line 77 */
/* iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int v8, v5, v3 */
} // :cond_1f
/* move v4, v2 */
} // :goto_15
if ( v14 != null) { // if-eqz v14, :cond_20
/* .line 78 */
v3 = this.d;
(( android.widget.TextView ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 79 */
/* iget v5, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v8, v5 */
/* .line 80 */
v5 = this.d;
v5 = (( android.widget.TextView ) v5 ).getMeasuredWidth ( ); // invoke-virtual {v5}, Landroid/widget/TextView;->getMeasuredWidth()I
/* add-int/2addr v5, v2 */
/* .line 81 */
v6 = this.d;
v6 = (( android.widget.TextView ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v6, v8 */
/* .line 82 */
v7 = this.d;
(( android.widget.TextView ) v7 ).layout ( v2, v8, v5, v6 ); // invoke-virtual {v7, v2, v8, v5, v6}, Landroid/widget/TextView;->layout(IIII)V
/* .line 83 */
/* iget v6, v0, Landroidx/appcompat/widget/Toolbar;->r:I */
/* add-int/2addr v5, v6 */
/* .line 84 */
/* iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
} // :cond_20
/* move v5, v2 */
} // :goto_16
if ( v17 != null) { // if-eqz v17, :cond_21
/* .line 85 */
v2 = java.lang.Math .max ( v4,v5 );
/* .line 86 */
} // :cond_21
} // :goto_17
v3 = this.E;
int v4 = 3; // const/4 v4, 0x3
(( androidx.appcompat.widget.Toolbar ) v0 ).a ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Landroidx/appcompat/widget/Toolbar;->a(Ljava/util/List;I)V
/* .line 87 */
v3 = this.E;
v3 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
int v7 = 0; // const/4 v7, 0x0
} // :goto_18
/* if-ge v7, v3, :cond_22 */
/* .line 88 */
v4 = this.E;
(( java.util.ArrayList ) v4 ).get ( v7 ); // invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Landroid/view/View; */
/* move/from16 v12, p3 */
v2 = (( androidx.appcompat.widget.Toolbar ) v0 ).a ( v4, v2, v11, v12 ); // invoke-virtual {v0, v4, v2, v11, v12}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;I[II)I
/* add-int/lit8 v7, v7, 0x1 */
} // :cond_22
/* move/from16 v12, p3 */
/* .line 89 */
v3 = this.E;
int v4 = 5; // const/4 v4, 0x5
(( androidx.appcompat.widget.Toolbar ) v0 ).a ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Landroidx/appcompat/widget/Toolbar;->a(Ljava/util/List;I)V
/* .line 90 */
v3 = this.E;
v3 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
int v7 = 0; // const/4 v7, 0x0
} // :goto_19
/* if-ge v7, v3, :cond_23 */
/* .line 91 */
v4 = this.E;
(( java.util.ArrayList ) v4 ).get ( v7 ); // invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Landroid/view/View; */
v10 = (( androidx.appcompat.widget.Toolbar ) v0 ).b ( v4, v10, v11, v12 ); // invoke-virtual {v0, v4, v10, v11, v12}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/view/View;I[II)I
/* add-int/lit8 v7, v7, 0x1 */
/* .line 92 */
} // :cond_23
v3 = this.E;
int v4 = 1; // const/4 v4, 0x1
(( androidx.appcompat.widget.Toolbar ) v0 ).a ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Landroidx/appcompat/widget/Toolbar;->a(Ljava/util/List;I)V
/* .line 93 */
v3 = this.E;
v3 = (( androidx.appcompat.widget.Toolbar ) v0 ).a ( v3, v11 ); // invoke-virtual {v0, v3, v11}, Landroidx/appcompat/widget/Toolbar;->a(Ljava/util/List;[I)I
/* sub-int v4, v16, v18 */
/* sub-int v4, v4, p4 */
/* .line 94 */
/* div-int/lit8 v4, v4, 0x2 */
/* add-int v6, v18, v4 */
/* .line 95 */
/* div-int/lit8 v4, v3, 0x2 */
/* sub-int/2addr v6, v4 */
/* add-int/2addr v3, v6 */
/* if-ge v6, v2, :cond_24 */
} // :cond_24
/* if-le v3, v10, :cond_25 */
/* sub-int/2addr v3, v10 */
/* sub-int v2, v6, v3 */
} // :cond_25
/* move v2, v6 */
/* .line 96 */
} // :goto_1a
v3 = this.E;
v3 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
} // :goto_1b
/* if-ge v1, v3, :cond_26 */
/* .line 97 */
v4 = this.E;
(( java.util.ArrayList ) v4 ).get ( v1 ); // invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Landroid/view/View; */
v2 = (( androidx.appcompat.widget.Toolbar ) v0 ).a ( v4, v2, v11, v12 ); // invoke-virtual {v0, v4, v2, v11, v12}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;I[II)I
/* add-int/lit8 v1, v1, 0x1 */
/* .line 98 */
} // :cond_26
v1 = this.E;
(( java.util.ArrayList ) v1 ).clear ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 16 */
/* move-object/from16 v7, p0 */
/* .line 1 */
v8 = this.G;
/* .line 2 */
v0 = /* invoke-static/range {p0 ..p0}, Lc/b/q/v2;->a(Landroid/view/View;)Z */
int v1 = 1; // const/4 v1, 0x1
int v9 = 0; // const/4 v9, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
int v10 = 1; // const/4 v10, 0x1
int v11 = 0; // const/4 v11, 0x0
} // :cond_0
int v10 = 0; // const/4 v10, 0x0
int v11 = 1; // const/4 v11, 0x1
/* .line 3 */
} // :goto_0
v0 = this.e;
v0 = (( androidx.appcompat.widget.Toolbar ) v7 ).d ( v0 ); // invoke-virtual {v7, v0}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
v1 = this.e;
int v5 = 0; // const/4 v5, 0x0
/* iget v6, v7, Landroidx/appcompat/widget/Toolbar;->p:I */
int v3 = 0; // const/4 v3, 0x0
/* move-object/from16 v0, p0 */
/* move/from16 v2, p1 */
/* move/from16 v4, p2 */
/* invoke-virtual/range {v0 ..v6}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;IIIII)V */
/* .line 5 */
v0 = this.e;
v0 = (( android.widget.ImageButton ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/widget/ImageButton;->getMeasuredWidth()I
v1 = this.e;
v1 = (( androidx.appcompat.widget.Toolbar ) v7 ).a ( v1 ); // invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;)I
/* add-int/2addr v0, v1 */
/* .line 6 */
v1 = this.e;
v1 = (( android.widget.ImageButton ) v1 ).getMeasuredHeight ( ); // invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredHeight()I
v2 = this.e;
/* .line 7 */
v2 = (( androidx.appcompat.widget.Toolbar ) v7 ).b ( v2 ); // invoke-virtual {v7, v2}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/view/View;)I
/* add-int/2addr v1, v2 */
/* .line 8 */
v1 = java.lang.Math .max ( v9,v1 );
/* .line 9 */
v2 = this.e;
/* .line 10 */
v2 = (( android.widget.ImageButton ) v2 ).getMeasuredState ( ); // invoke-virtual {v2}, Landroid/widget/ImageButton;->getMeasuredState()I
/* .line 11 */
v2 = android.view.View .combineMeasuredStates ( v9,v2 );
/* move v12, v1 */
/* move v13, v2 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
int v12 = 0; // const/4 v12, 0x0
int v13 = 0; // const/4 v13, 0x0
/* .line 12 */
} // :goto_1
v1 = this.i;
v1 = (( androidx.appcompat.widget.Toolbar ) v7 ).d ( v1 ); // invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 13 */
v1 = this.i;
int v5 = 0; // const/4 v5, 0x0
/* iget v6, v7, Landroidx/appcompat/widget/Toolbar;->p:I */
int v3 = 0; // const/4 v3, 0x0
/* move-object/from16 v0, p0 */
/* move/from16 v2, p1 */
/* move/from16 v4, p2 */
/* invoke-virtual/range {v0 ..v6}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;IIIII)V */
/* .line 14 */
v0 = this.i;
v0 = (( android.widget.ImageButton ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/widget/ImageButton;->getMeasuredWidth()I
v1 = this.i;
/* .line 15 */
v1 = (( androidx.appcompat.widget.Toolbar ) v7 ).a ( v1 ); // invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;)I
/* add-int/2addr v0, v1 */
/* .line 16 */
v1 = this.i;
v1 = (( android.widget.ImageButton ) v1 ).getMeasuredHeight ( ); // invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredHeight()I
v2 = this.i;
/* .line 17 */
v2 = (( androidx.appcompat.widget.Toolbar ) v7 ).b ( v2 ); // invoke-virtual {v7, v2}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/view/View;)I
/* add-int/2addr v1, v2 */
/* .line 18 */
v12 = java.lang.Math .max ( v12,v1 );
/* .line 19 */
v1 = this.i;
/* .line 20 */
v1 = (( android.widget.ImageButton ) v1 ).getMeasuredState ( ); // invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredState()I
/* .line 21 */
v13 = android.view.View .combineMeasuredStates ( v13,v1 );
/* .line 22 */
} // :cond_2
v1 = /* invoke-virtual/range {p0 ..p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetStart()I */
/* .line 23 */
v2 = java.lang.Math .max ( v1,v0 );
/* add-int v14, v9, v2 */
/* sub-int/2addr v1, v0 */
/* .line 24 */
v0 = java.lang.Math .max ( v9,v1 );
/* aput v0, v8, v10 */
/* .line 25 */
v0 = this.b;
v0 = (( androidx.appcompat.widget.Toolbar ) v7 ).d ( v0 ); // invoke-virtual {v7, v0}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 26 */
v1 = this.b;
int v5 = 0; // const/4 v5, 0x0
/* iget v6, v7, Landroidx/appcompat/widget/Toolbar;->p:I */
/* move-object/from16 v0, p0 */
/* move/from16 v2, p1 */
/* move v3, v14 */
/* move/from16 v4, p2 */
/* invoke-virtual/range {v0 ..v6}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;IIIII)V */
/* .line 27 */
v0 = this.b;
v0 = (( android.view.ViewGroup ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getMeasuredWidth()I
v1 = this.b;
v1 = (( androidx.appcompat.widget.Toolbar ) v7 ).a ( v1 ); // invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;)I
/* add-int/2addr v0, v1 */
/* .line 28 */
v1 = this.b;
v1 = (( android.view.ViewGroup ) v1 ).getMeasuredHeight ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getMeasuredHeight()I
v2 = this.b;
/* .line 29 */
v2 = (( androidx.appcompat.widget.Toolbar ) v7 ).b ( v2 ); // invoke-virtual {v7, v2}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/view/View;)I
/* add-int/2addr v1, v2 */
/* .line 30 */
v12 = java.lang.Math .max ( v12,v1 );
/* .line 31 */
v1 = this.b;
/* .line 32 */
v1 = (( android.view.ViewGroup ) v1 ).getMeasuredState ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getMeasuredState()I
/* .line 33 */
v13 = android.view.View .combineMeasuredStates ( v13,v1 );
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
/* .line 34 */
} // :goto_2
v1 = /* invoke-virtual/range {p0 ..p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetEnd()I */
/* .line 35 */
v2 = java.lang.Math .max ( v1,v0 );
/* add-int/2addr v14, v2 */
/* sub-int/2addr v1, v0 */
/* .line 36 */
v0 = java.lang.Math .max ( v9,v1 );
/* aput v0, v8, v11 */
/* .line 37 */
v0 = this.j;
v0 = (( androidx.appcompat.widget.Toolbar ) v7 ).d ( v0 ); // invoke-virtual {v7, v0}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 38 */
v1 = this.j;
int v5 = 0; // const/4 v5, 0x0
/* move-object/from16 v0, p0 */
/* move/from16 v2, p1 */
/* move v3, v14 */
/* move/from16 v4, p2 */
/* move-object v6, v8 */
v0 = /* invoke-virtual/range {v0 ..v6}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;IIII[I)I */
/* add-int/2addr v14, v0 */
/* .line 39 */
v0 = this.j;
v0 = (( android.view.View ) v0 ).getMeasuredHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
v1 = this.j;
/* .line 40 */
v1 = (( androidx.appcompat.widget.Toolbar ) v7 ).b ( v1 ); // invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/view/View;)I
/* add-int/2addr v0, v1 */
/* .line 41 */
v12 = java.lang.Math .max ( v12,v0 );
/* .line 42 */
v0 = this.j;
/* .line 43 */
v0 = (( android.view.View ) v0 ).getMeasuredState ( ); // invoke-virtual {v0}, Landroid/view/View;->getMeasuredState()I
/* .line 44 */
v13 = android.view.View .combineMeasuredStates ( v13,v0 );
/* .line 45 */
} // :cond_4
v0 = this.f;
v0 = (( androidx.appcompat.widget.Toolbar ) v7 ).d ( v0 ); // invoke-virtual {v7, v0}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 46 */
v1 = this.f;
int v5 = 0; // const/4 v5, 0x0
/* move-object/from16 v0, p0 */
/* move/from16 v2, p1 */
/* move v3, v14 */
/* move/from16 v4, p2 */
/* move-object v6, v8 */
v0 = /* invoke-virtual/range {v0 ..v6}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;IIII[I)I */
/* add-int/2addr v14, v0 */
/* .line 47 */
v0 = this.f;
v0 = (( android.widget.ImageView ) v0 ).getMeasuredHeight ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredHeight()I
v1 = this.f;
/* .line 48 */
v1 = (( androidx.appcompat.widget.Toolbar ) v7 ).b ( v1 ); // invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/view/View;)I
/* add-int/2addr v0, v1 */
/* .line 49 */
v12 = java.lang.Math .max ( v12,v0 );
/* .line 50 */
v0 = this.f;
/* .line 51 */
v0 = (( android.widget.ImageView ) v0 ).getMeasuredState ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredState()I
/* .line 52 */
v13 = android.view.View .combineMeasuredStates ( v13,v0 );
/* .line 53 */
} // :cond_5
v10 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getChildCount()I */
int v11 = 0; // const/4 v11, 0x0
} // :goto_3
/* if-ge v11, v10, :cond_8 */
/* .line 54 */
(( android.view.ViewGroup ) v7 ).getChildAt ( v11 ); // invoke-virtual {v7, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 55 */
(( android.view.View ) v15 ).getLayoutParams ( ); // invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 56 */
/* iget v0, v0, Landroidx/appcompat/widget/Toolbar$e;->b:I */
/* if-nez v0, :cond_7 */
v0 = (( androidx.appcompat.widget.Toolbar ) v7 ).d ( v15 ); // invoke-virtual {v7, v15}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
/* if-nez v0, :cond_6 */
} // :cond_6
int v5 = 0; // const/4 v5, 0x0
/* move-object/from16 v0, p0 */
/* move-object v1, v15 */
/* move/from16 v2, p1 */
/* move v3, v14 */
/* move/from16 v4, p2 */
/* move-object v6, v8 */
/* .line 57 */
v0 = /* invoke-virtual/range {v0 ..v6}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;IIII[I)I */
/* add-int/2addr v14, v0 */
/* .line 58 */
v0 = (( android.view.View ) v15 ).getMeasuredHeight ( ); // invoke-virtual {v15}, Landroid/view/View;->getMeasuredHeight()I
v1 = (( androidx.appcompat.widget.Toolbar ) v7 ).b ( v15 ); // invoke-virtual {v7, v15}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/view/View;)I
/* add-int/2addr v0, v1 */
v0 = java.lang.Math .max ( v12,v0 );
/* .line 59 */
v1 = (( android.view.View ) v15 ).getMeasuredState ( ); // invoke-virtual {v15}, Landroid/view/View;->getMeasuredState()I
v1 = android.view.View .combineMeasuredStates ( v13,v1 );
/* move v12, v0 */
/* move v13, v1 */
} // :cond_7
} // :goto_4
/* add-int/lit8 v11, v11, 0x1 */
/* .line 60 */
} // :cond_8
/* iget v0, v7, Landroidx/appcompat/widget/Toolbar;->s:I */
/* iget v1, v7, Landroidx/appcompat/widget/Toolbar;->t:I */
/* add-int v10, v0, v1 */
/* .line 61 */
/* iget v0, v7, Landroidx/appcompat/widget/Toolbar;->q:I */
/* iget v1, v7, Landroidx/appcompat/widget/Toolbar;->r:I */
/* add-int v11, v0, v1 */
/* .line 62 */
v0 = this.c;
v0 = (( androidx.appcompat.widget.Toolbar ) v7 ).d ( v0 ); // invoke-virtual {v7, v0}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 63 */
v1 = this.c;
/* add-int v3, v14, v11 */
/* move-object/from16 v0, p0 */
/* move/from16 v2, p1 */
/* move/from16 v4, p2 */
/* move v5, v10 */
/* move-object v6, v8 */
/* invoke-virtual/range {v0 ..v6}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;IIII[I)I */
/* .line 64 */
v0 = this.c;
v0 = (( android.widget.TextView ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredWidth()I
v1 = this.c;
v1 = (( androidx.appcompat.widget.Toolbar ) v7 ).a ( v1 ); // invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;)I
/* add-int/2addr v0, v1 */
/* .line 65 */
v1 = this.c;
v1 = (( android.widget.TextView ) v1 ).getMeasuredHeight ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getMeasuredHeight()I
v2 = this.c;
v2 = (( androidx.appcompat.widget.Toolbar ) v7 ).b ( v2 ); // invoke-virtual {v7, v2}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/view/View;)I
/* add-int/2addr v1, v2 */
/* .line 66 */
v2 = this.c;
v2 = (( android.widget.TextView ) v2 ).getMeasuredState ( ); // invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredState()I
v13 = android.view.View .combineMeasuredStates ( v13,v2 );
/* move v15, v1 */
/* move v6, v13 */
/* move v13, v0 */
} // :cond_9
/* move v6, v13 */
int v13 = 0; // const/4 v13, 0x0
int v15 = 0; // const/4 v15, 0x0
/* .line 67 */
} // :goto_5
v0 = this.d;
v0 = (( androidx.appcompat.widget.Toolbar ) v7 ).d ( v0 ); // invoke-virtual {v7, v0}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 68 */
v1 = this.d;
/* add-int v3, v14, v11 */
/* add-int v5, v15, v10 */
/* move-object/from16 v0, p0 */
/* move/from16 v2, p1 */
/* move/from16 v4, p2 */
/* move v10, v6 */
/* move-object v6, v8 */
v0 = /* invoke-virtual/range {v0 ..v6}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;IIII[I)I */
v13 = java.lang.Math .max ( v13,v0 );
/* .line 69 */
v0 = this.d;
v0 = (( android.widget.TextView ) v0 ).getMeasuredHeight ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredHeight()I
v1 = this.d;
/* .line 70 */
v1 = (( androidx.appcompat.widget.Toolbar ) v7 ).b ( v1 ); // invoke-virtual {v7, v1}, Landroidx/appcompat/widget/Toolbar;->b(Landroid/view/View;)I
/* add-int/2addr v0, v1 */
/* add-int/2addr v15, v0 */
/* .line 71 */
v0 = this.d;
/* .line 72 */
v0 = (( android.widget.TextView ) v0 ).getMeasuredState ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredState()I
/* .line 73 */
v6 = android.view.View .combineMeasuredStates ( v10,v0 );
} // :cond_a
/* move v10, v6 */
} // :goto_6
/* add-int/2addr v14, v13 */
/* .line 74 */
v0 = java.lang.Math .max ( v12,v15 );
/* .line 75 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* add-int/2addr v1, v2 */
/* add-int/2addr v14, v1 */
/* .line 76 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingBottom()I */
/* add-int/2addr v1, v2 */
/* add-int/2addr v0, v1 */
/* .line 77 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I */
v1 = java.lang.Math .max ( v14,v1 );
/* const/high16 v2, -0x1000000 */
/* and-int/2addr v2, v6 */
/* move/from16 v3, p1 */
/* .line 78 */
v1 = android.view.View .resolveSizeAndState ( v1,v3,v2 );
/* .line 79 */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I */
v0 = java.lang.Math .max ( v0,v2 );
/* shl-int/lit8 v2, v6, 0x10 */
/* move/from16 v3, p2 */
/* .line 80 */
v0 = android.view.View .resolveSizeAndState ( v0,v3,v2 );
/* .line 81 */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroidx/appcompat/widget/Toolbar;->q()Z */
if ( v2 != null) { // if-eqz v2, :cond_b
} // :cond_b
/* move v9, v0 */
} // :goto_7
(( android.view.ViewGroup ) v7 ).setMeasuredDimension ( v1, v9 ); // invoke-virtual {v7, v1, v9}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V
return;
} // .end method
public void onRestoreInstanceState ( android.os.Parcelable p0 ) {
/* .locals 3 */
/* .line 1 */
/* instance-of v0, p1, Landroidx/appcompat/widget/Toolbar$g; */
/* if-nez v0, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
return;
/* .line 3 */
} // :cond_0
/* check-cast p1, Landroidx/appcompat/widget/Toolbar$g; */
/* .line 4 */
(( c.j.a.c ) p1 ).a ( ); // invoke-virtual {p1}, Lc/j/a/c;->a()Landroid/os/Parcelable;
/* invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
/* .line 5 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
(( androidx.appcompat.widget.ActionMenuView ) v0 ).j ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->j()Lc/b/p/o/m;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
} // :goto_0
/* iget v1, p1, Landroidx/appcompat/widget/Toolbar$g;->d:I */
if ( v1 != null) { // if-eqz v1, :cond_2
v2 = this.L;
if ( v2 != null) { // if-eqz v2, :cond_2
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 7 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 8 */
/* .line 9 */
} // :cond_2
/* iget-boolean p1, p1, Landroidx/appcompat/widget/Toolbar$g;->e:Z */
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 10 */
(( androidx.appcompat.widget.Toolbar ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->o()V
} // :cond_3
return;
} // .end method
public void onRtlPropertiesChanged ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRtlPropertiesChanged(I)V */
/* .line 3 */
} // :cond_0
(( androidx.appcompat.widget.Toolbar ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->f()V
/* .line 4 */
v0 = this.u;
int v1 = 1; // const/4 v1, 0x1
/* if-ne p1, v1, :cond_1 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
(( c.b.q.b2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/b2;->a(Z)V
return;
} // .end method
public android.os.Parcelable onSaveInstanceState ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Landroidx/appcompat/widget/Toolbar$g; */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable; */
/* invoke-direct {v0, v1}, Landroidx/appcompat/widget/Toolbar$g;-><init>(Landroid/os/Parcelable;)V */
/* .line 2 */
v1 = this.L;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.c;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
v1 = (( c.b.p.o.p ) v1 ).getItemId ( ); // invoke-virtual {v1}, Lc/b/p/o/p;->getItemId()I
/* iput v1, v0, Landroidx/appcompat/widget/Toolbar$g;->d:I */
/* .line 4 */
} // :cond_0
v1 = (( androidx.appcompat.widget.Toolbar ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->n()Z
/* iput-boolean v1, v0, Landroidx/appcompat/widget/Toolbar$g;->e:Z */
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
/* iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->C:Z */
/* .line 3 */
} // :cond_0
/* iget-boolean v2, p0, Landroidx/appcompat/widget/Toolbar;->C:Z */
int v3 = 1; // const/4 v3, 0x1
/* if-nez v2, :cond_1 */
/* .line 4 */
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z */
/* if-nez v0, :cond_1 */
/* if-nez p1, :cond_1 */
/* .line 5 */
/* iput-boolean v3, p0, Landroidx/appcompat/widget/Toolbar;->C:Z */
} // :cond_1
/* if-eq v0, v3, :cond_2 */
int p1 = 3; // const/4 p1, 0x3
/* if-ne v0, p1, :cond_3 */
/* .line 6 */
} // :cond_2
/* iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->C:Z */
} // :cond_3
} // .end method
public void p ( ) {
/* .locals 4 */
/* .line 1 */
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 3 */
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroidx/appcompat/widget/Toolbar$e; */
/* .line 4 */
/* iget v2, v2, Landroidx/appcompat/widget/Toolbar$e;->b:I */
int v3 = 2; // const/4 v3, 0x2
/* if-eq v2, v3, :cond_0 */
v2 = this.b;
/* if-eq v1, v2, :cond_0 */
/* .line 5 */
(( android.view.ViewGroup ) p0 ).removeViewAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V
/* .line 6 */
v2 = this.F;
(( java.util.ArrayList ) v2 ).add ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
return;
} // .end method
public final Boolean q ( ) {
/* .locals 5 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/Toolbar;->O:Z */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_2 */
/* .line 3 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 4 */
v4 = (( androidx.appcompat.widget.Toolbar ) p0 ).d ( v3 ); // invoke-virtual {p0, v3}, Landroidx/appcompat/widget/Toolbar;->d(Landroid/view/View;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
v4 = (( android.view.View ) v3 ).getMeasuredWidth ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
/* if-lez v4, :cond_1 */
/* .line 5 */
v3 = (( android.view.View ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
/* if-lez v3, :cond_1 */
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean r ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( androidx.appcompat.widget.ActionMenuView ) v0 ).k ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->k()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void setCollapseContentDescription ( Integer p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getText ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
(( androidx.appcompat.widget.Toolbar ) p0 ).setCollapseContentDescription ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setCollapseContentDescription(Ljava/lang/CharSequence;)V
return;
} // .end method
public void setCollapseContentDescription ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez v0, :cond_0 */
/* .line 3 */
(( androidx.appcompat.widget.Toolbar ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->e()V
/* .line 4 */
} // :cond_0
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
(( android.widget.ImageButton ) v0 ).setContentDescription ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V
} // :cond_1
return;
} // .end method
public void setCollapseIcon ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
c.b.l.a.b .c ( v0,p1 );
(( androidx.appcompat.widget.Toolbar ) p0 ).setCollapseIcon ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setCollapseIcon(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setCollapseIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
(( androidx.appcompat.widget.Toolbar ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->e()V
/* .line 3 */
v0 = this.i;
(( android.widget.ImageButton ) v0 ).setImageDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 4 */
} // :cond_0
p1 = this.i;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 5 */
v0 = this.g;
(( android.widget.ImageButton ) p1 ).setImageDrawable ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_1
} // :goto_0
return;
} // .end method
public void setCollapsible ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/Toolbar;->O:Z */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
return;
} // .end method
public void setContentInsetEndWithActions ( Integer p0 ) {
/* .locals 1 */
/* if-gez p1, :cond_0 */
/* const/high16 p1, -0x80000000 */
/* .line 1 */
} // :cond_0
/* iget v0, p0, Landroidx/appcompat/widget/Toolbar;->w:I */
/* if-eq p1, v0, :cond_1 */
/* .line 2 */
/* iput p1, p0, Landroidx/appcompat/widget/Toolbar;->w:I */
/* .line 3 */
(( androidx.appcompat.widget.Toolbar ) p0 ).getNavigationIcon ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
} // :cond_1
return;
} // .end method
public void setContentInsetStartWithNavigation ( Integer p0 ) {
/* .locals 1 */
/* if-gez p1, :cond_0 */
/* const/high16 p1, -0x80000000 */
/* .line 1 */
} // :cond_0
/* iget v0, p0, Landroidx/appcompat/widget/Toolbar;->v:I */
/* if-eq p1, v0, :cond_1 */
/* .line 2 */
/* iput p1, p0, Landroidx/appcompat/widget/Toolbar;->v:I */
/* .line 3 */
(( androidx.appcompat.widget.Toolbar ) p0 ).getNavigationIcon ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
} // :cond_1
return;
} // .end method
public void setLogo ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
c.b.l.a.b .c ( v0,p1 );
(( androidx.appcompat.widget.Toolbar ) p0 ).setLogo ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setLogo ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
(( androidx.appcompat.widget.Toolbar ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->g()V
/* .line 3 */
v0 = this.f;
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->c(Landroid/view/View;)Z
/* if-nez v0, :cond_1 */
/* .line 4 */
v0 = this.f;
int v1 = 1; // const/4 v1, 0x1
(( androidx.appcompat.widget.Toolbar ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;Z)V
/* .line 5 */
} // :cond_0
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->c(Landroid/view/View;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
v0 = this.f;
(( android.view.ViewGroup ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 7 */
v0 = this.F;
v1 = this.f;
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 8 */
} // :cond_1
} // :goto_0
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 9 */
(( android.widget.ImageView ) v0 ).setImageDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_2
return;
} // .end method
public void setLogoDescription ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getText ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
(( androidx.appcompat.widget.Toolbar ) p0 ).setLogoDescription ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setLogoDescription(Ljava/lang/CharSequence;)V
return;
} // .end method
public void setLogoDescription ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez v0, :cond_0 */
/* .line 3 */
(( androidx.appcompat.widget.Toolbar ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->g()V
/* .line 4 */
} // :cond_0
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
(( android.widget.ImageView ) v0 ).setContentDescription ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V
} // :cond_1
return;
} // .end method
public void setNavigationContentDescription ( Integer p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getText ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
(( androidx.appcompat.widget.Toolbar ) p0 ).setNavigationContentDescription ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V
return;
} // .end method
public void setNavigationContentDescription ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez v0, :cond_0 */
/* .line 3 */
(( androidx.appcompat.widget.Toolbar ) p0 ).j ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->j()V
/* .line 4 */
} // :cond_0
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
(( android.widget.ImageButton ) v0 ).setContentDescription ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V
} // :cond_1
return;
} // .end method
public void setNavigationIcon ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
c.b.l.a.b .c ( v0,p1 );
(( androidx.appcompat.widget.Toolbar ) p0 ).setNavigationIcon ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setNavigationIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
(( androidx.appcompat.widget.Toolbar ) p0 ).j ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->j()V
/* .line 3 */
v0 = this.e;
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->c(Landroid/view/View;)Z
/* if-nez v0, :cond_1 */
/* .line 4 */
v0 = this.e;
int v1 = 1; // const/4 v1, 0x1
(( androidx.appcompat.widget.Toolbar ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;Z)V
/* .line 5 */
} // :cond_0
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->c(Landroid/view/View;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
v0 = this.e;
(( android.view.ViewGroup ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 7 */
v0 = this.F;
v1 = this.e;
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 8 */
} // :cond_1
} // :goto_0
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 9 */
(( android.widget.ImageButton ) v0 ).setImageDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_2
return;
} // .end method
public void setNavigationOnClickListener ( android.view.View$OnClickListener p0 ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.Toolbar ) p0 ).j ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->j()V
/* .line 2 */
v0 = this.e;
(( android.widget.ImageButton ) v0 ).setOnClickListener ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
return;
} // .end method
public void setOnMenuItemClickListener ( androidx.appcompat.widget.Toolbar$f p0 ) {
/* .locals 0 */
/* .line 1 */
this.H = p1;
return;
} // .end method
public void setOverflowIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.Toolbar ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->h()V
/* .line 2 */
v0 = this.b;
(( androidx.appcompat.widget.ActionMenuView ) v0 ).setOverflowIcon ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionMenuView;->setOverflowIcon(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setPopupTheme ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/Toolbar;->l:I */
/* if-eq v0, p1, :cond_1 */
/* .line 2 */
/* iput p1, p0, Landroidx/appcompat/widget/Toolbar;->l:I */
/* if-nez p1, :cond_0 */
/* .line 3 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
this.k = p1;
/* .line 4 */
} // :cond_0
/* new-instance v0, Landroid/view/ContextThemeWrapper; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V */
this.k = v0;
} // :cond_1
} // :goto_0
return;
} // .end method
public void setSubtitle ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getText ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
(( androidx.appcompat.widget.Toolbar ) p0 ).setSubtitle ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V
return;
} // .end method
public void setSubtitle ( java.lang.CharSequence p0 ) {
/* .locals 3 */
/* .line 2 */
v0 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez v0, :cond_2 */
/* .line 3 */
v0 = this.d;
/* if-nez v0, :cond_1 */
/* .line 4 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* .line 5 */
/* new-instance v1, Lc/b/q/v0; */
/* invoke-direct {v1, v0}, Lc/b/q/v0;-><init>(Landroid/content/Context;)V */
this.d = v1;
/* .line 6 */
(( android.widget.TextView ) v1 ).setSingleLine ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V
/* .line 7 */
v1 = this.d;
v2 = android.text.TextUtils$TruncateAt.END;
(( android.widget.TextView ) v1 ).setEllipsize ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
/* .line 8 */
/* iget v1, p0, Landroidx/appcompat/widget/Toolbar;->n:I */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 9 */
v2 = this.d;
(( android.widget.TextView ) v2 ).setTextAppearance ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
/* .line 10 */
} // :cond_0
v0 = this.B;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 11 */
v1 = this.d;
(( android.widget.TextView ) v1 ).setTextColor ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V
/* .line 12 */
} // :cond_1
v0 = this.d;
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->c(Landroid/view/View;)Z
/* if-nez v0, :cond_3 */
/* .line 13 */
v0 = this.d;
int v1 = 1; // const/4 v1, 0x1
(( androidx.appcompat.widget.Toolbar ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;Z)V
/* .line 14 */
} // :cond_2
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->c(Landroid/view/View;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 15 */
v0 = this.d;
(( android.view.ViewGroup ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 16 */
v0 = this.F;
v1 = this.d;
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 17 */
} // :cond_3
} // :goto_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 18 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 19 */
} // :cond_4
this.z = p1;
return;
} // .end method
public void setSubtitleTextColor ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
android.content.res.ColorStateList .valueOf ( p1 );
(( androidx.appcompat.widget.Toolbar ) p0 ).setSubtitleTextColor ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitleTextColor(Landroid/content/res/ColorStateList;)V
return;
} // .end method
public void setSubtitleTextColor ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 2 */
this.B = p1;
/* .line 3 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V
} // :cond_0
return;
} // .end method
public void setTitle ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getText ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
(( androidx.appcompat.widget.Toolbar ) p0 ).setTitle ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V
return;
} // .end method
public void setTitle ( java.lang.CharSequence p0 ) {
/* .locals 3 */
/* .line 2 */
v0 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez v0, :cond_2 */
/* .line 3 */
v0 = this.c;
/* if-nez v0, :cond_1 */
/* .line 4 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* .line 5 */
/* new-instance v1, Lc/b/q/v0; */
/* invoke-direct {v1, v0}, Lc/b/q/v0;-><init>(Landroid/content/Context;)V */
this.c = v1;
/* .line 6 */
(( android.widget.TextView ) v1 ).setSingleLine ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V
/* .line 7 */
v1 = this.c;
v2 = android.text.TextUtils$TruncateAt.END;
(( android.widget.TextView ) v1 ).setEllipsize ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
/* .line 8 */
/* iget v1, p0, Landroidx/appcompat/widget/Toolbar;->m:I */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 9 */
v2 = this.c;
(( android.widget.TextView ) v2 ).setTextAppearance ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
/* .line 10 */
} // :cond_0
v0 = this.A;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 11 */
v1 = this.c;
(( android.widget.TextView ) v1 ).setTextColor ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V
/* .line 12 */
} // :cond_1
v0 = this.c;
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->c(Landroid/view/View;)Z
/* if-nez v0, :cond_3 */
/* .line 13 */
v0 = this.c;
int v1 = 1; // const/4 v1, 0x1
(( androidx.appcompat.widget.Toolbar ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->a(Landroid/view/View;Z)V
/* .line 14 */
} // :cond_2
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( androidx.appcompat.widget.Toolbar ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->c(Landroid/view/View;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 15 */
v0 = this.c;
(( android.view.ViewGroup ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 16 */
v0 = this.F;
v1 = this.c;
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 17 */
} // :cond_3
} // :goto_0
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 18 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 19 */
} // :cond_4
this.y = p1;
return;
} // .end method
public void setTitleMarginBottom ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/appcompat/widget/Toolbar;->t:I */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
return;
} // .end method
public void setTitleMarginEnd ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/appcompat/widget/Toolbar;->r:I */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
return;
} // .end method
public void setTitleMarginStart ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/appcompat/widget/Toolbar;->q:I */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
return;
} // .end method
public void setTitleMarginTop ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/appcompat/widget/Toolbar;->s:I */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
return;
} // .end method
public void setTitleTextColor ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
android.content.res.ColorStateList .valueOf ( p1 );
(( androidx.appcompat.widget.Toolbar ) p0 ).setTitleTextColor ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitleTextColor(Landroid/content/res/ColorStateList;)V
return;
} // .end method
public void setTitleTextColor ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 2 */
this.A = p1;
/* .line 3 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V
} // :cond_0
return;
} // .end method
