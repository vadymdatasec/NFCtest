public class c.h.n.m1 extends c.h.n.r1 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static Boolean h;
	 public static java.lang.reflect.Method i;
	 public static java.lang.Class j;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
public static java.lang.reflect.Field k;
public static java.lang.reflect.Field l;
/* # instance fields */
public final android.view.WindowInsets c;
public c.h.g.b d;
public c.h.g.b e;
public c.h.n.u1 f;
public c.h.g.b g;
/* # direct methods */
public static c.h.n.m1 ( ) {
/* .locals 0 */
return;
} // .end method
public c.h.n.m1 ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1}, Lc/h/n/r1;-><init>(Lc/h/n/u1;)V */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
this.e = p1;
/* .line 3 */
this.c = p2;
return;
} // .end method
public c.h.n.m1 ( ) {
/* .locals 1 */
/* .line 4 */
/* new-instance v0, Landroid/view/WindowInsets; */
p2 = this.c;
/* invoke-direct {v0, p2}, Landroid/view/WindowInsets;-><init>(Landroid/view/WindowInsets;)V */
/* invoke-direct {p0, p1, v0}, Lc/h/n/m1;-><init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V */
return;
} // .end method
public static void m ( ) {
/* .locals 4 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "PrivateApi" */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
try { // :try_start_0
/* const-class v1, Landroid/view/View; */
final String v2 = "getViewRootImpl"; // const-string v2, "getViewRootImpl"
int v3 = 0; // const/4 v3, 0x0
/* new-array v3, v3, [Ljava/lang/Class; */
(( java.lang.Class ) v1 ).getDeclaredMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
final String v1 = "android.view.View$AttachInfo"; // const-string v1, "android.view.View$AttachInfo"
/* .line 2 */
java.lang.Class .forName ( v1 );
final String v2 = "mVisibleInsets"; // const-string v2, "mVisibleInsets"
/* .line 3 */
(( java.lang.Class ) v1 ).getDeclaredField ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
final String v1 = "android.view.ViewRootImpl"; // const-string v1, "android.view.ViewRootImpl"
/* .line 4 */
java.lang.Class .forName ( v1 );
final String v2 = "mAttachInfo"; // const-string v2, "mAttachInfo"
/* .line 5 */
(( java.lang.Class ) v1 ).getDeclaredField ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 6 */
v1 = c.h.n.m1.k;
(( java.lang.reflect.Field ) v1 ).setAccessible ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* .line 7 */
v1 = c.h.n.m1.l;
(( java.lang.reflect.Field ) v1 ).setAccessible ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* :try_end_0 */
/* .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
/* .line 8 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Failed to get visible insets.(Reflection error)."; // const-string v3, "Failed to get visible insets.(Reflection error)."
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.ReflectiveOperationException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/ReflectiveOperationException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v3 = "WindowInsetsCompat"; // const-string v3, "WindowInsetsCompat"
android.util.Log .e ( v3,v2,v1 );
/* .line 9 */
} // :goto_0
c.h.n.m1.h = (v0!= 0);
return;
} // .end method
/* # virtual methods */
public c.h.g.b a ( Integer p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( c.h.n.m1 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/h/n/m1;->a(IZ)Lc/h/g/b;
} // .end method
public final c.h.g.b a ( Integer p0, Boolean p1 ) {
/* .locals 3 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "WrongConstant" */
/* } */
} // .end annotation
/* .line 2 */
v0 = c.h.g.b.e;
int v1 = 1; // const/4 v1, 0x1
} // :goto_0
/* const/16 v2, 0x100 */
/* if-gt v1, v2, :cond_1 */
/* and-int v2, p1, v1 */
/* if-nez v2, :cond_0 */
/* .line 3 */
} // :cond_0
(( c.h.n.m1 ) p0 ).b ( v1, p2 ); // invoke-virtual {p0, v1, p2}, Lc/h/n/m1;->b(IZ)Lc/h/g/b;
c.h.g.b .a ( v0,v2 );
} // :goto_1
/* shl-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 0 */
/* .line 7 */
(( c.h.n.m1 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/h/n/m1;->b(Landroid/view/View;)Lc/h/g/b;
/* if-nez p1, :cond_0 */
/* .line 8 */
p1 = c.h.g.b.e;
/* .line 9 */
} // :cond_0
(( c.h.n.m1 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/n/m1;->a(Lc/h/g/b;)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
/* .line 6 */
this.g = p1;
return;
} // .end method
public void a ( c.h.n.u1 p0 ) {
/* .locals 1 */
/* .line 4 */
v0 = this.f;
(( c.h.n.u1 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/h/n/u1;->a(Lc/h/n/u1;)V
/* .line 5 */
v0 = this.g;
(( c.h.n.u1 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/h/n/u1;->a(Lc/h/g/b;)V
return;
} // .end method
public void a ( Object[] p0 ) {
/* .locals 0 */
/* .line 10 */
this.d = p1;
return;
} // .end method
public c.h.g.b b ( Integer p0, Boolean p1 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* if-eq p1, v0, :cond_f */
int v0 = 2; // const/4 v0, 0x2
int v2 = 0; // const/4 v2, 0x0
/* if-eq p1, v0, :cond_b */
/* const/16 p2, 0x8 */
/* if-eq p1, p2, :cond_6 */
/* const/16 p2, 0x10 */
/* if-eq p1, p2, :cond_5 */
/* const/16 p2, 0x20 */
/* if-eq p1, p2, :cond_4 */
/* const/16 p2, 0x40 */
/* if-eq p1, p2, :cond_3 */
/* const/16 p2, 0x80 */
/* if-eq p1, p2, :cond_0 */
/* .line 1 */
p1 = c.h.g.b.e;
/* .line 2 */
} // :cond_0
p1 = this.f;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 3 */
(( c.h.n.u1 ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/n/u1;->d()Lc/h/n/h;
/* .line 4 */
} // :cond_1
(( c.h.n.r1 ) p0 ).d ( ); // invoke-virtual {p0}, Lc/h/n/r1;->d()Lc/h/n/h;
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 5 */
p2 = (( c.h.n.h ) p1 ).b ( ); // invoke-virtual {p1}, Lc/h/n/h;->b()I
v0 = (( c.h.n.h ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/n/h;->d()I
/* .line 6 */
v1 = (( c.h.n.h ) p1 ).c ( ); // invoke-virtual {p1}, Lc/h/n/h;->c()I
p1 = (( c.h.n.h ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/n/h;->a()I
/* .line 7 */
c.h.g.b .a ( p2,v0,v1,p1 );
/* .line 8 */
} // :cond_2
p1 = c.h.g.b.e;
/* .line 9 */
} // :cond_3
(( c.h.n.r1 ) p0 ).i ( ); // invoke-virtual {p0}, Lc/h/n/r1;->i()Lc/h/g/b;
/* .line 10 */
} // :cond_4
(( c.h.n.r1 ) p0 ).e ( ); // invoke-virtual {p0}, Lc/h/n/r1;->e()Lc/h/g/b;
/* .line 11 */
} // :cond_5
(( c.h.n.r1 ) p0 ).g ( ); // invoke-virtual {p0}, Lc/h/n/r1;->g()Lc/h/g/b;
/* .line 12 */
} // :cond_6
p1 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_7
/* .line 13 */
p2 = c.h.n.s1 .a ( p2 );
/* aget-object v2, p1, p2 */
} // :cond_7
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 14 */
} // :cond_8
(( c.h.n.m1 ) p0 ).h ( ); // invoke-virtual {p0}, Lc/h/n/m1;->h()Lc/h/g/b;
/* .line 15 */
(( c.h.n.m1 ) p0 ).l ( ); // invoke-virtual {p0}, Lc/h/n/m1;->l()Lc/h/g/b;
/* .line 16 */
/* iget p1, p1, Lc/h/g/b;->d:I */
/* iget v0, p2, Lc/h/g/b;->d:I */
/* if-le p1, v0, :cond_9 */
/* .line 17 */
c.h.g.b .a ( v1,v1,v1,p1 );
/* .line 18 */
} // :cond_9
p1 = this.g;
if ( p1 != null) { // if-eqz p1, :cond_a
v0 = c.h.g.b.e;
/* .line 19 */
p1 = (( c.h.g.b ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Lc/h/g/b;->equals(Ljava/lang/Object;)Z
/* if-nez p1, :cond_a */
/* .line 20 */
p1 = this.g;
/* iget p1, p1, Lc/h/g/b;->d:I */
/* iget p2, p2, Lc/h/g/b;->d:I */
/* if-le p1, p2, :cond_a */
/* .line 21 */
c.h.g.b .a ( v1,v1,v1,p1 );
/* .line 22 */
} // :cond_a
p1 = c.h.g.b.e;
} // :cond_b
if ( p2 != null) { // if-eqz p2, :cond_c
/* .line 23 */
(( c.h.n.m1 ) p0 ).l ( ); // invoke-virtual {p0}, Lc/h/n/m1;->l()Lc/h/g/b;
/* .line 24 */
(( c.h.n.r1 ) p0 ).f ( ); // invoke-virtual {p0}, Lc/h/n/r1;->f()Lc/h/g/b;
/* .line 25 */
/* iget v0, p1, Lc/h/g/b;->a:I */
/* iget v2, p2, Lc/h/g/b;->a:I */
/* .line 26 */
v0 = java.lang.Math .max ( v0,v2 );
/* iget v2, p1, Lc/h/g/b;->c:I */
/* iget v3, p2, Lc/h/g/b;->c:I */
/* .line 27 */
v2 = java.lang.Math .max ( v2,v3 );
/* iget p1, p1, Lc/h/g/b;->d:I */
/* iget p2, p2, Lc/h/g/b;->d:I */
/* .line 28 */
p1 = java.lang.Math .max ( p1,p2 );
/* .line 29 */
c.h.g.b .a ( v0,v1,v2,p1 );
/* .line 30 */
} // :cond_c
(( c.h.n.m1 ) p0 ).h ( ); // invoke-virtual {p0}, Lc/h/n/m1;->h()Lc/h/g/b;
/* .line 31 */
p2 = this.f;
if ( p2 != null) { // if-eqz p2, :cond_d
/* .line 32 */
(( c.h.n.u1 ) p2 ).e ( ); // invoke-virtual {p2}, Lc/h/n/u1;->e()Lc/h/g/b;
/* .line 33 */
} // :cond_d
/* iget p2, p1, Lc/h/g/b;->d:I */
if ( v2 != null) { // if-eqz v2, :cond_e
/* .line 34 */
/* iget v0, v2, Lc/h/g/b;->d:I */
p2 = java.lang.Math .min ( p2,v0 );
/* .line 35 */
} // :cond_e
/* iget v0, p1, Lc/h/g/b;->a:I */
/* iget p1, p1, Lc/h/g/b;->c:I */
c.h.g.b .a ( v0,v1,p1,p2 );
} // :cond_f
if ( p2 != null) { // if-eqz p2, :cond_10
/* .line 36 */
(( c.h.n.m1 ) p0 ).l ( ); // invoke-virtual {p0}, Lc/h/n/m1;->l()Lc/h/g/b;
/* .line 37 */
/* iget p1, p1, Lc/h/g/b;->b:I */
/* .line 38 */
(( c.h.n.m1 ) p0 ).h ( ); // invoke-virtual {p0}, Lc/h/n/m1;->h()Lc/h/g/b;
/* iget p2, p2, Lc/h/g/b;->b:I */
p1 = java.lang.Math .max ( p1,p2 );
/* .line 39 */
c.h.g.b .a ( v1,p1,v1,v1 );
/* .line 40 */
} // :cond_10
(( c.h.n.m1 ) p0 ).h ( ); // invoke-virtual {p0}, Lc/h/n/m1;->h()Lc/h/g/b;
/* iget p1, p1, Lc/h/g/b;->b:I */
c.h.g.b .a ( v1,p1,v1,v1 );
} // .end method
public final c.h.g.b b ( android.view.View p0 ) {
/* .locals 4 */
final String v0 = "WindowInsetsCompat"; // const-string v0, "WindowInsetsCompat"
/* .line 42 */
/* const/16 v2, 0x1e */
/* if-ge v1, v2, :cond_5 */
/* .line 43 */
/* sget-boolean v1, Lc/h/n/m1;->h:Z */
/* if-nez v1, :cond_0 */
/* .line 44 */
c.h.n.m1 .m ( );
/* .line 45 */
} // :cond_0
v1 = c.h.n.m1.i;
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_4
v3 = c.h.n.m1.j;
if ( v3 != null) { // if-eqz v3, :cond_4
v3 = c.h.n.m1.k;
/* if-nez v3, :cond_1 */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
try { // :try_start_0
/* new-array v3, v3, [Ljava/lang/Object; */
/* .line 46 */
(( java.lang.reflect.Method ) v1 ).invoke ( p1, v3 ); // invoke-virtual {v1, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* if-nez p1, :cond_2 */
final String p1 = "Failed to get visible insets.getViewRootImpl() returned null from the provided view.This means that the view is either not attached or the method has been overridden"; // const-string p1, "Failed to get visible insets.getViewRootImpl() returned null from the provided view.This means that the view is either not attached or the method has been overridden"
/* .line 47 */
/* new-instance v1, Ljava/lang/NullPointerException; */
/* invoke-direct {v1}, Ljava/lang/NullPointerException;-><init>()V */
android.util.Log .w ( v0,p1,v1 );
/* .line 48 */
} // :cond_2
v1 = c.h.n.m1.l;
(( java.lang.reflect.Field ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 49 */
v1 = c.h.n.m1.k;
(( java.lang.reflect.Field ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Landroid/graphics/Rect; */
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 50 */
c.h.g.b .a ( p1 );
/* :try_end_0 */
/* .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_3
/* :catch_0 */
/* move-exception p1 */
/* .line 51 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Failed to get visible insets.(Reflection error)."; // const-string v3, "Failed to get visible insets.(Reflection error)."
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 52 */
(( java.lang.ReflectiveOperationException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/ReflectiveOperationException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 53 */
android.util.Log .e ( v0,v1,p1 );
} // :cond_4
} // :goto_0
/* .line 54 */
} // :cond_5
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
final String v0 = "getVisibleInsets() should not be called on API >= 30.Use WindowInsets.isVisible() instead."; // const-string v0, "getVisibleInsets() should not be called on API >= 30.Use WindowInsets.isVisible() instead."
/* invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void b ( c.h.n.u1 p0 ) {
/* .locals 0 */
/* .line 41 */
this.f = p1;
return;
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0, p1}, Lc/h/n/r1;->equals(Ljava/lang/Object;)Z */
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
/* check-cast p1, Lc/h/n/m1; */
/* .line 3 */
v0 = this.g;
p1 = this.g;
p1 = java.util.Objects .equals ( v0,p1 );
} // .end method
public final c.h.g.b h ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.e;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.c;
/* .line 3 */
v0 = (( android.view.WindowInsets ) v0 ).getSystemWindowInsetLeft ( ); // invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I
v1 = this.c;
/* .line 4 */
v1 = (( android.view.WindowInsets ) v1 ).getSystemWindowInsetTop ( ); // invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
v2 = this.c;
/* .line 5 */
v2 = (( android.view.WindowInsets ) v2 ).getSystemWindowInsetRight ( ); // invoke-virtual {v2}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I
v3 = this.c;
/* .line 6 */
v3 = (( android.view.WindowInsets ) v3 ).getSystemWindowInsetBottom ( ); // invoke-virtual {v3}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
/* .line 7 */
c.h.g.b .a ( v0,v1,v2,v3 );
this.e = v0;
/* .line 8 */
} // :cond_0
v0 = this.e;
} // .end method
public Boolean k ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
v0 = (( android.view.WindowInsets ) v0 ).isRound ( ); // invoke-virtual {v0}, Landroid/view/WindowInsets;->isRound()Z
} // .end method
public final c.h.g.b l ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.h.n.u1 ) v0 ).e ( ); // invoke-virtual {v0}, Lc/h/n/u1;->e()Lc/h/g/b;
/* .line 3 */
} // :cond_0
v0 = c.h.g.b.e;
} // .end method
