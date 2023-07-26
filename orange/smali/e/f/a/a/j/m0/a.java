public abstract class e.f.a.a.j.m0.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static android.util.SparseArray a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/util/SparseArray<", */
	 /* "Le/f/a/a/d;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static java.util.EnumMap b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/EnumMap<", */
/* "Le/f/a/a/d;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.f.a.a.j.m0.a ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Landroid/util/SparseArray; */
/* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/EnumMap; */
/* const-class v1, Le/f/a/a/d; */
/* invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V */
/* .line 3 */
v1 = e.f.a.a.d.b;
int v2 = 0; // const/4 v2, 0x0
java.lang.Integer .valueOf ( v2 );
(( java.util.EnumMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 4 */
v0 = e.f.a.a.j.m0.a.b;
v1 = e.f.a.a.d.c;
int v2 = 1; // const/4 v2, 0x1
java.lang.Integer .valueOf ( v2 );
(( java.util.EnumMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 5 */
v0 = e.f.a.a.j.m0.a.b;
v1 = e.f.a.a.d.d;
int v2 = 2; // const/4 v2, 0x2
java.lang.Integer .valueOf ( v2 );
(( java.util.EnumMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 6 */
v0 = e.f.a.a.j.m0.a.b;
(( java.util.EnumMap ) v0 ).keySet ( ); // invoke-virtual {v0}, Ljava/util/EnumMap;->keySet()Ljava/util/Set;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Le/f/a/a/d; */
/* .line 7 */
v2 = e.f.a.a.j.m0.a.a;
v3 = e.f.a.a.j.m0.a.b;
(( java.util.EnumMap ) v3 ).get ( v1 ); // invoke-virtual {v3, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/Integer; */
v3 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
(( android.util.SparseArray ) v2 ).append ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V
} // :cond_0
return;
} // .end method
public static Integer a ( Object p0 ) {
/* .locals 3 */
/* .line 3 */
v0 = e.f.a.a.j.m0.a.b;
(( java.util.EnumMap ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
p0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* .line 5 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "PriorityMapping is missing known Priority value "; // const-string v2, "PriorityMapping is missing known Priority value "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static e.f.a.a.d a ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = e.f.a.a.j.m0.a.a;
(( android.util.SparseArray ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v0, Le/f/a/a/d; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unknown Priority for value "; // const-string v2, "Unknown Priority for value "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
