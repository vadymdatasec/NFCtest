public class c.h.k.e implements java.util.Comparator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/Comparator<", */
	 /* "[B>;" */
	 /* } */
} // .end annotation
/* # direct methods */
public c.h.k.e ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public Integer a ( Object[] p0, Object[] p1 ) {
	 /* .locals 4 */
	 /* .line 1 */
	 /* array-length v0, p1 */
	 /* array-length v1, p2 */
	 /* if-eq v0, v1, :cond_0 */
	 /* .line 2 */
	 /* array-length p1, p1 */
	 /* array-length p2, p2 */
} // :goto_0
/* sub-int/2addr p1, p2 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :goto_1
/* array-length v2, p1 */
/* if-ge v1, v2, :cond_2 */
/* .line 4 */
/* aget-byte v2, p1, v1 */
/* aget-byte v3, p2, v1 */
/* if-eq v2, v3, :cond_1 */
/* .line 5 */
/* aget-byte p1, p1, v1 */
/* aget-byte p2, p2, v1 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
} // .end method
public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, [B */
/* check-cast p2, [B */
p1 = (( c.h.k.e ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/h/k/e;->a([B[B)I
} // .end method
