public abstract class e.f.b.b.p0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.Object a ( java.lang.Object[] p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">([TT;I)[TT;" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 (( java.lang.Class ) p0 ).getComponentType ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
	 /* .line 2 */
	 java.lang.reflect.Array .newInstance ( p0,p1 );
	 /* check-cast p0, [Ljava/lang/Object; */
} // .end method
public static java.lang.Object a ( java.lang.Object[] p0, Integer p1, Integer p2, java.lang.Object[] p3 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">([", */
	 /* "Ljava/lang/Object;", */
	 /* "II[TT;)[TT;" */
	 /* } */
} // .end annotation
/* .line 3 */
(( java.lang.Object ) p3 ).getClass ( ); // invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
java.util.Arrays .copyOfRange ( p0,p1,p2,p3 );
} // .end method
