public abstract class e.h.d.a.a.g.n {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.util.EnumMap a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/EnumMap<", */
	 /* "Le/h/d/a/a/g/m;", */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/Integer;", */
	 /* "Ljava/lang/String;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.h.d.a.a.g.n ( ) {
/* .locals 6 */
/* .line 1 */
/* new-instance v0, Ljava/util/EnumMap; */
/* const-class v1, Le/h/d/a/a/g/m; */
/* invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V */
/* .line 2 */
e.h.d.a.a.g.m .values ( );
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* aget-object v3, v0, v2 */
/* .line 3 */
v4 = e.h.d.a.a.g.n.a;
/* new-instance v5, Ljava/util/HashMap; */
/* invoke-direct {v5}, Ljava/util/HashMap;-><init>()V */
(( java.util.EnumMap ) v4 ).put ( v3, v5 ); // invoke-virtual {v4, v3, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 4 */
e.h.d.a.a.g.m .a ( v3 );
e.h.d.a.a.g.n .a ( v4,v3 );
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
return;
} // .end method
public static java.util.EnumMap a ( ) { //synthethic
/* .locals 1 */
/* .line 1 */
v0 = e.h.d.a.a.g.n.a;
} // .end method
public static void a ( java.lang.Class p0, Object p1 ) {
/* .locals 6 */
/* .line 2 */
(( java.lang.Class ) p0 ).getFields ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;
/* array-length v0, p0 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* aget-object v2, p0, v1 */
/* .line 3 */
try { // :try_start_0
(( java.lang.reflect.Field ) v2 ).getType ( ); // invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
v4 = java.lang.Integer.TYPE;
/* if-ne v3, v4, :cond_0 */
(( java.lang.reflect.Field ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Enum ) p1 ).name ( ); // invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "_"; // const-string v5, "_"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v3 = (( java.lang.String ) v3 ).startsWith ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 4 */
v3 = e.h.d.a.a.g.n.a;
(( java.util.EnumMap ) v3 ).get ( p1 ); // invoke-virtual {v3, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v3, Ljava/util/Map; */
int v4 = 0; // const/4 v4, 0x0
v4 = (( java.lang.reflect.Field ) v2 ).getInt ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
java.lang.Integer .valueOf ( v4 );
(( java.lang.reflect.Field ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
/* :catch_0 */
/* move-exception p0 */
/* .line 5 */
/* new-instance p1, Le/h/d/a/a/g/l; */
final String v0 = "Unexpected filed type!"; // const-string v0, "Unexpected filed type!"
/* invoke-direct {p1, v0, p0}, Le/h/d/a/a/g/l;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw p1 */
} // :cond_1
return;
} // .end method
