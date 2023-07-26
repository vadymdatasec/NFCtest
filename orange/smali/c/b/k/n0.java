public class c.b.k.n0 extends c.b.k.t implements c.b.p.o.m$a implements android.view.LayoutInflater$Factory2 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.util.Map b0;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/Class<", */
	 /* "*>;", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final Boolean c0;
public static final d0;
public static Boolean e0;
public static final Boolean f0;
/* # instance fields */
public Boolean A;
public Boolean B;
public Boolean C;
public Boolean D;
public Boolean E;
public Boolean F;
public Boolean G;
public c.b.k.l0 H;
public c.b.k.l0 I;
public Boolean J;
public Boolean K;
public Boolean L;
public Boolean M;
public Boolean N;
public Integer O;
public Integer P;
public Boolean Q;
public Boolean R;
public c.b.k.i0 S;
public c.b.k.i0 T;
public Boolean U;
public Integer V;
public final java.lang.Runnable W;
public Boolean X;
public android.graphics.Rect Y;
public android.graphics.Rect Z;
public androidx.appcompat.app.AppCompatViewInflater a0;
public final java.lang.Object e;
public final android.content.Context f;
public android.view.Window g;
public c.b.k.f0 h;
public final c.b.k.s i;
public c.b.k.a j;
public android.view.MenuInflater k;
public java.lang.CharSequence l;
public c.b.q.y0 m;
public c.b.k.c0 n;
public c.b.k.m0 o;
public c.b.p.c p;
public androidx.appcompat.widget.ActionBarContextView q;
public android.widget.PopupWindow r;
public java.lang.Runnable s;
public c.h.n.c1 t;
public Boolean u;
public Boolean v;
public android.view.ViewGroup w;
public android.widget.TextView x;
public android.view.View y;
public Boolean z;
/* # direct methods */
public static c.b.k.n0 ( ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Lc/e/b; */
/* invoke-direct {v0}, Lc/e/b;-><init>()V */
/* .line 2 */
/* const/16 v1, 0x15 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* if-ge v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
c.b.k.n0.c0 = (v0!= 0);
/* new-array v0, v3, [I */
/* const v4, 0x1010054 */
/* aput v4, v0, v2 */
/* .line 3 */
/* .line 4 */
/* if-lt v0, v1, :cond_1 */
/* const/16 v1, 0x19 */
/* if-gt v0, v1, :cond_1 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_1
c.b.k.n0.f0 = (v2!= 0);
/* .line 5 */
/* sget-boolean v0, Lc/b/k/n0;->c0:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* sget-boolean v0, Lc/b/k/n0;->e0:Z */
/* if-nez v0, :cond_2 */
/* .line 6 */
java.lang.Thread .getDefaultUncaughtExceptionHandler ( );
/* .line 7 */
/* new-instance v1, Lc/b/k/u; */
/* invoke-direct {v1, v0}, Lc/b/k/u;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V */
java.lang.Thread .setDefaultUncaughtExceptionHandler ( v1 );
/* .line 8 */
c.b.k.n0.e0 = (v3!= 0);
} // :cond_2
return;
} // .end method
public c.b.k.n0 ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, v0, p2, p1}, Lc/b/k/n0;-><init>(Landroid/content/Context;Landroid/view/Window;Lc/b/k/s;Ljava/lang/Object;)V */
return;
} // .end method
public c.b.k.n0 ( ) {
/* .locals 2 */
/* .line 2 */
(( android.app.Dialog ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;
(( android.app.Dialog ) p1 ).getWindow ( ); // invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
/* invoke-direct {p0, v0, v1, p2, p1}, Lc/b/k/n0;-><init>(Landroid/content/Context;Landroid/view/Window;Lc/b/k/s;Ljava/lang/Object;)V */
return;
} // .end method
public c.b.k.n0 ( ) {
/* .locals 2 */
/* .line 3 */
/* invoke-direct {p0}, Lc/b/k/t;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
this.t = v0;
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
/* iput-boolean v0, p0, Lc/b/k/n0;->u:Z */
/* const/16 v0, -0x64 */
/* .line 6 */
/* iput v0, p0, Lc/b/k/n0;->O:I */
/* .line 7 */
/* new-instance v1, Lc/b/k/v; */
/* invoke-direct {v1, p0}, Lc/b/k/v;-><init>(Lc/b/k/n0;)V */
this.W = v1;
/* .line 8 */
this.f = p1;
/* .line 9 */
this.i = p3;
/* .line 10 */
this.e = p4;
/* .line 11 */
/* iget p1, p0, Lc/b/k/n0;->O:I */
/* if-ne p1, v0, :cond_0 */
/* instance-of p1, p4, Landroid/app/Dialog; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 12 */
(( c.b.k.n0 ) p0 ).F ( ); // invoke-virtual {p0}, Lc/b/k/n0;->F()Lc/b/k/r;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 13 */
(( c.b.k.r ) p1 ).o ( ); // invoke-virtual {p1}, Lc/b/k/r;->o()Lc/b/k/t;
p1 = (( c.b.k.t ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/k/t;->a()I
/* iput p1, p0, Lc/b/k/n0;->O:I */
/* .line 14 */
} // :cond_0
/* iget p1, p0, Lc/b/k/n0;->O:I */
/* if-ne p1, v0, :cond_1 */
/* .line 15 */
p1 = c.b.k.n0.b0;
p3 = this.e;
(( java.lang.Object ) p3 ).getClass ( ); // invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* check-cast p1, Ljava/lang/Integer; */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 16 */
p1 = (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
/* iput p1, p0, Lc/b/k/n0;->O:I */
/* .line 17 */
p1 = c.b.k.n0.b0;
p3 = this.e;
(( java.lang.Object ) p3 ).getClass ( ); // invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 18 */
(( c.b.k.n0 ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/k/n0;->a(Landroid/view/Window;)V
/* .line 19 */
} // :cond_2
c.b.q.s .c ( );
return;
} // .end method
/* # virtual methods */
public Boolean A ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/k/n0;->u:Z */
} // .end method
public Boolean B ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.p;
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.p.c ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/c;->a()V
/* .line 3 */
} // :cond_0
(( c.b.k.n0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
v0 = (( c.b.k.a ) v0 ).f ( ); // invoke-virtual {v0}, Lc/b/k/a;->f()Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final c.b.k.a C ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
} // .end method
public final Boolean D ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/k/n0;->v:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.w;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = 	 c.h.n.v0 .D ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final void E ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/k/n0;->v:Z */
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* new-instance v0, Landroid/util/AndroidRuntimeException; */
final String v1 = "Window feature must be requested before adding content"; // const-string v1, "Window feature must be requested before adding content"
/* invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final c.b.k.r F ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.f;
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
/* instance-of v2, v0, Lc/b/k/r; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 3 */
/* check-cast v0, Lc/b/k/r; */
/* .line 4 */
} // :cond_0
/* instance-of v2, v0, Landroid/content/ContextWrapper; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 5 */
/* check-cast v0, Landroid/content/ContextWrapper; */
(( android.content.ContextWrapper ) v0 ).getBaseContext ( ); // invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;
} // :cond_1
} // .end method
public Integer a ( ) {
/* .locals 1 */
/* .line 216 */
/* iget v0, p0, Lc/b/k/n0;->O:I */
} // .end method
public android.view.View a ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Landroid/view/View;", */
/* ">(I)TT;" */
/* } */
} // .end annotation
/* .line 24 */
(( c.b.k.n0 ) p0 ).r ( ); // invoke-virtual {p0}, Lc/b/k/n0;->r()V
/* .line 25 */
v0 = this.g;
(( android.view.Window ) v0 ).findViewById ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;
} // .end method
public android.view.View a ( android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3 ) {
/* .locals 11 */
/* .line 85 */
v0 = this.a0;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_2 */
/* .line 86 */
v0 = this.f;
v2 = c.b.j.AppCompatTheme;
(( android.content.Context ) v0 ).obtainStyledAttributes ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
/* .line 87 */
/* .line 88 */
(( android.content.res.TypedArray ) v0 ).getString ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 89 */
/* const-class v2, Landroidx/appcompat/app/AppCompatViewInflater; */
/* .line 90 */
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
v2 = (( java.lang.String ) v2 ).equals ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 91 */
} // :cond_0
try { // :try_start_0
java.lang.Class .forName ( v0 );
/* new-array v3, v1, [Ljava/lang/Class; */
/* .line 92 */
(( java.lang.Class ) v2 ).getDeclaredConstructor ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* new-array v3, v1, [Ljava/lang/Object; */
/* .line 93 */
(( java.lang.reflect.Constructor ) v2 ).newInstance ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Landroidx/appcompat/app/AppCompatViewInflater; */
this.a0 = v2;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception v2 */
/* .line 94 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Failed to instantiate custom view inflater "; // const-string v4, "Failed to instantiate custom view inflater "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = ".Falling back to default."; // const-string v0, ".Falling back to default."
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v3 = "AppCompatDelegate"; // const-string v3, "AppCompatDelegate"
android.util.Log .i ( v3,v0,v2 );
/* .line 95 */
/* new-instance v0, Landroidx/appcompat/app/AppCompatViewInflater; */
/* invoke-direct {v0}, Landroidx/appcompat/app/AppCompatViewInflater;-><init>()V */
this.a0 = v0;
/* .line 96 */
} // :cond_1
} // :goto_0
/* new-instance v0, Landroidx/appcompat/app/AppCompatViewInflater; */
/* invoke-direct {v0}, Landroidx/appcompat/app/AppCompatViewInflater;-><init>()V */
this.a0 = v0;
/* .line 97 */
} // :cond_2
} // :goto_1
/* sget-boolean v0, Lc/b/k/n0;->c0:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 98 */
/* instance-of v0, p4, Lorg/xmlpull/v1/XmlPullParser; */
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_3
/* move-object v0, p4 */
/* check-cast v0, Lorg/xmlpull/v1/XmlPullParser; */
v0 = /* .line 99 */
/* if-le v0, v2, :cond_4 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_3
/* move-object v0, p1 */
/* check-cast v0, Landroid/view/ViewParent; */
/* .line 100 */
v0 = (( c.b.k.n0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/n0;->a(Landroid/view/ViewParent;)Z
/* move v1, v0 */
} // :cond_4
} // :goto_2
/* move v7, v1 */
} // :cond_5
int v7 = 0; // const/4 v7, 0x0
/* .line 101 */
} // :goto_3
v2 = this.a0;
/* sget-boolean v8, Lc/b/k/n0;->c0:Z */
int v9 = 1; // const/4 v9, 0x1
/* .line 102 */
v10 = c.b.q.u2 .b ( );
/* move-object v3, p1 */
/* move-object v4, p2 */
/* move-object v5, p3 */
/* move-object v6, p4 */
/* .line 103 */
/* invoke-virtual/range {v2 ..v10}, Landroidx/appcompat/app/AppCompatViewInflater;->createView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZZZ)Landroid/view/View; */
} // .end method
public c.b.k.l0 a ( Integer p0, Boolean p1 ) {
/* .locals 3 */
/* .line 195 */
p2 = this.H;
if ( p2 != null) { // if-eqz p2, :cond_0
/* array-length v0, p2 */
/* if-gt v0, p1, :cond_2 */
} // :cond_0
/* add-int/lit8 v0, p1, 0x1 */
/* .line 196 */
/* new-array v0, v0, [Lc/b/k/l0; */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 197 */
/* array-length v1, p2 */
int v2 = 0; // const/4 v2, 0x0
java.lang.System .arraycopy ( p2,v2,v0,v2,v1 );
/* .line 198 */
} // :cond_1
this.H = v0;
/* move-object p2, v0 */
/* .line 199 */
} // :cond_2
/* aget-object v0, p2, p1 */
/* if-nez v0, :cond_3 */
/* .line 200 */
/* new-instance v0, Lc/b/k/l0; */
/* invoke-direct {v0, p1}, Lc/b/k/l0;-><init>(I)V */
/* aput-object v0, p2, p1 */
} // :cond_3
} // .end method
public c.b.k.l0 a ( android.view.Menu p0 ) {
/* .locals 5 */
/* .line 191 */
v0 = this.H;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 192 */
/* array-length v2, v0 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v1, v2, :cond_2 */
/* .line 193 */
/* aget-object v3, v0, v1 */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 194 */
v4 = this.j;
/* if-ne v4, p1, :cond_1 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // .end method
public c.b.p.c a ( Object p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 64 */
v0 = this.p;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 65 */
(( c.b.p.c ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/c;->a()V
/* .line 66 */
} // :cond_0
/* new-instance v0, Lc/b/k/e0; */
/* invoke-direct {v0, p0, p1}, Lc/b/k/e0;-><init>(Lc/b/k/n0;Lc/b/p/b;)V */
/* .line 67 */
(( c.b.k.n0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 68 */
(( c.b.k.a ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/b/k/a;->a(Lc/b/p/b;)Lc/b/p/c;
this.p = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 69 */
v1 = this.i;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 70 */
/* .line 71 */
} // :cond_1
p1 = this.p;
/* if-nez p1, :cond_2 */
/* .line 72 */
(( c.b.k.n0 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/n0;->b(Lc/b/p/b;)Lc/b/p/c;
this.p = p1;
/* .line 73 */
} // :cond_2
p1 = this.p;
/* .line 74 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "ActionMode callback can not be null."; // const-string v0, "ActionMode callback can not be null."
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( Integer p0, c.b.k.l0 p1, android.view.Menu p2 ) {
/* .locals 2 */
/* if-nez p3, :cond_1 */
/* if-nez p2, :cond_0 */
/* if-ltz p1, :cond_0 */
/* .line 185 */
v0 = this.H;
/* array-length v1, v0 */
/* if-ge p1, v1, :cond_0 */
/* .line 186 */
/* aget-object p2, v0, p1 */
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 187 */
p3 = this.j;
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 188 */
/* iget-boolean p2, p2, Lc/b/k/l0;->o:Z */
/* if-nez p2, :cond_2 */
return;
/* .line 189 */
} // :cond_2
/* iget-boolean p2, p0, Lc/b/k/n0;->N:Z */
/* if-nez p2, :cond_3 */
/* .line 190 */
p2 = this.h;
(( c.b.p.n ) p2 ).a ( ); // invoke-virtual {p2}, Lc/b/p/n;->a()Landroid/view/Window$Callback;
} // :cond_3
return;
} // .end method
public void a ( android.content.Context p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
(( c.b.k.n0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/n0;->a(Z)Z
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* iput-boolean p1, p0, Lc/b/k/n0;->K:Z */
return;
} // .end method
public void a ( android.content.res.Configuration p0 ) {
/* .locals 1 */
/* .line 26 */
/* iget-boolean v0, p0, Lc/b/k/n0;->B:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lc/b/k/n0;->v:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 27 */
(( c.b.k.n0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 28 */
(( c.b.k.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/a;->a(Landroid/content/res/Configuration;)V
/* .line 29 */
} // :cond_0
c.b.q.s .b ( );
v0 = this.f;
(( c.b.q.s ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/b/q/s;->a(Landroid/content/Context;)V
int p1 = 0; // const/4 p1, 0x0
/* .line 30 */
(( c.b.k.n0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/n0;->a(Z)Z
return;
} // .end method
public void a ( android.os.Bundle p0 ) {
/* .locals 2 */
int p1 = 1; // const/4 p1, 0x1
/* .line 3 */
/* iput-boolean p1, p0, Lc/b/k/n0;->K:Z */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
(( c.b.k.n0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/n0;->a(Z)Z
/* .line 5 */
(( c.b.k.n0 ) p0 ).s ( ); // invoke-virtual {p0}, Lc/b/k/n0;->s()V
/* .line 6 */
v0 = this.e;
/* instance-of v1, v0, Landroid/app/Activity; */
if ( v1 != null) { // if-eqz v1, :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 7 */
try { // :try_start_0
/* check-cast v0, Landroid/app/Activity; */
c.h.e.r .b ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* nop */
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 8 */
(( c.b.k.n0 ) p0 ).C ( ); // invoke-virtual {p0}, Lc/b/k/n0;->C()Lc/b/k/a;
/* if-nez v0, :cond_0 */
/* .line 9 */
/* iput-boolean p1, p0, Lc/b/k/n0;->X:Z */
/* .line 10 */
} // :cond_0
(( c.b.k.a ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/a;->c(Z)V
/* .line 11 */
} // :cond_1
} // :goto_1
/* iput-boolean p1, p0, Lc/b/k/n0;->L:Z */
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 2 */
/* .line 31 */
(( c.b.k.n0 ) p0 ).r ( ); // invoke-virtual {p0}, Lc/b/k/n0;->r()V
/* .line 32 */
v0 = this.w;
/* const v1, 0x1020002 */
(( android.view.ViewGroup ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/view/ViewGroup; */
/* .line 33 */
(( android.view.ViewGroup ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V
/* .line 34 */
(( android.view.ViewGroup ) v0 ).addView ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* .line 35 */
p1 = this.h;
(( c.b.p.n ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/p/n;->a()Landroid/view/Window$Callback;
return;
} // .end method
public void a ( android.view.View p0, android.view.ViewGroup$LayoutParams p1 ) {
/* .locals 2 */
/* .line 36 */
(( c.b.k.n0 ) p0 ).r ( ); // invoke-virtual {p0}, Lc/b/k/n0;->r()V
/* .line 37 */
v0 = this.w;
/* const v1, 0x1020002 */
(( android.view.ViewGroup ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/view/ViewGroup; */
/* .line 38 */
(( android.view.ViewGroup ) v0 ).addView ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 39 */
p1 = this.h;
(( c.b.p.n ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/p/n;->a()Landroid/view/Window$Callback;
return;
} // .end method
public void a ( android.view.ViewGroup p0 ) {
/* .locals 0 */
return;
} // .end method
public final void a ( android.view.Window p0 ) {
/* .locals 3 */
/* .line 40 */
v0 = this.g;
final String v1 = "AppCompat has already installed itself into the Window"; // const-string v1, "AppCompat has already installed itself into the Window"
/* if-nez v0, :cond_2 */
/* .line 41 */
(( android.view.Window ) p1 ).getCallback ( ); // invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;
/* .line 42 */
/* instance-of v2, v0, Lc/b/k/f0; */
/* if-nez v2, :cond_1 */
/* .line 43 */
/* new-instance v1, Lc/b/k/f0; */
/* invoke-direct {v1, p0, v0}, Lc/b/k/f0;-><init>(Lc/b/k/n0;Landroid/view/Window$Callback;)V */
this.h = v1;
/* .line 44 */
(( android.view.Window ) p1 ).setCallback ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V
/* .line 45 */
v0 = this.f;
int v1 = 0; // const/4 v1, 0x0
v2 = c.b.k.n0.d0;
c.b.q.k2 .a ( v0,v1,v2 );
int v1 = 0; // const/4 v1, 0x0
/* .line 46 */
(( c.b.q.k2 ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/k2;->c(I)Landroid/graphics/drawable/Drawable;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 47 */
(( android.view.Window ) p1 ).setBackgroundDrawable ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 48 */
} // :cond_0
(( c.b.q.k2 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/k2;->a()V
/* .line 49 */
this.g = p1;
return;
/* .line 50 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 51 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( androidx.appcompat.widget.Toolbar p0 ) {
/* .locals 3 */
/* .line 12 */
v0 = this.e;
/* instance-of v0, v0, Landroid/app/Activity; */
/* if-nez v0, :cond_0 */
return;
/* .line 13 */
} // :cond_0
(( c.b.k.n0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;
/* .line 14 */
/* instance-of v1, v0, Lc/b/k/f1; */
/* if-nez v1, :cond_3 */
int v1 = 0; // const/4 v1, 0x0
/* .line 15 */
this.k = v1;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 16 */
(( c.b.k.a ) v0 ).j ( ); // invoke-virtual {v0}, Lc/b/k/a;->j()V
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 17 */
/* new-instance v0, Lc/b/k/x0; */
(( c.b.k.n0 ) p0 ).w ( ); // invoke-virtual {p0}, Lc/b/k/n0;->w()Ljava/lang/CharSequence;
v2 = this.h;
/* invoke-direct {v0, p1, v1, v2}, Lc/b/k/x0;-><init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V */
/* .line 18 */
this.j = v0;
/* .line 19 */
p1 = this.g;
(( c.b.k.x0 ) v0 ).m ( ); // invoke-virtual {v0}, Lc/b/k/x0;->m()Landroid/view/Window$Callback;
(( android.view.Window ) p1 ).setCallback ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V
/* .line 20 */
} // :cond_2
this.j = v1;
/* .line 21 */
p1 = this.g;
v0 = this.h;
(( android.view.Window ) p1 ).setCallback ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V
/* .line 22 */
} // :goto_0
(( c.b.k.n0 ) p0 ).e ( ); // invoke-virtual {p0}, Lc/b/k/n0;->e()V
return;
/* .line 23 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "This Activity already has an action bar supplied by the window decor.Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."; // const-string v0, "This Activity already has an action bar supplied by the window decor.Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final void a ( c.b.k.l0 p0, android.view.KeyEvent p1 ) {
/* .locals 13 */
/* .line 108 */
/* iget-boolean v0, p1, Lc/b/k/l0;->o:Z */
/* if-nez v0, :cond_f */
/* iget-boolean v0, p0, Lc/b/k/n0;->N:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* goto/16 :goto_3 */
/* .line 109 */
} // :cond_0
/* iget v0, p1, Lc/b/k/l0;->a:I */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-nez v0, :cond_2 */
/* .line 110 */
v0 = this.f;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* .line 111 */
/* iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I */
/* and-int/lit8 v0, v0, 0xf */
int v3 = 4; // const/4 v3, 0x4
/* if-ne v0, v3, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_2
return;
/* .line 112 */
} // :cond_2
(( c.b.k.n0 ) p0 ).x ( ); // invoke-virtual {p0}, Lc/b/k/n0;->x()Landroid/view/Window$Callback;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 113 */
/* iget v3, p1, Lc/b/k/l0;->a:I */
v0 = v4 = this.j;
/* if-nez v0, :cond_3 */
/* .line 114 */
(( c.b.k.n0 ) p0 ).a ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V
return;
/* .line 115 */
} // :cond_3
v0 = this.f;
final String v3 = "window"; // const-string v3, "window"
(( android.content.Context ) v0 ).getSystemService ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/WindowManager; */
/* if-nez v0, :cond_4 */
return;
/* .line 116 */
} // :cond_4
p2 = (( c.b.k.n0 ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/b/k/n0;->b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z
/* if-nez p2, :cond_5 */
return;
/* .line 117 */
} // :cond_5
p2 = this.g;
int v3 = -1; // const/4 v3, -0x1
int v4 = -2; // const/4 v4, -0x2
if ( p2 != null) { // if-eqz p2, :cond_7
/* iget-boolean p2, p1, Lc/b/k/l0;->q:Z */
if ( p2 != null) { // if-eqz p2, :cond_6
/* .line 118 */
} // :cond_6
p2 = this.i;
if ( p2 != null) { // if-eqz p2, :cond_e
/* .line 119 */
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
if ( p2 != null) { // if-eqz p2, :cond_e
/* .line 120 */
/* iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I */
/* if-ne p2, v3, :cond_e */
int v6 = -1; // const/4 v6, -0x1
/* .line 121 */
} // :cond_7
} // :goto_1
p2 = this.g;
/* if-nez p2, :cond_9 */
/* .line 122 */
p2 = (( c.b.k.n0 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/n0;->b(Lc/b/k/l0;)Z
if ( p2 != null) { // if-eqz p2, :cond_8
p2 = this.g;
/* if-nez p2, :cond_a */
} // :cond_8
return;
/* .line 123 */
} // :cond_9
/* iget-boolean v3, p1, Lc/b/k/l0;->q:Z */
if ( v3 != null) { // if-eqz v3, :cond_a
p2 = (( android.view.ViewGroup ) p2 ).getChildCount ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I
/* if-lez p2, :cond_a */
/* .line 124 */
p2 = this.g;
(( android.view.ViewGroup ) p2 ).removeAllViews ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V
/* .line 125 */
} // :cond_a
p2 = (( c.b.k.n0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/n0;->a(Lc/b/k/l0;)Z
if ( p2 != null) { // if-eqz p2, :cond_f
p2 = (( c.b.k.l0 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/k/l0;->a()Z
/* if-nez p2, :cond_b */
/* .line 126 */
} // :cond_b
p2 = this.h;
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* if-nez p2, :cond_c */
/* .line 127 */
/* new-instance p2, Landroid/view/ViewGroup$LayoutParams; */
/* invoke-direct {p2, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
/* .line 128 */
} // :cond_c
/* iget v3, p1, Lc/b/k/l0;->b:I */
/* .line 129 */
v5 = this.g;
(( android.view.ViewGroup ) v5 ).setBackgroundResource ( v3 ); // invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->setBackgroundResource(I)V
/* .line 130 */
v3 = this.h;
(( android.view.View ) v3 ).getParent ( ); // invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 131 */
/* instance-of v5, v3, Landroid/view/ViewGroup; */
if ( v5 != null) { // if-eqz v5, :cond_d
/* .line 132 */
/* check-cast v3, Landroid/view/ViewGroup; */
v5 = this.h;
(( android.view.ViewGroup ) v3 ).removeView ( v5 ); // invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 133 */
} // :cond_d
v3 = this.g;
v5 = this.h;
(( android.view.ViewGroup ) v3 ).addView ( v5, p2 ); // invoke-virtual {v3, v5, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 134 */
p2 = this.h;
p2 = (( android.view.View ) p2 ).hasFocus ( ); // invoke-virtual {p2}, Landroid/view/View;->hasFocus()Z
/* if-nez p2, :cond_e */
/* .line 135 */
p2 = this.h;
(( android.view.View ) p2 ).requestFocus ( ); // invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z
} // :cond_e
int v6 = -2; // const/4 v6, -0x2
/* .line 136 */
} // :goto_2
/* iput-boolean v1, p1, Lc/b/k/l0;->n:Z */
/* .line 137 */
/* new-instance p2, Landroid/view/WindowManager$LayoutParams; */
int v7 = -2; // const/4 v7, -0x2
/* iget v8, p1, Lc/b/k/l0;->d:I */
/* iget v9, p1, Lc/b/k/l0;->e:I */
/* const/16 v10, 0x3ea */
/* const/high16 v11, 0x820000 */
int v12 = -3; // const/4 v12, -0x3
/* move-object v5, p2 */
/* invoke-direct/range {v5 ..v12}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V */
/* .line 138 */
/* iget v1, p1, Lc/b/k/l0;->c:I */
/* iput v1, p2, Landroid/view/WindowManager$LayoutParams;->gravity:I */
/* .line 139 */
/* iget v1, p1, Lc/b/k/l0;->f:I */
/* iput v1, p2, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I */
/* .line 140 */
v1 = this.g;
/* .line 141 */
/* iput-boolean v2, p1, Lc/b/k/l0;->o:Z */
} // :cond_f
} // :goto_3
return;
} // .end method
public void a ( c.b.k.l0 p0, Boolean p1 ) {
/* .locals 3 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 171 */
/* iget v0, p1, Lc/b/k/l0;->a:I */
/* if-nez v0, :cond_0 */
v0 = this.m;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = /* .line 172 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 173 */
p1 = this.j;
(( c.b.k.n0 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/n0;->b(Lc/b/p/o/m;)V
return;
/* .line 174 */
} // :cond_0
v0 = this.f;
final String v1 = "window"; // const-string v1, "window"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/WindowManager; */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 175 */
/* iget-boolean v2, p1, Lc/b/k/l0;->o:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
v2 = this.g;
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 176 */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 177 */
/* iget p2, p1, Lc/b/k/l0;->a:I */
(( c.b.k.n0 ) p0 ).a ( p2, p1, v1 ); // invoke-virtual {p0, p2, p1, v1}, Lc/b/k/n0;->a(ILc/b/k/l0;Landroid/view/Menu;)V
} // :cond_1
int p2 = 0; // const/4 p2, 0x0
/* .line 178 */
/* iput-boolean p2, p1, Lc/b/k/l0;->m:Z */
/* .line 179 */
/* iput-boolean p2, p1, Lc/b/k/l0;->n:Z */
/* .line 180 */
/* iput-boolean p2, p1, Lc/b/k/l0;->o:Z */
/* .line 181 */
this.h = v1;
int p2 = 1; // const/4 p2, 0x1
/* .line 182 */
/* iput-boolean p2, p1, Lc/b/k/l0;->q:Z */
/* .line 183 */
p2 = this.I;
/* if-ne p2, p1, :cond_2 */
/* .line 184 */
this.I = v1;
} // :cond_2
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 63 */
(( c.b.k.n0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/b/k/n0;->a(Lc/b/p/o/m;Z)V
return;
} // .end method
public final void a ( Object p0, Boolean p1 ) {
/* .locals 4 */
/* .line 142 */
p1 = this.m;
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
p1 = if ( p1 != null) { // if-eqz p1, :cond_5
if ( p1 != null) { // if-eqz p1, :cond_5
p1 = this.f;
/* .line 143 */
android.view.ViewConfiguration .get ( p1 );
p1 = (( android.view.ViewConfiguration ) p1 ).hasPermanentMenuKey ( ); // invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = this.m;
p1 = /* .line 144 */
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 145 */
} // :cond_0
(( c.b.k.n0 ) p0 ).x ( ); // invoke-virtual {p0}, Lc/b/k/n0;->x()Landroid/view/Window$Callback;
/* .line 146 */
v2 = v2 = this.m;
/* const/16 v3, 0x6c */
if ( v2 != null) { // if-eqz v2, :cond_2
/* if-nez p2, :cond_1 */
/* .line 147 */
} // :cond_1
p2 = this.m;
/* .line 148 */
/* iget-boolean p2, p0, Lc/b/k/n0;->N:Z */
/* if-nez p2, :cond_4 */
/* .line 149 */
(( c.b.k.n0 ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;
/* .line 150 */
p2 = this.j;
} // :cond_2
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 151 */
/* iget-boolean p2, p0, Lc/b/k/n0;->N:Z */
/* if-nez p2, :cond_4 */
/* .line 152 */
/* iget-boolean p2, p0, Lc/b/k/n0;->U:Z */
if ( p2 != null) { // if-eqz p2, :cond_3
/* iget p2, p0, Lc/b/k/n0;->V:I */
/* and-int/2addr p2, v0 */
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 153 */
p2 = this.g;
(( android.view.Window ) p2 ).getDecorView ( ); // invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;
v2 = this.W;
(( android.view.View ) p2 ).removeCallbacks ( v2 ); // invoke-virtual {p2, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 154 */
p2 = this.W;
/* .line 155 */
} // :cond_3
(( c.b.k.n0 ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;
/* .line 156 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_4
/* iget-boolean v2, p2, Lc/b/k/l0;->r:Z */
/* if-nez v2, :cond_4 */
v2 = this.i;
v0 = /* .line 157 */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 158 */
p2 = this.j;
/* .line 159 */
p1 = this.m;
} // :cond_4
} // :goto_1
return;
/* .line 160 */
} // :cond_5
(( c.b.k.n0 ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;
/* .line 161 */
/* iput-boolean v0, p1, Lc/b/k/l0;->q:Z */
/* .line 162 */
(( c.b.k.n0 ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V
int p2 = 0; // const/4 p2, 0x0
/* .line 163 */
(( c.b.k.n0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/b/k/n0;->a(Lc/b/k/l0;Landroid/view/KeyEvent;)V
return;
} // .end method
public final void a ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 52 */
this.l = p1;
/* .line 53 */
v0 = this.m;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 54 */
/* .line 55 */
} // :cond_0
(( c.b.k.n0 ) p0 ).C ( ); // invoke-virtual {p0}, Lc/b/k/n0;->C()Lc/b/k/a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 56 */
(( c.b.k.n0 ) p0 ).C ( ); // invoke-virtual {p0}, Lc/b/k/n0;->C()Lc/b/k/a;
(( c.b.k.a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/a;->b(Ljava/lang/CharSequence;)V
/* .line 57 */
} // :cond_1
v0 = this.x;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 58 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :cond_2
} // :goto_0
return;
} // .end method
public Boolean a ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 3 */
int v0 = 4; // const/4 v0, 0x4
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* if-eq p1, v0, :cond_1 */
/* const/16 v0, 0x52 */
/* if-eq p1, v0, :cond_0 */
/* .line 83 */
} // :cond_0
(( c.b.k.n0 ) p0 ).b ( v2, p2 ); // invoke-virtual {p0, v2, p2}, Lc/b/k/n0;->b(ILandroid/view/KeyEvent;)Z
/* .line 84 */
} // :cond_1
p1 = (( android.view.KeyEvent ) p2 ).getFlags ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getFlags()I
/* and-int/lit16 p1, p1, 0x80 */
if ( p1 != null) { // if-eqz p1, :cond_2
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* iput-boolean v1, p0, Lc/b/k/n0;->J:Z */
} // :goto_1
} // .end method
public Boolean a ( android.view.KeyEvent p0 ) {
/* .locals 3 */
/* .line 75 */
v0 = this.e;
/* instance-of v1, v0, Lc/h/n/j; */
int v2 = 1; // const/4 v2, 0x1
/* if-nez v1, :cond_0 */
/* instance-of v0, v0, Lc/b/k/p0; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 76 */
} // :cond_0
v0 = this.g;
(( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 77 */
v0 = c.h.n.k .a ( v0,p1 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 78 */
} // :cond_1
v0 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
/* const/16 v1, 0x52 */
/* if-ne v0, v1, :cond_2 */
/* .line 79 */
v0 = this.h;
v0 = (( c.b.p.n ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/n;->a()Landroid/view/Window$Callback;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 80 */
} // :cond_2
v0 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
/* .line 81 */
v1 = (( android.view.KeyEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I
/* if-nez v1, :cond_3 */
} // :cond_3
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 82 */
p1 = (( c.b.k.n0 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lc/b/k/n0;->a(ILandroid/view/KeyEvent;)Z
} // :cond_4
p1 = (( c.b.k.n0 ) p0 ).d ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lc/b/k/n0;->d(ILandroid/view/KeyEvent;)Z
} // :goto_1
} // .end method
public final Boolean a ( android.view.ViewParent p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 104 */
} // :cond_0
v1 = this.g;
(( android.view.Window ) v1 ).getDecorView ( ); // invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
} // :goto_0
/* if-nez p1, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
/* if-eq p1, v1, :cond_3 */
/* .line 105 */
/* instance-of v2, p1, Landroid/view/View; */
if ( v2 != null) { // if-eqz v2, :cond_3
/* move-object v2, p1 */
/* check-cast v2, Landroid/view/View; */
/* .line 106 */
v2 = c.h.n.v0 .C ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 107 */
} // :cond_2
} // :cond_3
} // :goto_1
} // .end method
public final Boolean a ( c.b.k.l0 p0 ) {
/* .locals 3 */
/* .line 164 */
v0 = this.i;
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 165 */
this.h = v0;
/* .line 166 */
} // :cond_0
v0 = this.j;
int v2 = 0; // const/4 v2, 0x0
/* if-nez v0, :cond_1 */
/* .line 167 */
} // :cond_1
v0 = this.o;
/* if-nez v0, :cond_2 */
/* .line 168 */
/* new-instance v0, Lc/b/k/m0; */
/* invoke-direct {v0, p0}, Lc/b/k/m0;-><init>(Lc/b/k/n0;)V */
this.o = v0;
/* .line 169 */
} // :cond_2
v0 = this.o;
(( c.b.k.l0 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/b/k/l0;->a(Lc/b/p/o/z$a;)Lc/b/p/o/a0;
/* .line 170 */
/* check-cast v0, Landroid/view/View; */
this.h = v0;
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_3
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public final Boolean a ( c.b.k.l0 p0, Integer p1, android.view.KeyEvent p2, Integer p3 ) {
/* .locals 2 */
/* .line 201 */
v0 = (( android.view.KeyEvent ) p3 ).isSystem ( ); // invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 202 */
} // :cond_0
/* iget-boolean v0, p1, Lc/b/k/l0;->m:Z */
/* if-nez v0, :cond_1 */
v0 = (( c.b.k.n0 ) p0 ).b ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Lc/b/k/n0;->b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_1
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 203 */
v1 = (( c.b.p.o.m ) v0 ).performShortcut ( p2, p3, p4 ); // invoke-virtual {v0, p2, p3, p4}, Lc/b/p/o/m;->performShortcut(ILandroid/view/KeyEvent;I)Z
} // :cond_2
if ( v1 != null) { // if-eqz v1, :cond_3
int p2 = 1; // const/4 p2, 0x1
/* and-int/lit8 p3, p4, 0x1 */
/* if-nez p3, :cond_3 */
/* .line 204 */
p3 = this.m;
/* if-nez p3, :cond_3 */
/* .line 205 */
(( c.b.k.n0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V
} // :cond_3
} // .end method
public Boolean a ( Object p0, android.view.MenuItem p1 ) {
/* .locals 2 */
/* .line 59 */
(( c.b.k.n0 ) p0 ).x ( ); // invoke-virtual {p0}, Lc/b/k/n0;->x()Landroid/view/Window$Callback;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 60 */
/* iget-boolean v1, p0, Lc/b/k/n0;->N:Z */
/* if-nez v1, :cond_0 */
/* .line 61 */
(( c.b.p.o.m ) p1 ).m ( ); // invoke-virtual {p1}, Lc/b/p/o/m;->m()Lc/b/p/o/m;
(( c.b.k.n0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/n0;->a(Landroid/view/Menu;)Lc/b/k/l0;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 62 */
p1 = /* iget p1, p1, Lc/b/k/l0;->a:I */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Boolean a ( Boolean p0 ) {
/* .locals 2 */
/* .line 206 */
/* iget-boolean v0, p0, Lc/b/k/n0;->N:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 207 */
} // :cond_0
v0 = (( c.b.k.n0 ) p0 ).m ( ); // invoke-virtual {p0}, Lc/b/k/n0;->m()I
/* .line 208 */
v1 = (( c.b.k.n0 ) p0 ).h ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/n0;->h(I)I
/* .line 209 */
p1 = (( c.b.k.n0 ) p0 ).b ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Lc/b/k/n0;->b(IZ)Z
/* if-nez v0, :cond_1 */
/* .line 210 */
(( c.b.k.n0 ) p0 ).v ( ); // invoke-virtual {p0}, Lc/b/k/n0;->v()Lc/b/k/i0;
(( c.b.k.i0 ) v1 ).e ( ); // invoke-virtual {v1}, Lc/b/k/i0;->e()V
/* .line 211 */
} // :cond_1
v1 = this.S;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 212 */
(( c.b.k.i0 ) v1 ).a ( ); // invoke-virtual {v1}, Lc/b/k/i0;->a()V
} // :cond_2
} // :goto_0
int v1 = 3; // const/4 v1, 0x3
/* if-ne v0, v1, :cond_3 */
/* .line 213 */
(( c.b.k.n0 ) p0 ).u ( ); // invoke-virtual {p0}, Lc/b/k/n0;->u()Lc/b/k/i0;
(( c.b.k.i0 ) v0 ).e ( ); // invoke-virtual {v0}, Lc/b/k/i0;->e()V
/* .line 214 */
} // :cond_3
v0 = this.T;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 215 */
(( c.b.k.i0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/k/i0;->a()V
} // :cond_4
} // :goto_1
} // .end method
public android.view.MenuInflater b ( ) {
/* .locals 2 */
/* .line 2 */
v0 = this.k;
/* if-nez v0, :cond_1 */
/* .line 3 */
(( c.b.k.n0 ) p0 ).y ( ); // invoke-virtual {p0}, Lc/b/k/n0;->y()V
/* .line 4 */
/* new-instance v0, Lc/b/p/k; */
v1 = this.j;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 5 */
(( c.b.k.a ) v1 ).h ( ); // invoke-virtual {v1}, Lc/b/k/a;->h()Landroid/content/Context;
} // :cond_0
v1 = this.f;
} // :goto_0
/* invoke-direct {v0, v1}, Lc/b/p/k;-><init>(Landroid/content/Context;)V */
this.k = v0;
/* .line 6 */
} // :cond_1
v0 = this.k;
} // .end method
public c.b.p.c b ( Object p0 ) {
/* .locals 7 */
/* .line 29 */
(( c.b.k.n0 ) p0 ).q ( ); // invoke-virtual {p0}, Lc/b/k/n0;->q()V
/* .line 30 */
v0 = this.p;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 31 */
(( c.b.p.c ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/c;->a()V
/* .line 32 */
} // :cond_0
/* instance-of v0, p1, Lc/b/k/e0; */
/* if-nez v0, :cond_1 */
/* .line 33 */
/* new-instance v0, Lc/b/k/e0; */
/* invoke-direct {v0, p0, p1}, Lc/b/k/e0;-><init>(Lc/b/k/n0;Lc/b/p/b;)V */
/* move-object p1, v0 */
/* .line 34 */
} // :cond_1
v0 = this.i;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
/* iget-boolean v2, p0, Lc/b/k/n0;->N:Z */
/* if-nez v2, :cond_2 */
/* .line 35 */
try { // :try_start_0
/* :try_end_0 */
/* .catch Ljava/lang/AbstractMethodError; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // :cond_2
/* move-object v0, v1 */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 36 */
this.p = v0;
/* goto/16 :goto_5 */
/* .line 37 */
} // :cond_3
v0 = this.q;
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* if-nez v0, :cond_6 */
/* .line 38 */
/* iget-boolean v0, p0, Lc/b/k/n0;->E:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 39 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
/* .line 40 */
v4 = this.f;
(( android.content.Context ) v4 ).getTheme ( ); // invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
/* .line 41 */
(( android.content.res.Resources$Theme ) v4 ).resolveAttribute ( v5, v0, v3 ); // invoke-virtual {v4, v5, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
/* .line 42 */
/* iget v5, v0, Landroid/util/TypedValue;->resourceId:I */
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 43 */
v5 = this.f;
(( android.content.Context ) v5 ).getResources ( ); // invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v5 ).newTheme ( ); // invoke-virtual {v5}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;
/* .line 44 */
(( android.content.res.Resources$Theme ) v5 ).setTo ( v4 ); // invoke-virtual {v5, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V
/* .line 45 */
/* iget v4, v0, Landroid/util/TypedValue;->resourceId:I */
(( android.content.res.Resources$Theme ) v5 ).applyStyle ( v4, v3 ); // invoke-virtual {v5, v4, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V
/* .line 46 */
/* new-instance v4, Lc/b/p/e; */
v6 = this.f;
/* invoke-direct {v4, v6, v2}, Lc/b/p/e;-><init>(Landroid/content/Context;I)V */
/* .line 47 */
(( c.b.p.e ) v4 ).getTheme ( ); // invoke-virtual {v4}, Lc/b/p/e;->getTheme()Landroid/content/res/Resources$Theme;
(( android.content.res.Resources$Theme ) v6 ).setTo ( v5 ); // invoke-virtual {v6, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V
/* .line 48 */
} // :cond_4
v4 = this.f;
/* .line 49 */
} // :goto_1
/* new-instance v5, Landroidx/appcompat/widget/ActionBarContextView; */
/* invoke-direct {v5, v4}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;)V */
this.q = v5;
/* .line 50 */
/* new-instance v5, Landroid/widget/PopupWindow; */
/* invoke-direct {v5, v4, v1, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
this.r = v5;
int v6 = 2; // const/4 v6, 0x2
/* .line 51 */
c.h.o.n .a ( v5,v6 );
/* .line 52 */
v5 = this.r;
v6 = this.q;
(( android.widget.PopupWindow ) v5 ).setContentView ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V
/* .line 53 */
v5 = this.r;
int v6 = -1; // const/4 v6, -0x1
(( android.widget.PopupWindow ) v5 ).setWidth ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setWidth(I)V
/* .line 54 */
(( android.content.Context ) v4 ).getTheme ( ); // invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
(( android.content.res.Resources$Theme ) v5 ).resolveAttribute ( v6, v0, v3 ); // invoke-virtual {v5, v6, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
/* .line 55 */
/* iget v0, v0, Landroid/util/TypedValue;->data:I */
/* .line 56 */
(( android.content.Context ) v4 ).getResources ( ); // invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v4 ).getDisplayMetrics ( ); // invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 57 */
v0 = android.util.TypedValue .complexToDimensionPixelSize ( v0,v4 );
/* .line 58 */
v4 = this.q;
(( androidx.appcompat.widget.ActionBarContextView ) v4 ).setContentHeight ( v0 ); // invoke-virtual {v4, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V
/* .line 59 */
v0 = this.r;
int v4 = -2; // const/4 v4, -0x2
(( android.widget.PopupWindow ) v0 ).setHeight ( v4 ); // invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setHeight(I)V
/* .line 60 */
/* new-instance v0, Lc/b/k/a0; */
/* invoke-direct {v0, p0}, Lc/b/k/a0;-><init>(Lc/b/k/n0;)V */
this.s = v0;
/* .line 61 */
} // :cond_5
v0 = this.w;
/* .line 62 */
(( android.view.ViewGroup ) v0 ).findViewById ( v4 ); // invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroidx/appcompat/widget/ViewStubCompat; */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 63 */
(( c.b.k.n0 ) p0 ).t ( ); // invoke-virtual {p0}, Lc/b/k/n0;->t()Landroid/content/Context;
android.view.LayoutInflater .from ( v4 );
(( androidx.appcompat.widget.ViewStubCompat ) v0 ).setLayoutInflater ( v4 ); // invoke-virtual {v0, v4}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V
/* .line 64 */
(( androidx.appcompat.widget.ViewStubCompat ) v0 ).a ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;
/* check-cast v0, Landroidx/appcompat/widget/ActionBarContextView; */
this.q = v0;
/* .line 65 */
} // :cond_6
} // :goto_2
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 66 */
(( c.b.k.n0 ) p0 ).q ( ); // invoke-virtual {p0}, Lc/b/k/n0;->q()V
/* .line 67 */
v0 = this.q;
(( androidx.appcompat.widget.ActionBarContextView ) v0 ).d ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->d()V
/* .line 68 */
/* new-instance v0, Lc/b/p/f; */
v4 = this.q;
(( android.view.ViewGroup ) v4 ).getContext ( ); // invoke-virtual {v4}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
v5 = this.q;
v6 = this.r;
/* if-nez v6, :cond_7 */
} // :cond_7
int v3 = 0; // const/4 v3, 0x0
} // :goto_3
/* invoke-direct {v0, v4, v5, p1, v3}, Lc/b/p/f;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Lc/b/p/b;Z)V */
/* .line 69 */
p1 = (( c.b.p.f ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/p/f;->c()Landroid/view/Menu;
if ( p1 != null) { // if-eqz p1, :cond_a
/* .line 70 */
(( c.b.p.f ) v0 ).i ( ); // invoke-virtual {v0}, Lc/b/p/f;->i()V
/* .line 71 */
p1 = this.q;
(( androidx.appcompat.widget.ActionBarContextView ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->a(Lc/b/p/c;)V
/* .line 72 */
this.p = v0;
/* .line 73 */
p1 = (( c.b.k.n0 ) p0 ).D ( ); // invoke-virtual {p0}, Lc/b/k/n0;->D()Z
/* const/high16 v0, 0x3f800000 # 1.0f */
if ( p1 != null) { // if-eqz p1, :cond_8
/* .line 74 */
p1 = this.q;
int v1 = 0; // const/4 v1, 0x0
(( android.view.ViewGroup ) p1 ).setAlpha ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setAlpha(F)V
/* .line 75 */
p1 = this.q;
c.h.n.v0 .a ( p1 );
(( c.h.n.c1 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/h/n/c1;->a(F)Lc/h/n/c1;
this.t = p1;
/* .line 76 */
/* new-instance v0, Lc/b/k/b0; */
/* invoke-direct {v0, p0}, Lc/b/k/b0;-><init>(Lc/b/k/n0;)V */
(( c.h.n.c1 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/h/n/c1;->a(Lc/h/n/d1;)Lc/h/n/c1;
/* .line 77 */
} // :cond_8
p1 = this.q;
(( android.view.ViewGroup ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V
/* .line 78 */
p1 = this.q;
(( androidx.appcompat.widget.ActionBarContextView ) p1 ).setVisibility ( v2 ); // invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V
/* .line 79 */
p1 = this.q;
/* const/16 v0, 0x20 */
(( android.view.ViewGroup ) p1 ).sendAccessibilityEvent ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V
/* .line 80 */
p1 = this.q;
(( android.view.ViewGroup ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
/* instance-of p1, p1, Landroid/view/View; */
if ( p1 != null) { // if-eqz p1, :cond_9
/* .line 81 */
p1 = this.q;
(( android.view.ViewGroup ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
/* check-cast p1, Landroid/view/View; */
c.h.n.v0 .I ( p1 );
/* .line 82 */
} // :cond_9
} // :goto_4
p1 = this.r;
if ( p1 != null) { // if-eqz p1, :cond_b
/* .line 83 */
p1 = this.g;
(( android.view.Window ) p1 ).getDecorView ( ); // invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
v0 = this.s;
(( android.view.View ) p1 ).post ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
/* .line 84 */
} // :cond_a
this.p = v1;
/* .line 85 */
} // :cond_b
} // :goto_5
p1 = this.p;
if ( p1 != null) { // if-eqz p1, :cond_c
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_c
/* .line 86 */
/* .line 87 */
} // :cond_c
p1 = this.p;
} // .end method
public void b ( android.os.Bundle p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.b.k.n0 ) p0 ).r ( ); // invoke-virtual {p0}, Lc/b/k/n0;->r()V
return;
} // .end method
public void b ( android.view.View p0, android.view.ViewGroup$LayoutParams p1 ) {
/* .locals 2 */
/* .line 7 */
(( c.b.k.n0 ) p0 ).r ( ); // invoke-virtual {p0}, Lc/b/k/n0;->r()V
/* .line 8 */
v0 = this.w;
/* const v1, 0x1020002 */
(( android.view.ViewGroup ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/view/ViewGroup; */
/* .line 9 */
(( android.view.ViewGroup ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V
/* .line 10 */
(( android.view.ViewGroup ) v0 ).addView ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 11 */
p1 = this.h;
(( c.b.p.n ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/p/n;->a()Landroid/view/Window$Callback;
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 2 */
/* .line 131 */
/* iget-boolean v0, p0, Lc/b/k/n0;->G:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 132 */
/* iput-boolean v0, p0, Lc/b/k/n0;->G:Z */
/* .line 133 */
v0 = this.m;
/* .line 134 */
(( c.b.k.n0 ) p0 ).x ( ); // invoke-virtual {p0}, Lc/b/k/n0;->x()Landroid/view/Window$Callback;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 135 */
/* iget-boolean v1, p0, Lc/b/k/n0;->N:Z */
/* if-nez v1, :cond_1 */
/* const/16 v1, 0x6c */
/* .line 136 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
/* .line 137 */
/* iput-boolean p1, p0, Lc/b/k/n0;->G:Z */
return;
} // .end method
public Boolean b ( Integer p0 ) {
/* .locals 4 */
/* .line 12 */
p1 = (( c.b.k.n0 ) p0 ).k ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/n0;->k(I)I
/* .line 13 */
/* iget-boolean v0, p0, Lc/b/k/n0;->F:Z */
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x6c */
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-ne p1, v2, :cond_0 */
/* .line 14 */
} // :cond_0
/* iget-boolean v0, p0, Lc/b/k/n0;->B:Z */
int v3 = 1; // const/4 v3, 0x1
if ( v0 != null) { // if-eqz v0, :cond_1
/* if-ne p1, v3, :cond_1 */
/* .line 15 */
/* iput-boolean v1, p0, Lc/b/k/n0;->B:Z */
} // :cond_1
/* if-eq p1, v3, :cond_7 */
int v0 = 2; // const/4 v0, 0x2
/* if-eq p1, v0, :cond_6 */
int v0 = 5; // const/4 v0, 0x5
/* if-eq p1, v0, :cond_5 */
/* const/16 v0, 0xa */
/* if-eq p1, v0, :cond_4 */
/* if-eq p1, v2, :cond_3 */
/* const/16 v0, 0x6d */
/* if-eq p1, v0, :cond_2 */
/* .line 16 */
v0 = this.g;
p1 = (( android.view.Window ) v0 ).requestFeature ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z
/* .line 17 */
} // :cond_2
(( c.b.k.n0 ) p0 ).E ( ); // invoke-virtual {p0}, Lc/b/k/n0;->E()V
/* .line 18 */
/* iput-boolean v3, p0, Lc/b/k/n0;->C:Z */
/* .line 19 */
} // :cond_3
(( c.b.k.n0 ) p0 ).E ( ); // invoke-virtual {p0}, Lc/b/k/n0;->E()V
/* .line 20 */
/* iput-boolean v3, p0, Lc/b/k/n0;->B:Z */
/* .line 21 */
} // :cond_4
(( c.b.k.n0 ) p0 ).E ( ); // invoke-virtual {p0}, Lc/b/k/n0;->E()V
/* .line 22 */
/* iput-boolean v3, p0, Lc/b/k/n0;->D:Z */
/* .line 23 */
} // :cond_5
(( c.b.k.n0 ) p0 ).E ( ); // invoke-virtual {p0}, Lc/b/k/n0;->E()V
/* .line 24 */
/* iput-boolean v3, p0, Lc/b/k/n0;->A:Z */
/* .line 25 */
} // :cond_6
(( c.b.k.n0 ) p0 ).E ( ); // invoke-virtual {p0}, Lc/b/k/n0;->E()V
/* .line 26 */
/* iput-boolean v3, p0, Lc/b/k/n0;->z:Z */
/* .line 27 */
} // :cond_7
(( c.b.k.n0 ) p0 ).E ( ); // invoke-virtual {p0}, Lc/b/k/n0;->E()V
/* .line 28 */
/* iput-boolean v3, p0, Lc/b/k/n0;->F:Z */
} // .end method
public final Boolean b ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
/* .line 138 */
v0 = (( android.view.KeyEvent ) p2 ).getRepeatCount ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 139 */
(( c.b.k.n0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;
/* .line 140 */
/* iget-boolean v0, p1, Lc/b/k/l0;->o:Z */
/* if-nez v0, :cond_0 */
/* .line 141 */
p1 = (( c.b.k.n0 ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/b/k/n0;->b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Boolean b ( Integer p0, Boolean p1 ) {
/* .locals 8 */
/* .line 142 */
v0 = this.f;
(( android.content.Context ) v0 ).getApplicationContext ( ); // invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* .line 143 */
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* iget v0, v0, Landroid/content/res/Configuration;->uiMode:I */
/* and-int/lit8 v0, v0, 0x30 */
int v1 = 1; // const/4 v1, 0x1
/* if-eq p1, v1, :cond_1 */
int v2 = 2; // const/4 v2, 0x2
/* if-eq p1, v2, :cond_0 */
/* move v2, v0 */
} // :cond_0
/* const/16 v2, 0x20 */
} // :cond_1
/* const/16 v2, 0x10 */
/* .line 144 */
} // :goto_0
v3 = (( c.b.k.n0 ) p0 ).z ( ); // invoke-virtual {p0}, Lc/b/k/n0;->z()Z
/* .line 145 */
/* sget-boolean v4, Lc/b/k/n0;->f0:Z */
/* const/16 v5, 0x11 */
int v6 = 0; // const/4 v6, 0x0
/* if-nez v4, :cond_2 */
/* if-eq v2, v0, :cond_3 */
} // :cond_2
/* if-nez v3, :cond_3 */
/* if-lt v0, v5, :cond_3 */
/* iget-boolean v0, p0, Lc/b/k/n0;->K:Z */
/* if-nez v0, :cond_3 */
v0 = this.e;
/* instance-of v0, v0, Landroid/view/ContextThemeWrapper; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 146 */
/* new-instance v0, Landroid/content/res/Configuration; */
/* invoke-direct {v0}, Landroid/content/res/Configuration;-><init>()V */
/* .line 147 */
/* iget v4, v0, Landroid/content/res/Configuration;->uiMode:I */
/* and-int/lit8 v4, v4, -0x31 */
/* or-int/2addr v4, v2 */
/* iput v4, v0, Landroid/content/res/Configuration;->uiMode:I */
/* .line 148 */
try { // :try_start_0
v4 = this.e;
/* check-cast v4, Landroid/view/ContextThemeWrapper; */
(( android.view.ContextThemeWrapper ) v4 ).applyOverrideConfiguration ( v0 ); // invoke-virtual {v4, v0}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
int v6 = 1; // const/4 v6, 0x1
/* :catch_0 */
/* move-exception v0 */
final String v4 = "AppCompatDelegate"; // const-string v4, "AppCompatDelegate"
final String v7 = "updateForNightMode.Calling applyOverrideConfiguration() failed with an exception.Will fall back to using Resources.updateConfiguration()"; // const-string v7, "updateForNightMode.Calling applyOverrideConfiguration() failed with an exception.Will fall back to using Resources.updateConfiguration()"
/* .line 149 */
android.util.Log .e ( v4,v7,v0 );
/* .line 150 */
} // :cond_3
} // :goto_1
v0 = this.f;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* iget v0, v0, Landroid/content/res/Configuration;->uiMode:I */
/* and-int/lit8 v0, v0, 0x30 */
/* if-nez v6, :cond_5 */
/* if-eq v0, v2, :cond_5 */
if ( p2 != null) { // if-eqz p2, :cond_5
/* if-nez v3, :cond_5 */
/* .line 151 */
/* iget-boolean p2, p0, Lc/b/k/n0;->K:Z */
if ( p2 != null) { // if-eqz p2, :cond_5
/* if-ge p2, v5, :cond_4 */
/* iget-boolean p2, p0, Lc/b/k/n0;->L:Z */
if ( p2 != null) { // if-eqz p2, :cond_5
} // :cond_4
p2 = this.e;
/* instance-of v4, p2, Landroid/app/Activity; */
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 152 */
/* check-cast p2, Landroid/app/Activity; */
c.h.e.f .b ( p2 );
int v6 = 1; // const/4 v6, 0x1
} // :cond_5
/* if-nez v6, :cond_6 */
/* if-eq v0, v2, :cond_6 */
/* .line 153 */
(( c.b.k.n0 ) p0 ).c ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lc/b/k/n0;->c(IZ)V
} // :cond_6
/* move v1, v6 */
} // :goto_2
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 154 */
p2 = this.e;
/* instance-of v0, p2, Lc/b/k/r; */
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 155 */
/* check-cast p2, Lc/b/k/r; */
(( c.b.k.r ) p2 ).d ( p1 ); // invoke-virtual {p2, p1}, Lc/b/k/r;->d(I)V
} // :cond_7
} // .end method
public final Boolean b ( c.b.k.l0 p0 ) {
/* .locals 2 */
/* .line 88 */
(( c.b.k.n0 ) p0 ).t ( ); // invoke-virtual {p0}, Lc/b/k/n0;->t()Landroid/content/Context;
(( c.b.k.l0 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/b/k/l0;->a(Landroid/content/Context;)V
/* .line 89 */
/* new-instance v0, Lc/b/k/k0; */
v1 = this.l;
/* invoke-direct {v0, p0, v1}, Lc/b/k/k0;-><init>(Lc/b/k/n0;Landroid/content/Context;)V */
this.g = v0;
/* const/16 v0, 0x51 */
/* .line 90 */
/* iput v0, p1, Lc/b/k/l0;->c:I */
int p1 = 1; // const/4 p1, 0x1
} // .end method
public final Boolean b ( c.b.k.l0 p0, android.view.KeyEvent p1 ) {
/* .locals 8 */
/* .line 91 */
/* iget-boolean v0, p0, Lc/b/k/n0;->N:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 92 */
} // :cond_0
/* iget-boolean v0, p1, Lc/b/k/l0;->m:Z */
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 93 */
} // :cond_1
v0 = this.I;
if ( v0 != null) { // if-eqz v0, :cond_2
/* if-eq v0, p1, :cond_2 */
/* .line 94 */
(( c.b.k.n0 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V
/* .line 95 */
} // :cond_2
(( c.b.k.n0 ) p0 ).x ( ); // invoke-virtual {p0}, Lc/b/k/n0;->x()Landroid/view/Window$Callback;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 96 */
/* iget v3, p1, Lc/b/k/l0;->a:I */
this.i = v3;
/* .line 97 */
} // :cond_3
/* iget v3, p1, Lc/b/k/l0;->a:I */
if ( v3 != null) { // if-eqz v3, :cond_5
/* const/16 v4, 0x6c */
/* if-ne v3, v4, :cond_4 */
} // :cond_4
int v3 = 0; // const/4 v3, 0x0
} // :cond_5
} // :goto_0
int v3 = 1; // const/4 v3, 0x1
} // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 98 */
v4 = this.m;
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 99 */
/* .line 100 */
} // :cond_6
v4 = this.i;
/* if-nez v4, :cond_15 */
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 101 */
(( c.b.k.n0 ) p0 ).C ( ); // invoke-virtual {p0}, Lc/b/k/n0;->C()Lc/b/k/a;
/* instance-of v4, v4, Lc/b/k/x0; */
/* if-nez v4, :cond_15 */
/* .line 102 */
} // :cond_7
v4 = this.j;
int v5 = 0; // const/4 v5, 0x0
if ( v4 != null) { // if-eqz v4, :cond_8
/* iget-boolean v4, p1, Lc/b/k/l0;->r:Z */
if ( v4 != null) { // if-eqz v4, :cond_f
/* .line 103 */
} // :cond_8
v4 = this.j;
/* if-nez v4, :cond_a */
/* .line 104 */
v4 = (( c.b.k.n0 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/n0;->c(Lc/b/k/l0;)Z
if ( v4 != null) { // if-eqz v4, :cond_9
v4 = this.j;
/* if-nez v4, :cond_a */
} // :cond_9
} // :cond_a
if ( v3 != null) { // if-eqz v3, :cond_c
/* .line 105 */
v4 = this.m;
if ( v4 != null) { // if-eqz v4, :cond_c
/* .line 106 */
v4 = this.n;
/* if-nez v4, :cond_b */
/* .line 107 */
/* new-instance v4, Lc/b/k/c0; */
/* invoke-direct {v4, p0}, Lc/b/k/c0;-><init>(Lc/b/k/n0;)V */
this.n = v4;
/* .line 108 */
} // :cond_b
v4 = this.m;
v6 = this.j;
v7 = this.n;
/* .line 109 */
} // :cond_c
v4 = this.j;
(( c.b.p.o.m ) v4 ).s ( ); // invoke-virtual {v4}, Lc/b/p/o/m;->s()V
/* .line 110 */
/* iget v4, p1, Lc/b/k/l0;->a:I */
v4 = v6 = this.j;
/* if-nez v4, :cond_e */
/* .line 111 */
(( c.b.k.l0 ) p1 ).a ( v5 ); // invoke-virtual {p1, v5}, Lc/b/k/l0;->a(Lc/b/p/o/m;)V
if ( v3 != null) { // if-eqz v3, :cond_d
/* .line 112 */
p1 = this.m;
if ( p1 != null) { // if-eqz p1, :cond_d
/* .line 113 */
p2 = this.n;
} // :cond_d
/* .line 114 */
} // :cond_e
/* iput-boolean v1, p1, Lc/b/k/l0;->r:Z */
/* .line 115 */
} // :cond_f
v4 = this.j;
(( c.b.p.o.m ) v4 ).s ( ); // invoke-virtual {v4}, Lc/b/p/o/m;->s()V
/* .line 116 */
v4 = this.s;
if ( v4 != null) { // if-eqz v4, :cond_10
/* .line 117 */
v6 = this.j;
(( c.b.p.o.m ) v6 ).a ( v4 ); // invoke-virtual {v6, v4}, Lc/b/p/o/m;->a(Landroid/os/Bundle;)V
/* .line 118 */
this.s = v5;
/* .line 119 */
} // :cond_10
v4 = this.i;
v0 = v6 = this.j;
/* if-nez v0, :cond_12 */
if ( v3 != null) { // if-eqz v3, :cond_11
/* .line 120 */
p2 = this.m;
if ( p2 != null) { // if-eqz p2, :cond_11
/* .line 121 */
v0 = this.n;
/* .line 122 */
} // :cond_11
p1 = this.j;
(( c.b.p.o.m ) p1 ).r ( ); // invoke-virtual {p1}, Lc/b/p/o/m;->r()V
} // :cond_12
if ( p2 != null) { // if-eqz p2, :cond_13
/* .line 123 */
p2 = (( android.view.KeyEvent ) p2 ).getDeviceId ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I
} // :cond_13
int p2 = -1; // const/4 p2, -0x1
/* .line 124 */
} // :goto_2
android.view.KeyCharacterMap .load ( p2 );
/* .line 125 */
p2 = (( android.view.KeyCharacterMap ) p2 ).getKeyboardType ( ); // invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I
/* if-eq p2, v2, :cond_14 */
int p2 = 1; // const/4 p2, 0x1
} // :cond_14
int p2 = 0; // const/4 p2, 0x0
} // :goto_3
/* iput-boolean p2, p1, Lc/b/k/l0;->p:Z */
/* .line 126 */
v0 = this.j;
(( c.b.p.o.m ) v0 ).setQwertyMode ( p2 ); // invoke-virtual {v0, p2}, Lc/b/p/o/m;->setQwertyMode(Z)V
/* .line 127 */
p2 = this.j;
(( c.b.p.o.m ) p2 ).r ( ); // invoke-virtual {p2}, Lc/b/p/o/m;->r()V
/* .line 128 */
} // :cond_15
/* iput-boolean v2, p1, Lc/b/k/l0;->m:Z */
/* .line 129 */
/* iput-boolean v1, p1, Lc/b/k/l0;->n:Z */
/* .line 130 */
this.I = p1;
} // .end method
public c.b.k.a c ( ) {
/* .locals 1 */
/* .line 1 */
(( c.b.k.n0 ) p0 ).y ( ); // invoke-virtual {p0}, Lc/b/k/n0;->y()V
/* .line 2 */
v0 = this.j;
} // .end method
public void c ( Integer p0 ) {
/* .locals 2 */
/* .line 3 */
(( c.b.k.n0 ) p0 ).r ( ); // invoke-virtual {p0}, Lc/b/k/n0;->r()V
/* .line 4 */
v0 = this.w;
/* const v1, 0x1020002 */
(( android.view.ViewGroup ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/view/ViewGroup; */
/* .line 5 */
(( android.view.ViewGroup ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V
/* .line 6 */
v1 = this.f;
android.view.LayoutInflater .from ( v1 );
(( android.view.LayoutInflater ) v1 ).inflate ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
/* .line 7 */
p1 = this.h;
(( c.b.p.n ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/p/n;->a()Landroid/view/Window$Callback;
return;
} // .end method
public final void c ( Integer p0, Boolean p1 ) {
/* .locals 3 */
/* .line 41 */
v0 = this.f;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 42 */
/* new-instance v1, Landroid/content/res/Configuration; */
(( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V */
/* .line 43 */
(( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* iget v2, v2, Landroid/content/res/Configuration;->uiMode:I */
/* and-int/lit8 v2, v2, -0x31 */
/* or-int/2addr p1, v2 */
/* iput p1, v1, Landroid/content/res/Configuration;->uiMode:I */
int p1 = 0; // const/4 p1, 0x0
/* .line 44 */
(( android.content.res.Resources ) v0 ).updateConfiguration ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V
/* .line 45 */
/* const/16 v2, 0x1a */
/* if-ge p1, v2, :cond_0 */
/* .line 46 */
c.b.k.r0 .a ( v0 );
/* .line 47 */
} // :cond_0
/* iget p1, p0, Lc/b/k/n0;->P:I */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 48 */
v0 = this.f;
(( android.content.Context ) v0 ).setTheme ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->setTheme(I)V
/* .line 49 */
/* const/16 v0, 0x17 */
/* if-lt p1, v0, :cond_1 */
/* .line 50 */
p1 = this.f;
(( android.content.Context ) p1 ).getTheme ( ); // invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
/* iget v0, p0, Lc/b/k/n0;->P:I */
int v2 = 1; // const/4 v2, 0x1
(( android.content.res.Resources$Theme ) p1 ).applyStyle ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 51 */
p1 = this.e;
/* instance-of p2, p1, Landroid/app/Activity; */
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 52 */
/* check-cast p1, Landroid/app/Activity; */
/* .line 53 */
/* instance-of p2, p1, Lc/n/j; */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 54 */
/* move-object p2, p1 */
/* check-cast p2, Lc/n/j; */
/* .line 55 */
(( c.n.g ) p2 ).a ( ); // invoke-virtual {p2}, Lc/n/g;->a()Lc/n/g$b;
v0 = c.n.g$b.e;
p2 = (( c.n.g$b ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Lc/n/g$b;->a(Lc/n/g$b;)Z
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 56 */
(( android.app.Activity ) p1 ).onConfigurationChanged ( v1 ); // invoke-virtual {p1, v1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V
/* .line 57 */
} // :cond_2
/* iget-boolean p2, p0, Lc/b/k/n0;->M:Z */
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 58 */
(( android.app.Activity ) p1 ).onConfigurationChanged ( v1 ); // invoke-virtual {p1, v1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V
} // :cond_3
} // :goto_0
return;
} // .end method
public void c ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .line 8 */
/* iget p1, p0, Lc/b/k/n0;->O:I */
/* const/16 v0, -0x64 */
/* if-eq p1, v0, :cond_0 */
/* .line 9 */
p1 = c.b.k.n0.b0;
v0 = this.e;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* iget v1, p0, Lc/b/k/n0;->O:I */
java.lang.Integer .valueOf ( v1 );
} // :cond_0
return;
} // .end method
public Boolean c ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 3 */
/* .line 10 */
(( c.b.k.n0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 11 */
p1 = (( c.b.k.a ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/k/a;->a(ILandroid/view/KeyEvent;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 12 */
} // :cond_0
p1 = this.I;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 13 */
v0 = (( android.view.KeyEvent ) p2 ).getKeyCode ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I
p1 = (( c.b.k.n0 ) p0 ).a ( p1, v0, p2, v1 ); // invoke-virtual {p0, p1, v0, p2, v1}, Lc/b/k/n0;->a(Lc/b/k/l0;ILandroid/view/KeyEvent;I)Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 14 */
p1 = this.I;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 15 */
/* iput-boolean v1, p1, Lc/b/k/l0;->n:Z */
} // :cond_1
/* .line 16 */
} // :cond_2
p1 = this.I;
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_3 */
/* .line 17 */
(( c.b.k.n0 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;
/* .line 18 */
(( c.b.k.n0 ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/b/k/n0;->b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z
/* .line 19 */
v2 = (( android.view.KeyEvent ) p2 ).getKeyCode ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I
p2 = (( c.b.k.n0 ) p0 ).a ( p1, v2, p2, v1 ); // invoke-virtual {p0, p1, v2, p2, v1}, Lc/b/k/n0;->a(Lc/b/k/l0;ILandroid/view/KeyEvent;I)Z
/* .line 20 */
/* iput-boolean v0, p1, Lc/b/k/l0;->m:Z */
if ( p2 != null) { // if-eqz p2, :cond_3
} // :cond_3
} // .end method
public final Boolean c ( c.b.k.l0 p0 ) {
/* .locals 6 */
/* .line 21 */
v0 = this.f;
/* .line 22 */
/* iget v1, p1, Lc/b/k/l0;->a:I */
int v2 = 1; // const/4 v2, 0x1
if ( v1 != null) { // if-eqz v1, :cond_0
/* const/16 v3, 0x6c */
/* if-ne v1, v3, :cond_4 */
} // :cond_0
v1 = this.m;
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 23 */
/* new-instance v1, Landroid/util/TypedValue; */
/* invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V */
/* .line 24 */
(( android.content.Context ) v0 ).getTheme ( ); // invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
/* .line 25 */
(( android.content.res.Resources$Theme ) v3 ).resolveAttribute ( v4, v1, v2 ); // invoke-virtual {v3, v4, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
int v4 = 0; // const/4 v4, 0x0
/* .line 26 */
/* iget v5, v1, Landroid/util/TypedValue;->resourceId:I */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 27 */
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v4 ).newTheme ( ); // invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;
/* .line 28 */
(( android.content.res.Resources$Theme ) v4 ).setTo ( v3 ); // invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V
/* .line 29 */
/* iget v5, v1, Landroid/util/TypedValue;->resourceId:I */
(( android.content.res.Resources$Theme ) v4 ).applyStyle ( v5, v2 ); // invoke-virtual {v4, v5, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V
/* .line 30 */
(( android.content.res.Resources$Theme ) v4 ).resolveAttribute ( v5, v1, v2 ); // invoke-virtual {v4, v5, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
/* .line 31 */
} // :cond_1
(( android.content.res.Resources$Theme ) v3 ).resolveAttribute ( v5, v1, v2 ); // invoke-virtual {v3, v5, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
/* .line 32 */
} // :goto_0
/* iget v5, v1, Landroid/util/TypedValue;->resourceId:I */
if ( v5 != null) { // if-eqz v5, :cond_3
/* if-nez v4, :cond_2 */
/* .line 33 */
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v4 ).newTheme ( ); // invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;
/* .line 34 */
(( android.content.res.Resources$Theme ) v4 ).setTo ( v3 ); // invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V
/* .line 35 */
} // :cond_2
/* iget v1, v1, Landroid/util/TypedValue;->resourceId:I */
(( android.content.res.Resources$Theme ) v4 ).applyStyle ( v1, v2 ); // invoke-virtual {v4, v1, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V
} // :cond_3
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 36 */
/* new-instance v1, Lc/b/p/e; */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v1, v0, v3}, Lc/b/p/e;-><init>(Landroid/content/Context;I)V */
/* .line 37 */
(( c.b.p.e ) v1 ).getTheme ( ); // invoke-virtual {v1}, Lc/b/p/e;->getTheme()Landroid/content/res/Resources$Theme;
(( android.content.res.Resources$Theme ) v0 ).setTo ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V
/* move-object v0, v1 */
/* .line 38 */
} // :cond_4
/* new-instance v1, Lc/b/p/o/m; */
/* invoke-direct {v1, v0}, Lc/b/p/o/m;-><init>(Landroid/content/Context;)V */
/* .line 39 */
(( c.b.p.o.m ) v1 ).a ( p0 ); // invoke-virtual {v1, p0}, Lc/b/p/o/m;->a(Lc/b/p/o/m$a;)V
/* .line 40 */
(( c.b.k.l0 ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lc/b/k/l0;->a(Lc/b/p/o/m;)V
} // .end method
public void d ( ) {
/* .locals 2 */
/* .line 9 */
v0 = this.f;
android.view.LayoutInflater .from ( v0 );
/* .line 10 */
(( android.view.LayoutInflater ) v0 ).getFactory ( ); // invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;
/* if-nez v1, :cond_0 */
/* .line 11 */
c.h.n.l .b ( v0,p0 );
/* .line 12 */
} // :cond_0
(( android.view.LayoutInflater ) v0 ).getFactory2 ( ); // invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;
/* instance-of v0, v0, Lc/b/k/n0; */
/* if-nez v0, :cond_1 */
final String v0 = "AppCompatDelegate"; // const-string v0, "AppCompatDelegate"
final String v1 = "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"; // const-string v1, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"
/* .line 13 */
android.util.Log .i ( v0,v1 );
} // :cond_1
} // :goto_0
return;
} // .end method
public void d ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lc/b/k/n0;->P:I */
return;
} // .end method
public Boolean d ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 3 */
int v0 = 4; // const/4 v0, 0x4
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* if-eq p1, v0, :cond_1 */
/* const/16 v0, 0x52 */
/* if-eq p1, v0, :cond_0 */
/* .line 2 */
} // :cond_0
(( c.b.k.n0 ) p0 ).e ( v2, p2 ); // invoke-virtual {p0, v2, p2}, Lc/b/k/n0;->e(ILandroid/view/KeyEvent;)Z
/* .line 3 */
} // :cond_1
/* iget-boolean p1, p0, Lc/b/k/n0;->J:Z */
/* .line 4 */
/* iput-boolean v2, p0, Lc/b/k/n0;->J:Z */
/* .line 5 */
(( c.b.k.n0 ) p0 ).a ( v2, v2 ); // invoke-virtual {p0, v2, v2}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 6 */
/* iget-boolean v0, p2, Lc/b/k/l0;->o:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* if-nez p1, :cond_2 */
/* .line 7 */
(( c.b.k.n0 ) p0 ).a ( p2, v1 ); // invoke-virtual {p0, p2, v1}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V
} // :cond_2
/* .line 8 */
} // :cond_3
p1 = (( c.b.k.n0 ) p0 ).B ( ); // invoke-virtual {p0}, Lc/b/k/n0;->B()Z
if ( p1 != null) { // if-eqz p1, :cond_4
} // :cond_4
} // :goto_0
} // .end method
public void e ( ) {
/* .locals 1 */
/* .line 1 */
(( c.b.k.n0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( c.b.k.a ) v0 ).i ( ); // invoke-virtual {v0}, Lc/b/k/a;->i()Z
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( c.b.k.n0 ) p0 ).g ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/n0;->g(I)V
return;
} // .end method
public void e ( Integer p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
(( c.b.k.n0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;
(( c.b.k.n0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V
return;
} // .end method
public final Boolean e ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 3 */
/* .line 5 */
v0 = this.p;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 6 */
(( c.b.k.n0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;
/* if-nez p1, :cond_2 */
/* .line 7 */
p1 = this.m;
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = /* .line 8 */
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = this.f;
/* .line 9 */
android.view.ViewConfiguration .get ( p1 );
p1 = (( android.view.ViewConfiguration ) p1 ).hasPermanentMenuKey ( ); // invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z
/* if-nez p1, :cond_2 */
/* .line 10 */
p1 = p1 = this.m;
/* if-nez p1, :cond_1 */
/* .line 11 */
/* iget-boolean p1, p0, Lc/b/k/n0;->N:Z */
/* if-nez p1, :cond_5 */
p1 = (( c.b.k.n0 ) p0 ).b ( v2, p2 ); // invoke-virtual {p0, v2, p2}, Lc/b/k/n0;->b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 12 */
v0 = p1 = this.m;
/* .line 13 */
} // :cond_1
v0 = p1 = this.m;
/* .line 14 */
} // :cond_2
/* iget-boolean p1, v2, Lc/b/k/l0;->o:Z */
/* if-nez p1, :cond_6 */
/* iget-boolean p1, v2, Lc/b/k/l0;->n:Z */
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 15 */
} // :cond_3
/* iget-boolean p1, v2, Lc/b/k/l0;->m:Z */
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 16 */
/* iget-boolean p1, v2, Lc/b/k/l0;->r:Z */
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 17 */
/* iput-boolean v1, v2, Lc/b/k/l0;->m:Z */
/* .line 18 */
p1 = (( c.b.k.n0 ) p0 ).b ( v2, p2 ); // invoke-virtual {p0, v2, p2}, Lc/b/k/n0;->b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z
} // :cond_4
int p1 = 1; // const/4 p1, 0x1
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 19 */
(( c.b.k.n0 ) p0 ).a ( v2, p2 ); // invoke-virtual {p0, v2, p2}, Lc/b/k/n0;->a(Lc/b/k/l0;Landroid/view/KeyEvent;)V
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
/* .line 20 */
} // :cond_6
} // :goto_1
/* iget-boolean p1, v2, Lc/b/k/l0;->o:Z */
/* .line 21 */
(( c.b.k.n0 ) p0 ).a ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V
/* move v0, p1 */
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 22 */
p1 = this.f;
final String p2 = "audio"; // const-string p2, "audio"
(( android.content.Context ) p1 ).getSystemService ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p1, Landroid/media/AudioManager; */
if ( p1 != null) { // if-eqz p1, :cond_7
/* .line 23 */
(( android.media.AudioManager ) p1 ).playSoundEffect ( v1 ); // invoke-virtual {p1, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V
} // :cond_7
final String p1 = "AppCompatDelegate"; // const-string p1, "AppCompatDelegate"
final String p2 = "Couldn\'t get audio manager"; // const-string p2, "Couldn\'t get audio manager"
/* .line 24 */
android.util.Log .w ( p1,p2 );
} // :cond_8
} // :goto_3
} // .end method
public void f ( ) {
/* .locals 2 */
/* .line 1 */
c.b.k.t .b ( p0 );
/* .line 2 */
/* iget-boolean v0, p0, Lc/b/k/n0;->U:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.g;
(( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
v1 = this.W;
(( android.view.View ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p0, Lc/b/k/n0;->M:Z */
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
/* iput-boolean v0, p0, Lc/b/k/n0;->N:Z */
/* .line 6 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
(( c.b.k.a ) v0 ).j ( ); // invoke-virtual {v0}, Lc/b/k/a;->j()V
/* .line 8 */
} // :cond_1
(( c.b.k.n0 ) p0 ).n ( ); // invoke-virtual {p0}, Lc/b/k/n0;->n()V
return;
} // .end method
public void f ( Integer p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* .line 9 */
(( c.b.k.n0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;
/* .line 10 */
v2 = this.j;
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 11 */
/* new-instance v2, Landroid/os/Bundle; */
/* invoke-direct {v2}, Landroid/os/Bundle;-><init>()V */
/* .line 12 */
v3 = this.j;
(( c.b.p.o.m ) v3 ).b ( v2 ); // invoke-virtual {v3, v2}, Lc/b/p/o/m;->b(Landroid/os/Bundle;)V
/* .line 13 */
v3 = (( android.os.Bundle ) v2 ).size ( ); // invoke-virtual {v2}, Landroid/os/Bundle;->size()I
/* if-lez v3, :cond_0 */
/* .line 14 */
this.s = v2;
/* .line 15 */
} // :cond_0
v2 = this.j;
(( c.b.p.o.m ) v2 ).s ( ); // invoke-virtual {v2}, Lc/b/p/o/m;->s()V
/* .line 16 */
v2 = this.j;
(( c.b.p.o.m ) v2 ).clear ( ); // invoke-virtual {v2}, Lc/b/p/o/m;->clear()V
/* .line 17 */
} // :cond_1
/* iput-boolean v0, v1, Lc/b/k/l0;->r:Z */
/* .line 18 */
/* iput-boolean v0, v1, Lc/b/k/l0;->q:Z */
/* const/16 v0, 0x6c */
/* if-eq p1, v0, :cond_2 */
/* if-nez p1, :cond_3 */
/* .line 19 */
} // :cond_2
p1 = this.m;
if ( p1 != null) { // if-eqz p1, :cond_3
int p1 = 0; // const/4 p1, 0x0
/* .line 20 */
(( c.b.k.n0 ) p0 ).a ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 21 */
/* iput-boolean p1, v0, Lc/b/k/l0;->m:Z */
int p1 = 0; // const/4 p1, 0x0
/* .line 22 */
(( c.b.k.n0 ) p0 ).b ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lc/b/k/n0;->b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z
} // :cond_3
return;
} // .end method
public void g ( ) {
/* .locals 2 */
/* .line 1 */
(( c.b.k.n0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 2 */
(( c.b.k.a ) v0 ).e ( v1 ); // invoke-virtual {v0, v1}, Lc/b/k/a;->e(Z)V
} // :cond_0
return;
} // .end method
public final void g ( Integer p0 ) {
/* .locals 2 */
/* .line 3 */
/* iget v0, p0, Lc/b/k/n0;->V:I */
int v1 = 1; // const/4 v1, 0x1
/* shl-int p1, v1, p1 */
/* or-int/2addr p1, v0 */
/* iput p1, p0, Lc/b/k/n0;->V:I */
/* .line 4 */
/* iget-boolean p1, p0, Lc/b/k/n0;->U:Z */
/* if-nez p1, :cond_0 */
/* .line 5 */
p1 = this.g;
(( android.view.Window ) p1 ).getDecorView ( ); // invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
v0 = this.W;
c.h.n.v0 .a ( p1,v0 );
/* .line 6 */
/* iput-boolean v1, p0, Lc/b/k/n0;->U:Z */
} // :cond_0
return;
} // .end method
public Integer h ( Integer p0 ) {
/* .locals 2 */
/* const/16 v0, -0x64 */
int v1 = -1; // const/4 v1, -0x1
/* if-eq p1, v0, :cond_4 */
/* if-eq p1, v1, :cond_3 */
if ( p1 != null) { // if-eqz p1, :cond_1
int v0 = 1; // const/4 v0, 0x1
/* if-eq p1, v0, :cond_3 */
int v0 = 2; // const/4 v0, 0x2
/* if-eq p1, v0, :cond_3 */
int v0 = 3; // const/4 v0, 0x3
/* if-ne p1, v0, :cond_0 */
/* .line 4 */
(( c.b.k.n0 ) p0 ).u ( ); // invoke-virtual {p0}, Lc/b/k/n0;->u()Lc/b/k/i0;
p1 = (( c.b.k.i0 ) p1 ).c ( ); // invoke-virtual {p1}, Lc/b/k/i0;->c()I
/* .line 5 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "Unknown value set for night mode.Please use one of the MODE_NIGHT values from AppCompatDelegate."; // const-string v0, "Unknown value set for night mode.Please use one of the MODE_NIGHT values from AppCompatDelegate."
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 6 */
} // :cond_1
/* const/16 v0, 0x17 */
/* if-lt p1, v0, :cond_2 */
/* .line 7 */
p1 = this.f;
/* const-class v0, Landroid/app/UiModeManager; */
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;
/* check-cast p1, Landroid/app/UiModeManager; */
/* .line 8 */
p1 = (( android.app.UiModeManager ) p1 ).getNightMode ( ); // invoke-virtual {p1}, Landroid/app/UiModeManager;->getNightMode()I
/* if-nez p1, :cond_2 */
/* .line 9 */
} // :cond_2
(( c.b.k.n0 ) p0 ).v ( ); // invoke-virtual {p0}, Lc/b/k/n0;->v()Lc/b/k/i0;
p1 = (( c.b.k.i0 ) p1 ).c ( ); // invoke-virtual {p1}, Lc/b/k/i0;->c()I
} // :cond_3
} // :cond_4
} // .end method
public void h ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Lc/b/k/n0;->M:Z */
/* .line 2 */
(( c.b.k.n0 ) p0 ).k ( ); // invoke-virtual {p0}, Lc/b/k/n0;->k()Z
/* .line 3 */
c.b.k.t .a ( p0 );
return;
} // .end method
public void i ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput-boolean v0, p0, Lc/b/k/n0;->M:Z */
/* .line 2 */
c.b.k.t .b ( p0 );
/* .line 3 */
(( c.b.k.n0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
(( c.b.k.a ) v1 ).e ( v0 ); // invoke-virtual {v1, v0}, Lc/b/k/a;->e(Z)V
/* .line 5 */
} // :cond_0
v0 = this.e;
/* instance-of v0, v0, Landroid/app/Dialog; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
(( c.b.k.n0 ) p0 ).n ( ); // invoke-virtual {p0}, Lc/b/k/n0;->n()V
} // :cond_1
return;
} // .end method
public void i ( Integer p0 ) {
/* .locals 1 */
/* const/16 v0, 0x6c */
/* if-ne p1, v0, :cond_0 */
/* .line 7 */
(( c.b.k.n0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 8 */
(( c.b.k.a ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Lc/b/k/a;->b(Z)V
} // :cond_0
return;
} // .end method
public void j ( Integer p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* const/16 v1, 0x6c */
/* if-ne p1, v1, :cond_0 */
/* .line 1 */
(( c.b.k.n0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 2 */
(( c.b.k.a ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Lc/b/k/a;->b(Z)V
} // :cond_0
/* if-nez p1, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
/* .line 3 */
(( c.b.k.n0 ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;
/* .line 4 */
/* iget-boolean v1, p1, Lc/b/k/l0;->o:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 5 */
(( c.b.k.n0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V
} // :cond_1
} // :goto_0
return;
} // .end method
public final Integer k ( Integer p0 ) {
/* .locals 2 */
final String v0 = "AppCompatDelegate"; // const-string v0, "AppCompatDelegate"
/* const/16 v1, 0x8 */
/* if-ne p1, v1, :cond_0 */
final String p1 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."; // const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."
/* .line 1 */
android.util.Log .i ( v0,p1 );
/* const/16 p1, 0x6c */
} // :cond_0
/* const/16 v1, 0x9 */
/* if-ne p1, v1, :cond_1 */
final String p1 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."; // const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."
/* .line 2 */
android.util.Log .i ( v0,p1 );
/* const/16 p1, 0x6d */
} // :cond_1
} // .end method
public Boolean k ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
v0 = (( c.b.k.n0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/n0;->a(Z)Z
} // .end method
public Integer l ( Integer p0 ) {
/* .locals 8 */
/* .line 28 */
v0 = this.q;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 29 */
(( android.view.ViewGroup ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 30 */
v0 = this.q;
/* .line 31 */
(( android.view.ViewGroup ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams; */
/* .line 32 */
v2 = this.q;
v2 = (( android.view.ViewGroup ) v2 ).isShown ( ); // invoke-virtual {v2}, Landroid/view/ViewGroup;->isShown()Z
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 33 */
v2 = this.Y;
/* if-nez v2, :cond_0 */
/* .line 34 */
/* new-instance v2, Landroid/graphics/Rect; */
/* invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V */
this.Y = v2;
/* .line 35 */
/* new-instance v2, Landroid/graphics/Rect; */
/* invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V */
this.Z = v2;
/* .line 36 */
} // :cond_0
v2 = this.Y;
/* .line 37 */
v4 = this.Z;
/* .line 38 */
(( android.graphics.Rect ) v2 ).set ( v1, p1, v1, v1 ); // invoke-virtual {v2, v1, p1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V
/* .line 39 */
v5 = this.w;
c.b.q.v2 .a ( v5,v2,v4 );
/* .line 40 */
/* iget v2, v4, Landroid/graphics/Rect;->top:I */
/* if-nez v2, :cond_1 */
/* move v2, p1 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
/* .line 41 */
} // :goto_0
/* iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* if-eq v4, v2, :cond_4 */
/* .line 42 */
/* iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* .line 43 */
v2 = this.y;
/* if-nez v2, :cond_2 */
/* .line 44 */
/* new-instance v2, Landroid/view/View; */
v4 = this.f;
/* invoke-direct {v2, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V */
this.y = v2;
/* .line 45 */
v4 = this.f;
(( android.content.Context ) v4 ).getResources ( ); // invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 46 */
v4 = (( android.content.res.Resources ) v4 ).getColor ( v5 ); // invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I
/* .line 47 */
(( android.view.View ) v2 ).setBackgroundColor ( v4 ); // invoke-virtual {v2, v4}, Landroid/view/View;->setBackgroundColor(I)V
/* .line 48 */
v2 = this.w;
v4 = this.y;
/* new-instance v5, Landroid/view/ViewGroup$LayoutParams; */
int v6 = -1; // const/4 v6, -0x1
/* invoke-direct {v5, v6, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
(( android.view.ViewGroup ) v2 ).addView ( v4, v6, v5 ); // invoke-virtual {v2, v4, v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
/* .line 49 */
} // :cond_2
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 50 */
/* iget v4, v2, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* if-eq v4, p1, :cond_3 */
/* .line 51 */
/* iput p1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* .line 52 */
v4 = this.y;
(( android.view.View ) v4 ).setLayoutParams ( v2 ); // invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
} // :cond_3
} // :goto_1
int v2 = 1; // const/4 v2, 0x1
} // :cond_4
int v2 = 0; // const/4 v2, 0x0
/* .line 53 */
} // :goto_2
v4 = this.y;
if ( v4 != null) { // if-eqz v4, :cond_5
} // :cond_5
int v3 = 0; // const/4 v3, 0x0
/* .line 54 */
} // :goto_3
/* iget-boolean v4, p0, Lc/b/k/n0;->D:Z */
/* if-nez v4, :cond_6 */
if ( v3 != null) { // if-eqz v3, :cond_6
int p1 = 0; // const/4 p1, 0x0
} // :cond_6
/* move v7, v3 */
/* move v3, v2 */
/* move v2, v7 */
/* .line 55 */
} // :cond_7
/* iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 56 */
/* iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
int v2 = 0; // const/4 v2, 0x0
} // :cond_8
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_4
if ( v3 != null) { // if-eqz v3, :cond_a
/* .line 57 */
v3 = this.q;
(( android.view.ViewGroup ) v3 ).setLayoutParams ( v0 ); // invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
} // :cond_9
int v2 = 0; // const/4 v2, 0x0
/* .line 58 */
} // :cond_a
} // :goto_5
v0 = this.y;
if ( v0 != null) { // if-eqz v0, :cond_c
if ( v2 != null) { // if-eqz v2, :cond_b
} // :cond_b
/* const/16 v1, 0x8 */
/* .line 59 */
} // :goto_6
(( android.view.View ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
} // :cond_c
} // .end method
public final void l ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.w;
/* const v1, 0x1020002 */
(( android.view.ViewGroup ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout; */
/* .line 2 */
v1 = this.g;
(( android.view.Window ) v1 ).getDecorView ( ); // invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
/* .line 3 */
v2 = (( android.view.View ) v1 ).getPaddingLeft ( ); // invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I
/* .line 4 */
v3 = (( android.view.View ) v1 ).getPaddingTop ( ); // invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I
v4 = (( android.view.View ) v1 ).getPaddingRight ( ); // invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I
/* .line 5 */
v1 = (( android.view.View ) v1 ).getPaddingBottom ( ); // invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I
/* .line 6 */
(( androidx.appcompat.widget.ContentFrameLayout ) v0 ).a ( v2, v3, v4, v1 ); // invoke-virtual {v0, v2, v3, v4, v1}, Landroidx/appcompat/widget/ContentFrameLayout;->a(IIII)V
/* .line 7 */
v1 = this.f;
v2 = c.b.j.AppCompatTheme;
(( android.content.Context ) v1 ).obtainStyledAttributes ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
/* .line 8 */
(( androidx.appcompat.widget.ContentFrameLayout ) v0 ).getMinWidthMajor ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;
(( android.content.res.TypedArray ) v1 ).getValue ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
/* .line 9 */
(( androidx.appcompat.widget.ContentFrameLayout ) v0 ).getMinWidthMinor ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;
(( android.content.res.TypedArray ) v1 ).getValue ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
/* .line 10 */
v2 = (( android.content.res.TypedArray ) v1 ).hasValue ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 11 */
/* .line 12 */
(( androidx.appcompat.widget.ContentFrameLayout ) v0 ).getFixedWidthMajor ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;
/* .line 13 */
(( android.content.res.TypedArray ) v1 ).getValue ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
/* .line 14 */
} // :cond_0
v2 = (( android.content.res.TypedArray ) v1 ).hasValue ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 15 */
/* .line 16 */
(( androidx.appcompat.widget.ContentFrameLayout ) v0 ).getFixedWidthMinor ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;
/* .line 17 */
(( android.content.res.TypedArray ) v1 ).getValue ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
/* .line 18 */
} // :cond_1
v2 = (( android.content.res.TypedArray ) v1 ).hasValue ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 19 */
/* .line 20 */
(( androidx.appcompat.widget.ContentFrameLayout ) v0 ).getFixedHeightMajor ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;
/* .line 21 */
(( android.content.res.TypedArray ) v1 ).getValue ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
/* .line 22 */
} // :cond_2
v2 = (( android.content.res.TypedArray ) v1 ).hasValue ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 23 */
/* .line 24 */
(( androidx.appcompat.widget.ContentFrameLayout ) v0 ).getFixedHeightMinor ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;
/* .line 25 */
(( android.content.res.TypedArray ) v1 ).getValue ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
/* .line 26 */
} // :cond_3
(( android.content.res.TypedArray ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V
/* .line 27 */
(( android.widget.FrameLayout ) v0 ).requestLayout ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->requestLayout()V
return;
} // .end method
public final Integer m ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/b/k/n0;->O:I */
/* const/16 v1, -0x64 */
/* if-eq v0, v1, :cond_0 */
} // :cond_0
v0 = c.b.k.t .j ( );
} // :goto_0
} // .end method
public final void n ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.S;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.k.i0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/k/i0;->a()V
/* .line 3 */
} // :cond_0
v0 = this.T;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
(( c.b.k.i0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/k/i0;->a()V
} // :cond_1
return;
} // .end method
public final android.view.ViewGroup o ( ) {
/* .locals 7 */
/* .line 1 */
v0 = this.f;
v1 = c.b.j.AppCompatTheme;
(( android.content.Context ) v0 ).obtainStyledAttributes ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
/* .line 2 */
v1 = (( android.content.res.TypedArray ) v0 ).hasValue ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v1 != null) { // if-eqz v1, :cond_11
/* .line 3 */
int v2 = 0; // const/4 v2, 0x0
v1 = (( android.content.res.TypedArray ) v0 ).getBoolean ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
int v3 = 1; // const/4 v3, 0x1
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
(( c.b.k.n0 ) p0 ).b ( v3 ); // invoke-virtual {p0, v3}, Lc/b/k/n0;->b(I)Z
/* .line 5 */
} // :cond_0
v1 = (( android.content.res.TypedArray ) v0 ).getBoolean ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* const/16 v1, 0x6c */
/* .line 6 */
(( c.b.k.n0 ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lc/b/k/n0;->b(I)Z
/* .line 7 */
} // :cond_1
} // :goto_0
v1 = (( android.content.res.TypedArray ) v0 ).getBoolean ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* const/16 v4, 0x6d */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 8 */
(( c.b.k.n0 ) p0 ).b ( v4 ); // invoke-virtual {p0, v4}, Lc/b/k/n0;->b(I)Z
/* .line 9 */
} // :cond_2
v1 = (( android.content.res.TypedArray ) v0 ).getBoolean ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* const/16 v1, 0xa */
/* .line 10 */
(( c.b.k.n0 ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lc/b/k/n0;->b(I)Z
/* .line 11 */
} // :cond_3
v1 = (( android.content.res.TypedArray ) v0 ).getBoolean ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* iput-boolean v1, p0, Lc/b/k/n0;->E:Z */
/* .line 12 */
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
/* .line 13 */
(( c.b.k.n0 ) p0 ).s ( ); // invoke-virtual {p0}, Lc/b/k/n0;->s()V
/* .line 14 */
v0 = this.g;
(( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
/* .line 15 */
v0 = this.f;
android.view.LayoutInflater .from ( v0 );
/* .line 16 */
/* iget-boolean v1, p0, Lc/b/k/n0;->F:Z */
int v5 = 0; // const/4 v5, 0x0
/* if-nez v1, :cond_9 */
/* .line 17 */
/* iget-boolean v1, p0, Lc/b/k/n0;->E:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 18 */
(( android.view.LayoutInflater ) v0 ).inflate ( v1, v5 ); // invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
/* check-cast v0, Landroid/view/ViewGroup; */
/* .line 19 */
/* iput-boolean v2, p0, Lc/b/k/n0;->C:Z */
/* iput-boolean v2, p0, Lc/b/k/n0;->B:Z */
/* goto/16 :goto_3 */
/* .line 20 */
} // :cond_4
/* iget-boolean v0, p0, Lc/b/k/n0;->B:Z */
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 21 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
/* .line 22 */
v1 = this.f;
(( android.content.Context ) v1 ).getTheme ( ); // invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
(( android.content.res.Resources$Theme ) v1 ).resolveAttribute ( v6, v0, v3 ); // invoke-virtual {v1, v6, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
/* .line 23 */
/* iget v1, v0, Landroid/util/TypedValue;->resourceId:I */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 24 */
/* new-instance v1, Lc/b/p/e; */
v3 = this.f;
/* iget v0, v0, Landroid/util/TypedValue;->resourceId:I */
/* invoke-direct {v1, v3, v0}, Lc/b/p/e;-><init>(Landroid/content/Context;I)V */
/* .line 25 */
} // :cond_5
v1 = this.f;
/* .line 26 */
} // :goto_1
android.view.LayoutInflater .from ( v1 );
/* .line 27 */
(( android.view.LayoutInflater ) v0 ).inflate ( v1, v5 ); // invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
/* check-cast v0, Landroid/view/ViewGroup; */
/* .line 28 */
/* .line 29 */
(( android.view.ViewGroup ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v1, Lc/b/q/y0; */
this.m = v1;
/* .line 30 */
(( c.b.k.n0 ) p0 ).x ( ); // invoke-virtual {p0}, Lc/b/k/n0;->x()Landroid/view/Window$Callback;
/* .line 31 */
/* iget-boolean v1, p0, Lc/b/k/n0;->C:Z */
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 32 */
v1 = this.m;
/* .line 33 */
} // :cond_6
/* iget-boolean v1, p0, Lc/b/k/n0;->z:Z */
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 34 */
v1 = this.m;
int v3 = 2; // const/4 v3, 0x2
/* .line 35 */
} // :cond_7
/* iget-boolean v1, p0, Lc/b/k/n0;->A:Z */
if ( v1 != null) { // if-eqz v1, :cond_c
/* .line 36 */
v1 = this.m;
int v3 = 5; // const/4 v3, 0x5
} // :cond_8
/* move-object v0, v5 */
/* .line 37 */
} // :cond_9
/* iget-boolean v1, p0, Lc/b/k/n0;->D:Z */
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 38 */
(( android.view.LayoutInflater ) v0 ).inflate ( v1, v5 ); // invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
/* check-cast v0, Landroid/view/ViewGroup; */
/* .line 39 */
} // :cond_a
(( android.view.LayoutInflater ) v0 ).inflate ( v1, v5 ); // invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
/* check-cast v0, Landroid/view/ViewGroup; */
/* .line 40 */
} // :goto_2
/* const/16 v3, 0x15 */
/* if-lt v1, v3, :cond_b */
/* .line 41 */
/* new-instance v1, Lc/b/k/w; */
/* invoke-direct {v1, p0}, Lc/b/k/w;-><init>(Lc/b/k/n0;)V */
c.h.n.v0 .a ( v0,v1 );
/* .line 42 */
} // :cond_b
/* move-object v1, v0 */
/* check-cast v1, Lc/b/q/e1; */
/* new-instance v3, Lc/b/k/x; */
/* invoke-direct {v3, p0}, Lc/b/k/x;-><init>(Lc/b/k/n0;)V */
} // :cond_c
} // :goto_3
if ( v0 != null) { // if-eqz v0, :cond_10
/* .line 43 */
v1 = this.m;
/* if-nez v1, :cond_d */
/* .line 44 */
(( android.view.ViewGroup ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/TextView; */
this.x = v1;
/* .line 45 */
} // :cond_d
c.b.q.v2 .b ( v0 );
/* .line 46 */
(( android.view.ViewGroup ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroidx/appcompat/widget/ContentFrameLayout; */
/* .line 47 */
v3 = this.g;
/* const v4, 0x1020002 */
(( android.view.Window ) v3 ).findViewById ( v4 ); // invoke-virtual {v3, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;
/* check-cast v3, Landroid/view/ViewGroup; */
if ( v3 != null) { // if-eqz v3, :cond_f
/* .line 48 */
} // :goto_4
v6 = (( android.view.ViewGroup ) v3 ).getChildCount ( ); // invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I
/* if-lez v6, :cond_e */
/* .line 49 */
(( android.view.ViewGroup ) v3 ).getChildAt ( v2 ); // invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 50 */
(( android.view.ViewGroup ) v3 ).removeViewAt ( v2 ); // invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V
/* .line 51 */
(( android.widget.FrameLayout ) v1 ).addView ( v6 ); // invoke-virtual {v1, v6}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
} // :cond_e
int v2 = -1; // const/4 v2, -0x1
/* .line 52 */
(( android.view.ViewGroup ) v3 ).setId ( v2 ); // invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->setId(I)V
/* .line 53 */
(( android.widget.FrameLayout ) v1 ).setId ( v4 ); // invoke-virtual {v1, v4}, Landroid/widget/FrameLayout;->setId(I)V
/* .line 54 */
/* instance-of v2, v3, Landroid/widget/FrameLayout; */
if ( v2 != null) { // if-eqz v2, :cond_f
/* .line 55 */
/* check-cast v3, Landroid/widget/FrameLayout; */
(( android.widget.FrameLayout ) v3 ).setForeground ( v5 ); // invoke-virtual {v3, v5}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V
/* .line 56 */
} // :cond_f
v2 = this.g;
(( android.view.Window ) v2 ).setContentView ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/Window;->setContentView(Landroid/view/View;)V
/* .line 57 */
/* new-instance v2, Lc/b/k/y; */
/* invoke-direct {v2, p0}, Lc/b/k/y;-><init>(Lc/b/k/n0;)V */
(( androidx.appcompat.widget.ContentFrameLayout ) v1 ).setAttachListener ( v2 ); // invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Landroidx/appcompat/widget/ContentFrameLayout$a;)V
/* .line 58 */
} // :cond_10
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "AppCompat does not support the current theme features: { windowActionBar: "; // const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v2, p0, Lc/b/k/n0;->B:Z */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v2 = ", windowActionBarOverlay: "; // const-string v2, ", windowActionBarOverlay: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v2, p0, Lc/b/k/n0;->C:Z */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v2 = ", android:windowIsFloating: "; // const-string v2, ", android:windowIsFloating: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v2, p0, Lc/b/k/n0;->E:Z */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v2 = ", windowActionModeOverlay: "; // const-string v2, ", windowActionModeOverlay: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v2, p0, Lc/b/k/n0;->D:Z */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v2 = ", windowNoTitle: "; // const-string v2, ", windowNoTitle: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v2, p0, Lc/b/k/n0;->F:Z */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v2 = " }"; // const-string v2, " }"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 59 */
} // :cond_11
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
/* .line 60 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."; // const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final android.view.View onCreateView ( android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3 ) {
/* .locals 0 */
/* .line 1 */
(( c.b.k.n0 ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lc/b/k/n0;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
} // .end method
public android.view.View onCreateView ( java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( c.b.k.n0 ) p0 ).onCreateView ( v0, p1, p2, p3 ); // invoke-virtual {p0, v0, p1, p2, p3}, Lc/b/k/n0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
} // .end method
public void p ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.m;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* .line 3 */
} // :cond_0
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 4 */
v0 = this.g;
(( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
v1 = this.s;
(( android.view.View ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 5 */
v0 = this.r;
v0 = (( android.widget.PopupWindow ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
try { // :try_start_0
v0 = this.r;
(( android.widget.PopupWindow ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
this.r = v0;
/* .line 8 */
} // :cond_2
(( c.b.k.n0 ) p0 ).q ( ); // invoke-virtual {p0}, Lc/b/k/n0;->q()V
int v0 = 0; // const/4 v0, 0x0
/* .line 9 */
(( c.b.k.n0 ) p0 ).a ( v0, v0 ); // invoke-virtual {p0, v0, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 10 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 11 */
(( c.b.p.o.m ) v0 ).close ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->close()V
} // :cond_3
return;
} // .end method
public void q ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.t;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.h.n.c1 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/n/c1;->a()V
} // :cond_0
return;
} // .end method
public final void r ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/k/n0;->v:Z */
/* if-nez v0, :cond_4 */
/* .line 2 */
(( c.b.k.n0 ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/n0;->o()Landroid/view/ViewGroup;
this.w = v0;
/* .line 3 */
(( c.b.k.n0 ) p0 ).w ( ); // invoke-virtual {p0}, Lc/b/k/n0;->w()Ljava/lang/CharSequence;
/* .line 4 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_2 */
/* .line 5 */
v1 = this.m;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 6 */
/* .line 7 */
} // :cond_0
(( c.b.k.n0 ) p0 ).C ( ); // invoke-virtual {p0}, Lc/b/k/n0;->C()Lc/b/k/a;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 8 */
(( c.b.k.n0 ) p0 ).C ( ); // invoke-virtual {p0}, Lc/b/k/n0;->C()Lc/b/k/a;
(( c.b.k.a ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Lc/b/k/a;->b(Ljava/lang/CharSequence;)V
/* .line 9 */
} // :cond_1
v1 = this.x;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 10 */
(( android.widget.TextView ) v1 ).setText ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 11 */
} // :cond_2
} // :goto_0
(( c.b.k.n0 ) p0 ).l ( ); // invoke-virtual {p0}, Lc/b/k/n0;->l()V
/* .line 12 */
v0 = this.w;
(( c.b.k.n0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/n0;->a(Landroid/view/ViewGroup;)V
int v0 = 1; // const/4 v0, 0x1
/* .line 13 */
/* iput-boolean v0, p0, Lc/b/k/n0;->v:Z */
int v0 = 0; // const/4 v0, 0x0
/* .line 14 */
(( c.b.k.n0 ) p0 ).a ( v0, v0 ); // invoke-virtual {p0, v0, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;
/* .line 15 */
/* iget-boolean v1, p0, Lc/b/k/n0;->N:Z */
/* if-nez v1, :cond_4 */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.j;
/* if-nez v0, :cond_4 */
} // :cond_3
/* const/16 v0, 0x6c */
/* .line 16 */
(( c.b.k.n0 ) p0 ).g ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/n0;->g(I)V
} // :cond_4
return;
} // .end method
public final void s ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g;
/* if-nez v0, :cond_0 */
v0 = this.e;
/* instance-of v1, v0, Landroid/app/Activity; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
/* check-cast v0, Landroid/app/Activity; */
(( android.app.Activity ) v0 ).getWindow ( ); // invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
(( c.b.k.n0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/n0;->a(Landroid/view/Window;)V
/* .line 3 */
} // :cond_0
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_1
return;
/* .line 4 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "We have not been given a Window"; // const-string v1, "We have not been given a Window"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final android.content.Context t ( ) {
/* .locals 1 */
/* .line 1 */
(( c.b.k.n0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.k.a ) v0 ).h ( ); // invoke-virtual {v0}, Lc/b/k/a;->h()Landroid/content/Context;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-nez v0, :cond_1 */
/* .line 3 */
v0 = this.f;
} // :cond_1
} // .end method
public final c.b.k.i0 u ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.T;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/b/k/g0; */
v1 = this.f;
/* invoke-direct {v0, p0, v1}, Lc/b/k/g0;-><init>(Lc/b/k/n0;Landroid/content/Context;)V */
this.T = v0;
/* .line 3 */
} // :cond_0
v0 = this.T;
} // .end method
public final c.b.k.i0 v ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.S;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/b/k/j0; */
v1 = this.f;
/* .line 3 */
c.b.k.a1 .a ( v1 );
/* invoke-direct {v0, p0, v1}, Lc/b/k/j0;-><init>(Lc/b/k/n0;Lc/b/k/a1;)V */
this.S = v0;
/* .line 4 */
} // :cond_0
v0 = this.S;
} // .end method
public final java.lang.CharSequence w ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
/* instance-of v1, v0, Landroid/app/Activity; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
/* check-cast v0, Landroid/app/Activity; */
(( android.app.Activity ) v0 ).getTitle ( ); // invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;
/* .line 3 */
} // :cond_0
v0 = this.l;
} // .end method
public final android.view.Window$Callback x ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
(( android.view.Window ) v0 ).getCallback ( ); // invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;
} // .end method
public final void y ( ) {
/* .locals 3 */
/* .line 1 */
(( c.b.k.n0 ) p0 ).r ( ); // invoke-virtual {p0}, Lc/b/k/n0;->r()V
/* .line 2 */
/* iget-boolean v0, p0, Lc/b/k/n0;->B:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
} // :cond_0
v0 = this.e;
/* instance-of v1, v0, Landroid/app/Activity; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
/* new-instance v0, Lc/b/k/f1; */
v1 = this.e;
/* check-cast v1, Landroid/app/Activity; */
/* iget-boolean v2, p0, Lc/b/k/n0;->C:Z */
/* invoke-direct {v0, v1, v2}, Lc/b/k/f1;-><init>(Landroid/app/Activity;Z)V */
this.j = v0;
/* .line 5 */
} // :cond_1
/* instance-of v0, v0, Landroid/app/Dialog; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
/* new-instance v0, Lc/b/k/f1; */
v1 = this.e;
/* check-cast v1, Landroid/app/Dialog; */
/* invoke-direct {v0, v1}, Lc/b/k/f1;-><init>(Landroid/app/Dialog;)V */
this.j = v0;
/* .line 7 */
} // :cond_2
} // :goto_0
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 8 */
/* iget-boolean v1, p0, Lc/b/k/n0;->X:Z */
(( c.b.k.a ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lc/b/k/a;->c(Z)V
} // :cond_3
} // :goto_1
return;
} // .end method
public final Boolean z ( ) {
/* .locals 6 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/k/n0;->R:Z */
int v1 = 1; // const/4 v1, 0x1
/* if-nez v0, :cond_2 */
v0 = this.e;
/* instance-of v0, v0, Landroid/app/Activity; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
v0 = this.f;
(( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
int v2 = 0; // const/4 v2, 0x0
/* if-nez v0, :cond_0 */
/* .line 3 */
} // :cond_0
try { // :try_start_0
/* new-instance v3, Landroid/content/ComponentName; */
v4 = this.f;
v5 = this.e;
/* .line 4 */
(( java.lang.Object ) v5 ).getClass ( ); // invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* invoke-direct {v3, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 5 */
(( android.content.pm.PackageManager ) v0 ).getActivityInfo ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
/* iget v0, v0, Landroid/content/pm/ActivityInfo;->configChanges:I */
/* and-int/lit16 v0, v0, 0x200 */
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* iput-boolean v0, p0, Lc/b/k/n0;->Q:Z */
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v3 = "AppCompatDelegate"; // const-string v3, "AppCompatDelegate"
final String v4 = "Exception while getting ActivityInfo"; // const-string v4, "Exception while getting ActivityInfo"
/* .line 7 */
android.util.Log .d ( v3,v4,v0 );
/* .line 8 */
/* iput-boolean v2, p0, Lc/b/k/n0;->Q:Z */
/* .line 9 */
} // :cond_2
} // :goto_1
/* iput-boolean v1, p0, Lc/b/k/n0;->R:Z */
/* .line 10 */
/* iget-boolean v0, p0, Lc/b/k/n0;->Q:Z */
} // .end method
