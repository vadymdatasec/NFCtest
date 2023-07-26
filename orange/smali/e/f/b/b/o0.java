public abstract class e.f.b.b.o0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.Object a ( java.lang.Object p0, Integer p1 ) {
		 /* .locals 2 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 3 */
		 } // :cond_0
		 /* new-instance p0, Ljava/lang/NullPointerException; */
		 /* const/16 v0, 0x14 */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
		 final String v0 = "at index "; // const-string v0, "at index "
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
		 /* throw p0 */
	 } // .end method
	 public static java.lang.Object a ( java.lang.Object...p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* array-length v0, p0 */
		 e.f.b.b.o0 .a ( p0,v0 );
	 } // .end method
	 public static java.lang.Object a ( java.lang.Object[] p0, Integer p1 ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 /* if-ge v0, p1, :cond_0 */
	 /* .line 2 */
	 /* aget-object v1, p0, v0 */
	 e.f.b.b.o0 .a ( v1,v0 );
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
} // .end method
public static java.lang.Object b ( java.lang.Object[] p0, Integer p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">([TT;I)[TT;" */
/* } */
} // .end annotation
/* .line 1 */
e.f.b.b.p0 .a ( p0,p1 );
} // .end method
