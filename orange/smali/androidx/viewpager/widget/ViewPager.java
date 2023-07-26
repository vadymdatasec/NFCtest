public class androidx.viewpager.widget.ViewPager extends android.view.ViewGroup {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/viewpager/widget/ViewPager$n;, */
	 /* Landroidx/viewpager/widget/ViewPager$g;, */
	 /* Landroidx/viewpager/widget/ViewPager$l;, */
	 /* Landroidx/viewpager/widget/ViewPager$h;, */
	 /* Landroidx/viewpager/widget/ViewPager$m;, */
	 /* Landroidx/viewpager/widget/ViewPager$e;, */
	 /* Landroidx/viewpager/widget/ViewPager$i;, */
	 /* Landroidx/viewpager/widget/ViewPager$k;, */
	 /* Landroidx/viewpager/widget/ViewPager$j;, */
	 /* Landroidx/viewpager/widget/ViewPager$f; */
	 /* } */
} // .end annotation
/* # static fields */
public static final g0;
public static final java.util.Comparator h0;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Comparator<", */
/* "Landroidx/viewpager/widget/ViewPager$f;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static final android.view.animation.Interpolator i0;
public static final androidx.viewpager.widget.ViewPager$n j0;
/* # instance fields */
public Integer A;
public Integer B;
public Integer C;
public Float D;
public Float E;
public Float F;
public Float G;
public Integer H;
public android.view.VelocityTracker I;
public Integer J;
public Integer K;
public Integer L;
public Integer M;
public Boolean N;
public android.widget.EdgeEffect O;
public android.widget.EdgeEffect P;
public Boolean Q;
public Boolean R;
public Integer S;
public java.util.List T;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Landroidx/viewpager/widget/ViewPager$j;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public androidx.viewpager.widget.ViewPager$j U;
public androidx.viewpager.widget.ViewPager$j V;
public java.util.List W;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Landroidx/viewpager/widget/ViewPager$i;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public androidx.viewpager.widget.ViewPager$k a0;
public Integer b;
public Integer b0;
public final java.util.ArrayList c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroidx/viewpager/widget/ViewPager$f;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Integer c0;
public final androidx.viewpager.widget.ViewPager$f d;
public java.util.ArrayList d0;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final android.graphics.Rect e;
public final java.lang.Runnable e0;
public c.y.a.a f;
public Integer f0;
public Integer g;
public Integer h;
public android.os.Parcelable i;
public java.lang.ClassLoader j;
public android.widget.Scroller k;
public Boolean l;
public androidx.viewpager.widget.ViewPager$l m;
public Integer n;
public android.graphics.drawable.Drawable o;
public Integer p;
public Integer q;
public Float r;
public Float s;
public Integer t;
public Boolean u;
public Boolean v;
public Boolean w;
public Integer x;
public Boolean y;
public Boolean z;
/* # direct methods */
public static androidx.viewpager.widget.ViewPager ( ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [I */
int v1 = 0; // const/4 v1, 0x0
/* const v2, 0x10100b3 */
/* aput v2, v0, v1 */
/* .line 1 */
/* .line 2 */
/* new-instance v0, Landroidx/viewpager/widget/ViewPager$a; */
/* invoke-direct {v0}, Landroidx/viewpager/widget/ViewPager$a;-><init>()V */
/* .line 3 */
/* new-instance v0, Landroidx/viewpager/widget/ViewPager$b; */
/* invoke-direct {v0}, Landroidx/viewpager/widget/ViewPager$b;-><init>()V */
/* .line 4 */
/* new-instance v0, Landroidx/viewpager/widget/ViewPager$n; */
/* invoke-direct {v0}, Landroidx/viewpager/widget/ViewPager$n;-><init>()V */
return;
} // .end method
public androidx.viewpager.widget.ViewPager ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V */
/* .line 2 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.c = p1;
/* .line 3 */
/* new-instance p1, Landroidx/viewpager/widget/ViewPager$f; */
/* invoke-direct {p1}, Landroidx/viewpager/widget/ViewPager$f;-><init>()V */
this.d = p1;
/* .line 4 */
/* new-instance p1, Landroid/graphics/Rect; */
/* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
this.e = p1;
int p1 = -1; // const/4 p1, -0x1
/* .line 5 */
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->h:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
this.i = v0;
/* .line 7 */
this.j = v0;
/* const v0, -0x800001 */
/* .line 8 */
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager;->r:F */
/* const v0, 0x7f7fffff # Float.MAX_VALUE */
/* .line 9 */
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager;->s:F */
int v0 = 1; // const/4 v0, 0x1
/* .line 10 */
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager;->x:I */
/* .line 11 */
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->H:I */
/* .line 12 */
/* iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->Q:Z */
/* .line 13 */
/* new-instance p1, Landroidx/viewpager/widget/ViewPager$c; */
/* invoke-direct {p1, p0}, Landroidx/viewpager/widget/ViewPager$c;-><init>(Landroidx/viewpager/widget/ViewPager;)V */
this.e0 = p1;
int p1 = 0; // const/4 p1, 0x0
/* .line 14 */
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->f0:I */
/* .line 15 */
(( androidx.viewpager.widget.ViewPager ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->d()V
return;
} // .end method
public androidx.viewpager.widget.ViewPager ( ) {
/* .locals 0 */
/* .line 16 */
/* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* .line 17 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.c = p1;
/* .line 18 */
/* new-instance p1, Landroidx/viewpager/widget/ViewPager$f; */
/* invoke-direct {p1}, Landroidx/viewpager/widget/ViewPager$f;-><init>()V */
this.d = p1;
/* .line 19 */
/* new-instance p1, Landroid/graphics/Rect; */
/* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
this.e = p1;
int p1 = -1; // const/4 p1, -0x1
/* .line 20 */
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->h:I */
int p2 = 0; // const/4 p2, 0x0
/* .line 21 */
this.i = p2;
/* .line 22 */
this.j = p2;
/* const p2, -0x800001 */
/* .line 23 */
/* iput p2, p0, Landroidx/viewpager/widget/ViewPager;->r:F */
/* const p2, 0x7f7fffff # Float.MAX_VALUE */
/* .line 24 */
/* iput p2, p0, Landroidx/viewpager/widget/ViewPager;->s:F */
int p2 = 1; // const/4 p2, 0x1
/* .line 25 */
/* iput p2, p0, Landroidx/viewpager/widget/ViewPager;->x:I */
/* .line 26 */
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->H:I */
/* .line 27 */
/* iput-boolean p2, p0, Landroidx/viewpager/widget/ViewPager;->Q:Z */
/* .line 28 */
/* new-instance p1, Landroidx/viewpager/widget/ViewPager$c; */
/* invoke-direct {p1, p0}, Landroidx/viewpager/widget/ViewPager$c;-><init>(Landroidx/viewpager/widget/ViewPager;)V */
this.e0 = p1;
int p1 = 0; // const/4 p1, 0x0
/* .line 29 */
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->f0:I */
/* .line 30 */
(( androidx.viewpager.widget.ViewPager ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->d()V
return;
} // .end method
public static Boolean c ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* .line 2 */
/* const-class v0, Landroidx/viewpager/widget/ViewPager$e; */
(( java.lang.Class ) p0 ).getAnnotation ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
if ( p0 != null) { // if-eqz p0, :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
private Integer getClientWidth ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( android.view.ViewGroup ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I
v1 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* sub-int/2addr v0, v1 */
v1 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* sub-int/2addr v0, v1 */
} // .end method
private void setScrollingCacheEnabled ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->v:Z */
/* if-eq v0, p1, :cond_0 */
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/viewpager/widget/ViewPager;->v:Z */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public Float a ( Float p0 ) {
/* .locals 2 */
/* const/high16 v0, 0x3f000000 # 0.5f */
/* sub-float/2addr p1, v0 */
/* const v0, 0x3ef1463b */
/* mul-float p1, p1, v0 */
/* float-to-double v0, p1 */
/* .line 35 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float p1, v0 */
} // .end method
public final Integer a ( Integer p0, Float p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .line 179 */
p4 = java.lang.Math .abs ( p4 );
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->L:I */
/* if-le p4, v0, :cond_1 */
p4 = java.lang.Math .abs ( p3 );
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->J:I */
/* if-le p4, v0, :cond_1 */
/* if-lez p3, :cond_0 */
} // :cond_0
/* add-int/lit8 p1, p1, 0x1 */
/* .line 180 */
} // :cond_1
/* iget p3, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* if-lt p1, p3, :cond_2 */
/* const p3, 0x3ecccccd # 0.4f */
} // :cond_2
/* const p3, 0x3f19999a # 0.6f */
} // :goto_0
/* add-float/2addr p2, p3 */
/* float-to-int p2, p2 */
/* add-int/2addr p1, p2 */
/* .line 181 */
} // :goto_1
p2 = this.c;
p2 = (( java.util.ArrayList ) p2 ).size ( ); // invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
/* if-lez p2, :cond_3 */
/* .line 182 */
p2 = this.c;
int p3 = 0; // const/4 p3, 0x0
(( java.util.ArrayList ) p2 ).get ( p3 ); // invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p2, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 183 */
p3 = this.c;
p4 = (( java.util.ArrayList ) p3 ).size ( ); // invoke-virtual {p3}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 p4, p4, -0x1 */
(( java.util.ArrayList ) p3 ).get ( p4 ); // invoke-virtual {p3, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p3, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 184 */
/* iget p2, p2, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* iget p3, p3, Landroidx/viewpager/widget/ViewPager$f;->b:I */
p1 = java.lang.Math .min ( p1,p3 );
p1 = java.lang.Math .max ( p2,p1 );
} // :cond_3
} // .end method
public final android.graphics.Rect a ( android.graphics.Rect p0, android.view.View p1 ) {
/* .locals 2 */
/* if-nez p1, :cond_0 */
/* .line 239 */
/* new-instance p1, Landroid/graphics/Rect; */
/* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
} // :cond_0
/* if-nez p2, :cond_1 */
int p2 = 0; // const/4 p2, 0x0
/* .line 240 */
(( android.graphics.Rect ) p1 ).set ( p2, p2, p2, p2 ); // invoke-virtual {p1, p2, p2, p2, p2}, Landroid/graphics/Rect;->set(IIII)V
/* .line 241 */
} // :cond_1
v0 = (( android.view.View ) p2 ).getLeft ( ); // invoke-virtual {p2}, Landroid/view/View;->getLeft()I
/* iput v0, p1, Landroid/graphics/Rect;->left:I */
/* .line 242 */
v0 = (( android.view.View ) p2 ).getRight ( ); // invoke-virtual {p2}, Landroid/view/View;->getRight()I
/* iput v0, p1, Landroid/graphics/Rect;->right:I */
/* .line 243 */
v0 = (( android.view.View ) p2 ).getTop ( ); // invoke-virtual {p2}, Landroid/view/View;->getTop()I
/* iput v0, p1, Landroid/graphics/Rect;->top:I */
/* .line 244 */
v0 = (( android.view.View ) p2 ).getBottom ( ); // invoke-virtual {p2}, Landroid/view/View;->getBottom()I
/* iput v0, p1, Landroid/graphics/Rect;->bottom:I */
/* .line 245 */
(( android.view.View ) p2 ).getParent ( ); // invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 246 */
} // :goto_0
/* instance-of v0, p2, Landroid/view/ViewGroup; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* if-eq p2, p0, :cond_2 */
/* .line 247 */
/* check-cast p2, Landroid/view/ViewGroup; */
/* .line 248 */
/* iget v0, p1, Landroid/graphics/Rect;->left:I */
v1 = (( android.view.ViewGroup ) p2 ).getLeft ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->getLeft()I
/* add-int/2addr v0, v1 */
/* iput v0, p1, Landroid/graphics/Rect;->left:I */
/* .line 249 */
/* iget v0, p1, Landroid/graphics/Rect;->right:I */
v1 = (( android.view.ViewGroup ) p2 ).getRight ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->getRight()I
/* add-int/2addr v0, v1 */
/* iput v0, p1, Landroid/graphics/Rect;->right:I */
/* .line 250 */
/* iget v0, p1, Landroid/graphics/Rect;->top:I */
v1 = (( android.view.ViewGroup ) p2 ).getTop ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->getTop()I
/* add-int/2addr v0, v1 */
/* iput v0, p1, Landroid/graphics/Rect;->top:I */
/* .line 251 */
/* iget v0, p1, Landroid/graphics/Rect;->bottom:I */
v1 = (( android.view.ViewGroup ) p2 ).getBottom ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->getBottom()I
/* add-int/2addr v0, v1 */
/* iput v0, p1, Landroid/graphics/Rect;->bottom:I */
/* .line 252 */
(( android.view.ViewGroup ) p2 ).getParent ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
} // :cond_2
} // .end method
public androidx.viewpager.widget.ViewPager$f a ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 61 */
/* new-instance v0, Landroidx/viewpager/widget/ViewPager$f; */
/* invoke-direct {v0}, Landroidx/viewpager/widget/ViewPager$f;-><init>()V */
/* .line 62 */
/* iput p1, v0, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* .line 63 */
v1 = this.f;
(( c.y.a.a ) v1 ).a ( p0, p1 ); // invoke-virtual {v1, p0, p1}, Lc/y/a/a;->a(Landroid/view/ViewGroup;I)Ljava/lang/Object;
this.a = v1;
/* .line 64 */
v1 = this.f;
p1 = (( c.y.a.a ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lc/y/a/a;->a(I)F
/* iput p1, v0, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* if-ltz p2, :cond_1 */
/* .line 65 */
p1 = this.c;
p1 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
/* if-lt p2, p1, :cond_0 */
/* .line 66 */
} // :cond_0
p1 = this.c;
(( java.util.ArrayList ) p1 ).add ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
/* .line 67 */
} // :cond_1
} // :goto_0
p1 = this.c;
(( java.util.ArrayList ) p1 ).add ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :goto_1
} // .end method
public androidx.viewpager.widget.ViewPager$f a ( android.view.View p0 ) {
/* .locals 1 */
/* .line 136 */
} // :goto_0
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* if-eq v0, p0, :cond_2 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 137 */
/* instance-of p1, v0, Landroid/view/View; */
/* if-nez p1, :cond_0 */
/* .line 138 */
} // :cond_0
/* move-object p1, v0 */
/* check-cast p1, Landroid/view/View; */
} // :cond_1
} // :goto_1
int p1 = 0; // const/4 p1, 0x0
/* .line 139 */
} // :cond_2
(( androidx.viewpager.widget.ViewPager ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->b(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$f;
} // .end method
public void a ( ) {
/* .locals 10 */
/* .line 68 */
v0 = this.f;
v0 = (( c.y.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/y/a/a;->a()I
/* .line 69 */
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager;->b:I */
/* .line 70 */
v1 = this.c;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* iget v2, p0, Landroidx/viewpager/widget/ViewPager;->x:I */
/* mul-int/lit8 v2, v2, 0x2 */
int v3 = 1; // const/4 v3, 0x1
/* add-int/2addr v2, v3 */
int v4 = 0; // const/4 v4, 0x0
/* if-ge v1, v2, :cond_0 */
v1 = this.c;
/* .line 71 */
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-ge v1, v0, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 72 */
} // :goto_0
/* iget v2, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* .line 73 */
} // :goto_1
v7 = this.c;
v7 = (( java.util.ArrayList ) v7 ).size ( ); // invoke-virtual {v7}, Ljava/util/ArrayList;->size()I
/* if-ge v5, v7, :cond_7 */
/* .line 74 */
v7 = this.c;
(( java.util.ArrayList ) v7 ).get ( v5 ); // invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v7, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 75 */
v8 = this.f;
v9 = this.a;
v8 = (( c.y.a.a ) v8 ).a ( v9 ); // invoke-virtual {v8, v9}, Lc/y/a/a;->a(Ljava/lang/Object;)I
int v9 = -1; // const/4 v9, -0x1
/* if-ne v8, v9, :cond_1 */
} // :cond_1
int v9 = -2; // const/4 v9, -0x2
/* if-ne v8, v9, :cond_4 */
/* .line 76 */
v1 = this.c;
(( java.util.ArrayList ) v1 ).remove ( v5 ); // invoke-virtual {v1, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* add-int/lit8 v5, v5, -0x1 */
/* if-nez v6, :cond_2 */
/* .line 77 */
v1 = this.f;
(( c.y.a.a ) v1 ).b ( p0 ); // invoke-virtual {v1, p0}, Lc/y/a/a;->b(Landroid/view/ViewGroup;)V
int v6 = 1; // const/4 v6, 0x1
/* .line 78 */
} // :cond_2
v1 = this.f;
/* iget v8, v7, Landroidx/viewpager/widget/ViewPager$f;->b:I */
v9 = this.a;
(( c.y.a.a ) v1 ).a ( p0, v8, v9 ); // invoke-virtual {v1, p0, v8, v9}, Lc/y/a/a;->a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
/* .line 79 */
/* iget v1, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* iget v7, v7, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-ne v1, v7, :cond_3 */
/* add-int/lit8 v2, v0, -0x1 */
/* .line 80 */
v1 = java.lang.Math .min ( v1,v2 );
v1 = java.lang.Math .max ( v4,v1 );
/* move v2, v1 */
} // :cond_3
} // :goto_2
int v1 = 1; // const/4 v1, 0x1
/* .line 81 */
} // :cond_4
/* iget v9, v7, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-eq v9, v8, :cond_6 */
/* .line 82 */
/* iget v1, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* if-ne v9, v1, :cond_5 */
/* move v2, v8 */
/* .line 83 */
} // :cond_5
/* iput v8, v7, Landroidx/viewpager/widget/ViewPager$f;->b:I */
} // :cond_6
} // :goto_3
/* add-int/2addr v5, v3 */
} // :cond_7
if ( v6 != null) { // if-eqz v6, :cond_8
/* .line 84 */
v0 = this.f;
(( c.y.a.a ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/y/a/a;->a(Landroid/view/ViewGroup;)V
/* .line 85 */
} // :cond_8
v0 = this.c;
v5 = androidx.viewpager.widget.ViewPager.h0;
java.util.Collections .sort ( v0,v5 );
if ( v1 != null) { // if-eqz v1, :cond_b
/* .line 86 */
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_4
/* if-ge v1, v0, :cond_a */
/* .line 87 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 88 */
(( android.view.View ) v5 ).getLayoutParams ( ); // invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroidx/viewpager/widget/ViewPager$g; */
/* .line 89 */
/* iget-boolean v6, v5, Landroidx/viewpager/widget/ViewPager$g;->a:Z */
/* if-nez v6, :cond_9 */
int v6 = 0; // const/4 v6, 0x0
/* .line 90 */
/* iput v6, v5, Landroidx/viewpager/widget/ViewPager$g;->c:F */
} // :cond_9
/* add-int/lit8 v1, v1, 0x1 */
/* .line 91 */
} // :cond_a
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( v2, v4, v3 ); // invoke-virtual {p0, v2, v4, v3}, Landroidx/viewpager/widget/ViewPager;->a(IZZ)V
/* .line 92 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
} // :cond_b
return;
} // .end method
public final void a ( Integer p0, Float p1, Integer p2 ) {
/* .locals 3 */
/* .line 153 */
v0 = this.U;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 154 */
/* .line 155 */
} // :cond_0
v0 = this.T;
if ( v0 != null) { // if-eqz v0, :cond_2
int v1 = 0; // const/4 v1, 0x0
v0 = /* .line 156 */
} // :goto_0
/* if-ge v1, v0, :cond_2 */
/* .line 157 */
v2 = this.T;
/* check-cast v2, Landroidx/viewpager/widget/ViewPager$j; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 158 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
/* .line 159 */
} // :cond_2
v0 = this.V;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 160 */
} // :cond_3
return;
} // .end method
public void a ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 9 */
/* .line 36 */
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 37 */
/* invoke-direct {p0, v1}, Landroidx/viewpager/widget/ViewPager;->setScrollingCacheEnabled(Z)V */
return;
/* .line 38 */
} // :cond_0
v0 = this.k;
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( android.widget.Scroller ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 39 */
/* iget-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.k;
v0 = (( android.widget.Scroller ) v0 ).getCurrX ( ); // invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I
} // :cond_2
v0 = this.k;
v0 = (( android.widget.Scroller ) v0 ).getStartX ( ); // invoke-virtual {v0}, Landroid/widget/Scroller;->getStartX()I
/* .line 40 */
} // :goto_1
v3 = this.k;
(( android.widget.Scroller ) v3 ).abortAnimation ( ); // invoke-virtual {v3}, Landroid/widget/Scroller;->abortAnimation()V
/* .line 41 */
/* invoke-direct {p0, v1}, Landroidx/viewpager/widget/ViewPager;->setScrollingCacheEnabled(Z)V */
/* .line 42 */
} // :cond_3
v0 = (( android.view.ViewGroup ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollX()I
} // :goto_2
/* move v4, v0 */
/* .line 43 */
v5 = (( android.view.ViewGroup ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I
/* sub-int v6, p1, v4 */
/* sub-int v7, p2, v5 */
/* if-nez v6, :cond_4 */
/* if-nez v7, :cond_4 */
/* .line 44 */
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Landroidx/viewpager/widget/ViewPager;->a(Z)V
/* .line 45 */
(( androidx.viewpager.widget.ViewPager ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->g()V
/* .line 46 */
(( androidx.viewpager.widget.ViewPager ) p0 ).setScrollState ( v1 ); // invoke-virtual {p0, v1}, Landroidx/viewpager/widget/ViewPager;->setScrollState(I)V
return;
/* .line 47 */
} // :cond_4
/* invoke-direct {p0, v2}, Landroidx/viewpager/widget/ViewPager;->setScrollingCacheEnabled(Z)V */
int p1 = 2; // const/4 p1, 0x2
/* .line 48 */
(( androidx.viewpager.widget.ViewPager ) p0 ).setScrollState ( p1 ); // invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->setScrollState(I)V
/* .line 49 */
p1 = /* invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->getClientWidth()I */
/* .line 50 */
/* div-int/lit8 p2, p1, 0x2 */
/* .line 51 */
v0 = java.lang.Math .abs ( v6 );
/* int-to-float v0, v0 */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* mul-float v0, v0, v2 */
/* int-to-float p1, p1 */
/* div-float/2addr v0, p1 */
v0 = java.lang.Math .min ( v2,v0 );
/* int-to-float p2, p2 */
/* .line 52 */
v0 = (( androidx.viewpager.widget.ViewPager ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/viewpager/widget/ViewPager;->a(F)F
/* mul-float v0, v0, p2 */
/* add-float/2addr p2, v0 */
/* .line 53 */
p3 = java.lang.Math .abs ( p3 );
/* if-lez p3, :cond_5 */
/* const/high16 p1, 0x447a0000 # 1000.0f */
/* int-to-float p3, p3 */
/* div-float/2addr p2, p3 */
/* .line 54 */
p2 = java.lang.Math .abs ( p2 );
/* mul-float p2, p2, p1 */
p1 = java.lang.Math .round ( p2 );
/* mul-int/lit8 p1, p1, 0x4 */
/* .line 55 */
} // :cond_5
p2 = this.f;
/* iget p3, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
p2 = (( c.y.a.a ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Lc/y/a/a;->a(I)F
/* mul-float p1, p1, p2 */
/* .line 56 */
p2 = java.lang.Math .abs ( v6 );
/* int-to-float p2, p2 */
/* iget p3, p0, Landroidx/viewpager/widget/ViewPager;->n:I */
/* int-to-float p3, p3 */
/* add-float/2addr p1, p3 */
/* div-float/2addr p2, p1 */
/* add-float/2addr p2, v2 */
/* const/high16 p1, 0x42c80000 # 100.0f */
/* mul-float p2, p2, p1 */
/* float-to-int p1, p2 */
} // :goto_3
/* const/16 p2, 0x258 */
/* .line 57 */
v8 = java.lang.Math .min ( p1,p2 );
/* .line 58 */
/* iput-boolean v1, p0, Landroidx/viewpager/widget/ViewPager;->l:Z */
/* .line 59 */
v3 = this.k;
/* invoke-virtual/range {v3 ..v8}, Landroid/widget/Scroller;->startScroll(IIIII)V */
/* .line 60 */
c.h.n.v0 .H ( p0 );
return;
} // .end method
public final void a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* if-lez p2, :cond_1 */
/* .line 140 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
/* if-nez v0, :cond_1 */
/* .line 141 */
v0 = this.k;
v0 = (( android.widget.Scroller ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z
/* if-nez v0, :cond_0 */
/* .line 142 */
p1 = this.k;
p2 = (( androidx.viewpager.widget.ViewPager ) p0 ).getCurrentItem ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I
p3 = /* invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->getClientWidth()I */
/* mul-int p2, p2, p3 */
(( android.widget.Scroller ) p1 ).setFinalX ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/Scroller;->setFinalX(I)V
/* .line 143 */
} // :cond_0
v0 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* sub-int/2addr p1, v0 */
v0 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* sub-int/2addr p1, v0 */
/* add-int/2addr p1, p3 */
/* .line 144 */
p3 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* sub-int/2addr p2, p3 */
p3 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* sub-int/2addr p2, p3 */
/* add-int/2addr p2, p4 */
/* .line 145 */
p3 = (( android.view.ViewGroup ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollX()I
/* int-to-float p3, p3 */
/* int-to-float p2, p2 */
/* div-float/2addr p3, p2 */
/* int-to-float p1, p1 */
/* mul-float p3, p3, p1 */
/* float-to-int p1, p3 */
/* .line 146 */
p2 = (( android.view.ViewGroup ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I
(( android.view.ViewGroup ) p0 ).scrollTo ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->scrollTo(II)V
/* .line 147 */
} // :cond_1
/* iget p2, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
(( androidx.viewpager.widget.ViewPager ) p0 ).d ( p2 ); // invoke-virtual {p0, p2}, Landroidx/viewpager/widget/ViewPager;->d(I)Landroidx/viewpager/widget/ViewPager$f;
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 148 */
/* iget p2, p2, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* iget p3, p0, Landroidx/viewpager/widget/ViewPager;->s:F */
p2 = java.lang.Math .min ( p2,p3 );
} // :cond_2
int p2 = 0; // const/4 p2, 0x0
/* .line 149 */
} // :goto_0
p3 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* sub-int/2addr p1, p3 */
p3 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* sub-int/2addr p1, p3 */
/* int-to-float p1, p1 */
/* mul-float p2, p2, p1 */
/* float-to-int p1, p2 */
/* .line 150 */
p2 = (( android.view.ViewGroup ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollX()I
/* if-eq p1, p2, :cond_3 */
int p2 = 0; // const/4 p2, 0x0
/* .line 151 */
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/viewpager/widget/ViewPager;->a(Z)V
/* .line 152 */
p2 = (( android.view.ViewGroup ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I
(( android.view.ViewGroup ) p0 ).scrollTo ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->scrollTo(II)V
} // :cond_3
} // :goto_1
return;
} // .end method
public void a ( Integer p0, Boolean p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->w:Z */
/* .line 2 */
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Landroidx/viewpager/widget/ViewPager;->a(IZZ)V
return;
} // .end method
public final void a ( Integer p0, Boolean p1, Integer p2, Boolean p3 ) {
/* .locals 5 */
/* .line 21 */
(( androidx.viewpager.widget.ViewPager ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->d(I)Landroidx/viewpager/widget/ViewPager$f;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 22 */
v2 = /* invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->getClientWidth()I */
/* int-to-float v2, v2 */
/* .line 23 */
/* iget v3, p0, Landroidx/viewpager/widget/ViewPager;->r:F */
/* iget v0, v0, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* iget v4, p0, Landroidx/viewpager/widget/ViewPager;->s:F */
/* .line 24 */
v0 = java.lang.Math .min ( v0,v4 );
/* .line 25 */
v0 = java.lang.Math .max ( v3,v0 );
/* mul-float v2, v2, v0 */
/* float-to-int v0, v2 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 26 */
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( v0, v1, p3 ); // invoke-virtual {p0, v0, v1, p3}, Landroidx/viewpager/widget/ViewPager;->a(III)V
if ( p4 != null) { // if-eqz p4, :cond_3
/* .line 27 */
(( androidx.viewpager.widget.ViewPager ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->b(I)V
} // :cond_1
if ( p4 != null) { // if-eqz p4, :cond_2
/* .line 28 */
(( androidx.viewpager.widget.ViewPager ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->b(I)V
/* .line 29 */
} // :cond_2
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Landroidx/viewpager/widget/ViewPager;->a(Z)V
/* .line 30 */
(( android.view.ViewGroup ) p0 ).scrollTo ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->scrollTo(II)V
/* .line 31 */
(( androidx.viewpager.widget.ViewPager ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Landroidx/viewpager/widget/ViewPager;->e(I)Z
} // :cond_3
} // :goto_1
return;
} // .end method
public void a ( Integer p0, Boolean p1, Boolean p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/viewpager/widget/ViewPager;->a(IZZI)V
return;
} // .end method
public void a ( Integer p0, Boolean p1, Boolean p2, Integer p3 ) {
/* .locals 4 */
/* .line 4 */
v0 = this.f;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_9
v0 = (( c.y.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/y/a/a;->a()I
/* if-gtz v0, :cond_0 */
} // :cond_0
/* if-nez p3, :cond_1 */
/* .line 5 */
/* iget p3, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* if-ne p3, p1, :cond_1 */
p3 = this.c;
p3 = (( java.util.ArrayList ) p3 ).size ( ); // invoke-virtual {p3}, Ljava/util/ArrayList;->size()I
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 6 */
/* invoke-direct {p0, v1}, Landroidx/viewpager/widget/ViewPager;->setScrollingCacheEnabled(Z)V */
return;
} // :cond_1
int p3 = 1; // const/4 p3, 0x1
/* if-gez p1, :cond_2 */
int p1 = 0; // const/4 p1, 0x0
/* .line 7 */
} // :cond_2
v0 = this.f;
v0 = (( c.y.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/y/a/a;->a()I
/* if-lt p1, v0, :cond_3 */
/* .line 8 */
p1 = this.f;
p1 = (( c.y.a.a ) p1 ).a ( ); // invoke-virtual {p1}, Lc/y/a/a;->a()I
/* sub-int/2addr p1, p3 */
/* .line 9 */
} // :cond_3
} // :goto_0
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->x:I */
/* .line 10 */
/* iget v2, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* add-int v3, v2, v0 */
/* if-gt p1, v3, :cond_4 */
/* sub-int/2addr v2, v0 */
/* if-ge p1, v2, :cond_5 */
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
} // :goto_1
v2 = this.c;
v2 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
/* if-ge v0, v2, :cond_5 */
/* .line 12 */
v2 = this.c;
(( java.util.ArrayList ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroidx/viewpager/widget/ViewPager$f; */
/* iput-boolean p3, v2, Landroidx/viewpager/widget/ViewPager$f;->c:Z */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 13 */
} // :cond_5
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* if-eq v0, p1, :cond_6 */
int v1 = 1; // const/4 v1, 0x1
/* .line 14 */
} // :cond_6
/* iget-boolean p3, p0, Landroidx/viewpager/widget/ViewPager;->Q:Z */
if ( p3 != null) { // if-eqz p3, :cond_8
/* .line 15 */
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 16 */
(( androidx.viewpager.widget.ViewPager ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->b(I)V
/* .line 17 */
} // :cond_7
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
/* .line 18 */
} // :cond_8
(( androidx.viewpager.widget.ViewPager ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->f(I)V
/* .line 19 */
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( p1, p2, p4, v1 ); // invoke-virtual {p0, p1, p2, p4, v1}, Landroidx/viewpager/widget/ViewPager;->a(IZIZ)V
} // :goto_2
return;
/* .line 20 */
} // :cond_9
} // :goto_3
/* invoke-direct {p0, v1}, Landroidx/viewpager/widget/ViewPager;->setScrollingCacheEnabled(Z)V */
return;
} // .end method
public final void a ( android.view.MotionEvent p0 ) {
/* .locals 3 */
/* .line 185 */
v0 = (( android.view.MotionEvent ) p1 ).getActionIndex ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I
/* .line 186 */
v1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 187 */
/* iget v2, p0, Landroidx/viewpager/widget/ViewPager;->H:I */
/* if-ne v1, v2, :cond_1 */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 188 */
} // :goto_0
v1 = (( android.view.MotionEvent ) p1 ).getX ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F
/* iput v1, p0, Landroidx/viewpager/widget/ViewPager;->D:F */
/* .line 189 */
p1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->H:I */
/* .line 190 */
p1 = this.I;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 191 */
(( android.view.VelocityTracker ) p1 ).clear ( ); // invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V
} // :cond_1
return;
} // .end method
public final void a ( androidx.viewpager.widget.ViewPager$f p0, Integer p1, androidx.viewpager.widget.ViewPager$f p2 ) {
/* .locals 9 */
/* .line 93 */
v0 = this.f;
v0 = (( c.y.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/y/a/a;->a()I
/* .line 94 */
v1 = /* invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->getClientWidth()I */
/* if-lez v1, :cond_0 */
/* .line 95 */
/* iget v2, p0, Landroidx/viewpager/widget/ViewPager;->n:I */
/* int-to-float v2, v2 */
/* int-to-float v1, v1 */
/* div-float/2addr v2, v1 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
if ( p3 != null) { // if-eqz p3, :cond_6
/* .line 96 */
/* iget v1, p3, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* .line 97 */
/* iget v3, p1, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-ge v1, v3, :cond_3 */
int v3 = 0; // const/4 v3, 0x0
/* .line 98 */
/* iget v4, p3, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* iget p3, p3, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr v4, p3 */
/* add-float/2addr v4, v2 */
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
/* .line 99 */
/* iget p3, p1, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-gt v1, p3, :cond_6 */
p3 = this.c;
p3 = (( java.util.ArrayList ) p3 ).size ( ); // invoke-virtual {p3}, Ljava/util/ArrayList;->size()I
/* if-ge v3, p3, :cond_6 */
/* .line 100 */
p3 = this.c;
(( java.util.ArrayList ) p3 ).get ( v3 ); // invoke-virtual {p3, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p3, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 101 */
} // :goto_2
/* iget v5, p3, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-le v1, v5, :cond_1 */
v5 = this.c;
v5 = (( java.util.ArrayList ) v5 ).size ( ); // invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v5, v5, -0x1 */
/* if-ge v3, v5, :cond_1 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 102 */
p3 = this.c;
(( java.util.ArrayList ) p3 ).get ( v3 ); // invoke-virtual {p3, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p3, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 103 */
} // :cond_1
} // :goto_3
/* iget v5, p3, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-ge v1, v5, :cond_2 */
/* .line 104 */
v5 = this.f;
v5 = (( c.y.a.a ) v5 ).a ( v1 ); // invoke-virtual {v5, v1}, Lc/y/a/a;->a(I)F
/* add-float/2addr v5, v2 */
/* add-float/2addr v4, v5 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 105 */
} // :cond_2
/* iput v4, p3, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* .line 106 */
/* iget p3, p3, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr p3, v2 */
/* add-float/2addr v4, p3 */
} // :cond_3
/* if-le v1, v3, :cond_6 */
/* .line 107 */
v3 = this.c;
v3 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v3, v3, -0x1 */
/* .line 108 */
/* iget p3, p3, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* add-int/lit8 v1, v1, -0x1 */
/* .line 109 */
} // :goto_4
/* iget v4, p1, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-lt v1, v4, :cond_6 */
/* if-ltz v3, :cond_6 */
/* .line 110 */
v4 = this.c;
(( java.util.ArrayList ) v4 ).get ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 111 */
} // :goto_5
/* iget v5, v4, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-ge v1, v5, :cond_4 */
/* if-lez v3, :cond_4 */
/* add-int/lit8 v3, v3, -0x1 */
/* .line 112 */
v4 = this.c;
(( java.util.ArrayList ) v4 ).get ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 113 */
} // :cond_4
} // :goto_6
/* iget v5, v4, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-le v1, v5, :cond_5 */
/* .line 114 */
v5 = this.f;
v5 = (( c.y.a.a ) v5 ).a ( v1 ); // invoke-virtual {v5, v1}, Lc/y/a/a;->a(I)F
/* add-float/2addr v5, v2 */
/* sub-float/2addr p3, v5 */
/* add-int/lit8 v1, v1, -0x1 */
/* .line 115 */
} // :cond_5
/* iget v5, v4, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr v5, v2 */
/* sub-float/2addr p3, v5 */
/* .line 116 */
/* iput p3, v4, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* add-int/lit8 v1, v1, -0x1 */
/* .line 117 */
} // :cond_6
p3 = this.c;
p3 = (( java.util.ArrayList ) p3 ).size ( ); // invoke-virtual {p3}, Ljava/util/ArrayList;->size()I
/* .line 118 */
/* iget v1, p1, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* .line 119 */
/* iget v3, p1, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* add-int/lit8 v4, v3, -0x1 */
/* if-nez v3, :cond_7 */
/* move v3, v1 */
} // :cond_7
/* const v3, -0x800001 */
/* .line 120 */
} // :goto_7
/* iput v3, p0, Landroidx/viewpager/widget/ViewPager;->r:F */
/* .line 121 */
/* iget v3, p1, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* add-int/lit8 v0, v0, -0x1 */
/* const/high16 v5, 0x3f800000 # 1.0f */
/* if-ne v3, v0, :cond_8 */
/* iget v3, p1, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* iget v6, p1, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr v3, v6 */
/* sub-float/2addr v3, v5 */
} // :cond_8
/* const v3, 0x7f7fffff # Float.MAX_VALUE */
} // :goto_8
/* iput v3, p0, Landroidx/viewpager/widget/ViewPager;->s:F */
/* add-int/lit8 v3, p2, -0x1 */
} // :goto_9
/* if-ltz v3, :cond_b */
/* .line 122 */
v6 = this.c;
(( java.util.ArrayList ) v6 ).get ( v3 ); // invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v6, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 123 */
} // :goto_a
/* iget v7, v6, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-le v4, v7, :cond_9 */
/* .line 124 */
v7 = this.f;
/* add-int/lit8 v8, v4, -0x1 */
v4 = (( c.y.a.a ) v7 ).a ( v4 ); // invoke-virtual {v7, v4}, Lc/y/a/a;->a(I)F
/* add-float/2addr v4, v2 */
/* sub-float/2addr v1, v4 */
/* move v4, v8 */
/* .line 125 */
} // :cond_9
/* iget v8, v6, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr v8, v2 */
/* sub-float/2addr v1, v8 */
/* .line 126 */
/* iput v1, v6, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* if-nez v7, :cond_a */
/* .line 127 */
/* iput v1, p0, Landroidx/viewpager/widget/ViewPager;->r:F */
} // :cond_a
/* add-int/lit8 v3, v3, -0x1 */
/* add-int/lit8 v4, v4, -0x1 */
/* .line 128 */
} // :cond_b
/* iget v1, p1, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* iget v3, p1, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr v1, v3 */
/* add-float/2addr v1, v2 */
/* .line 129 */
/* iget p1, p1, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* add-int/lit8 p1, p1, 0x1 */
/* add-int/lit8 p2, p2, 0x1 */
} // :goto_b
/* if-ge p2, p3, :cond_e */
/* .line 130 */
v3 = this.c;
(( java.util.ArrayList ) v3 ).get ( p2 ); // invoke-virtual {v3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 131 */
} // :goto_c
/* iget v4, v3, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-ge p1, v4, :cond_c */
/* .line 132 */
v4 = this.f;
/* add-int/lit8 v6, p1, 0x1 */
p1 = (( c.y.a.a ) v4 ).a ( p1 ); // invoke-virtual {v4, p1}, Lc/y/a/a;->a(I)F
/* add-float/2addr p1, v2 */
/* add-float/2addr v1, p1 */
/* move p1, v6 */
} // :cond_c
/* if-ne v4, v0, :cond_d */
/* .line 133 */
/* iget v4, v3, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr v4, v1 */
/* sub-float/2addr v4, v5 */
/* iput v4, p0, Landroidx/viewpager/widget/ViewPager;->s:F */
/* .line 134 */
} // :cond_d
/* iput v1, v3, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* .line 135 */
/* iget v3, v3, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr v3, v2 */
/* add-float/2addr v1, v3 */
/* add-int/lit8 p2, p2, 0x1 */
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_e
return;
} // .end method
public void a ( androidx.viewpager.widget.ViewPager$j p0 ) {
/* .locals 1 */
/* .line 32 */
v0 = this.T;
/* if-nez v0, :cond_0 */
/* .line 33 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.T = v0;
/* .line 34 */
} // :cond_0
v0 = this.T;
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 7 */
/* .line 161 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->f0:I */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
int v3 = 2; // const/4 v3, 0x2
/* if-ne v0, v3, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 162 */
/* invoke-direct {p0, v2}, Landroidx/viewpager/widget/ViewPager;->setScrollingCacheEnabled(Z)V */
/* .line 163 */
v3 = this.k;
v3 = (( android.widget.Scroller ) v3 ).isFinished ( ); // invoke-virtual {v3}, Landroid/widget/Scroller;->isFinished()Z
/* xor-int/2addr v3, v1 */
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 164 */
v3 = this.k;
(( android.widget.Scroller ) v3 ).abortAnimation ( ); // invoke-virtual {v3}, Landroid/widget/Scroller;->abortAnimation()V
/* .line 165 */
v3 = (( android.view.ViewGroup ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollX()I
/* .line 166 */
v4 = (( android.view.ViewGroup ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I
/* .line 167 */
v5 = this.k;
v5 = (( android.widget.Scroller ) v5 ).getCurrX ( ); // invoke-virtual {v5}, Landroid/widget/Scroller;->getCurrX()I
/* .line 168 */
v6 = this.k;
v6 = (( android.widget.Scroller ) v6 ).getCurrY ( ); // invoke-virtual {v6}, Landroid/widget/Scroller;->getCurrY()I
/* if-ne v3, v5, :cond_1 */
/* if-eq v4, v6, :cond_2 */
/* .line 169 */
} // :cond_1
(( android.view.ViewGroup ) p0 ).scrollTo ( v5, v6 ); // invoke-virtual {p0, v5, v6}, Landroid/view/ViewGroup;->scrollTo(II)V
/* if-eq v5, v3, :cond_2 */
/* .line 170 */
(( androidx.viewpager.widget.ViewPager ) p0 ).e ( v5 ); // invoke-virtual {p0, v5}, Landroidx/viewpager/widget/ViewPager;->e(I)Z
/* .line 171 */
} // :cond_2
/* iput-boolean v2, p0, Landroidx/viewpager/widget/ViewPager;->w:Z */
int v3 = 0; // const/4 v3, 0x0
/* .line 172 */
} // :goto_1
v4 = this.c;
v4 = (( java.util.ArrayList ) v4 ).size ( ); // invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
/* if-ge v3, v4, :cond_4 */
/* .line 173 */
v4 = this.c;
(( java.util.ArrayList ) v4 ).get ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 174 */
/* iget-boolean v5, v4, Landroidx/viewpager/widget/ViewPager$f;->c:Z */
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 175 */
/* iput-boolean v2, v4, Landroidx/viewpager/widget/ViewPager$f;->c:Z */
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_4
if ( v0 != null) { // if-eqz v0, :cond_6
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 176 */
p1 = this.e0;
c.h.n.v0 .a ( p0,p1 );
/* .line 177 */
} // :cond_5
p1 = this.e0;
} // :cond_6
} // :goto_2
return;
} // .end method
public final Boolean a ( Float p0, Float p1 ) {
/* .locals 3 */
/* .line 178 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->B:I */
/* int-to-float v0, v0 */
int v1 = 0; // const/4 v1, 0x0
/* cmpg-float v0, p1, v0 */
/* if-gez v0, :cond_0 */
/* cmpl-float v0, p2, v1 */
/* if-gtz v0, :cond_1 */
} // :cond_0
v0 = (( android.view.ViewGroup ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I
/* iget v2, p0, Landroidx/viewpager/widget/ViewPager;->B:I */
/* sub-int/2addr v0, v2 */
/* int-to-float v0, v0 */
/* cmpl-float p1, p1, v0 */
/* if-lez p1, :cond_2 */
/* cmpg-float p1, p2, v1 */
/* if-gez p1, :cond_2 */
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean a ( Integer p0 ) {
/* .locals 6 */
/* .line 216 */
(( android.view.ViewGroup ) p0 ).findFocus ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->findFocus()Landroid/view/View;
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* if-ne v0, p0, :cond_0 */
} // :goto_0
/* move-object v0, v3 */
} // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 217 */
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
} // :goto_1
/* instance-of v5, v4, Landroid/view/ViewGroup; */
if ( v5 != null) { // if-eqz v5, :cond_2
/* if-ne v4, p0, :cond_1 */
int v4 = 1; // const/4 v4, 0x1
/* .line 218 */
} // :cond_1
} // :cond_2
int v4 = 0; // const/4 v4, 0x0
} // :goto_2
/* if-nez v4, :cond_4 */
/* .line 219 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 220 */
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v5 ).getSimpleName ( ); // invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 221 */
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
} // :goto_3
/* instance-of v5, v0, Landroid/view/ViewGroup; */
if ( v5 != null) { // if-eqz v5, :cond_3
final String v5 = " => "; // const-string v5, " => "
/* .line 222 */
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v5 ).getSimpleName ( ); // invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 223 */
/* .line 224 */
} // :cond_3
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "arrowScroll tried to find focus based on non-child current focused view "; // const-string v5, "arrowScroll tried to find focus based on non-child current focused view "
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 225 */
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v4 = "ViewPager"; // const-string v4, "ViewPager"
/* .line 226 */
android.util.Log .e ( v4,v0 );
/* .line 227 */
} // :cond_4
} // :goto_4
android.view.FocusFinder .getInstance ( );
(( android.view.FocusFinder ) v3 ).findNextFocus ( p0, v0, p1 ); // invoke-virtual {v3, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
/* const/16 v4, 0x42 */
/* const/16 v5, 0x11 */
if ( v3 != null) { // if-eqz v3, :cond_8
/* if-eq v3, v0, :cond_8 */
/* if-ne p1, v5, :cond_6 */
/* .line 228 */
v1 = this.e;
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( v1, v3 ); // invoke-virtual {p0, v1, v3}, Landroidx/viewpager/widget/ViewPager;->a(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
/* iget v1, v1, Landroid/graphics/Rect;->left:I */
/* .line 229 */
v2 = this.e;
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Landroidx/viewpager/widget/ViewPager;->a(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
/* iget v2, v2, Landroid/graphics/Rect;->left:I */
if ( v0 != null) { // if-eqz v0, :cond_5
/* if-lt v1, v2, :cond_5 */
/* .line 230 */
v0 = (( androidx.viewpager.widget.ViewPager ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->e()Z
/* .line 231 */
} // :cond_5
v0 = (( android.view.View ) v3 ).requestFocus ( ); // invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z
} // :goto_5
/* move v2, v0 */
} // :cond_6
/* if-ne p1, v4, :cond_c */
/* .line 232 */
v1 = this.e;
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( v1, v3 ); // invoke-virtual {p0, v1, v3}, Landroidx/viewpager/widget/ViewPager;->a(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
/* iget v1, v1, Landroid/graphics/Rect;->left:I */
/* .line 233 */
v2 = this.e;
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Landroidx/viewpager/widget/ViewPager;->a(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
/* iget v2, v2, Landroid/graphics/Rect;->left:I */
if ( v0 != null) { // if-eqz v0, :cond_7
/* if-gt v1, v2, :cond_7 */
/* .line 234 */
v0 = (( androidx.viewpager.widget.ViewPager ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->f()Z
/* .line 235 */
} // :cond_7
v0 = (( android.view.View ) v3 ).requestFocus ( ); // invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z
} // :cond_8
/* if-eq p1, v5, :cond_b */
/* if-ne p1, v1, :cond_9 */
} // :cond_9
/* if-eq p1, v4, :cond_a */
int v0 = 2; // const/4 v0, 0x2
/* if-ne p1, v0, :cond_c */
/* .line 236 */
} // :cond_a
v2 = (( androidx.viewpager.widget.ViewPager ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->f()Z
/* .line 237 */
} // :cond_b
} // :goto_6
v2 = (( androidx.viewpager.widget.ViewPager ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->e()Z
} // :cond_c
} // :goto_7
if ( v2 != null) { // if-eqz v2, :cond_d
/* .line 238 */
p1 = android.view.SoundEffectConstants .getContantForFocusDirection ( p1 );
(( android.view.ViewGroup ) p0 ).playSoundEffect ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->playSoundEffect(I)V
} // :cond_d
} // .end method
public Boolean a ( android.view.KeyEvent p0 ) {
/* .locals 3 */
/* .line 204 */
v0 = (( android.view.KeyEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I
/* if-nez v0, :cond_6 */
/* .line 205 */
v0 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
/* const/16 v1, 0x15 */
int v2 = 2; // const/4 v2, 0x2
/* if-eq v0, v1, :cond_4 */
/* const/16 v1, 0x16 */
/* if-eq v0, v1, :cond_2 */
/* const/16 v1, 0x3d */
/* if-eq v0, v1, :cond_0 */
/* .line 206 */
} // :cond_0
v0 = (( android.view.KeyEvent ) p1 ).hasNoModifiers ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->hasNoModifiers()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 207 */
p1 = (( androidx.viewpager.widget.ViewPager ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Landroidx/viewpager/widget/ViewPager;->a(I)Z
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* .line 208 */
p1 = (( android.view.KeyEvent ) p1 ).hasModifiers ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/KeyEvent;->hasModifiers(I)Z
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 209 */
p1 = (( androidx.viewpager.widget.ViewPager ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/viewpager/widget/ViewPager;->a(I)Z
/* .line 210 */
} // :cond_2
p1 = (( android.view.KeyEvent ) p1 ).hasModifiers ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/KeyEvent;->hasModifiers(I)Z
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 211 */
p1 = (( androidx.viewpager.widget.ViewPager ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->f()Z
} // :cond_3
/* const/16 p1, 0x42 */
/* .line 212 */
p1 = (( androidx.viewpager.widget.ViewPager ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->a(I)Z
/* .line 213 */
} // :cond_4
p1 = (( android.view.KeyEvent ) p1 ).hasModifiers ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/KeyEvent;->hasModifiers(I)Z
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 214 */
p1 = (( androidx.viewpager.widget.ViewPager ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->e()Z
} // :cond_5
/* const/16 p1, 0x11 */
/* .line 215 */
p1 = (( androidx.viewpager.widget.ViewPager ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->a(I)Z
} // :cond_6
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_1
} // .end method
public Boolean a ( android.view.View p0, Boolean p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 12 */
/* move-object v0, p1 */
/* .line 192 */
/* instance-of v1, v0, Landroid/view/ViewGroup; */
int v2 = 1; // const/4 v2, 0x1
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 193 */
/* move-object v1, v0 */
/* check-cast v1, Landroid/view/ViewGroup; */
/* .line 194 */
v3 = (( android.view.View ) p1 ).getScrollX ( ); // invoke-virtual {p1}, Landroid/view/View;->getScrollX()I
/* .line 195 */
v4 = (( android.view.View ) p1 ).getScrollY ( ); // invoke-virtual {p1}, Landroid/view/View;->getScrollY()I
/* .line 196 */
v5 = (( android.view.ViewGroup ) v1 ).getChildCount ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I
/* sub-int/2addr v5, v2 */
} // :goto_0
/* if-ltz v5, :cond_1 */
/* .line 197 */
(( android.view.ViewGroup ) v1 ).getChildAt ( v5 ); // invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* add-int v6, p4, v3 */
/* .line 198 */
v8 = (( android.view.View ) v7 ).getLeft ( ); // invoke-virtual {v7}, Landroid/view/View;->getLeft()I
/* if-lt v6, v8, :cond_0 */
v8 = (( android.view.View ) v7 ).getRight ( ); // invoke-virtual {v7}, Landroid/view/View;->getRight()I
/* if-ge v6, v8, :cond_0 */
/* add-int v8, p5, v4 */
/* .line 199 */
v9 = (( android.view.View ) v7 ).getTop ( ); // invoke-virtual {v7}, Landroid/view/View;->getTop()I
/* if-lt v8, v9, :cond_0 */
v9 = (( android.view.View ) v7 ).getBottom ( ); // invoke-virtual {v7}, Landroid/view/View;->getBottom()I
/* if-ge v8, v9, :cond_0 */
int v9 = 1; // const/4 v9, 0x1
/* .line 200 */
v10 = (( android.view.View ) v7 ).getLeft ( ); // invoke-virtual {v7}, Landroid/view/View;->getLeft()I
/* sub-int v10, v6, v10 */
/* .line 201 */
v6 = (( android.view.View ) v7 ).getTop ( ); // invoke-virtual {v7}, Landroid/view/View;->getTop()I
/* sub-int v11, v8, v6 */
/* move-object v6, p0 */
/* move v8, v9 */
/* move v9, p3 */
/* .line 202 */
v6 = /* invoke-virtual/range {v6 ..v11}, Landroidx/viewpager/widget/ViewPager;->a(Landroid/view/View;ZIII)Z */
if ( v6 != null) { // if-eqz v6, :cond_0
} // :cond_0
/* add-int/lit8 v5, v5, -0x1 */
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_2
/* move v1, p3 */
/* neg-int v1, v1 */
/* .line 203 */
v0 = (( android.view.View ) p1 ).canScrollHorizontally ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/View;->canScrollHorizontally(I)Z
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
} // .end method
public void addFocusables ( java.util.ArrayList p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;II)V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
/* .line 2 */
v1 = (( android.view.ViewGroup ) p0 ).getDescendantFocusability ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I
/* const/high16 v2, 0x60000 */
/* if-eq v1, v2, :cond_1 */
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
} // :goto_0
v3 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ge v2, v3, :cond_1 */
/* .line 4 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 5 */
v4 = (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
/* if-nez v4, :cond_0 */
/* .line 6 */
(( androidx.viewpager.widget.ViewPager ) p0 ).b ( v3 ); // invoke-virtual {p0, v3}, Landroidx/viewpager/widget/ViewPager;->b(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$f;
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 7 */
/* iget v4, v4, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* iget v5, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* if-ne v4, v5, :cond_0 */
/* .line 8 */
(( android.view.View ) v3 ).addFocusables ( p1, p2, p3 ); // invoke-virtual {v3, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
/* const/high16 p2, 0x40000 */
/* if-ne v1, p2, :cond_2 */
/* .line 9 */
p2 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
/* if-ne v0, p2, :cond_5 */
/* .line 10 */
} // :cond_2
p2 = (( android.view.ViewGroup ) p0 ).isFocusable ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->isFocusable()Z
/* if-nez p2, :cond_3 */
return;
} // :cond_3
int p2 = 1; // const/4 p2, 0x1
/* and-int/2addr p3, p2 */
/* if-ne p3, p2, :cond_4 */
/* .line 11 */
p2 = (( android.view.ViewGroup ) p0 ).isInTouchMode ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->isInTouchMode()Z
if ( p2 != null) { // if-eqz p2, :cond_4
p2 = (( android.view.ViewGroup ) p0 ).isFocusableInTouchMode ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->isFocusableInTouchMode()Z
/* if-nez p2, :cond_4 */
return;
} // :cond_4
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 12 */
(( java.util.ArrayList ) p1 ).add ( p0 ); // invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_5
return;
} // .end method
public void addTouchables ( java.util.ArrayList p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;)V" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
} // :goto_0
v1 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ge v0, v1, :cond_1 */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 3 */
v2 = (( android.view.View ) v1 ).getVisibility ( ); // invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
/* if-nez v2, :cond_0 */
/* .line 4 */
(( androidx.viewpager.widget.ViewPager ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Landroidx/viewpager/widget/ViewPager;->b(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$f;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 5 */
/* iget v2, v2, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* iget v3, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* if-ne v2, v3, :cond_0 */
/* .line 6 */
(( android.view.View ) v1 ).addTouchables ( p1 ); // invoke-virtual {v1, p1}, Landroid/view/View;->addTouchables(Ljava/util/ArrayList;)V
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
return;
} // .end method
public void addView ( android.view.View p0, Integer p1, android.view.ViewGroup$LayoutParams p2 ) {
/* .locals 3 */
/* .line 1 */
v0 = (( androidx.viewpager.widget.ViewPager ) p0 ).checkLayoutParams ( p3 ); // invoke-virtual {p0, p3}, Landroidx/viewpager/widget/ViewPager;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
/* if-nez v0, :cond_0 */
/* .line 2 */
(( androidx.viewpager.widget.ViewPager ) p0 ).generateLayoutParams ( p3 ); // invoke-virtual {p0, p3}, Landroidx/viewpager/widget/ViewPager;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
/* .line 3 */
} // :cond_0
/* move-object v0, p3 */
/* check-cast v0, Landroidx/viewpager/widget/ViewPager$g; */
/* .line 4 */
/* iget-boolean v1, v0, Landroidx/viewpager/widget/ViewPager$g;->a:Z */
v2 = androidx.viewpager.widget.ViewPager .c ( p1 );
/* or-int/2addr v1, v2 */
/* iput-boolean v1, v0, Landroidx/viewpager/widget/ViewPager$g;->a:Z */
/* .line 5 */
/* iget-boolean v2, p0, Landroidx/viewpager/widget/ViewPager;->u:Z */
if ( v2 != null) { // if-eqz v2, :cond_3
if ( v0 != null) { // if-eqz v0, :cond_2
/* if-nez v1, :cond_1 */
/* .line 6 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "Cannot add pager decor view during layout"; // const-string p2, "Cannot add pager decor view during layout"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_2
} // :goto_0
int v1 = 1; // const/4 v1, 0x1
/* .line 7 */
/* iput-boolean v1, v0, Landroidx/viewpager/widget/ViewPager$g;->d:Z */
/* .line 8 */
(( android.view.ViewGroup ) p0 ).addViewInLayout ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z
/* .line 9 */
} // :cond_3
/* invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V */
} // :goto_1
return;
} // .end method
public androidx.viewpager.widget.ViewPager$f b ( android.view.View p0 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
} // :goto_0
v1 = this.c;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-ge v0, v1, :cond_1 */
/* .line 2 */
v1 = this.c;
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 3 */
v2 = this.f;
v3 = this.a;
v2 = (( c.y.a.a ) v2 ).a ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Lc/y/a/a;->a(Landroid/view/View;Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void b ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 58 */
/* iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->y:Z */
/* .line 59 */
/* iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->z:Z */
/* .line 60 */
v0 = this.I;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 61 */
(( android.view.VelocityTracker ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
int v0 = 0; // const/4 v0, 0x0
/* .line 62 */
this.I = v0;
} // :cond_0
return;
} // .end method
public final void b ( Integer p0 ) {
/* .locals 3 */
/* .line 30 */
v0 = this.U;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 31 */
/* .line 32 */
} // :cond_0
v0 = this.T;
if ( v0 != null) { // if-eqz v0, :cond_2
int v1 = 0; // const/4 v1, 0x0
v0 = /* .line 33 */
} // :goto_0
/* if-ge v1, v0, :cond_2 */
/* .line 34 */
v2 = this.T;
/* check-cast v2, Landroidx/viewpager/widget/ViewPager$j; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 35 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
/* .line 36 */
} // :cond_2
v0 = this.V;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 37 */
} // :cond_3
return;
} // .end method
public void b ( Integer p0, Float p1, Integer p2 ) {
/* .locals 12 */
/* .line 4 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->S:I */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-lez v0, :cond_5 */
/* .line 5 */
v0 = (( android.view.ViewGroup ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollX()I
/* .line 6 */
v3 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* .line 7 */
v4 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* .line 8 */
v5 = (( android.view.ViewGroup ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I
/* .line 9 */
v6 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
int v7 = 0; // const/4 v7, 0x0
} // :goto_0
/* if-ge v7, v6, :cond_5 */
/* .line 10 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v7 ); // invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 11 */
(( android.view.View ) v8 ).getLayoutParams ( ); // invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v9, Landroidx/viewpager/widget/ViewPager$g; */
/* .line 12 */
/* iget-boolean v10, v9, Landroidx/viewpager/widget/ViewPager$g;->a:Z */
/* if-nez v10, :cond_0 */
/* .line 13 */
} // :cond_0
/* iget v9, v9, Landroidx/viewpager/widget/ViewPager$g;->b:I */
/* and-int/lit8 v9, v9, 0x7 */
/* if-eq v9, v2, :cond_3 */
int v10 = 3; // const/4 v10, 0x3
/* if-eq v9, v10, :cond_2 */
int v10 = 5; // const/4 v10, 0x5
/* if-eq v9, v10, :cond_1 */
/* move v9, v3 */
} // :cond_1
/* sub-int v9, v5, v4 */
/* .line 14 */
v10 = (( android.view.View ) v8 ).getMeasuredWidth ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
/* sub-int/2addr v9, v10 */
/* .line 15 */
v10 = (( android.view.View ) v8 ).getMeasuredWidth ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr v4, v10 */
/* .line 16 */
} // :cond_2
v9 = (( android.view.View ) v8 ).getWidth ( ); // invoke-virtual {v8}, Landroid/view/View;->getWidth()I
/* add-int/2addr v9, v3 */
/* .line 17 */
} // :cond_3
v9 = (( android.view.View ) v8 ).getMeasuredWidth ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
/* sub-int v9, v5, v9 */
/* div-int/lit8 v9, v9, 0x2 */
v9 = java.lang.Math .max ( v9,v3 );
} // :goto_1
/* move v11, v9 */
/* move v9, v3 */
/* move v3, v11 */
} // :goto_2
/* add-int/2addr v3, v0 */
/* .line 18 */
v10 = (( android.view.View ) v8 ).getLeft ( ); // invoke-virtual {v8}, Landroid/view/View;->getLeft()I
/* sub-int/2addr v3, v10 */
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 19 */
(( android.view.View ) v8 ).offsetLeftAndRight ( v3 ); // invoke-virtual {v8, v3}, Landroid/view/View;->offsetLeftAndRight(I)V
} // :cond_4
/* move v3, v9 */
} // :goto_3
/* add-int/lit8 v7, v7, 0x1 */
/* .line 20 */
} // :cond_5
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroidx/viewpager/widget/ViewPager;->a(IFI)V
/* .line 21 */
p1 = this.a0;
if ( p1 != null) { // if-eqz p1, :cond_7
/* .line 22 */
p1 = (( android.view.ViewGroup ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollX()I
/* .line 23 */
p2 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
} // :goto_4
/* if-ge v1, p2, :cond_7 */
/* .line 24 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 25 */
(( android.view.View ) p3 ).getLayoutParams ( ); // invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/viewpager/widget/ViewPager$g; */
/* .line 26 */
/* iget-boolean v0, v0, Landroidx/viewpager/widget/ViewPager$g;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 27 */
} // :cond_6
v0 = (( android.view.View ) p3 ).getLeft ( ); // invoke-virtual {p3}, Landroid/view/View;->getLeft()I
/* sub-int/2addr v0, p1 */
/* int-to-float v0, v0 */
v3 = /* invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->getClientWidth()I */
/* int-to-float v3, v3 */
/* div-float/2addr v0, v3 */
/* .line 28 */
v3 = this.a0;
} // :goto_5
/* add-int/lit8 v1, v1, 0x1 */
/* .line 29 */
} // :cond_7
/* iput-boolean v2, p0, Landroidx/viewpager/widget/ViewPager;->R:Z */
return;
} // .end method
public final void b ( Boolean p0 ) {
/* .locals 6 */
/* .line 38 */
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 39 */
/* iget v3, p0, Landroidx/viewpager/widget/ViewPager;->b0:I */
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
/* .line 40 */
} // :goto_1
(( android.view.ViewGroup ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
int v5 = 0; // const/4 v5, 0x0
(( android.view.View ) v4 ).setLayerType ( v3, v5 ); // invoke-virtual {v4, v3, v5}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
return;
} // .end method
public final Boolean b ( Float p0 ) {
/* .locals 9 */
/* .line 41 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->D:F */
/* sub-float/2addr v0, p1 */
/* .line 42 */
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->D:F */
/* .line 43 */
p1 = (( android.view.ViewGroup ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollX()I
/* int-to-float p1, p1 */
/* add-float/2addr p1, v0 */
/* .line 44 */
v0 = /* invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->getClientWidth()I */
/* int-to-float v0, v0 */
/* .line 45 */
/* iget v1, p0, Landroidx/viewpager/widget/ViewPager;->r:F */
/* mul-float v1, v1, v0 */
/* .line 46 */
/* iget v2, p0, Landroidx/viewpager/widget/ViewPager;->s:F */
/* mul-float v2, v2, v0 */
/* .line 47 */
v3 = this.c;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v3 ).get ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 48 */
v5 = this.c;
v6 = (( java.util.ArrayList ) v5 ).size ( ); // invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
int v7 = 1; // const/4 v7, 0x1
/* sub-int/2addr v6, v7 */
(( java.util.ArrayList ) v5 ).get ( v6 ); // invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 49 */
/* iget v6, v3, Landroidx/viewpager/widget/ViewPager$f;->b:I */
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 50 */
/* iget v1, v3, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* mul-float v1, v1, v0 */
int v3 = 0; // const/4 v3, 0x0
} // :cond_0
int v3 = 1; // const/4 v3, 0x1
/* .line 51 */
} // :goto_0
/* iget v6, v5, Landroidx/viewpager/widget/ViewPager$f;->b:I */
v8 = this.f;
v8 = (( c.y.a.a ) v8 ).a ( ); // invoke-virtual {v8}, Lc/y/a/a;->a()I
/* sub-int/2addr v8, v7 */
/* if-eq v6, v8, :cond_1 */
/* .line 52 */
/* iget v2, v5, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* mul-float v2, v2, v0 */
int v5 = 0; // const/4 v5, 0x0
} // :cond_1
int v5 = 1; // const/4 v5, 0x1
} // :goto_1
/* cmpg-float v6, p1, v1 */
/* if-gez v6, :cond_3 */
if ( v3 != null) { // if-eqz v3, :cond_2
/* sub-float p1, v1, p1 */
/* .line 53 */
v2 = this.O;
p1 = java.lang.Math .abs ( p1 );
/* div-float/2addr p1, v0 */
(( android.widget.EdgeEffect ) v2 ).onPull ( p1 ); // invoke-virtual {v2, p1}, Landroid/widget/EdgeEffect;->onPull(F)V
int v4 = 1; // const/4 v4, 0x1
} // :cond_2
/* move p1, v1 */
} // :cond_3
/* cmpl-float v1, p1, v2 */
/* if-lez v1, :cond_5 */
if ( v5 != null) { // if-eqz v5, :cond_4
/* sub-float/2addr p1, v2 */
/* .line 54 */
v1 = this.P;
p1 = java.lang.Math .abs ( p1 );
/* div-float/2addr p1, v0 */
(( android.widget.EdgeEffect ) v1 ).onPull ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/EdgeEffect;->onPull(F)V
int v4 = 1; // const/4 v4, 0x1
} // :cond_4
/* move p1, v2 */
/* .line 55 */
} // :cond_5
} // :goto_2
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->D:F */
/* float-to-int v1, p1 */
/* int-to-float v2, v1 */
/* sub-float/2addr p1, v2 */
/* add-float/2addr v0, p1 */
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager;->D:F */
/* .line 56 */
p1 = (( android.view.ViewGroup ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I
(( android.view.ViewGroup ) p0 ).scrollTo ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Landroid/view/ViewGroup;->scrollTo(II)V
/* .line 57 */
(( androidx.viewpager.widget.ViewPager ) p0 ).e ( v1 ); // invoke-virtual {p0, v1}, Landroidx/viewpager/widget/ViewPager;->e(I)Z
} // .end method
public final androidx.viewpager.widget.ViewPager$f c ( ) {
/* .locals 12 */
/* .line 13 */
v0 = /* invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->getClientWidth()I */
int v1 = 0; // const/4 v1, 0x0
/* if-lez v0, :cond_0 */
/* .line 14 */
v2 = (( android.view.ViewGroup ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollX()I
/* int-to-float v2, v2 */
/* int-to-float v3, v0 */
/* div-float/2addr v2, v3 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-lez v0, :cond_1 */
/* .line 15 */
/* iget v3, p0, Landroidx/viewpager/widget/ViewPager;->n:I */
/* int-to-float v3, v3 */
/* int-to-float v0, v0 */
/* div-float/2addr v3, v0 */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
int v0 = 0; // const/4 v0, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = -1; // const/4 v5, -0x1
int v6 = 1; // const/4 v6, 0x1
int v5 = 0; // const/4 v5, 0x0
int v7 = -1; // const/4 v7, -0x1
int v8 = 0; // const/4 v8, 0x0
int v9 = 1; // const/4 v9, 0x1
/* .line 16 */
} // :goto_2
v10 = this.c;
v10 = (( java.util.ArrayList ) v10 ).size ( ); // invoke-virtual {v10}, Ljava/util/ArrayList;->size()I
/* if-ge v8, v10, :cond_7 */
/* .line 17 */
v10 = this.c;
(( java.util.ArrayList ) v10 ).get ( v8 ); // invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v10, Landroidx/viewpager/widget/ViewPager$f; */
/* if-nez v9, :cond_2 */
/* .line 18 */
/* iget v11, v10, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* add-int/2addr v7, v6 */
/* if-eq v11, v7, :cond_2 */
/* .line 19 */
v10 = this.d;
/* add-float/2addr v1, v5 */
/* add-float/2addr v1, v3 */
/* .line 20 */
/* iput v1, v10, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* .line 21 */
/* iput v7, v10, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* .line 22 */
v1 = this.f;
v1 = (( c.y.a.a ) v1 ).a ( v7 ); // invoke-virtual {v1, v7}, Lc/y/a/a;->a(I)F
/* iput v1, v10, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-int/lit8 v8, v8, -0x1 */
/* .line 23 */
} // :cond_2
/* iget v1, v10, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* .line 24 */
/* iget v5, v10, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr v5, v1 */
/* add-float/2addr v5, v3 */
/* if-nez v9, :cond_4 */
/* cmpl-float v7, v2, v1 */
/* if-ltz v7, :cond_3 */
} // :cond_3
} // :cond_4
} // :goto_3
/* cmpg-float v0, v2, v5 */
/* if-ltz v0, :cond_6 */
/* .line 25 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* sub-int/2addr v0, v6 */
/* if-ne v8, v0, :cond_5 */
/* .line 26 */
} // :cond_5
/* iget v7, v10, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* .line 27 */
/* iget v5, v10, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-int/lit8 v8, v8, 0x1 */
/* move-object v0, v10 */
int v9 = 0; // const/4 v9, 0x0
} // :cond_6
} // :goto_4
} // :cond_7
} // .end method
public final void c ( Integer p0 ) {
/* .locals 3 */
/* .line 3 */
v0 = this.U;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
/* .line 5 */
} // :cond_0
v0 = this.T;
if ( v0 != null) { // if-eqz v0, :cond_2
int v1 = 0; // const/4 v1, 0x0
v0 = /* .line 6 */
} // :goto_0
/* if-ge v1, v0, :cond_2 */
/* .line 7 */
v2 = this.T;
/* check-cast v2, Landroidx/viewpager/widget/ViewPager$j; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 8 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
/* .line 9 */
} // :cond_2
v0 = this.V;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 10 */
} // :cond_3
return;
} // .end method
public final void c ( Boolean p0 ) {
/* .locals 1 */
/* .line 11 */
(( android.view.ViewGroup ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 12 */
} // :cond_0
return;
} // .end method
public Boolean canScrollHorizontally ( Integer p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.f;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = /* invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->getClientWidth()I */
/* .line 3 */
v2 = (( android.view.ViewGroup ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollX()I
int v3 = 1; // const/4 v3, 0x1
/* if-gez p1, :cond_2 */
/* int-to-float p1, v0 */
/* .line 4 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->r:F */
/* mul-float p1, p1, v0 */
/* float-to-int p1, p1 */
/* if-le v2, p1, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
} // :cond_2
/* if-lez p1, :cond_3 */
/* int-to-float p1, v0 */
/* .line 5 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->s:F */
/* mul-float p1, p1, v0 */
/* float-to-int p1, p1 */
/* if-ge v2, p1, :cond_3 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_3
} // .end method
public Boolean checkLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Landroidx/viewpager/widget/ViewPager$g; */
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void computeScroll ( ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->l:Z */
/* .line 2 */
v1 = this.k;
v1 = (( android.widget.Scroller ) v1 ).isFinished ( ); // invoke-virtual {v1}, Landroid/widget/Scroller;->isFinished()Z
/* if-nez v1, :cond_2 */
v1 = this.k;
v1 = (( android.widget.Scroller ) v1 ).computeScrollOffset ( ); // invoke-virtual {v1}, Landroid/widget/Scroller;->computeScrollOffset()Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 3 */
v0 = (( android.view.ViewGroup ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollX()I
/* .line 4 */
v1 = (( android.view.ViewGroup ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I
/* .line 5 */
v2 = this.k;
v2 = (( android.widget.Scroller ) v2 ).getCurrX ( ); // invoke-virtual {v2}, Landroid/widget/Scroller;->getCurrX()I
/* .line 6 */
v3 = this.k;
v3 = (( android.widget.Scroller ) v3 ).getCurrY ( ); // invoke-virtual {v3}, Landroid/widget/Scroller;->getCurrY()I
/* if-ne v0, v2, :cond_0 */
/* if-eq v1, v3, :cond_1 */
/* .line 7 */
} // :cond_0
(( android.view.ViewGroup ) p0 ).scrollTo ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Landroid/view/ViewGroup;->scrollTo(II)V
/* .line 8 */
v0 = (( androidx.viewpager.widget.ViewPager ) p0 ).e ( v2 ); // invoke-virtual {p0, v2}, Landroidx/viewpager/widget/ViewPager;->e(I)Z
/* if-nez v0, :cond_1 */
/* .line 9 */
v0 = this.k;
(( android.widget.Scroller ) v0 ).abortAnimation ( ); // invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V
int v0 = 0; // const/4 v0, 0x0
/* .line 10 */
(( android.view.ViewGroup ) p0 ).scrollTo ( v0, v3 ); // invoke-virtual {p0, v0, v3}, Landroid/view/ViewGroup;->scrollTo(II)V
/* .line 11 */
} // :cond_1
c.h.n.v0 .H ( p0 );
return;
/* .line 12 */
} // :cond_2
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/viewpager/widget/ViewPager;->a(Z)V
return;
} // .end method
public androidx.viewpager.widget.ViewPager$f d ( Integer p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 20 */
} // :goto_0
v1 = this.c;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-ge v0, v1, :cond_1 */
/* .line 21 */
v1 = this.c;
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 22 */
/* iget v2, v1, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-ne v2, p1, :cond_0 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void d ( ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( android.view.ViewGroup ) p0 ).setWillNotDraw ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V
/* const/high16 v0, 0x40000 */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).setDescendantFocusability ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
(( android.view.ViewGroup ) p0 ).setFocusable ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setFocusable(Z)V
/* .line 4 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* .line 5 */
/* new-instance v2, Landroid/widget/Scroller; */
v3 = androidx.viewpager.widget.ViewPager.i0;
/* invoke-direct {v2, v1, v3}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V */
this.k = v2;
/* .line 6 */
android.view.ViewConfiguration .get ( v1 );
/* .line 7 */
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v3 ).getDisplayMetrics ( ); // invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v3, v3, Landroid/util/DisplayMetrics;->density:F */
/* .line 8 */
v4 = (( android.view.ViewConfiguration ) v2 ).getScaledPagingTouchSlop ( ); // invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledPagingTouchSlop()I
/* iput v4, p0, Landroidx/viewpager/widget/ViewPager;->C:I */
/* const/high16 v4, 0x43c80000 # 400.0f */
/* mul-float v4, v4, v3 */
/* float-to-int v4, v4 */
/* .line 9 */
/* iput v4, p0, Landroidx/viewpager/widget/ViewPager;->J:I */
/* .line 10 */
v2 = (( android.view.ViewConfiguration ) v2 ).getScaledMaximumFlingVelocity ( ); // invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I
/* iput v2, p0, Landroidx/viewpager/widget/ViewPager;->K:I */
/* .line 11 */
/* new-instance v2, Landroid/widget/EdgeEffect; */
/* invoke-direct {v2, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V */
this.O = v2;
/* .line 12 */
/* new-instance v2, Landroid/widget/EdgeEffect; */
/* invoke-direct {v2, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V */
this.P = v2;
/* const/high16 v1, 0x41c80000 # 25.0f */
/* mul-float v1, v1, v3 */
/* float-to-int v1, v1 */
/* .line 13 */
/* iput v1, p0, Landroidx/viewpager/widget/ViewPager;->L:I */
/* const/high16 v1, 0x40000000 # 2.0f */
/* mul-float v1, v1, v3 */
/* float-to-int v1, v1 */
/* .line 14 */
/* iput v1, p0, Landroidx/viewpager/widget/ViewPager;->M:I */
/* const/high16 v1, 0x41800000 # 16.0f */
/* mul-float v3, v3, v1 */
/* float-to-int v1, v3 */
/* .line 15 */
/* iput v1, p0, Landroidx/viewpager/widget/ViewPager;->A:I */
/* .line 16 */
/* new-instance v1, Landroidx/viewpager/widget/ViewPager$h; */
/* invoke-direct {v1, p0}, Landroidx/viewpager/widget/ViewPager$h;-><init>(Landroidx/viewpager/widget/ViewPager;)V */
c.h.n.v0 .a ( p0,v1 );
/* .line 17 */
v1 = c.h.n.v0 .m ( p0 );
/* if-nez v1, :cond_0 */
/* .line 18 */
c.h.n.v0 .g ( p0,v0 );
/* .line 19 */
} // :cond_0
/* new-instance v0, Landroidx/viewpager/widget/ViewPager$d; */
/* invoke-direct {v0, p0}, Landroidx/viewpager/widget/ViewPager$d;-><init>(Landroidx/viewpager/widget/ViewPager;)V */
c.h.n.v0 .a ( p0,v0 );
return;
} // .end method
public Boolean dispatchKeyEvent ( android.view.KeyEvent p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z */
/* if-nez v0, :cond_1 */
p1 = (( androidx.viewpager.widget.ViewPager ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->a(Landroid/view/KeyEvent;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public Boolean dispatchPopulateAccessibilityEvent ( android.view.accessibility.AccessibilityEvent p0 ) {
/* .locals 6 */
/* .line 1 */
v0 = (( android.view.accessibility.AccessibilityEvent ) p1 ).getEventType ( ); // invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I
/* const/16 v1, 0x1000 */
/* if-ne v0, v1, :cond_0 */
/* .line 2 */
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z */
/* .line 3 */
} // :cond_0
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_2 */
/* .line 4 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 5 */
v4 = (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
/* if-nez v4, :cond_1 */
/* .line 6 */
(( androidx.viewpager.widget.ViewPager ) p0 ).b ( v3 ); // invoke-virtual {p0, v3}, Landroidx/viewpager/widget/ViewPager;->b(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$f;
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 7 */
/* iget v4, v4, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* iget v5, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* if-ne v4, v5, :cond_1 */
/* .line 8 */
v3 = (( android.view.View ) v3 ).dispatchPopulateAccessibilityEvent ( p1 ); // invoke-virtual {v3, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 7 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V */
/* .line 2 */
v0 = (( android.view.ViewGroup ) p0 ).getOverScrollMode ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getOverScrollMode()I
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_0 */
/* .line 3 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
v0 = (( c.y.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/y/a/a;->a()I
/* if-le v0, v2, :cond_0 */
/* .line 5 */
} // :cond_0
p1 = this.O;
(( android.widget.EdgeEffect ) p1 ).finish ( ); // invoke-virtual {p1}, Landroid/widget/EdgeEffect;->finish()V
/* .line 6 */
p1 = this.P;
(( android.widget.EdgeEffect ) p1 ).finish ( ); // invoke-virtual {p1}, Landroid/widget/EdgeEffect;->finish()V
/* goto/16 :goto_1 */
/* .line 7 */
} // :cond_1
} // :goto_0
v0 = this.O;
v0 = (( android.widget.EdgeEffect ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
/* if-nez v0, :cond_2 */
/* .line 8 */
v0 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* .line 9 */
v2 = (( android.view.ViewGroup ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I
v3 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* sub-int/2addr v2, v3 */
v3 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* sub-int/2addr v2, v3 */
/* .line 10 */
v3 = (( android.view.ViewGroup ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I
/* const/high16 v4, 0x43870000 # 270.0f */
/* .line 11 */
(( android.graphics.Canvas ) p1 ).rotate ( v4 ); // invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V
/* neg-int v4, v2 */
/* .line 12 */
v5 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* add-int/2addr v4, v5 */
/* int-to-float v4, v4 */
/* iget v5, p0, Landroidx/viewpager/widget/ViewPager;->r:F */
/* int-to-float v6, v3 */
/* mul-float v5, v5, v6 */
(( android.graphics.Canvas ) p1 ).translate ( v4, v5 ); // invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 13 */
v4 = this.O;
(( android.widget.EdgeEffect ) v4 ).setSize ( v2, v3 ); // invoke-virtual {v4, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V
/* .line 14 */
v2 = this.O;
v2 = (( android.widget.EdgeEffect ) v2 ).draw ( p1 ); // invoke-virtual {v2, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z
/* or-int/2addr v1, v2 */
/* .line 15 */
(( android.graphics.Canvas ) p1 ).restoreToCount ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V
/* .line 16 */
} // :cond_2
v0 = this.P;
v0 = (( android.widget.EdgeEffect ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
/* if-nez v0, :cond_3 */
/* .line 17 */
v0 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* .line 18 */
v2 = (( android.view.ViewGroup ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I
/* .line 19 */
v3 = (( android.view.ViewGroup ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I
v4 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* sub-int/2addr v3, v4 */
v4 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* sub-int/2addr v3, v4 */
/* const/high16 v4, 0x42b40000 # 90.0f */
/* .line 20 */
(( android.graphics.Canvas ) p1 ).rotate ( v4 ); // invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V
/* .line 21 */
v4 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* neg-int v4, v4 */
/* int-to-float v4, v4 */
/* iget v5, p0, Landroidx/viewpager/widget/ViewPager;->s:F */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* add-float/2addr v5, v6 */
/* neg-float v5, v5 */
/* int-to-float v6, v2 */
/* mul-float v5, v5, v6 */
(( android.graphics.Canvas ) p1 ).translate ( v4, v5 ); // invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 22 */
v4 = this.P;
(( android.widget.EdgeEffect ) v4 ).setSize ( v3, v2 ); // invoke-virtual {v4, v3, v2}, Landroid/widget/EdgeEffect;->setSize(II)V
/* .line 23 */
v2 = this.P;
v2 = (( android.widget.EdgeEffect ) v2 ).draw ( p1 ); // invoke-virtual {v2, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z
/* or-int/2addr v1, v2 */
/* .line 24 */
(( android.graphics.Canvas ) p1 ).restoreToCount ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V
} // :cond_3
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 25 */
c.h.n.v0 .H ( p0 );
} // :cond_4
return;
} // .end method
public void drawableStateChanged ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V */
/* .line 2 */
v0 = this.o;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v1 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
(( android.view.ViewGroup ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_0
return;
} // .end method
public Boolean e ( ) {
/* .locals 2 */
/* .line 16 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* if-lez v0, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* .line 17 */
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroidx/viewpager/widget/ViewPager;->a(IZ)V
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean e ( Integer p0 ) {
/* .locals 7 */
/* .line 1 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
final String v1 = "onPageScrolled did not call superclass implementation"; // const-string v1, "onPageScrolled did not call superclass implementation"
int v2 = 0; // const/4 v2, 0x0
/* if-nez v0, :cond_2 */
/* .line 2 */
/* iget-boolean p1, p0, Landroidx/viewpager/widget/ViewPager;->Q:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
} // :cond_0
/* iput-boolean v2, p0, Landroidx/viewpager/widget/ViewPager;->R:Z */
int p1 = 0; // const/4 p1, 0x0
/* .line 4 */
(( androidx.viewpager.widget.ViewPager ) p0 ).b ( v2, p1, v2 ); // invoke-virtual {p0, v2, p1, v2}, Landroidx/viewpager/widget/ViewPager;->b(IFI)V
/* .line 5 */
/* iget-boolean p1, p0, Landroidx/viewpager/widget/ViewPager;->R:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 6 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 7 */
} // :cond_2
(( androidx.viewpager.widget.ViewPager ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->c()Landroidx/viewpager/widget/ViewPager$f;
/* .line 8 */
v3 = /* invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->getClientWidth()I */
/* .line 9 */
/* iget v4, p0, Landroidx/viewpager/widget/ViewPager;->n:I */
/* add-int v5, v3, v4 */
/* int-to-float v4, v4 */
/* int-to-float v3, v3 */
/* div-float/2addr v4, v3 */
/* .line 10 */
/* iget v6, v0, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* int-to-float p1, p1 */
/* div-float/2addr p1, v3 */
/* .line 11 */
/* iget v3, v0, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* sub-float/2addr p1, v3 */
/* iget v0, v0, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr v0, v4 */
/* div-float/2addr p1, v0 */
/* int-to-float v0, v5 */
/* mul-float v0, v0, p1 */
/* float-to-int v0, v0 */
/* .line 12 */
/* iput-boolean v2, p0, Landroidx/viewpager/widget/ViewPager;->R:Z */
/* .line 13 */
(( androidx.viewpager.widget.ViewPager ) p0 ).b ( v6, p1, v0 ); // invoke-virtual {p0, v6, p1, v0}, Landroidx/viewpager/widget/ViewPager;->b(IFI)V
/* .line 14 */
/* iget-boolean p1, p0, Landroidx/viewpager/widget/ViewPager;->R:Z */
if ( p1 != null) { // if-eqz p1, :cond_3
int p1 = 1; // const/4 p1, 0x1
/* .line 15 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void f ( Integer p0 ) {
/* .locals 17 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, p1 */
/* .line 1 */
/* iget v2, v0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* if-eq v2, v1, :cond_0 */
/* .line 2 */
(( androidx.viewpager.widget.ViewPager ) v0 ).d ( v2 ); // invoke-virtual {v0, v2}, Landroidx/viewpager/widget/ViewPager;->d(I)Landroidx/viewpager/widget/ViewPager$f;
/* .line 3 */
/* iput v1, v0, Landroidx/viewpager/widget/ViewPager;->g:I */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 4 */
} // :goto_0
v1 = this.f;
/* if-nez v1, :cond_1 */
/* .line 5 */
/* invoke-virtual/range {p0 ..p0}, Landroidx/viewpager/widget/ViewPager;->j()V */
return;
/* .line 6 */
} // :cond_1
/* iget-boolean v1, v0, Landroidx/viewpager/widget/ViewPager;->w:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 7 */
/* invoke-virtual/range {p0 ..p0}, Landroidx/viewpager/widget/ViewPager;->j()V */
return;
/* .line 8 */
} // :cond_2
/* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getWindowToken()Landroid/os/IBinder; */
/* if-nez v1, :cond_3 */
return;
/* .line 9 */
} // :cond_3
v1 = this.f;
(( c.y.a.a ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Lc/y/a/a;->b(Landroid/view/ViewGroup;)V
/* .line 10 */
/* iget v1, v0, Landroidx/viewpager/widget/ViewPager;->x:I */
/* .line 11 */
/* iget v4, v0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* sub-int/2addr v4, v1 */
int v5 = 0; // const/4 v5, 0x0
v4 = java.lang.Math .max ( v5,v4 );
/* .line 12 */
v6 = this.f;
v6 = (( c.y.a.a ) v6 ).a ( ); // invoke-virtual {v6}, Lc/y/a/a;->a()I
/* add-int/lit8 v7, v6, -0x1 */
/* .line 13 */
/* iget v8, v0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* add-int/2addr v8, v1 */
v1 = java.lang.Math .min ( v7,v8 );
/* .line 14 */
/* iget v7, v0, Landroidx/viewpager/widget/ViewPager;->b:I */
/* if-ne v6, v7, :cond_1e */
int v7 = 0; // const/4 v7, 0x0
/* .line 15 */
} // :goto_1
v8 = this.c;
v8 = (( java.util.ArrayList ) v8 ).size ( ); // invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
/* if-ge v7, v8, :cond_5 */
/* .line 16 */
v8 = this.c;
(( java.util.ArrayList ) v8 ).get ( v7 ); // invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v8, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 17 */
/* iget v9, v8, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* iget v10, v0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* if-lt v9, v10, :cond_4 */
/* if-ne v9, v10, :cond_5 */
} // :cond_4
/* add-int/lit8 v7, v7, 0x1 */
} // :cond_5
int v8 = 0; // const/4 v8, 0x0
} // :goto_2
/* if-nez v8, :cond_6 */
/* if-lez v6, :cond_6 */
/* .line 18 */
/* iget v8, v0, Landroidx/viewpager/widget/ViewPager;->g:I */
(( androidx.viewpager.widget.ViewPager ) v0 ).a ( v8, v7 ); // invoke-virtual {v0, v8, v7}, Landroidx/viewpager/widget/ViewPager;->a(II)Landroidx/viewpager/widget/ViewPager$f;
} // :cond_6
int v9 = 0; // const/4 v9, 0x0
if ( v8 != null) { // if-eqz v8, :cond_17
/* add-int/lit8 v10, v7, -0x1 */
/* if-ltz v10, :cond_7 */
/* .line 19 */
v11 = this.c;
(( java.util.ArrayList ) v11 ).get ( v10 ); // invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v11, Landroidx/viewpager/widget/ViewPager$f; */
} // :cond_7
int v11 = 0; // const/4 v11, 0x0
/* .line 20 */
} // :goto_3
v12 = /* invoke-direct/range {p0 ..p0}, Landroidx/viewpager/widget/ViewPager;->getClientWidth()I */
/* const/high16 v13, 0x40000000 # 2.0f */
/* if-gtz v12, :cond_8 */
int v14 = 0; // const/4 v14, 0x0
/* .line 21 */
} // :cond_8
/* iget v14, v8, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* sub-float v14, v13, v14 */
/* .line 22 */
v15 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
/* int-to-float v15, v15 */
/* int-to-float v3, v12 */
/* div-float/2addr v15, v3 */
/* add-float/2addr v14, v15 */
/* .line 23 */
} // :goto_4
/* iget v3, v0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* add-int/lit8 v3, v3, -0x1 */
int v15 = 0; // const/4 v15, 0x0
} // :goto_5
/* if-ltz v3, :cond_e */
/* cmpl-float v16, v15, v14 */
/* if-ltz v16, :cond_a */
/* if-ge v3, v4, :cond_a */
/* if-nez v11, :cond_9 */
/* .line 24 */
} // :cond_9
/* iget v5, v11, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-ne v3, v5, :cond_d */
/* iget-boolean v5, v11, Landroidx/viewpager/widget/ViewPager$f;->c:Z */
/* if-nez v5, :cond_d */
/* .line 25 */
v5 = this.c;
(( java.util.ArrayList ) v5 ).remove ( v10 ); // invoke-virtual {v5, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* .line 26 */
v5 = this.f;
v11 = this.a;
(( c.y.a.a ) v5 ).a ( v0, v3, v11 ); // invoke-virtual {v5, v0, v3, v11}, Lc/y/a/a;->a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
/* add-int/lit8 v10, v10, -0x1 */
/* add-int/lit8 v7, v7, -0x1 */
/* if-ltz v10, :cond_c */
/* .line 27 */
v5 = this.c;
(( java.util.ArrayList ) v5 ).get ( v10 ); // invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Landroidx/viewpager/widget/ViewPager$f; */
} // :cond_a
if ( v11 != null) { // if-eqz v11, :cond_b
/* .line 28 */
/* iget v5, v11, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-ne v3, v5, :cond_b */
/* .line 29 */
/* iget v5, v11, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr v15, v5 */
/* add-int/lit8 v10, v10, -0x1 */
/* if-ltz v10, :cond_c */
/* .line 30 */
v5 = this.c;
(( java.util.ArrayList ) v5 ).get ( v10 ); // invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Landroidx/viewpager/widget/ViewPager$f; */
} // :cond_b
/* add-int/lit8 v5, v10, 0x1 */
/* .line 31 */
(( androidx.viewpager.widget.ViewPager ) v0 ).a ( v3, v5 ); // invoke-virtual {v0, v3, v5}, Landroidx/viewpager/widget/ViewPager;->a(II)Landroidx/viewpager/widget/ViewPager$f;
/* .line 32 */
/* iget v5, v5, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr v15, v5 */
/* add-int/lit8 v7, v7, 0x1 */
/* if-ltz v10, :cond_c */
/* .line 33 */
v5 = this.c;
(( java.util.ArrayList ) v5 ).get ( v10 ); // invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Landroidx/viewpager/widget/ViewPager$f; */
} // :cond_c
int v5 = 0; // const/4 v5, 0x0
} // :goto_6
/* move-object v11, v5 */
} // :cond_d
/* add-int/lit8 v3, v3, -0x1 */
int v5 = 0; // const/4 v5, 0x0
/* .line 34 */
} // :cond_e
} // :goto_7
/* iget v3, v8, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-int/lit8 v4, v7, 0x1 */
/* cmpg-float v5, v3, v13 */
/* if-gez v5, :cond_16 */
/* .line 35 */
v5 = this.c;
v5 = (( java.util.ArrayList ) v5 ).size ( ); // invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
/* if-ge v4, v5, :cond_f */
v5 = this.c;
(( java.util.ArrayList ) v5 ).get ( v4 ); // invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Landroidx/viewpager/widget/ViewPager$f; */
} // :cond_f
int v5 = 0; // const/4 v5, 0x0
} // :goto_8
/* if-gtz v12, :cond_10 */
int v10 = 0; // const/4 v10, 0x0
/* .line 36 */
} // :cond_10
v10 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* int-to-float v10, v10 */
/* int-to-float v11, v12 */
/* div-float/2addr v10, v11 */
/* add-float/2addr v10, v13 */
/* .line 37 */
} // :goto_9
/* iget v11, v0, Landroidx/viewpager/widget/ViewPager;->g:I */
} // :goto_a
/* add-int/lit8 v11, v11, 0x1 */
/* if-ge v11, v6, :cond_16 */
/* cmpl-float v12, v3, v10 */
/* if-ltz v12, :cond_13 */
/* if-le v11, v1, :cond_13 */
/* if-nez v5, :cond_11 */
/* .line 38 */
} // :cond_11
/* iget v12, v5, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-ne v11, v12, :cond_15 */
/* iget-boolean v12, v5, Landroidx/viewpager/widget/ViewPager$f;->c:Z */
/* if-nez v12, :cond_15 */
/* .line 39 */
v12 = this.c;
(( java.util.ArrayList ) v12 ).remove ( v4 ); // invoke-virtual {v12, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* .line 40 */
v12 = this.f;
v5 = this.a;
(( c.y.a.a ) v12 ).a ( v0, v11, v5 ); // invoke-virtual {v12, v0, v11, v5}, Lc/y/a/a;->a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
/* .line 41 */
v5 = this.c;
v5 = (( java.util.ArrayList ) v5 ).size ( ); // invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
/* if-ge v4, v5, :cond_12 */
v5 = this.c;
(( java.util.ArrayList ) v5 ).get ( v4 ); // invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Landroidx/viewpager/widget/ViewPager$f; */
} // :cond_12
int v5 = 0; // const/4 v5, 0x0
} // :cond_13
if ( v5 != null) { // if-eqz v5, :cond_14
/* .line 42 */
/* iget v12, v5, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-ne v11, v12, :cond_14 */
/* .line 43 */
/* iget v5, v5, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr v3, v5 */
/* add-int/lit8 v4, v4, 0x1 */
/* .line 44 */
v5 = this.c;
v5 = (( java.util.ArrayList ) v5 ).size ( ); // invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
/* if-ge v4, v5, :cond_12 */
v5 = this.c;
(( java.util.ArrayList ) v5 ).get ( v4 ); // invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 45 */
} // :cond_14
(( androidx.viewpager.widget.ViewPager ) v0 ).a ( v11, v4 ); // invoke-virtual {v0, v11, v4}, Landroidx/viewpager/widget/ViewPager;->a(II)Landroidx/viewpager/widget/ViewPager$f;
/* add-int/lit8 v4, v4, 0x1 */
/* .line 46 */
/* iget v5, v5, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr v3, v5 */
/* .line 47 */
v5 = this.c;
v5 = (( java.util.ArrayList ) v5 ).size ( ); // invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
/* if-ge v4, v5, :cond_12 */
v5 = this.c;
(( java.util.ArrayList ) v5 ).get ( v4 ); // invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Landroidx/viewpager/widget/ViewPager$f; */
} // :cond_15
} // :goto_b
/* .line 48 */
} // :cond_16
} // :goto_c
(( androidx.viewpager.widget.ViewPager ) v0 ).a ( v8, v7, v2 ); // invoke-virtual {v0, v8, v7, v2}, Landroidx/viewpager/widget/ViewPager;->a(Landroidx/viewpager/widget/ViewPager$f;ILandroidx/viewpager/widget/ViewPager$f;)V
/* .line 49 */
v1 = this.f;
/* iget v2, v0, Landroidx/viewpager/widget/ViewPager;->g:I */
v3 = this.a;
(( c.y.a.a ) v1 ).b ( v0, v2, v3 ); // invoke-virtual {v1, v0, v2, v3}, Lc/y/a/a;->b(Landroid/view/ViewGroup;ILjava/lang/Object;)V
/* .line 50 */
} // :cond_17
v1 = this.f;
(( c.y.a.a ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lc/y/a/a;->a(Landroid/view/ViewGroup;)V
/* .line 51 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getChildCount()I */
int v2 = 0; // const/4 v2, 0x0
} // :goto_d
/* if-ge v2, v1, :cond_19 */
/* .line 52 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 53 */
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v4, Landroidx/viewpager/widget/ViewPager$g; */
/* .line 54 */
/* iput v2, v4, Landroidx/viewpager/widget/ViewPager$g;->f:I */
/* .line 55 */
/* iget-boolean v5, v4, Landroidx/viewpager/widget/ViewPager$g;->a:Z */
/* if-nez v5, :cond_18 */
/* iget v5, v4, Landroidx/viewpager/widget/ViewPager$g;->c:F */
/* cmpl-float v5, v5, v9 */
/* if-nez v5, :cond_18 */
/* .line 56 */
(( androidx.viewpager.widget.ViewPager ) v0 ).b ( v3 ); // invoke-virtual {v0, v3}, Landroidx/viewpager/widget/ViewPager;->b(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$f;
if ( v3 != null) { // if-eqz v3, :cond_18
/* .line 57 */
/* iget v5, v3, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* iput v5, v4, Landroidx/viewpager/widget/ViewPager$g;->c:F */
/* .line 58 */
/* iget v3, v3, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* iput v3, v4, Landroidx/viewpager/widget/ViewPager$g;->e:I */
} // :cond_18
/* add-int/lit8 v2, v2, 0x1 */
/* .line 59 */
} // :cond_19
/* invoke-virtual/range {p0 ..p0}, Landroidx/viewpager/widget/ViewPager;->j()V */
/* .line 60 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->hasFocus()Z */
if ( v1 != null) { // if-eqz v1, :cond_1d
/* .line 61 */
/* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->findFocus()Landroid/view/View; */
if ( v1 != null) { // if-eqz v1, :cond_1a
/* .line 62 */
(( androidx.viewpager.widget.ViewPager ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->a(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$f;
} // :cond_1a
int v3 = 0; // const/4 v3, 0x0
} // :goto_e
if ( v3 != null) { // if-eqz v3, :cond_1b
/* .line 63 */
/* iget v1, v3, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* iget v2, v0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* if-eq v1, v2, :cond_1d */
} // :cond_1b
int v5 = 0; // const/4 v5, 0x0
/* .line 64 */
} // :goto_f
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getChildCount()I */
/* if-ge v5, v1, :cond_1d */
/* .line 65 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v5 ); // invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 66 */
(( androidx.viewpager.widget.ViewPager ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->b(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$f;
if ( v2 != null) { // if-eqz v2, :cond_1c
/* .line 67 */
/* iget v2, v2, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* iget v3, v0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* if-ne v2, v3, :cond_1c */
int v2 = 2; // const/4 v2, 0x2
/* .line 68 */
v1 = (( android.view.View ) v1 ).requestFocus ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->requestFocus(I)Z
if ( v1 != null) { // if-eqz v1, :cond_1c
} // :cond_1c
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_1d
} // :goto_10
return;
/* .line 69 */
} // :cond_1e
try { // :try_start_0
/* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources; */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getId()I */
(( android.content.res.Resources ) v1 ).getResourceName ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;
/* :try_end_0 */
/* .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 70 */
/* :catch_0 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getId()I */
java.lang.Integer .toHexString ( v1 );
/* .line 71 */
} // :goto_11
/* new-instance v2, Ljava/lang/IllegalStateException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "; // const-string v4, "The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v4, v0, Landroidx/viewpager/widget/ViewPager;->b:I */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ", found: "; // const-string v4, ", found: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v6 ); // invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = " Pager id: "; // const-string v4, " Pager id: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " Pager class: "; // const-string v1, " Pager class: "
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 72 */
/* const-class v1, Landroidx/viewpager/widget/ViewPager; */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " Problematic adapter: "; // const-string v1, " Problematic adapter: "
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.f;
/* .line 73 */
(( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
} // .end method
public Boolean f ( ) {
/* .locals 3 */
/* .line 74 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v1, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
v0 = (( c.y.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/y/a/a;->a()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v0, v2 */
/* if-ge v1, v0, :cond_0 */
/* .line 75 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* add-int/2addr v0, v2 */
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Landroidx/viewpager/widget/ViewPager;->a(IZ)V
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void g ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
(( androidx.viewpager.widget.ViewPager ) p0 ).f ( v0 ); // invoke-virtual {p0, v0}, Landroidx/viewpager/widget/ViewPager;->f(I)V
return;
} // .end method
public android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Landroidx/viewpager/widget/ViewPager$g; */
/* invoke-direct {v0}, Landroidx/viewpager/widget/ViewPager$g;-><init>()V */
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) {
/* .locals 2 */
/* .line 2 */
/* new-instance v0, Landroidx/viewpager/widget/ViewPager$g; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroidx/viewpager/widget/ViewPager$g;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 0 */
/* .line 1 */
(( androidx.viewpager.widget.ViewPager ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
} // .end method
public c.y.a.a getAdapter ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
} // .end method
public Integer getChildDrawingOrder ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->c0:I */
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_0 */
/* add-int/lit8 p1, p1, -0x1 */
/* sub-int p2, p1, p2 */
/* .line 2 */
} // :cond_0
p1 = this.d0;
/* .line 3 */
(( java.util.ArrayList ) p1 ).get ( p2 ); // invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p1, Landroid/view/View; */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroidx/viewpager/widget/ViewPager$g; */
/* iget p1, p1, Landroidx/viewpager/widget/ViewPager$g;->f:I */
} // .end method
public Integer getCurrentItem ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
} // .end method
public Integer getOffscreenPageLimit ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->x:I */
} // .end method
public Integer getPageMargin ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->n:I */
} // .end method
public final void h ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
} // :goto_0
v1 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ge v0, v1, :cond_1 */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 3 */
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroidx/viewpager/widget/ViewPager$g; */
/* .line 4 */
/* iget-boolean v1, v1, Landroidx/viewpager/widget/ViewPager$g;->a:Z */
/* if-nez v1, :cond_0 */
/* .line 5 */
(( android.view.ViewGroup ) p0 ).removeViewAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
return;
} // .end method
public final Boolean i ( ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* .line 1 */
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager;->H:I */
/* .line 2 */
(( androidx.viewpager.widget.ViewPager ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->b()V
/* .line 3 */
v0 = this.O;
(( android.widget.EdgeEffect ) v0 ).onRelease ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V
/* .line 4 */
v0 = this.P;
(( android.widget.EdgeEffect ) v0 ).onRelease ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V
/* .line 5 */
v0 = this.O;
v0 = (( android.widget.EdgeEffect ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
/* if-nez v0, :cond_1 */
v0 = this.P;
v0 = (( android.widget.EdgeEffect ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public final void j ( ) {
/* .locals 4 */
/* .line 1 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->c0:I */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
v0 = this.d0;
/* if-nez v0, :cond_0 */
/* .line 3 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.d0 = v0;
/* .line 4 */
} // :cond_0
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 5 */
} // :goto_0
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
/* if-ge v1, v0, :cond_1 */
/* .line 6 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 7 */
v3 = this.d0;
(( java.util.ArrayList ) v3 ).add ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v1, v1, 0x1 */
/* .line 8 */
} // :cond_1
v0 = this.d0;
v1 = androidx.viewpager.widget.ViewPager.j0;
java.util.Collections .sort ( v0,v1 );
} // :cond_2
return;
} // .end method
public void onAttachedToWindow ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->Q:Z */
return;
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e0;
(( android.view.ViewGroup ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 2 */
v0 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.widget.Scroller ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z
/* if-nez v0, :cond_0 */
/* .line 3 */
v0 = this.k;
(( android.widget.Scroller ) v0 ).abortAnimation ( ); // invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V
/* .line 4 */
} // :cond_0
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
return;
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 17 */
/* move-object/from16 v0, p0 */
/* .line 1 */
/* invoke-super/range {p0 ..p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V */
/* .line 2 */
/* iget v1, v0, Landroidx/viewpager/widget/ViewPager;->n:I */
/* if-lez v1, :cond_4 */
v1 = this.o;
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.c;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-lez v1, :cond_4 */
v1 = this.f;
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 3 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getScrollX()I */
/* .line 4 */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getWidth()I */
/* .line 5 */
/* iget v3, v0, Landroidx/viewpager/widget/ViewPager;->n:I */
/* int-to-float v3, v3 */
/* int-to-float v4, v2 */
/* div-float/2addr v3, v4 */
/* .line 6 */
v5 = this.c;
int v6 = 0; // const/4 v6, 0x0
(( java.util.ArrayList ) v5 ).get ( v6 ); // invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 7 */
/* iget v7, v5, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* .line 8 */
v8 = this.c;
v8 = (( java.util.ArrayList ) v8 ).size ( ); // invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
/* .line 9 */
/* iget v9, v5, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* .line 10 */
v10 = this.c;
/* add-int/lit8 v11, v8, -0x1 */
(( java.util.ArrayList ) v10 ).get ( v11 ); // invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v10, Landroidx/viewpager/widget/ViewPager$f; */
/* iget v10, v10, Landroidx/viewpager/widget/ViewPager$f;->b:I */
} // :goto_0
/* if-ge v9, v10, :cond_4 */
/* .line 11 */
} // :goto_1
/* iget v11, v5, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-le v9, v11, :cond_0 */
/* if-ge v6, v8, :cond_0 */
/* .line 12 */
v5 = this.c;
/* add-int/lit8 v6, v6, 0x1 */
(( java.util.ArrayList ) v5 ).get ( v6 ); // invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 13 */
} // :cond_0
/* iget v11, v5, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* if-ne v9, v11, :cond_1 */
/* .line 14 */
/* iget v7, v5, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* iget v11, v5, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float v12, v7, v11 */
/* mul-float v12, v12, v4 */
/* add-float/2addr v7, v11 */
/* add-float/2addr v7, v3 */
/* .line 15 */
} // :cond_1
v11 = this.f;
v11 = (( c.y.a.a ) v11 ).a ( v9 ); // invoke-virtual {v11, v9}, Lc/y/a/a;->a(I)F
/* add-float v12, v7, v11 */
/* mul-float v12, v12, v4 */
/* add-float/2addr v11, v3 */
/* add-float/2addr v7, v11 */
/* .line 16 */
} // :goto_2
/* iget v11, v0, Landroidx/viewpager/widget/ViewPager;->n:I */
/* int-to-float v11, v11 */
/* add-float/2addr v11, v12 */
/* int-to-float v13, v1 */
/* cmpl-float v11, v11, v13 */
/* if-lez v11, :cond_2 */
/* .line 17 */
v11 = this.o;
v13 = java.lang.Math .round ( v12 );
/* iget v14, v0, Landroidx/viewpager/widget/ViewPager;->p:I */
/* iget v15, v0, Landroidx/viewpager/widget/ViewPager;->n:I */
/* int-to-float v15, v15 */
/* add-float/2addr v15, v12 */
/* .line 18 */
v15 = java.lang.Math .round ( v15 );
/* move/from16 v16, v3 */
/* iget v3, v0, Landroidx/viewpager/widget/ViewPager;->q:I */
/* .line 19 */
(( android.graphics.drawable.Drawable ) v11 ).setBounds ( v13, v14, v15, v3 ); // invoke-virtual {v11, v13, v14, v15, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 20 */
v3 = this.o;
/* move-object/from16 v11, p1 */
(( android.graphics.drawable.Drawable ) v3 ).draw ( v11 ); // invoke-virtual {v3, v11}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
} // :cond_2
/* move-object/from16 v11, p1 */
/* move/from16 v16, v3 */
} // :goto_3
/* add-int v3, v1, v2 */
/* int-to-float v3, v3 */
/* cmpl-float v3, v12, v3 */
/* if-lez v3, :cond_3 */
} // :cond_3
/* add-int/lit8 v9, v9, 0x1 */
/* move/from16 v3, v16 */
} // :cond_4
} // :goto_4
return;
} // .end method
public Boolean onInterceptTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 15 */
/* move-object v6, p0 */
/* move-object/from16 v7, p1 */
/* .line 1 */
v0 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getAction()I */
/* and-int/lit16 v0, v0, 0xff */
int v8 = 0; // const/4 v8, 0x0
int v1 = 3; // const/4 v1, 0x3
/* if-eq v0, v1, :cond_e */
int v9 = 1; // const/4 v9, 0x1
/* if-ne v0, v9, :cond_0 */
/* goto/16 :goto_3 */
} // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
/* iget-boolean v1, v6, Landroidx/viewpager/widget/ViewPager;->y:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 3 */
} // :cond_1
/* iget-boolean v1, v6, Landroidx/viewpager/widget/ViewPager;->z:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_2
int v1 = 2; // const/4 v1, 0x2
if ( v0 != null) { // if-eqz v0, :cond_a
/* if-eq v0, v1, :cond_4 */
int v1 = 6; // const/4 v1, 0x6
/* if-eq v0, v1, :cond_3 */
/* goto/16 :goto_2 */
/* .line 4 */
} // :cond_3
/* invoke-virtual/range {p0 ..p1}, Landroidx/viewpager/widget/ViewPager;->a(Landroid/view/MotionEvent;)V */
/* goto/16 :goto_2 */
/* .line 5 */
} // :cond_4
/* iget v0, v6, Landroidx/viewpager/widget/ViewPager;->H:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_5 */
/* goto/16 :goto_2 */
/* .line 6 */
} // :cond_5
v0 = (( android.view.MotionEvent ) v7 ).findPointerIndex ( v0 ); // invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* .line 7 */
v10 = (( android.view.MotionEvent ) v7 ).getX ( v0 ); // invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getX(I)F
/* .line 8 */
/* iget v1, v6, Landroidx/viewpager/widget/ViewPager;->D:F */
/* sub-float v1, v10, v1 */
/* .line 9 */
v11 = java.lang.Math .abs ( v1 );
/* .line 10 */
v12 = (( android.view.MotionEvent ) v7 ).getY ( v0 ); // invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getY(I)F
/* .line 11 */
/* iget v0, v6, Landroidx/viewpager/widget/ViewPager;->G:F */
/* sub-float v0, v12, v0 */
v13 = java.lang.Math .abs ( v0 );
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v14, v1, v0 */
if ( v14 != null) { // if-eqz v14, :cond_6
/* .line 12 */
/* iget v0, v6, Landroidx/viewpager/widget/ViewPager;->D:F */
v0 = (( androidx.viewpager.widget.ViewPager ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroidx/viewpager/widget/ViewPager;->a(FF)Z
/* if-nez v0, :cond_6 */
int v2 = 0; // const/4 v2, 0x0
/* float-to-int v3, v1 */
/* float-to-int v4, v10 */
/* float-to-int v5, v12 */
/* move-object v0, p0 */
/* move-object v1, p0 */
/* .line 13 */
v0 = /* invoke-virtual/range {v0 ..v5}, Landroidx/viewpager/widget/ViewPager;->a(Landroid/view/View;ZIII)Z */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 14 */
/* iput v10, v6, Landroidx/viewpager/widget/ViewPager;->D:F */
/* .line 15 */
/* iput v12, v6, Landroidx/viewpager/widget/ViewPager;->E:F */
/* .line 16 */
/* iput-boolean v9, v6, Landroidx/viewpager/widget/ViewPager;->z:Z */
/* .line 17 */
} // :cond_6
/* iget v0, v6, Landroidx/viewpager/widget/ViewPager;->C:I */
/* int-to-float v0, v0 */
/* cmpl-float v0, v11, v0 */
/* if-lez v0, :cond_8 */
/* const/high16 v0, 0x3f000000 # 0.5f */
/* mul-float v11, v11, v0 */
/* cmpl-float v0, v11, v13 */
/* if-lez v0, :cond_8 */
/* .line 18 */
/* iput-boolean v9, v6, Landroidx/viewpager/widget/ViewPager;->y:Z */
/* .line 19 */
(( androidx.viewpager.widget.ViewPager ) p0 ).c ( v9 ); // invoke-virtual {p0, v9}, Landroidx/viewpager/widget/ViewPager;->c(Z)V
/* .line 20 */
(( androidx.viewpager.widget.ViewPager ) p0 ).setScrollState ( v9 ); // invoke-virtual {p0, v9}, Landroidx/viewpager/widget/ViewPager;->setScrollState(I)V
/* .line 21 */
/* iget v0, v6, Landroidx/viewpager/widget/ViewPager;->F:F */
/* iget v1, v6, Landroidx/viewpager/widget/ViewPager;->C:I */
/* int-to-float v1, v1 */
/* if-lez v14, :cond_7 */
/* add-float/2addr v0, v1 */
} // :cond_7
/* sub-float/2addr v0, v1 */
} // :goto_0
/* iput v0, v6, Landroidx/viewpager/widget/ViewPager;->D:F */
/* .line 22 */
/* iput v12, v6, Landroidx/viewpager/widget/ViewPager;->E:F */
/* .line 23 */
/* invoke-direct {p0, v9}, Landroidx/viewpager/widget/ViewPager;->setScrollingCacheEnabled(Z)V */
/* .line 24 */
} // :cond_8
/* iget v0, v6, Landroidx/viewpager/widget/ViewPager;->C:I */
/* int-to-float v0, v0 */
/* cmpl-float v0, v13, v0 */
/* if-lez v0, :cond_9 */
/* .line 25 */
/* iput-boolean v9, v6, Landroidx/viewpager/widget/ViewPager;->z:Z */
/* .line 26 */
} // :cond_9
} // :goto_1
/* iget-boolean v0, v6, Landroidx/viewpager/widget/ViewPager;->y:Z */
if ( v0 != null) { // if-eqz v0, :cond_c
/* .line 27 */
v0 = (( androidx.viewpager.widget.ViewPager ) p0 ).b ( v10 ); // invoke-virtual {p0, v10}, Landroidx/viewpager/widget/ViewPager;->b(F)Z
if ( v0 != null) { // if-eqz v0, :cond_c
/* .line 28 */
c.h.n.v0 .H ( p0 );
/* .line 29 */
} // :cond_a
v0 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getX()F */
/* iput v0, v6, Landroidx/viewpager/widget/ViewPager;->F:F */
/* iput v0, v6, Landroidx/viewpager/widget/ViewPager;->D:F */
/* .line 30 */
v0 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getY()F */
/* iput v0, v6, Landroidx/viewpager/widget/ViewPager;->G:F */
/* iput v0, v6, Landroidx/viewpager/widget/ViewPager;->E:F */
/* .line 31 */
v0 = (( android.view.MotionEvent ) v7 ).getPointerId ( v8 ); // invoke-virtual {v7, v8}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput v0, v6, Landroidx/viewpager/widget/ViewPager;->H:I */
/* .line 32 */
/* iput-boolean v8, v6, Landroidx/viewpager/widget/ViewPager;->z:Z */
/* .line 33 */
/* iput-boolean v9, v6, Landroidx/viewpager/widget/ViewPager;->l:Z */
/* .line 34 */
v0 = this.k;
(( android.widget.Scroller ) v0 ).computeScrollOffset ( ); // invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z
/* .line 35 */
/* iget v0, v6, Landroidx/viewpager/widget/ViewPager;->f0:I */
/* if-ne v0, v1, :cond_b */
v0 = this.k;
/* .line 36 */
v0 = (( android.widget.Scroller ) v0 ).getFinalX ( ); // invoke-virtual {v0}, Landroid/widget/Scroller;->getFinalX()I
v1 = this.k;
v1 = (( android.widget.Scroller ) v1 ).getCurrX ( ); // invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrX()I
/* sub-int/2addr v0, v1 */
v0 = java.lang.Math .abs ( v0 );
/* iget v1, v6, Landroidx/viewpager/widget/ViewPager;->M:I */
/* if-le v0, v1, :cond_b */
/* .line 37 */
v0 = this.k;
(( android.widget.Scroller ) v0 ).abortAnimation ( ); // invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V
/* .line 38 */
/* iput-boolean v8, v6, Landroidx/viewpager/widget/ViewPager;->w:Z */
/* .line 39 */
(( androidx.viewpager.widget.ViewPager ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->g()V
/* .line 40 */
/* iput-boolean v9, v6, Landroidx/viewpager/widget/ViewPager;->y:Z */
/* .line 41 */
(( androidx.viewpager.widget.ViewPager ) p0 ).c ( v9 ); // invoke-virtual {p0, v9}, Landroidx/viewpager/widget/ViewPager;->c(Z)V
/* .line 42 */
(( androidx.viewpager.widget.ViewPager ) p0 ).setScrollState ( v9 ); // invoke-virtual {p0, v9}, Landroidx/viewpager/widget/ViewPager;->setScrollState(I)V
/* .line 43 */
} // :cond_b
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( v8 ); // invoke-virtual {p0, v8}, Landroidx/viewpager/widget/ViewPager;->a(Z)V
/* .line 44 */
/* iput-boolean v8, v6, Landroidx/viewpager/widget/ViewPager;->y:Z */
/* .line 45 */
} // :cond_c
} // :goto_2
v0 = this.I;
/* if-nez v0, :cond_d */
/* .line 46 */
android.view.VelocityTracker .obtain ( );
this.I = v0;
/* .line 47 */
} // :cond_d
v0 = this.I;
(( android.view.VelocityTracker ) v0 ).addMovement ( v7 ); // invoke-virtual {v0, v7}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
/* .line 48 */
/* iget-boolean v0, v6, Landroidx/viewpager/widget/ViewPager;->y:Z */
/* .line 49 */
} // :cond_e
} // :goto_3
(( androidx.viewpager.widget.ViewPager ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->i()Z
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 18 */
/* move-object/from16 v0, p0 */
/* .line 1 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getChildCount()I */
/* sub-int v2, p4, p2 */
/* sub-int v3, p5, p3 */
/* .line 2 */
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingLeft()I */
/* .line 3 */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingTop()I */
/* .line 4 */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingRight()I */
/* .line 5 */
v7 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getPaddingBottom()I */
/* .line 6 */
v8 = /* invoke-virtual/range {p0 ..p0}, Landroid/view/ViewGroup;->getScrollX()I */
int v10 = 0; // const/4 v10, 0x0
int v11 = 0; // const/4 v11, 0x0
} // :goto_0
/* const/16 v12, 0x8 */
/* if-ge v10, v1, :cond_7 */
/* .line 7 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v10 ); // invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 8 */
v14 = (( android.view.View ) v13 ).getVisibility ( ); // invoke-virtual {v13}, Landroid/view/View;->getVisibility()I
/* if-eq v14, v12, :cond_6 */
/* .line 9 */
(( android.view.View ) v13 ).getLayoutParams ( ); // invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v12, Landroidx/viewpager/widget/ViewPager$g; */
/* .line 10 */
/* iget-boolean v14, v12, Landroidx/viewpager/widget/ViewPager$g;->a:Z */
if ( v14 != null) { // if-eqz v14, :cond_6
/* .line 11 */
/* iget v12, v12, Landroidx/viewpager/widget/ViewPager$g;->b:I */
/* and-int/lit8 v14, v12, 0x7 */
/* and-int/lit8 v12, v12, 0x70 */
int v15 = 1; // const/4 v15, 0x1
/* if-eq v14, v15, :cond_2 */
int v15 = 3; // const/4 v15, 0x3
/* if-eq v14, v15, :cond_1 */
int v15 = 5; // const/4 v15, 0x5
/* if-eq v14, v15, :cond_0 */
/* move v14, v4 */
} // :cond_0
/* sub-int v14, v2, v6 */
/* .line 12 */
v15 = (( android.view.View ) v13 ).getMeasuredWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
/* sub-int/2addr v14, v15 */
/* .line 13 */
v15 = (( android.view.View ) v13 ).getMeasuredWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr v6, v15 */
/* .line 14 */
} // :cond_1
v14 = (( android.view.View ) v13 ).getMeasuredWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr v14, v4 */
/* .line 15 */
} // :cond_2
v14 = (( android.view.View ) v13 ).getMeasuredWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
/* sub-int v14, v2, v14 */
/* div-int/lit8 v14, v14, 0x2 */
v14 = java.lang.Math .max ( v14,v4 );
} // :goto_1
/* move/from16 v17, v14 */
/* move v14, v4 */
/* move/from16 v4, v17 */
} // :goto_2
/* const/16 v15, 0x10 */
/* if-eq v12, v15, :cond_5 */
/* const/16 v15, 0x30 */
/* if-eq v12, v15, :cond_4 */
/* const/16 v15, 0x50 */
/* if-eq v12, v15, :cond_3 */
/* move v12, v5 */
} // :cond_3
/* sub-int v12, v3, v7 */
/* .line 16 */
v15 = (( android.view.View ) v13 ).getMeasuredHeight ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
/* sub-int/2addr v12, v15 */
/* .line 17 */
v15 = (( android.view.View ) v13 ).getMeasuredHeight ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v7, v15 */
/* .line 18 */
} // :cond_4
v12 = (( android.view.View ) v13 ).getMeasuredHeight ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v12, v5 */
/* .line 19 */
} // :cond_5
v12 = (( android.view.View ) v13 ).getMeasuredHeight ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
/* sub-int v12, v3, v12 */
/* div-int/lit8 v12, v12, 0x2 */
v12 = java.lang.Math .max ( v12,v5 );
} // :goto_3
/* move/from16 v17, v12 */
/* move v12, v5 */
/* move/from16 v5, v17 */
} // :goto_4
/* add-int/2addr v4, v8 */
/* .line 20 */
v15 = (( android.view.View ) v13 ).getMeasuredWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr v15, v4 */
/* .line 21 */
v16 = (( android.view.View ) v13 ).getMeasuredHeight ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
/* add-int v9, v5, v16 */
/* .line 22 */
(( android.view.View ) v13 ).layout ( v4, v5, v15, v9 ); // invoke-virtual {v13, v4, v5, v15, v9}, Landroid/view/View;->layout(IIII)V
/* add-int/lit8 v11, v11, 0x1 */
/* move v5, v12 */
/* move v4, v14 */
} // :cond_6
/* add-int/lit8 v10, v10, 0x1 */
/* goto/16 :goto_0 */
} // :cond_7
/* sub-int/2addr v2, v4 */
/* sub-int/2addr v2, v6 */
int v6 = 0; // const/4 v6, 0x0
} // :goto_5
/* if-ge v6, v1, :cond_a */
/* .line 23 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v6 ); // invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 24 */
v9 = (( android.view.View ) v8 ).getVisibility ( ); // invoke-virtual {v8}, Landroid/view/View;->getVisibility()I
/* if-eq v9, v12, :cond_9 */
/* .line 25 */
(( android.view.View ) v8 ).getLayoutParams ( ); // invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v9, Landroidx/viewpager/widget/ViewPager$g; */
/* .line 26 */
/* iget-boolean v10, v9, Landroidx/viewpager/widget/ViewPager$g;->a:Z */
/* if-nez v10, :cond_9 */
(( androidx.viewpager.widget.ViewPager ) v0 ).b ( v8 ); // invoke-virtual {v0, v8}, Landroidx/viewpager/widget/ViewPager;->b(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$f;
if ( v10 != null) { // if-eqz v10, :cond_9
/* int-to-float v13, v2 */
/* .line 27 */
/* iget v10, v10, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* mul-float v10, v10, v13 */
/* float-to-int v10, v10 */
/* add-int/2addr v10, v4 */
/* .line 28 */
/* iget-boolean v14, v9, Landroidx/viewpager/widget/ViewPager$g;->d:Z */
if ( v14 != null) { // if-eqz v14, :cond_8
int v14 = 0; // const/4 v14, 0x0
/* .line 29 */
/* iput-boolean v14, v9, Landroidx/viewpager/widget/ViewPager$g;->d:Z */
/* .line 30 */
/* iget v9, v9, Landroidx/viewpager/widget/ViewPager$g;->c:F */
/* mul-float v13, v13, v9 */
/* float-to-int v9, v13 */
/* const/high16 v13, 0x40000000 # 2.0f */
v9 = android.view.View$MeasureSpec .makeMeasureSpec ( v9,v13 );
/* sub-int v14, v3, v5 */
/* sub-int/2addr v14, v7 */
/* .line 31 */
v13 = android.view.View$MeasureSpec .makeMeasureSpec ( v14,v13 );
/* .line 32 */
(( android.view.View ) v8 ).measure ( v9, v13 ); // invoke-virtual {v8, v9, v13}, Landroid/view/View;->measure(II)V
/* .line 33 */
} // :cond_8
v9 = (( android.view.View ) v8 ).getMeasuredWidth ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr v9, v10 */
/* .line 34 */
v13 = (( android.view.View ) v8 ).getMeasuredHeight ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v13, v5 */
/* .line 35 */
(( android.view.View ) v8 ).layout ( v10, v5, v9, v13 ); // invoke-virtual {v8, v10, v5, v9, v13}, Landroid/view/View;->layout(IIII)V
} // :cond_9
/* add-int/lit8 v6, v6, 0x1 */
/* .line 36 */
} // :cond_a
/* iput v5, v0, Landroidx/viewpager/widget/ViewPager;->p:I */
/* sub-int/2addr v3, v7 */
/* .line 37 */
/* iput v3, v0, Landroidx/viewpager/widget/ViewPager;->q:I */
/* .line 38 */
/* iput v11, v0, Landroidx/viewpager/widget/ViewPager;->S:I */
/* .line 39 */
/* iget-boolean v1, v0, Landroidx/viewpager/widget/ViewPager;->Q:Z */
if ( v1 != null) { // if-eqz v1, :cond_b
/* .line 40 */
/* iget v1, v0, Landroidx/viewpager/widget/ViewPager;->g:I */
int v2 = 0; // const/4 v2, 0x0
(( androidx.viewpager.widget.ViewPager ) v0 ).a ( v1, v2, v2, v2 ); // invoke-virtual {v0, v1, v2, v2, v2}, Landroidx/viewpager/widget/ViewPager;->a(IZIZ)V
} // :cond_b
int v2 = 0; // const/4 v2, 0x0
/* .line 41 */
} // :goto_6
/* iput-boolean v2, v0, Landroidx/viewpager/widget/ViewPager;->Q:Z */
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 13 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
p1 = android.view.ViewGroup .getDefaultSize ( v0,p1 );
/* .line 2 */
p2 = android.view.ViewGroup .getDefaultSize ( v0,p2 );
/* .line 3 */
(( android.view.ViewGroup ) p0 ).setMeasuredDimension ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V
/* .line 4 */
p1 = (( android.view.ViewGroup ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I
/* .line 5 */
/* div-int/lit8 p2, p1, 0xa */
/* .line 6 */
/* iget v1, p0, Landroidx/viewpager/widget/ViewPager;->A:I */
p2 = java.lang.Math .min ( p2,v1 );
/* iput p2, p0, Landroidx/viewpager/widget/ViewPager;->B:I */
/* .line 7 */
p2 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* sub-int/2addr p1, p2 */
p2 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* sub-int/2addr p1, p2 */
/* .line 8 */
p2 = (( android.view.ViewGroup ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I
v1 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* sub-int/2addr p2, v1 */
v1 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* sub-int/2addr p2, v1 */
/* .line 9 */
v1 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* const/16 v3, 0x8 */
int v4 = 1; // const/4 v4, 0x1
/* const/high16 v5, 0x40000000 # 2.0f */
/* if-ge v2, v1, :cond_c */
/* .line 10 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 11 */
v7 = (( android.view.View ) v6 ).getVisibility ( ); // invoke-virtual {v6}, Landroid/view/View;->getVisibility()I
/* if-eq v7, v3, :cond_b */
/* .line 12 */
(( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroidx/viewpager/widget/ViewPager$g; */
if ( v3 != null) { // if-eqz v3, :cond_b
/* .line 13 */
/* iget-boolean v7, v3, Landroidx/viewpager/widget/ViewPager$g;->a:Z */
if ( v7 != null) { // if-eqz v7, :cond_b
/* .line 14 */
/* iget v7, v3, Landroidx/viewpager/widget/ViewPager$g;->b:I */
/* and-int/lit8 v8, v7, 0x7 */
/* and-int/lit8 v7, v7, 0x70 */
/* const/16 v9, 0x30 */
/* if-eq v7, v9, :cond_1 */
/* const/16 v9, 0x50 */
/* if-ne v7, v9, :cond_0 */
} // :cond_0
int v7 = 0; // const/4 v7, 0x0
} // :cond_1
} // :goto_1
int v7 = 1; // const/4 v7, 0x1
} // :goto_2
int v9 = 3; // const/4 v9, 0x3
/* if-eq v8, v9, :cond_3 */
int v9 = 5; // const/4 v9, 0x5
/* if-ne v8, v9, :cond_2 */
} // :cond_2
int v4 = 0; // const/4 v4, 0x0
} // :cond_3
} // :goto_3
/* const/high16 v8, -0x80000000 */
if ( v7 != null) { // if-eqz v7, :cond_4
/* const/high16 v8, 0x40000000 # 2.0f */
} // :cond_4
if ( v4 != null) { // if-eqz v4, :cond_5
/* const/high16 v9, 0x40000000 # 2.0f */
} // :cond_5
} // :goto_4
/* const/high16 v9, -0x80000000 */
/* .line 15 */
} // :goto_5
/* iget v10, v3, Landroid/view/ViewGroup$LayoutParams;->width:I */
int v11 = -1; // const/4 v11, -0x1
int v12 = -2; // const/4 v12, -0x2
/* if-eq v10, v12, :cond_7 */
/* if-eq v10, v11, :cond_6 */
} // :cond_6
/* move v10, p1 */
} // :goto_6
/* const/high16 v8, 0x40000000 # 2.0f */
} // :cond_7
/* move v10, p1 */
/* .line 16 */
} // :goto_7
/* iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* if-eq v3, v12, :cond_9 */
/* if-eq v3, v11, :cond_8 */
} // :cond_8
/* move v3, p2 */
} // :cond_9
/* move v3, p2 */
/* move v5, v9 */
/* .line 17 */
} // :goto_8
v8 = android.view.View$MeasureSpec .makeMeasureSpec ( v10,v8 );
/* .line 18 */
v3 = android.view.View$MeasureSpec .makeMeasureSpec ( v3,v5 );
/* .line 19 */
(( android.view.View ) v6 ).measure ( v8, v3 ); // invoke-virtual {v6, v8, v3}, Landroid/view/View;->measure(II)V
if ( v7 != null) { // if-eqz v7, :cond_a
/* .line 20 */
v3 = (( android.view.View ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I
/* sub-int/2addr p2, v3 */
} // :cond_a
if ( v4 != null) { // if-eqz v4, :cond_b
/* .line 21 */
v3 = (( android.view.View ) v6 ).getMeasuredWidth ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I
/* sub-int/2addr p1, v3 */
} // :cond_b
} // :goto_9
/* add-int/lit8 v2, v2, 0x1 */
/* .line 22 */
} // :cond_c
android.view.View$MeasureSpec .makeMeasureSpec ( p1,v5 );
/* .line 23 */
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v5 );
/* iput p2, p0, Landroidx/viewpager/widget/ViewPager;->t:I */
/* .line 24 */
/* iput-boolean v4, p0, Landroidx/viewpager/widget/ViewPager;->u:Z */
/* .line 25 */
(( androidx.viewpager.widget.ViewPager ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->g()V
/* .line 26 */
/* iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->u:Z */
/* .line 27 */
p2 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
} // :goto_a
/* if-ge v0, p2, :cond_f */
/* .line 28 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 29 */
v2 = (( android.view.View ) v1 ).getVisibility ( ); // invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
/* if-eq v2, v3, :cond_e */
/* .line 30 */
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroidx/viewpager/widget/ViewPager$g; */
if ( v2 != null) { // if-eqz v2, :cond_d
/* .line 31 */
/* iget-boolean v4, v2, Landroidx/viewpager/widget/ViewPager$g;->a:Z */
/* if-nez v4, :cond_e */
} // :cond_d
/* int-to-float v4, p1 */
/* .line 32 */
/* iget v2, v2, Landroidx/viewpager/widget/ViewPager$g;->c:F */
/* mul-float v4, v4, v2 */
/* float-to-int v2, v4 */
v2 = android.view.View$MeasureSpec .makeMeasureSpec ( v2,v5 );
/* .line 33 */
/* iget v4, p0, Landroidx/viewpager/widget/ViewPager;->t:I */
(( android.view.View ) v1 ).measure ( v2, v4 ); // invoke-virtual {v1, v2, v4}, Landroid/view/View;->measure(II)V
} // :cond_e
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_f
return;
} // .end method
public Boolean onRequestFocusInDescendants ( Integer p0, android.graphics.Rect p1 ) {
/* .locals 8 */
/* .line 1 */
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* and-int/lit8 v1, p1, 0x2 */
int v2 = 0; // const/4 v2, 0x0
int v3 = -1; // const/4 v3, -0x1
int v4 = 1; // const/4 v4, 0x1
if ( v1 != null) { // if-eqz v1, :cond_0
/* move v3, v0 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
int v1 = -1; // const/4 v1, -0x1
} // :goto_0
/* if-eq v0, v3, :cond_2 */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 3 */
v6 = (( android.view.View ) v5 ).getVisibility ( ); // invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
/* if-nez v6, :cond_1 */
/* .line 4 */
(( androidx.viewpager.widget.ViewPager ) p0 ).b ( v5 ); // invoke-virtual {p0, v5}, Landroidx/viewpager/widget/ViewPager;->b(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$f;
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 5 */
/* iget v6, v6, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* iget v7, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* if-ne v6, v7, :cond_1 */
/* .line 6 */
v5 = (( android.view.View ) v5 ).requestFocus ( p1, p2 ); // invoke-virtual {v5, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z
if ( v5 != null) { // if-eqz v5, :cond_1
} // :cond_1
/* add-int/2addr v0, v1 */
} // :cond_2
} // .end method
public void onRestoreInstanceState ( android.os.Parcelable p0 ) {
/* .locals 3 */
/* .line 1 */
/* instance-of v0, p1, Landroidx/viewpager/widget/ViewPager$m; */
/* if-nez v0, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
return;
/* .line 3 */
} // :cond_0
/* check-cast p1, Landroidx/viewpager/widget/ViewPager$m; */
/* .line 4 */
(( c.j.a.c ) p1 ).a ( ); // invoke-virtual {p1}, Lc/j/a/c;->a()Landroid/os/Parcelable;
/* invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
/* .line 5 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
v1 = this.e;
v2 = this.f;
(( c.y.a.a ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/y/a/a;->a(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
/* .line 7 */
/* iget p1, p1, Landroidx/viewpager/widget/ViewPager$m;->d:I */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Landroidx/viewpager/widget/ViewPager;->a(IZZ)V
/* .line 8 */
} // :cond_1
/* iget v0, p1, Landroidx/viewpager/widget/ViewPager$m;->d:I */
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager;->h:I */
/* .line 9 */
v0 = this.e;
this.i = v0;
/* .line 10 */
p1 = this.f;
this.j = p1;
} // :goto_0
return;
} // .end method
public android.os.Parcelable onSaveInstanceState ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable; */
/* .line 2 */
/* new-instance v1, Landroidx/viewpager/widget/ViewPager$m; */
/* invoke-direct {v1, v0}, Landroidx/viewpager/widget/ViewPager$m;-><init>(Landroid/os/Parcelable;)V */
/* .line 3 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* iput v0, v1, Landroidx/viewpager/widget/ViewPager$m;->d:I */
/* .line 4 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
(( c.y.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lc/y/a/a;->b()Landroid/os/Parcelable;
this.e = v0;
} // :cond_0
} // .end method
public void onSizeChanged ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V */
/* if-eq p1, p3, :cond_0 */
/* .line 2 */
/* iget p2, p0, Landroidx/viewpager/widget/ViewPager;->n:I */
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( p1, p3, p2, p2 ); // invoke-virtual {p0, p1, p3, p2, p2}, Landroidx/viewpager/widget/ViewPager;->a(IIII)V
} // :cond_0
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 7 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->N:Z */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
int v2 = 0; // const/4 v2, 0x0
/* if-nez v0, :cond_1 */
v0 = (( android.view.MotionEvent ) p1 ).getEdgeFlags ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getEdgeFlags()I
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
} // :cond_1
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_f
v0 = (( c.y.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/y/a/a;->a()I
/* if-nez v0, :cond_2 */
/* goto/16 :goto_2 */
/* .line 4 */
} // :cond_2
v0 = this.I;
/* if-nez v0, :cond_3 */
/* .line 5 */
android.view.VelocityTracker .obtain ( );
this.I = v0;
/* .line 6 */
} // :cond_3
v0 = this.I;
(( android.view.VelocityTracker ) v0 ).addMovement ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
/* .line 7 */
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* and-int/lit16 v0, v0, 0xff */
if ( v0 != null) { // if-eqz v0, :cond_c
/* if-eq v0, v1, :cond_b */
int v3 = 2; // const/4 v3, 0x2
/* if-eq v0, v3, :cond_7 */
int v3 = 3; // const/4 v3, 0x3
/* if-eq v0, v3, :cond_6 */
int v3 = 5; // const/4 v3, 0x5
/* if-eq v0, v3, :cond_5 */
int v3 = 6; // const/4 v3, 0x6
/* if-eq v0, v3, :cond_4 */
/* goto/16 :goto_1 */
/* .line 8 */
} // :cond_4
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->a(Landroid/view/MotionEvent;)V
/* .line 9 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->H:I */
v0 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
p1 = (( android.view.MotionEvent ) p1 ).getX ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->D:F */
/* goto/16 :goto_1 */
/* .line 10 */
} // :cond_5
v0 = (( android.view.MotionEvent ) p1 ).getActionIndex ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I
/* .line 11 */
v3 = (( android.view.MotionEvent ) p1 ).getX ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F
/* .line 12 */
/* iput v3, p0, Landroidx/viewpager/widget/ViewPager;->D:F */
/* .line 13 */
p1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->H:I */
/* goto/16 :goto_1 */
/* .line 14 */
} // :cond_6
/* iget-boolean p1, p0, Landroidx/viewpager/widget/ViewPager;->y:Z */
if ( p1 != null) { // if-eqz p1, :cond_d
/* .line 15 */
/* iget p1, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( p1, v1, v2, v2 ); // invoke-virtual {p0, p1, v1, v2, v2}, Landroidx/viewpager/widget/ViewPager;->a(IZIZ)V
/* .line 16 */
v2 = (( androidx.viewpager.widget.ViewPager ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->i()Z
/* goto/16 :goto_1 */
/* .line 17 */
} // :cond_7
/* iget-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->y:Z */
/* if-nez v0, :cond_a */
/* .line 18 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->H:I */
v0 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
int v3 = -1; // const/4 v3, -0x1
/* if-ne v0, v3, :cond_8 */
/* .line 19 */
v2 = (( androidx.viewpager.widget.ViewPager ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->i()Z
/* goto/16 :goto_1 */
/* .line 20 */
} // :cond_8
v3 = (( android.view.MotionEvent ) p1 ).getX ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F
/* .line 21 */
/* iget v4, p0, Landroidx/viewpager/widget/ViewPager;->D:F */
/* sub-float v4, v3, v4 */
v4 = java.lang.Math .abs ( v4 );
/* .line 22 */
v0 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
/* .line 23 */
/* iget v5, p0, Landroidx/viewpager/widget/ViewPager;->E:F */
/* sub-float v5, v0, v5 */
v5 = java.lang.Math .abs ( v5 );
/* .line 24 */
/* iget v6, p0, Landroidx/viewpager/widget/ViewPager;->C:I */
/* int-to-float v6, v6 */
/* cmpl-float v6, v4, v6 */
/* if-lez v6, :cond_a */
/* cmpl-float v4, v4, v5 */
/* if-lez v4, :cond_a */
/* .line 25 */
/* iput-boolean v1, p0, Landroidx/viewpager/widget/ViewPager;->y:Z */
/* .line 26 */
(( androidx.viewpager.widget.ViewPager ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Landroidx/viewpager/widget/ViewPager;->c(Z)V
/* .line 27 */
/* iget v4, p0, Landroidx/viewpager/widget/ViewPager;->F:F */
/* sub-float/2addr v3, v4 */
int v5 = 0; // const/4 v5, 0x0
/* cmpl-float v3, v3, v5 */
/* if-lez v3, :cond_9 */
/* iget v3, p0, Landroidx/viewpager/widget/ViewPager;->C:I */
/* int-to-float v3, v3 */
/* add-float/2addr v4, v3 */
} // :cond_9
/* iget v3, p0, Landroidx/viewpager/widget/ViewPager;->C:I */
/* int-to-float v3, v3 */
/* sub-float/2addr v4, v3 */
} // :goto_0
/* iput v4, p0, Landroidx/viewpager/widget/ViewPager;->D:F */
/* .line 28 */
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager;->E:F */
/* .line 29 */
(( androidx.viewpager.widget.ViewPager ) p0 ).setScrollState ( v1 ); // invoke-virtual {p0, v1}, Landroidx/viewpager/widget/ViewPager;->setScrollState(I)V
/* .line 30 */
/* invoke-direct {p0, v1}, Landroidx/viewpager/widget/ViewPager;->setScrollingCacheEnabled(Z)V */
/* .line 31 */
(( android.view.ViewGroup ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 32 */
/* .line 33 */
} // :cond_a
/* iget-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->y:Z */
if ( v0 != null) { // if-eqz v0, :cond_d
/* .line 34 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->H:I */
v0 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* .line 35 */
p1 = (( android.view.MotionEvent ) p1 ).getX ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F
/* .line 36 */
p1 = (( androidx.viewpager.widget.ViewPager ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->b(F)Z
/* or-int/2addr v2, p1 */
/* .line 37 */
} // :cond_b
/* iget-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->y:Z */
if ( v0 != null) { // if-eqz v0, :cond_d
/* .line 38 */
v0 = this.I;
/* const/16 v2, 0x3e8 */
/* .line 39 */
/* iget v3, p0, Landroidx/viewpager/widget/ViewPager;->K:I */
/* int-to-float v3, v3 */
(( android.view.VelocityTracker ) v0 ).computeCurrentVelocity ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
/* .line 40 */
/* iget v2, p0, Landroidx/viewpager/widget/ViewPager;->H:I */
v0 = (( android.view.VelocityTracker ) v0 ).getXVelocity ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/VelocityTracker;->getXVelocity(I)F
/* float-to-int v0, v0 */
/* .line 41 */
/* iput-boolean v1, p0, Landroidx/viewpager/widget/ViewPager;->w:Z */
/* .line 42 */
v2 = /* invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->getClientWidth()I */
/* .line 43 */
v3 = (( android.view.ViewGroup ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollX()I
/* .line 44 */
(( androidx.viewpager.widget.ViewPager ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->c()Landroidx/viewpager/widget/ViewPager$f;
/* .line 45 */
/* iget v5, p0, Landroidx/viewpager/widget/ViewPager;->n:I */
/* int-to-float v5, v5 */
/* int-to-float v2, v2 */
/* div-float/2addr v5, v2 */
/* .line 46 */
/* iget v6, v4, Landroidx/viewpager/widget/ViewPager$f;->b:I */
/* int-to-float v3, v3 */
/* div-float/2addr v3, v2 */
/* .line 47 */
/* iget v2, v4, Landroidx/viewpager/widget/ViewPager$f;->e:F */
/* sub-float/2addr v3, v2 */
/* iget v2, v4, Landroidx/viewpager/widget/ViewPager$f;->d:F */
/* add-float/2addr v2, v5 */
/* div-float/2addr v3, v2 */
/* .line 48 */
/* iget v2, p0, Landroidx/viewpager/widget/ViewPager;->H:I */
v2 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* .line 49 */
p1 = (( android.view.MotionEvent ) p1 ).getX ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F
/* .line 50 */
/* iget v2, p0, Landroidx/viewpager/widget/ViewPager;->F:F */
/* sub-float/2addr p1, v2 */
/* float-to-int p1, p1 */
/* .line 51 */
p1 = (( androidx.viewpager.widget.ViewPager ) p0 ).a ( v6, v3, v0, p1 ); // invoke-virtual {p0, v6, v3, v0, p1}, Landroidx/viewpager/widget/ViewPager;->a(IFII)I
/* .line 52 */
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( p1, v1, v1, v0 ); // invoke-virtual {p0, p1, v1, v1, v0}, Landroidx/viewpager/widget/ViewPager;->a(IZZI)V
/* .line 53 */
v2 = (( androidx.viewpager.widget.ViewPager ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->i()Z
/* .line 54 */
} // :cond_c
v0 = this.k;
(( android.widget.Scroller ) v0 ).abortAnimation ( ); // invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V
/* .line 55 */
/* iput-boolean v2, p0, Landroidx/viewpager/widget/ViewPager;->w:Z */
/* .line 56 */
(( androidx.viewpager.widget.ViewPager ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->g()V
/* .line 57 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager;->F:F */
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager;->D:F */
/* .line 58 */
v0 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager;->G:F */
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager;->E:F */
/* .line 59 */
p1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->H:I */
} // :cond_d
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_e
/* .line 60 */
c.h.n.v0 .H ( p0 );
} // :cond_e
} // :cond_f
} // :goto_2
} // .end method
public void removeView ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->u:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.view.ViewGroup ) p0 ).removeViewInLayout ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V
/* .line 3 */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V */
} // :goto_0
return;
} // .end method
public void setAdapter ( Object p0 ) {
/* .locals 7 */
/* .line 1 */
v0 = this.f;
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
(( c.y.a.a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/y/a/a;->a(Landroid/database/DataSetObserver;)V
/* .line 3 */
v0 = this.f;
(( c.y.a.a ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lc/y/a/a;->b(Landroid/view/ViewGroup;)V
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
} // :goto_0
v3 = this.c;
v3 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
/* if-ge v0, v3, :cond_0 */
/* .line 5 */
v3 = this.c;
(( java.util.ArrayList ) v3 ).get ( v0 ); // invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Landroidx/viewpager/widget/ViewPager$f; */
/* .line 6 */
v4 = this.f;
/* iget v5, v3, Landroidx/viewpager/widget/ViewPager$f;->b:I */
v3 = this.a;
(( c.y.a.a ) v4 ).a ( p0, v5, v3 ); // invoke-virtual {v4, p0, v5, v3}, Lc/y/a/a;->a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
/* add-int/lit8 v0, v0, 0x1 */
/* .line 7 */
} // :cond_0
v0 = this.f;
(( c.y.a.a ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/y/a/a;->a(Landroid/view/ViewGroup;)V
/* .line 8 */
v0 = this.c;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 9 */
(( androidx.viewpager.widget.ViewPager ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->h()V
/* .line 10 */
/* iput v2, p0, Landroidx/viewpager/widget/ViewPager;->g:I */
/* .line 11 */
(( android.view.ViewGroup ) p0 ).scrollTo ( v2, v2 ); // invoke-virtual {p0, v2, v2}, Landroid/view/ViewGroup;->scrollTo(II)V
/* .line 12 */
} // :cond_1
v0 = this.f;
/* .line 13 */
this.f = p1;
/* .line 14 */
/* iput v2, p0, Landroidx/viewpager/widget/ViewPager;->b:I */
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 15 */
v3 = this.m;
/* if-nez v3, :cond_2 */
/* .line 16 */
/* new-instance v3, Landroidx/viewpager/widget/ViewPager$l; */
/* invoke-direct {v3, p0}, Landroidx/viewpager/widget/ViewPager$l;-><init>(Landroidx/viewpager/widget/ViewPager;)V */
this.m = v3;
/* .line 17 */
} // :cond_2
v3 = this.f;
v4 = this.m;
(( c.y.a.a ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Lc/y/a/a;->a(Landroid/database/DataSetObserver;)V
/* .line 18 */
/* iput-boolean v2, p0, Landroidx/viewpager/widget/ViewPager;->w:Z */
/* .line 19 */
/* iget-boolean v3, p0, Landroidx/viewpager/widget/ViewPager;->Q:Z */
int v4 = 1; // const/4 v4, 0x1
/* .line 20 */
/* iput-boolean v4, p0, Landroidx/viewpager/widget/ViewPager;->Q:Z */
/* .line 21 */
v5 = this.f;
v5 = (( c.y.a.a ) v5 ).a ( ); // invoke-virtual {v5}, Lc/y/a/a;->a()I
/* iput v5, p0, Landroidx/viewpager/widget/ViewPager;->b:I */
/* .line 22 */
/* iget v5, p0, Landroidx/viewpager/widget/ViewPager;->h:I */
/* if-ltz v5, :cond_3 */
/* .line 23 */
v3 = this.f;
v5 = this.i;
v6 = this.j;
(( c.y.a.a ) v3 ).a ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Lc/y/a/a;->a(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
/* .line 24 */
/* iget v3, p0, Landroidx/viewpager/widget/ViewPager;->h:I */
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( v3, v2, v4 ); // invoke-virtual {p0, v3, v2, v4}, Landroidx/viewpager/widget/ViewPager;->a(IZZ)V
int v3 = -1; // const/4 v3, -0x1
/* .line 25 */
/* iput v3, p0, Landroidx/viewpager/widget/ViewPager;->h:I */
/* .line 26 */
this.i = v1;
/* .line 27 */
this.j = v1;
} // :cond_3
/* if-nez v3, :cond_4 */
/* .line 28 */
(( androidx.viewpager.widget.ViewPager ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->g()V
/* .line 29 */
} // :cond_4
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
/* .line 30 */
} // :cond_5
} // :goto_1
v1 = this.W;
v1 = if ( v1 != null) { // if-eqz v1, :cond_6
/* if-nez v1, :cond_6 */
/* .line 31 */
v1 = v1 = this.W;
} // :goto_2
/* if-ge v2, v1, :cond_6 */
/* .line 32 */
v3 = this.W;
/* check-cast v3, Landroidx/viewpager/widget/ViewPager$i; */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_6
return;
} // .end method
public void setCurrentItem ( Integer p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->w:Z */
/* .line 2 */
/* iget-boolean v1, p0, Landroidx/viewpager/widget/ViewPager;->Q:Z */
/* xor-int/lit8 v1, v1, 0x1 */
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Landroidx/viewpager/widget/ViewPager;->a(IZZ)V
return;
} // .end method
public void setOffscreenPageLimit ( Integer p0 ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* if-ge p1, v0, :cond_0 */
/* .line 1 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Requested offscreen page limit "; // const-string v2, "Requested offscreen page limit "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " too small; defaulting to "; // const-string p1, " too small; defaulting to "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "ViewPager"; // const-string v1, "ViewPager"
android.util.Log .w ( v1,p1 );
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
} // :cond_0
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->x:I */
/* if-eq p1, v0, :cond_1 */
/* .line 3 */
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->x:I */
/* .line 4 */
(( androidx.viewpager.widget.ViewPager ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->g()V
} // :cond_1
return;
} // .end method
public void setOnPageChangeListener ( androidx.viewpager.widget.ViewPager$j p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
this.U = p1;
return;
} // .end method
public void setPageMargin ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->n:I */
/* .line 2 */
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->n:I */
/* .line 3 */
v1 = (( android.view.ViewGroup ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I
/* .line 4 */
(( androidx.viewpager.widget.ViewPager ) p0 ).a ( v1, v1, p1, v0 ); // invoke-virtual {p0, v1, v1, p1, v0}, Landroidx/viewpager/widget/ViewPager;->a(IIII)V
/* .line 5 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
return;
} // .end method
public void setPageMarginDrawable ( Integer p0 ) {
/* .locals 1 */
/* .line 5 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
c.h.f.f .c ( v0,p1 );
(( androidx.viewpager.widget.ViewPager ) p0 ).setPageMarginDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setPageMarginDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .line 1 */
this.o = p1;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
(( android.view.ViewGroup ) p0 ).refreshDrawableState ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->refreshDrawableState()V
} // :cond_0
/* if-nez p1, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
} // :goto_0
(( android.view.ViewGroup ) p0 ).setWillNotDraw ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V
/* .line 4 */
(( android.view.ViewGroup ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V
return;
} // .end method
public void setScrollState ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager;->f0:I */
/* if-ne v0, p1, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* iput p1, p0, Landroidx/viewpager/widget/ViewPager;->f0:I */
/* .line 3 */
v0 = this.a0;
if ( v0 != null) { // if-eqz v0, :cond_2
if ( p1 != null) { // if-eqz p1, :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
} // :goto_0
(( androidx.viewpager.widget.ViewPager ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/viewpager/widget/ViewPager;->b(Z)V
/* .line 5 */
} // :cond_2
(( androidx.viewpager.widget.ViewPager ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->c(I)V
return;
} // .end method
public Boolean verifyDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z */
/* if-nez v0, :cond_1 */
v0 = this.o;
/* if-ne p1, v0, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
