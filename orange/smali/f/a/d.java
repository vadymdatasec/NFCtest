public abstract class f.a.d {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.Object a ( java.lang.Object p0 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(TT;)TT;" */
		 /* } */
	 } // .end annotation
	 if ( p0 != null) { // if-eqz p0, :cond_0
	 } // :cond_0
	 int p0 = 0; // const/4 p0, 0x0
	 /* .line 1 */
	 /* throw p0 */
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
	 /* .line 2 */
} // :cond_0
/* new-instance p0, Ljava/lang/NullPointerException; */
/* invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( java.lang.Object p0, java.lang.Class p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(TT;", */
/* "Ljava/lang/Class<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 3 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Class ) p1 ).getCanonicalName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " must be set"; // const-string p1, " must be set"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
