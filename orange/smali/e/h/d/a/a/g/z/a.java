public abstract class e.h.d.a.a.g.z.a {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.String a ( android.util.SparseArray p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/util/SparseArray<", */
		 /* "[B>;)", */
		 /* "Ljava/lang/String;" */
		 /* } */
	 } // .end annotation
	 /* if-nez p0, :cond_0 */
	 final String p0 = "null"; // const-string p0, "null"
	 /* .line 1 */
} // :cond_0
v0 = (( android.util.SparseArray ) p0 ).size ( ); // invoke-virtual {p0}, Landroid/util/SparseArray;->size()I
/* if-nez v0, :cond_1 */
final String p0 = "{}"; // const-string p0, "{}"
/* .line 2 */
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* const/16 v1, 0x7b */
/* .line 3 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
} // :goto_0
v2 = (( android.util.SparseArray ) p0 ).size ( ); // invoke-virtual {p0}, Landroid/util/SparseArray;->size()I
/* if-ge v1, v2, :cond_2 */
/* .line 5 */
v2 = (( android.util.SparseArray ) p0 ).keyAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/util/SparseArray;->keyAt(I)I
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "="; // const-string v2, "="
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.util.SparseArray ) p0 ).valueAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;
/* check-cast v2, [B */
java.util.Arrays .toString ( v2 );
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
/* const/16 p0, 0x7d */
/* .line 6 */
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 7 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String a ( java.util.Map p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/Map<", */
/* "TT;[B>;)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* if-nez p0, :cond_0 */
final String p0 = "null"; // const-string p0, "null"
/* .line 8 */
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
final String p0 = "{}"; // const-string p0, "{}"
/* .line 9 */
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* const/16 v1, 0x7b */
/* .line 10 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 11 */
/* .line 12 */
} // :cond_2
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 13 */
/* check-cast v2, Ljava/util/Map$Entry; */
/* .line 14 */
/* .line 15 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = "="; // const-string v3, "="
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* check-cast v2, [B */
java.util.Arrays .toString ( v2 );
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = /* .line 16 */
if ( v2 != null) { // if-eqz v2, :cond_2
final String v2 = ", "; // const-string v2, ", "
/* .line 17 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_3
/* const/16 p0, 0x7d */
/* .line 18 */
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 19 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
