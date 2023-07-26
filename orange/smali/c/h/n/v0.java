public abstract class c.h.n.v0 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "PrivateConstructorForUtilityClass" */
	 /* } */
} // .end annotation
/* # static fields */
public static java.lang.reflect.Field a;
public static Boolean b;
public static java.lang.reflect.Field c;
public static Boolean d;
public static java.util.WeakHashMap e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/WeakHashMap<", */
/* "Landroid/view/View;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static java.util.WeakHashMap f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/WeakHashMap<", */
/* "Landroid/view/View;", */
/* "Lc/h/n/c1;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static java.lang.reflect.Field g;
public static Boolean h;
public static java.lang.ThreadLocal i;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ThreadLocal<", */
/* "Landroid/graphics/Rect;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static c.h.n.v0 ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger; */
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
c.h.n.v0.h = (v0!= 0);
/* .line 4 */
v0 = c.h.n.a.a;
/* .line 5 */
/* new-instance v0, Lc/h/n/e0; */
/* invoke-direct {v0}, Lc/h/n/e0;-><init>()V */
return;
} // .end method
public static Boolean A ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.h0 .i ( p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Boolean B ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
c.h.n.v0 .a ( );
(( c.h.n.f0 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lc/h/n/f0;->b(Landroid/view/View;)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/Boolean; */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 2 */
p0 = (( java.lang.Boolean ) p0 ).booleanValue ( ); // invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
if ( p0 != null) { // if-eqz p0, :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Boolean C ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.k0 .b ( p0 );
/* .line 3 */
} // :cond_0
(( android.view.View ) p0 ).getWindowToken ( ); // invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
if ( p0 != null) { // if-eqz p0, :cond_1
int p0 = 1; // const/4 p0, 0x1
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Boolean D ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.k0 .c ( p0 );
/* .line 3 */
} // :cond_0
v0 = (( android.view.View ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/View;->getWidth()I
/* if-lez v0, :cond_1 */
p0 = (( android.view.View ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/View;->getHeight()I
/* if-lez p0, :cond_1 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Boolean E ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.n0 .j ( p0 );
/* .line 3 */
} // :cond_0
/* instance-of v0, p0, Lc/h/n/r; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
p0 = /* check-cast p0, Lc/h/n/r; */
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Boolean F ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.i0 .f ( p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Boolean G ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
c.h.n.v0 .d ( );
(( c.h.n.f0 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lc/h/n/f0;->b(Landroid/view/View;)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/Boolean; */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 2 */
p0 = (( java.lang.Boolean ) p0 ).booleanValue ( ); // invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
if ( p0 != null) { // if-eqz p0, :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static void H ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
c.h.n.h0 .j ( p0 );
/* .line 3 */
} // :cond_0
(( android.view.View ) p0 ).postInvalidate ( ); // invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V
} // :goto_0
return;
} // .end method
public static void I ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x14 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
c.h.n.l0 .a ( p0 );
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* .line 3 */
c.h.n.h0 .k ( p0 );
} // :cond_1
} // :goto_0
return;
} // .end method
public static void J ( android.view.View p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = c.h.n.v0 .m ( p0 );
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
c.h.n.v0 .g ( p0,v0 );
/* .line 3 */
} // :cond_0
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 4 */
} // :goto_0
/* instance-of v1, v0, Landroid/view/View; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 5 */
/* move-object v1, v0 */
/* check-cast v1, Landroid/view/View; */
v1 = c.h.n.v0 .m ( v1 );
int v2 = 4; // const/4 v2, 0x4
/* if-ne v1, v2, :cond_1 */
int v0 = 2; // const/4 v0, 0x2
/* .line 6 */
c.h.n.v0 .g ( p0,v0 );
/* .line 7 */
} // :cond_1
} // :cond_2
} // :goto_1
return;
} // .end method
public static void K ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
c.h.n.n0 .k ( p0 );
/* .line 3 */
} // :cond_0
/* instance-of v0, p0, Lc/h/n/r; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
/* check-cast p0, Lc/h/n/r; */
} // :cond_1
} // :goto_0
return;
} // .end method
public static void L ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( android.view.View ) p0 ).getTranslationY ( ); // invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F
/* const/high16 v1, 0x3f800000 # 1.0f */
/* add-float/2addr v1, v0 */
/* .line 2 */
(( android.view.View ) p0 ).setTranslationY ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/View;->setTranslationY(F)V
/* .line 3 */
(( android.view.View ) p0 ).setTranslationY ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V
return;
} // .end method
public static c.h.n.c1 a ( android.view.View p0 ) {
/* .locals 2 */
/* .line 13 */
v0 = c.h.n.v0.f;
/* if-nez v0, :cond_0 */
/* .line 14 */
/* new-instance v0, Ljava/util/WeakHashMap; */
/* invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V */
/* .line 15 */
} // :cond_0
v0 = c.h.n.v0.f;
(( java.util.WeakHashMap ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lc/h/n/c1; */
/* if-nez v0, :cond_1 */
/* .line 16 */
/* new-instance v0, Lc/h/n/c1; */
/* invoke-direct {v0, p0}, Lc/h/n/c1;-><init>(Landroid/view/View;)V */
/* .line 17 */
v1 = c.h.n.v0.f;
(( java.util.WeakHashMap ) v1 ).put ( p0, v0 ); // invoke-virtual {v1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_1
} // .end method
public static c.h.n.f0 a ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Lc/h/n/f0<", */
/* "Ljava/lang/Boolean;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 70 */
/* new-instance v0, Lc/h/n/d0; */
/* const-class v2, Ljava/lang/Boolean; */
/* const/16 v3, 0x1c */
/* invoke-direct {v0, v1, v2, v3}, Lc/h/n/d0;-><init>(ILjava/lang/Class;I)V */
} // .end method
public static c.h.n.u1 a ( android.view.View p0, c.h.n.u1 p1 ) {
/* .locals 2 */
/* .line 28 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 29 */
(( c.h.n.u1 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/h/n/u1;->k()Landroid/view/WindowInsets;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 30 */
c.h.n.l0 .a ( p0,v0 );
/* .line 31 */
v0 = (( android.view.WindowInsets ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
/* .line 32 */
c.h.n.u1 .a ( v1,p0 );
} // :cond_0
} // .end method
public static void a ( android.view.View p0, Float p1 ) {
/* .locals 2 */
/* .line 18 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 19 */
c.h.n.n0 .a ( p0,p1 );
} // :cond_0
return;
} // .end method
public static void a ( android.view.View p0, Integer p1 ) {
/* .locals 0 */
/* .line 58 */
(( android.view.View ) p0 ).offsetLeftAndRight ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->offsetLeftAndRight(I)V
/* .line 59 */
p1 = (( android.view.View ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Landroid/view/View;->getVisibility()I
/* if-nez p1, :cond_0 */
/* .line 60 */
c.h.n.v0 .L ( p0 );
/* .line 61 */
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 62 */
/* instance-of p1, p0, Landroid/view/View; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 63 */
/* check-cast p0, Landroid/view/View; */
c.h.n.v0 .L ( p0 );
} // :cond_0
return;
} // .end method
public static void a ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .line 66 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 67 */
c.h.n.o0 .a ( p0,p1,p2 );
} // :cond_0
return;
} // .end method
public static void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 2 */
/* .line 10 */
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_0 */
/* .line 11 */
c.h.n.i0 .a ( p0,p1,p2,p3,p4 );
/* .line 12 */
} // :cond_0
(( android.view.View ) p0 ).setPadding ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V
} // :goto_0
return;
} // .end method
public static void a ( android.view.View p0, android.content.res.ColorStateList p1 ) {
/* .locals 2 */
/* .line 36 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_3 */
/* .line 37 */
c.h.n.n0 .a ( p0,p1 );
/* .line 38 */
/* if-ne p1, v1, :cond_4 */
/* .line 39 */
(( android.view.View ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
/* .line 40 */
c.h.n.n0 .a ( p0 );
/* if-nez v0, :cond_1 */
/* .line 41 */
c.h.n.n0 .b ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
if ( p1 != null) { // if-eqz p1, :cond_4
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 42 */
v0 = (( android.graphics.drawable.Drawable ) p1 ).isStateful ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 43 */
(( android.view.View ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) p1 ).setState ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* .line 44 */
} // :cond_2
c.h.n.h0 .a ( p0,p1 );
/* .line 45 */
} // :cond_3
/* instance-of v0, p0, Lc/h/n/z; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 46 */
/* check-cast p0, Lc/h/n/z; */
} // :cond_4
} // :goto_2
return;
} // .end method
public static void a ( android.view.View p0, android.graphics.PorterDuff$Mode p1 ) {
/* .locals 2 */
/* .line 47 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_3 */
/* .line 48 */
c.h.n.n0 .a ( p0,p1 );
/* .line 49 */
/* if-ne p1, v1, :cond_4 */
/* .line 50 */
(( android.view.View ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
/* .line 51 */
c.h.n.n0 .a ( p0 );
/* if-nez v0, :cond_1 */
/* .line 52 */
c.h.n.n0 .b ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
if ( p1 != null) { // if-eqz p1, :cond_4
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 53 */
v0 = (( android.graphics.drawable.Drawable ) p1 ).isStateful ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 54 */
(( android.view.View ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) p1 ).setState ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* .line 55 */
} // :cond_2
c.h.n.h0 .a ( p0,p1 );
/* .line 56 */
} // :cond_3
/* instance-of v0, p0, Lc/h/n/z; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 57 */
/* check-cast p0, Lc/h/n/z; */
} // :cond_4
} // :goto_2
return;
} // .end method
public static void a ( android.view.View p0, android.graphics.Rect p1 ) {
/* .locals 2 */
/* .line 64 */
/* const/16 v1, 0x12 */
/* if-lt v0, v1, :cond_0 */
/* .line 65 */
c.h.n.j0 .a ( p0,p1 );
} // :cond_0
return;
} // .end method
public static void a ( android.view.View p0, android.graphics.drawable.Drawable p1 ) {
/* .locals 2 */
/* .line 33 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 34 */
c.h.n.h0 .a ( p0,p1 );
/* .line 35 */
} // :cond_0
(( android.view.View ) p0 ).setBackgroundDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
} // :goto_0
return;
} // .end method
public static void a ( android.view.View p0, Object p1 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* .line 1 */
c.h.n.v0 .c ( p0 );
/* instance-of v0, v0, Lc/h/n/c; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* new-instance p1, Lc/h/n/d; */
/* invoke-direct {p1}, Lc/h/n/d;-><init>()V */
} // :cond_0
/* if-nez p1, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
} // :cond_1
(( c.h.n.d ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/n/d;->a()Landroid/view/View$AccessibilityDelegate;
} // :goto_0
(( android.view.View ) p0 ).setAccessibilityDelegate ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V
return;
} // .end method
public static void a ( android.view.View p0, Object p1 ) {
/* .locals 2 */
/* .line 26 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 27 */
c.h.n.n0 .a ( p0,p1 );
} // :cond_0
return;
} // .end method
public static void a ( android.view.View p0, java.lang.Runnable p1 ) {
/* .locals 2 */
/* .line 4 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 5 */
c.h.n.h0 .a ( p0,p1 );
/* .line 6 */
} // :cond_0
android.animation.ValueAnimator .getFrameDelay ( );
/* move-result-wide v0 */
(( android.view.View ) p0 ).postDelayed ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
} // :goto_0
return;
} // .end method
public static void a ( android.view.View p0, java.lang.Runnable p1, Long p2 ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "LambdaLast" */
/* } */
} // .end annotation
/* .line 7 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 8 */
c.h.n.h0 .a ( p0,p1,p2,p3 );
/* .line 9 */
} // :cond_0
android.animation.ValueAnimator .getFrameDelay ( );
/* move-result-wide v0 */
/* add-long/2addr v0, p2 */
(( android.view.View ) p0 ).postDelayed ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
} // :goto_0
return;
} // .end method
public static void a ( android.view.View p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 20 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 21 */
c.h.n.n0 .a ( p0,p1 );
/* .line 22 */
} // :cond_0
v0 = c.h.n.v0.e;
/* if-nez v0, :cond_1 */
/* .line 23 */
/* new-instance v0, Ljava/util/WeakHashMap; */
/* invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V */
/* .line 24 */
} // :cond_1
v0 = c.h.n.v0.e;
(( java.util.WeakHashMap ) v0 ).put ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :goto_0
return;
} // .end method
public static void a ( android.view.View p0, Boolean p1 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 25 */
(( android.view.View ) p0 ).setFitsSystemWindows ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setFitsSystemWindows(Z)V
return;
} // .end method
public static Boolean a ( android.view.View p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
/* .line 68 */
/* const/16 v1, 0x1c */
/* if-lt v0, v1, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 69 */
} // :cond_0
c.h.n.u0 .a ( p0 );
p0 = (( c.h.n.u0 ) v0 ).a ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lc/h/n/u0;->a(Landroid/view/View;Landroid/view/KeyEvent;)Z
} // .end method
public static android.graphics.Rect b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = c.h.n.v0.i;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Ljava/lang/ThreadLocal; */
/* invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V */
/* .line 3 */
} // :cond_0
v0 = c.h.n.v0.i;
(( java.lang.ThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Rect; */
/* if-nez v0, :cond_1 */
/* .line 4 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
/* .line 5 */
v1 = c.h.n.v0.i;
(( java.lang.ThreadLocal ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
/* .line 6 */
} // :cond_1
(( android.graphics.Rect ) v0 ).setEmpty ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V
} // .end method
public static c.h.n.d b ( android.view.View p0 ) {
/* .locals 1 */
/* .line 7 */
c.h.n.v0 .c ( p0 );
/* if-nez p0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 8 */
} // :cond_0
/* instance-of v0, p0, Lc/h/n/c; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 9 */
/* check-cast p0, Lc/h/n/c; */
p0 = this.a;
/* .line 10 */
} // :cond_1
/* new-instance v0, Lc/h/n/d; */
/* invoke-direct {v0, p0}, Lc/h/n/d;-><init>(Landroid/view/View$AccessibilityDelegate;)V */
} // .end method
public static c.h.n.u1 b ( android.view.View p0, c.h.n.u1 p1 ) {
/* .locals 2 */
/* .line 13 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 14 */
(( c.h.n.u1 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/h/n/u1;->k()Landroid/view/WindowInsets;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 15 */
c.h.n.l0 .b ( p0,v0 );
/* .line 16 */
v0 = (( android.view.WindowInsets ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
/* .line 17 */
c.h.n.u1 .a ( v1,p0 );
} // :cond_0
} // .end method
public static void b ( android.view.View p0, Integer p1 ) {
/* .locals 0 */
/* .line 18 */
(( android.view.View ) p0 ).offsetTopAndBottom ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V
/* .line 19 */
p1 = (( android.view.View ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Landroid/view/View;->getVisibility()I
/* if-nez p1, :cond_0 */
/* .line 20 */
c.h.n.v0 .L ( p0 );
/* .line 21 */
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 22 */
/* instance-of p1, p0, Landroid/view/View; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 23 */
/* check-cast p0, Landroid/view/View; */
c.h.n.v0 .L ( p0 );
} // :cond_0
return;
} // .end method
public static void b ( android.view.View p0, Boolean p1 ) {
/* .locals 2 */
/* .line 11 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 12 */
c.h.n.h0 .a ( p0,p1 );
} // :cond_0
return;
} // .end method
public static Boolean b ( android.view.View p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
/* .line 24 */
/* const/16 v1, 0x1c */
/* if-lt v0, v1, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 25 */
} // :cond_0
c.h.n.u0 .a ( p0 );
p0 = (( c.h.n.u0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/n/u0;->a(Landroid/view/KeyEvent;)Z
} // .end method
public static android.view.View$AccessibilityDelegate c ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1d */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
c.h.n.r0 .a ( p0 );
/* .line 3 */
} // :cond_0
c.h.n.v0 .d ( p0 );
} // .end method
public static c.h.n.f0 c ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Lc/h/n/f0<", */
/* "Ljava/lang/CharSequence;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 4 */
/* new-instance v0, Lc/h/n/b0; */
/* const-class v2, Ljava/lang/CharSequence; */
/* const/16 v3, 0x8 */
/* const/16 v4, 0x1c */
/* invoke-direct {v0, v1, v2, v3, v4}, Lc/h/n/b0;-><init>(ILjava/lang/Class;II)V */
} // .end method
public static void c ( android.view.View p0, Integer p1 ) {
/* .locals 4 */
/* .line 5 */
(( android.view.View ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
final String v1 = "accessibility"; // const-string v1, "accessibility"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/accessibility/AccessibilityManager; */
/* .line 6 */
v1 = (( android.view.accessibility.AccessibilityManager ) v0 ).isEnabled ( ); // invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z
/* if-nez v1, :cond_0 */
return;
/* .line 7 */
} // :cond_0
c.h.n.v0 .f ( p0 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 8 */
v1 = (( android.view.View ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Landroid/view/View;->getVisibility()I
/* if-nez v1, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 9 */
} // :goto_0
v2 = c.h.n.v0 .e ( p0 );
/* const/16 v3, 0x20 */
/* if-nez v2, :cond_4 */
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_2
/* if-ne p1, v3, :cond_3 */
/* .line 10 */
android.view.accessibility.AccessibilityEvent .obtain ( );
/* .line 11 */
(( android.view.View ) p0 ).onInitializeAccessibilityEvent ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
/* .line 12 */
(( android.view.accessibility.AccessibilityEvent ) v1 ).setEventType ( v3 ); // invoke-virtual {v1, v3}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V
/* .line 13 */
c.h.n.k0 .a ( v1,p1 );
/* .line 14 */
(( android.view.accessibility.AccessibilityEvent ) v1 ).setSource ( p0 ); // invoke-virtual {v1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setSource(Landroid/view/View;)V
/* .line 15 */
(( android.view.View ) p0 ).onPopulateAccessibilityEvent ( v1 ); // invoke-virtual {p0, v1}, Landroid/view/View;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
/* .line 16 */
(( android.view.accessibility.AccessibilityEvent ) v1 ).getText ( ); // invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;
c.h.n.v0 .f ( p0 );
/* .line 17 */
(( android.view.accessibility.AccessibilityManager ) v0 ).sendAccessibilityEvent ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
/* .line 18 */
} // :cond_3
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 19 */
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 20 */
try { // :try_start_0
c.h.n.k0 .a ( v0,p0,p0,p1 );
/* :try_end_0 */
/* .catch Ljava/lang/AbstractMethodError; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 21 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) p0 ).getSimpleName ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = " does not fully implement ViewParent"; // const-string p0, " does not fully implement ViewParent"
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "ViewCompat"; // const-string v0, "ViewCompat"
android.util.Log .e ( v0,p0,p1 );
/* .line 22 */
} // :cond_4
} // :goto_1
android.view.accessibility.AccessibilityEvent .obtain ( );
if ( v1 != null) { // if-eqz v1, :cond_5
} // :cond_5
/* const/16 v3, 0x800 */
/* .line 23 */
} // :goto_2
(( android.view.accessibility.AccessibilityEvent ) v0 ).setEventType ( v3 ); // invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V
/* .line 24 */
c.h.n.k0 .a ( v0,p1 );
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 25 */
(( android.view.accessibility.AccessibilityEvent ) v0 ).getText ( ); // invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;
c.h.n.v0 .f ( p0 );
/* .line 26 */
c.h.n.v0 .J ( p0 );
/* .line 27 */
} // :cond_6
(( android.view.View ) p0 ).sendAccessibilityEventUnchecked ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/View;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V
} // :cond_7
} // :goto_3
return;
} // .end method
public static android.view.View$AccessibilityDelegate d ( android.view.View p0 ) {
/* .locals 4 */
/* .line 1 */
/* sget-boolean v0, Lc/h/n/v0;->h:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = c.h.n.v0.g;
int v2 = 1; // const/4 v2, 0x1
/* if-nez v0, :cond_1 */
/* .line 3 */
try { // :try_start_0
/* const-class v0, Landroid/view/View; */
final String v3 = "mAccessibilityDelegate"; // const-string v3, "mAccessibilityDelegate"
/* .line 4 */
(( java.lang.Class ) v0 ).getDeclaredField ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 5 */
(( java.lang.reflect.Field ) v0 ).setAccessible ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 6 */
/* :catchall_0 */
c.h.n.v0.h = (v2!= 0);
/* .line 7 */
} // :cond_1
} // :goto_0
try { // :try_start_1
v0 = c.h.n.v0.g;
(( java.lang.reflect.Field ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 8 */
/* instance-of v0, p0, Landroid/view/View$AccessibilityDelegate; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 9 */
/* check-cast p0, Landroid/view/View$AccessibilityDelegate; */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
} // :cond_2
/* .line 10 */
/* :catchall_1 */
c.h.n.v0.h = (v2!= 0);
} // .end method
public static c.h.n.f0 d ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Lc/h/n/f0<", */
/* "Ljava/lang/Boolean;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 27 */
/* new-instance v0, Lc/h/n/a0; */
/* const-class v2, Ljava/lang/Boolean; */
/* const/16 v3, 0x1c */
/* invoke-direct {v0, v1, v2, v3}, Lc/h/n/a0;-><init>(ILjava/lang/Class;I)V */
} // .end method
public static void d ( android.view.View p0, Integer p1 ) {
/* .locals 6 */
/* .line 11 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 12 */
(( android.view.View ) p0 ).offsetLeftAndRight ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->offsetLeftAndRight(I)V
} // :cond_0
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_2 */
/* .line 13 */
c.h.n.v0 .b ( );
int v1 = 0; // const/4 v1, 0x0
/* .line 14 */
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 15 */
/* instance-of v3, v2, Landroid/view/View; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 16 */
/* move-object v1, v2 */
/* check-cast v1, Landroid/view/View; */
/* .line 17 */
v3 = (( android.view.View ) v1 ).getLeft ( ); // invoke-virtual {v1}, Landroid/view/View;->getLeft()I
v4 = (( android.view.View ) v1 ).getTop ( ); // invoke-virtual {v1}, Landroid/view/View;->getTop()I
v5 = (( android.view.View ) v1 ).getRight ( ); // invoke-virtual {v1}, Landroid/view/View;->getRight()I
v1 = (( android.view.View ) v1 ).getBottom ( ); // invoke-virtual {v1}, Landroid/view/View;->getBottom()I
(( android.graphics.Rect ) v0 ).set ( v3, v4, v5, v1 ); // invoke-virtual {v0, v3, v4, v5, v1}, Landroid/graphics/Rect;->set(IIII)V
/* .line 18 */
v1 = (( android.view.View ) p0 ).getLeft ( ); // invoke-virtual {p0}, Landroid/view/View;->getLeft()I
v3 = (( android.view.View ) p0 ).getTop ( ); // invoke-virtual {p0}, Landroid/view/View;->getTop()I
/* .line 19 */
v4 = (( android.view.View ) p0 ).getRight ( ); // invoke-virtual {p0}, Landroid/view/View;->getRight()I
v5 = (( android.view.View ) p0 ).getBottom ( ); // invoke-virtual {p0}, Landroid/view/View;->getBottom()I
/* .line 20 */
v1 = (( android.graphics.Rect ) v0 ).intersects ( v1, v3, v4, v5 ); // invoke-virtual {v0, v1, v3, v4, v5}, Landroid/graphics/Rect;->intersects(IIII)Z
/* xor-int/lit8 v1, v1, 0x1 */
/* .line 21 */
} // :cond_1
c.h.n.v0 .a ( p0,p1 );
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 22 */
p1 = (( android.view.View ) p0 ).getLeft ( ); // invoke-virtual {p0}, Landroid/view/View;->getLeft()I
v1 = (( android.view.View ) p0 ).getTop ( ); // invoke-virtual {p0}, Landroid/view/View;->getTop()I
/* .line 23 */
v3 = (( android.view.View ) p0 ).getRight ( ); // invoke-virtual {p0}, Landroid/view/View;->getRight()I
p0 = (( android.view.View ) p0 ).getBottom ( ); // invoke-virtual {p0}, Landroid/view/View;->getBottom()I
/* .line 24 */
p0 = (( android.graphics.Rect ) v0 ).intersect ( p1, v1, v3, p0 ); // invoke-virtual {v0, p1, v1, v3, p0}, Landroid/graphics/Rect;->intersect(IIII)Z
if ( p0 != null) { // if-eqz p0, :cond_3
/* .line 25 */
/* check-cast v2, Landroid/view/View; */
(( android.view.View ) v2 ).invalidate ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V
/* .line 26 */
} // :cond_2
c.h.n.v0 .a ( p0,p1 );
} // :cond_3
} // :goto_0
return;
} // .end method
public static Integer e ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.k0 .a ( p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static c.h.n.f0 e ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Lc/h/n/f0<", */
/* "Ljava/lang/CharSequence;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 19 */
/* new-instance v0, Lc/h/n/c0; */
/* const-class v2, Ljava/lang/CharSequence; */
/* const/16 v3, 0x40 */
/* const/16 v4, 0x1e */
/* invoke-direct {v0, v1, v2, v3, v4}, Lc/h/n/c0;-><init>(ILjava/lang/Class;II)V */
} // .end method
public static void e ( android.view.View p0, Integer p1 ) {
/* .locals 6 */
/* .line 3 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 4 */
(( android.view.View ) p0 ).offsetTopAndBottom ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V
} // :cond_0
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_2 */
/* .line 5 */
c.h.n.v0 .b ( );
int v1 = 0; // const/4 v1, 0x0
/* .line 6 */
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 7 */
/* instance-of v3, v2, Landroid/view/View; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 8 */
/* move-object v1, v2 */
/* check-cast v1, Landroid/view/View; */
/* .line 9 */
v3 = (( android.view.View ) v1 ).getLeft ( ); // invoke-virtual {v1}, Landroid/view/View;->getLeft()I
v4 = (( android.view.View ) v1 ).getTop ( ); // invoke-virtual {v1}, Landroid/view/View;->getTop()I
v5 = (( android.view.View ) v1 ).getRight ( ); // invoke-virtual {v1}, Landroid/view/View;->getRight()I
v1 = (( android.view.View ) v1 ).getBottom ( ); // invoke-virtual {v1}, Landroid/view/View;->getBottom()I
(( android.graphics.Rect ) v0 ).set ( v3, v4, v5, v1 ); // invoke-virtual {v0, v3, v4, v5, v1}, Landroid/graphics/Rect;->set(IIII)V
/* .line 10 */
v1 = (( android.view.View ) p0 ).getLeft ( ); // invoke-virtual {p0}, Landroid/view/View;->getLeft()I
v3 = (( android.view.View ) p0 ).getTop ( ); // invoke-virtual {p0}, Landroid/view/View;->getTop()I
/* .line 11 */
v4 = (( android.view.View ) p0 ).getRight ( ); // invoke-virtual {p0}, Landroid/view/View;->getRight()I
v5 = (( android.view.View ) p0 ).getBottom ( ); // invoke-virtual {p0}, Landroid/view/View;->getBottom()I
/* .line 12 */
v1 = (( android.graphics.Rect ) v0 ).intersects ( v1, v3, v4, v5 ); // invoke-virtual {v0, v1, v3, v4, v5}, Landroid/graphics/Rect;->intersects(IIII)Z
/* xor-int/lit8 v1, v1, 0x1 */
/* .line 13 */
} // :cond_1
c.h.n.v0 .b ( p0,p1 );
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 14 */
p1 = (( android.view.View ) p0 ).getLeft ( ); // invoke-virtual {p0}, Landroid/view/View;->getLeft()I
v1 = (( android.view.View ) p0 ).getTop ( ); // invoke-virtual {p0}, Landroid/view/View;->getTop()I
/* .line 15 */
v3 = (( android.view.View ) p0 ).getRight ( ); // invoke-virtual {p0}, Landroid/view/View;->getRight()I
p0 = (( android.view.View ) p0 ).getBottom ( ); // invoke-virtual {p0}, Landroid/view/View;->getBottom()I
/* .line 16 */
p0 = (( android.graphics.Rect ) v0 ).intersect ( p1, v1, v3, p0 ); // invoke-virtual {v0, p1, v1, v3, p0}, Landroid/graphics/Rect;->intersect(IIII)Z
if ( p0 != null) { // if-eqz p0, :cond_3
/* .line 17 */
/* check-cast v2, Landroid/view/View; */
(( android.view.View ) v2 ).invalidate ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V
/* .line 18 */
} // :cond_2
c.h.n.v0 .b ( p0,p1 );
} // :cond_3
} // :goto_0
return;
} // .end method
public static java.lang.CharSequence f ( android.view.View p0 ) {
/* .locals 1 */
/* .line 3 */
c.h.n.v0 .c ( );
(( c.h.n.f0 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lc/h/n/f0;->b(Landroid/view/View;)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/CharSequence; */
} // .end method
public static void f ( android.view.View p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
c.h.n.k0 .a ( p0,p1 );
} // :cond_0
return;
} // .end method
public static android.content.res.ColorStateList g ( android.view.View p0 ) {
/* .locals 2 */
/* .line 4 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 5 */
c.h.n.n0 .a ( p0 );
/* .line 6 */
} // :cond_0
/* instance-of v0, p0, Lc/h/n/z; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
/* check-cast p0, Lc/h/n/z; */
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static void g ( android.view.View p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
c.h.n.h0 .a ( p0,p1 );
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_2 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_1 */
int p1 = 2; // const/4 p1, 0x2
/* .line 3 */
} // :cond_1
c.h.n.h0 .a ( p0,p1 );
} // :cond_2
} // :goto_0
return;
} // .end method
public static android.graphics.PorterDuff$Mode h ( android.view.View p0 ) {
/* .locals 2 */
/* .line 3 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 4 */
c.h.n.n0 .b ( p0 );
/* .line 5 */
} // :cond_0
/* instance-of v0, p0, Lc/h/n/z; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
/* check-cast p0, Lc/h/n/z; */
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static void h ( android.view.View p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1a */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
c.h.n.p0 .a ( p0,p1 );
} // :cond_0
return;
} // .end method
public static android.graphics.Rect i ( android.view.View p0 ) {
/* .locals 2 */
/* .line 4 */
/* const/16 v1, 0x12 */
/* if-lt v0, v1, :cond_0 */
/* .line 5 */
c.h.n.j0 .a ( p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static void i ( android.view.View p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p0, Lc/h/n/p; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p0, Lc/h/n/p; */
} // :cond_0
/* if-nez p1, :cond_1 */
/* .line 3 */
c.h.n.v0 .K ( p0 );
} // :cond_1
} // :goto_0
return;
} // .end method
public static android.view.Display j ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
c.h.n.i0 .a ( p0 );
/* .line 3 */
} // :cond_0
v0 = c.h.n.v0 .C ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
(( android.view.View ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
final String v0 = "window"; // const-string v0, "window"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p0, Landroid/view/WindowManager; */
/* .line 5 */
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Float k ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.n0 .c ( p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Boolean l ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.h0 .b ( p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Integer m ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.h0 .c ( p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Integer n ( android.view.View p0 ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "InlinedApi" */
/* } */
} // .end annotation
/* .line 1 */
/* const/16 v1, 0x1a */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.p0 .a ( p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Integer o ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.i0 .c ( p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Integer p ( android.view.View p0 ) {
/* .locals 3 */
/* .line 1 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.h0 .d ( p0 );
/* .line 3 */
} // :cond_0
/* sget-boolean v0, Lc/h/n/v0;->d:Z */
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
try { // :try_start_0
/* const-class v1, Landroid/view/View; */
final String v2 = "mMinHeight"; // const-string v2, "mMinHeight"
(( java.lang.Class ) v1 ).getDeclaredField ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 5 */
(( java.lang.reflect.Field ) v1 ).setAccessible ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 6 */
/* :catch_0 */
c.h.n.v0.d = (v0!= 0);
/* .line 7 */
} // :cond_1
v0 = c.h.n.v0.c;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 8 */
try { // :try_start_1
(( java.lang.reflect.Field ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/Integer; */
p0 = (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
} // :cond_2
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Integer q ( android.view.View p0 ) {
/* .locals 3 */
/* .line 1 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.h0 .e ( p0 );
/* .line 3 */
} // :cond_0
/* sget-boolean v0, Lc/h/n/v0;->b:Z */
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
try { // :try_start_0
/* const-class v1, Landroid/view/View; */
final String v2 = "mMinWidth"; // const-string v2, "mMinWidth"
(( java.lang.Class ) v1 ).getDeclaredField ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 5 */
(( java.lang.reflect.Field ) v1 ).setAccessible ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 6 */
/* :catch_0 */
c.h.n.v0.b = (v0!= 0);
/* .line 7 */
} // :cond_1
v0 = c.h.n.v0.a;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 8 */
try { // :try_start_1
(( java.lang.reflect.Field ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/Integer; */
p0 = (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
} // :cond_2
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Integer r ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.i0 .d ( p0 );
/* .line 3 */
} // :cond_0
p0 = (( android.view.View ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I
} // .end method
public static Integer s ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.i0 .e ( p0 );
/* .line 3 */
} // :cond_0
p0 = (( android.view.View ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I
} // .end method
public static c.h.n.u1 t ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
c.h.n.o0 .a ( p0 );
} // :cond_0
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_1 */
/* .line 3 */
c.h.n.n0 .d ( p0 );
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.lang.CharSequence u ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
c.h.n.v0 .e ( );
(( c.h.n.f0 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lc/h/n/f0;->b(Landroid/view/View;)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/CharSequence; */
} // .end method
public static java.lang.String v ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
c.h.n.n0 .e ( p0 );
/* .line 3 */
} // :cond_0
v0 = c.h.n.v0.e;
/* if-nez v0, :cond_1 */
int p0 = 0; // const/4 p0, 0x0
/* .line 4 */
} // :cond_1
(( java.util.WeakHashMap ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/String; */
} // .end method
public static Integer w ( android.view.View p0 ) {
/* .locals 2 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.h0 .g ( p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Float x ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.n0 .g ( p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Boolean y ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0xf */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.g0 .a ( p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Boolean z ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = c.h.n.h0 .h ( p0 );
} // :cond_0
int p0 = 1; // const/4 p0, 0x1
} // .end method
