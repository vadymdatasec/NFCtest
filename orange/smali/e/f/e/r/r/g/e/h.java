public abstract class e.f.e.r.r.g.e.h extends e.f.e.r.r.g.e.j {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.f.e.r.r.g.e.h ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Le/f/e/r/r/g/e/j;-><init>(Le/f/e/o/a;)V */
		 return;
	 } // .end method
	 public static void b ( java.lang.StringBuilder p0, Integer p1 ) {
		 /* .locals 5 */
		 int v0 = 0; // const/4 v0, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 0; // const/4 v2, 0x0
	 } // :goto_0
	 /* const/16 v3, 0xd */
	 /* if-ge v1, v3, :cond_1 */
	 /* add-int v3, v1, p1 */
	 /* .line 1 */
	 v3 = 	 (( java.lang.StringBuilder ) p0 ).charAt ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->charAt(I)C
	 /* add-int/lit8 v3, v3, -0x30 */
	 /* and-int/lit8 v4, v1, 0x1 */
	 /* if-nez v4, :cond_0 */
	 /* mul-int/lit8 v3, v3, 0x3 */
} // :cond_0
/* add-int/2addr v2, v3 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
/* const/16 p1, 0xa */
/* .line 2 */
/* rem-int/2addr v2, p1 */
/* rsub-int/lit8 v1, v2, 0xa */
/* if-ne v1, p1, :cond_2 */
} // :cond_2
/* move v0, v1 */
/* .line 3 */
} // :goto_1
(( java.lang.StringBuilder ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
return;
} // .end method
/* # virtual methods */
public final void a ( java.lang.StringBuilder p0, Integer p1 ) {
/* .locals 2 */
final String v0 = "(01)"; // const-string v0, "(01)"
/* .line 1 */
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2 */
v0 = (( java.lang.StringBuilder ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I
/* const/16 v1, 0x39 */
/* .line 3 */
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 4 */
(( e.f.e.r.r.g.e.h ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Le/f/e/r/r/g/e/h;->a(Ljava/lang/StringBuilder;II)V
return;
} // .end method
public final void a ( java.lang.StringBuilder p0, Integer p1, Integer p2 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
int v1 = 4; // const/4 v1, 0x4
/* if-ge v0, v1, :cond_2 */
/* .line 5 */
(( e.f.e.r.r.g.e.j ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/r/r/g/e/j;->a()Le/f/e/r/r/g/e/t;
/* mul-int/lit8 v2, v0, 0xa */
/* add-int/2addr v2, p2 */
/* const/16 v3, 0xa */
v1 = (( e.f.e.r.r.g.e.t ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Le/f/e/r/r/g/e/t;->a(II)I
/* .line 6 */
/* div-int/lit8 v2, v1, 0x64 */
/* const/16 v3, 0x30 */
/* if-nez v2, :cond_0 */
/* .line 7 */
(( java.lang.StringBuilder ) p1 ).append ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 8 */
} // :cond_0
/* div-int/lit8 v2, v1, 0xa */
/* if-nez v2, :cond_1 */
/* .line 9 */
(( java.lang.StringBuilder ) p1 ).append ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 10 */
} // :cond_1
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* add-int/lit8 v0, v0, 0x1 */
/* .line 11 */
} // :cond_2
e.f.e.r.r.g.e.h .b ( p1,p3 );
return;
} // .end method
