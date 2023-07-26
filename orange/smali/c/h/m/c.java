public abstract class c.h.m.c {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( java.lang.Object...p0 ) {
		 /* .locals 2 */
		 /* .line 4 */
		 /* const/16 v1, 0x13 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 5 */
		 p0 = 		 java.util.Objects .hash ( p0 );
		 /* .line 6 */
	 } // :cond_0
	 p0 = 	 java.util.Arrays .hashCode ( p0 );
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
	 /* .line 7 */
} // :cond_0
/* new-instance p0, Ljava/lang/NullPointerException; */
/* invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static Boolean a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = java.util.Objects .equals ( p0,p1 );
} // :cond_0
/* if-eq p0, p1, :cond_2 */
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 3 */
p0 = (( java.lang.Object ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( p0 != null) { // if-eqz p0, :cond_1
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // :cond_2
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // :goto_1
} // .end method
public static java.lang.String b ( java.lang.Object p0, java.lang.String p1 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 1 */
(( java.lang.Object ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // :cond_0
} // .end method
