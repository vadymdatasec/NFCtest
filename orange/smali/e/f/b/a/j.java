public abstract class e.f.b.a.j {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Le/f/b/a/j$a; */
	 /* } */
} // .end annotation
/* # direct methods */
public static e.f.b.a.j$a a ( java.lang.Object p0 ) {
	 /* .locals 2 */
	 /* .line 2 */
	 /* new-instance v0, Le/f/b/a/j$a; */
	 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 (( java.lang.Class ) p0 ).getSimpleName ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {v0, p0, v1}, Le/f/b/a/j$a;-><init>(Ljava/lang/String;Le/f/b/a/g;)V */
} // .end method
public static java.lang.Object a ( java.lang.Object p0, java.lang.Object p1 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">(TT;TT;)TT;" */
	 /* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
	 /* .line 1 */
} // :cond_1
/* new-instance p0, Ljava/lang/NullPointerException; */
final String p1 = "Both parameters are null"; // const-string p1, "Both parameters are null"
/* invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
