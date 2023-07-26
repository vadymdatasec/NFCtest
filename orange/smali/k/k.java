public class k.k implements java.util.Comparator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/Comparator<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public k.k ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public Integer a ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 6 */
	 /* .line 1 */
	 v0 = 	 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
	 v1 = 	 (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
	 v0 = 	 java.lang.Math .min ( v0,v1 );
	 int v1 = 4; // const/4 v1, 0x4
} // :goto_0
int v2 = -1; // const/4 v2, -0x1
int v3 = 1; // const/4 v3, 0x1
/* if-ge v1, v0, :cond_2 */
/* .line 2 */
v4 = (( java.lang.String ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
/* .line 3 */
v5 = (( java.lang.String ) p2 ).charAt ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C
/* if-eq v4, v5, :cond_1 */
/* if-ge v4, v5, :cond_0 */
} // :cond_0
int v2 = 1; // const/4 v2, 0x1
} // :goto_1
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
/* .line 4 */
} // :cond_2
p1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* .line 5 */
p2 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* if-eq p1, p2, :cond_4 */
/* if-ge p1, p2, :cond_3 */
} // :cond_3
int v2 = 1; // const/4 v2, 0x1
} // :goto_2
} // :cond_4
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Ljava/lang/String; */
/* check-cast p2, Ljava/lang/String; */
p1 = (( k.k ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lk/k;->a(Ljava/lang/String;Ljava/lang/String;)I
} // .end method
