public abstract class i.h.c.p {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.ClassCastException a ( java.lang.ClassCastException p0 ) {
		 /* .locals 0 */
		 /* .line 5 */
		 i.h.c.p .a ( p0 );
		 /* check-cast p0, Ljava/lang/ClassCastException; */
		 /* throw p0 */
	 } // .end method
	 public static java.lang.Throwable a ( java.lang.Throwable p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Throwable;", */
		 /* ">(TT;)TT;" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* const-class v0, Li/h/c/p; */
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 i.h.c.k .a ( p0,v0 );
} // .end method
public static java.util.List a ( java.lang.Object p0 ) {
	 /* .locals 1 */
	 /* .line 6 */
	 /* instance-of v0, p0, Li/h/c/q/a; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 final String v0 = "kotlin.collections.MutableList"; // const-string v0, "kotlin.collections.MutableList"
		 /* .line 7 */
		 i.h.c.p .a ( p0,v0 );
		 int p0 = 0; // const/4 p0, 0x0
		 /* throw p0 */
		 /* .line 8 */
	 } // :cond_0
	 i.h.c.p .b ( p0 );
} // .end method
public static void a ( java.lang.Object p0, java.lang.String p1 ) {
	 /* .locals 1 */
	 /* if-nez p0, :cond_0 */
	 final String p0 = "null"; // const-string p0, "null"
	 /* .line 2 */
} // :cond_0
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) p0 ).getName ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;
/* .line 3 */
} // :goto_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = " cannot be cast to "; // const-string p0, " cannot be cast to "
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
i.h.c.p .a ( p0 );
int p0 = 0; // const/4 p0, 0x0
/* throw p0 */
} // .end method
public static void a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 4 */
/* new-instance v0, Ljava/lang/ClassCastException; */
/* invoke-direct {v0, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V */
i.h.c.p .a ( v0 );
int p0 = 0; // const/4 p0, 0x0
/* throw p0 */
} // .end method
public static java.util.List b ( java.lang.Object p0 ) {
/* .locals 0 */
/* .line 1 */
try { // :try_start_0
/* check-cast p0, Ljava/util/List; */
/* :try_end_0 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 2 */
i.h.c.p .a ( p0 );
int p0 = 0; // const/4 p0, 0x0
/* throw p0 */
} // .end method
