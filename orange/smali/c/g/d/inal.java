public class inal {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final c.h.m.d a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/h/m/d<", */
/* "Ljava/util/ArrayList<", */
/* "TT;>;>;" */
/* } */
} // .end annotation
} // .end field
public final c.e.i b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/i<", */
/* "TT;", */
/* "Ljava/util/ArrayList<", */
/* "TT;>;>;" */
/* } */
} // .end annotation
} // .end field
public final java.util.ArrayList c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
public final java.util.HashSet d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashSet<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public inal ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Lc/h/m/e; */
/* const/16 v1, 0xa */
/* invoke-direct {v0, v1}, Lc/h/m/e;-><init>(I)V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Lc/e/i; */
/* invoke-direct {v0}, Lc/e/i;-><init>()V */
this.b = v0;
/* .line 4 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.c = v0;
/* .line 5 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.d = v0;
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 3 */
/* .line 9 */
v0 = this.b;
v0 = (( c.e.i ) v0 ).size ( ); // invoke-virtual {v0}, Lc/e/i;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 10 */
v2 = this.b;
(( c.e.i ) v2 ).e ( v1 ); // invoke-virtual {v2, v1}, Lc/e/i;->e(I)Ljava/lang/Object;
/* check-cast v2, Ljava/util/ArrayList; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 11 */
(( c.g.d.b ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lc/g/d/b;->a(Ljava/util/ArrayList;)V
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
/* .line 12 */
} // :cond_1
v0 = this.b;
(( c.e.i ) v0 ).clear ( ); // invoke-virtual {v0}, Lc/e/i;->clear()V
return;
} // .end method
public void a ( java.lang.Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
v0 = (( c.e.i ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->containsKey(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
(( c.e.i ) v0 ).put ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
return;
} // .end method
public void a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;TT;)V" */
/* } */
} // .end annotation
/* .line 3 */
v0 = this.b;
v0 = (( c.e.i ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->containsKey(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.b;
v0 = (( c.e.i ) v0 ).containsKey ( p2 ); // invoke-virtual {v0, p2}, Lc/e/i;->containsKey(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
v0 = this.b;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/ArrayList; */
/* if-nez v0, :cond_0 */
/* .line 5 */
(( c.g.d.b ) p0 ).b ( ); // invoke-virtual {p0}, Lc/g/d/b;->b()Ljava/util/ArrayList;
/* .line 6 */
v1 = this.b;
(( c.e.i ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 7 */
} // :cond_0
(( java.util.ArrayList ) v0 ).add ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
return;
/* .line 8 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "All nodes must be present in the graph before being added as an edge"; // const-string p2, "All nodes must be present in the graph before being added as an edge"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final void a ( java.lang.Object p0, java.util.ArrayList p1, java.util.HashSet p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;", */
/* "Ljava/util/ArrayList<", */
/* "TT;>;", */
/* "Ljava/util/HashSet<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
/* .line 13 */
v0 = (( java.util.ArrayList ) p2 ).contains ( p1 ); // invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 14 */
} // :cond_0
v0 = (( java.util.HashSet ) p3 ).contains ( p1 ); // invoke-virtual {p3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
/* if-nez v0, :cond_2 */
/* .line 15 */
(( java.util.HashSet ) p3 ).add ( p1 ); // invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* .line 16 */
v0 = this.b;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/ArrayList; */
if ( v0 != null) { // if-eqz v0, :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 17 */
v2 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
} // :goto_0
/* if-ge v1, v2, :cond_1 */
/* .line 18 */
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
(( c.g.d.b ) p0 ).a ( v3, p2, p3 ); // invoke-virtual {p0, v3, p2, p3}, Lc/g/d/b;->a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
/* add-int/lit8 v1, v1, 0x1 */
/* .line 19 */
} // :cond_1
(( java.util.HashSet ) p3 ).remove ( p1 ); // invoke-virtual {p3, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
/* .line 20 */
(( java.util.ArrayList ) p2 ).add ( p1 ); // invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
return;
/* .line 21 */
} // :cond_2
/* new-instance p1, Ljava/lang/RuntimeException; */
final String p2 = "This graph contains cyclic dependencies"; // const-string p2, "This graph contains cyclic dependencies"
/* invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final void a ( java.util.ArrayList p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/ArrayList<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
/* .line 22 */
(( java.util.ArrayList ) p1 ).clear ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V
/* .line 23 */
v0 = this.a;
return;
} // .end method
public final java.util.ArrayList b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.a;
/* check-cast v0, Ljava/util/ArrayList; */
/* if-nez v0, :cond_0 */
/* .line 3 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
} // :cond_0
} // .end method
public Boolean b ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)Z" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
p1 = (( c.e.i ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->containsKey(Ljava/lang/Object;)Z
} // .end method
public java.util.ArrayList c ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.c;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 3 */
v0 = this.d;
(( java.util.HashSet ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/HashSet;->clear()V
/* .line 4 */
v0 = this.b;
v0 = (( c.e.i ) v0 ).size ( ); // invoke-virtual {v0}, Lc/e/i;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 5 */
v2 = this.b;
(( c.e.i ) v2 ).c ( v1 ); // invoke-virtual {v2, v1}, Lc/e/i;->c(I)Ljava/lang/Object;
v3 = this.c;
v4 = this.d;
(( c.g.d.b ) p0 ).a ( v2, v3, v4 ); // invoke-virtual {p0, v2, v3, v4}, Lc/g/d/b;->a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
/* add-int/lit8 v1, v1, 0x1 */
/* .line 6 */
} // :cond_0
v0 = this.c;
} // .end method
public java.util.List c ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)", */
/* "Ljava/util/List;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Ljava/util/List; */
} // .end method
public java.util.List d ( java.lang.Object p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)", */
/* "Ljava/util/List<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
v0 = (( c.e.i ) v0 ).size ( ); // invoke-virtual {v0}, Lc/e/i;->size()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_2 */
/* .line 2 */
v3 = this.b;
(( c.e.i ) v3 ).e ( v2 ); // invoke-virtual {v3, v2}, Lc/e/i;->e(I)Ljava/lang/Object;
/* check-cast v3, Ljava/util/ArrayList; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 3 */
v3 = (( java.util.ArrayList ) v3 ).contains ( p1 ); // invoke-virtual {v3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* if-nez v1, :cond_0 */
/* .line 4 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 5 */
} // :cond_0
v3 = this.b;
(( c.e.i ) v3 ).c ( v2 ); // invoke-virtual {v3, v2}, Lc/e/i;->c(I)Ljava/lang/Object;
(( java.util.ArrayList ) v1 ).add ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
} // .end method
public Boolean e ( java.lang.Object p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)Z" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
v0 = (( c.e.i ) v0 ).size ( ); // invoke-virtual {v0}, Lc/e/i;->size()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* .line 2 */
v3 = this.b;
(( c.e.i ) v3 ).e ( v2 ); // invoke-virtual {v3, v2}, Lc/e/i;->e(I)Ljava/lang/Object;
/* check-cast v3, Ljava/util/ArrayList; */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 3 */
v3 = (( java.util.ArrayList ) v3 ).contains ( p1 ); // invoke-virtual {v3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // .end method
