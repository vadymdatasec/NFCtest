public class c.b.p.o.y {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 public final c.b.p.o.m b;
	 public final Boolean c;
	 public final Integer d;
	 public final Integer e;
	 public android.view.View f;
	 public Integer g;
	 public Boolean h;
	 public c.b.p.o.z$a i;
	 public c.b.p.o.w j;
	 public android.widget.PopupWindow$OnDismissListener k;
	 public final android.widget.PopupWindow$OnDismissListener l;
	 /* # direct methods */
	 public c.b.p.o.y ( ) {
		 /* .locals 7 */
		 int v6 = 0; // const/4 v6, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* .line 1 */
		 /* invoke-direct/range {v0 ..v6}, Lc/b/p/o/y;-><init>(Landroid/content/Context;Lc/b/p/o/m;Landroid/view/View;ZII)V */
		 return;
	 } // .end method
	 public c.b.p.o.y ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const v0, 0x800003 */
		 /* .line 3 */
		 /* iput v0, p0, Lc/b/p/o/y;->g:I */
		 /* .line 4 */
		 /* new-instance v0, Lc/b/p/o/x; */
		 /* invoke-direct {v0, p0}, Lc/b/p/o/x;-><init>(Lc/b/p/o/y;)V */
		 this.l = v0;
		 /* .line 5 */
		 this.a = p1;
		 /* .line 6 */
		 this.b = p2;
		 /* .line 7 */
		 this.f = p3;
		 /* .line 8 */
		 /* iput-boolean p4, p0, Lc/b/p/o/y;->c:Z */
		 /* .line 9 */
		 /* iput p5, p0, Lc/b/p/o/y;->d:I */
		 /* .line 10 */
		 /* iput p6, p0, Lc/b/p/o/y;->e:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final c.b.p.o.w a ( ) {
		 /* .locals 14 */
		 /* .line 10 */
		 v0 = this.a;
		 final String v1 = "window"; // const-string v1, "window"
		 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/view/WindowManager; */
		 /* .line 11 */
		 /* .line 12 */
		 /* new-instance v1, Landroid/graphics/Point; */
		 /* invoke-direct {v1}, Landroid/graphics/Point;-><init>()V */
		 /* .line 13 */
		 /* const/16 v3, 0x11 */
		 /* if-lt v2, v3, :cond_0 */
		 /* .line 14 */
		 (( android.view.Display ) v0 ).getRealSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V
		 /* .line 15 */
	 } // :cond_0
	 (( android.view.Display ) v0 ).getSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V
	 /* .line 16 */
} // :goto_0
/* iget v0, v1, Landroid/graphics/Point;->x:I */
/* iget v1, v1, Landroid/graphics/Point;->y:I */
v0 = java.lang.Math .min ( v0,v1 );
/* .line 17 */
v1 = this.a;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v1 = (( android.content.res.Resources ) v1 ).getDimensionPixelSize ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
/* if-lt v0, v1, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 18 */
/* new-instance v0, Lc/b/p/o/i; */
v2 = this.a;
v3 = this.f;
/* iget v4, p0, Lc/b/p/o/y;->d:I */
/* iget v5, p0, Lc/b/p/o/y;->e:I */
/* iget-boolean v6, p0, Lc/b/p/o/y;->c:Z */
/* move-object v1, v0 */
/* invoke-direct/range {v1 ..v6}, Lc/b/p/o/i;-><init>(Landroid/content/Context;Landroid/view/View;IIZ)V */
/* .line 19 */
} // :cond_2
/* new-instance v0, Lc/b/p/o/f0; */
v8 = this.a;
v9 = this.b;
v10 = this.f;
/* iget v11, p0, Lc/b/p/o/y;->d:I */
/* iget v12, p0, Lc/b/p/o/y;->e:I */
/* iget-boolean v13, p0, Lc/b/p/o/y;->c:Z */
/* move-object v7, v0 */
/* invoke-direct/range {v7 ..v13}, Lc/b/p/o/f0;-><init>(Landroid/content/Context;Lc/b/p/o/m;Landroid/view/View;IIZ)V */
/* .line 20 */
} // :goto_2
v1 = this.b;
(( c.b.p.o.w ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/p/o/w;->a(Lc/b/p/o/m;)V
/* .line 21 */
v1 = this.l;
(( c.b.p.o.w ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/p/o/w;->a(Landroid/widget/PopupWindow$OnDismissListener;)V
/* .line 22 */
v1 = this.f;
(( c.b.p.o.w ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/p/o/w;->a(Landroid/view/View;)V
/* .line 23 */
v1 = this.i;
/* .line 24 */
/* iget-boolean v1, p0, Lc/b/p/o/y;->h:Z */
(( c.b.p.o.w ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/b/p/o/w;->b(Z)V
/* .line 25 */
/* iget v1, p0, Lc/b/p/o/y;->g:I */
(( c.b.p.o.w ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/p/o/w;->a(I)V
} // .end method
public void a ( Integer p0 ) {
/* .locals 0 */
/* .line 6 */
/* iput p1, p0, Lc/b/p/o/y;->g:I */
return;
} // .end method
public final void a ( Integer p0, Integer p1, Boolean p2, Boolean p3 ) {
/* .locals 3 */
/* .line 26 */
(( c.b.p.o.y ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/p/o/y;->c()Lc/b/p/o/w;
/* .line 27 */
(( c.b.p.o.w ) v0 ).c ( p4 ); // invoke-virtual {v0, p4}, Lc/b/p/o/w;->c(Z)V
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 28 */
/* iget p3, p0, Lc/b/p/o/y;->g:I */
p4 = this.f;
/* .line 29 */
p4 = c.h.n.v0 .o ( p4 );
/* .line 30 */
p3 = c.h.n.i .a ( p3,p4 );
/* and-int/lit8 p3, p3, 0x7 */
int p4 = 5; // const/4 p4, 0x5
/* if-ne p3, p4, :cond_0 */
/* .line 31 */
p3 = this.f;
p3 = (( android.view.View ) p3 ).getWidth ( ); // invoke-virtual {p3}, Landroid/view/View;->getWidth()I
/* sub-int/2addr p1, p3 */
/* .line 32 */
} // :cond_0
(( c.b.p.o.w ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/o/w;->b(I)V
/* .line 33 */
(( c.b.p.o.w ) v0 ).c ( p2 ); // invoke-virtual {v0, p2}, Lc/b/p/o/w;->c(I)V
/* .line 34 */
p3 = this.a;
(( android.content.Context ) p3 ).getResources ( ); // invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p3 ).getDisplayMetrics ( ); // invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget p3, p3, Landroid/util/DisplayMetrics;->density:F */
/* const/high16 p4, 0x42400000 # 48.0f */
/* mul-float p3, p3, p4 */
/* const/high16 p4, 0x40000000 # 2.0f */
/* div-float/2addr p3, p4 */
/* float-to-int p3, p3 */
/* .line 35 */
/* new-instance p4, Landroid/graphics/Rect; */
/* sub-int v1, p1, p3 */
/* sub-int v2, p2, p3 */
/* add-int/2addr p1, p3 */
/* add-int/2addr p2, p3 */
/* invoke-direct {p4, v1, v2, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V */
/* .line 36 */
(( c.b.p.o.w ) v0 ).a ( p4 ); // invoke-virtual {v0, p4}, Lc/b/p/o/w;->a(Landroid/graphics/Rect;)V
/* .line 37 */
} // :cond_1
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 0 */
/* .line 2 */
this.f = p1;
return;
} // .end method
public void a ( android.widget.PopupWindow$OnDismissListener p0 ) {
/* .locals 0 */
/* .line 1 */
this.k = p1;
return;
} // .end method
public void a ( c.b.p.o.z$a p0 ) {
/* .locals 1 */
/* .line 38 */
this.i = p1;
/* .line 39 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 40 */
} // :cond_0
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 3 */
/* iput-boolean p1, p0, Lc/b/p/o/y;->h:Z */
/* .line 4 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
(( c.b.p.o.w ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/o/w;->b(Z)V
} // :cond_0
return;
} // .end method
public Boolean a ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 7 */
v0 = (( c.b.p.o.y ) p0 ).d ( ); // invoke-virtual {p0}, Lc/b/p/o/y;->d()Z
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
} // :cond_0
v0 = this.f;
/* if-nez v0, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 9 */
} // :cond_1
(( c.b.p.o.y ) p0 ).a ( p1, p2, v1, v1 ); // invoke-virtual {p0, p1, p2, v1, v1}, Lc/b/p/o/y;->a(IIZZ)V
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( c.b.p.o.y ) p0 ).d ( ); // invoke-virtual {p0}, Lc/b/p/o/y;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.j;
} // :cond_0
return;
} // .end method
public c.b.p.o.w c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
/* if-nez v0, :cond_0 */
/* .line 2 */
(( c.b.p.o.y ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/p/o/y;->a()Lc/b/p/o/w;
this.j = v0;
/* .line 3 */
} // :cond_0
v0 = this.j;
} // .end method
public Boolean d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
v0 = if ( v0 != null) { // if-eqz v0, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void e ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
this.j = v0;
/* .line 2 */
v0 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
} // :cond_0
return;
} // .end method
public void f ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( c.b.p.o.y ) p0 ).g ( ); // invoke-virtual {p0}, Lc/b/p/o/y;->g()Z
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "MenuPopupHelper cannot be used without an anchor"; // const-string v1, "MenuPopupHelper cannot be used without an anchor"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Boolean g ( ) {
/* .locals 3 */
/* .line 1 */
v0 = (( c.b.p.o.y ) p0 ).d ( ); // invoke-virtual {p0}, Lc/b/p/o/y;->d()Z
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = this.f;
int v2 = 0; // const/4 v2, 0x0
/* if-nez v0, :cond_1 */
/* .line 3 */
} // :cond_1
(( c.b.p.o.y ) p0 ).a ( v2, v2, v2, v2 ); // invoke-virtual {p0, v2, v2, v2, v2}, Lc/b/p/o/y;->a(IIZZ)V
} // .end method
