public abstract class androidx.fragment.app.Fragment implements android.content.ComponentCallbacks implements android.view.View$OnCreateContextMenuListener implements c.n.j implements c.n.y implements c.s.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/fragment/app/Fragment$InstantiationException; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.Object Y;
/* # instance fields */
public Boolean A;
public Boolean B;
public Boolean C;
public Boolean D;
public Boolean E;
public Boolean F;
public Boolean G;
public android.view.ViewGroup H;
public android.view.View I;
public Boolean J;
public Boolean K;
public c.l.d.x L;
public Boolean M;
public Boolean N;
public Float O;
public android.view.LayoutInflater P;
public Boolean Q;
public c.n.g$b R;
public c.n.l S;
public c.l.d.y2 T;
public c.n.p U;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/n/p<", */
/* "Lc/n/j;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public c.s.b V;
public Integer W;
public final java.util.ArrayList X;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Lc/l/d/y;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Integer b;
public android.os.Bundle c;
public android.util.SparseArray d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/SparseArray<", */
/* "Landroid/os/Parcelable;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public android.os.Bundle e;
public java.lang.Boolean f;
public java.lang.String g;
public android.os.Bundle h;
public androidx.fragment.app.Fragment i;
public java.lang.String j;
public Integer k;
public java.lang.Boolean l;
public Boolean m;
public Boolean n;
public Boolean o;
public Boolean p;
public Boolean q;
public Boolean r;
public Integer s;
public c.l.d.o1 t;
public c.l.d.r0 u;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/l/d/r0<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
public c.l.d.o1 v;
public androidx.fragment.app.Fragment w;
public Integer x;
public Integer y;
public java.lang.String z;
/* # direct methods */
public static androidx.fragment.app.Fragment ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public androidx.fragment.app.Fragment ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = -1; // const/4 v0, -0x1
/* .line 2 */
/* iput v0, p0, Landroidx/fragment/app/Fragment;->b:I */
/* .line 3 */
java.util.UUID .randomUUID ( );
(( java.util.UUID ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;
this.g = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
this.j = v0;
/* .line 5 */
this.l = v0;
/* .line 6 */
/* new-instance v0, Lc/l/d/p1; */
/* invoke-direct {v0}, Lc/l/d/p1;-><init>()V */
this.v = v0;
int v0 = 1; // const/4 v0, 0x1
/* .line 7 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->F:Z */
/* .line 8 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->K:Z */
/* .line 9 */
/* new-instance v0, Lc/l/d/t; */
/* invoke-direct {v0, p0}, Lc/l/d/t;-><init>(Landroidx/fragment/app/Fragment;)V */
/* .line 10 */
v0 = c.n.g$b.f;
this.R = v0;
/* .line 11 */
/* new-instance v0, Lc/n/p; */
/* invoke-direct {v0}, Lc/n/p;-><init>()V */
this.U = v0;
/* .line 12 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger; */
/* invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V */
/* .line 13 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.X = v0;
/* .line 14 */
(( androidx.fragment.app.Fragment ) p0 ).O ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O()V
return;
} // .end method
public static androidx.fragment.app.Fragment a ( android.content.Context p0, java.lang.String p1, android.os.Bundle p2 ) {
/* .locals 4 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
final String v0 = ": make sure class name exists, is public, and has an empty constructor that is public"; // const-string v0, ": make sure class name exists, is public, and has an empty constructor that is public"
final String v1 = "Unable to instantiate fragment "; // const-string v1, "Unable to instantiate fragment "
/* .line 1 */
try { // :try_start_0
(( android.content.Context ) p0 ).getClassLoader ( ); // invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
/* .line 2 */
c.l.d.q0 .d ( p0,p1 );
int v2 = 0; // const/4 v2, 0x0
/* new-array v3, v2, [Ljava/lang/Class; */
/* .line 3 */
(( java.lang.Class ) p0 ).getConstructor ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* new-array v2, v2, [Ljava/lang/Object; */
(( java.lang.reflect.Constructor ) p0 ).newInstance ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Landroidx/fragment/app/Fragment; */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 4 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getClassLoader ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
(( android.os.Bundle ) p2 ).setClassLoader ( v2 ); // invoke-virtual {p2, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
/* .line 5 */
(( androidx.fragment.app.Fragment ) p0 ).m ( p2 ); // invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->m(Landroid/os/Bundle;)V
/* :try_end_0 */
/* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
/* :catch_0 */
/* move-exception p0 */
/* .line 6 */
/* new-instance p2, Landroidx/fragment/app/Fragment$InstantiationException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ": calling Fragment constructor caused an exception"; // const-string p1, ": calling Fragment constructor caused an exception"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$InstantiationException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw p2 */
/* :catch_1 */
/* move-exception p0 */
/* .line 7 */
/* new-instance p2, Landroidx/fragment/app/Fragment$InstantiationException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ": could not find Fragment constructor"; // const-string p1, ": could not find Fragment constructor"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$InstantiationException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw p2 */
/* :catch_2 */
/* move-exception p0 */
/* .line 8 */
/* new-instance p2, Landroidx/fragment/app/Fragment$InstantiationException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$InstantiationException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw p2 */
/* :catch_3 */
/* move-exception p0 */
/* .line 9 */
/* new-instance p2, Landroidx/fragment/app/Fragment$InstantiationException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$InstantiationException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw p2 */
} // .end method
/* # virtual methods */
public Boolean A ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
/* iget-boolean v0, v0, Lc/l/d/x;->c:Z */
} // .end method
public Integer B ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
/* iget v0, v0, Lc/l/d/x;->f:I */
} // .end method
public Integer C ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
/* iget v0, v0, Lc/l/d/x;->g:I */
} // .end method
public Float D ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* .line 2 */
} // :cond_0
/* iget v0, v0, Lc/l/d/x;->u:F */
} // .end method
public java.lang.Object E ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = this.n;
v1 = androidx.fragment.app.Fragment.Y;
/* if-ne v0, v1, :cond_1 */
(( androidx.fragment.app.Fragment ) p0 ).r ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->r()Ljava/lang/Object;
} // :cond_1
} // .end method
public final android.content.res.Resources F ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.fragment.app.Fragment ) p0 ).v0 ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->v0()Landroid/content/Context;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
} // .end method
public java.lang.Object G ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = this.l;
v1 = androidx.fragment.app.Fragment.Y;
/* if-ne v0, v1, :cond_1 */
(( androidx.fragment.app.Fragment ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o()Ljava/lang/Object;
} // :cond_1
} // .end method
public java.lang.Object H ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = this.o;
} // .end method
public java.lang.Object I ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = this.p;
v1 = androidx.fragment.app.Fragment.Y;
/* if-ne v0, v1, :cond_1 */
/* .line 3 */
(( androidx.fragment.app.Fragment ) p0 ).H ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->H()Ljava/lang/Object;
} // :cond_1
} // .end method
public java.util.ArrayList J ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.L;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.i;
/* if-nez v0, :cond_0 */
} // :cond_0
/* .line 2 */
} // :cond_1
} // :goto_0
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
} // .end method
public java.util.ArrayList K ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.L;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.j;
/* if-nez v0, :cond_0 */
} // :cond_0
/* .line 2 */
} // :cond_1
} // :goto_0
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
} // .end method
public final androidx.fragment.app.Fragment L ( ) {
/* .locals 2 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = this.t;
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = this.j;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 3 */
(( c.l.d.o1 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/l/d/o1;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.view.View M ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.I;
} // .end method
public androidx.lifecycle.LiveData N ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Landroidx/lifecycle/LiveData<", */
/* "Lc/n/j;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.U;
} // .end method
public final void O ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/n/l; */
/* invoke-direct {v0, p0}, Lc/n/l;-><init>(Lc/n/j;)V */
this.S = v0;
/* .line 2 */
c.s.b .a ( p0 );
this.V = v0;
return;
} // .end method
public void P ( ) {
/* .locals 3 */
/* .line 1 */
(( androidx.fragment.app.Fragment ) p0 ).O ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O()V
/* .line 2 */
java.util.UUID .randomUUID ( );
(( java.util.UUID ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;
this.g = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->m:Z */
/* .line 4 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->n:Z */
/* .line 5 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->o:Z */
/* .line 6 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->p:Z */
/* .line 7 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->q:Z */
/* .line 8 */
/* iput v0, p0, Landroidx/fragment/app/Fragment;->s:I */
int v1 = 0; // const/4 v1, 0x0
/* .line 9 */
this.t = v1;
/* .line 10 */
/* new-instance v2, Lc/l/d/p1; */
/* invoke-direct {v2}, Lc/l/d/p1;-><init>()V */
this.v = v2;
/* .line 11 */
this.u = v1;
/* .line 12 */
/* iput v0, p0, Landroidx/fragment/app/Fragment;->x:I */
/* .line 13 */
/* iput v0, p0, Landroidx/fragment/app/Fragment;->y:I */
/* .line 14 */
this.z = v1;
/* .line 15 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z */
/* .line 16 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->B:Z */
return;
} // .end method
public final Boolean Q ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final Boolean R ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z */
} // .end method
public Boolean S ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
/* iget-boolean v0, v0, Lc/l/d/x;->y:Z */
} // .end method
public final Boolean T ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/fragment/app/Fragment;->s:I */
/* if-lez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final Boolean U ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->F:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.t;
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.w;
/* .line 2 */
v0 = (( c.l.d.o1 ) v0 ).p ( v1 ); // invoke-virtual {v0, v1}, Lc/l/d/o1;->p(Landroidx/fragment/app/Fragment;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean V ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
/* iget-boolean v0, v0, Lc/l/d/x;->w:Z */
} // .end method
public final Boolean W ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->n:Z */
} // .end method
public final Boolean X ( ) {
/* .locals 2 */
/* .line 1 */
(( androidx.fragment.app.Fragment ) p0 ).y ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v1 = (( androidx.fragment.app.Fragment ) v0 ).W ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->W()Z
/* if-nez v1, :cond_0 */
v0 = (( androidx.fragment.app.Fragment ) v0 ).X ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->X()Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final Boolean Y ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.t;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = (( c.l.d.o1 ) v0 ).I ( ); // invoke-virtual {v0}, Lc/l/d/o1;->I()Z
} // .end method
public final Boolean Z ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( androidx.fragment.app.Fragment ) p0 ).Q ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( androidx.fragment.app.Fragment ) p0 ).R ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R()Z
/* if-nez v0, :cond_0 */
v0 = this.I;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.view.View ) v0 ).getWindowToken ( ); // invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.I;
v0 = (( android.view.View ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.view.LayoutInflater a ( android.os.Bundle p0 ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 16 */
p1 = this.u;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 17 */
(( c.l.d.r0 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/l/d/r0;->k()Landroid/view/LayoutInflater;
/* .line 18 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).B ( ); // invoke-virtual {v0}, Lc/l/d/o1;->B()Landroid/view/LayoutInflater$Factory2;
c.h.n.l .b ( p1,v0 );
/* .line 19 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."; // const-string v0, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public android.view.View a ( android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2 ) {
/* .locals 1 */
/* .line 30 */
/* iget p3, p0, Landroidx/fragment/app/Fragment;->W:I */
if ( p3 != null) { // if-eqz p3, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 31 */
(( android.view.LayoutInflater ) p1 ).inflate ( p3, p2, v0 ); // invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.view.animation.Animation a ( Integer p0, Boolean p1, Integer p2 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public androidx.fragment.app.Fragment a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 107 */
v0 = this.g;
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 108 */
} // :cond_0
v0 = this.v;
(( c.l.d.o1 ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->d(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
} // .end method
public c.l.d.n0 a ( ) {
/* .locals 1 */
/* .line 109 */
/* new-instance v0, Lc/l/d/w; */
/* invoke-direct {v0, p0}, Lc/l/d/w;-><init>(Landroidx/fragment/app/Fragment;)V */
} // .end method
public void a ( Float p0 ) {
/* .locals 1 */
/* .line 131 */
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
/* iput p1, v0, Lc/l/d/x;->u:F */
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .line 123 */
v0 = this.L;
/* if-nez v0, :cond_0 */
/* if-nez p1, :cond_0 */
return;
/* .line 124 */
} // :cond_0
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
/* .line 125 */
v0 = this.L;
/* iput p1, v0, Lc/l/d/x;->h:I */
return;
} // .end method
public void a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .line 118 */
v0 = this.L;
/* if-nez v0, :cond_0 */
/* if-nez p1, :cond_0 */
/* if-nez p2, :cond_0 */
/* if-nez p3, :cond_0 */
/* if-nez p4, :cond_0 */
return;
/* .line 119 */
} // :cond_0
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
/* iput p1, v0, Lc/l/d/x;->d:I */
/* .line 120 */
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
/* iput p2, p1, Lc/l/d/x;->e:I */
/* .line 121 */
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
/* iput p3, p1, Lc/l/d/x;->f:I */
/* .line 122 */
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
/* iput p4, p1, Lc/l/d/x;->g:I */
return;
} // .end method
public void a ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 2 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
int v0 = 2; // const/4 v0, 0x2
/* .line 14 */
v0 = c.l.d.o1 .d ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 15 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Fragment "; // const-string v1, "Fragment "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " received the following in onActivityResult(): requestCode: "; // const-string v1, " received the following in onActivityResult(): requestCode: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " resultCode: "; // const-string p1, " resultCode: "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " data: "; // const-string p1, " data: "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p2 = "FragmentManager"; // const-string p2, "FragmentManager"
android.util.Log .v ( p2,p1 );
} // :cond_0
return;
} // .end method
public void a ( Integer p0, java.lang.String[] p1, Integer[] p2 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
return;
} // .end method
public void a ( android.animation.Animator p0 ) {
/* .locals 1 */
/* .line 130 */
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
this.b = p1;
return;
} // .end method
public void a ( android.app.Activity p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
int p1 = 1; // const/4 p1, 0x1
/* .line 29 */
/* iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->G:Z */
return;
} // .end method
public void a ( android.app.Activity p0, android.util.AttributeSet p1, android.os.Bundle p2 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
int p1 = 1; // const/4 p1, 0x1
/* .line 24 */
/* iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->G:Z */
return;
} // .end method
public void a ( android.content.Context p0 ) {
/* .locals 1 */
int p1 = 1; // const/4 p1, 0x1
/* .line 25 */
/* iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 26 */
p1 = this.u;
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
(( c.l.d.r0 ) p1 ).e ( ); // invoke-virtual {p1}, Lc/l/d/r0;->e()Landroid/app/Activity;
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 27 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 28 */
(( androidx.fragment.app.Fragment ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->a(Landroid/app/Activity;)V
} // :cond_1
return;
} // .end method
public void a ( android.content.Context p0, android.util.AttributeSet p1, android.os.Bundle p2 ) {
/* .locals 1 */
int p1 = 1; // const/4 p1, 0x1
/* .line 20 */
/* iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 21 */
p1 = this.u;
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
(( c.l.d.r0 ) p1 ).e ( ); // invoke-virtual {p1}, Lc/l/d/r0;->e()Landroid/app/Activity;
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 22 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 23 */
(( androidx.fragment.app.Fragment ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->a(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
} // :cond_1
return;
} // .end method
public void a ( android.content.res.Configuration p0 ) {
/* .locals 1 */
/* .line 110 */
(( androidx.fragment.app.Fragment ) p0 ).onConfigurationChanged ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V
/* .line 111 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Landroid/content/res/Configuration;)V
return;
} // .end method
public void a ( android.view.Menu p0 ) {
/* .locals 0 */
return;
} // .end method
public void a ( android.view.Menu p0, android.view.MenuInflater p1 ) {
/* .locals 0 */
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 1 */
/* .line 129 */
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
this.a = p1;
return;
} // .end method
public void a ( android.view.View p0, android.os.Bundle p1 ) {
/* .locals 0 */
return;
} // .end method
public void a ( androidx.fragment.app.Fragment p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
return;
} // .end method
public void a ( c.l.d.b0 p0 ) {
/* .locals 1 */
/* .line 10 */
v0 = this.t;
/* if-nez v0, :cond_1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 11 */
p1 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 12 */
} // :goto_0
this.c = p1;
return;
/* .line 13 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "Fragment already added"; // const-string v0, "Fragment already added"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( Object p0 ) {
/* .locals 2 */
/* .line 112 */
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
/* .line 113 */
v0 = this.L;
v0 = this.x;
/* if-ne p1, v0, :cond_0 */
return;
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_2
/* if-nez v0, :cond_1 */
/* .line 114 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Trying to set a replacement startPostponedEnterTransition on "; // const-string v1, "Trying to set a replacement startPostponedEnterTransition on "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 115 */
} // :cond_2
} // :goto_0
v0 = this.L;
/* iget-boolean v1, v0, Lc/l/d/x;->w:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 116 */
this.x = p1;
} // :cond_3
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 117 */
} // :cond_4
return;
} // .end method
public void a ( java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3 ) {
/* .locals 2 */
/* .line 42 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mFragmentId=#"; // const-string v0, "mFragmentId=#"
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 43 */
/* iget v0, p0, Landroidx/fragment/app/Fragment;->x:I */
java.lang.Integer .toHexString ( v0 );
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = " mContainerId=#"; // const-string v0, " mContainerId=#"
/* .line 44 */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 45 */
/* iget v0, p0, Landroidx/fragment/app/Fragment;->y:I */
java.lang.Integer .toHexString ( v0 );
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = " mTag="; // const-string v0, " mTag="
/* .line 46 */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v0 = this.z;
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
/* .line 47 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mState="; // const-string v0, "mState="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget v0, p0, Landroidx/fragment/app/Fragment;->b:I */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V
final String v0 = " mWho="; // const-string v0, " mWho="
/* .line 48 */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v0 = this.g;
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = " mBackStackNesting="; // const-string v0, " mBackStackNesting="
/* .line 49 */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget v0, p0, Landroidx/fragment/app/Fragment;->s:I */
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V
/* .line 50 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mAdded="; // const-string v0, "mAdded="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->m:Z */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
final String v0 = " mRemoving="; // const-string v0, " mRemoving="
/* .line 51 */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->n:Z */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
final String v0 = " mFromLayout="; // const-string v0, " mFromLayout="
/* .line 52 */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->o:Z */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
final String v0 = " mInLayout="; // const-string v0, " mInLayout="
/* .line 53 */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->p:Z */
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
/* .line 54 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mHidden="; // const-string v0, "mHidden="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
final String v0 = " mDetached="; // const-string v0, " mDetached="
/* .line 55 */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->B:Z */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
final String v0 = " mMenuVisible="; // const-string v0, " mMenuVisible="
/* .line 56 */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->F:Z */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
final String v0 = " mHasMenu="; // const-string v0, " mHasMenu="
/* .line 57 */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->E:Z */
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
/* .line 58 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mRetainInstance="; // const-string v0, "mRetainInstance="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->C:Z */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
final String v0 = " mUserVisibleHint="; // const-string v0, " mUserVisibleHint="
/* .line 59 */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->K:Z */
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
/* .line 60 */
v0 = this.t;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 61 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mFragmentManager="; // const-string v0, "mFragmentManager="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 62 */
v0 = this.t;
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
/* .line 63 */
} // :cond_0
v0 = this.u;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 64 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mHost="; // const-string v0, "mHost="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 65 */
v0 = this.u;
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
/* .line 66 */
} // :cond_1
v0 = this.w;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 67 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mParentFragment="; // const-string v0, "mParentFragment="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 68 */
v0 = this.w;
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
/* .line 69 */
} // :cond_2
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 70 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mArguments="; // const-string v0, "mArguments="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v0 = this.h;
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
/* .line 71 */
} // :cond_3
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 72 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mSavedFragmentState="; // const-string v0, "mSavedFragmentState="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 73 */
v0 = this.c;
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
/* .line 74 */
} // :cond_4
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 75 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mSavedViewState="; // const-string v0, "mSavedViewState="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 76 */
v0 = this.d;
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
/* .line 77 */
} // :cond_5
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 78 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mSavedViewRegistryState="; // const-string v0, "mSavedViewRegistryState="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 79 */
v0 = this.e;
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
/* .line 80 */
} // :cond_6
(( androidx.fragment.app.Fragment ) p0 ).L ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->L()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 81 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v1 = "mTarget="; // const-string v1, "mTarget="
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V
final String v0 = " mTargetRequestCode="; // const-string v0, " mTargetRequestCode="
/* .line 82 */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 83 */
/* iget v0, p0, Landroidx/fragment/app/Fragment;->k:I */
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V
/* .line 84 */
} // :cond_7
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mPopDirection="; // const-string v0, "mPopDirection="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v0 = (( androidx.fragment.app.Fragment ) p0 ).A ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->A()Z
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
/* .line 85 */
v0 = (( androidx.fragment.app.Fragment ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n()I
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 86 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "getEnterAnim="; // const-string v0, "getEnterAnim="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v0 = (( androidx.fragment.app.Fragment ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n()I
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V
/* .line 87 */
} // :cond_8
v0 = (( androidx.fragment.app.Fragment ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q()I
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 88 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "getExitAnim="; // const-string v0, "getExitAnim="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v0 = (( androidx.fragment.app.Fragment ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q()I
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V
/* .line 89 */
} // :cond_9
v0 = (( androidx.fragment.app.Fragment ) p0 ).B ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()I
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 90 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "getPopEnterAnim="; // const-string v0, "getPopEnterAnim="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 91 */
v0 = (( androidx.fragment.app.Fragment ) p0 ).B ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()I
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V
/* .line 92 */
} // :cond_a
v0 = (( androidx.fragment.app.Fragment ) p0 ).C ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()I
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 93 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "getPopExitAnim="; // const-string v0, "getPopExitAnim="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v0 = (( androidx.fragment.app.Fragment ) p0 ).C ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()I
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V
/* .line 94 */
} // :cond_b
v0 = this.H;
if ( v0 != null) { // if-eqz v0, :cond_c
/* .line 95 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mContainer="; // const-string v0, "mContainer="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v0 = this.H;
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
/* .line 96 */
} // :cond_c
v0 = this.I;
if ( v0 != null) { // if-eqz v0, :cond_d
/* .line 97 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mView="; // const-string v0, "mView="
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v0 = this.I;
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
/* .line 98 */
} // :cond_d
(( androidx.fragment.app.Fragment ) p0 ).j ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j()Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_e
/* .line 99 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "mAnimatingAway="; // const-string v0, "mAnimatingAway="
/* .line 100 */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 101 */
(( androidx.fragment.app.Fragment ) p0 ).j ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j()Landroid/view/View;
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
/* .line 102 */
} // :cond_e
(( androidx.fragment.app.Fragment ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;
if ( v0 != null) { // if-eqz v0, :cond_f
/* .line 103 */
c.o.a.a .a ( p0 );
(( c.o.a.a ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lc/o/a/a;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
/* .line 104 */
} // :cond_f
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 105 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Child "; // const-string v1, "Child "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.v;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ":"; // const-string v1, ":"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
/* .line 106 */
v0 = this.v;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " "; // const-string p1, " "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( c.l.d.o1 ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lc/l/d/o1;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
return;
} // .end method
public void a ( java.util.ArrayList p0, java.util.ArrayList p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/ArrayList<", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/util/ArrayList<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 126 */
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
/* .line 127 */
v0 = this.L;
this.i = p1;
/* .line 128 */
this.j = p2;
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 3 */
/* .line 32 */
v0 = this.L;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 33 */
/* iput-boolean v2, v0, Lc/l/d/x;->w:Z */
/* .line 34 */
v2 = this.x;
/* .line 35 */
this.x = v1;
/* move-object v1, v2 */
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 36 */
/* .line 37 */
} // :cond_1
/* sget-boolean v0, Lc/l/d/o1;->P:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.I;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.H;
if ( v0 != null) { // if-eqz v0, :cond_3
v1 = this.t;
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 38 */
c.l.d.i3 .a ( v0,v1 );
/* .line 39 */
(( c.l.d.i3 ) v0 ).e ( ); // invoke-virtual {v0}, Lc/l/d/i3;->e()V
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 40 */
p1 = this.u;
(( c.l.d.r0 ) p1 ).i ( ); // invoke-virtual {p1}, Lc/l/d/r0;->i()Landroid/os/Handler;
/* new-instance v1, Lc/l/d/v; */
/* invoke-direct {v1, p0, v0}, Lc/l/d/v;-><init>(Landroidx/fragment/app/Fragment;Lc/l/d/i3;)V */
(( android.os.Handler ) p1 ).post ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 41 */
} // :cond_2
(( c.l.d.i3 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/l/d/i3;->a()V
} // :cond_3
} // :goto_1
return;
} // .end method
public Boolean a ( android.view.MenuItem p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void a0 ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).J ( ); // invoke-virtual {v0}, Lc/l/d/o1;->J()V
return;
} // .end method
public android.animation.Animator b ( Integer p0, Boolean p1, Integer p2 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void b ( android.os.Bundle p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
int p1 = 1; // const/4 p1, 0x1
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->G:Z */
return;
} // .end method
public void b ( android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).J ( ); // invoke-virtual {v0}, Lc/l/d/o1;->J()V
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->r:Z */
/* .line 4 */
/* new-instance v0, Lc/l/d/y2; */
(( androidx.fragment.app.Fragment ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f()Lc/n/x;
/* invoke-direct {v0, p0, v1}, Lc/l/d/y2;-><init>(Landroidx/fragment/app/Fragment;Lc/n/x;)V */
this.T = v0;
/* .line 5 */
(( androidx.fragment.app.Fragment ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
this.I = p1;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 6 */
p1 = this.T;
(( c.l.d.y2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/l/d/y2;->a()V
/* .line 7 */
p1 = this.I;
p2 = this.T;
c.n.z .a ( p1,p2 );
/* .line 8 */
p1 = this.I;
p2 = this.T;
c.n.a0 .a ( p1,p2 );
/* .line 9 */
p1 = this.I;
p2 = this.T;
c.s.d .a ( p1,p2 );
/* .line 10 */
p1 = this.U;
p2 = this.T;
(( c.n.p ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/n/p;->a(Ljava/lang/Object;)V
/* .line 11 */
} // :cond_0
p1 = this.T;
p1 = (( c.l.d.y2 ) p1 ).d ( ); // invoke-virtual {p1}, Lc/l/d/y2;->d()Z
/* if-nez p1, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 12 */
this.T = p1;
} // :goto_0
return;
/* .line 13 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "Called getViewLifecycleOwner() but onCreateView() returned null"; // const-string p2, "Called getViewLifecycleOwner() but onCreateView() returned null"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void b ( android.view.Menu p0 ) {
/* .locals 0 */
return;
} // .end method
public void b ( android.view.View p0 ) {
/* .locals 1 */
/* .line 18 */
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
this.v = p1;
return;
} // .end method
public void b ( Boolean p0 ) {
/* .locals 0 */
return;
} // .end method
public Boolean b ( android.view.Menu p0, android.view.MenuInflater p1 ) {
/* .locals 2 */
/* .line 14 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_1 */
/* .line 15 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->E:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->F:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 16 */
(( androidx.fragment.app.Fragment ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/Fragment;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
/* .line 17 */
} // :cond_0
v0 = this.v;
p1 = (( c.l.d.o1 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/l/d/o1;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
/* or-int/2addr v1, p1 */
} // :cond_1
} // .end method
public Boolean b ( android.view.MenuItem p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void b0 ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
return;
} // .end method
public final androidx.savedstate.SavedStateRegistry c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.V;
(( c.s.b ) v0 ).a ( ); // invoke-virtual {v0}, Lc/s/b;->a()Landroidx/savedstate/SavedStateRegistry;
} // .end method
public void c ( android.os.Bundle p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 3 */
(( androidx.fragment.app.Fragment ) p0 ).k ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->k(Landroid/os/Bundle;)V
/* .line 4 */
p1 = this.v;
p1 = (( c.l.d.o1 ) p1 ).c ( v0 ); // invoke-virtual {p1, v0}, Lc/l/d/o1;->c(I)Z
/* if-nez p1, :cond_0 */
/* .line 5 */
p1 = this.v;
(( c.l.d.o1 ) p1 ).i ( ); // invoke-virtual {p1}, Lc/l/d/o1;->i()V
} // :cond_0
return;
} // .end method
public void c ( android.view.Menu p0 ) {
/* .locals 1 */
/* .line 9 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z */
/* if-nez v0, :cond_1 */
/* .line 10 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->E:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->F:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 11 */
(( androidx.fragment.app.Fragment ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->a(Landroid/view/Menu;)V
/* .line 12 */
} // :cond_0
v0 = this.v;
(( c.l.d.o1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Landroid/view/Menu;)V
} // :cond_1
return;
} // .end method
public void c ( Boolean p0 ) {
/* .locals 0 */
return;
} // .end method
public Boolean c ( android.view.MenuItem p0 ) {
/* .locals 1 */
/* .line 6 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z */
/* if-nez v0, :cond_1 */
/* .line 7 */
v0 = (( androidx.fragment.app.Fragment ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->a(Landroid/view/MenuItem;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 1; // const/4 p1, 0x1
/* .line 8 */
} // :cond_0
v0 = this.v;
p1 = (( c.l.d.o1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Landroid/view/MenuItem;)Z
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void c0 ( ) {
/* .locals 0 */
return;
} // .end method
public android.view.LayoutInflater d ( android.os.Bundle p0 ) {
/* .locals 0 */
/* .line 1 */
(( androidx.fragment.app.Fragment ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->a(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
} // .end method
public final c.l.d.x d ( ) {
/* .locals 1 */
/* .line 10 */
v0 = this.L;
/* if-nez v0, :cond_0 */
/* .line 11 */
/* new-instance v0, Lc/l/d/x; */
/* invoke-direct {v0}, Lc/l/d/x;-><init>()V */
this.L = v0;
/* .line 12 */
} // :cond_0
v0 = this.L;
} // .end method
public void d ( Boolean p0 ) {
/* .locals 0 */
return;
} // .end method
public Boolean d ( android.view.Menu p0 ) {
/* .locals 2 */
/* .line 2 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_1 */
/* .line 3 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->E:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->F:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
(( androidx.fragment.app.Fragment ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->b(Landroid/view/Menu;)V
/* .line 5 */
} // :cond_0
v0 = this.v;
p1 = (( c.l.d.o1 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->b(Landroid/view/Menu;)Z
/* or-int/2addr v1, p1 */
} // :cond_1
} // .end method
public Boolean d ( android.view.MenuItem p0 ) {
/* .locals 1 */
/* .line 6 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->A:Z */
/* if-nez v0, :cond_1 */
/* .line 7 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->E:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->F:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
v0 = (( androidx.fragment.app.Fragment ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->b(Landroid/view/MenuItem;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 1; // const/4 p1, 0x1
/* .line 9 */
} // :cond_0
v0 = this.v;
p1 = (( c.l.d.o1 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->b(Landroid/view/MenuItem;)Z
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void d0 ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
return;
} // .end method
public final c.l.d.f0 e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
(( c.l.d.r0 ) v0 ).e ( ); // invoke-virtual {v0}, Lc/l/d/r0;->e()Landroid/app/Activity;
/* check-cast v0, Lc/l/d/f0; */
} // :goto_0
} // .end method
public void e ( android.os.Bundle p0 ) {
/* .locals 0 */
return;
} // .end method
public void e ( Boolean p0 ) {
/* .locals 0 */
return;
} // .end method
public void e0 ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
return;
} // .end method
public final Boolean equals ( java.lang.Object p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = /* invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z */
} // .end method
public c.n.x f ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.t;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = (( androidx.fragment.app.Fragment ) p0 ).w ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()I
v1 = c.n.g$b.c;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
/* if-eq v0, v1, :cond_0 */
/* .line 3 */
v0 = this.t;
(( c.l.d.o1 ) v0 ).l ( p0 ); // invoke-virtual {v0, p0}, Lc/l/d/o1;->l(Landroidx/fragment/app/Fragment;)Lc/n/x;
/* .line 4 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"; // const-string v1, "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 5 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Can\'t access ViewModels from detached fragment"; // const-string v1, "Can\'t access ViewModels from detached fragment"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void f ( android.os.Bundle p0 ) {
/* .locals 0 */
int p1 = 1; // const/4 p1, 0x1
/* .line 6 */
/* iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->G:Z */
return;
} // .end method
public void f ( Boolean p0 ) {
/* .locals 1 */
/* .line 7 */
(( androidx.fragment.app.Fragment ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->c(Z)V
/* .line 8 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Z)V
return;
} // .end method
public void f0 ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
return;
} // .end method
public c.n.g g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.S;
} // .end method
public void g ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).J ( ); // invoke-virtual {v0}, Lc/l/d/o1;->J()V
int v0 = 3; // const/4 v0, 0x3
/* .line 3 */
/* iput v0, p0, Landroidx/fragment/app/Fragment;->b:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 5 */
(( androidx.fragment.app.Fragment ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->b(Landroid/os/Bundle;)V
/* .line 6 */
/* iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->G:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 7 */
(( androidx.fragment.app.Fragment ) p0 ).x0 ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->x0()V
/* .line 8 */
p1 = this.v;
(( c.l.d.o1 ) p1 ).g ( ); // invoke-virtual {p1}, Lc/l/d/o1;->g()V
return;
/* .line 9 */
} // :cond_0
/* new-instance p1, Lc/l/d/k3; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Fragment "; // const-string v1, "Fragment "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " did not call through to super.onActivityCreated()"; // const-string v1, " did not call through to super.onActivityCreated()"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Lc/l/d/k3;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void g ( Boolean p0 ) {
/* .locals 1 */
/* .line 10 */
(( androidx.fragment.app.Fragment ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->d(Z)V
/* .line 11 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->b(Z)V
return;
} // .end method
public void g0 ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
return;
} // .end method
public void h ( android.os.Bundle p0 ) {
/* .locals 3 */
/* .line 3 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).J ( ); // invoke-virtual {v0}, Lc/l/d/o1;->J()V
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
/* iput v0, p0, Landroidx/fragment/app/Fragment;->b:I */
int v1 = 0; // const/4 v1, 0x0
/* .line 5 */
/* iput-boolean v1, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 6 */
/* const/16 v2, 0x13 */
/* if-lt v1, v2, :cond_0 */
/* .line 7 */
v1 = this.S;
/* new-instance v2, Landroidx/fragment/app/Fragment$5; */
/* invoke-direct {v2, p0}, Landroidx/fragment/app/Fragment$5;-><init>(Landroidx/fragment/app/Fragment;)V */
(( c.n.l ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lc/n/l;->a(Lc/n/i;)V
/* .line 8 */
} // :cond_0
v1 = this.V;
(( c.s.b ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lc/s/b;->a(Landroid/os/Bundle;)V
/* .line 9 */
(( androidx.fragment.app.Fragment ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->c(Landroid/os/Bundle;)V
/* .line 10 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->Q:Z */
/* .line 11 */
/* iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->G:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 12 */
p1 = this.S;
v0 = c.n.g$a.ON_CREATE;
(( c.n.l ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/n/l;->a(Lc/n/g$a;)V
return;
/* .line 13 */
} // :cond_1
/* new-instance p1, Lc/l/d/k3; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Fragment "; // const-string v1, "Fragment "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " did not call through to super.onCreate()"; // const-string v1, " did not call through to super.onCreate()"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Lc/l/d/k3;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void h ( Boolean p0 ) {
/* .locals 1 */
/* .line 14 */
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
/* iput-boolean p1, v0, Lc/l/d/x;->y:Z */
return;
} // .end method
public Boolean h ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.r;
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public void h0 ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
return;
} // .end method
public final Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0}, Ljava/lang/Object;->hashCode()I */
} // .end method
public android.view.LayoutInflater i ( android.os.Bundle p0 ) {
/* .locals 0 */
/* .line 5 */
(( androidx.fragment.app.Fragment ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->d(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
this.P = p1;
} // .end method
public void i ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->F:Z */
/* if-eq v0, p1, :cond_0 */
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->F:Z */
/* .line 3 */
/* iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->E:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = (( androidx.fragment.app.Fragment ) p0 ).Q ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Z
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = (( androidx.fragment.app.Fragment ) p0 ).R ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R()Z
/* if-nez p1, :cond_0 */
/* .line 4 */
p1 = this.u;
(( c.l.d.r0 ) p1 ).l ( ); // invoke-virtual {p1}, Lc/l/d/r0;->l()V
} // :cond_0
return;
} // .end method
public Boolean i ( ) {
/* .locals 1 */
/* .line 6 */
v0 = this.L;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.q;
/* if-nez v0, :cond_0 */
/* .line 7 */
} // :cond_0
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public void i0 ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
return;
} // .end method
public android.view.View j ( ) {
/* .locals 1 */
/* .line 7 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
} // :cond_0
v0 = this.a;
} // .end method
public void j ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .line 1 */
(( androidx.fragment.app.Fragment ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->e(Landroid/os/Bundle;)V
/* .line 2 */
v0 = this.V;
(( c.s.b ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/s/b;->b(Landroid/os/Bundle;)V
/* .line 3 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).M ( ); // invoke-virtual {v0}, Lc/l/d/o1;->M()Landroid/os/Parcelable;
if ( v0 != null) { // if-eqz v0, :cond_0
final String v1 = "android:support:fragments"; // const-string v1, "android:support:fragments"
/* .line 4 */
(( android.os.Bundle ) p1 ).putParcelable ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
} // :cond_0
return;
} // .end method
public void j ( Boolean p0 ) {
/* .locals 1 */
/* .line 5 */
v0 = this.L;
/* if-nez v0, :cond_0 */
return;
/* .line 6 */
} // :cond_0
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
/* iput-boolean p1, v0, Lc/l/d/x;->c:Z */
return;
} // .end method
public void j0 ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.X;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Lc/l/d/y; */
/* .line 2 */
(( c.l.d.y ) v1 ).a ( ); // invoke-virtual {v1}, Lc/l/d/y;->a()V
/* .line 3 */
} // :cond_0
v0 = this.X;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 4 */
v0 = this.v;
v1 = this.u;
(( androidx.fragment.app.Fragment ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->a()Lc/l/d/n0;
(( c.l.d.o1 ) v0 ).a ( v1, v2, p0 ); // invoke-virtual {v0, v1, v2, p0}, Lc/l/d/o1;->a(Lc/l/d/r0;Lc/l/d/n0;Landroidx/fragment/app/Fragment;)V
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
/* iput v0, p0, Landroidx/fragment/app/Fragment;->b:I */
/* .line 6 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 7 */
v0 = this.u;
(( c.l.d.r0 ) v0 ).h ( ); // invoke-virtual {v0}, Lc/l/d/r0;->h()Landroid/content/Context;
(( androidx.fragment.app.Fragment ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->a(Landroid/content/Context;)V
/* .line 8 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 9 */
v0 = this.t;
(( c.l.d.o1 ) v0 ).h ( p0 ); // invoke-virtual {v0, p0}, Lc/l/d/o1;->h(Landroidx/fragment/app/Fragment;)V
/* .line 10 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).h ( ); // invoke-virtual {v0}, Lc/l/d/o1;->h()V
return;
/* .line 11 */
} // :cond_1
/* new-instance v0, Lc/l/d/k3; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Fragment "; // const-string v2, "Fragment "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " did not call through to super.onAttach()"; // const-string v2, " did not call through to super.onAttach()"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lc/l/d/k3;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public android.animation.Animator k ( ) {
/* .locals 1 */
/* .line 13 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 14 */
} // :cond_0
v0 = this.b;
} // .end method
public void k ( android.os.Bundle p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
final String v0 = "android:support:fragments"; // const-string v0, "android:support:fragments"
/* .line 10 */
(( android.os.Bundle ) p1 ).getParcelable ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 11 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Landroid/os/Parcelable;)V
/* .line 12 */
p1 = this.v;
(( c.l.d.o1 ) p1 ).i ( ); // invoke-virtual {p1}, Lc/l/d/o1;->i()V
} // :cond_0
return;
} // .end method
public void k ( Boolean p0 ) {
/* .locals 3 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->K:Z */
int v1 = 5; // const/4 v1, 0x5
/* if-nez v0, :cond_0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* iget v0, p0, Landroidx/fragment/app/Fragment;->b:I */
/* if-ge v0, v1, :cond_0 */
v0 = this.t;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( androidx.fragment.app.Fragment ) p0 ).Q ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->Q:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.t;
/* .line 4 */
(( c.l.d.o1 ) v0 ).e ( p0 ); // invoke-virtual {v0, p0}, Lc/l/d/o1;->e(Landroidx/fragment/app/Fragment;)Lc/l/d/a2;
/* .line 5 */
(( c.l.d.o1 ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lc/l/d/o1;->a(Lc/l/d/a2;)V
/* .line 6 */
} // :cond_0
/* iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->K:Z */
/* .line 7 */
/* iget v0, p0, Landroidx/fragment/app/Fragment;->b:I */
/* if-ge v0, v1, :cond_1 */
/* if-nez p1, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->J:Z */
/* .line 8 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 9 */
java.lang.Boolean .valueOf ( p1 );
this.f = p1;
} // :cond_2
return;
} // .end method
public void k0 ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).j ( ); // invoke-virtual {v0}, Lc/l/d/o1;->j()V
/* .line 2 */
v0 = this.S;
v1 = c.n.g$a.ON_DESTROY;
(( c.n.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput v0, p0, Landroidx/fragment/app/Fragment;->b:I */
/* .line 4 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 5 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->Q:Z */
/* .line 6 */
(( androidx.fragment.app.Fragment ) p0 ).b0 ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b0()V
/* .line 7 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 8 */
} // :cond_0
/* new-instance v0, Lc/l/d/k3; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Fragment "; // const-string v2, "Fragment "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " did not call through to super.onDestroy()"; // const-string v2, " did not call through to super.onDestroy()"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lc/l/d/k3;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final c.l.d.o1 l ( ) {
/* .locals 3 */
/* .line 13 */
v0 = this.u;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 14 */
v0 = this.v;
/* .line 15 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Fragment "; // const-string v2, "Fragment "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " has not been attached yet."; // const-string v2, " has not been attached yet."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final void l ( android.os.Bundle p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.d;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v2 = this.I;
(( android.view.View ) v2 ).restoreHierarchyState ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V
/* .line 3 */
this.d = v1;
/* .line 4 */
} // :cond_0
v0 = this.I;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
v0 = this.T;
v2 = this.e;
(( c.l.d.y2 ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lc/l/d/y2;->a(Landroid/os/Bundle;)V
/* .line 6 */
this.e = v1;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 8 */
(( androidx.fragment.app.Fragment ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->f(Landroid/os/Bundle;)V
/* .line 9 */
/* iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->G:Z */
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 10 */
p1 = this.I;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 11 */
p1 = this.T;
v0 = c.n.g$a.ON_CREATE;
(( c.l.d.y2 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/l/d/y2;->a(Lc/n/g$a;)V
} // :cond_2
return;
/* .line 12 */
} // :cond_3
/* new-instance p1, Lc/l/d/k3; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Fragment "; // const-string v1, "Fragment "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " did not call through to super.onViewStateRestored()"; // const-string v1, " did not call through to super.onViewStateRestored()"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Lc/l/d/k3;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void l0 ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).k ( ); // invoke-virtual {v0}, Lc/l/d/o1;->k()V
/* .line 2 */
v0 = this.I;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.T;
(( c.l.d.y2 ) v0 ).g ( ); // invoke-virtual {v0}, Lc/l/d/y2;->g()Lc/n/g;
(( c.n.g ) v0 ).a ( ); // invoke-virtual {v0}, Lc/n/g;->a()Lc/n/g$b;
v1 = c.n.g$b.d;
/* .line 3 */
v0 = (( c.n.g$b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/g$b;->a(Lc/n/g$b;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
v0 = this.T;
v1 = c.n.g$a.ON_DESTROY;
(( c.l.d.y2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/l/d/y2;->a(Lc/n/g$a;)V
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
/* iput v0, p0, Landroidx/fragment/app/Fragment;->b:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 7 */
(( androidx.fragment.app.Fragment ) p0 ).d0 ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d0()V
/* .line 8 */
/* iget-boolean v1, p0, Landroidx/fragment/app/Fragment;->G:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 9 */
c.o.a.a .a ( p0 );
(( c.o.a.a ) v1 ).a ( ); // invoke-virtual {v1}, Lc/o/a/a;->a()V
/* .line 10 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->r:Z */
return;
/* .line 11 */
} // :cond_1
/* new-instance v0, Lc/l/d/k3; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Fragment "; // const-string v2, "Fragment "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " did not call through to super.onDestroyView()"; // const-string v2, " did not call through to super.onDestroyView()"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lc/l/d/k3;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public android.content.Context m ( ) {
/* .locals 1 */
/* .line 4 */
v0 = this.u;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
(( c.l.d.r0 ) v0 ).h ( ); // invoke-virtual {v0}, Lc/l/d/r0;->h()Landroid/content/Context;
} // :goto_0
} // .end method
public void m ( android.os.Bundle p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.t;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( androidx.fragment.app.Fragment ) p0 ).Y ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Y()Z
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "Fragment already added and state has been saved"; // const-string v0, "Fragment already added and state has been saved"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 3 */
} // :cond_1
} // :goto_0
this.h = p1;
return;
} // .end method
public void m0 ( ) {
/* .locals 3 */
int v0 = -1; // const/4 v0, -0x1
/* .line 1 */
/* iput v0, p0, Landroidx/fragment/app/Fragment;->b:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 3 */
(( androidx.fragment.app.Fragment ) p0 ).e0 ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->e0()V
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
this.P = v0;
/* .line 5 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
v0 = this.v;
v0 = (( c.l.d.o1 ) v0 ).H ( ); // invoke-virtual {v0}, Lc/l/d/o1;->H()Z
/* if-nez v0, :cond_0 */
/* .line 7 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).j ( ); // invoke-virtual {v0}, Lc/l/d/o1;->j()V
/* .line 8 */
/* new-instance v0, Lc/l/d/p1; */
/* invoke-direct {v0}, Lc/l/d/p1;-><init>()V */
this.v = v0;
} // :cond_0
return;
/* .line 9 */
} // :cond_1
/* new-instance v0, Lc/l/d/k3; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Fragment "; // const-string v2, "Fragment "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " did not call through to super.onDetach()"; // const-string v2, " did not call through to super.onDetach()"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lc/l/d/k3;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Integer n ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
/* iget v0, v0, Lc/l/d/x;->d:I */
} // .end method
public void n0 ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.fragment.app.Fragment ) p0 ).onLowMemory ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->onLowMemory()V
/* .line 2 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).l ( ); // invoke-virtual {v0}, Lc/l/d/o1;->l()V
return;
} // .end method
public java.lang.Object o ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = this.k;
} // .end method
public void o0 ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).m ( ); // invoke-virtual {v0}, Lc/l/d/o1;->m()V
/* .line 2 */
v0 = this.I;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.T;
v1 = c.n.g$a.ON_PAUSE;
(( c.l.d.y2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/l/d/y2;->a(Lc/n/g$a;)V
/* .line 4 */
} // :cond_0
v0 = this.S;
v1 = c.n.g$a.ON_PAUSE;
(( c.n.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V
int v0 = 6; // const/4 v0, 0x6
/* .line 5 */
/* iput v0, p0, Landroidx/fragment/app/Fragment;->b:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 7 */
(( androidx.fragment.app.Fragment ) p0 ).f0 ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()V
/* .line 8 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
return;
/* .line 9 */
} // :cond_1
/* new-instance v0, Lc/l/d/k3; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Fragment "; // const-string v2, "Fragment "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " did not call through to super.onPause()"; // const-string v2, " did not call through to super.onPause()"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lc/l/d/k3;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 0 */
int p1 = 1; // const/4 p1, 0x1
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->G:Z */
return;
} // .end method
public void onCreateContextMenu ( android.view.ContextMenu p0, android.view.View p1, android.view.ContextMenu$ContextMenuInfo p2 ) {
/* .locals 1 */
/* .line 1 */
(( androidx.fragment.app.Fragment ) p0 ).u0 ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u0()Lc/l/d/f0;
(( android.app.Activity ) v0 ).onCreateContextMenu ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
return;
} // .end method
public void onLowMemory ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
return;
} // .end method
public c.h.e.i0 p ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = this.s;
} // .end method
public void p0 ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.t;
v0 = (( c.l.d.o1 ) v0 ).q ( p0 ); // invoke-virtual {v0, p0}, Lc/l/d/o1;->q(Landroidx/fragment/app/Fragment;)Z
/* .line 2 */
v1 = this.l;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
v1 = (( java.lang.Boolean ) v1 ).booleanValue ( ); // invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
/* if-eq v1, v0, :cond_1 */
/* .line 4 */
} // :cond_0
java.lang.Boolean .valueOf ( v0 );
this.l = v1;
/* .line 5 */
(( androidx.fragment.app.Fragment ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->e(Z)V
/* .line 6 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).n ( ); // invoke-virtual {v0}, Lc/l/d/o1;->n()V
} // :cond_1
return;
} // .end method
public Integer q ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
/* iget v0, v0, Lc/l/d/x;->e:I */
} // .end method
public void q0 ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).J ( ); // invoke-virtual {v0}, Lc/l/d/o1;->J()V
/* .line 2 */
v0 = this.v;
int v1 = 1; // const/4 v1, 0x1
(( c.l.d.o1 ) v0 ).d ( v1 ); // invoke-virtual {v0, v1}, Lc/l/d/o1;->d(Z)Z
int v0 = 7; // const/4 v0, 0x7
/* .line 3 */
/* iput v0, p0, Landroidx/fragment/app/Fragment;->b:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 5 */
(( androidx.fragment.app.Fragment ) p0 ).g0 ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->g0()V
/* .line 6 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
v0 = this.S;
v1 = c.n.g$a.ON_RESUME;
(( c.n.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V
/* .line 8 */
v0 = this.I;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 9 */
v0 = this.T;
v1 = c.n.g$a.ON_RESUME;
(( c.l.d.y2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/l/d/y2;->a(Lc/n/g$a;)V
/* .line 10 */
} // :cond_0
v0 = this.v;
(( c.l.d.o1 ) v0 ).o ( ); // invoke-virtual {v0}, Lc/l/d/o1;->o()V
return;
/* .line 11 */
} // :cond_1
/* new-instance v0, Lc/l/d/k3; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Fragment "; // const-string v2, "Fragment "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " did not call through to super.onResume()"; // const-string v2, " did not call through to super.onResume()"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lc/l/d/k3;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.lang.Object r ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = this.m;
} // .end method
public void r0 ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).J ( ); // invoke-virtual {v0}, Lc/l/d/o1;->J()V
/* .line 2 */
v0 = this.v;
int v1 = 1; // const/4 v1, 0x1
(( c.l.d.o1 ) v0 ).d ( v1 ); // invoke-virtual {v0, v1}, Lc/l/d/o1;->d(Z)Z
int v0 = 5; // const/4 v0, 0x5
/* .line 3 */
/* iput v0, p0, Landroidx/fragment/app/Fragment;->b:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 5 */
(( androidx.fragment.app.Fragment ) p0 ).h0 ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()V
/* .line 6 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
v0 = this.S;
v1 = c.n.g$a.ON_START;
(( c.n.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V
/* .line 8 */
v0 = this.I;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 9 */
v0 = this.T;
v1 = c.n.g$a.ON_START;
(( c.l.d.y2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/l/d/y2;->a(Lc/n/g$a;)V
/* .line 10 */
} // :cond_0
v0 = this.v;
(( c.l.d.o1 ) v0 ).p ( ); // invoke-virtual {v0}, Lc/l/d/o1;->p()V
return;
/* .line 11 */
} // :cond_1
/* new-instance v0, Lc/l/d/k3; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Fragment "; // const-string v2, "Fragment "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " did not call through to super.onStart()"; // const-string v2, " did not call through to super.onStart()"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lc/l/d/k3;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public c.h.e.i0 s ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = this.t;
} // .end method
public void s0 ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).q ( ); // invoke-virtual {v0}, Lc/l/d/o1;->q()V
/* .line 2 */
v0 = this.I;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.T;
v1 = c.n.g$a.ON_STOP;
(( c.l.d.y2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/l/d/y2;->a(Lc/n/g$a;)V
/* .line 4 */
} // :cond_0
v0 = this.S;
v1 = c.n.g$a.ON_STOP;
(( c.n.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V
int v0 = 4; // const/4 v0, 0x4
/* .line 5 */
/* iput v0, p0, Landroidx/fragment/app/Fragment;->b:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
/* iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
/* .line 7 */
(( androidx.fragment.app.Fragment ) p0 ).i0 ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->i0()V
/* .line 8 */
/* iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
return;
/* .line 9 */
} // :cond_1
/* new-instance v0, Lc/l/d/k3; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Fragment "; // const-string v2, "Fragment "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " did not call through to super.onStop()"; // const-string v2, " did not call through to super.onStop()"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lc/l/d/k3;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public android.view.View t ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = this.v;
} // .end method
public void t0 ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.I;
v1 = this.c;
(( androidx.fragment.app.Fragment ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->a(Landroid/view/View;Landroid/os/Bundle;)V
/* .line 2 */
v0 = this.v;
(( c.l.d.o1 ) v0 ).r ( ); // invoke-virtual {v0}, Lc/l/d/o1;->r()V
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* const/16 v1, 0x80 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
/* .line 2 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* .line 3 */
(( java.lang.Class ) v1 ).getSimpleName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "{"; // const-string v1, "{"
/* .line 4 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 5 */
v1 = java.lang.System .identityHashCode ( p0 );
java.lang.Integer .toHexString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
/* .line 6 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " ("; // const-string v1, " ("
/* .line 7 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 8 */
v1 = this.g;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 9 */
/* iget v1, p0, Landroidx/fragment/app/Fragment;->x:I */
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = " id=0x"; // const-string v1, " id=0x"
/* .line 10 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 11 */
/* iget v1, p0, Landroidx/fragment/app/Fragment;->x:I */
java.lang.Integer .toHexString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 12 */
} // :cond_0
v1 = this.z;
if ( v1 != null) { // if-eqz v1, :cond_1
final String v1 = " tag="; // const-string v1, " tag="
/* .line 13 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 14 */
v1 = this.z;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_1
final String v1 = ")"; // const-string v1, ")"
/* .line 15 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 16 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public final c.l.d.o1 u ( ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
v0 = this.t;
} // .end method
public final c.l.d.f0 u0 ( ) {
/* .locals 3 */
/* .line 1 */
(( androidx.fragment.app.Fragment ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->e()Lc/l/d/f0;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Fragment "; // const-string v2, "Fragment "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " not attached to an activity."; // const-string v2, " not attached to an activity."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final java.lang.Object v ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
(( c.l.d.r0 ) v0 ).j ( ); // invoke-virtual {v0}, Lc/l/d/r0;->j()Ljava/lang/Object;
} // :goto_0
} // .end method
public final android.content.Context v0 ( ) {
/* .locals 3 */
/* .line 1 */
(( androidx.fragment.app.Fragment ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Fragment "; // const-string v2, "Fragment "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " not attached to a context."; // const-string v2, " not attached to a context."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final Integer w ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.R;
v1 = c.n.g$b.c;
/* if-eq v0, v1, :cond_1 */
v1 = this.w;
/* if-nez v1, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = (( java.lang.Enum ) v0 ).ordinal ( ); // invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I
v1 = this.w;
v1 = (( androidx.fragment.app.Fragment ) v1 ).w ( ); // invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->w()I
v0 = java.lang.Math .min ( v0,v1 );
/* .line 3 */
} // :cond_1
} // :goto_0
v0 = this.R;
v0 = (( java.lang.Enum ) v0 ).ordinal ( ); // invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I
} // .end method
public final android.view.View w0 ( ) {
/* .locals 3 */
/* .line 1 */
(( androidx.fragment.app.Fragment ) p0 ).M ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M()Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Fragment "; // const-string v2, "Fragment "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " did not return a View from onCreateView() or this was called before onCreateView()."; // const-string v2, " did not return a View from onCreateView() or this was called before onCreateView()."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Integer x ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
/* iget v0, v0, Lc/l/d/x;->h:I */
} // .end method
public final void x0 ( ) {
/* .locals 2 */
int v0 = 3; // const/4 v0, 0x3
/* .line 1 */
v0 = c.l.d.o1 .d ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "moveto RESTORE_VIEW_STATE: "; // const-string v1, "moveto RESTORE_VIEW_STATE: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "FragmentManager"; // const-string v1, "FragmentManager"
android.util.Log .d ( v1,v0 );
/* .line 3 */
} // :cond_0
v0 = this.I;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
v0 = this.c;
(( androidx.fragment.app.Fragment ) p0 ).l ( v0 ); // invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->l(Landroid/os/Bundle;)V
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
this.c = v0;
return;
} // .end method
public final androidx.fragment.app.Fragment y ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.w;
} // .end method
public void y0 ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.L;
if ( v0 != null) { // if-eqz v0, :cond_3
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
/* iget-boolean v0, v0, Lc/l/d/x;->w:Z */
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = this.u;
/* if-nez v0, :cond_1 */
/* .line 3 */
(( androidx.fragment.app.Fragment ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->d()Lc/l/d/x;
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, v0, Lc/l/d/x;->w:Z */
/* .line 4 */
} // :cond_1
android.os.Looper .myLooper ( );
v1 = this.u;
(( c.l.d.r0 ) v1 ).i ( ); // invoke-virtual {v1}, Lc/l/d/r0;->i()Landroid/os/Handler;
(( android.os.Handler ) v1 ).getLooper ( ); // invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
/* if-eq v0, v1, :cond_2 */
/* .line 5 */
v0 = this.u;
(( c.l.d.r0 ) v0 ).i ( ); // invoke-virtual {v0}, Lc/l/d/r0;->i()Landroid/os/Handler;
/* new-instance v1, Lc/l/d/u; */
/* invoke-direct {v1, p0}, Lc/l/d/u;-><init>(Landroidx/fragment/app/Fragment;)V */
(( android.os.Handler ) v0 ).postAtFrontOfQueue ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* .line 6 */
(( androidx.fragment.app.Fragment ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->a(Z)V
} // :cond_3
} // :goto_0
return;
} // .end method
public final c.l.d.o1 z ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.t;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Fragment "; // const-string v2, "Fragment "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " not associated with a fragment manager."; // const-string v2, " not associated with a fragment manager."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
