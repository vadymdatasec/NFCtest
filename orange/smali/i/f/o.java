public abstract class i.f.o extends i.f.n {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static final java.lang.Object a ( java.lang.Iterable p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(", */
		 /* "Ljava/lang/Iterable<", */
		 /* "+TT;>;)TT;" */
		 /* } */
	 } // .end annotation
	 final String v0 = "$this$single"; // const-string v0, "$this$single"
	 i.h.c.k .c ( p0,v0 );
	 /* .line 1 */
	 /* instance-of v0, p0, Ljava/util/List; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* check-cast p0, Ljava/util/List; */
		 i.f.o .a ( p0 );
		 /* .line 2 */
	 } // :cond_0
	 v0 = 	 /* .line 3 */
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 4 */
		 p0 = 		 /* .line 5 */
		 /* if-nez p0, :cond_1 */
		 /* .line 6 */
	 } // :cond_1
	 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
	 final String v0 = "Collection has more than one element."; // const-string v0, "Collection has more than one element."
	 /* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
	 /* .line 7 */
} // :cond_2
/* new-instance p0, Ljava/util/NoSuchElementException; */
final String v0 = "Collection is empty."; // const-string v0, "Collection is empty."
/* invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static final java.lang.Object a ( java.util.List p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/List<", */
/* "+TT;>;)TT;" */
/* } */
} // .end annotation
final String v0 = "$this$single"; // const-string v0, "$this$single"
i.h.c.k .c ( p0,v0 );
v0 = /* .line 8 */
if ( v0 != null) { // if-eqz v0, :cond_1
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 9 */
/* .line 10 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "List has more than one element."; // const-string v0, "List has more than one element."
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 11 */
} // :cond_1
/* new-instance p0, Ljava/util/NoSuchElementException; */
final String v0 = "List is empty."; // const-string v0, "List is empty."
/* invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
