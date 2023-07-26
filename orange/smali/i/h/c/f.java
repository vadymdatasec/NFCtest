public abstract class i.h.c.f {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.Object a;
	 /* # direct methods */
	 public static i.h.c.f ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 /* .line 1 */
		 return;
	 } // .end method
	 public static final java.lang.Object a ( java.util.Collection p0 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/Collection<", */
		 /* "*>;)[", */
		 /* "Ljava/lang/Object;" */
		 /* } */
	 } // .end annotation
	 final String v0 = "collection"; // const-string v0, "collection"
	 i.h.c.k .c ( p0,v0 );
	 v0 = 	 /* .line 1 */
	 /* if-nez v0, :cond_0 */
	 /* .line 2 */
} // :goto_0
p0 = i.h.c.f.a;
/* .line 3 */
} // :cond_0
v1 = /* .line 4 */
/* if-nez v1, :cond_1 */
/* .line 5 */
} // :cond_1
/* new-array v0, v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
/* add-int/lit8 v2, v1, 0x1 */
/* .line 6 */
/* aput-object v3, v0, v1 */
/* .line 7 */
/* array-length v1, v0 */
/* if-lt v2, v1, :cond_5 */
v1 = /* .line 8 */
/* if-nez v1, :cond_2 */
/* move-object p0, v0 */
} // :cond_2
/* mul-int/lit8 v1, v2, 0x3 */
/* add-int/lit8 v1, v1, 0x1 */
/* ushr-int/lit8 v1, v1, 0x1 */
/* const v3, 0x7ffffffd */
/* if-gt v1, v2, :cond_4 */
/* if-ge v2, v3, :cond_3 */
/* const v1, 0x7ffffffd */
/* .line 9 */
} // :cond_3
/* new-instance p0, Ljava/lang/OutOfMemoryError; */
/* invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V */
/* throw p0 */
/* .line 10 */
} // :cond_4
} // :goto_2
java.util.Arrays .copyOf ( v0,v1 );
final String v1 = "Arrays.copyOf(result, newSize)"; // const-string v1, "Arrays.copyOf(result, newSize)"
i.h.c.k .b ( v0,v1 );
/* .line 11 */
v1 = } // :cond_5
/* if-nez v1, :cond_6 */
/* .line 12 */
java.util.Arrays .copyOf ( v0,v2 );
final String v0 = "Arrays.copyOf(result, size)"; // const-string v0, "Arrays.copyOf(result, size)"
i.h.c.k .b ( p0,v0 );
} // :goto_3
} // :cond_6
} // :goto_4
/* move v1, v2 */
} // .end method
public static final java.lang.Object a ( java.util.Collection p0, java.lang.Object[] p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Collection<", */
/* "*>;[", */
/* "Ljava/lang/Object;", */
/* ")[", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
final String v0 = "collection"; // const-string v0, "collection"
i.h.c.k .c ( p0,v0 );
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_b
v1 = /* .line 13 */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_0 */
/* .line 14 */
/* array-length p0, p1 */
/* if-lez p0, :cond_8 */
/* aput-object v0, p1, v2 */
/* goto/16 :goto_2 */
/* .line 15 */
} // :cond_0
v3 = /* .line 16 */
/* if-nez v3, :cond_1 */
/* .line 17 */
/* array-length p0, p1 */
/* if-lez p0, :cond_8 */
/* aput-object v0, p1, v2 */
/* .line 18 */
} // :cond_1
/* array-length v3, p1 */
/* if-gt v1, v3, :cond_2 */
/* move-object v1, p1 */
} // :cond_2
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v3 ).getComponentType ( ); // invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
java.lang.reflect.Array .newInstance ( v3,v1 );
if ( v1 != null) { // if-eqz v1, :cond_a
/* check-cast v1, [Ljava/lang/Object; */
} // :goto_0
/* add-int/lit8 v3, v2, 0x1 */
/* .line 19 */
/* aput-object v4, v1, v2 */
/* .line 20 */
/* array-length v2, v1 */
/* if-lt v3, v2, :cond_6 */
v2 = /* .line 21 */
/* if-nez v2, :cond_3 */
/* move-object p1, v1 */
} // :cond_3
/* mul-int/lit8 v2, v3, 0x3 */
/* add-int/lit8 v2, v2, 0x1 */
/* ushr-int/lit8 v2, v2, 0x1 */
/* const v4, 0x7ffffffd */
/* if-gt v2, v3, :cond_5 */
/* if-ge v3, v4, :cond_4 */
/* const v2, 0x7ffffffd */
/* .line 22 */
} // :cond_4
/* new-instance p0, Ljava/lang/OutOfMemoryError; */
/* invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V */
/* throw p0 */
/* .line 23 */
} // :cond_5
} // :goto_1
java.util.Arrays .copyOf ( v1,v2 );
final String v2 = "Arrays.copyOf(result, newSize)"; // const-string v2, "Arrays.copyOf(result, newSize)"
i.h.c.k .b ( v1,v2 );
/* .line 24 */
v2 = } // :cond_6
/* if-nez v2, :cond_9 */
/* if-ne v1, p1, :cond_7 */
/* .line 25 */
/* aput-object v0, p1, v3 */
/* .line 26 */
} // :cond_7
java.util.Arrays .copyOf ( v1,v3 );
final String p0 = "Arrays.copyOf(result, size)"; // const-string p0, "Arrays.copyOf(result, size)"
i.h.c.k .b ( p1,p0 );
} // :cond_8
} // :goto_2
} // :cond_9
} // :goto_3
/* move v2, v3 */
/* .line 27 */
} // :cond_a
/* new-instance p0, Ljava/lang/NullPointerException; */
final String p1 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"; // const-string p1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
/* invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 28 */
} // :cond_b
/* throw v0 */
} // .end method
