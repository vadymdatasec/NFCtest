public class c.h.m.e implements c.h.m.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Lc/h/m/d<", */
	 /* "TT;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.Object a;
public Integer b;
/* # direct methods */
public c.h.m.e ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* if-lez p1, :cond_0 */
	 /* .line 2 */
	 /* new-array p1, p1, [Ljava/lang/Object; */
	 this.a = p1;
	 return;
	 /* .line 3 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "The max pool size must be > 0"; // const-string v0, "The max pool size must be > 0"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
/* # virtual methods */
public java.lang.Object a ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TT;" */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lc/h/m/e;->b:I */
int v1 = 0; // const/4 v1, 0x0
/* if-lez v0, :cond_0 */
/* add-int/lit8 v2, v0, -0x1 */
/* .line 2 */
v3 = this.a;
/* aget-object v4, v3, v2 */
/* .line 3 */
/* aput-object v1, v3, v2 */
/* add-int/lit8 v0, v0, -0x1 */
/* .line 4 */
/* iput v0, p0, Lc/h/m/e;->b:I */
} // :cond_0
} // .end method
public Boolean a ( java.lang.Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)Z" */
/* } */
} // .end annotation
/* .line 5 */
v0 = (( c.h.m.e ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/h/m/e;->b(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
/* .line 6 */
/* iget v0, p0, Lc/h/m/e;->b:I */
v1 = this.a;
/* array-length v2, v1 */
/* if-ge v0, v2, :cond_0 */
/* .line 7 */
/* aput-object p1, v1, v0 */
int p1 = 1; // const/4 p1, 0x1
/* add-int/2addr v0, p1 */
/* .line 8 */
/* iput v0, p0, Lc/h/m/e;->b:I */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 9 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "Already in the pool!"; // const-string v0, "Already in the pool!"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final Boolean b ( java.lang.Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)Z" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
} // :goto_0
/* iget v2, p0, Lc/h/m/e;->b:I */
/* if-ge v1, v2, :cond_1 */
/* .line 2 */
v2 = this.a;
/* aget-object v2, v2, v1 */
/* if-ne v2, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
