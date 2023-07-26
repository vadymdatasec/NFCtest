public class inal {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.Integer e;
	 /* # instance fields */
	 public final android.view.View a;
	 public final java.util.List b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/b/a/c0/o/g;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Boolean c;
public e.b.a.c0.o.i d;
/* # direct methods */
public inal ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
/* .line 3 */
this.a = p1;
return;
} // .end method
public static Integer a ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = e.b.a.c0.o.j.e;
/* if-nez v0, :cond_0 */
final String v0 = "window"; // const-string v0, "window"
/* .line 2 */
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p0, Landroid/view/WindowManager; */
/* .line 3 */
e.b.a.e0.r .a ( p0 );
/* check-cast p0, Landroid/view/WindowManager; */
/* .line 4 */
/* new-instance v0, Landroid/graphics/Point; */
/* invoke-direct {v0}, Landroid/graphics/Point;-><init>()V */
/* .line 5 */
(( android.view.Display ) p0 ).getSize ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V
/* .line 6 */
/* iget p0, v0, Landroid/graphics/Point;->x:I */
/* iget v0, v0, Landroid/graphics/Point;->y:I */
p0 = java.lang.Math .max ( p0,v0 );
java.lang.Integer .valueOf ( p0 );
/* .line 7 */
} // :cond_0
p0 = e.b.a.c0.o.j.e;
p0 = (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
} // .end method
/* # virtual methods */
public final Integer a ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* sub-int v0, p2, p3 */
/* if-lez v0, :cond_0 */
/* .line 25 */
} // :cond_0
/* iget-boolean v0, p0, Le/b/a/c0/o/j;->c:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
v0 = (( android.view.View ) v0 ).isLayoutRequested ( ); // invoke-virtual {v0}, Landroid/view/View;->isLayoutRequested()Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
/* sub-int/2addr p1, p3 */
/* if-lez p1, :cond_2 */
/* .line 26 */
} // :cond_2
p1 = this.a;
p1 = (( android.view.View ) p1 ).isLayoutRequested ( ); // invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z
/* if-nez p1, :cond_4 */
int p1 = -2; // const/4 p1, -0x2
/* if-ne p2, p1, :cond_4 */
int p1 = 4; // const/4 p1, 0x4
final String p2 = "ViewTarget"; // const-string p2, "ViewTarget"
/* .line 27 */
p1 = android.util.Log .isLoggable ( p2,p1 );
if ( p1 != null) { // if-eqz p1, :cond_3
final String p1 = "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device\'s screen dimensions.If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL).Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions."; // const-string p1, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device\'s screen dimensions.If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL).Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions."
/* .line 28 */
android.util.Log .i ( p2,p1 );
/* .line 29 */
} // :cond_3
p1 = this.a;
(( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
p1 = e.b.a.c0.o.j .a ( p1 );
} // :cond_4
} // .end method
public void a ( ) {
/* .locals 3 */
/* .line 8 */
v0 = v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 9 */
} // :cond_0
v0 = (( e.b.a.c0.o.j ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/c0/o/j;->d()I
/* .line 10 */
v1 = (( e.b.a.c0.o.j ) p0 ).c ( ); // invoke-virtual {p0}, Le/b/a/c0/o/j;->c()I
/* .line 11 */
v2 = (( e.b.a.c0.o.j ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/b/a/c0/o/j;->a(II)Z
/* if-nez v2, :cond_1 */
return;
/* .line 12 */
} // :cond_1
(( e.b.a.c0.o.j ) p0 ).b ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/b/a/c0/o/j;->b(II)V
/* .line 13 */
(( e.b.a.c0.o.j ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/c0/o/j;->b()V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 3 */
/* .line 14 */
v0 = (( e.b.a.c0.o.j ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/c0/o/j;->d()I
/* .line 15 */
v1 = (( e.b.a.c0.o.j ) p0 ).c ( ); // invoke-virtual {p0}, Le/b/a/c0/o/j;->c()I
/* .line 16 */
v2 = (( e.b.a.c0.o.j ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/b/a/c0/o/j;->a(II)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 17 */
return;
/* .line 18 */
} // :cond_0
v0 = v0 = this.b;
/* if-nez v0, :cond_1 */
/* .line 19 */
v0 = this.b;
/* .line 20 */
} // :cond_1
p1 = this.d;
/* if-nez p1, :cond_2 */
/* .line 21 */
p1 = this.a;
(( android.view.View ) p1 ).getViewTreeObserver ( ); // invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
/* .line 22 */
/* new-instance v0, Le/b/a/c0/o/i; */
/* invoke-direct {v0, p0}, Le/b/a/c0/o/i;-><init>(Le/b/a/c0/o/j;)V */
this.d = v0;
/* .line 23 */
(( android.view.ViewTreeObserver ) p1 ).addOnPreDrawListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
} // :cond_2
return;
} // .end method
public final Boolean a ( Integer p0 ) {
/* .locals 1 */
/* if-gtz p1, :cond_1 */
/* const/high16 v0, -0x80000000 */
/* if-ne p1, v0, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public final Boolean a ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .line 24 */
p1 = (( e.b.a.c0.o.j ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/c0/o/j;->a(I)Z
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = (( e.b.a.c0.o.j ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/b/a/c0/o/j;->a(I)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void b ( ) {
/* .locals 2 */
/* .line 4 */
v0 = this.a;
(( android.view.View ) v0 ).getViewTreeObserver ( ); // invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
/* .line 5 */
v1 = (( android.view.ViewTreeObserver ) v0 ).isAlive ( ); // invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 6 */
v1 = this.d;
(( android.view.ViewTreeObserver ) v0 ).removeOnPreDrawListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
this.d = v0;
/* .line 8 */
v0 = this.b;
return;
} // .end method
public final void b ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/util/ArrayList; */
v1 = this.b;
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Le/b/a/c0/o/g; */
/* .line 2 */
} // :cond_0
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.b;
return;
} // .end method
public final Integer c ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
v0 = (( android.view.View ) v0 ).getPaddingTop ( ); // invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I
v1 = this.a;
v1 = (( android.view.View ) v1 ).getPaddingBottom ( ); // invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I
/* add-int/2addr v0, v1 */
/* .line 2 */
v1 = this.a;
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
/* iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
} // :goto_0
v2 = this.a;
v2 = (( android.view.View ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/view/View;->getHeight()I
v0 = (( e.b.a.c0.o.j ) p0 ).a ( v2, v1, v0 ); // invoke-virtual {p0, v2, v1, v0}, Le/b/a/c0/o/j;->a(III)I
} // .end method
public final Integer d ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
v0 = (( android.view.View ) v0 ).getPaddingLeft ( ); // invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I
v1 = this.a;
v1 = (( android.view.View ) v1 ).getPaddingRight ( ); // invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I
/* add-int/2addr v0, v1 */
/* .line 2 */
v1 = this.a;
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
/* iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
} // :goto_0
v2 = this.a;
v2 = (( android.view.View ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/view/View;->getWidth()I
v0 = (( e.b.a.c0.o.j ) p0 ).a ( v2, v1, v0 ); // invoke-virtual {p0, v2, v1, v0}, Le/b/a/c0/o/j;->a(III)I
} // .end method
