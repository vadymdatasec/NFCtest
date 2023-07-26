public abstract class c.l.d.b2 extends c.y.a.a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* # instance fields */
public final c.l.d.o1 a;
public final Integer b;
public c.l.d.e2 c;
public java.util.ArrayList d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Lc/l/d/b0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.ArrayList e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroidx/fragment/app/Fragment;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public androidx.fragment.app.Fragment f;
public Boolean g;
/* # direct methods */
public c.l.d.b2 ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Lc/y/a/a;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.c = v0;
/* .line 3 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.d = v1;
/* .line 4 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.e = v1;
/* .line 5 */
this.f = v0;
/* .line 6 */
this.a = p1;
/* .line 7 */
/* iput p2, p0, Lc/l/d/b2;->b:I */
return;
} // .end method
/* # virtual methods */
public java.lang.Object a ( android.view.ViewGroup p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.e;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-le v0, p2, :cond_0 */
/* .line 2 */
v0 = this.e;
(( java.util.ArrayList ) v0 ).get ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroidx/fragment/app/Fragment; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
} // :cond_0
v0 = this.c;
/* if-nez v0, :cond_1 */
/* .line 4 */
v0 = this.a;
(( c.l.d.o1 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/l/d/o1;->b()Lc/l/d/e2;
this.c = v0;
/* .line 5 */
} // :cond_1
(( c.l.d.b2 ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lc/l/d/b2;->b(I)Landroidx/fragment/app/Fragment;
/* .line 6 */
v1 = this.d;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-le v1, p2, :cond_2 */
/* .line 7 */
v1 = this.d;
(( java.util.ArrayList ) v1 ).get ( p2 ); // invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Lc/l/d/b0; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 8 */
(( androidx.fragment.app.Fragment ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->a(Lc/l/d/b0;)V
/* .line 9 */
} // :cond_2
} // :goto_0
v1 = this.e;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-gt v1, p2, :cond_3 */
/* .line 10 */
v1 = this.e;
int v2 = 0; // const/4 v2, 0x0
(( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_3
int v1 = 0; // const/4 v1, 0x0
/* .line 11 */
(( androidx.fragment.app.Fragment ) v0 ).i ( v1 ); // invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->i(Z)V
/* .line 12 */
/* iget v2, p0, Lc/l/d/b2;->b:I */
/* if-nez v2, :cond_4 */
/* .line 13 */
(( androidx.fragment.app.Fragment ) v0 ).k ( v1 ); // invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->k(Z)V
/* .line 14 */
} // :cond_4
v1 = this.e;
(( java.util.ArrayList ) v1 ).set ( p2, v0 ); // invoke-virtual {v1, p2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
/* .line 15 */
p2 = this.c;
p1 = (( android.view.ViewGroup ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I
(( c.l.d.e2 ) p2 ).a ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Lc/l/d/e2;->a(ILandroidx/fragment/app/Fragment;)Lc/l/d/e2;
/* .line 16 */
/* iget p1, p0, Lc/l/d/b2;->b:I */
int p2 = 1; // const/4 p2, 0x1
/* if-ne p1, p2, :cond_5 */
/* .line 17 */
p1 = this.c;
p2 = c.n.g$b.e;
(( c.l.d.e2 ) p1 ).a ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;Lc/n/g$b;)Lc/l/d/e2;
} // :cond_5
} // .end method
public void a ( android.os.Parcelable p0, java.lang.ClassLoader p1 ) {
/* .locals 5 */
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 38 */
/* check-cast p1, Landroid/os/Bundle; */
/* .line 39 */
(( android.os.Bundle ) p1 ).setClassLoader ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
final String p2 = "states"; // const-string p2, "states"
/* .line 40 */
(( android.os.Bundle ) p1 ).getParcelableArray ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;
/* .line 41 */
v0 = this.d;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 42 */
v0 = this.e;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
int v0 = 0; // const/4 v0, 0x0
if ( p2 != null) { // if-eqz p2, :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 43 */
} // :goto_0
/* array-length v2, p2 */
/* if-ge v1, v2, :cond_0 */
/* .line 44 */
v2 = this.d;
/* aget-object v3, p2, v1 */
/* check-cast v3, Lc/l/d/b0; */
(( java.util.ArrayList ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v1, v1, 0x1 */
/* .line 45 */
} // :cond_0
(( android.os.Bundle ) p1 ).keySet ( ); // invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
/* .line 46 */
} // :cond_1
v1 = } // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_4
/* check-cast v1, Ljava/lang/String; */
final String v2 = "f"; // const-string v2, "f"
/* .line 47 */
v2 = (( java.lang.String ) v1 ).startsWith ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
int v2 = 1; // const/4 v2, 0x1
/* .line 48 */
(( java.lang.String ) v1 ).substring ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
v2 = java.lang.Integer .parseInt ( v2 );
/* .line 49 */
v3 = this.a;
(( c.l.d.o1 ) v3 ).a ( p1, v1 ); // invoke-virtual {v3, p1, v1}, Lc/l/d/o1;->a(Landroid/os/Bundle;Ljava/lang/String;)Landroidx/fragment/app/Fragment;
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 50 */
} // :goto_2
v1 = this.e;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-gt v1, v2, :cond_2 */
/* .line 51 */
v1 = this.e;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v1 ).add ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 52 */
} // :cond_2
(( androidx.fragment.app.Fragment ) v3 ).i ( v0 ); // invoke-virtual {v3, v0}, Landroidx/fragment/app/Fragment;->i(Z)V
/* .line 53 */
v1 = this.e;
(( java.util.ArrayList ) v1 ).set ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
/* .line 54 */
} // :cond_3
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Bad fragment at key "; // const-string v3, "Bad fragment at key "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "FragmentStatePagerAdapt"; // const-string v2, "FragmentStatePagerAdapt"
android.util.Log .w ( v2,v1 );
} // :cond_4
return;
} // .end method
public void a ( android.view.ViewGroup p0 ) {
/* .locals 2 */
/* .line 30 */
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 31 */
/* iget-boolean v0, p0, Lc/l/d/b2;->g:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 32 */
try { // :try_start_0
/* iput-boolean v0, p0, Lc/l/d/b2;->g:Z */
/* .line 33 */
(( c.l.d.e2 ) p1 ).c ( ); // invoke-virtual {p1}, Lc/l/d/e2;->c()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 34 */
/* iput-boolean v1, p0, Lc/l/d/b2;->g:Z */
/* :catchall_0 */
/* move-exception p1 */
/* iput-boolean v1, p0, Lc/l/d/b2;->g:Z */
/* .line 35 */
/* throw p1 */
} // :cond_0
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
/* .line 36 */
this.c = p1;
} // :cond_1
return;
} // .end method
public void a ( android.view.ViewGroup p0, Integer p1, java.lang.Object p2 ) {
/* .locals 2 */
/* .line 18 */
/* check-cast p3, Landroidx/fragment/app/Fragment; */
/* .line 19 */
p1 = this.c;
/* if-nez p1, :cond_0 */
/* .line 20 */
p1 = this.a;
(( c.l.d.o1 ) p1 ).b ( ); // invoke-virtual {p1}, Lc/l/d/o1;->b()Lc/l/d/e2;
this.c = p1;
/* .line 21 */
} // :cond_0
} // :goto_0
p1 = this.d;
p1 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
int v0 = 0; // const/4 v0, 0x0
/* if-gt p1, p2, :cond_1 */
/* .line 22 */
p1 = this.d;
(( java.util.ArrayList ) p1 ).add ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 23 */
} // :cond_1
p1 = this.d;
v1 = (( androidx.fragment.app.Fragment ) p3 ).Q ( ); // invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->Q()Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 24 */
v1 = this.a;
(( c.l.d.o1 ) v1 ).u ( p3 ); // invoke-virtual {v1, p3}, Lc/l/d/o1;->u(Landroidx/fragment/app/Fragment;)Lc/l/d/b0;
} // :cond_2
/* move-object v1, v0 */
/* .line 25 */
} // :goto_1
(( java.util.ArrayList ) p1 ).set ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
/* .line 26 */
p1 = this.e;
(( java.util.ArrayList ) p1 ).set ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
/* .line 27 */
p1 = this.c;
(( c.l.d.e2 ) p1 ).a ( p3 ); // invoke-virtual {p1, p3}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;)Lc/l/d/e2;
/* .line 28 */
p1 = this.f;
p1 = (( androidx.fragment.app.Fragment ) p3 ).equals ( p1 ); // invoke-virtual {p3, p1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 29 */
this.f = v0;
} // :cond_3
return;
} // .end method
public Boolean a ( android.view.View p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .line 37 */
/* check-cast p2, Landroidx/fragment/app/Fragment; */
(( androidx.fragment.app.Fragment ) p2 ).M ( ); // invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->M()Landroid/view/View;
/* if-ne p2, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public android.os.Parcelable b ( ) {
/* .locals 5 */
/* .line 18 */
v0 = this.d;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-lez v0, :cond_0 */
/* .line 19 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 20 */
v1 = this.d;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* new-array v1, v1, [Lc/l/d/b0; */
/* .line 21 */
v2 = this.d;
(( java.util.ArrayList ) v2 ).toArray ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
final String v2 = "states"; // const-string v2, "states"
/* .line 22 */
(( android.os.Bundle ) v0 ).putParcelableArray ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
/* .line 23 */
} // :goto_1
v2 = this.e;
v2 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
/* if-ge v1, v2, :cond_3 */
/* .line 24 */
v2 = this.e;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroidx/fragment/app/Fragment; */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 25 */
v3 = (( androidx.fragment.app.Fragment ) v2 ).Q ( ); // invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->Q()Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* if-nez v0, :cond_1 */
/* .line 26 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 27 */
} // :cond_1
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "f"; // const-string v4, "f"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 28 */
v4 = this.a;
(( c.l.d.o1 ) v4 ).a ( v0, v3, v2 ); // invoke-virtual {v4, v0, v3, v2}, Lc/l/d/o1;->a(Landroid/os/Bundle;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_3
} // .end method
public abstract androidx.fragment.app.Fragment b ( Integer p0 ) {
} // .end method
public void b ( android.view.ViewGroup p0 ) {
/* .locals 2 */
/* .line 1 */
p1 = (( android.view.ViewGroup ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I
int v0 = -1; // const/4 v0, -0x1
/* if-eq p1, v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "ViewPager with adapter "; // const-string v1, "ViewPager with adapter "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " requires a view id"; // const-string v1, " requires a view id"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void b ( android.view.ViewGroup p0, Integer p1, java.lang.Object p2 ) {
/* .locals 2 */
/* .line 3 */
/* check-cast p3, Landroidx/fragment/app/Fragment; */
/* .line 4 */
p1 = this.f;
/* if-eq p3, p1, :cond_5 */
int p2 = 1; // const/4 p2, 0x1
if ( p1 != null) { // if-eqz p1, :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
(( androidx.fragment.app.Fragment ) p1 ).i ( v0 ); // invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->i(Z)V
/* .line 6 */
/* iget p1, p0, Lc/l/d/b2;->b:I */
/* if-ne p1, p2, :cond_1 */
/* .line 7 */
p1 = this.c;
/* if-nez p1, :cond_0 */
/* .line 8 */
p1 = this.a;
(( c.l.d.o1 ) p1 ).b ( ); // invoke-virtual {p1}, Lc/l/d/o1;->b()Lc/l/d/e2;
this.c = p1;
/* .line 9 */
} // :cond_0
p1 = this.c;
v0 = this.f;
v1 = c.n.g$b.e;
(( c.l.d.e2 ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;Lc/n/g$b;)Lc/l/d/e2;
/* .line 10 */
} // :cond_1
p1 = this.f;
(( androidx.fragment.app.Fragment ) p1 ).k ( v0 ); // invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->k(Z)V
/* .line 11 */
} // :cond_2
} // :goto_0
(( androidx.fragment.app.Fragment ) p3 ).i ( p2 ); // invoke-virtual {p3, p2}, Landroidx/fragment/app/Fragment;->i(Z)V
/* .line 12 */
/* iget p1, p0, Lc/l/d/b2;->b:I */
/* if-ne p1, p2, :cond_4 */
/* .line 13 */
p1 = this.c;
/* if-nez p1, :cond_3 */
/* .line 14 */
p1 = this.a;
(( c.l.d.o1 ) p1 ).b ( ); // invoke-virtual {p1}, Lc/l/d/o1;->b()Lc/l/d/e2;
this.c = p1;
/* .line 15 */
} // :cond_3
p1 = this.c;
p2 = c.n.g$b.f;
(( c.l.d.e2 ) p1 ).a ( p3, p2 ); // invoke-virtual {p1, p3, p2}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;Lc/n/g$b;)Lc/l/d/e2;
/* .line 16 */
} // :cond_4
(( androidx.fragment.app.Fragment ) p3 ).k ( p2 ); // invoke-virtual {p3, p2}, Landroidx/fragment/app/Fragment;->k(Z)V
/* .line 17 */
} // :goto_1
this.f = p3;
} // :cond_5
return;
} // .end method
