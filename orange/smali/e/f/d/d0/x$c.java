public abstract class e.f.d.d0.x$c implements java.util.Iterator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Le/f/d/d0/x; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x401 */
/* name = "c" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">", */
/* "Ljava/lang/Object;", */
/* "Ljava/util/Iterator<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* # instance fields */
public e.f.d.d0.z b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/d/d0/z<", */
/* "TV;>;" */
/* } */
} // .end annotation
} // .end field
public e.f.d.d0.z c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/d/d0/z<", */
/* "TV;>;" */
/* } */
} // .end annotation
} // .end field
public final e.f.d.d0.x d; //synthetic
/* # direct methods */
public e.f.d.d0.x$c ( ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
p1 = this.d;
e.f.d.d0.x .a ( p1 );
p1 = this.f;
this.b = p1;
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
this.c = p1;
return;
} // .end method
public e.f.d.d0.x$c ( ) { //synthethic
/* .locals 0 */
/* .line 4 */
/* invoke-direct {p0, p1}, Le/f/d/d0/x$c;-><init>(Le/f/d/d0/x;)V */
return;
} // .end method
/* # virtual methods */
public final e.f.d.d0.z a ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/d/d0/z<", */
/* "TV;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
/* .line 2 */
v1 = this.d;
e.f.d.d0.x .a ( v1 );
/* if-eq v0, v1, :cond_0 */
/* .line 3 */
v1 = this.f;
this.b = v1;
/* .line 4 */
this.c = v0;
/* .line 5 */
} // :cond_0
/* new-instance v0, Ljava/util/NoSuchElementException; */
/* invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V */
/* throw v0 */
} // .end method
public final Boolean hasNext ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
v1 = this.d;
e.f.d.d0.x .a ( v1 );
/* if-eq v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final void remove ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v1 = this.d;
v0 = this.b;
(( e.f.d.d0.x ) v1 ).remove ( v0 ); // invoke-virtual {v1, v0}, Le/f/d/d0/x;->remove(Ljava/lang/Object;)Ljava/lang/Object;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
this.c = v0;
return;
/* .line 4 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V */
/* throw v0 */
} // .end method
