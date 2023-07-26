public class c.n.l extends c.n.g {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public c.c.a.b.a a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/c/a/b/a<", */
	 /* "Lc/n/i;", */
	 /* "Lc/n/k;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public c.n.g$b b;
public final java.lang.ref.WeakReference c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference<", */
/* "Lc/n/j;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Integer d;
public Boolean e;
public Boolean f;
public java.util.ArrayList g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Lc/n/g$b;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final Boolean h;
/* # direct methods */
public c.n.l ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* invoke-direct {p0, p1, v0}, Lc/n/l;-><init>(Lc/n/j;Z)V */
return;
} // .end method
public c.n.l ( ) {
/* .locals 1 */
/* .line 2 */
/* invoke-direct {p0}, Lc/n/g;-><init>()V */
/* .line 3 */
/* new-instance v0, Lc/c/a/b/a; */
/* invoke-direct {v0}, Lc/c/a/b/a;-><init>()V */
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput v0, p0, Lc/n/l;->d:I */
/* .line 5 */
/* iput-boolean v0, p0, Lc/n/l;->e:Z */
/* .line 6 */
/* iput-boolean v0, p0, Lc/n/l;->f:Z */
/* .line 7 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.g = v0;
/* .line 8 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.c = v0;
/* .line 9 */
p1 = c.n.g$b.c;
this.b = p1;
/* .line 10 */
/* iput-boolean p2, p0, Lc/n/l;->h:Z */
return;
} // .end method
public static c.n.g$b a ( c.n.g$b p0, c.n.g$b p1 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 39 */
v0 = (( java.lang.Enum ) p1 ).compareTo ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I
/* if-gez v0, :cond_0 */
/* move-object p0, p1 */
} // :cond_0
} // .end method
/* # virtual methods */
public c.n.g$b a ( ) {
/* .locals 1 */
/* .line 23 */
v0 = this.b;
} // .end method
public void a ( c.n.g$a p0 ) {
/* .locals 1 */
final String v0 = "handleLifecycleEvent"; // const-string v0, "handleLifecycleEvent"
/* .line 3 */
(( c.n.l ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/n/l;->a(Ljava/lang/String;)V
/* .line 4 */
(( c.n.g$a ) p1 ).a ( ); // invoke-virtual {p1}, Lc/n/g$a;->a()Lc/n/g$b;
(( c.n.l ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/n/l;->b(Lc/n/g$b;)V
return;
} // .end method
public void a ( c.n.g$b p0 ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
final String v0 = "markState"; // const-string v0, "markState"
/* .line 1 */
(( c.n.l ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/n/l;->a(Ljava/lang/String;)V
/* .line 2 */
(( c.n.l ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/n/l;->d(Lc/n/g$b;)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 6 */
final String v0 = "addObserver"; // const-string v0, "addObserver"
/* .line 5 */
(( c.n.l ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/n/l;->a(Ljava/lang/String;)V
/* .line 6 */
v0 = this.b;
v1 = c.n.g$b.b;
/* if-ne v0, v1, :cond_0 */
} // :cond_0
v1 = c.n.g$b.c;
/* .line 7 */
} // :goto_0
/* new-instance v0, Lc/n/k; */
/* invoke-direct {v0, p1, v1}, Lc/n/k;-><init>(Lc/n/i;Lc/n/g$b;)V */
/* .line 8 */
v1 = this.a;
(( c.c.a.b.a ) v1 ).b ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lc/c/a/b/a;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Lc/n/k; */
if ( v1 != null) { // if-eqz v1, :cond_1
return;
/* .line 9 */
} // :cond_1
v1 = this.c;
(( java.lang.ref.WeakReference ) v1 ).get ( ); // invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v1, Lc/n/j; */
/* if-nez v1, :cond_2 */
return;
/* .line 10 */
} // :cond_2
/* iget v2, p0, Lc/n/l;->d:I */
int v3 = 1; // const/4 v3, 0x1
/* if-nez v2, :cond_4 */
/* iget-boolean v2, p0, Lc/n/l;->e:Z */
if ( v2 != null) { // if-eqz v2, :cond_3
} // :cond_3
int v2 = 0; // const/4 v2, 0x0
} // :cond_4
} // :goto_1
int v2 = 1; // const/4 v2, 0x1
/* .line 11 */
} // :goto_2
(( c.n.l ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/n/l;->c(Lc/n/i;)Lc/n/g$b;
/* .line 12 */
/* iget v5, p0, Lc/n/l;->d:I */
/* add-int/2addr v5, v3 */
/* iput v5, p0, Lc/n/l;->d:I */
/* .line 13 */
} // :goto_3
v5 = this.a;
v4 = (( java.lang.Enum ) v5 ).compareTo ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I
/* if-gez v4, :cond_6 */
v4 = this.a;
/* .line 14 */
v4 = (( c.c.a.b.a ) v4 ).contains ( p1 ); // invoke-virtual {v4, p1}, Lc/c/a/b/a;->contains(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 15 */
v4 = this.a;
(( c.n.l ) p0 ).c ( v4 ); // invoke-virtual {p0, v4}, Lc/n/l;->c(Lc/n/g$b;)V
/* .line 16 */
v4 = this.a;
c.n.g$a .b ( v4 );
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 17 */
(( c.n.k ) v0 ).a ( v1, v4 ); // invoke-virtual {v0, v1, v4}, Lc/n/k;->a(Lc/n/j;Lc/n/g$a;)V
/* .line 18 */
(( c.n.l ) p0 ).c ( ); // invoke-virtual {p0}, Lc/n/l;->c()V
/* .line 19 */
(( c.n.l ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/n/l;->c(Lc/n/i;)Lc/n/g$b;
/* .line 20 */
} // :cond_5
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "no event up from "; // const-string v2, "no event up from "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.a;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_6
/* if-nez v2, :cond_7 */
/* .line 21 */
(( c.n.l ) p0 ).d ( ); // invoke-virtual {p0}, Lc/n/l;->d()V
/* .line 22 */
} // :cond_7
/* iget p1, p0, Lc/n/l;->d:I */
/* sub-int/2addr p1, v3 */
/* iput p1, p0, Lc/n/l;->d:I */
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 5 */
/* .line 24 */
v0 = this.a;
/* .line 25 */
(( c.c.a.b.e ) v0 ).a ( ); // invoke-virtual {v0}, Lc/c/a/b/e;->a()Ljava/util/Iterator;
/* .line 26 */
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* iget-boolean v1, p0, Lc/n/l;->f:Z */
/* if-nez v1, :cond_2 */
/* .line 27 */
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 28 */
/* check-cast v2, Lc/n/k; */
/* .line 29 */
} // :goto_0
v3 = this.a;
v4 = this.b;
v3 = (( java.lang.Enum ) v3 ).compareTo ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I
/* if-lez v3, :cond_0 */
/* iget-boolean v3, p0, Lc/n/l;->f:Z */
/* if-nez v3, :cond_0 */
v3 = this.a;
/* .line 30 */
v3 = (( c.c.a.b.a ) v3 ).contains ( v4 ); // invoke-virtual {v3, v4}, Lc/c/a/b/a;->contains(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 31 */
v3 = this.a;
c.n.g$a .a ( v3 );
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 32 */
(( c.n.g$a ) v3 ).a ( ); // invoke-virtual {v3}, Lc/n/g$a;->a()Lc/n/g$b;
(( c.n.l ) p0 ).c ( v4 ); // invoke-virtual {p0, v4}, Lc/n/l;->c(Lc/n/g$b;)V
/* .line 33 */
(( c.n.k ) v2 ).a ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Lc/n/k;->a(Lc/n/j;Lc/n/g$a;)V
/* .line 34 */
(( c.n.l ) p0 ).c ( ); // invoke-virtual {p0}, Lc/n/l;->c()V
/* .line 35 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "no event down from "; // const-string v1, "no event down from "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_2
return;
} // .end method
public final void a ( java.lang.String p0 ) {
/* .locals 3 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "RestrictedApi" */
/* } */
} // .end annotation
/* .line 36 */
/* iget-boolean v0, p0, Lc/n/l;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 37 */
c.c.a.a.c .b ( );
v0 = (( c.c.a.a.c ) v0 ).a ( ); // invoke-virtual {v0}, Lc/c/a/a/c;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 38 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Method "; // const-string v2, "Method "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " must be called on the main thread"; // const-string p1, " must be called on the main thread"
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
} // :goto_0
return;
} // .end method
public final void b ( c.n.g$b p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
/* if-ne v0, p1, :cond_0 */
return;
/* .line 2 */
} // :cond_0
this.b = p1;
/* .line 3 */
/* iget-boolean p1, p0, Lc/n/l;->e:Z */
int v0 = 1; // const/4 v0, 0x1
/* if-nez p1, :cond_2 */
/* iget p1, p0, Lc/n/l;->d:I */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
} // :cond_1
/* iput-boolean v0, p0, Lc/n/l;->e:Z */
/* .line 5 */
(( c.n.l ) p0 ).d ( ); // invoke-virtual {p0}, Lc/n/l;->d()V
int p1 = 0; // const/4 p1, 0x0
/* .line 6 */
/* iput-boolean p1, p0, Lc/n/l;->e:Z */
return;
/* .line 7 */
} // :cond_2
} // :goto_0
/* iput-boolean v0, p0, Lc/n/l;->f:Z */
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 1 */
final String v0 = "removeObserver"; // const-string v0, "removeObserver"
/* .line 12 */
(( c.n.l ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/n/l;->a(Ljava/lang/String;)V
/* .line 13 */
v0 = this.a;
(( c.c.a.b.a ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Lc/c/a/b/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 5 */
/* .line 14 */
v0 = this.a;
/* .line 15 */
(( c.c.a.b.e ) v0 ).c ( ); // invoke-virtual {v0}, Lc/c/a/b/e;->c()Lc/c/a/b/e$a;
/* .line 16 */
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* iget-boolean v1, p0, Lc/n/l;->f:Z */
/* if-nez v1, :cond_2 */
/* .line 17 */
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 18 */
/* check-cast v2, Lc/n/k; */
/* .line 19 */
} // :goto_0
v3 = this.a;
v4 = this.b;
v3 = (( java.lang.Enum ) v3 ).compareTo ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I
/* if-gez v3, :cond_0 */
/* iget-boolean v3, p0, Lc/n/l;->f:Z */
/* if-nez v3, :cond_0 */
v3 = this.a;
/* .line 20 */
v3 = (( c.c.a.b.a ) v3 ).contains ( v4 ); // invoke-virtual {v3, v4}, Lc/c/a/b/a;->contains(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 21 */
v3 = this.a;
(( c.n.l ) p0 ).c ( v3 ); // invoke-virtual {p0, v3}, Lc/n/l;->c(Lc/n/g$b;)V
/* .line 22 */
v3 = this.a;
c.n.g$a .b ( v3 );
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 23 */
(( c.n.k ) v2 ).a ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Lc/n/k;->a(Lc/n/j;Lc/n/g$a;)V
/* .line 24 */
(( c.n.l ) p0 ).c ( ); // invoke-virtual {p0}, Lc/n/l;->c()V
/* .line 25 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "no event up from "; // const-string v1, "no event up from "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_2
return;
} // .end method
public final Boolean b ( ) {
/* .locals 3 */
/* .line 8 */
v0 = this.a;
v0 = (( c.c.a.b.e ) v0 ).size ( ); // invoke-virtual {v0}, Lc/c/a/b/e;->size()I
int v1 = 1; // const/4 v1, 0x1
/* if-nez v0, :cond_0 */
/* .line 9 */
} // :cond_0
v0 = this.a;
(( c.c.a.b.e ) v0 ).b ( ); // invoke-virtual {v0}, Lc/c/a/b/e;->b()Ljava/util/Map$Entry;
/* check-cast v0, Lc/n/k; */
v0 = this.a;
/* .line 10 */
v2 = this.a;
(( c.c.a.b.e ) v2 ).d ( ); // invoke-virtual {v2}, Lc/c/a/b/e;->d()Ljava/util/Map$Entry;
/* check-cast v2, Lc/n/k; */
v2 = this.a;
/* if-ne v0, v2, :cond_1 */
/* .line 11 */
v0 = this.b;
/* if-ne v0, v2, :cond_1 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public final c.n.g$b c ( Object p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
(( c.c.a.b.a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/c/a/b/a;->b(Ljava/lang/Object;)Ljava/util/Map$Entry;
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
/* check-cast p1, Lc/n/k; */
p1 = this.a;
} // :cond_0
/* move-object p1, v0 */
/* .line 3 */
} // :goto_0
v1 = this.g;
v1 = (( java.util.ArrayList ) v1 ).isEmpty ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z
/* if-nez v1, :cond_1 */
v0 = this.g;
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v1, v1, -0x1 */
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lc/n/g$b; */
/* .line 4 */
} // :cond_1
v1 = this.b;
c.n.l .a ( v1,p1 );
c.n.l .a ( p1,v0 );
} // .end method
public final void c ( ) {
/* .locals 2 */
/* .line 5 */
v0 = this.g;
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v1, v1, -0x1 */
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
return;
} // .end method
public final void c ( c.n.g$b p0 ) {
/* .locals 1 */
/* .line 6 */
v0 = this.g;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
return;
} // .end method
public final void d ( ) {
/* .locals 3 */
/* .line 3 */
v0 = this.c;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Lc/n/j; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 4 */
} // :cond_0
} // :goto_0
v1 = (( c.n.l ) p0 ).b ( ); // invoke-virtual {p0}, Lc/n/l;->b()Z
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_2 */
/* .line 5 */
/* iput-boolean v2, p0, Lc/n/l;->f:Z */
/* .line 6 */
v1 = this.b;
v2 = this.a;
(( c.c.a.b.e ) v2 ).b ( ); // invoke-virtual {v2}, Lc/c/a/b/e;->b()Ljava/util/Map$Entry;
/* check-cast v2, Lc/n/k; */
v2 = this.a;
v1 = (( java.lang.Enum ) v1 ).compareTo ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I
/* if-gez v1, :cond_1 */
/* .line 7 */
(( c.n.l ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/n/l;->a(Lc/n/j;)V
/* .line 8 */
} // :cond_1
v1 = this.a;
(( c.c.a.b.e ) v1 ).d ( ); // invoke-virtual {v1}, Lc/c/a/b/e;->d()Ljava/util/Map$Entry;
/* .line 9 */
/* iget-boolean v2, p0, Lc/n/l;->f:Z */
/* if-nez v2, :cond_0 */
if ( v1 != null) { // if-eqz v1, :cond_0
v2 = this.b;
/* .line 10 */
/* check-cast v1, Lc/n/k; */
v1 = this.a;
v1 = (( java.lang.Enum ) v2 ).compareTo ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I
/* if-lez v1, :cond_0 */
/* .line 11 */
(( c.n.l ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/n/l;->b(Lc/n/j;)V
/* .line 12 */
} // :cond_2
/* iput-boolean v2, p0, Lc/n/l;->f:Z */
return;
/* .line 13 */
} // :cond_3
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected.It is too late to change lifecycle state."; // const-string v1, "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected.It is too late to change lifecycle state."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void d ( c.n.g$b p0 ) {
/* .locals 1 */
final String v0 = "setCurrentState"; // const-string v0, "setCurrentState"
/* .line 1 */
(( c.n.l ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/n/l;->a(Ljava/lang/String;)V
/* .line 2 */
(( c.n.l ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/n/l;->b(Lc/n/g$b;)V
return;
} // .end method
