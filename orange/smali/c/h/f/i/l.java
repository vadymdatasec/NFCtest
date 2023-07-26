public abstract class c.h.f.i.l {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( Integer p0 ) {
		 /* .locals 1 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* if-gt p0, v0, :cond_0 */
		 /* const/16 p0, 0x8 */
	 } // :cond_0
	 /* mul-int/lit8 p0, p0, 0x2 */
} // :goto_0
} // .end method
public static a ( Integer[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* add-int/lit8 v0, p1, 0x1 */
/* .line 7 */
/* array-length v1, p0 */
/* if-le v0, v1, :cond_0 */
/* .line 8 */
v0 = c.h.f.i.l .a ( p1 );
/* new-array v0, v0, [I */
int v1 = 0; // const/4 v1, 0x0
/* .line 9 */
java.lang.System .arraycopy ( p0,v1,v0,v1,p1 );
/* move-object p0, v0 */
/* .line 10 */
} // :cond_0
/* aput p2, p0, p1 */
} // .end method
public static java.lang.Object a ( java.lang.Object[] p0, Integer p1, java.lang.Object p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">([TT;ITT;)[TT;" */
/* } */
} // .end annotation
/* add-int/lit8 v0, p1, 0x1 */
/* .line 1 */
/* array-length v1, p0 */
/* if-le v0, v1, :cond_0 */
/* .line 2 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getComponentType ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
/* .line 3 */
v1 = c.h.f.i.l .a ( p1 );
/* .line 4 */
java.lang.reflect.Array .newInstance ( v0,v1 );
/* check-cast v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
/* .line 5 */
java.lang.System .arraycopy ( p0,v1,v0,v1,p1 );
/* move-object p0, v0 */
/* .line 6 */
} // :cond_0
/* aput-object p2, p0, p1 */
} // .end method
