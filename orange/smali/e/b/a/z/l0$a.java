public class e.b.a.z.l0$a implements e.b.a.z.w {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Le/b/a/z/l0; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public final e.b.a.z.l0 a; //synthetic
/* # direct methods */
public e.b.a.z.l0$a ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.util.Set a ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Le/b/a/u;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
/* .line 2 */
(( e.b.a.z.l0 ) v0 ).z0 ( ); // invoke-virtual {v0}, Le/b/a/z/l0;->z0()Ljava/util/Set;
/* .line 3 */
v2 = /* new-instance v1, Ljava/util/HashSet; */
/* invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V */
/* .line 4 */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Le/b/a/z/l0; */
/* .line 5 */
(( e.b.a.z.l0 ) v2 ).C0 ( ); // invoke-virtual {v2}, Le/b/a/z/l0;->C0()Le/b/a/u;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 6 */
(( e.b.a.z.l0 ) v2 ).C0 ( ); // invoke-virtual {v2}, Le/b/a/z/l0;->C0()Le/b/a/u;
} // :cond_1
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "{fragment="; // const-string v1, "{fragment="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
