public abstract class e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(", */
		 /* "Landroid/database/sqlite/SQLiteDatabase;", */
		 /* ")TT;" */
		 /* } */
	 } // .end annotation
} // .end method
public java.lang.String a ( java.lang.String p0, java.lang.Object p1 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = " AND "; // const-string v1, " AND "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* if-nez p2, :cond_0 */
	 final String p1 = " is null "; // const-string p1, " is null "
} // :cond_0
final String p1 = " = ?"; // const-string p1, " = ?"
} // :goto_0
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public java.lang.String a ( java.lang.String p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* new-array p1, v0, [Ljava/lang/String; */
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/String; */
/* aput-object p1, v1, v0 */
/* move-object p1, v1 */
} // :goto_0
} // .end method
public java.lang.String b ( java.lang.String p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* if-nez p2, :cond_0 */
final String p1 = " is null "; // const-string p1, " is null "
} // :cond_0
final String p1 = " = ?"; // const-string p1, " = ?"
} // :goto_0
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method