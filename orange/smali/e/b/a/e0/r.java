public abstract class e.b.a.e0.r {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.Object a ( java.lang.Object p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(TT;)TT;" */
		 /* } */
	 } // .end annotation
	 final String v0 = "Argument must not be null"; // const-string v0, "Argument must not be null"
	 /* .line 2 */
	 e.b.a.e0.r .a ( p0,v0 );
} // .end method
public static java.lang.Object a ( java.lang.Object p0, java.lang.String p1 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">(TT;", */
	 /* "Ljava/lang/String;", */
	 /* ")TT;" */
	 /* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
	 /* .line 3 */
} // :cond_0
/* new-instance p0, Ljava/lang/NullPointerException; */
/* invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static java.lang.String a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 4 */
v0 = android.text.TextUtils .isEmpty ( p0 );
/* if-nez v0, :cond_0 */
/* .line 5 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "Must not be null or empty"; // const-string v0, "Must not be null or empty"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static java.util.Collection a ( java.util.Collection p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T::", */
/* "Ljava/util/Collection<", */
/* "TY;>;Y:", */
/* "Ljava/lang/Object;", */
/* ">(TT;)TT;" */
/* } */
} // .end annotation
v0 = /* .line 6 */
/* if-nez v0, :cond_0 */
/* .line 7 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "Must not be empty."; // const-string v0, "Must not be empty."
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( Boolean p0, java.lang.String p1 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 1 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
