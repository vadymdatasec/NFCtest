public abstract class androidx.lifecycle.LiveData {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/lifecycle/LiveData$a;, */
	 /* Landroidx/lifecycle/LiveData$b;, */
	 /* Landroidx/lifecycle/LiveData$LifecycleBoundObserver; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
/* # static fields */
public static final java.lang.Object j;
/* # instance fields */
public final java.lang.Object a;
public c.c.a.b.e b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/c/a/b/e<", */
/* "Lc/n/q<", */
/* "-TT;>;", */
/* "Landroidx/lifecycle/LiveData<", */
/* "TT;>.b;>;" */
/* } */
} // .end annotation
} // .end field
public Integer c;
public Boolean d;
public volatile java.lang.Object e;
public volatile java.lang.Object f;
public Integer g;
public Boolean h;
public Boolean i;
/* # direct methods */
public static androidx.lifecycle.LiveData ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public androidx.lifecycle.LiveData ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Lc/c/a/b/e; */
/* invoke-direct {v0}, Lc/c/a/b/e;-><init>()V */
this.b = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput v0, p0, Landroidx/lifecycle/LiveData;->c:I */
/* .line 5 */
v0 = androidx.lifecycle.LiveData.j;
this.f = v0;
/* .line 6 */
/* new-instance v0, Lc/n/n; */
/* invoke-direct {v0, p0}, Lc/n/n;-><init>(Landroidx/lifecycle/LiveData;)V */
/* .line 7 */
v0 = androidx.lifecycle.LiveData.j;
this.e = v0;
int v0 = -1; // const/4 v0, -0x1
/* .line 8 */
/* iput v0, p0, Landroidx/lifecycle/LiveData;->g:I */
return;
} // .end method
public static void a ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 29 */
c.c.a.a.c .b ( );
v0 = (( c.c.a.a.c ) v0 ).a ( ); // invoke-virtual {v0}, Lc/c/a/a/c;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 30 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Cannot invoke "; // const-string v2, "Cannot invoke "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = " on a background thread"; // const-string p0, " on a background thread"
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 0 */
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 4 */
/* .line 17 */
/* iget v0, p0, Landroidx/lifecycle/LiveData;->c:I */
/* add-int/2addr p1, v0 */
/* .line 18 */
/* iput p1, p0, Landroidx/lifecycle/LiveData;->c:I */
/* .line 19 */
/* iget-boolean p1, p0, Landroidx/lifecycle/LiveData;->d:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
return;
} // :cond_0
int p1 = 1; // const/4 p1, 0x1
/* .line 20 */
/* iput-boolean p1, p0, Landroidx/lifecycle/LiveData;->d:Z */
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
/* .line 21 */
try { // :try_start_0
/* iget v2, p0, Landroidx/lifecycle/LiveData;->c:I */
/* if-eq v0, v2, :cond_5 */
/* if-nez v0, :cond_1 */
/* .line 22 */
/* iget v2, p0, Landroidx/lifecycle/LiveData;->c:I */
/* if-lez v2, :cond_1 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
/* if-lez v0, :cond_2 */
/* .line 23 */
/* iget v0, p0, Landroidx/lifecycle/LiveData;->c:I */
/* if-nez v0, :cond_2 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .line 24 */
} // :goto_2
/* iget v3, p0, Landroidx/lifecycle/LiveData;->c:I */
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 25 */
(( androidx.lifecycle.LiveData ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->a()V
} // :cond_3
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 26 */
(( androidx.lifecycle.LiveData ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->b()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_4
} // :goto_3
/* move v0, v3 */
/* .line 27 */
} // :cond_5
/* iput-boolean v1, p0, Landroidx/lifecycle/LiveData;->d:Z */
return;
/* :catchall_0 */
/* move-exception p1 */
/* iput-boolean v1, p0, Landroidx/lifecycle/LiveData;->d:Z */
/* .line 28 */
/* throw p1 */
} // .end method
public final void a ( androidx.lifecycle.LiveData$b p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/lifecycle/LiveData<", */
/* "TT;>.b;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* iget-boolean v0, p1, Landroidx/lifecycle/LiveData$b;->b:Z */
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
v0 = (( androidx.lifecycle.LiveData$b ) p1 ).b ( ); // invoke-virtual {p1}, Landroidx/lifecycle/LiveData$b;->b()Z
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( androidx.lifecycle.LiveData$b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/lifecycle/LiveData$b;->a(Z)V
return;
/* .line 4 */
} // :cond_1
/* iget v0, p1, Landroidx/lifecycle/LiveData$b;->c:I */
/* iget v1, p0, Landroidx/lifecycle/LiveData;->g:I */
/* if-lt v0, v1, :cond_2 */
return;
/* .line 5 */
} // :cond_2
/* iput v1, p1, Landroidx/lifecycle/LiveData$b;->c:I */
/* .line 6 */
p1 = this.a;
v0 = this.e;
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/n/q<", */
/* "-TT;>;)V" */
/* } */
} // .end annotation
final String v0 = "observeForever"; // const-string v0, "observeForever"
/* .line 7 */
androidx.lifecycle.LiveData .a ( v0 );
/* .line 8 */
/* new-instance v0, Landroidx/lifecycle/LiveData$a; */
/* invoke-direct {v0, p0, p1}, Landroidx/lifecycle/LiveData$a;-><init>(Landroidx/lifecycle/LiveData;Lc/n/q;)V */
/* .line 9 */
v1 = this.b;
(( c.c.a.b.e ) v1 ).b ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lc/c/a/b/e;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Landroidx/lifecycle/LiveData$b; */
/* .line 10 */
/* instance-of v1, p1, Landroidx/lifecycle/LiveData$LifecycleBoundObserver; */
/* if-nez v1, :cond_1 */
if ( p1 != null) { // if-eqz p1, :cond_0
return;
} // :cond_0
int p1 = 1; // const/4 p1, 0x1
/* .line 11 */
(( androidx.lifecycle.LiveData$b ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Landroidx/lifecycle/LiveData$b;->a(Z)V
return;
/* .line 12 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "Cannot add the same observer with different lifecycles"; // const-string v0, "Cannot add the same observer with different lifecycles"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)V" */
/* } */
} // .end annotation
final String v0 = "setValue"; // const-string v0, "setValue"
/* .line 13 */
androidx.lifecycle.LiveData .a ( v0 );
/* .line 14 */
/* iget v0, p0, Landroidx/lifecycle/LiveData;->g:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Landroidx/lifecycle/LiveData;->g:I */
/* .line 15 */
this.e = p1;
int p1 = 0; // const/4 p1, 0x0
/* .line 16 */
(( androidx.lifecycle.LiveData ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/lifecycle/LiveData;->b(Landroidx/lifecycle/LiveData$b;)V
return;
} // .end method
public void b ( ) {
/* .locals 0 */
return;
} // .end method
public void b ( androidx.lifecycle.LiveData$b p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/lifecycle/LiveData<", */
/* "TT;>.b;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/lifecycle/LiveData;->h:Z */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iput-boolean v1, p0, Landroidx/lifecycle/LiveData;->i:Z */
return;
/* .line 3 */
} // :cond_0
/* iput-boolean v1, p0, Landroidx/lifecycle/LiveData;->h:Z */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p0, Landroidx/lifecycle/LiveData;->i:Z */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 5 */
(( androidx.lifecycle.LiveData ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/lifecycle/LiveData;->a(Landroidx/lifecycle/LiveData$b;)V
int p1 = 0; // const/4 p1, 0x0
/* .line 6 */
} // :cond_2
v1 = this.b;
/* .line 7 */
(( c.c.a.b.e ) v1 ).c ( ); // invoke-virtual {v1}, Lc/c/a/b/e;->c()Lc/c/a/b/e$a;
v2 = } // :cond_3
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 8 */
/* check-cast v2, Ljava/util/Map$Entry; */
/* check-cast v2, Landroidx/lifecycle/LiveData$b; */
(( androidx.lifecycle.LiveData ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Landroidx/lifecycle/LiveData;->a(Landroidx/lifecycle/LiveData$b;)V
/* .line 9 */
/* iget-boolean v2, p0, Landroidx/lifecycle/LiveData;->i:Z */
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 10 */
} // :cond_4
} // :goto_0
/* iget-boolean v1, p0, Landroidx/lifecycle/LiveData;->i:Z */
/* if-nez v1, :cond_1 */
/* .line 11 */
/* iput-boolean v0, p0, Landroidx/lifecycle/LiveData;->h:Z */
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/n/q<", */
/* "-TT;>;)V" */
/* } */
} // .end annotation
final String v0 = "removeObserver"; // const-string v0, "removeObserver"
/* .line 12 */
androidx.lifecycle.LiveData .a ( v0 );
/* .line 13 */
v0 = this.b;
(( c.c.a.b.e ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Lc/c/a/b/e;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Landroidx/lifecycle/LiveData$b; */
/* if-nez p1, :cond_0 */
return;
/* .line 14 */
} // :cond_0
(( androidx.lifecycle.LiveData$b ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/lifecycle/LiveData$b;->a()V
int v0 = 0; // const/4 v0, 0x0
/* .line 15 */
(( androidx.lifecycle.LiveData$b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/lifecycle/LiveData$b;->a(Z)V
return;
} // .end method
