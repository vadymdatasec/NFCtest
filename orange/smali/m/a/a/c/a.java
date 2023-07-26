public abstract class m.a.a.c.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.Object a;
	 /* # direct methods */
	 public static m.a.a.c.a ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 /* .line 1 */
		 return;
	 } // .end method
	 public static java.lang.Object a ( java.lang.Object[] p0 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">([TT;)[TT;" */
		 /* } */
	 } // .end annotation
	 /* if-nez p0, :cond_0 */
	 int p0 = 0; // const/4 p0, 0x0
	 /* .line 1 */
} // :cond_0
(( java.lang.Object ) p0 ).clone ( ); // invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;
/* check-cast p0, [Ljava/lang/Object; */
} // .end method
public static java.lang.Object a ( java.lang.Object[] p0, java.lang.Object...p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">([TT;[TT;)[TT;" */
/* } */
} // .end annotation
/* if-nez p0, :cond_0 */
/* .line 2 */
m.a.a.c.a .a ( p1 );
} // :cond_0
/* if-nez p1, :cond_1 */
/* .line 3 */
m.a.a.c.a .a ( p0 );
/* .line 4 */
} // :cond_1
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getComponentType ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
/* .line 5 */
/* array-length v1, p0 */
/* array-length v2, p1 */
/* add-int/2addr v1, v2 */
java.lang.reflect.Array .newInstance ( v0,v1 );
/* check-cast v1, [Ljava/lang/Object; */
/* .line 6 */
/* array-length v2, p0 */
int v3 = 0; // const/4 v3, 0x0
java.lang.System .arraycopy ( p0,v3,v1,v3,v2 );
/* .line 7 */
try { // :try_start_0
/* array-length p0, p0 */
/* array-length v2, p1 */
java.lang.System .arraycopy ( p1,v3,v1,p0,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/ArrayStoreException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 8 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) p1 ).getComponentType ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
/* .line 9 */
v1 = (( java.lang.Class ) v0 ).isAssignableFrom ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
/* if-nez v1, :cond_2 */
/* .line 10 */
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Cannot store "; // const-string v3, "Cannot store "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " in an array of "; // const-string p1, " in an array of "
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
/* .line 11 */
} // :cond_2
/* throw p0 */
} // .end method
