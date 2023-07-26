public class inal extends e.f.a.b.d.a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Le/f/a/b/d/a;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.Object a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TT;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public inal ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Le/f/a/b/d/a;-><init>()V */
/* .line 2 */
this.a = p1;
return;
} // .end method
public static e.f.a.b.d.b a ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(TT;)", */
/* "Le/f/a/b/d/b;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Le/f/a/b/d/c; */
/* invoke-direct {v0, p0}, Le/f/a/b/d/c;-><init>(Ljava/lang/Object;)V */
} // .end method
public static java.lang.Object a ( Object p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/f/a/b/d/b;", */
/* ")TT;" */
/* } */
} // .end annotation
/* .line 2 */
/* instance-of v0, p0, Le/f/a/b/d/c; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
/* check-cast p0, Le/f/a/b/d/c; */
p0 = this.a;
/* .line 4 */
} // :cond_0
/* .line 5 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* .line 6 */
(( java.lang.Class ) v0 ).getDeclaredFields ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;
int v1 = 0; // const/4 v1, 0x0
/* .line 7 */
/* array-length v2, v0 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_2 */
/* aget-object v5, v0, v3 */
/* .line 8 */
v6 = (( java.lang.reflect.Field ) v5 ).isSynthetic ( ); // invoke-virtual {v5}, Ljava/lang/reflect/Field;->isSynthetic()Z
/* if-nez v6, :cond_1 */
/* add-int/lit8 v4, v4, 0x1 */
/* move-object v1, v5 */
} // :cond_1
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_2
int v2 = 1; // const/4 v2, 0x1
/* if-ne v4, v2, :cond_4 */
/* .line 9 */
v0 = (( java.lang.reflect.Field ) v1 ).isAccessible ( ); // invoke-virtual {v1}, Ljava/lang/reflect/Field;->isAccessible()Z
/* if-nez v0, :cond_3 */
/* .line 10 */
(( java.lang.reflect.Field ) v1 ).setAccessible ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* .line 11 */
try { // :try_start_0
(( java.lang.reflect.Field ) v1 ).get ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/NullPointerException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 12 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Could not access the field in remoteBinder."; // const-string v1, "Could not access the field in remoteBinder."
/* invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
/* :catch_1 */
/* move-exception p0 */
/* .line 13 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Binder object is null."; // const-string v1, "Binder object is null."
/* invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
/* .line 14 */
} // :cond_3
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "IObjectWrapper declared field not private!"; // const-string v0, "IObjectWrapper declared field not private!"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 15 */
} // :cond_4
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* array-length v0, v0 */
/* const/16 v1, 0x40 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "Unexpected number of IObjectWrapper declared fields: "; // const-string v1, "Unexpected number of IObjectWrapper declared fields: "
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
