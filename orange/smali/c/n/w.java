public class c.n.w {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lc/n/w$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public final c.n.w$a a;
public final c.n.x b;
/* # direct methods */
public c.n.w ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 this.a = p2;
	 /* .line 3 */
	 this.b = p1;
	 return;
} // .end method
/* # virtual methods */
public c.n.v a ( java.lang.Class p0 ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Lc/n/v;", */
	 /* ">(", */
	 /* "Ljava/lang/Class<", */
	 /* "TT;>;)TT;" */
	 /* } */
} // .end annotation
/* .line 1 */
(( java.lang.Class ) p1 ).getCanonicalName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"; // const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( c.n.w ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lc/n/w;->a(Ljava/lang/String;Ljava/lang/Class;)Lc/n/v;
	 /* .line 3 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "Local and anonymous classes can not be ViewModels"; // const-string v0, "Local and anonymous classes can not be ViewModels"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public c.n.v a ( java.lang.String p0, java.lang.Class p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Lc/n/v;", */
/* ">(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Class<", */
/* "TT;>;)TT;" */
/* } */
} // .end annotation
/* .line 4 */
v0 = this.b;
(( c.n.x ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/n/x;->a(Ljava/lang/String;)Lc/n/v;
/* .line 5 */
v1 = (( java.lang.Class ) p2 ).isInstance ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 6 */
} // :cond_0
v0 = this.a;
/* .line 7 */
/* .line 8 */
v0 = this.b;
(( c.n.x ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/n/x;->a(Ljava/lang/String;Lc/n/v;)V
} // .end method
