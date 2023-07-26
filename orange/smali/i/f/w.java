public abstract class i.f.w extends i.f.v {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static final java.util.Map a ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<K:", */
		 /* "Ljava/lang/Object;", */
		 /* "V:", */
		 /* "Ljava/lang/Object;", */
		 /* ">()", */
		 /* "Ljava/util/Map<", */
		 /* "TK;TV;>;" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = i.f.r.b;
	 if ( v0 != null) { // if-eqz v0, :cond_0
	 } // :cond_0
	 /* new-instance v0, Ljava/lang/NullPointerException; */
	 final String v1 = "null cannot be cast to non-null type kotlin.collections.Map<K, V>"; // const-string v1, "null cannot be cast to non-null type kotlin.collections.Map<K, V>"
	 /* invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
public static final java.util.Map a ( java.lang.Iterable p0 ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<K:", */
	 /* "Ljava/lang/Object;", */
	 /* "V:", */
	 /* "Ljava/lang/Object;", */
	 /* ">(", */
	 /* "Ljava/lang/Iterable<", */
	 /* "+", */
	 /* "Li/d<", */
	 /* "+TK;+TV;>;>;)", */
	 /* "Ljava/util/Map<", */
	 /* "TK;TV;>;" */
	 /* } */
} // .end annotation
final String v0 = "$this$toMap"; // const-string v0, "$this$toMap"
i.h.c.k .c ( p0,v0 );
/* .line 4 */
/* instance-of v0, p0, Ljava/util/Collection; */
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* .line 5 */
	 /* move-object v0, p0 */
	 v1 = 	 /* check-cast v0, Ljava/util/Collection; */
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 int v2 = 1; // const/4 v2, 0x1
		 /* if-eq v1, v2, :cond_0 */
		 /* .line 6 */
		 v0 = 		 /* new-instance v1, Ljava/util/LinkedHashMap; */
		 v0 = 		 i.f.v .a ( v0 );
		 /* invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V */
		 i.f.w .a ( p0,v1 );
		 /* .line 7 */
	 } // :cond_0
	 /* instance-of v0, p0, Ljava/util/List; */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* check-cast p0, Ljava/util/List; */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :cond_1
} // :goto_0
/* check-cast p0, Li/d; */
i.f.v .a ( p0 );
/* .line 8 */
} // :cond_2
i.f.w .a ( );
} // :goto_1
/* .line 9 */
} // :cond_3
/* new-instance v0, Ljava/util/LinkedHashMap; */
/* invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V */
i.f.w .a ( p0,v0 );
i.f.w .b ( v0 );
} // .end method
public static final java.util.Map a ( java.lang.Iterable p0, java.util.Map p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* "M::", */
/* "Ljava/util/Map<", */
/* "-TK;-TV;>;>(", */
/* "Ljava/lang/Iterable<", */
/* "+", */
/* "Li/d<", */
/* "+TK;+TV;>;>;TM;)TM;" */
/* } */
} // .end annotation
final String v0 = "$this$toMap"; // const-string v0, "$this$toMap"
i.h.c.k .c ( p0,v0 );
final String v0 = "destination"; // const-string v0, "destination"
i.h.c.k .c ( p1,v0 );
/* .line 10 */
i.f.w .a ( p1,p0 );
} // .end method
public static final void a ( java.util.Map p0, java.lang.Iterable p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/Map<", */
/* "-TK;-TV;>;", */
/* "Ljava/lang/Iterable<", */
/* "+", */
/* "Li/d<", */
/* "+TK;+TV;>;>;)V" */
/* } */
} // .end annotation
final String v0 = "$this$putAll"; // const-string v0, "$this$putAll"
i.h.c.k .c ( p0,v0 );
final String v0 = "pairs"; // const-string v0, "pairs"
i.h.c.k .c ( p1,v0 );
/* .line 2 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Li/d; */
(( i.d ) v0 ).a ( ); // invoke-virtual {v0}, Li/d;->a()Ljava/lang/Object;
(( i.d ) v0 ).b ( ); // invoke-virtual {v0}, Li/d;->b()Ljava/lang/Object;
/* .line 3 */
} // :cond_0
return;
} // .end method
public static final java.util.Map b ( java.util.Map p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/Map<", */
/* "TK;+TV;>;)", */
/* "Ljava/util/Map<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
final String v0 = "$this$optimizeReadOnlyMap"; // const-string v0, "$this$optimizeReadOnlyMap"
i.h.c.k .c ( p0,v0 );
v0 = /* .line 1 */
if ( v0 != null) { // if-eqz v0, :cond_1
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_0 */
/* .line 2 */
} // :cond_0
i.f.v .a ( p0 );
/* .line 3 */
} // :cond_1
i.f.w .a ( );
} // :goto_0
} // .end method
